let baseUrl = "http://localhost:8080";

function ObtenerColaboradores() {
  fetch(baseUrl + '/Colaboradores/all')
    .then(res => res.json())
    .then(json => {
      ImprimirColaboradores(json);
    })
    .catch(error => console.error('Error al obtener colaboradores:', error));
}

function ImprimirColaboradores(colaboradores) {
  let contenedor = document.getElementById("cuerpoTabla");
  contenedor.innerHTML = "";

  colaboradores.forEach(colaborador => {
    contenedor.innerHTML += MapearColaborador(colaborador);
  });
}

function MapearColaborador(colaborador) {
  return `<tr>
    <td>${colaborador.id_Colaboradores}</td>
    <td>${colaborador.nombre}</td>
  </tr>`;
}

// Llama a la función para obtener y mostrar colaboradores al cargar la página
ObtenerColaboradores();

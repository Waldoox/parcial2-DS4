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
  let contenedor = document.querySelector(".parthner-name-box");
  contenedor.innerHTML = "";

  colaboradores.forEach(colaborador => {
    contenedor.innerHTML += MapearColaborador(colaborador);
  });
}

function MapearColaborador(colaborador) {
  return `
  <h3 class="parthner-name">${colaborador.nombre}</h3>`;
}

// Llama a la función para obtener y mostrar colaboradores al cargar la página
ObtenerColaboradores();

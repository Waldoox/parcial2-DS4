
-- Crear la base de datos

USE parcial3;

-- Tabla de Cursos
CREATE TABLE Cursos (
    ID_Curso INT PRIMARY KEY AUTO_INCREMENT,
    Titulo VARCHAR(55),
    Descripcion TEXT,
    ID_Contacto INT,
    FOREIGN KEY (ID_Contacto) REFERENCES Contactos(ID_Contacto)
);

-- Tabla de Proyectos
CREATE TABLE Proyectos (
    ID_Proyecto INT PRIMARY KEY AUTO_INCREMENT,
    Titulo VARCHAR(55),
    Descripcion TEXT,
    Proyectos_Terminados INT,
    ID_Contacto INT,
    FOREIGN KEY (ID_Contacto) REFERENCES Contactos(ID_Contacto)
);

-- Tabla de Tecnologias
CREATE TABLE Tecnologias (
    ID_Tecnologia INT PRIMARY KEY AUTO_INCREMENT,
    Nombre VARCHAR(55),
    Descripcion TEXT,
    Imagen VARCHAR(55)
);

-- Tabla de Colaboradores
CREATE TABLE Colaboradores (
    ID_Colaborador INT PRIMARY KEY AUTO_INCREMENT,
    Nombre VARCHAR(55)
);

-- Tabla de Contactos
CREATE TABLE Contactos (
    ID_Contacto INT PRIMARY KEY AUTO_INCREMENT,
    Nombre VARCHAR(55),
    CorreoElectronico VARCHAR(55),
    Mensaje TEXT
);

-- Tabla de CursoTecnologia
CREATE TABLE CursoTecnologia (
    ID_CursoTecnologia INT PRIMARY KEY AUTO_INCREMENT,
    ID_Curso INT,
    ID_Tecnologia INT,
    FOREIGN KEY (ID_Curso) REFERENCES Cursos(ID_Curso),
    FOREIGN KEY (ID_Tecnologia) REFERENCES Tecnologias(ID_Tecnologia)
);

-- Tabla de ProyectoTecnologia
CREATE TABLE ProyectoTecnologia (
    ID_ProyectoTecnologia INT PRIMARY KEY AUTO_INCREMENT,
    ID_Proyecto INT,
    ID_Tecnologia INT,
    FOREIGN KEY (ID_Proyecto) REFERENCES Proyectos(ID_Proyecto),
    FOREIGN KEY (ID_Tecnologia) REFERENCES Tecnologias(ID_Tecnologia)
);

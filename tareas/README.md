# Gestor de Tareas

Este proyecto es un programa en Java que permite a los usuarios organizar y administrar sus tareas. La aplicación cuenta con una interfaz gráfica, donde los usuarios pueden agregar, editar y eliminar tareas. Los datos de las tareas se almacenan de manera persistente en archivos `.txt`, lo que asegura su disponibilidad entre sesiones.

## Características

- **Interfaz gráfica amigable**: Permite al usuario interactuar con tablas y filtros para gestionar sus tareas.
- **Gestión de tareas**: 
  - Crear nuevas tareas.
  - Editar tareas existentes.
  - Eliminar tareas completadas o no deseadas.
- **Almacenamiento persistente**: Los datos de las tareas se guardan en archivos `.txt`, lo que permite conservarlos incluso si el programa se cierra.
- **Actualización dinámica**: Las acciones realizadas por el usuario se reflejan inmediatamente en la interfaz gráfica.
- **Visualización intuitiva**: Uso de botones e imágenes en la interfaz gráfica para facilitar la interacción.

## Estructura del Proyecto

- **`Tareas`**: Clase principal que sirve como punto de entrada del programa.
- **Archivos `.txt`**: Cada tarea se almacena en un archivo para mantener el historial de los cambios realizados.

## Requisitos

- **Java Development Kit (JDK)** versión 8 o superior.
- IDE como NetBeans o cualquier otro que soporte proyectos Java.
- Sistema operativo con soporte para archivos `.txt`.

## Cómo ejecutar el proyecto

1. Clona el repositorio en tu máquina local:
   ```bash
   git clone https://github.com/tu-usuario/nombre-del-repositorio.git

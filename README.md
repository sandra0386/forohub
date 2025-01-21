#  ForoHub API Rest

## Estado del Proyecto
Finalizado

## Descripción del Proyecto
ForoHub es una API Rest para gestionar tópicos (dudas o preguntas) mediante operaciones CRUD. Permite crear, leer, actualizar y eliminar tópicos, con datos almacenados en una base de datos MySQL.

**Nota**: Necesitarás herramientas como Postman o Insomnia para simular solicitudes y respuestas en formato JSON.

## Funcionalidades
1. **Registrar tópico**: Crear un tópico con título, mensaje, autor, curso, y más.
2. **Listar tópicos**: Consultar todos los tópicos registrados.
3. **Listar un tópico**: Consultar un tópico específico usando su ID.
4. **Actualizar tópico**: Modificar datos de un tópico usando su ID.
5. **Eliminar tópico**: Borrar un tópico usando su ID.
6. **Autenticación**: Login mediante JWT para proteger las operaciones CRUD.

## Tecnologías Utilizadas
- **Backend**: Java 17, Spring Boot 3, Hibernate, Flyway.
- **Base de Datos**: MySQL.
- **Seguridad**: Spring Security y JWT.

## Configuración Inicial
Modifica el archivo `application.properties` con tus credenciales:
- `DATASOURCE_URL`: Ejemplo: `jdbc:mysql://localhost:(puerto)/(nombreBaseDeDatos)`
- `DATASOURCE_USERNAME` y `DATASOURCE_PASSWORD`: Credenciales de MySQL.
- `JWT_SECRET`: Clave secreta para tokens JWT.

 
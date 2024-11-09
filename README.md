# API de Contribuyentes

Este proyecto ofrece una API REST y un servicio SOAP para la gestión de contribuyentes. Los servicios permiten obtener un listado de contribuyentes y consultar datos de contribuyentes específicos, utilizando una estructura en Java con Spring Boot.

## Estructura del Proyecto

- `Person` - Entidad que representa a un contribuyente, almacenada en la base de datos.
- `PersonControllerRest` - Controlador REST que expone endpoints HTTP para listar y buscar contribuyentes.
- `PersonServicesSoap` - Endpoint SOAP que ofrece operaciones para listar y buscar contribuyentes por RUC.
- `PersonServicesImplement` - Servicio de negocio que contiene la lógica de acceso a los datos.

## Tecnologías

- Java 17
- Spring Boot 3.3.5
- API REST con Spring MVC
- Servicio SOAP con Spring Web Services
- MySQL como base de datos

## Entidad `Person`

La entidad `Person` representa la información del contribuyente y contiene los siguientes campos:

- `personId` (Long): Identificador único de la persona.
- `name` (String): Nombre del contribuyente.
- `lastname` (String): Apellido del contribuyente.
- `ruc` (String): Número de RUC.
- `dv` (int): Dígito verificador del RUC.
- `rucFormer` (String): RUC anterior.
- `state` (Enum `State`): Estado del contribuyente (por ejemplo: ACTIVO, INACTIVO).

## API REST

La API REST permite acceder a los datos de los contribuyentes mediante los siguientes endpoints.

### Endpoints

- **Listar contribuyentes**  
  `GET /rest/contribuyentes-list`  
  Retorna una lista de contribuyentes paginada.

  **Parámetros**:
  - `page` (int, opcional): Número de página. Valor por defecto: 0.
  - `size` (int, opcional): Tamaño de la página. Valor por defecto: 60.

- **Buscar contribuyentes por nombre**  
  `GET /rest/contribuyentes-nombre`  
  Retorna una lista de contribuyentes cuyo nombre contiene el filtro especificado, paginada.

  **Parámetros**:
  - `filter` (String): Filtro de búsqueda por nombre.
  - `page` (int, opcional): Número de página. Valor por defecto: 0.
  - `size` (int, opcional): Tamaño de la página. Valor por defecto: 60.

- **Buscar contribuyente por RUC**  
  `GET /rest/contribuyente-ruc`  
  Retorna los datos de un contribuyente según el número de RUC especificado.

  **Parámetros**:
  - `filter` (String): RUC del contribuyente a buscar.

## Servicio SOAP

El servicio SOAP permite realizar consultas de contribuyentes, incluyendo obtener un listado paginado y consultar por RUC.

### Namespace

Todos los mensajes SOAP están dentro del namespace:
`http://www.appt.com/set/web_api/soap/contribuyente`

### Operaciones

- **Obtener contribuyente por RUC**  
  `getPersonRucRequest`  
  Retorna los datos del contribuyente con el RUC proporcionado.

  **Request**:
  - `ruc` (String): RUC del contribuyente.

  **Response**:
  - `PersonDto`: DTO del contribuyente con los detalles del RUC.

- **Listar contribuyentes**  
  `getPersonsListRequest`  
  Retorna una lista paginada de contribuyentes.

  **Request**:
  - `page` (int): Número de página.
  - `size` (int): Tamaño de la página.

  **Response**:
  - `GetPersonsListResponse`: Contiene la lista de contribuyentes y detalles de la paginación (total de páginas, elementos totales, página actual, tamaño de página).

## Configuración y Despliegue

1. Clona el repositorio y navega a la carpeta del proyecto.
2. Configura la conexión a la base de datos en `application.properties`.
3. Ejecuta el proyecto con:
   ```bash
   ./mvnw spring-boot:run

## Configuración y Despliegue 
**Uso**
- La API REST estará disponible en http://localhost:8080/rest/ y el servicio SOAP en http://localhost:8080/ws.
- Este servicio es independiente y puede utilizarse como un módulo de apoyo para sistemas de facturación, proporcionando consultas a datos de contribuyentes. Ideal para aplicaciones que requieren funcionalidades de búsqueda rápida y acceso a datos de identificación tributaria.

## Recomendación de Despliegue

### Elección entre SOAP y REST

Para simplificar la arquitectura y optimizar el rendimiento, recomendamos desplegar solo uno de los dos tipos de servicios (SOAP o REST), dependiendo de los requisitos del sistema que consuma esta API:

- **SOAP** es adecuado para sistemas empresariales o entornos que requieren una estructura estricta de mensajes y soporte transaccional.
- **REST** es más ligero y es preferido para aplicaciones web y móviles, donde se necesita comunicación rápida y menos estructurada.

### Cómo Desactivar un Tipo de Servicio

Para desactivar un tipo de servicio (REST o SOAP), puedes utilizar la configuración de Spring Boot en `application.properties` o eliminar la clase de controlador correspondiente.

#### Desactivar REST

1. En el archivo `application.properties`, agrega la siguiente línea para desactivar el escaneo de controladores REST:
   ```properties
   spring.main.web-application-type=NONE

   ## Licencia y Modificaciones

Este proyecto es de **uso libre**, lo que significa que puedes clonarlo, modificarlo y adaptarlo según tus necesidades. La estructura, los servicios y las configuraciones pueden personalizarse para ajustarse a los requisitos específicos de cualquier sistema que desees desarrollar.

Te animamos a contribuir con mejoras o a adaptar la API para integrarla en tus propios sistemas. Las modificaciones pueden incluir mejoras en el rendimiento, ampliación de servicios, adaptación a nuevas arquitecturas de seguridad, o ajustes para una mejor integración en tu infraestructura.

## Configuración de Seguridad con API Key

Para mejorar la seguridad de la API, se está trabajando en una **configuración de autenticación mediante API Key**. Esta implementación se encuentra en la rama `desarrollo-security`. Puedes acceder a esta rama para ver la configuración y pruebas actuales de seguridad, así como para contribuir o adaptar la configuración de seguridad a tu propio entorno.

### Instrucciones para trabajar en la rama de seguridad

1. Clona el repositorio y cambia a la rama `desarrollo-security`:
   ```bash
   git clone <url-del-repositorio>
   cd <nombre-del-directorio>
   git checkout desarrollo-security


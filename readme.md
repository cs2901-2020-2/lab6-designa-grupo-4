# Requerimientos

## Requerimientos Funcionales

- El usuario deberá de visualizar información recopilada por una estación meteorológica.
- Los datos serán recopilados por un sensor de humedad, temperatura y velocidad del viento. Para fines demostrativos, los datos serán generados automáticamente.
- Los cambios deberán de reflejarse automáticamente en el usuario cuando exista una actualización de información.
- El usuario deberá de obtener toda la información recopilada por la estación meteorológica en solo una consulta.

## Requerimientos No Funcionales

- El sistema deberá de manejar 50 solicitudes a la base de datos.    
- El sistema guardará unicamente el último dato recibido por los sensores, esto quiere decir que no guardará un historial. ????

# Diagrama de casos de uso
![][UML.png]

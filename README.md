Generar un proyecto de Spring Boot nuevo con un endpoint que reciba en formato JSON un array de números enteros en donde todos los números se repiten excepto uno, el endpoint debe regresar un JSON con un array del número que no se repite. P.e.

Input Nums: [1,2,2]
Output: [1]
Input Nums: [2,1,3,3,1,2,4]
Output: [4]
Validar con Postman o similar


To use it in Postman add the header;
- key -> **Content-Type**
- value -> **application/json**
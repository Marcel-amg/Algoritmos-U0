Objetivo: Realización de todos los ejercicios de la unidad 0.

Ejercicio 5:

Calculo de memoria:

Marcapasos:
short latidosPorMinuto
byte nivelBateria
Total: 15 byte

DispositivosMedicos:
int idDispositivo
String codigoFabricante
String nombre
Total: 12 byte

Desfibrilador:
byte nivelBateria
int cantidadDescargasAplicadas
Total: 17 byte 

Los siguientes tipos de atributos que utilizamos:
byte: 1 byte
short: 2 byte
int: 4 byte
String: 4 byte (asumí que tomaría este valor aproximadamente)

Utilice equals para comparar objetos. para poder fijarme si estamos comparando el mismo objeto o de distintas clases.
Si comparamos un Marcapasos y un Desfibrilador y cuentan con el mismo idDispositivo y codigoFabricante, no sería el mismo objeto, ya que cada uno es un dispositivo distinto, y 
pertenece a otra clase. Decidí utilizarlo porque al ver que son de distintas clases corresponde a distinto dispositivo.
No utilice "==" porque solamente hace referencia a la dirección de memoria, y necesito comparar dos objetos.

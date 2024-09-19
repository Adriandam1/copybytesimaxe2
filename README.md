APLICACION copybytesimaxe2:
A foto2.jpg ocupa 2,5MiB(2.609.246)en ambalas dous ocupan o mesmo

Sabendo que  a clase BufferedInputStream acepta como argumento do seu constructor a un obxecto da clase FileInputStream, e que a clase BuffferedOutputStream  acepta como argumento do seu constructor a un obxecto da clase FileInputStream, fai outro proxecto chamdo copybytesimaxe2  para  aumentar a velocidade de copia facendo uso de ditas clases.

IMPORTANTE:
Ten en conta que a clase BufferedInputStream  ten un metodo read() que permite ler un byte de cada vez e que do mesmo xeito que a clase FileInputStream permite detectar o fin do ficheiro mediante a consulta do valor devolto na lectura: si e -1 indica o fin do ficheiro .
Ten en conta tamen que a clase BufferedOutputStream ten un metodo write() que permite escribir un byte

una vez que executes o exercicio:
Notaches a diferenza en velocidade a hora de facer a copia da imaxen con respecto a cando NON usaches as clases BufferedInputStream e BufferedOutputStream ?
Se non a notas escolle unha imaxe de maior numero de bytes que a proporcionada (foto.jpg) ou executa varias veces o proxecto copybytesimaxe para facer crecer en bytes a imaxe foto2.jpg  e despois usa esta  como orixen de copia neste proxecto (copybytesimaxe2)
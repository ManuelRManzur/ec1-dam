import java.math.BigDecimal
import kotlin.math.PI
import kotlin.math.pow

fun main(){
    println("--------Pregunta 1--------")

    print("Ingresar nombre: ")
    val nombre = readLine()

    print("Ingresar habilidad: ")
    val habilidad = readLine()

    println("$nombre es $habilidad")

    println("--------Pregunta 2--------")

    print("Ingresar número entero: ")
    val numero1 = Integer.valueOf(readLine())

    val pot = numero1.toDouble().pow(2)

    println("Segunda potencia de $numero1: ")

    println("--------Pregunta 3--------")

    print("Ingresar radio de un circulo: ")
    val radio = Integer.valueOf(readLine())

    val circc = 2*PI*radio
    val areac = PI*radio.toDouble().pow(2)

    println("Circunferencia de $radio: $circc\nArea de $radio: $areac")

    println("--------Pregunta 4--------")

    val autonuevo = Auto("Toyota","2022","4Runner","4 Litros");
    println("Marca: ${autonuevo.marca}" +
            "\nAño: ${autonuevo.anio}" +
            "\nModelo: ${autonuevo.modelo}" +
            "\nCapacidad de llenado: ${autonuevo.capacidad}")

    println("--------Pregunta 5--------")

    print("Ingresar número entero: ")
    val numero2 = Integer.valueOf(readLine())

    parimpar(numero2)

    println("--------Pregunta 6--------")

    print("Ingresar primer decimal: ")
    val decimal1 = readLine()

    print("Ingresar segundo decimal: ")
    val decimal2 = readLine()

    mult2decimal(decimal1,decimal2)
}

fun parimpar(numero:Int){
    if (numero%2==0){
        println("El número $numero es par")
    }else{
        println("El número $numero es impar")
    }
}

fun mult2decimal(dc1:String?, dc2:String?){
    println("Multiplicación de $dc1 y $dc2: ${BigDecimal(dc1)*BigDecimal(dc2)}")
}
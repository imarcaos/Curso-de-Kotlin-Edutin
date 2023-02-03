//03/02/2023

fun main(args: Array<String>) {
    println("CALCULADORA")
    println("Escolha o número inteiro de 1 a 4 para operação da Calculadora:")
    print("1->SOMA - 2->SUBTRAÇÃO - 3->MULTIPLICAÇÃO - 4->DIVISÃO : ")
    var op: Int = readln().toInt()
    println("Digite os valores 1 e 2 para efetuar a operação:")
    print("Valor 1 : ")
    var num1: Double = readln().toDouble()
    print("Valor 2 : ")
    var num2: Double = readln().toDouble()
    var soma: Double = num1 + num2
    operation(op, num1, num2)
}

fun operation(op : Int, num1: Double, num2: Double) {
    var result: Double = 0.0
    when (op) {
        //soma
        1-> result = num1 + num2
        2-> result = num1 - num2
        3-> result = num1 * num2
        4-> result = num1 / num2
        else -> println("Operação inexistente, tente outra vez!!!")
    }
    println("Resultado: $result")
}
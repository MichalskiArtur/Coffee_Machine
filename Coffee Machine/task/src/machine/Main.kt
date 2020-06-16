package machine

import kotlin.system.exitProcess

class CoffeeMachine(var water: Int = 400, var milk: Int = 540, var beans: Int = 120, var cups: Int = 9 , var moeny: Int = 550 ) {


    fun printState() {
        println("The coffee machine has:")
        println("""$water of water
$milk of milk
$beans of coffee beans
$cups of disposable cups
$moeny of money
 """)
    }

    fun coffeeType(type: String) {
        when (type) {
            "1" -> { if ( water >= 250 && beans >= 16 && cups >= 1) {
                water = water - 250
                beans = beans - 16
                moeny = moeny + 4
                cups = cups - 1
            println("I have enough resources, making you a coffee!")} else {
                println("Sorry, not enough water!")
            }
            }
            "2" -> { if ( water >= 350 && milk >=75 && beans >= 20 && cups >= 1) {
                water = water - 350
                milk = milk - 75
                beans = beans - 20
                moeny = moeny + 7
                cups = cups - 1
                println("I have enough resources, making you a coffee!")} else {
                println("Sorry, not enough water!")
            }
            }
            "3" -> { if ( water >= 200 && milk >=105 && beans >= 12 && cups >= 1) {
                water = water - 200
                milk = milk - 100
                beans = beans - 12
                moeny = moeny + 6
                cups = cups - 1
                println("I have enough resources, making you a coffee!")} else {
                println("Sorry, not enough water!")
            }
            }
            "back" -> {}
            else -> {

            }
        }
    }


}


fun main() {
    val coffeeMachine = CoffeeMachine()
    var exit = false
    var action: String

    while ( !exit) {

        println("Write action (buy, fill, take, remaining, exit): ")
        action = readLine()!!


        when (action) {
            "buy" -> {
                println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ")
                val c = readLine()!!
                coffeeMachine.coffeeType(c)
            }
            "fill" -> {
                println("Write how many ml of water do you want to add:")
                coffeeMachine.water = coffeeMachine.water + readLine()!!.toInt()
                println("Write how many ml of milk do you want to add:")
                coffeeMachine.milk = coffeeMachine.milk + readLine()!!.toInt()
                println("Write how many grams of coffee beans do you want to add:")
                coffeeMachine.beans = coffeeMachine.beans + readLine()!!.toInt()
                println("Write how many disposable cups of coffee do you want to add:")
                coffeeMachine.cups = coffeeMachine.cups + readLine()!!.toInt()
            }
            "take" -> {
                println("I gave you ${coffeeMachine.moeny}")
                coffeeMachine.moeny = 0
            }
            "remaining" -> { coffeeMachine.printState()}
            "exit" -> { exit = true}

            else -> {

            }


        }

    }
}
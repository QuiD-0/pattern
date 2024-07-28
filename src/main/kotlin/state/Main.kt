package state

import state.coin.NoCoinState

fun main() {
    val slotMachine = SlotMachine(NoCoinState(), 1)
    slotMachine.insertCoin()
        .pullLever()
        .takeGift()
    println("=====================================")
    slotMachine.insertCoin()
        .returnCoin()
    println("=====================================")
    slotMachine.insertCoin()
        .pullLever()
        .insertCoin()
        .pullLever()
        .takeGift()
        .insertCoin()
        .pullLever()
//        .takeGift() //will throw an exception
    println("=====================================")

}
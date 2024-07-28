package state.coin

import state.SlotMachine

class HasCoinState : CoinState {
    override fun insertCoin(slotMachine: SlotMachine): SlotMachine {
        println("Coin already inserted")
        return slotMachine
    }

    override fun pullLever(slotMachine: SlotMachine): SlotMachine {
        println("Lever pulled")
        return slotMachine.copy(state = GiftState())
    }

    override fun takeGift(slotMachine: SlotMachine): SlotMachine {
        println("Pull lever first")
        return slotMachine
    }

    override fun returnCoin(slotMachine: SlotMachine): SlotMachine {
        println("Coin returned")
        return slotMachine.copy(state = NoCoinState())
    }
}
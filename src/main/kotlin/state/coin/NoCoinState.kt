package state.coin

import state.SlotMachine

class NoCoinState : CoinState {
    override fun insertCoin(slotMachine: SlotMachine): SlotMachine {
        println("Coin inserted")
        return slotMachine.copy(state = HasCoinState())
    }

    override fun pullLever(slotMachine: SlotMachine): SlotMachine {
        println("Insert coin first")
        return slotMachine
    }

    override fun takeGift(slotMachine: SlotMachine): SlotMachine {
        println("Insert coin first")
        return slotMachine
    }

    override fun returnCoin(slotMachine: SlotMachine): SlotMachine {
        println("Insert coin first")
        return slotMachine
    }
}
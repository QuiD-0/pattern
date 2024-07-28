package state.coin

import state.SlotMachine

class GiftState : CoinState {
    override fun insertCoin(slotMachine: SlotMachine): SlotMachine {
        println("Gift already taken")
        return slotMachine
    }

    override fun pullLever(slotMachine: SlotMachine): SlotMachine {
        println("Gift already taken")
        return slotMachine
    }

    override fun takeGift(slotMachine: SlotMachine): SlotMachine {
        println("Gift taken")
        return slotMachine.copy(state = NoCoinState(), remainCount = slotMachine.remainCount - 1)
    }

    override fun returnCoin(slotMachine: SlotMachine): SlotMachine {
        println("Gift already taken")
        return slotMachine
    }
}
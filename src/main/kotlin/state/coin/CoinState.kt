package state.coin

import state.SlotMachine

interface CoinState {
    fun insertCoin(slotMachine: SlotMachine): SlotMachine
    fun pullLever(slotMachine: SlotMachine): SlotMachine
    fun takeGift(slotMachine: SlotMachine): SlotMachine
    fun returnCoin(slotMachine: SlotMachine): SlotMachine
}


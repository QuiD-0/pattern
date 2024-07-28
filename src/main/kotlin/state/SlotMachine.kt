package state

import state.coin.CoinState

data class SlotMachine(
    val state: CoinState,
    val remainCount: Int
) {
    init {
        require(remainCount >= 0) { "No More Items" }
    }

    fun insertCoin() = state.insertCoin(this)

    fun pullLever() = state.pullLever(this)

    fun takeGift() = state.takeGift(this)

    fun returnCoin() = state.returnCoin(this)
}

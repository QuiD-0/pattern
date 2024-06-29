package observer.pull

import org.junit.jupiter.api.Test

class RateTest {
    @Test
    fun subscribe() {
        val rate = Rate()
        val rateDisplay = RateDisplay(rate)
        val jpyDisplay = JpyDisplay(rate)

        rate.subscribe(rateDisplay)
        rate.subscribe(jpyDisplay)

        rate.updateData(1.0f, 2.0f, 3.0f)
        rate.updateData(4.0f, 5.0f, 6.0f)

        rate.unSubscribe(rateDisplay)
        rate.updateData(7.0f, 8.0f, 9.0f)

        rate.unSubscribe(jpyDisplay)
        rate.updateData(10.0f, 11.0f, 12.0f)
    }
}
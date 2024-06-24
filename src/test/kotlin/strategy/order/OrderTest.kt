package strategy.order

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import strategy.order.discountPolicy.PercentDiscount

class OrderTest{

    @Test
    fun defaultDiscountPolicy(){
        val order = Order(100.0)
        assertEquals(100.0, order.totalPrice)
    }

    @Test
    fun percentDiscountPolicy(){
        val order = Order(100.0)
        order.updateDiscountPolicy(PercentDiscount(20))
        assertEquals(80.0, order.totalPrice)
    }

    @Test
    fun fixAmountDiscountPolicy(){
        val order = Order(100.0)
        order.updateDiscountPolicy(PercentDiscount(20))
        assertEquals(80.0, order.totalPrice)
    }

    @Test
    fun changeDiscountPolicy(){
        val order = Order(100.0)
        order.updateDiscountPolicy(PercentDiscount(20))
        assertEquals(80.0, order.totalPrice)
        order.updateDiscountPolicy(PercentDiscount(30))
        assertEquals(70.0, order.totalPrice)
    }

}
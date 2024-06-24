package strategy.order

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import strategy.order.discountPolicy.PercentDiscount

class DomesticOrderTest{

    @Test
    fun defaultDiscountPolicy(){
        val domesticOrder = DomesticOrder(100.0)
        assertEquals(100.0, domesticOrder.totalPrice)
    }

    @Test
    fun percentDiscountPolicy(){
        val domesticOrder = DomesticOrder(100.0)
        val updateDiscountPolicy = domesticOrder.updateDiscountPolicy(PercentDiscount(20))
        assertEquals(80.0, updateDiscountPolicy.totalPrice)
    }

    @Test
    fun fixAmountDiscountPolicy(){
        val domesticOrder = DomesticOrder(100.0)
        val updateDiscountPolicy = domesticOrder.updateDiscountPolicy(PercentDiscount(20))
        assertEquals(80.0, updateDiscountPolicy.totalPrice)
    }

    @Test
    fun changeDiscountPolicy(){
        val domesticOrder = DomesticOrder(100.0)
        val updateDiscountPolicy1 = domesticOrder.updateDiscountPolicy(PercentDiscount(20))
        assertEquals(80.0, updateDiscountPolicy1.totalPrice)
        val updateDiscountPolicy2 = domesticOrder.updateDiscountPolicy(PercentDiscount(30))
        assertEquals(70.0, updateDiscountPolicy2.totalPrice)
    }

}
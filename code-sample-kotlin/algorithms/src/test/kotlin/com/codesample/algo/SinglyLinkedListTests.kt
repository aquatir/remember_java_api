package com.codesample.algo

import org.junit.Test
import kotlin.test.assertEquals

class SinglyLinkedListTests {

    @Test
    fun addOneElement() {
        val list = SinglyLinkedList<Int>()
            .also { it.add(1) }

        assertEquals("SinglyLinkedList(size = 1, values=[1])", list.toString())
    }

    @Test
    fun addMultipleDifferentElements() {
        val list = SinglyLinkedList<Int>()
            .also { it.add(1).add(2).add(3) }

        assertEquals("SinglyLinkedList(size = 3, values=[1, 2, 3])", list.toString())
    }

    @Test
    fun addMultipleOfSameElement() {
        val list = SinglyLinkedList<Int>()
            .also { it.add(1).add(1).add(1) }

        assertEquals("SinglyLinkedList(size = 3, values=[1, 1, 1])", list.toString())
    }

    @Test
    fun addMultipleOfSameElementThenDeleteOne() {
        val list = SinglyLinkedList<Int>()
            .also { it.add(1).add(1).add(1).removeFirst(1) }

        assertEquals("SinglyLinkedList(size = 2, values=[1, 1])", list.toString())
    }

    @Test
    fun addMultipleOfSameElementThenDeleteAll() {
        val list = SinglyLinkedList<Int>()
            .also { it.add(1).add(1).add(1).removeFirst(1).removeFirst(1) }

        assertEquals("SinglyLinkedList(size = 1, values=[1])", list.toString())

        list.removeFirst(1)
        assertEquals("SinglyLinkedList(size = 0, values=[])", list.toString())
    }

    @Test
    fun removeWhenNotExist() {
        val list = SinglyLinkedList<Int>()
            .also { it.add(1).add(1).add(1).removeFirst(2).removeFirst(3) }

        assertEquals("SinglyLinkedList(size = 3, values=[1, 1, 1])", list.toString())
    }
}

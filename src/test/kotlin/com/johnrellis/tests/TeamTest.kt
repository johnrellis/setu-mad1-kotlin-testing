package com.johnrellis.tests

import com.johnrellis.tests.Person
import com.johnrellis.tests.Team
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class TeamTest {

    @Test
    fun getNumberOfMembers() {
        val team = Team()
        assert( team.addMember(Person("123456K", "Katherine")))
        assert( team.addMember(Person("123456L", "Bill")))
        assertEquals(2, team.numberOfMembers, "Incorrect number of team members")
    }

    @Test
    fun addMember() {

    }

    @Test
    fun removeMember() {
    }
}
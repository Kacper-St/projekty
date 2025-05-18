//package com.company;
//
//import org.junit.Before;
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
//public class HeroTestWarrior {
//
//    private Warrior warrior1;
//    private Warrior warrior2;
//
//    @Before
//    public void setUp() {
//        // Tworzymy dwóch wojowników przed każdym testem
//        warrior1 = new Warrior("Tomek", 100, 30);
//        warrior2 = new Warrior("Bartek", 80, 25);
//    }
//
//    @Test
//    public void testIsAlive() {
//        // Sprawdzenie, czy wojownicy są żywi na początku
//        assertTrue(warrior1.isAlive());
//        assertTrue(warrior2.isAlive());
//
//        // Zmniejszamy zdrowie wojownika 1 do 0 i sprawdzamy, czy jest martwy
//        warrior1.health = 0;
//        assertFalse(warrior1.isAlive());
//    }
//
//    @Test
//    public void testAttack() {
//        // Sprawdzanie, czy po ataku zdrowie przeciwnika się zmniejsza
//        int initialHealth = warrior2.health;
//
//        warrior1.attack(warrior2);  // Warrior1 atakuje Warrior2
//
//        // Po ataku zdrowie warrior2 powinno być mniejsze
//        assertTrue(warrior2.health < initialHealth);
//    }
//
//    @Test
//    public void testDuel() {
//        // Sprawdzenie działania pojedynku
//        Hero winner = warrior1.duel(warrior2);
//
//        // Jeden z wojowników powinien wygrać
//        assertTrue(winner.isAlive());
//        assertFalse(warrior1.isAlive() && warrior2.isAlive());  // Obaj nie mogą być żywi
//
//        // Sprawdzenie, który wojownik wygrał
//        if (winner == warrior1) {
//            assertTrue(warrior1.isAlive());
//            assertFalse(warrior2.isAlive());
//        } else {
//            assertTrue(warrior2.isAlive());
//            assertFalse(warrior1.isAlive());
//        }
//    }
//
//    @Test
//    public void testToString() {
//        // Sprawdzamy, czy metoda toString zwraca odpowiednią wartość
//        String expectedString = String.format("Warrior[name=%s, health=%d, strength=%d]", "Tomek", 100, 30);
//        assertEquals(expectedString, warrior1.toString());
//
//    }
//
//}

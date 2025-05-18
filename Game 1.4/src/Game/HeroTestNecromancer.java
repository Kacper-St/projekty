//package com.company;
//
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
//
//class HeroTestNecromancer {
//
//    @Test
//    void testNecromancerCreation() {
//        // Tworzymy Nekromantę
//        Necromancer necromancer = new Necromancer("Janusz", 120, 30, 100);
//
//        // Weryfikujemy początkowe wartości
//        assertEquals("Janusz", necromancer.getName());
//        assertEquals(120, necromancer.getHealth());
//        assertEquals(30, necromancer.getStrength());
//        assertTrue(necromancer.isAlive());
//    }
//
//    @Test
//    void testSkeletonIntegrationInAttack() {
//        // Tworzymy Nekromantę i przeciwnika magicznego
//        Necromancer necromancer = new Necromancer("Janusz", 120, 30, 100);
//        Wizard wizard = new Wizard("Gandalf", 80, 20, 70);
//
//        // Zdrowie przeciwnika przed atakiem
//        int initialHealth = wizard.getHealth();
//
//        // Necromancer atakuje magicznego bohatera (za pomocą szkielety)
//        necromancer.attack(wizard);
//
//        // Weryfikujemy, że zdrowie przeciwnika zmniejszyło się
//        assertTrue(wizard.getHealth() < initialHealth);
//
//        // Sprawdzamy, czy obrażenia są proporcjonalne do siły szkielety
//        int expectedDamage = (int) (necromancer.getStrength() * 2); // Siła szkielety = 2x siła Necromanty
//        assertEquals(initialHealth - expectedDamage, wizard.getHealth());
//    }
//
//    @Test
//    void testMagicAttackOnNonMagicHero() {
//        // Tworzymy Nekromantę i przeciwnika niemagicznego
//        Necromancer necromancer = new Necromancer("Janusz", 120, 30, 100);
//        Warrior warrior = new Warrior("Seba", 150, 40);
//
//        // Zdrowie przeciwnika przed atakiem
//        int initialHealth = warrior.getHealth();
//
//        // Necromancer atakuje niemagicznego bohatera (za pomocą magicAttack)
//        necromancer.attack(warrior);
//
//        // Weryfikujemy, że zdrowie przeciwnika zmniejszyło się
//        assertTrue(warrior.getHealth() < initialHealth);
//    }
//
//    @Test
//    void testToString() {
//        // Tworzymy Nekromantę
//        Necromancer necromancer = new Necromancer("Janusz", 120, 30, 100);
//
//        // Oczekiwany wynik
//        String expectedString = String.format(
//                "Necromancer[name=Janusz, health=120, strength=30, mana=100] and his Skeleton [health=48, strength=60]"
//        );
//
//        // Weryfikujemy wynik metody toString
//        assertEquals(expectedString, necromancer.toString());
//    }
//}
//

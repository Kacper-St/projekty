//package com.company;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class HeroTestWizard {
//
//    private Wizard wizard;
//    private Wizard opponentWizard;
//    private Warrior warrior;
//
//    @BeforeEach
//    void setUp() {
//        wizard = new Wizard("Gandalf", 80, 15, 90);
//        opponentWizard = new Wizard("Saruman", 70, 12, 85);
//        warrior = new Warrior("Aragorn", 120, 40);
//    }
//
//    @Test
//    public void testSomething() {
//        assertEquals(2, 1 + 1, "1 + 1 powinno być równe 2");
//    }
////
//    @Test
//    void testGenerateRandomWizard() {
//        Wizard randomWizard = Wizard.generateRandomWizard();
//
//        // Sprawdzamy, czy losowy Wizard ma poprawne wartości pól
//        assertNotNull(randomWizard.getName(), "Wizard name should not be null.");
//        assertTrue(randomWizard.getHealth() >= 50 && randomWizard.getHealth() <= 80, "Wizard health should be in the range 50-80.");
//        assertTrue(randomWizard.getStrength() >= 10 && randomWizard.getStrength() <= 20, "Wizard strength should be in the range 10-20.");
//        assertTrue(randomWizard.getMana() >= 60 && randomWizard.getMana() <= 100, "Wizard mana should be in the range 60-100.");
//    }
//
//    @Test
//    public void testToString() {
//        // Sprawdzamy, czy metoda toString zwraca odpowiednią wartość
//        String expectedString = String.format("Wizard[name=%s, health=%d, strength=%d, mana=%d]", "Gandalf", 80, 15, 90);
//        assertEquals(expectedString, wizard.toString());
//
//    }
//
//    @Test
//    void testDuelBetweenWizards() {
//        Hero winner = wizard.duel(opponentWizard);
//
//        // Sprawdzamy, czy jeden z Wizardów wygrał pojedynek
//        assertTrue(wizard.isAlive() ^ opponentWizard.isAlive(), "Only one wizard should be alive after the duel.");
//        assertEquals(winner, wizard.isAlive() ? wizard : opponentWizard, "The winner should be the wizard who is still alive.");
//    }
//
//    @Test
//    void testDuelBetweenWizardAndWarrior() {
//        Hero winner = wizard.duel(warrior);
//
//        // Sprawdzamy, czy jeden z uczestników pojedynku wygrał
//        assertTrue(wizard.isAlive() ^ warrior.isAlive(), "Only one hero should be alive after the duel.");
//        assertEquals(winner, wizard.isAlive() ? wizard : warrior, "The winner should be the hero who is still alive.");
//    }
//
//}

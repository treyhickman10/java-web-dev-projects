package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void reversedBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void singleForwardBracketReturnFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void bracketsWithLettersReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[hello]"));
    }

    @Test
    public void singleBackwardBracketReturnFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void multiplebracketsReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][][][]"));
    }

    @Test
    public void imbalancedBracketsReturnFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[][][]["));
    }

    @Test
    public void emptyStringReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void muliplebracketsReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][][][]"));
    }

    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
}
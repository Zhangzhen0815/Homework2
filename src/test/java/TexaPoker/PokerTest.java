/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package TexaPoker;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PokerTest {

    static String str = "Black: 2H 3D 5S 9C KD White: 2C 3H 4S 8C AH";

    @Test
    void testGetBlackNumAndProcess() {
        Poker poker = new Poker();
        int[] expect = {2, 3, 5, 9, 13};
        int[] actual = poker.getBlackNumAndProcess(poker, str);
        assertArrayEquals(expect, actual);
    }

    @Test
    void testGetWhiteNumAndProcess() {
        Poker poker = new Poker();
        int[] expect = {2, 3, 4, 8, 14};
        int[] actual = poker.getWhiteNumAndProcess(poker, str);
        assertArrayEquals(expect, actual);
    }

    @Test
    void testGetBlackColors() {
        Poker poker = new Poker();
        char[] expect = "HDSCD".toCharArray();
        char[] actual = poker.getBlackColors(poker, str);
        assertArrayEquals(expect, actual);
    }

    @Test
    void testGetWhiteColors() {
        Poker poker = new Poker();
        char[] expect = "CHSCH".toCharArray();
        char[] actual = poker.getWhiteColors(poker, str);
        assertArrayEquals(expect, actual);
    }
}
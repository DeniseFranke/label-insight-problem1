package com.denisefranke.solution1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * PangramTest
 * 
 * @author Denise Franke
 *
 */
public class PangramTest {
	private Pangram pangram;
	private final static String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

	@BeforeEach
	void init() {
		pangram = new Pangram();
	}

	@AfterEach
	void tearDown() {
		pangram = null;
	}

	/**
	 * Test 0: "A quick brown fox jumps over the lazy dog" Returns: "" Reason:
	 * This sentence contains every letter at least once
	 */
	@DisplayName("TestPangramTest0 - empty")
	@Test
	void testPangramTest0() {
		String sentence = "A quick brown fox jumps over the lazy dog";
		String expected = "";
		assertEquals(expected, pangram.getMissingLetters(sentence));

	}

	/**
	 * Test 1:  "A slow yellow fox crawls under the proactive dog" Returns: "bjkmqz"
	 * Reason: Not a Pangram
	 */
	@DisplayName("TestPangramTest1 - invalid")
	@Test
	void testPangramTest1() {
		String sentence = "A slow yellow fox crawls under the proactive dog";
		String expected = "bjkmqz";
		assertEquals(expected, pangram.getMissingLetters(sentence));
	}

	/**
	 * Test 2:  "Lions, and tigers, and bears, oh my!" Returns: "cfjkpquvwxz"
	 * Reason: Not a Pangram
	 **/
	@DisplayName("TestPangramTest2 - invalid")
	@Test
	void testPangramTest2() {
		String sentence = "Lions, and tigers, and bears, oh my!";
		String expected = "cfjkpquvwxz";
		assertEquals(expected, pangram.getMissingLetters(sentence));
	}

	/**
	 * Test 3:  "" Returns: "abcdefghijklmnopqrstuvwxyz" Reason: Invalid because
	 * sentence is empty;
	 **/
	@DisplayName("Test Pangram Test3 - valid")
	@Test
	void testPangramTest3() {
		String sentence = "";
		String expected = ALPHABET;
		assertEquals(expected, pangram.getMissingLetters(sentence));
	}

	/**
	 * Test 4: Test Crazy large string Returns ""
	 */
	@DisplayName("Test Pangram Test4 - invalid test the up to 50 characters assumptions ")
	@Test
	void testPangramTest4() {
		String sentence = "CSeBBZvYvDyayyBzdfdXvaBtxxwiXcD jQADzTCXzBxzwcyxbd";
		String expected = "ghklmnopru";
		assertEquals(expected, pangram.getMissingLetters(sentence));
	}

	/**
	 * Test 5: Special Characters in sentence should be ignored Returns ""
	 */
	@DisplayName("Test Pangram Test4 - invalid test the up to 50 characters assumptions ")
	@Test
	void testPangramTest5() {
		String sentence = "Lions, and tigers, and bears, oh my! -58 ";
		String expected = "cfjkpquvwxz";
		assertEquals(expected, pangram.getMissingLetters(sentence));
	}
}
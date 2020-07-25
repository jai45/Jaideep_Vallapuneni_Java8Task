package java8_task;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class TestStreams {
	@Test
	public void test() {
		assertEquals(4,AverageList.average(Arrays.asList(1,2,3,4,5,6)));
	}
	@Test
	public void test1() {
		assertEquals(Arrays.asList("abc","acd"),StartWitha.check(Arrays.asList("abc","acd","bca","ab")));
	}
	@Test
	public void test2() {
		assertEquals(Arrays.asList("madam","mom","racecar"),CheckPalindrome.listPalindrome(Arrays.asList("madam","phone","mom","racecar","win")));
	}

}

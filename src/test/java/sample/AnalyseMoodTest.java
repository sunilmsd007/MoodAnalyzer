package sample;

import org.junit.Assert;
import org.junit.Test;

public class AnalyseMoodTest {

	@Test
	public void givenMessageShouldReturnSad() {
		AnalyseMood analyse = new AnalyseMood();
		String actualResult = analyse.moodAnalyser("I am in Sad Mood");
		Assert.assertEquals("Sad", actualResult);
	}
}

package sample;

import org.junit.Assert;
import org.junit.Test;

public class AnalyseMoodTest {

	@Test
	public void givenMessageShouldReturnSad() {
		AnalyseMood analyse = new AnalyseMood("I am in Sad Mood");
		String actualResult = analyse.moodAnalyser();
		Assert.assertEquals("Sad", actualResult);
	}

}

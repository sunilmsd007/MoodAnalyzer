package sample;

import org.junit.Assert;
import org.junit.Test;

public class AnalyseMoodTest {

	@Test
	public void givenMessageShouldReturnSad() {
		AnalyseMood analyse = new AnalyseMood("I am in Sad Mood");
		try {
			String actualResult = analyse.moodAnalyser();
			Assert.assertEquals("Sad", actualResult);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void givenMessageShouldReturnHappy() {
		AnalyseMood analyse = new AnalyseMood("I am in Happy Mood");
		try {
			String actualResult = analyse.moodAnalyser();
			Assert.assertEquals("Happy", actualResult);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void givenMessageAnyShouldReturnHappy() {
		AnalyseMood analyse = new AnalyseMood("I am in any Mood");
		try {
			String actualResult = analyse.moodAnalyser();
			Assert.assertEquals("Happy", actualResult);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void messageShouldBeInvalidMood() {
		AnalyseMood testmood = new AnalyseMood(null);
		try {
			testmood.moodAnalyser();
		} catch (Exception e) {
			Assert.assertEquals("Invalid Mood", e.getMessage());
		}
	}

}

package sample;

public class AnalyseMood {
	// method to analyse mood by reading string
	public String moodAnalyser(String message) {
		if (message.contains("Happy")) {
			return "Happy";
		} else if (message.contains("Sad")) {
			return "Sad";
		} else {
			return null;
		}
	}

	public static void main(String[] args) {
		AnalyseMood analyse = new AnalyseMood();
		String moodHappy = analyse.moodAnalyser("I am Happy");
		System.out.println(moodHappy);
		String moodSad = analyse.moodAnalyser("I am Sad");
		System.out.println(moodSad);
	}
}

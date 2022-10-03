package sample;

public class AnalyseMood {
	String message;

	// Parameterized constructor
	AnalyseMood(String message) {
		this.message = message;
	}

	// method to analyse mood by reading string
	public String moodAnalyser() throws MoodAnalysisException {
		try {
			if (message.contains("Happy")) {
				return "Happy";
			} else if (message.contains("Sad")) {
				return "Sad";
			} else if (message.contains("any")) {
				return "Happy";
			} else {
				return null;
			}
		} catch (Exception e) {
			// when user provides null input, informing the user by returning Invalid mood
			throw new MoodAnalysisException("Invalid Mood");
		}
	}

	public static void main(String[] args) {
		AnalyseMood analyse = new AnalyseMood(null);
		try {
			String moodHappy = analyse.moodAnalyser();
			System.out.println(moodHappy);
		} catch (Exception p) {
			p.printStackTrace();
		}

	}
}

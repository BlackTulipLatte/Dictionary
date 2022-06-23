//Name: Tyler Zeng
//Date: December 6, 2021
//Assignment: Unit 3 Assignment Question 2
//Description: Word class

public class word implements Comparable<word> {

	// Variables
	private String word;
	private int freq;

	// Method name: word
	// Description: Constructor which creates word object
	// Parameters: n/a
	// Returns: n/a
	public word(String word, int freq) {
		this.word = word;
		this.freq = freq;
	}

	// Getter
	public String getWord() {
		return word;
	}

	public int getFreq() {
		return freq;
	}

	// Method name: equals
	// Description: Helps the hashCode method discern if the object is equal or not
	// Parameters: word object
	// Returns: boolean
	public boolean equals(word a) {
		return this.word.equals(a.word);
	}

	// Method name: compareTo
	// Description: Helps differentiate/sort between word objects
	// Parameters: word object
	// Returns: int
	public int compareTo(word a) {
		return a.freq - freq;
	}

}

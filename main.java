
public class main {
	static int strike;
	static int hit;
	static int score;
	static int out;
	public static void main(String args[]) {
	String inputString = ("FB, F), (C, S), (FB, F), (FB, F), (C, F), (C, S), (C, F), (FB, F), (C, F), (C, F), (C, F), (C, F), (C, S), (FB, S), (FB, S), (C, F), (C, F), (FB, S), (C, S), (C, S), (C, S), (FB, S), (C, F), (FB, S)");
		String [] temp = new String [24];
		//String delimiter = ", (";
		temp = inputString.split(", \\(");
		System.out.println(temp[0]);
		for (int i=0; i < 24; i++ ) {
	String input = (temp[i]);
	if (input.contains("C, S)")) {
		hit = hit + 1;
		strike = 0;
	} else if (input.contains("C, F)")) {
		strike = strike + 1;
	} else if (input.contains("FB, S)")) {
		strike = strike + 1;
	} else if (input.contains("FB, F)")) {
		score = (score +1) + hit;
		hit = 0;
		strike = 0;
	} 
	if (hit == 4) {
		score = score+1;
		hit = hit -1;
	}
	if (strike == 3) {
		out = out++;
	}
	if (out == 3) {
		System.out.println("done");
}
}
		System.out.println(score);
}
}


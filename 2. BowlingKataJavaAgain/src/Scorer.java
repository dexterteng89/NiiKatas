public class Scorer {
    private int[] scores = new int[21];
    private int currentRoll = 0;

    public void bowl(int roll) {
        scores[currentRoll++] = roll;
    }

    public int score() {
        int score = 0;
        int rollNumber = 0;

        for (int frame = 0; frame < 10; frame++) {
            if (isStrike(rollNumber)) {
                score += 10 + scores[rollNumber +1] + scores[rollNumber +2];
                rollNumber += 1;
            } else if (isSpare(rollNumber)){
                score += 10 + scores[rollNumber +2];
                rollNumber += 2;
            } else {
                score += scores[rollNumber] + scores[rollNumber +1];
                rollNumber += 2;
            }
        }

        return score;
    }

    private boolean isSpare(int currentRoll) {
        return scores[currentRoll] + scores[currentRoll+1] == 10;
    }

    private boolean isStrike(int currentRoll) {
        return scores[currentRoll] == 10;
    }
}

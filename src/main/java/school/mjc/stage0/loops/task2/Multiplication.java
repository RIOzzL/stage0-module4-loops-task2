package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int count = 0;
        while (count <= Math.abs(multiplyByAndToInclusive)) {
            if (multiplyByAndToInclusive == 0) {
                System.out.print("");
                break;
            } else {
                System.out.println(count * multiplyByAndToInclusive);
                count++;
            }
        }
    }
}

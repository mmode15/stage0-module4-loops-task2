package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int count = 0;
        while(count <= Math.abs(multiplyByAndToInclusive) && multiplyByAndToInclusive != 0){
            System.out.println(multiplyByAndToInclusive * count);
            count++;
        }
    }
}

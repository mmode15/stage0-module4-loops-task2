package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        System.out.println(1);
        int count = 1;
        int mult = 1;
        while(count <= printToInclusive && printToInclusive !=0){
            mult *= count;
            System.out.println(mult);
            count++;
        }
    }
}

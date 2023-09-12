package school.mjc.stage0.loops.task2;

public class PrimeNumbers {

    public static void printPrimeNumbers(int printToInclusive) {
        int count = 2;
        int insideCount = 1;
        int dividers  = 0;
        while(count <= printToInclusive){
            while(insideCount <= count){
                if(count %  insideCount == 0){
                    dividers++;
                }
                insideCount++;
            }
            if(dividers <= 2){
                System.out.println(count);
            }
            insideCount =1;
            dividers = 0;
            count++;
        }
    }
}

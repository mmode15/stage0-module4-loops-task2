package school.mjc.stage0.loops.task2;

public class PowerOfTwo {

    public  void printPower(int power) {
       int count = 1;
       int mult = 1;

       if(power < 0){
           System.out.println("too much power");
       }else{
           System.out.println(1);
       }
       while(count <= power && count > 0){
           mult *= 2;
           System.out.println(mult);
           count++;
       }
    }
}

package school.mjc.stage0.loops.task2;

public class NaturalNumbers {
    public void naturalNumbersPrinter(int lastPrinted) {
        int count = 1;
        while (count<=lastPrinted){
            System.out.println(count++);
        }
    }
}

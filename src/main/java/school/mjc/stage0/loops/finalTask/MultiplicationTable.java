package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint){
        for(int i = 1; i <= 10; i++){
            System.out.println(String.format("%s x %s = %s", i,numberTableToPrint,i*numberTableToPrint));
        }
    }
}

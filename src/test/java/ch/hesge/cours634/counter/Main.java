package ch.hesge.cours634.counter;

public class Main {

    public static void main(String[] args)  {
        Counter c = new Counter();
        UpperLimitedPositiveCounter ulpc = new UpperLimitedPositiveCounter(5000,0);
        try {
            ulpc.add(-1);
            c.add(-2);
        }catch (CounterException ce){
            System.out.println(ce.getMessage());
        }


        System.out.println(c);
        System.out.println(ulpc);

    }


}

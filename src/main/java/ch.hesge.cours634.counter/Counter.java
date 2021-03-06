package ch.hesge.cours634.counter;

public class Counter implements ICounter {
    private int value;

    public Counter() {
        this.value = 0;
    }

    public Counter( int value){
        this.value = value;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "value=" + value +
                '}';
    }

    @Override
    public void inc() throws CounterException {

        this.value = this.value + 1;

    }

    @Override
    public void add(int step) throws CounterException {
        this.value = this.value + step;
    }

    @Override
    public int getValue() {
        return this.value;
    }

}

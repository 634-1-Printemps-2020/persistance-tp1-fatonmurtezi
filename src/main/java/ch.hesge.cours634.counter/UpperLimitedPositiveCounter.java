package ch.hesge.cours634.counter;

public class UpperLimitedPositiveCounter extends Counter implements ICounter {

    private int valeurMax;
    private int valeur;

    public UpperLimitedPositiveCounter(int valeurMax, int valeur) {

        this.valeurMax = valeurMax;
        this.valeur = valeur;
    }

    @Override
    public void inc() throws CounterException {
        try {
            if (checkValeur(this.valeur)){
                super.inc();
            }else{
                throw new CounterException("Erreur de valeur");
            }
        }catch (CounterException ce){
            System.out.println(ce.getMessage());
        }

    }

    private boolean checkValeur(int valeurTest) {
        return valeurTest > 0 && valeurTest + 1 <= valeurMax;
    }

    @Override
    public void add(int step) throws CounterException {
        try {
            if (checkValeur(this.valeur)) {
                super.add(step);
            }else{
                throw new CounterException("Erreur de valeur");
            }
        }catch (CounterException ce){
            System.out.println(ce.getMessage());
        }

    }

    @Override
    public int getValue() {
        return this.valeur;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

package Labs.lab_1.task_8;

public class CustomDouble {
    //Перевизначити операції суми, різниці, порівняння, equals() і hashCode(). Реалізувати метод toDouble()

    private int tsila;
    private double drobova;

    public int getTsila() {
        return tsila;
    }

    public double getDrobova() {
        return drobova;
    }

    public void setTsila(final int tsila) {
        this.tsila = tsila;
    }

    public void setDrobova(final double drobova) {
        this.drobova = drobova;
    }

    public CustomDouble(){
    }

    public CustomDouble(final int tsila, final double drobova){
        this.tsila = tsila;
        this.drobova = drobova;
    }

    public CustomDouble(final double number){
        this.drobova = number;
    }

    public double toDouble() {
        final double result = this.tsila + this.drobova;
        return result ;
    }

    public CustomDouble add(final CustomDouble a) {
        final double sum = this.toDouble() + a.toDouble();
        return new CustomDouble(sum);
    }

    public CustomDouble sub(final CustomDouble a) {
        final double sub = this.toDouble() - a.toDouble();
        return new CustomDouble(sub);
    }

    public CustomDouble mult(final CustomDouble a) {
        final double mult = this.toDouble() * a.toDouble();
        return new CustomDouble(mult);
    }

    public CustomDouble divis(final CustomDouble a) {
        final double divis = this.toDouble() / a.toDouble();
        return new CustomDouble(divis);
    }

    public boolean moreThan(final CustomDouble a) {
        return this.toDouble() > a.toDouble();
    }

    public boolean moreThanAndEqual(final CustomDouble a) {
        return this.toDouble() >= a.toDouble();
    }

    public boolean lessThan(final CustomDouble a) {
        return this.toDouble() < a.toDouble();
    }

    public boolean lessThanAndEqual(final CustomDouble a) {
        return this.toDouble() <= a.toDouble();
    }

    public boolean notEqual(final CustomDouble a) {
        return !this.equals(a);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final CustomDouble custom = (CustomDouble) o;
        double result = this.toDouble();
        double res = custom.toDouble();
        return result == res;
    }

    @Override
    public int hashCode() {
        return (int) (31 * this.tsila +
                31 * this.drobova);
    }

    @Override
    public String toString() {
        return this.toDouble() + "";
    }

}


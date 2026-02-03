package practice_5.task_2;

public class Eectronics extends Item {
    private final static int DEFAULT_GUARANTEE = 2;
    private int guarantee;

    public Eectronics(String name, double price, int count) {
        super(name, price, count);
        this.guarantee = DEFAULT_GUARANTEE;
    }

    public int getGuarantee() {
        return guarantee;
    }

    @Override
    public void print(){
        super.print();
        System.out.println(", гарантия " + this.guarantee + " года");
    }
}

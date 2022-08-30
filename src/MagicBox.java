import java.util.Random;

public class MagicBox<T> {

    protected int max;
    protected T[] items = (T[]) new Object[max];
    Random random = new Random();

    public MagicBox(int max) {
        this.max = max;
        items = (T[]) new Object[this.max];
    }

    public boolean add(T item) {

        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        System.out.println("коробка полна");
        return false;
    }

    public T pick() throws Exception {

        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                throw new RuntimeException("коробка не полна и осталось ещё " + (items.length - i) + " ячеек заполнить");
            }
        }
        int randomInt = random.nextInt(max);
        return items[randomInt];
    }
}
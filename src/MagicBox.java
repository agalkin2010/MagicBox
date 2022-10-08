import java.util.Random;

public class MagicBox<T> {
    private int counts;
    private T[] items;

    private Random random = new Random();

    public MagicBox(int counts) {
        this.counts = counts;
        items = (T[]) new Object[counts];
    }

    public boolean add(T item) {
        int n = numberEmptyPlaces();
        if (n != 0) {
            items[items.length - n] = item;
            return true;
        } else {
            return false;
        }
    }

    public T pick() {
        int n = numberEmptyPlaces();
        if (n != 0) {
            throw new RuntimeException("коробка не полна и осталось ещё " + n + " ячеек заполнить");
        }

        int randomInt = random.nextInt(this.counts);
        return items[randomInt];
    }

    private int numberEmptyPlaces() {
        int k = 0;
        for (T i : items) {
            if (i == null) {
                k++;
            }
        }
        return k;
    }

}

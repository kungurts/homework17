import java.util.Random;

public class MagicBox<T> {
    private String boxName;
    private int boxSize;
    T[] items;

    public MagicBox(String boxName, int boxSize) {
        this.boxName = boxName;
        this.boxSize = boxSize;
        items = (T[]) new Object[boxSize];
    }

    public int getBoxSize() {
        return boxSize;
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        System.out.println("Ooops, Ваша коробка заполнена! Не могу добавить " + item);
        return false;
    }

    public T pick() {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                throw new RuntimeException("Ваша Magic box не заполнена доконца, " +
                        "свободных ячеек осталось: " + (items.length - i) + " шт.");
            }
        }
        Random random = new Random();
        int randomInt = random.nextInt(items.length);
        return items[randomInt];
    }
}

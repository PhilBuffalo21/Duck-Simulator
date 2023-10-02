package AFolder;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {
    MenuItem[] items;
    int index = 0;

    public DinerMenuIterator(MenuItem[] o) {
        this.items = o;
    }

    @Override
    public boolean hasNext() {
        if (index >= items.length) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem i = items[index];
        index += 1;
        return i;
    }

}

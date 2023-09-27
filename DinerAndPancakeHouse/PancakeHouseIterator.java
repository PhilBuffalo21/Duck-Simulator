package DinerAndPancakeHouse;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseIterator implements Iterator<MenuItem> {
    ArrayList<MenuItem> items;
    int position = 0;

    public PancakeHouseIterator(ArrayList<MenuItem> i) {
        this.items = i;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.size()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem i = items.get(position);
        position += 1;
        return i;
    }

}

package DinerAndPancakeHouse;

import java.util.Iterator;

public class Diner implements Menu {
    MenuItem[] Menu;

    @Override
    public Iterator<MenuItem> createIterator() {
        return new DinerMenuIterator(Menu);
    }

}

package DinerAndPancakeHouse;

import java.util.Iterator;

public class Diner implements Menu {
    String[] Menu;

    @Override
    public Iterator createIterator() {
        return new DinerMenuIterator(Menu);
    }

}

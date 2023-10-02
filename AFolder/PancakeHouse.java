package AFolder;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouse extends Menu {
    ArrayList<MenuItem> menuItems;

    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }

}

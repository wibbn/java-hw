package practice16;

import practice16.utils.CloseLinkedList;
import practice16.utils.Item;
import practice16.utils.Order;

import java.util.ArrayList;
import java.util.Arrays;

public class InternetOrder extends CloseLinkedList implements Order {

    @Override
    public boolean removeByName(String name) {
        return remove(name);
    }

    @Override
    public int removeAllByName(String name) {
        return removeAll(name);
    }

    @Override
    public int getCount() {
        return size;
    }

    @Override
    public int getOrderPrice() {
        int result = 0;

        prev();
        for (int i = 0; i < size; ++i)
            result += next().getCost();

        return result;
    }

    @Override
    public int countOf(String name) {
        int count = 0;

        for (int i = 0; i < size; ++i) {
            if (head.value.getName().equals(name)) {
                ++count;
            }
        }

        return count;
    }

    public String[] allNames() {
        Item[] items = toArray();
        var result = new ArrayList<String>(size);

        for (Item item : items)
            if (!result.contains(item.getName()))
                result.add(item.getName());

        return (String[]) result.toArray();
    }

    public Item[] toSortedArray() {
        Item[] items = toArray();
        Arrays.sort(items);
        return items;
    }
}

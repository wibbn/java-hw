package practice16;

import practice16.utils.Item;
import practice16.utils.Order;

import java.util.ArrayList;
import java.util.Arrays;

public class RestaurantOrder implements Order {

    private ArrayList<Item> items;

    public boolean add(Item item) {
        return items.add(item);
    }

    @Override
    public boolean removeByName(String name) {
        for (int i = items.size() - 1; i >= 0; --i)
            if (items.get(i).getName().equals(name)) {
                items.remove(i);
                return true;
            }

        return false;
    }

    @Override
    public int removeAllByName(String name) {
        int count = 0;
        for (var item : items)
            if (item.getName().equals(name))
                ++count;

        items.removeIf(item -> item.getName().equals(name));
        return count;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Item[] toArray() {
        return (Item[]) items.toArray();
    }

    @Override
    public int getOrderPrice() {
        int result = 0;

        for (var item : items)
            result += item.getCost();

        return result;
    }

    @Override
    public int countOf(String name) {
        int count = 0;

        for (var item : items)
            if (item.getName().equals(name))
                ++count;

        return count;
    }

    @Override
    public String[] allNames() {
        var names = new ArrayList<String>();

        for (var item : items)
            if (!names.contains(item.getName()))
                names.add(item.getName());

        return (String[]) names.toArray();
    }

    @Override
    public Item[] toSortedArray() {
        Item[] result = (Item[]) items.toArray();
        Arrays.sort(result);
        return result;
    }

    public boolean remove(Item item) {
        return items.remove(item);
    }
}

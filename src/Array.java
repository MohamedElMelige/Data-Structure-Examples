public class Array {
    private int length;
    private int[] items;
    public Array(int length) {
        items = new int[length];
    }
    public void insert(int item) {
        // If the array is full, resize it
        if (items.length == length) {
            // Create a new array (twice the size)
            int[] newItems = new int[length * 2];
            // Copy all the existing items
            for (int i = 0; i < length; i++)
                newItems[i] = items[i];
            // Set "items" to this new array
            items = newItems;
        }
        // Add the new item at the end
        items[length++] = item;
    }
    public void removeAt(int index) {
        // Validate the index
        if (index < 0 || index >= length)
            throw new IllegalArgumentException();
        // Shift the items to the left to fill the hole
        for (int i = index; i < length; i++)
            items[i] = items[i + 1];
        length--;
    }
    public int indexOf(int item) {
        // If we find it, return index
        // Otherwise, return -1
        for (int i = 0; i < length; i++)
            if (items[i] == item)
                return i;
        return -1;
    }
    public int max() {
        // If we find it, return index
        // Otherwise, return -1
        int max = 0;
        for (int i = 0; i < length; i++)
            if (items[i] > max)
                max = items[i];
        return max;
    }

}

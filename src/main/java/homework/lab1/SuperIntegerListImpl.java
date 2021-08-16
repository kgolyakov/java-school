package homework.lab1;

public class SuperIntegerListImpl implements SuperIntegerList{
    public class ListEntry {
        int key;
        ListEntry next;
    }

    ListEntry data = null;

    @Override
    public void add(int number) {
        if (data == null) {
            data = new ListEntry();
            data.key = number;
            data.next = null;
        } else {
            ListEntry tmp = data;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new ListEntry();
            tmp.next.key = number;
            tmp.next.next = null;
        }
    }

    @Override
    public void removeByIndex(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            data = data.next;
        } else {
            ListEntry tmp = data;
            for (int i = 0; i < index - 1; i++) {
                tmp = tmp.next;
                if (tmp == null || tmp.next == null) {
                    throw new IndexOutOfBoundsException();
                }
            }
            tmp.next = tmp.next.next;
        }
    }

    @Override
    public void removeByValue(int value) {
        while (data != null && data.key == value) {
            data = data.next;
        }
        ListEntry tmp = data;
        while (tmp != null) {
            while (tmp.next != null && tmp.next.key == value) {
                tmp.next = tmp.next.next;
            }
            tmp = tmp.next;
        }
    }

    @Override
    public int get(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException();
        }
        ListEntry tmp = data;
        for (int i = 0; i < index; i++) {
            if (tmp == null) {
                throw new IndexOutOfBoundsException();
            }
            tmp = tmp.next;
        }
        if (tmp == null) {
            throw new IndexOutOfBoundsException();
        }
        return tmp.key;
    }

    @Override
    public void printAll() {
        ListEntry tmp = data;
        while (tmp != null) {
            System.out.print("" + tmp.key + " ");
            tmp = tmp.next;
        }
        System.out.print("\n");
    }
}

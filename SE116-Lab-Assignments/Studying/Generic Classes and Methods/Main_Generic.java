
public class Main_Generic {
    public static void main(String[] args) {

        //          <T> --> Type parameter
        //          <String> --> Type argument (the thing you pass to parameter)

        Box<String> box = new Box<String>();
        box.setItem("this is a string");

        System.out.println(box.getItem());
    }
}


class Box<T> {
    T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return this.item;
    }
}
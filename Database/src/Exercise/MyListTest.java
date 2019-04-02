package Exercise;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<Integer>(30);
        for(int i = 0; i<50; i ++) {
            list.addLast(i+10);
            System.out.println("Element " + i + " is : " + list.get(i));
        }
        System.out.println(list.indexOf(30));
    }
}

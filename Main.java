package ArrayList;

public class Main {
    public static void main(String[] args) {
        MyList myList = new MyList(10);
        myList.add(0,1);
        myList.add(1,2);
        myList.add(2,3);
        myList.add(3,4);
        int a = (int) myList.get(3);
        System.out.println(myList.toString());
    }
}

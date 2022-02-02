import java.util.*;

class StackDemo
{
    public static void main(String args[])
    {
        Stack s1=new Stack();

        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);
        System.out.println("Stack elements"+s1);

        int poped_element=(int)s1.pop();

        System.out.println("Poped elements"+poped_element);

        System.out.println("After Pop Operation Stack elements"+s1);

        System.out.println("Top Element of Stack " +s1.peek());
        s1.push("Amity");
        System.out.println("Stack elements"+s1);
        System.out.println("Size"+s1.size());
        System.out.println("Capacity"+s1.capacity());
    }
}
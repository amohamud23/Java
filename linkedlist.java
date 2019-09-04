import org.w3c.dom.NodeList;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;


class Nodelink{
    Nodelink next = null;
    int data;

    public Nodelink(int d){
        data = d;
    }

}

public class linkedlist {

    public static void main(String[] args) {


        Nodelink l1 = new Nodelink(1);
        Nodelink l2 = new Nodelink(4);
        Nodelink l3 = new Nodelink(3);
        Nodelink l4 = new Nodelink(2);
        Nodelink l5 = new Nodelink(5);
        Nodelink l6 = new Nodelink(2);

        Nodelink k1 = new Nodelink(1);
        Nodelink k2 = new Nodelink(2);
        Nodelink k3 = new Nodelink(3);
        Nodelink k4 = new Nodelink(4);
        Nodelink k5 = new Nodelink(5);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;


        k1.next = k2;
        k2.next = k3;
        k3.next = k4;
        k4.next = k5;


       count(l1,3);





    }

    public static void count(Nodelink node, int k){


        // 1->4->3->2->5->2, x = 3
        //

        Nodelink after_head = new Nodelink(0);
        Nodelink after = after_head;

        Nodelink before_head = new Nodelink(0);
        Nodelink before = before_head;


        while(node != null){

            if (node.data >= 3)
            {
                after.next = node;
                after = after.next;
            }
            else
            {
                before.next = node;
                before = before.next;

            }

            node = node.next;



        }
        after.next = null;

        before.next = after_head.next;

        foo(before_head.next);

    }


    public static void soo(Nodelink l1, Nodelink l2){
        // h
        // 1 2 3 4 5
        // 1 2 3 4 5
        // p
        Nodelink head = null;

        if (l1.data < l2.data) {
            head = l1;
            l1 = l1.next;
        }
        else {
            head = l2;
            l2 = l2.next;
        }
        Nodelink p = head;
        while (l1 != null && l2 != null){
            if (l1.data < l2.data)
            {
                p.next = l1;
                l1 = l1.next;
            }
            else
            {
                p.next = l2;
                l2 = l2.next;
            }

            p = p.next;
        }

        if (l1 == null)
            p.next = l2;
        if (l2 == null)
            p.next = l1;

        foo(head);



    }

    public static Nodelink rotate(Nodelink node, int k){

        // 1 2 3 4 5
        //

        Nodelink head = node;
        Nodelink temp = null;
        Nodelink temp2 = null;

        for(int i = 0; i < k; i++){
            while(node != null){

                temp = node;
                temp2 = node.next;

                node.next = temp;


                node = node.next;

            }

            head = node;
        }


        return head;
    }

    public static Nodelink merge(Nodelink l1, Nodelink l2){

        Nodelink head = new Nodelink(1);
        Nodelink p1 = head;
        while(l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                p1.next = l1;
                l1 = l1.next;

            } else {
                p1.next = l2;
                l2 = l2.next;

            }
            p1 = p1.next;
        }

        if (l1 == null) {
            p1.next = l2;
        }

        if (l2 == null) {
            p1.next = l1;
        }

        //foo(head.next);
        return head.next;
    }



    public static void loop(Nodelink node){

        String a = "";
        String b = "";
        while(node != null)
        {
            a = a + node.data;
            b = node.data + b;
            node = node.next;
        }

        if (a.equals(b)) {
            System.out.println("Palindrome!");
        }
        else {
            System.out.println("Not Palidrome!");
        }
    }

    public static void foo(Nodelink node){
        Nodelink dummy = node;

        while ( dummy != null){
            System.out.println(dummy.data);

            dummy = dummy.next;
        }
    }

    public static void remove(Nodelink node, int key) {
        Nodelink head = node;

        if (node != null) {
            if (node.data == key) {
                node = null;
                head = node.next;

                remove(head, key);
            }

        }
    }

    public static void delete(Nodelink node){

        // 1 2 3 4 5 6
        //     D

        Nodelink temp = node.next;
        node = null;

        node = temp;

    }

    public static void output(Nodelink node){

        while(node != null)
        {
            System.out.println(node.data);
            node = node.next;
        }
    }


    public static boolean print(Nodelink node)
    {
        Nodelink p1 = node.next;
        Nodelink p2 = node.next.next;
        while (p1 != null || p2 != null){
            if (p1 == p2)
                return true;
            else {
                if ( p2.next == null)
                    return false;
                p1 = p1.next;
                p2 = p2.next.next;


                System.out.println(p1.data + " " + p2.data);
            }

        }
        return false;
    }

    public static Nodelink swapNodesInPairs(Nodelink head) {
        // p
        // 1->2->3->4
        Nodelink dummy = head;
        Nodelink p = head;

        Nodelink temp = null;

        while(head != null)
        {

            temp = p.next;
            p.next = p;
            p = temp;

            head = head.next.next;
            p = head;

        }

        return dummy;
    }
}
package rocks.zipcode;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;

public class TestLinkedList {

    @Test
    public void testLinkedList(){

        LinkedList<Person> linkedList = new LinkedList<>();

        Person bob = new Person("Bob", 2021);
        Address bobAdd = new Address("604 Dickeson", "Sothy", "29101");


        Person steve = new Person("Steve", 2021);
        Address steveAdd = new Address("1303 Pineapple St", "Sothy", "20131");

        Person roger = new Person("roger", 2021);
        Address rogerAdd = new Address("1303 Pineapple St", "Sothy", "20131", "MARS");

        linkedList.push(steve);
        linkedList.push(roger);
        linkedList.add(1, bob);

        //System.out.println(linkedList.);
        System.out.println(linkedList.peekFirst());

    }

    @Test
    public void testLinkedList2(){

        LinkedList<Person> linkedList = new LinkedList<>();

        Person bob = new Person("Bob", 2021);
        Address bobAdd = new Address("604 Dickeson", "Sothy", "29101");


        Person steve = new Person("Steve", 2021);
        Address steveAdd = new Address("1303 Pineapple St", "Sothy", "20131");

        Person roger = new Person("roger", 2021);
        Address rogerAdd = new Address("1303 Pineapple St", "Sothy", "20131", "MARS");

        linkedList.add(0, bob);
        linkedList.push(steve);     //Push to first
        linkedList.push(roger);     //Push to first
        linkedList.pop();           //Removes first one

        //System.out.println(linkedList.);
        System.out.println(linkedList.peekFirst());

    }

    @Test
    public void testLinkedList3(){

        LinkedList<Person> linkedList = new LinkedList<>();

        Person bob = new Person("Bob", 2021);
        Address bobAdd = new Address("604 Dickeson", "Sothy", "29101");


        Person steve = new Person("Steve", 2021);
        Address steveAdd = new Address("1303 Pineapple St", "Sothy", "20131");

        Person roger = new Person("roger", 2021);
        Address rogerAdd = new Address("1303 Pineapple St", "Sothy", "20131", "MARS");

        linkedList.push(steve);
        linkedList.push(roger);
        linkedList.add(1, bob);

        //System.out.println(linkedList.);
        System.out.println(linkedList.indexOf(steve));

    }

    @Test
    public void testLinkedList4(){

        LinkedList<Person> linkedList = new LinkedList<>();

        Person bob = new Person("Bob", 2021);
        Address bobAdd = new Address("604 Dickeson", "Sothy", "29101");


        Person steve = new Person("Steve", 2021);
        Address steveAdd = new Address("1303 Pineapple St", "Sothy", "20131");

        Person roger = new Person("roger", 2021);
        Address rogerAdd = new Address("1303 Pineapple St", "Sothy", "20131", "MARS");


        linkedList.push(steve);
        linkedList.push(roger);
        linkedList.add(1, bob);
        linkedList.push(roger);
        linkedList.push(steve);
        linkedList.push(bob);

        //System.out.println(linkedList.);
        System.out.println(linkedList.lastIndexOf(bob));

    }

    @Test
    public void testLinkedList5(){

        LinkedList<Person> linkedList = new LinkedList<>();

        Person bob = new Person("Bob", 2021);
        Address bobAdd = new Address("604 Dickeson", "Sothy", "29101");


        Person steve = new Person("Steve", 2021);
        Address steveAdd = new Address("1303 Pineapple St", "Sothy", "20131");

        Person roger = new Person("roger", 2021);
        Address rogerAdd = new Address("1303 Pineapple St", "Sothy", "20131", "MARS");


        linkedList.push(steve);
        linkedList.push(roger);
        linkedList.add(1, bob);
        linkedList.push(roger);
        linkedList.push(steve);
        linkedList.push(bob);
        linkedList.push(steve);

        //System.out.println(linkedList.);
        System.out.println(linkedList.lastIndexOf(bob));
        System.out.println(linkedList.poll());

    }

    @Test
    public void testLinkedList6(){

        LinkedList<Person> linkedList = new LinkedList<>();

        Person bob = new Person("Bob", 2021);
        Address bobAdd = new Address("604 Dickeson", "Sothy", "29101");


        Person steve = new Person("Steve", 2021);
        Address steveAdd = new Address("1303 Pineapple St", "Sothy", "20131");

        Person roger = new Person("roger", 2021);
        Address rogerAdd = new Address("1303 Pineapple St", "Sothy", "20131", "MARS");


        linkedList.push(steve);
        linkedList.push(roger);
        linkedList.add(1, bob);
        linkedList.push(roger);
        linkedList.push(steve);
        linkedList.push(bob);
        linkedList.push(steve);

        //System.out.println(linkedList.);
        System.out.println(linkedList.lastIndexOf(bob));
        System.out.println(linkedList.poll());

    }

}

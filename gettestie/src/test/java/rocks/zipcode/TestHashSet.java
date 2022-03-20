package rocks.zipcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Iterator;

class TestHashSet {

    //An unordered collection that rejects duplicates

    @Test
    public void add1(){

        HashSet<Person> hashset = new HashSet<>();

        Person bob = new Person("Bob", 2021);
        Address bobAdd = new Address("604 Dickeson", "Sothy", "29101");
        bob.addAddress(bobAdd);

        hashset.add(bob);

        int expected = 1;

        Assertions.assertEquals(false, hashset.add(bob));

    }

    @Test
    public void add2(){

        HashSet<Person> hashset = new HashSet<>();

        Person bob = new Person("Bob", 2021);
        Address bobAdd = new Address("604 Dickeson", "Sothy", "29101");
        bob.addAddress(bobAdd);

        Person steve = new Person("Steve", 2021);
        Address steveAdd = new Address("1303 Pineapple St", "Sothy", "20131");
        steve.addAddress(steveAdd);

        hashset.add(bob);
        hashset.add(steve);

        int expected = 2;

        Assertions.assertEquals(expected, hashset.size());

    }

    @Test
    public void clearTest(){

        HashSet<Person> hashset = new HashSet<>();

        Person bob = new Person("Bob", 2021);
        Address bobAdd = new Address("604 Dickeson", "Sothy", "29101");
        bob.addAddress(bobAdd);

        Person steve = new Person("Steve", 2021);
        Address steveAdd = new Address("1303 Pineapple St", "Sothy", "20131");
        steve.addAddress(steveAdd);

        hashset.add(bob);
        hashset.add(steve);

        hashset.clear();

        int expected = 0;

        Assertions.assertEquals(expected, hashset.size());

    }

    @Test
    public void add3(){

        HashSet<Person> hashset = new HashSet<>();

        Person bob = new Person("Bob", 2021);
        Address bobAdd = new Address("604 Dickeson", "Sothy", "29101");
        bob.addAddress(bobAdd);

        Person steve = new Person("Steve", 2021);
        Address steveAdd = new Address("1303 Pineapple St", "Sothy", "20131");
        steve.addAddress(steveAdd);

        hashset.add(bob);
        hashset.add(steve);

        hashset.clear();

        int expected = 0;

        Assertions.assertEquals(expected, hashset.size());

    }

    @Test
    public void arrayTest(){

        HashSet<Person> hashset = new HashSet<>();
        Person[] persArray = new Person[2];

        Person bob = new Person("Bob", 2021);
        Address bobAdd = new Address("604 Dickeson", "Sothy", "29101");
        bob.addAddress(bobAdd);

        Person steve = new Person("Steve", 2021);
        Address steveAdd = new Address("1303 Pineapple St", "Sothy", "20131");
        steve.addAddress(steveAdd);

        hashset.add(bob);
        hashset.add(steve);

        hashset.toArray(persArray);

        for(Person a: persArray){
            System.out.println(a.getName());
            System.out.println(a.getAddress());
        }
    }

    @Test
    public void iteratorTest(){

        HashSet<Person> hashset = new HashSet<>();
        Person[] persArray = new Person[2];

        Person bob = new Person("Bob", 2021);
        Address bobAdd = new Address("604 Dickeson", "Sothy", "29101");
        bob.addAddress(bobAdd);

        Person steve = new Person("Steve", 2021);
        Address steveAdd = new Address("1303 Pineapple St", "Sothy", "20131");
        steve.addAddress(steveAdd);

        hashset.add(bob);
        hashset.add(steve);

        Iterator value = hashset.iterator();

        while(value.hasNext()){
            System.out.println(value.next());
        }
    }

    @Test
    public void iteratorTest2(){

        HashSet<Address> hashset = new HashSet<>();
        Person[] persArray = new Person[2];

        Person bob = new Person("Bob", 2021);
        Address bobAdd = new Address("604 Dickeson", "Sothy", "29101", "USA");
        bob.addAddress(bobAdd);

        Person steve = new Person("Steve", 2021);
        Address steveAdd = new Address("1303 Pineapple St", "Sothy", "20131", "MARS");
        steve.addAddress(steveAdd);

        hashset.add(bobAdd);
        hashset.add(steveAdd);

        Iterator value = hashset.iterator();

        while(value.hasNext()){
            System.out.println(value.next());
        }
    }

}

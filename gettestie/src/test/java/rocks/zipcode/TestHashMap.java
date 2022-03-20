package rocks.zipcode;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;

public class TestHashMap {

    @Test
    public void hashmapAdd(){
        HashMap <Person, Address> bookMap = new HashMap<>();

        Person bob = new Person("Bob", 2021);
        Address bobAdd = new Address("604 Dickeson", "Sothy", "29101");


        Person steve = new Person("Steve", 2021);
        Address steveAdd = new Address("1303 Pineapple St", "Sothy", "20131");

        bookMap.put(bob, bobAdd);

        bookMap.size();

        Assert.assertEquals(1,bookMap.size());

    }

    @Test
    public void hashmapAdd2(){
        HashMap <Person, Address> bookMap = new HashMap<>();

        Person bob = new Person("Bob", 2021);
        Address bobAdd = new Address("604 Dickeson", "Sothy", "29101");


        Person steve = new Person("Steve", 2021);
        Address steveAdd = new Address("1303 Pineapple St", "Sothy", "20131");

        bookMap.put(bob, bobAdd);
        bookMap.put(steve,steveAdd);

        bookMap.size();

        Assert.assertEquals(2,bookMap.size());

    }

    @Test
    public void hashMapClear(){
        HashMap <Person, Address> bookMap = new HashMap<>();

        Person bob = new Person("Bob", 2021);
        Address bobAdd = new Address("604 Dickeson", "Sothy", "29101");


        Person steve = new Person("Steve", 2021);
        Address steveAdd = new Address("1303 Pineapple St", "Sothy", "20131");

        bookMap.put(bob, bobAdd);

        bookMap.size();
        bookMap.clear();

        Assert.assertEquals(0,bookMap.size());

    }

    @Test
    public void containsTest(){ //Iterator iterates TO STRING stuff
        HashMap <Person, Address> bookMap = new HashMap<>();

        Person bob = new Person("Bob", 2021);
        Address bobAdd = new Address("604 Dickeson", "Sothy", "29101");


        Person steve = new Person("Steve", 2021);
        Address steveAdd = new Address("1303 Pineapple St", "Sothy", "20131");

        bookMap.put(bob, bobAdd);
        bookMap.containsKey(bob);

        Assert.assertEquals(true,bookMap.containsKey(bob));

    }





}

package rocks.zipcode;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

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

    @Test
    public void containsTest2(){ //Iterator iterates TO STRING stuff
        HashMap <Person, Address> bookMap = new HashMap<>();

        Person bob = new Person("Bob", 2021);
        Address bobAdd = new Address("604 Dickeson", "Sothy", "29101");


        Person steve = new Person("Steve", 2021);
        Address steveAdd = new Address("1303 Pineapple St", "Sothy", "20131");

        Person roger = new Person("roger", 2021);
        Address rogerAdd = new Address("1303 Pineapple St", "Sothy", "20131", "MARS");
        roger.addAddress(rogerAdd);

        bookMap.put(bob, bobAdd);
        bookMap.put(steve, steveAdd);

        Assert.assertEquals(true,bookMap.containsKey(bob));
        //Assert.assertEquals(true,bookMap.containsKey(roger));     //False test
        Assert.assertEquals(true,bookMap.containsKey(steve));

    }

    @Test
    public void valueTest(){ //Iterator iterates TO STRING stuff
        HashMap <Person, Address> bookMap = new HashMap<>();
        Collection <Address> addressList;

        Person bob = new Person("Bob", 2021);
        Address bobAdd = new Address("604 Dickeson", "Sothy", "29101");


        Person steve = new Person("Steve", 2021);
        Address steveAdd = new Address("1303 Pineapple St", "Sothy", "20131");

        Person roger = new Person("roger", 2021);
        Address rogerAdd = new Address("102 Cherry St", "Nothy", "20131", "MARS");
        roger.addAddress(rogerAdd);

        bookMap.put(bob, bobAdd);
        bookMap.put(steve, steveAdd);
        bookMap.put(roger, rogerAdd);
        addressList = bookMap.values();
        System.out.println(addressList.size());

        bookMap.put(bob,steveAdd);

        Assert.assertEquals(true,bookMap.containsKey(bob));
        //Assert.assertEquals(true,bookMap.containsKey(roger));     //False test
        System.out.println(bookMap.get(bob));
        Assert.assertEquals(true,bookMap.containsKey(steve));

    }

    //Question: How do I add multiple values toa  list? Create a collection duhh

    @Test
    public void arrayStuff(){

        HashMap<Person, List<Address>> addressBook = new HashMap<>();
        List<Address> listAddress = new ArrayList<>();

        Person bob = new Person("Bob", 2021);
        Address bobAdd = new Address("604 Dickeson", "Sothy", "29101");


        Person steve = new Person("Steve", 2021);
        Address steveAdd = new Address("1303 Pineapple St", "Sothy", "20131");

        Person roger = new Person("roger", 2021);
        Address rogerAdd = new Address("102 Cherry St", "Nothy", "20131", "MARS");

        listAddress.add(bobAdd);
        listAddress.add(steveAdd);
        listAddress.add(rogerAdd);

        addressBook.put(bob, listAddress);

        System.out.println(addressBook.get(bob));

    }






}

package com.amit2766.practice.collection;

import java.util.*;

public class Basic {
    public static void main(String[] args) {

//        dealWithArrayList();
//        basicLinkedList();
//        basicHashSet();
        //treeSet();
//        priorityQueue();

//        basicsOfHashMap();
            basicOfTreeMap();
    }

    private static void dealWithArrayList() {
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        list1.add("E");

        List<String> list2 = new ArrayList<String>();
        list2.add("1");
        list2.add("2");
        list2.add("3");

        //insert element to first position
        list2.add(1, "0");
        list2.get(3);
        //update element
        list1.set(1, "Z");
        list1.remove(1);
        //sort
        Collections.sort(list1);
        //copy one array list to another
        System.out.println(list1);

        ///if dest is too short then error source does not fit in dest
        Collections.copy(list1, list2);
        System.out.println(list2);
        System.out.println(list1);

        //Shuffle elements in a array list
        Collections.shuffle(list1);

        // sort using custom comparator (reverse natural sorting)
        Collections.sort(list1, (x, y) -> y.compareTo(x));
        //alternatively
        Collections.sort(list1, Comparator.reverseOrder());

        // sort using custom comparator natural sorting
        Collections.sort(list1, (x, y) -> x.compareTo(y));
        //alternatively
        Collections.sort(list1, Comparator.naturalOrder());

        //reverse elements in a array list.
        Collections.reverse(list1);

        // extract a portion of a array list
        List<String> subList = list1.subList(0, 2);

        //compare two array lists
        ArrayList<String> comparedResult = new ArrayList<String>();
        for (String e : list1)
            comparedResult.add(list2.contains(e) ? "Yes" : "No");
        System.out.println(comparedResult);

        //swap two elements in an array list (swap first element with third)
        Collections.swap(list1, 1, 3);

        //empty an arraylist
        list1.removeAll(list1);

        //test an array list is empty or not
        list1.isEmpty();


        //trim the capacity of an array list the current list size
        //can be done onnly with array list not with list
        list1.trimToSize();
    }

    private static void basicLinkedList() {
        LinkedList<String> linkedList = new LinkedList<String>();
        // use add() method to add values in the linked list
        linkedList.add("Red");
        linkedList.add("Green");
        linkedList.add("Black");
        linkedList.add("White");
        linkedList.add("Pink");
        linkedList.add("Yellow");

        //iterate through all elements in a linked list starting at the specified position
        Iterator i = linkedList.listIterator(3);

        // iterate a linked list in reverse order
        Iterator reverseI = linkedList.descendingIterator();

        //Insert the specified element at the specified position in the linked list
        linkedList.add(3, "Middle");

        //insert elements into the linked list at the first and last position
        linkedList.addFirst("First");
        linkedList.addLast("Last");

        //insert the specified element at the front of a linked list.
        //Offering results boolean true for LL always
        boolean front_offering = linkedList.offerFirst("Front Offering");

        //Remove first element
        linkedList.removeFirst();
        linkedList.addFirst("First");
        //pop gives you back the object
        String pop = linkedList.pop();

        //Remove first occurence of last element
        linkedList.removeFirstOccurrence("Last");

        //gets you first object else null
        linkedList.peek();
        linkedList.peekLast();

        //Convert a linked list to array list
        ArrayList<String> arrayList = new ArrayList<>(linkedList);


    }

    private static void basicHashSet() {
        HashSet<String> hashSet = new HashSet<String>();
        // use add() method to add values in the hash set
        hashSet.add("Red");
        hashSet.add("Green");
        hashSet.add("Black");
        hashSet.add("White");
        hashSet.add("Pink");
        hashSet.add("Yellow");

        HashSet<String> secondHashSet = new HashSet<String>();
        // use add() method to add values in the hash set
        secondHashSet.add("Red");
        secondHashSet.add("Green");
        secondHashSet.add("Purple");
        secondHashSet.add("White");
        secondHashSet.add("Queen");
        secondHashSet.add("Yellow");

        // clone hasset to another

        HashSet<String> clone = (HashSet<String>) hashSet.clone();
        System.out.println(clone);

        //convert a hash set to an array.
        String[] objects = new String[hashSet.size()];
        objects = hashSet.toArray(objects);

        //Convert a hash set to a List/ArrayList

        ArrayList<String> arrayList = new ArrayList<>(hashSet);

        //hash set to a tree set
        TreeSet<String> treeSet = new TreeSet<>(hashSet);

        // compare two sets and retain elements which are same on both sets
        boolean b = clone.retainAll(secondHashSet);
        System.out.println(clone);

    }

    //Treeset maintains insertion order and it uses red black tree algorithm
    private static void treeSet() {

        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("Red");
        treeSet.add("Green");
        treeSet.add("Orange");
        treeSet.add("White");
        treeSet.add("Black");

        treeSet.first();
        treeSet.last();

        // Find the numbers less than 7 in a tree set

        TreeSet<Integer> tree_num = new TreeSet<Integer>();
        TreeSet<Integer> treeheadset = new TreeSet<Integer>();

        // Add numbers in the tree. Treeset stores data in natural sorting
        tree_num.add(1);
        tree_num.add(6);
        tree_num.add(10);
        tree_num.add(5);
        tree_num.add(9);
        tree_num.add(3);
        tree_num.add(8);
        tree_num.add(2);
        tree_num.add(7);

        //this will store numbers less than 7
        treeheadset = (TreeSet<Integer>) tree_num.headSet(7);
        //will print number from one to 6
        System.out.println(treeheadset);

        // get one element >=7
        Integer ceiling = tree_num.ceiling(7);
        Integer higher = tree_num.higher(7);
        System.out.println(ceiling + " higner-> " + higher);
        //get one element < 7
        Integer floor = tree_num.floor(7);
        Integer lower = tree_num.lower(7);
        System.out.println(floor + " lower-> " + lower);

        Integer integer = tree_num.pollFirst();


    }

    //inserts elements based on priority. When element is poll() then lowest element is removed. So not FIFO
    //while iterating may not give result in sorted form
    //priority queue doesn't permit null
    private static void priorityQueue() {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(1);
        priorityQueue.add(6);
        priorityQueue.add(10);
        priorityQueue.add(5);
        priorityQueue.add(9);
        priorityQueue.add(3);
        priorityQueue.add(8);
        priorityQueue.add(2);
        priorityQueue.add(7);

        //offer and add are exactly the same
        priorityQueue.offer(6);


        PriorityQueue<Sample> ps = new PriorityQueue<>();


    }

    private static void basicsOfHashMap() {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(1, "Red");
        hashMap.put(2, "Green");
        hashMap.put(3, "Black");
        hashMap.put(4, "White");
        hashMap.put(5, "Blue");

        boolean b = hashMap.containsKey(1);

    }

    private static void basicOfTreeMap() {
        TreeMap<Integer,String> treeMap=new TreeMap<Integer,String>();
        // Put elements to the map
        treeMap.put(1, "Red");
        treeMap.put(2, "Green");
        treeMap.put(3, "Black");
        treeMap.put(4, "White");
        treeMap.put(5, "Blue");

        boolean b = treeMap.containsKey(1);


    }
}

class Sample {

}
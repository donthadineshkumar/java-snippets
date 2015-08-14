package com.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Vector;
import java.util.stream.Stream;

public class BasicCollectionsEx {

	public static void main(String[] args) {
		/*
		 * Remember: Set does not preserve insertion order
		 */
		Set<String> set = new HashSet<>();
		
		set.add("abc");
		set.add("dac");
		set.add("bca");
		set.add("cba");
		
		
		System.out.println("*********Set**********");
		for(String str: set){
			System.out.println(str);
		}
		
		
		/*
		 * map orders its elements based on the key 
		 */
		Map<Integer,String> m = new HashMap<>();
		
		m.put(3,"bca");
		m.put(2,"cab");
		m.put(1, "abc");
		
		System.out.println("*********Map**********");
		for(Map.Entry<Integer, String> entry: m.entrySet()){
			System.out.println(entry.getKey() +" "+entry.getValue());
		}
	
	/*
	 * SortedSet is an interface and its implemented class is TreeSet
	 * Sorts the Strings in alphabetic order and integers in ascending order 
	 */
		SortedSet<String> sorSet =  new TreeSet<String>();
		
		sorSet.add("abc");
		sorSet.add("dac");
		sorSet.add("bca");
		sorSet.add("cba");
		
		System.out.println("*********SortedSet**********");
		for(String str: sorSet){
			System.out.println(str);
		}
		
	
		SortedSet<Integer> inSet =  new TreeSet<Integer>();
		
		inSet.add(101);
		inSet.add(103);
		inSet.add(104);
		inSet.add(110);
		inSet.add(107);
		inSet.add(102);
		
		System.out.println("*******SortedSet-Integers********");
		
		for(Integer str: inSet){
			System.out.println(str);
		}
		
		System.out.println("applying some methods on SortedSet");
		
		System.out.println("first value "+inSet.first());
		
		System.out.println("last value "+inSet.last());
		
		System.out.println("Subset "+inSet.subSet(103, 110));
		
		System.out.println("head set "+inSet.headSet(104));
		
		System.out.println("tail  set "+ inSet.tailSet(104));
		
		/*
		 * what is the underlying default natural sorting order
		 * comparator returns null if using a default natural sorting order
		 * default natural sorting order means : Integer : asecending String : alphabetical order
		 * From NavigableSet we can get ascending and descending set of elements
		 */
		System.out.println("compartor "+inSet.comparator());
		
		System.out.println("********NavigableSet********");
		
		NavigableSet<Integer> navSet = new TreeSet<Integer>();
		
		navSet.add(102);
		navSet.add(104);
		navSet.add(103);
		navSet.add(107);
		
		for(Integer str: navSet){
			System.out.println(str);
		}
		
		System.out.println("Comparator "+navSet.comparator());
		
		System.out.println("******NavigableSet with Iterator**********");
		
		Iterator<Integer> iter = navSet.iterator();

		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		
		
		System.out.println("******Desc NavigableSet******");
		NavigableSet<Integer> descNavSet = new TreeSet<Integer>();
		
		descNavSet = navSet.descendingSet();
		
		for(Integer str: descNavSet){
			System.out.println(str);
		}

		//
		Stream<Integer> streamInts =navSet.stream();
		
		System.out.println("Stream "+streamInts.count());
		
		System.out.println("**********LinkedHashSet*************");
		/*
		 * HashSet - insertion order is not preserved
		 * 
		 * LinkedHashSet - insertion is preserved
		 */
		LinkedHashSet<String>  lnSet = new LinkedHashSet<String>();
		
		lnSet.add("dinesh");
		lnSet.add("chris");
		lnSet.add("bhaskar");
		
		for(String s: lnSet){
			System.out.println(s);
		}
		
		
		
		System.out.println("*********LInkedHashMap************");
		/*
		 * HashMap  - insertion order is not preserved - sorts key values
		 * LinkedHashMap - insertion order is preserved
		 */
		LinkedHashMap<Integer, String> lnMap = new LinkedHashMap<Integer, String>();
		
		lnMap.put(1, "a");
		lnMap.put(3, "b");
		lnMap.put(4, "c");
		lnMap.put(2, "d");
		
		lnMap.remove(4);
		
		  for(Map.Entry<Integer, String> entry: lnMap.entrySet()){
			  System.out.println(entry.getKey()+" "+entry.getValue());
		  }
		  
		  /*
		   *  ArrayList & LinkedList are implementing classes for List interface
		   * 
		   *  Both preserve insertion order 
		   */
			
		  System.out.println("**********ArrayList*************");
		  List<String> arrList = new ArrayList<String>();
			
		  arrList.add("a");
		  arrList.add("c");
		  arrList.add("b");
			
			for(String s: arrList){
				System.out.println(s);
			}
			
		System.out.println("**********LinkedList*************");  		
		List<String> lnList = new LinkedList<String>();
		
		lnList.add("a");
		lnList.add("c");
		lnList.add("b");
		
		for(String s: lnList){
			System.out.println(s);
		}
		
		System.out.println("*********Vector************");
		/*
		 * Vector is also an Impl class for List interface & preserve the insertion order
		 * Vector is also allows duplicates and nulls as many as you add
		 * what is the diff btwn Vector and ArrayList?
		 * what is the diff btwn Vector and LinkedList?
		 */
		
		List<String> st = new Vector<String>();
		
		st.add("a");
		st.add("c");
		st.add("b");
	

		
		for(String s: st){
			System.out.println(s);
		}
		
		
	}
	
}

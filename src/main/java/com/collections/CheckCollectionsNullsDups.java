package com.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
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

public class CheckCollectionsNullsDups {

	public static void main(String[] args) {

		/*
		 * Set allows null values  - only one null
		 * does not preserve insertion order
		 * no dups allowed
		 */
		System.out.println("************Set**************");
		
		Set<String> set = new HashSet<>();

		set.add("abc");
		set.add("dac");
		set.add("bca");
		set.add(null);  // Set allows null values
		set.add("cba");
		//adding dupl
		set.add("cba"); // set does not allow duplicates

		
		for (String str : set) {
			System.out.println(str);
		}
		
		System.out.println("count of set with nulls included "+set.size());
				
		/*
		 * map orders its elements based on the key -
		 * no dupl keys - key will be updated
		 * map allows null values - and only one null key
		 */
		Map<Integer,String> m = new HashMap<>();
		
		m.put(3,"bca");
		m.put(2,"cab");
		m.put(1, "abc");
		//check dups
		m.put(2,"sdd"); // key 2 is updated its value - no dup keys
		m.put(4, null);
		m.put(5, null);
		
		System.out.println("*********Map**********");
		for(Map.Entry<Integer, String> entry: m.entrySet()){
			System.out.println(entry.getKey() +" "+entry.getValue());
		}
		
		
		/*
		 * SortedSet is an interface and its implemented class is TreeSet
		 * Sorts the Strings in alphabetic order and integers in ascending order 
		 * Any Set implementation (SortedSet - HashSet does not allow dupl)
		 * SortedSet - does not allow null values - by trying null s - get a
		 * NullPointerException
		 */
			SortedSet<String> sorSet =  new TreeSet<String>();
			
			sorSet.add("abc");
			sorSet.add("dac");
			sorSet.add("bca");
			sorSet.add("cba");
			//check dupls
			sorSet.add("cba"); //any Set implementation does not allow duplicates
			//sorSet.add(null);
			
			System.out.println("*********SortedSet**********");
			for(String str: sorSet){
				System.out.println(str);
			}
		
			System.out.println("*******SortedSet-Integers********");
			SortedSet<Integer> inSet =  new TreeSet<Integer>();
			
			inSet.add(101);
			inSet.add(103);
			inSet.add(104);
			inSet.add(110);
			inSet.add(107);
			inSet.add(102);
			inSet.add(107);  // Any Set does not allow dups
			//inSet.add(null);  //gives NullPointerException
							
			for(Integer str: inSet){
				System.out.println(str);
			}
			
			/*
			 * what is the underlying default natural sorting order
			 * comparator returns null if using a default natural sorting order
			 * default natural sorting order means : Integer : asecending String : alphabetical order
			 * any Set impl does not allow dups
			 * As NavigableSet is the sub-class of SortedSet - it does not allow nulls
			 * if trying to add nulls gives - NullPointerException
			 * From NavigableSet we can get ascending and descending set of elements
			 */
				
			System.out.println("********NavigableSet********");
			
			NavigableSet<Integer> navSet = new TreeSet<Integer>();
			
			navSet.add(102);
			navSet.add(104);
			navSet.add(103);
			navSet.add(107);
			navSet.add(103); //any Set impl - does not allow dups
			//navSet.add(null); //gives a NullPointerException
			
			
			for(Integer str: navSet){
				System.out.println(str);
			}
			
			
			/*
			 * HashSet - insertion order is not preserved
			 * 
			 * LinkedHashSet - insertion is preserved
			 * Any Set impl does not allow duplicates
			 * As insertion is preserved - it allows one null 
			 */
		
			System.out.println("*********LInkedHashSet************");
			LinkedHashSet<String>  lnSet = new LinkedHashSet<String>();
			
			lnSet.add("dinesh");
			lnSet.add("chris");
			lnSet.add(null);
			lnSet.add("bhaskar");
			//check dups
			lnSet.add("chris");
			lnSet.add(null);
			
			for(String s: lnSet){
				System.out.println(s);
			}
			
			System.out.println("*********LInkedHashMap************");
			/*
			 * HashMap  - insertion order is not preserved - sorts key values
			 * LinkedHashMap - insertion order is preserved
			 * Any Map impl should always provide unique key values - one null is allowed
			 * if you try to add more nulls then it updated the null key's value
			 * dupl keys not allowed - but values can be duplicated
			 * 
			 * diff btwn Map(HashMap) & LinkedHashMap :
			 * HashMap - sorts the key values - insertion order is not preserved
			 * LinkedHashMap - not sorting of keys - insertion order is preserved
			 */
			LinkedHashMap<Integer, String> lnMap = new LinkedHashMap<Integer, String>();
			
			lnMap.put(1, "a");
			lnMap.put(3, "b");
			lnMap.put(4, "c");
			lnMap.put(2, "d");
			lnMap.put(5, "d");
			//check dups
			
		//	lnMap.put(null, "e");
		//	lnMap.put(null, "u");
		   
			
			lnMap.remove(4);
			
			  for(Map.Entry<Integer, String> entry: lnMap.entrySet()){
				  System.out.println(entry.getKey()+" "+entry.getValue());
			  }
			
			  /*
			   *  ArrayList & LinkedList are implementing classes for List interface
			   * 
			   *  Both preserve insertion order
			   *  In ArrayList dups are allowed 
			   *  Allows as many nulls as you add
			   */
				
			  System.out.println("**********ArrayList*************");
			  List<String> arrList = new ArrayList<String>();
				
			  arrList.add("a");
			  arrList.add("c");
			  arrList.add(null); //adds this as null
			  arrList.add("b");
			  //check dups
			   arrList.add("b"); // adds this b also
			   arrList.add(null); //added as second null
				
				for(String s: arrList){
					System.out.println(s);
				}
				
				/*
				 * just like ArrayList - LinkedList also 
				 * allows null values and duplicates 
				 * can add as many as you need
				 * 
				 * Diff bwn ArrayList and LinkedList?
				 */
				System.out.println("**********LinkedList*************");  		
				List<String> lnList = new LinkedList<String>();
				
				lnList.add("a");
				lnList.add("c");
				lnList.add(null);
				lnList.add("b");
				//check dups
				lnList.add("b");
				lnList.add(null);
				lnList.add("b");
				
				for(String s: lnList){
					System.out.println(s);
				}
			  
				/*
				 * Vector is also an Impl class for List interface & preserve the insertion order
				 * Vector is also allows duplicates and nulls as many as you add
				 * what is the diff btwn Vector and ArrayList?
				 * what is the diff btwn Vector and LinkedList?
				 */
				
				System.out.println("**********Vector*************");  	
				List<String> st = new Vector<String>();
				
				st.add("a");
				st.add("c");
				st.add("a");
				st.add("b");
				//check nulls
				st.add(null);
				st.add(null);

				
				for(String s: st){
					System.out.println(s);
				}
				
	}
}
;
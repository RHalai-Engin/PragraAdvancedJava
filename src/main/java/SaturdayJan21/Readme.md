## Optional class
use of optional class is to avoid null pointer exception

// Hash map is critical and very important part of an interview
Question: Can we use class as a key in a Hahmap?
Ans: Yes, but the rule is that class has to be immutable in order to be used in Hashmap as a key.

// Map is not a part of collection 


//Arraylist is a list of arrays
when we want to add more elements into an array than the size of array, java will create new array
with more size and copy/move elements from previous array to new sized array.
//Arraylist accumulation formula 
Initial size of an ArrayList is 16(Index) - It can grow(Load Factor[60%])
array1 -- 10
array2 + array1/ 2 + 1 --> 10 + 10 / 2 + 1 = 16
array3 + array2/ 2 + 1 --> 16 + 16 / 2 + 1 = 25
array1 size is 10, array 2 size will be 16, array 3 size 25


## Internal data structure of a Hashmap
Question: What is an internal data structure of a HashMap
Ans: Internal data structure of a HashMap is an arraylist of LinkedList

Question: What is an internal implementation of HashMap and how does it work?


//Put operation in HashMap has set of rules
1. Generate HashCode(Integer value) of key
2. Based on HashCode generate Index -> Kind of a modulus operation 
   (Hashcode % size of an array (16))
3. Go to index and check. if no element exits -> create a LinkedList node.
   LinkedList will code 4 information: 
   1.HashCode, 2.Key, 3.Value, 4.Address of a next node(Initially address will be null)
4. Go to index, if element exists then compare the HashCode -> If HashCode doesn't match
   -> create new node
5. Go to index, if element exists then compare the HashCode -> If HashCode match
   -> compare keys(equals method) -> if keys don't match -> create new node
6. Go to index, if element exists then compare the HashCode -> If HashCode match
   -> compare keys(equals method) -> if keys match -> override the value

//Get operation in HashMap
1. Generate HashCode(Integer value) of key
2. Calculate Index - using Modulus operation
3. Go to index -> Compare HashCode -> if Doesn't match -> Go to next node
   -> compare HashCode -> If HashCode match -> compare Key using equals method -> if doesn't match
   -> go to next node -> compare key using equals method -> if key match -> get the value



Question to ask in class
In an ArrayList, how many number of nodes we can have for each index?


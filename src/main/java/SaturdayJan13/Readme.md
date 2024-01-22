## Recap of last class
1. Functional interface - only has one abstract method
2. Lambda - nameless function
   () -> {}
3. Predicate - accepts one argument and return boolean
## January 13
1. BiPredicate - accepts two arguments and returns boolean
2. Consumer - accepts one argument and returns void (nothing)
3. BiConsumer - accepts two arguments and returns void (nothing)
4. Supplier - accepts nothing but returns a value 
5. Function - accepts of 1 type, returns of another type, BiFunction

##
Questions (during the class)
1. Write a consumer which double each element give to it or list[later].
2. Using predicate check if the given string is palindrome
3. create a Function to calcualte the area based on given radius
   cicrle or square or rectangle.
4. use a supplier to get the local date time

## Streams
can be defined as a sequence of elements from a source which you perform on cllection or array.
-> It does not modify the original source
-> It is not a data structure or a collection
-> However, it operates on collection ot list or arrays, IO(Input/Output)
-> Each intermediate operation is lazily executed

Intermediate operation --> filter, map, etc [Lazy Operations] - Streams are lazy
## Streams - Terminal operations
-> collect to something or Print out the result
list.stream()
. filter(i -> i%3 == 0) ---> This is called an intermediate operation
. collect(Collectors.toList()); ---> This is called a terminal operation or print out

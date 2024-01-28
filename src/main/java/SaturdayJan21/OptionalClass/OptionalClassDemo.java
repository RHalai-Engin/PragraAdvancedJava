package SaturdayJan21.OptionalClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class OptionalClassDemo {
    public static void main(String[] args) {
        /*OptionalClassDemo user = new OptionalClassDemo();
        Optional<User> user1 = user.getUserFromDatabase();
        user1.orElseThrow(() -> new RuntimeException("User not available"));
        user1.ifPresent(u -> u.toString());
        if(user1.isPresent()){
            User user2 = user1.get();
            user2.toString();
        }*/

        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(55,99,11,33,77,73,25,21,41));
        Optional<Integer> optionalInteger = integers.stream().filter(i -> i % 2 == 0).distinct().findAny();
        Integer evenNumber = optionalInteger.orElseThrow(() -> new RuntimeException("List doesn't have even numbers"));
        System.out.println(evenNumber);
    }

    /*public Optional<User> getUserFromDatabase(){
        User user = new User("Rajan", "Halai");
        if(Math.random() > 0.5){
            Optional<User> optionalUser = Optional.of(user);
            return optionalUser;
        }
        else{
            return Optional.empty();
        }
    }*/
}

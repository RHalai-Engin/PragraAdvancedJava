package SaturdayJan21.HasCodeDemo;

import SaturdayJan21.OptionalClass.User; // We have utilized User class for this example

import java.util.HashMap;
import java.util.Map;

public class HashCodeDemo {
    public static void main(String[] args) {
        /*String s = "abc";
        System.out.println(s.hashCode());

        User user = new User("Rajan", "Halai");
        System.out.println(user.hashCode()); //Hash code method doesn't work well with user defined object -> 460141958
        user.setFirstName("John");
        user.setLastName("Smith");
        System.out.println(user.hashCode()); // I will get the same Hashcode as Rajan Halai -> 460141958*/

        Map<User, Integer> salaries = new HashMap<>

    }
}

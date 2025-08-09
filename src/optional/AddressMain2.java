package optional;

import optional.model.Address;
import optional.model.User;

import java.util.Optional;

public class AddressMain2 {

    public static void main(String[] args) {
        User user1 = new User("user1", null);
        User user2 = new User("user1", new Address("hello street"));

        printStreet(user1);
        printStreet(user2);
    }

    private static void printStreet(User user) {
        getUserStreet(user).ifPresentOrElse(
                x -> System.out.println(x),
                ()-> System.out.println("Unknown")
        );
    }

    static Optional<String> getUserStreet(User user) {
        return Optional.ofNullable(user)
                .map(u -> u.getAddress())
                .map(address -> address.getStreet());
    }
}

package seminar3;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Personal personal = new Personal();
        personal.addUser((new User("Ivan", "Petrov", 28)))
                .addUser((new User("Peter", "Ivanov", 33)))
                .addUser((new User("Nikolay", "Sidorov", 35)))
                .addUser((new User("Peter", "Ivanov", 46)))
                .addUser((new User("Nikolay", "Sidorov", 22)))
                .addUser((new User("Ivanov", "Ivanov", 33)))
                .addUser((new User("Nikolay", "Nikolay", 35)))
        ;
        for (User user:personal) {
            System.out.println(user);
        }
        List<User> users = personal.getUsers();
        Collections.sort(users);
        System.out.println("________");
        for (User user:users) {
            System.out.println(user);
        }

        User boss = new User("Dmitriy","Petrovich", 40);
        boss.setPersonal(personal);
        User littleBoss = new User("Oleg", "Petrovich",35);
        personal.addUser(littleBoss);
        littleBoss.setPersonal(new Personal().addUser(new User("Nikolay", "Petrov", 35)));
        System.out.println("=========");
        Company company = new Company(boss);
        for (User user:company) {
            System.out.println(user);

        }

        User middleBoss = new User("Michail", "Petrovich", 25);
        personal.addUser(middleBoss);
        middleBoss.setPersonal(new Personal()
                .addUser(new User("Nikolay", "Petrov", 20))
                .addUser(new User("Ivan", "Popov", 20)));

        for (User user: company) {
            System.out.println(user);
        }
    }

}

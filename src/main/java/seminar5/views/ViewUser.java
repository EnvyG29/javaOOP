package seminar5.views;

import seminar5.controllers.UserController;
import seminar5.model.User;

import java.util.List;
import java.util.Scanner;

public class ViewUser {

    private final UserController userController;

    public ViewUser(UserController userController) {
        this.userController = userController;
    }

    public void run() {
        Commands com = Commands.NONE;

        while (true) {
            String command = prompt("Введите команду: ");
            try {
                com = Commands.valueOf(command.toUpperCase());
                if (com == Commands.EXIT) return;
                switch (com) {
                    case CREATE -> {
                        createUser();
                    }
                    case READ -> {
                        readUser();
                    }
                    case LIST -> {
                        readList();
                    }
                    case UPDATE -> {
                        updateUser();
                    }
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void updateUser() throws Exception {
        readList();
        User user = getUser();
        User updateUser = getNewUser();
        updateUser.setId(user.getId());
        User savedUser = userController.updateUser(updateUser);
        System.out.println(savedUser);
    }

    private void readList() {
        List<User> listUsers = userController.readAllUsers();
        for (User user: listUsers) {
            System.out.println(user);
        }
    }

    private void readUser() throws Exception {
        User user = getUser();
        System.out.println(user);
    }

    private User getUser() throws Exception {
        String id = prompt("Идентификатор пользователя: ");
        return userController.readUser(id);
    }

    private void createUser() {
        User user = getNewUser();
        userController.saveUser(user);
    }

    private User getNewUser() {
        String firstName = prompt("Имя: ");
        String lastName = prompt("Фамилия: ");
        String phone = prompt("Номер телефона: ");
        return new User(firstName, lastName, phone);
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
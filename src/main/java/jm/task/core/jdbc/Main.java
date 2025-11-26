package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Камран", "Дусариев", (byte) 26);
        userService.saveUser("Александр", "Андропов", (byte) 22);
        userService.saveUser("Данил", "Ивашко", (byte) 19);
        userService.saveUser("Мария", "Слюсарева", (byte) 17);

        List<User> users = userService.getAllUsers();
        System.out.println("\nСписок всех пользователей:");
        for (User user : users) {
            System.out.println(user);
        }

        userService.cleanUsersTable();
        System.out.println("\nТаблица пользователей очищена");

        userService.dropUsersTable();
        System.out.println("Таблица пользователей удалена");
    }
}

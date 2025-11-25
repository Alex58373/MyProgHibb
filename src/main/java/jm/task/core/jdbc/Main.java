package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserService userService = new UserServiceImpl();

        // Создание таблицы User(ов)
        userService.createUsersTable();

        // Добавление 4 User(ов) в таблицу
        userService.saveUser("Камран", "Дусариев", (byte) 26);
        System.out.println("User с именем Камран добавлен в базу данных");

        userService.saveUser("Александр", "Андропов", (byte) 22);
        System.out.println("User с именем Александр добавлен в базу данных");

        userService.saveUser("Данил", "Ивашко", (byte) 19);
        System.out.println("User с именем Данил добавлен в базу данных");

        userService.saveUser("Мария", "Слюсарева", (byte) 17);
        System.out.println("User с именем Мария добавлен в базу данных");


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

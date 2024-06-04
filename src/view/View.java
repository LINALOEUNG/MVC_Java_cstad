package view;

import controller.UserController;
import model.service.User;

public class View {
    private static final UserController userController = new UserController();
    public static void UI(){
        System.out.println("This is views :");
        userController.getAllUser()
                .forEach(System.out::println);
        userController.addNewUser(new User(3,"mana","linag8296@gmail.com"));
        System.out.println("After adding new user :");
        userController.getAllUser().forEach(System.out::println);
        System.out.println("Deleted User :");
        userController.deleteUser(2).forEach(System.out::println);
        System.out.println("Successfully deleted User :");
        userController.getAllUser()
                .forEach(System.out::println);

    }
}

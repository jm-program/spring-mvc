package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> showAllUsers();

     User showUser(Integer id);

     void createUser(User user);

     void updateUser(Integer id, User updatedUser);

     void deleteUser(Integer id);

}

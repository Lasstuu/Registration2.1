package main.registration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class UserStorage {
    private ArrayList<User> users = new ArrayList<>();
    private static UserStorage userStorage = null;

    private UserStorage(){

    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public ArrayList<User> getUsersAlphabetical() {
        Collections.sort(users, new Comparator<User>() {
            @Override
            public int compare(User user, User t1) {
                return user.getLastName().compareToIgnoreCase(t1.getLastName());
            }
        });
        return users;
    }

    public void addUser(User user){
        users.add(user);
    }

    public static UserStorage getInstance(){
        if(userStorage == null) {
            userStorage = new UserStorage();
        }
        return(userStorage);
    }
}

package codegym.model;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User> users;
    static {
        users = new ArrayList<>();
        User user1 = new User("tin","123456","Tin","tin@codegym.vn","20");
        User user2 = new User("hai","123456","Hai","hai@codegym.vn","21");
        User user3 = new User("thanh","123456","Thanh","thanh@codegym.vn","25");
        User user4 = new User("nhat","123456","Nhat","nhat@codegym.vn","20");
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
    }

    public static User checkLogin(Login login){
        for(User user : users){
            if(user.getAccount().equals(login.getAccount()) && user.getPassword().equals(login.getPassword())){
                return user;
            }
        }
        return null;
    }
}


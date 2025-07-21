import java.util.*;
public class User {
    private String User;
    private String Password;
    static HashMap<String, String> dictionary = new HashMap<>();
    public void getUser(){
        System.out.println(User);
    }
    public void getPassword(){
        System.out.println(Password);
    }
    public void setUser(String User){
        this.User = User;
    }
    public void setPassword(String Password){
        this.Password = Password;
    }
    public void Sign_up(String User ,String Password){
        dictionary.put(User,Password);
    }
    public boolean validation_User_Login(String User, String Password){
        return dictionary.containsKey(User) && dictionary.get(User).equals(Password);
    }

}

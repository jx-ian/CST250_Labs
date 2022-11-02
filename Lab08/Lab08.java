package lab08;

/**
 * @author jiahaoxian
 */

public class Lab08 {

    public static void main(String[] args) {
        
        User user01 = new User("Saba", "Chicago");
        user01.tweet("Hello everyone, this is my first tweet!").Display();
        
        User user02 = new User("Joe");
        user02.tweet("Hi, This is Joe!").Display();
        
        User user03 = new User("Emily", "NYC");
        user03.tweet("Such a beautiful day in New York today!").Display();
        
        user02.tweet("I wish I could get some pizza right now!").Display();
        
        

    }
    
}

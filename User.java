//I worked on the homework assignment alone, using only course materials.
/**
 * This class represents the User object
 * @author YongIk Choi
 * @version 1.0.0
 */

public class User {
    private String username;
    private int password;
    private static int numUsers = 0;
    private static User newestUser;
    private static boolean displayNewest = true;

    /**
    *Constructer for user
    *@param username - username as string
    *@param password - password as integer
    */
    public User(String username, int password) {
        this.username = username;
        this.password = password;
        numUsers = numUsers + 1;
        newestUser = User.this;
    }
    /**
    *@param displayNewest - display newest as boolean
    */
    public static void setDisplayNewest(boolean displayNewest) {
        User.displayNewest = displayNewest;
    }
    /**
    *@return return the number of users
    */
    public static int getNumUsers() {
        return numUsers;
    }
    /**
    *@return return the username through getter method
    */
    public String getUsername() {
        return username;
    }
    /**
    *@return return different statements based on if else
    */
    public static String getWelcomeMessage() {
        if (numUsers == 0) {
            return "This site doesn't have any users yet!";
        } else if (numUsers >= 1 && !displayNewest) {
            return "Welcome to our site! We have " + numUsers + " user(s) and counting!";
        } else {
            return newestUser.username + " just joined our site! Please give them a warm welcome!";

        }
    }
    /**
    *@param usernameInput string as username
    *@param passwordInput integer as password
    *@param newPassword integer as new password
    */
    public void changePassword(String usernameInput, int passwordInput, int newPassword) {
        if (username == usernameInput && password == passwordInput) {
            password = newPassword;
        }
    }

    /**
    *@param usernameInput string as username
    *@param passwordInput integer as password
    *@return return boolean based on if ielse
    */
    public boolean validLogin(String usernameInput, int passwordInput) {
        if (username == usernameInput && password == passwordInput) {
            return true;
        }
        return false;
    }
}

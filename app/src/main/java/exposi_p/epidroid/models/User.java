package exposi_p.epidroid.models;

import com.google.gson.annotations.SerializedName;

/**
 * @author sound
 */
public class User {
    @SerializedName("login")
    private String login;
    @SerializedName("password")
    private String password;

    /**
     *
     * @param pass
     * @param log
     * @author sound
     */
    public User(String pass, String log){
        login = log;
        password = pass;
    }

    /**
     * @return A string containing the password
     * @author sound
     */
    public String getPassword(){
        return password;
    }

    /**
     * @return A string containing the login
     * @author sound
     */
    public String getLogin(){
        return login;
    }
}

package exposi_p.epidroid.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Emilie on 30/01/2016.
 */
public class Login {
    @SerializedName("login")
    private String login;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}

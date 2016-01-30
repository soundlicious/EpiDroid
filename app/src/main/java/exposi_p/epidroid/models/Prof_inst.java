package exposi_p.epidroid.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Emilie on 30/01/2016.
 */
public class Prof_inst {
    @SerializedName("type")
    private String user;
    @SerializedName("login")
    private String login;
    @SerializedName("title")
    private String title;
    @SerializedName("picture")
    private String title;
    @SerializedName("type")
    private String type;
    @SerializedName("login")
    private String login;
    @SerializedName("title")
    private String title;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

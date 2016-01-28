package exposi_p.epidroid.models;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

/**
 * Created by sound on 28/01/16.
 */
public class History {
    @SerializedName("title")
    private String title;
    @SerializedName("user")
    private User user;
    @SerializedName("content")
    private String content;
    @SerializedName("date")
    private String date;
    @SerializedName("id")
    private String id;
    @SerializedName("visible")
    private String visible;
    @SerializedName("id_activite")
    private String idActivite;
    @SerializedName("class")
    private String _class;

    /**
     * @return The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return The user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user The user
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * @return The content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content The content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return The date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date The date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return The id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return The visible
     */
    public String getVisible() {
        return visible;
    }

    /**
     * @param visible The visible
     */
    public void setVisible(String visible) {
        this.visible = visible;
    }

    /**
     * @return The idActivite
     */
    public String getIdActivite() {
        return idActivite;
    }

    /**
     * @param idActivite The id_activite
     */
    public void setIdActivite(String idActivite) {
        this.idActivite = idActivite;
    }

    /**
     * @return The _class
     */
    public String getClass_() {
        return _class;
    }

    /**
     * @param _class The class
     */
    public void setClass_(String _class) {
        this._class = _class;
    }
}

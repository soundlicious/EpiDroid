package exposi_p.epidroid.models;

import com.google.gson.annotations.SerializedName;

/**
 * @author sound
 */
public class User {
    @SerializedName("picture")
    private String picture;
    @SerializedName("title")
    private String title;
    @SerializedName("url")
    private String url;

    /**
     * @return The picture
     */
    public String getPicture() {
        return picture;
    }

    /**
     * @param picture The picture
     */
    public void setPicture(String picture) {
        this.picture = picture;
    }

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
     * @return The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url The url
     */
    public void setUrl(String url) {
        this.url = url;
    }
}

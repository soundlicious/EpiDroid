package exposi_p.epidroid.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Platy on 31/01/2016.
 */
public class Master {
    @SerializedName("login")
    private String login;
    @SerializedName("date_ins")
    private String date_ins;
    @SerializedName("date_modif")
    private String date_modif;
    @SerializedName("status")
    private String status;
    @SerializedName("picture")
    private String picture;
    @SerializedName("title")
    private String title;
}

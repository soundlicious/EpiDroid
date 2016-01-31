package exposi_p.epidroid.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Platy on 30/01/2016.
 */
public class Registered {
    @SerializedName("id")
    private String id;
    @SerializedName("title")
    private String title;
    @SerializedName("code")
    private String code;
    @SerializedName("final_note")
    private String final_note;
    @SerializedName("repository")
    private String repository;
    @SerializedName("closed")
    private Boolean closed;
    @SerializedName("master")
    private Master master;
    @SerializedName("members")
    private Members members[];
}

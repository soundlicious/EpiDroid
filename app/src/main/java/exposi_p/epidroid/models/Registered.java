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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFinal_note() {
        return final_note;
    }

    public void setFinal_note(String final_note) {
        this.final_note = final_note;
    }

    public String getRepository() {
        return repository;
    }

    public void setRepository(String repository) {
        this.repository = repository;
    }

    public Boolean getClosed() {
        return closed;
    }

    public void setClosed(Boolean closed) {
        this.closed = closed;
    }

    public Master getMaster() {
        return master;
    }

    public void setMaster(Master master) {
        this.master = master;
    }

    public Members[] getMembers() {
        return members;
    }

    public void setMembers(Members[] members) {
        this.members = members;
    }
}

package exposi_p.epidroid.models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Emilie on 31/01/2016.
 */
public class Project_post{
    @SerializedName("code")
    private String code;
    @SerializedName("title")
    private String title;
    @SerializedName("url_repository")
    private String urlRepository;
    @SerializedName("members")
    private List<Members> members = new ArrayList<Members>();

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrlRepository() {
        return urlRepository;
    }

    public void setUrlRepository(String urlRepository) {
        this.urlRepository = urlRepository;
    }

    public List<Members> getMembers() {
        return members;
    }

    public void setMembers(List<Members> members) {
        this.members = members;
    }
}

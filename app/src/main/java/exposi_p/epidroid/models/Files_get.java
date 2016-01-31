package exposi_p.epidroid.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Platy on 31/01/2016.
 */
public class Files_get {
    @SerializedName("type")
    private String type;
    @SerializedName("slug")
    private String slug;
    @SerializedName("title")
    private String title;
    @SerializedName("secure")
    private Boolean secure;
    @SerializedName("synchro")
    private Boolean synchro;
    @SerializedName("archive")
    private Boolean archive;
    @SerializedName("language")
    private String language;
    @SerializedName("size")
    private Double size;
    @SerializedName("ctime")
    private String ctime;
    @SerializedName("mtime")
    private String mtime;
    @SerializedName("isLeaf")
    private Boolean isLeaf;
    @SerializedName("noFolder")
    private Boolean noFolder;
    @SerializedName("rights")
    private Rights rights;
    @SerializedName("modifier")
    private Modifier modifier;
    @SerializedName("fullpath")
    private String fullpath;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getSecure() {
        return secure;
    }

    public void setSecure(Boolean secure) {
        this.secure = secure;
    }

    public Boolean getSynchro() {
        return synchro;
    }

    public void setSynchro(Boolean synchro) {
        this.synchro = synchro;
    }

    public Boolean getArchive() {
        return archive;
    }

    public void setArchive(Boolean archive) {
        this.archive = archive;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public String getCtime() {
        return ctime;
    }

    public void setCtime(String ctime) {
        this.ctime = ctime;
    }

    public String getMtime() {
        return mtime;
    }

    public void setMtime(String mtime) {
        this.mtime = mtime;
    }

    public Boolean getIsLeaf() {
        return isLeaf;
    }

    public void setIsLeaf(Boolean isLeaf) {
        this.isLeaf = isLeaf;
    }

    public Boolean getNoFolder() {
        return noFolder;
    }

    public void setNoFolder(Boolean noFolder) {
        this.noFolder = noFolder;
    }

    public Rights getRights() {
        return rights;
    }

    public void setRights(Rights rights) {
        this.rights = rights;
    }

    public Modifier getModifier() {
        return modifier;
    }

    public void setModifier(Modifier modifier) {
        this.modifier = modifier;
    }

    public String getFullpath() {
        return fullpath;
    }

    public void setFullpath(String fullpath) {
        this.fullpath = fullpath;
    }
}

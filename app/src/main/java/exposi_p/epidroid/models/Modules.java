package exposi_p.epidroid.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Emilie on 30/01/2016.
 */
public class Modules {
    @SerializedName("scolaryear")
    private String scolaryear;
    @SerializedName("id_user_history")
    private String idUserHistory;
    @SerializedName("codemodule")
    private String codemodule;
    @SerializedName("codeinstance")
    private String codeinstance;
    @SerializedName("title")
    private String title;
    @SerializedName("id_instance")
    private String idInstance;
    @SerializedName("date_ins")
    private String dateIns;
    @SerializedName("cycle")
    private String cycle;
    @SerializedName("grade")
    private String grade;
    @SerializedName("credits")
    private String credits;
    @SerializedName("flags")
    private String flags;
    @SerializedName("barrage")
    private String barrage;
    @SerializedName("instance_id")
    private String instanceId;
    @SerializedName("module_rating")
    private String moduleRating;
    @SerializedName("semester")
    private String semester;

    public String getScolaryear() {
        return scolaryear;
    }

    public void setScolaryear(String scolaryear) {
        this.scolaryear = scolaryear;
    }

    public String getIdUserHistory() {
        return idUserHistory;
    }

    public void setIdUserHistory(String idUserHistory) {
        this.idUserHistory = idUserHistory;
    }

    public String getCodemodule() {
        return codemodule;
    }

    public void setCodemodule(String codemodule) {
        this.codemodule = codemodule;
    }

    public String getCodeinstance() {
        return codeinstance;
    }

    public void setCodeinstance(String codeinstance) {
        this.codeinstance = codeinstance;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIdInstance() {
        return idInstance;
    }

    public void setIdInstance(String idInstance) {
        this.idInstance = idInstance;
    }

    public String getDateIns() {
        return dateIns;
    }

    public void setDateIns(String dateIns) {
        this.dateIns = dateIns;
    }

    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getCredits() {
        return credits;
    }

    public void setCredits(String credits) {
        this.credits = credits;
    }

    public String getFlags() {
        return flags;
    }

    public void setFlags(String flags) {
        this.flags = flags;
    }

    public String getBarrage() {
        return barrage;
    }

    public void setBarrage(String barrage) {
        this.barrage = barrage;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getModuleRating() {
        return moduleRating;
    }

    public void setModuleRating(String moduleRating) {
        this.moduleRating = moduleRating;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }
}

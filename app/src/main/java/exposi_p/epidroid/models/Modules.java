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

    /**
     * @return The scolaryear
     */
    public String getScolaryear() {
        return scolaryear;
    }

    /**
     * @param title The title
     */
    public void setScolaryear(String scolaryear) {
        this.scolaryear = scolaryear;
    }

    /**
     * @return The idUserHistory
     */
    public String getIdUserHistory() {
        return idUserHistory;
    }

    /**
     * @param title The idUserHistory
     */
    public void setIdUserHistory(String idUserHistory) {
        this.idUserHistory = idUserHistory;
    }

    /**
     * @return The codemodule
     */
    public String getCodemodule() {
        return codemodule;
    }

    /**
     * @param title The codemodule
     */
    public void setCodemodule(String codemodule) {
        this.codemodule = codemodule;
    }

    /**
     * @return The codeinstance
     */
    public String getCodeinstance() {
        return codeinstance;
    }

    /**
     * @param title The codeinstance
     */
    public void setCodeinstance(String codeinstance) {
        this.codeinstance = codeinstance;
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
     * @return The idInstance
     */
    public String getIdInstance() {
        return idInstance;
    }

    /**
     * @param title The idInstance
     */
    public void setIdInstance(String idInstance) {
        this.idInstance = idInstance;
    }

    /**
     * @return The dateIns
     */
    public String getDateIns() {
        return dateIns;
    }

    /**
     * @param title The dateIns
     */
    public void setDateIns(String dateIns) {
        this.dateIns = dateIns;
    }

    /**
     * @return The cycle
     */
    public String getCycle() {
        return cycle;
    }

    /**
     * @param title The cycle
     */
    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

    /**
     * @return The grade
     */
    public String getGrade() {
        return grade;
    }

    /**
     * @param title The grade
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     * @return The credits
     */
    public String getCredits() {
        return credits;
    }

    /**
     * @param title The credits
     */
    public void setCredits(String credits) {
        this.credits = credits;
    }

    /**
     * @return The flags
     */
    public String getFlags() {
        return flags;
    }

    /**
     * @param title The flags
     */
    public void setFlags(String flags) {
        this.flags = flags;
    }

    /**
     * @return The barrage
     */
    public String getBarrage() {
        return barrage;
    }

    /**
     * @param title The barrage
     */
    public void setBarrage(String barrage) {
        this.barrage = barrage;
    }

    /**
     * @return The instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * @param title The instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * @return The moduleRating
     */
    public String getModuleRating() {
        return moduleRating;
    }

    /**
     * @param title The moduleRating
     */
    public void setModuleRating(String moduleRating) {
        this.moduleRating = moduleRating;
    }

    /**
     * @return The semester
     */
    public String getSemester() {
        return semester;
    }

    /**
     * @param title The semester
     */
    public void setSemester(String semester) {
        this.semester = semester;
    }
}

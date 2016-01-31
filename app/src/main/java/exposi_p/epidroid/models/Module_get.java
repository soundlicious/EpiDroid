package exposi_p.epidroid.models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Emilie on 31/01/2016.
 */
public class Module_get {
    @SerializedName("scolaryear")
    private String scolaryear;
    @SerializedName("codemodule")
    private String codemodule;
    @SerializedName("codeinstance")
    private String codeinstance;
    @SerializedName("semester")
    private String semester;
    @SerializedName("scolaryear_template")
    private String scolaryearTemplate;
    @SerializedName("title")
    private String title;
    @SerializedName("begin")
    private String begin;
    @SerializedName("end_register")
    private String endRegister;
    @SerializedName("end")
    private String end;
    @SerializedName("past")
    private String past;
    @SerializedName("closed")
    private String closed;
    @SerializedName("opened")
    private String opened;
    @SerializedName("user_credits")
    private String userCredits;
    @SerializedName("credits")
    private String credits;
    @SerializedName("description")
    private String description;
    @SerializedName("competence")
    private String competence;
    @SerializedName("flags")
    private String flags;
    @SerializedName("max_ins")
    private String max_ins;
    @SerializedName("instance_location")
    private String instanceLocation;
    @SerializedName("hidden")
    private String hidden;
    @SerializedName("old_acl_backup")
    private String oldAclBackup;
    @SerializedName("resp")
    private List<Resp> resp = new ArrayList<Resp>();
    @SerializedName("assistant")
    private List<Assistant> assistant = new ArrayList<Assistant>();
    @SerializedName("rights")
    private String rights;
    @SerializedName("allow_register")
    private String allowRegister;
    @SerializedName("date_ins")
    private String dateIns;
    @SerializedName("student_registered")
    private String studentRegistered;
    @SerializedName("student_grade")
    private String studentGrade;
    @SerializedName("student_credit;")
    private String studentCredits;
    @SerializedName("color")
    private String color;
    @SerializedName("student_flags")
    private String studentFlags;
    @SerializedName("current_resp")
    private Boolean currentResp;
    @SerializedName("activites")
    private List<Activites> activites = new ArrayList<Activites>();

    public String getScolaryear() {
        return scolaryear;
    }

    public void setScolaryear(String scolaryear) {
        this.scolaryear = scolaryear;
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

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getScolaryearTemplate() {
        return scolaryearTemplate;
    }

    public void setScolaryearTemplate(String scolaryearTemplate) {
        this.scolaryearTemplate = scolaryearTemplate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBegin() {
        return begin;
    }

    public void setBegin(String begin) {
        this.begin = begin;
    }

    public String getEndRegister() {
        return endRegister;
    }

    public void setEndRegister(String endRegister) {
        this.endRegister = endRegister;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getPast() {
        return past;
    }

    public void setPast(String past) {
        this.past = past;
    }

    public String getClosed() {
        return closed;
    }

    public void setClosed(String closed) {
        this.closed = closed;
    }

    public String getOpened() {
        return opened;
    }

    public void setOpened(String opened) {
        this.opened = opened;
    }

    public String getUserCredits() {
        return userCredits;
    }

    public void setUserCredits(String userCredits) {
        this.userCredits = userCredits;
    }

    public String getCredits() {
        return credits;
    }

    public void setCredits(String credits) {
        this.credits = credits;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCompetence() {
        return competence;
    }

    public void setCompetence(String competence) {
        this.competence = competence;
    }

    public String getFlags() {
        return flags;
    }

    public void setFlags(String flags) {
        this.flags = flags;
    }

    public String getMax_ins() {
        return max_ins;
    }

    public void setMax_ins(String max_ins) {
        this.max_ins = max_ins;
    }

    public String getInstanceLocation() {
        return instanceLocation;
    }

    public void setInstanceLocation(String instanceLocation) {
        this.instanceLocation = instanceLocation;
    }

    public String getHidden() {
        return hidden;
    }

    public void setHidden(String hidden) {
        this.hidden = hidden;
    }

    public String getOldAclBackup() {
        return oldAclBackup;
    }

    public void setOldAclBackup(String oldAclBackup) {
        this.oldAclBackup = oldAclBackup;
    }

    public List<Resp> getResp() {
        return resp;
    }

    public void setResp(List<Resp> resp) {
        this.resp = resp;
    }

    public List<Assistant> getAssistant() {
        return assistant;
    }

    public void setAssistant(List<Assistant> assistant) {
        this.assistant = assistant;
    }

    public String getRights() {
        return rights;
    }

    public void setRights(String rights) {
        this.rights = rights;
    }

    public String getAllowRegister() {
        return allowRegister;
    }

    public void setAllowRegister(String allowRegister) {
        this.allowRegister = allowRegister;
    }

    public String getDateIns() {
        return dateIns;
    }

    public void setDateIns(String dateIns) {
        this.dateIns = dateIns;
    }

    public String getStudentRegistered() {
        return studentRegistered;
    }

    public void setStudentRegistered(String studentRegistered) {
        this.studentRegistered = studentRegistered;
    }

    public String getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(String studentGrade) {
        this.studentGrade = studentGrade;
    }

    public String getStudentCredits() {
        return studentCredits;
    }

    public void setStudentCredits(String studentCredits) {
        this.studentCredits = studentCredits;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getStudentFlags() {
        return studentFlags;
    }

    public void setStudentFlags(String studentFlags) {
        this.studentFlags = studentFlags;
    }

    public Boolean getCurrentResp() {
        return currentResp;
    }

    public void setCurrentResp(Boolean currentResp) {
        this.currentResp = currentResp;
    }

    public List<Activites> getActivites() {
        return activites;
    }

    public void setActivites(List<Activites> activites) {
        this.activites = activites;
    }
}

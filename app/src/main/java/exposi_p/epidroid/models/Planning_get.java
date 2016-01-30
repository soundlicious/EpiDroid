package exposi_p.epidroid.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Emilie on 30/01/2016.
 */
public class Planning_get {
    @SerializedName("allow_register")
    private Boolean allowRegister;
    @SerializedName("codeinstance")
    private String codeinstance;
    @SerializedName("acti_title")
    private String actiTitle;
    @SerializedName("allow_token")
    private Boolean allowToken;
    @SerializedName("register_month")
    private Boolean registerMonth;
    @SerializedName("codeacti")
    private String codeacti;
    @SerializedName("module_registred")
    private Boolean moduleRegistred;
    @SerializedName("codemodule")
    private String codemodule;
    @SerializedName("register_prof")
    private Boolean registerProf;
    @SerializedName("prof_inst")
    private ProfInst profInst_;
    @SerializedName("register_student")
    private Boolean registerStudent;
    @SerializedName("allowed_planning_start")
    private String allowedPlanningStart;
    @SerializedName("rdv_indiv_registered")
    private Boolean rdvIndivRegistered;
    @SerializedName("rdv_group_registered")
    private Boolean rdvGroupRegistered;
    @SerializedName("project")
    private Boolean project;
    @SerializedName("module_available")
    private Boolean moduleAvailable;
    @SerializedName("titlemodule")
    private String titlemodule;
    @SerializedName("type_title")
    private String typeTitle;
    @SerializedName("type_code")
    private String typeCode;
    @SerializedName("nb_group")
    private String nbGroup;
    @SerializedName("num_event")
    private String numEvent;
    @SerializedName("semester")
    private String semester;
    @SerializedName("room")
    private Room room;
    @SerializedName("allowed_planning_end")
    private String allowedPlanningEnd;
    @SerializedName("scolaryear")
    private String scolaryear;
    @SerializedName("start")
    private String start;
    @SerializedName("codeevent")
    private String codeevent;
    @SerializedName("in_more_than_one_month")
    private Boolean inMoreThanOneMonth;
    @SerializedName("nb_hours")
    private String nbHours;
    @SerializedName("display")
    private String display;
    @SerializedName("dates")
    private String dates;
    @SerializedName("nb_max_students_projet")
    private String nbMaxStudentsProjet;
    @SerializedName("is_rdv")
    private String isRdv;
    @SerializedName("instance_location")
    private String instanceLocation;
    @SerializedName("title")
    private String title;
    @SerializedName("event_registered")
    private Boolean eventRegistered;
    @SerializedName("end")
    private String end;
    @SerializedName("past")
    private Boolean past;
    @SerializedName("total_students_registered")
    private String totalStudentsRegistered;

    public Boolean getAllowRegister() {
        return allowRegister;
    }

    public void setAllowRegister(Boolean allowRegister) {
        this.allowRegister = allowRegister;
    }

    public String getCodeinstance() {
        return codeinstance;
    }

    public void setCodeinstance(String codeinstance) {
        this.codeinstance = codeinstance;
    }

    public String getActiTitle() {
        return actiTitle;
    }

    public void setActiTitle(String actiTitle) {
        this.actiTitle = actiTitle;
    }

    public Boolean getAllowToken() {
        return allowToken;
    }

    public void setAllowToken(Boolean allowToken) {
        this.allowToken = allowToken;
    }

    public Boolean getRegisterMonth() {
        return registerMonth;
    }

    public void setRegisterMonth(Boolean registerMonth) {
        this.registerMonth = registerMonth;
    }

    public String getCodeacti() {
        return codeacti;
    }

    public void setCodeacti(String codeacti) {
        this.codeacti = codeacti;
    }

    public Boolean getModuleRegistred() {
        return moduleRegistred;
    }

    public void setModuleRegistred(Boolean moduleRegistred) {
        this.moduleRegistred = moduleRegistred;
    }

    public String getCodemodule() {
        return codemodule;
    }

    public void setCodemodule(String codemodule) {
        this.codemodule = codemodule;
    }

    public Boolean getRegisterProf() {
        return registerProf;
    }

    public void setRegisterProf(Boolean registerProf) {
        this.registerProf = registerProf;
    }

    public ProfInst getProfInst_() {
        return profInst_;
    }

    public void setProfInst_(ProfInst profInst_) {
        this.profInst_ = profInst_;
    }

    public Boolean getRegisterStudent() {
        return registerStudent;
    }

    public void setRegisterStudent(Boolean registerStudent) {
        this.registerStudent = registerStudent;
    }

    public String getAllowedPlanningStart() {
        return allowedPlanningStart;
    }

    public void setAllowedPlanningStart(String allowedPlanningStart) {
        this.allowedPlanningStart = allowedPlanningStart;
    }

    public Boolean getRdvIndivRegistered() {
        return rdvIndivRegistered;
    }

    public void setRdvIndivRegistered(Boolean rdvIndivRegistered) {
        this.rdvIndivRegistered = rdvIndivRegistered;
    }

    public Boolean getRdvGroupRegistered() {
        return rdvGroupRegistered;
    }

    public void setRdvGroupRegistered(Boolean rdvGroupRegistered) {
        this.rdvGroupRegistered = rdvGroupRegistered;
    }

    public Boolean getProject() {
        return project;
    }

    public void setProject(Boolean project) {
        this.project = project;
    }

    public Boolean getModuleAvailable() {
        return moduleAvailable;
    }

    public void setModuleAvailable(Boolean moduleAvailable) {
        this.moduleAvailable = moduleAvailable;
    }

    public String getTitlemodule() {
        return titlemodule;
    }

    public void setTitlemodule(String titlemodule) {
        this.titlemodule = titlemodule;
    }

    public String getTypeTitle() {
        return typeTitle;
    }

    public void setTypeTitle(String typeTitle) {
        this.typeTitle = typeTitle;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public String getNbGroup() {
        return nbGroup;
    }

    public void setNbGroup(String nbGroup) {
        this.nbGroup = nbGroup;
    }

    public String getNumEvent() {
        return numEvent;
    }

    public void setNumEvent(String numEvent) {
        this.numEvent = numEvent;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public String getAllowedPlanningEnd() {
        return allowedPlanningEnd;
    }

    public void setAllowedPlanningEnd(String allowedPlanningEnd) {
        this.allowedPlanningEnd = allowedPlanningEnd;
    }

    public String getScolaryear() {
        return scolaryear;
    }

    public void setScolaryear(String scolaryear) {
        this.scolaryear = scolaryear;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getCodeevent() {
        return codeevent;
    }

    public void setCodeevent(String codeevent) {
        this.codeevent = codeevent;
    }

    public Boolean getInMoreThanOneMonth() {
        return inMoreThanOneMonth;
    }

    public void setInMoreThanOneMonth(Boolean inMoreThanOneMonth) {
        this.inMoreThanOneMonth = inMoreThanOneMonth;
    }

    public String getNbHours() {
        return nbHours;
    }

    public void setNbHours(String nbHours) {
        this.nbHours = nbHours;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getDates() {
        return dates;
    }

    public void setDates(String dates) {
        this.dates = dates;
    }

    public String getNbMaxStudentsProjet() {
        return nbMaxStudentsProjet;
    }

    public void setNbMaxStudentsProjet(String nbMaxStudentsProjet) {
        this.nbMaxStudentsProjet = nbMaxStudentsProjet;
    }

    public String getIsRdv() {
        return isRdv;
    }

    public void setIsRdv(String isRdv) {
        this.isRdv = isRdv;
    }

    public String getInstanceLocation() {
        return instanceLocation;
    }

    public void setInstanceLocation(String instanceLocation) {
        this.instanceLocation = instanceLocation;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getEventRegistered() {
        return eventRegistered;
    }

    public void setEventRegistered(Boolean eventRegistered) {
        this.eventRegistered = eventRegistered;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public Boolean getPast() {
        return past;
    }

    public void setPast(Boolean past) {
        this.past = past;
    }

    public String getTotalStudentsRegistered() {
        return totalStudentsRegistered;
    }

    public void setTotalStudentsRegistered(String totalStudentsRegistered) {
        this.totalStudentsRegistered = totalStudentsRegistered;
    }
}

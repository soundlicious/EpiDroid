package exposi_p.epidroid.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Emilie on 31/01/2016.
 */
public class Activites {
    @SerializedName("codeacti")
    private String codeacti;
    @SerializedName("call_ihk")
    private String callIhk;
    @SerializedName("slug")
    private String slug;
    @SerializedName("instance_location")
    private String instanceLocation;
    @SerializedName("module_title")
    private String moduleTitle;
    @SerializedName("title")
    private String title;
    @SerializedName("description")
    private String description;
    @SerializedName("type_title")
    private String typeTitle;
    @SerializedName("type_code")
    private String typeCode;
    @SerializedName("begin")
    private String begin;
    @SerializedName("start")
    private String start;
    @SerializedName("end_register")
    private String endRegister;
    @SerializedName("deadline")
    private String deadline;
    @SerializedName("end")
    private String end;
    @SerializedName("nb_hours")
    private String nbHours;
    @SerializedName("nb_group")
    private String nbGroup;
    @SerializedName("num")
    private String num;
    @SerializedName("register")
    private String register;
    @SerializedName("register_by_bloc")
    private String registerByBloc;
    @SerializedName("register_prof")
    private String RegisterProf;
    @SerializedName("title_location_type")
    private String titleLocationType;
    @SerializedName("is_projet")
    private Boolean isProjet;
    @SerializedName("id_projet")
    private String idProjet;
    @SerializedName("project_title")
    private String projectTitle;
    @SerializedName("is_note")
    private Boolean isNote;
    @SerializedName("nb_notes")
    private String nbNotes;
    @SerializedName("is_blocins")
    private Boolean isBlocins;
    @SerializedName("rdv_status")
    private String rdvStatus;
    @SerializedName("id_bareme")
    private String idBareme;
    @SerializedName("title_bareme")
    private String titleBareme;
    @SerializedName("archive")
    private String archive;
    @SerializedName("hash_elearning")
    private String hashElearning;
    @SerializedName("ged_node_adm")
    private String gedNoteAdmin;
    @SerializedName("nb_planified")
    private String nbPlanified;
    @SerializedName("note")
    private String note;
    @SerializedName("project")
    private String project;
    @SerializedName("events")
    private String events;

    public String getCodeacti() {
        return codeacti;
    }

    public void setCodeacti(String codeacti) {
        this.codeacti = codeacti;
    }

    public String getCallIhk() {
        return callIhk;
    }

    public void setCallIhk(String callIhk) {
        this.callIhk = callIhk;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getInstanceLocation() {
        return instanceLocation;
    }

    public void setInstanceLocation(String instanceLocation) {
        this.instanceLocation = instanceLocation;
    }

    public String getModuleTitle() {
        return moduleTitle;
    }

    public void setModuleTitle(String moduleTitle) {
        this.moduleTitle = moduleTitle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getBegin() {
        return begin;
    }

    public void setBegin(String begin) {
        this.begin = begin;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEndRegister() {
        return endRegister;
    }

    public void setEndRegister(String endRegister) {
        this.endRegister = endRegister;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getNbHours() {
        return nbHours;
    }

    public void setNbHours(String nbHours) {
        this.nbHours = nbHours;
    }

    public String getNbGroup() {
        return nbGroup;
    }

    public void setNbGroup(String nbGroup) {
        this.nbGroup = nbGroup;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getRegister() {
        return register;
    }

    public void setRegister(String register) {
        this.register = register;
    }

    public String getRegisterByBloc() {
        return registerByBloc;
    }

    public void setRegisterByBloc(String registerByBloc) {
        this.registerByBloc = registerByBloc;
    }

    public String getRegisterProf() {
        return RegisterProf;
    }

    public void setRegisterProf(String registerProf) {
        RegisterProf = registerProf;
    }

    public String getTitleLocationType() {
        return titleLocationType;
    }

    public void setTitleLocationType(String titleLocationType) {
        this.titleLocationType = titleLocationType;
    }

    public Boolean getIsProjet() {
        return isProjet;
    }

    public void setIsProjet(Boolean isProjet) {
        this.isProjet = isProjet;
    }

    public String getIdProjet() {
        return idProjet;
    }

    public void setIdProjet(String idProjet) {
        this.idProjet = idProjet;
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }

    public Boolean getIsNote() {
        return isNote;
    }

    public void setIsNote(Boolean isNote) {
        this.isNote = isNote;
    }

    public String getNbNotes() {
        return nbNotes;
    }

    public void setNbNotes(String nbNotes) {
        this.nbNotes = nbNotes;
    }

    public Boolean getIsBlocins() {
        return isBlocins;
    }

    public void setIsBlocins(Boolean isBlocins) {
        this.isBlocins = isBlocins;
    }

    public String getRdvStatus() {
        return rdvStatus;
    }

    public void setRdvStatus(String rdvStatus) {
        this.rdvStatus = rdvStatus;
    }

    public String getIdBareme() {
        return idBareme;
    }

    public void setIdBareme(String idBareme) {
        this.idBareme = idBareme;
    }

    public String getTitleBareme() {
        return titleBareme;
    }

    public void setTitleBareme(String titleBareme) {
        this.titleBareme = titleBareme;
    }

    public String getArchive() {
        return archive;
    }

    public void setArchive(String archive) {
        this.archive = archive;
    }

    public String getHashElearning() {
        return hashElearning;
    }

    public void setHashElearning(String hashElearning) {
        this.hashElearning = hashElearning;
    }

    public String getGedNoteAdmin() {
        return gedNoteAdmin;
    }

    public void setGedNoteAdmin(String gedNoteAdmin) {
        this.gedNoteAdmin = gedNoteAdmin;
    }

    public String getNbPlanified() {
        return nbPlanified;
    }

    public void setNbPlanified(String nbPlanified) {
        this.nbPlanified = nbPlanified;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getEvents() {
        return events;
    }

    public void setEvents(String events) {
        this.events = events;
    }
}

package exposi_p.epidroid.models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by sound on 28/01/16.
 */
public class Projet {
    @SerializedName("acti_title")
    private String actiTitle;
    @SerializedName("begin_acti")
    private String beginActi;
    @SerializedName("begin_event")
    private String beginEvent;
    @SerializedName("code_location")
    private String codeLocation;
    @SerializedName("codeacti")
    private String codeacti;
    @SerializedName("codeinstance")
    private String codeinstance;
    @SerializedName("codemodule")
    private String codemodule;
    @SerializedName("end_acti")
    private Date endActi;
    @SerializedName("end_event")
    private String endEvent;
    @SerializedName("info_creneau")
    private Object infoCreneau;
    @SerializedName("num")
    private String num;
    @SerializedName("num_event")
    private String numEvent;
    @SerializedName("projet")
    private Object project;
    @SerializedName("registered")
    private Integer registered;
    @SerializedName("rights")
    private List<String> rights = new ArrayList<String>();
    @SerializedName("scolaryear")
    private String scolaryear;
    @SerializedName("seats")
    private Object seats;
    @SerializedName("title_module")
    private String titleModule;
    @SerializedName("type_acti")
    private String typeActi;
    @SerializedName("type_acti_code")
    private String typeActiCode;

    /**
     *
     * @return
     *     The actiTitle
     */
    public String getActiTitle() {
        return actiTitle;
    }

    /**
     *
     * @param actiTitle
     *     The acti_title
     */
    public void setActiTitle(String actiTitle) {
        this.actiTitle = actiTitle;
    }

    /**
     *
     * @return
     *     The beginActi
     */
    public String getBeginActi() {
        return beginActi;
    }

    /**
     *
     * @param beginActi
     *     The begin_acti
     */
    public void setBeginActi(String beginActi) {
        this.beginActi = beginActi;
    }

    /**
     *
     * @return
     *     The beginEvent
     */
    public String getBeginEvent() {
        return beginEvent;
    }

    /**
     *
     * @param beginEvent
     *     The begin_event
     */
    public void setBeginEvent(String beginEvent) {
        this.beginEvent = beginEvent;
    }

    /**
     *
     * @return
     *     The codeLocation
     */
    public String getCodeLocation() {
        return codeLocation;
    }

    /**
     *
     * @param codeLocation
     *     The code_location
     */
    public void setCodeLocation(String codeLocation) {
        this.codeLocation = codeLocation;
    }

    /**
     *
     * @return
     *     The codeacti
     */
    public String getCodeacti() {
        return codeacti;
    }

    /**
     *
     * @param codeacti
     *     The codeacti
     */
    public void setCodeacti(String codeacti) {
        this.codeacti = codeacti;
    }

    /**
     *
     * @return
     *     The codeinstance
     */
    public String getCodeinstance() {
        return codeinstance;
    }

    /**
     *
     * @param codeinstance
     *     The codeinstance
     */
    public void setCodeinstance(String codeinstance) {
        this.codeinstance = codeinstance;
    }

    /**
     *
     * @return
     *     The codemodule
     */
    public String getCodemodule() {
        return codemodule;
    }

    /**
     *
     * @param codemodule
     *     The codemodule
     */
    public void setCodemodule(String codemodule) {
        this.codemodule = codemodule;
    }

    /**
     *
     * @return
     *     The endActi
     */
    public Date getEndActi() {
        return endActi;
    }

    /**
     *
     * @param endActi
     *     The end_acti
     */
    public void setEndActi(Date endActi) {
        this.endActi = endActi;
    }

    /**
     *
     * @return
     *     The endEvent
     */
    public String getEndEvent() {
        return endEvent;
    }

    /**
     *
     * @param endEvent
     *     The end_event
     */
    public void setEndEvent(String endEvent) {
        this.endEvent = endEvent;
    }

    /**
     *
     * @return
     *     The infoCreneau
     */
    public Object getInfoCreneau() {
        return infoCreneau;
    }

    /**
     *
     * @param infoCreneau
     *     The info_creneau
     */
    public void setInfoCreneau(Object infoCreneau) {
        this.infoCreneau = infoCreneau;
    }

    /**
     *
     * @return
     *     The num
     */
    public String getNum() {
        return num;
    }

    /**
     *
     * @param num
     *     The num
     */
    public void setNum(String num) {
        this.num = num;
    }

    /**
     *
     * @return
     *     The numEvent
     */
    public String getNumEvent() {
        return numEvent;
    }

    /**
     *
     * @param numEvent
     *     The num_event
     */
    public void setNumEvent(String numEvent) {
        this.numEvent = numEvent;
    }

    /**
     *
     * @return
     *     The project
     */
    public Object getProject() {
        return project;
    }

    /**
     *
     * @param project
     *     The project
     */
    public void setProject(Object project) {
        this.project = project;
    }

    /**
     *
     * @return
     *     The registered
     */
    public Integer getRegistered() {
        return registered;
    }

    /**
     *
     * @param registered
     *     The registered
     */
    public void setRegistered(Integer registered) {
        this.registered = registered;
    }

    /**
     *
     * @return
     *     The rights
     */
    public List<String> getRights() {
        return rights;
    }

    /**
     *
     * @param rights
     *     The rights
     */
    public void setRights(List<String> rights) {
        this.rights = rights;
    }

    /**
     *
     * @return
     *     The scolaryear
     */
    public String getScolaryear() {
        return scolaryear;
    }

    /**
     *
     * @param scolaryear
     *     The scolaryear
     */
    public void setScolaryear(String scolaryear) {
        this.scolaryear = scolaryear;
    }

    /**
     *
     * @return
     *     The seats
     */
    public Object getSeats() {
        return seats;
    }

    /**
     *
     * @param seats
     *     The seats
     */
    public void setSeats(Object seats) {
        this.seats = seats;
    }

    /**
     *
     * @return
     *     The titleModule
     */
    public String getTitleModule() {
        return titleModule;
    }

    /**
     *
     * @param titleModule
     *     The title_module
     */
    public void setTitleModule(String titleModule) {
        this.titleModule = titleModule;
    }

    /**
     *
     * @return
     *     The typeActi
     */
    public String getTypeActi() {
        return typeActi;
    }

    /**
     *
     * @param typeActi
     *     The type_acti
     */
    public void setTypeActi(String typeActi) {
        this.typeActi = typeActi;
    }

    /**
     *
     * @return
     *     The typeActiCode
     */
    public String getTypeActiCode() {
        return typeActiCode;
    }

    /**
     *
     * @param typeActiCode
     *     The type_acti_code
     */
    public void setTypeActiCode(String typeActiCode) {
        this.typeActiCode = typeActiCode;
    }

}

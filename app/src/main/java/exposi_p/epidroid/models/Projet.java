package exposi_p.epidroid.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Emilie on 30/01/2016.
 */
public class Projet {
    @SerializedName("title")
    private String title;
    @SerializedName("title_link")
    private String titleLink;
    @SerializedName("timeline_start")
    private String timelineStart;
    @SerializedName("timeline_end")
    private String timelineEnd;
    @SerializedName("timeline_barre")
    private String timelineBarre;
    @SerializedName("date_inscription")
    private String dateInscription;
    @SerializedName("id_activite")
    private String idActivite;
    @SerializedName("soutenance_name")
    private Boolean soutenanceName;
    @SerializedName("soutenance_link")
    private Boolean soutenanceLink;
    @SerializedName("soutenance_date")
    private Boolean soutenanceDate;
    @SerializedName("soutenance_salle")
    private Boolean soutenanceSalle;

    /**
     *
     * @return
     *     The title
     */

    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     *     The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return
     *     The titleLink
     */
    public String getTitleLink() {
        return titleLink;
    }

    /**
     *
     * @param titleLink
     *     The titleLink
     */
    public void setTitleLink(String titleLink) {
        this.titleLink = titleLink;
    }

    /**
     *
     * @return
     *     The timelineStart
     */
    public String getTimelineStart() {
        return timelineStart;
    }

    /**
     *
     * @param timelineStart
     *     The timelineStart
     */
    public void setTimelineStart(String timelineStart) {
        this.timelineStart = timelineStart;
    }

    /**
     *
     * @return
     *     The timelineEnd
     */
    public String getTimelineEnd() {
        return timelineEnd;
    }

    /**
     *
     * @param timelineEnd
     *     The timelineEnd
     */
    public void setTimelineEnd(String timelineEnd) {
        this.timelineEnd = timelineEnd;
    }

    /**
     *
     * @return
     *     The timelineBarre
     */
    public String getTimelineBarre() {
        return timelineBarre;
    }

    /**
     *
     * @param timelineBarre
     *     The timelineBarre
     */
    public void setTimelineBarre(String timelineBarre) {
        this.timelineBarre = timelineBarre;
    }

    /**
     *
     * @return
     *     The dateInscription
     */
    public String getDateInscription() {
        return dateInscription;
    }

    /**
     *
     * @param dateInscription
     *     The dateInscription
     */
    public void setDateInscription(String dateInscription) {
        this.dateInscription = dateInscription;
    }

    /**
     *
     * @return
     *     The idActivite
     */
    public String getIdActivite() {
        return idActivite;
    }

    /**
     *
     * @param idActivite
     *     The idActivite
     */
    public void setIdActivite(String idActivite) {
        this.idActivite = idActivite;
    }

    /**
     *
     * @return
     *     The soutenanceName
     */
    public Boolean getSoutenanceName() {
        return soutenanceName;
    }

    /**
     *
     * @param soutenanceName
     *     The soutenanceName
     */
    public void setSoutenanceName(Boolean soutenanceName) {
        this.soutenanceName = soutenanceName;
    }

    /**
     *
     * @return
     *     The soutenanceLink
     */
    public Boolean getSoutenanceLink() {
        return soutenanceLink;
    }

    /**
     *
     * @param soutenanceLink
     *     The soutenanceLink
     */
    public void setSoutenanceLink(Boolean soutenanceLink) {
        this.soutenanceLink = soutenanceLink;
    }

    /**
     *
     * @return
     *     The soutenanceDate
     */
    public Boolean getSoutenanceDate() {
        return soutenanceDate;
    }

    /**
     *
     * @param soutenanceDate
     *     The soutenanceDate
     */
    public void setSoutenanceDate(Boolean soutenanceDate) {
        this.soutenanceDate = soutenanceDate;
    }

    /**
     *
     * @return
     *     The soutenanceSalle
     */
    public Boolean getSoutenanceSalle() {
        return soutenanceSalle;
    }

    /**
     *
     * @param soutenanceSalle
     *     The soutenanceSalle
     */
    public void setSoutenanceSalle(Boolean soutenanceSalle) {
        this.soutenanceSalle = soutenanceSalle;
    }
}


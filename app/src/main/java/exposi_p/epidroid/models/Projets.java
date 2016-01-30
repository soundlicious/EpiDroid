package exposi_p.epidroid.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Emilie on 30/01/2016.
 */
public class Projets {
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitleLink() {
        return titleLink;
    }

    public void setTitleLink(String titleLink) {
        this.titleLink = titleLink;
    }

    public String getTimelineStart() {
        return timelineStart;
    }

    public void setTimelineStart(String timelineStart) {
        this.timelineStart = timelineStart;
    }

    public String getTimelineEnd() {
        return timelineEnd;
    }

    public void setTimelineEnd(String timelineEnd) {
        this.timelineEnd = timelineEnd;
    }

    public String getTimelineBarre() {
        return timelineBarre;
    }

    public void setTimelineBarre(String timelineBarre) {
        this.timelineBarre = timelineBarre;
    }

    public String getDateInscription() {
        return dateInscription;
    }

    public void setDateInscription(String dateInscription) {
        this.dateInscription = dateInscription;
    }

    public String getIdActivite() {
        return idActivite;
    }

    public void setIdActivite(String idActivite) {
        this.idActivite = idActivite;
    }

    public Boolean getSoutenanceName() {
        return soutenanceName;
    }

    public void setSoutenanceName(Boolean soutenanceName) {
        this.soutenanceName = soutenanceName;
    }

    public Boolean getSoutenanceLink() {
        return soutenanceLink;
    }

    public void setSoutenanceLink(Boolean soutenanceLink) {
        this.soutenanceLink = soutenanceLink;
    }

    public Boolean getSoutenanceDate() {
        return soutenanceDate;
    }

    public void setSoutenanceDate(Boolean soutenanceDate) {
        this.soutenanceDate = soutenanceDate;
    }

    public Boolean getSoutenanceSalle() {
        return soutenanceSalle;
    }

    public void setSoutenanceSalle(Boolean soutenanceSalle) {
        this.soutenanceSalle = soutenanceSalle;
    }
}


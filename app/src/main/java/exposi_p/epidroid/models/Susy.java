package exposi_p.epidroid.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by sound on 28/01/16.
 */
public class Susy {
    @SerializedName("title")
    private String title;
    @SerializedName("creneau_link")
    private String creneauLink;
    @SerializedName("timeline_start")
    private String timelineStart;
    @SerializedName("timeline_barre")
    private Boolean timelineBarre;
    @SerializedName("timeline_end")
    private Boolean timelineEnd;
    @SerializedName("salle")
    private Boolean salle;
    @SerializedName("intervenant")
    private Boolean intervenant;
    @SerializedName("etat")
    private String etat;
    @SerializedName("type")
    private Boolean type;

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
     * @return The creneauLink
     */
    public String getCreneauLink() {
        return creneauLink;
    }

    /**
     * @param creneauLink The creneau_link
     */
    public void setCreneauLink(String creneauLink) {
        this.creneauLink = creneauLink;
    }

    /**
     * @return The timelineStart
     */
    public String getTimelineStart() {
        return timelineStart;
    }

    /**
     * @param timelineStart The timeline_start
     */
    public void setTimelineStart(String timelineStart) {
        this.timelineStart = timelineStart;
    }

    /**
     * @return The timelineBarre
     */
    public Boolean getTimelineBarre() {
        return timelineBarre;
    }

    /**
     * @param timelineBarre The timeline_barre
     */
    public void setTimelineBarre(Boolean timelineBarre) {
        this.timelineBarre = timelineBarre;
    }

    /**
     * @return The timelineEnd
     */
    public Boolean getTimelineEnd() {
        return timelineEnd;
    }

    /**
     * @param timelineEnd The timeline_end
     */
    public void setTimelineEnd(Boolean timelineEnd) {
        this.timelineEnd = timelineEnd;
    }

    /**
     * @return The salle
     */
    public Boolean getSalle() {
        return salle;
    }

    /**
     * @param salle The salle
     */
    public void setSalle(Boolean salle) {
        this.salle = salle;
    }

    /**
     * @return The intervenant
     */
    public Boolean getIntervenant() {
        return intervenant;
    }

    /**
     * @param intervenant The intervenant
     */
    public void setIntervenant(Boolean intervenant) {
        this.intervenant = intervenant;
    }

    /**
     * @return The etat
     */
    public String getEtat() {
        return etat;
    }

    /**
     * @param etat The etat
     */
    public void setEtat(String etat) {
        this.etat = etat;
    }

    /**
     * @return The type
     */
    public Boolean getType() {
        return type;
    }

    /**
     * @param type The type
     */
    public void setType(Boolean type) {
        this.type = type;
    }
}

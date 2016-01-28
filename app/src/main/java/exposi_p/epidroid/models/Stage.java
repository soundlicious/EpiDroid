package exposi_p.epidroid.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by sound on 28/01/16.
 */
public class Stage {
    @SerializedName("company")
    private String company;
    @SerializedName("link")
    private String link;
    @SerializedName("timeline_start")
    private String timelineStart;
    @SerializedName("timeline_end")
    private String timelineEnd;
    @SerializedName("timeline_barre")
    private String timelineBarre;
    @SerializedName("can_note")
    private Boolean canNote;
    @SerializedName("company_can_note")
    private Boolean companyCanNote;
    @SerializedName("status")
    private String status;
    @SerializedName("mandatory")
    private Boolean mandatory;

    /**
     * @return The company
     */
    public String getCompany() {
        return company;
    }

    /**
     * @param company The company
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * @return The link
     */
    public String getLink() {
        return link;
    }

    /**
     * @param link The link
     */
    public void setLink(String link) {
        this.link = link;
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
     * @return The timelineEnd
     */
    public String getTimelineEnd() {
        return timelineEnd;
    }

    /**
     * @param timelineEnd The timeline_end
     */
    public void setTimelineEnd(String timelineEnd) {
        this.timelineEnd = timelineEnd;
    }

    /**
     * @return The timelineBarre
     */
    public String getTimelineBarre() {
        return timelineBarre;
    }

    /**
     * @param timelineBarre The timeline_barre
     */
    public void setTimelineBarre(String timelineBarre) {
        this.timelineBarre = timelineBarre;
    }

    /**
     * @return The canNote
     */
    public Boolean getCanNote() {
        return canNote;
    }

    /**
     * @param canNote The can_note
     */
    public void setCanNote(Boolean canNote) {
        this.canNote = canNote;
    }

    /**
     * @return The companyCanNote
     */
    public Boolean getCompanyCanNote() {
        return companyCanNote;
    }

    /**
     * @param companyCanNote The company_can_note
     */
    public void setCompanyCanNote(Boolean companyCanNote) {
        this.companyCanNote = companyCanNote;
    }

    /**
     * @return The status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return The mandatory
     */
    public Boolean getMandatory() {
        return mandatory;
    }

    /**
     * @param mandatory The mandatory
     */
    public void setMandatory(Boolean mandatory) {
        this.mandatory = mandatory;
    }
}

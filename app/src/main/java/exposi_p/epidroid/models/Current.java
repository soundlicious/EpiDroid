package exposi_p.epidroid.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by sound on 28/01/16.
 */
public class Current {
    @SerializedName("active_log")
    private String activeLog;
    @SerializedName("credits_min")
    private String creditsMin;
    @SerializedName("credits_norm")
    private String creditsNorm;
    @SerializedName("credits_obj")
    private String creditsObj;
    @SerializedName("nslog_min")
    private String nslogMin;
    @SerializedName("nslog_norm")
    private String nslogNorm;
    @SerializedName("semester_code")
    private String semesterCode;
    @SerializedName("semester_num")
    private String semesterNum;
    @SerializedName("achieved")
    private Integer achieved;
    @SerializedName("failed")
    private Integer failed;
    @SerializedName("inprogress")
    private Integer inprogress;

    /**
     * @return The activeLog
     */
    public String getActiveLog() {
        return activeLog;
    }

    /**
     * @param activeLog The active_log
     */
    public void setActiveLog(String activeLog) {
        this.activeLog = activeLog;
    }

    /**
     * @return The creditsMin
     */
    public String getCreditsMin() {
        return creditsMin;
    }

    /**
     * @param creditsMin The credits_min
     */
    public void setCreditsMin(String creditsMin) {
        this.creditsMin = creditsMin;
    }

    /**
     * @return The creditsNorm
     */
    public String getCreditsNorm() {
        return creditsNorm;
    }

    /**
     * @param creditsNorm The credits_norm
     */
    public void setCreditsNorm(String creditsNorm) {
        this.creditsNorm = creditsNorm;
    }

    /**
     * @return The creditsObj
     */
    public String getCreditsObj() {
        return creditsObj;
    }

    /**
     * @param creditsObj The credits_obj
     */
    public void setCreditsObj(String creditsObj) {
        this.creditsObj = creditsObj;
    }

    /**
     * @return The nslogMin
     */
    public String getNslogMin() {
        return nslogMin;
    }

    /**
     * @param nslogMin The nslog_min
     */
    public void setNslogMin(String nslogMin) {
        this.nslogMin = nslogMin;
    }

    /**
     * @return The nslogNorm
     */
    public String getNslogNorm() {
        return nslogNorm;
    }

    /**
     * @param nslogNorm The nslog_norm
     */
    public void setNslogNorm(String nslogNorm) {
        this.nslogNorm = nslogNorm;
    }

    /**
     * @return The semesterCode
     */
    public String getSemesterCode() {
        return semesterCode;
    }

    /**
     * @param semesterCode The semester_code
     */
    public void setSemesterCode(String semesterCode) {
        this.semesterCode = semesterCode;
    }

    /**
     * @return The semesterNum
     */
    public String getSemesterNum() {
        return semesterNum;
    }

    /**
     * @param semesterNum The semester_num
     */
    public void setSemesterNum(String semesterNum) {
        this.semesterNum = semesterNum;
    }

    /**
     * @return The achieved
     */
    public Integer getAchieved() {
        return achieved;
    }

    /**
     * @param achieved The achieved
     */
    public void setAchieved(Integer achieved) {
        this.achieved = achieved;
    }

    /**
     * @return The failed
     */
    public Integer getFailed() {
        return failed;
    }

    /**
     * @param failed The failed
     */
    public void setFailed(Integer failed) {
        this.failed = failed;
    }

    /**column
     * @return The inprogress
     */
    public Integer getInprogress() {
        return inprogress;
    }

    /**
     * @param inprogress The inprogress
     */
    public void setInprogress(Integer inprogress) {
        this.inprogress = inprogress;
    }
}

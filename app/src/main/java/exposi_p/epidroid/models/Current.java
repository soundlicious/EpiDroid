package exposi_p.epidroid.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by sound on 28/01/16.
 */
public class Current {
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
    @SerializedName("credits")
    private String credits;
    @SerializedName("grade")
    private String grade;
    @SerializedName("cycle")
    private String cycle;
    @SerializedName("code_module")
    private String codeModule;
    @SerializedName("current_cycle")
    private String currentCycle;
    @SerializedName("semester_code")
    private String semesterCode;
    @SerializedName("semester_num")
    private String semesterNum;
    @SerializedName("active_log")
    private String activeLog;
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
     *
     * @return The credits
     */

    public String getCredits() {
        return credits;
    }

    /**
     *
     * @param credits The credits
     */

    public void setCredits(String credits) {
        this.credits = credits;
    }

    /**
     *
     * @return The grade
     */

    public String getGrade() {
        return grade;
    }

    /**
     *
     * @param grade The grade
     */

    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     *
     * @return The cycle
     */

    public String getCycle() {
        return cycle;
    }

    /**
     *
     * @param cycle The cycle
     */

    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

    /**
     *
     * @return The code_module
     */

    public String getCodeModule() {
        return codeModule;
    }

    /**
     *
     * @param codeModule The code_module
     */

    public void setCodeModule(String codeModule) {
        this.codeModule = codeModule;
    }

    /**
     *
     * @return The current_cycle
     */

    public String getCurrentCycle() {
        return currentCycle;
    }

    /**
     *
     * @param currentCycle The current_cycle
     */

    public void setCurrentCycle(String currentCycle) {
        this.currentCycle = currentCycle;
    }
}

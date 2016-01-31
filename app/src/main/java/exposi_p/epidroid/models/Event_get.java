package exposi_p.epidroid.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Platy on 31/01/2016.
 */
public class Event_get {
    @SerializedName("scolaryear")
    private String scolaryear;
    @SerializedName("codemodule")
    private String codemodule;
    @SerializedName("codeinstance")
    private String codeinstance;
    @SerializedName("codeacti")
    private String codeacti;
    @SerializedName("codeevent")
    private String codeevent;
    @SerializedName("semestre")
    private Integer semestre;
    @SerializedName("instance_location")
    private String instance_location;
    @SerializedName("module_title")
    private String module_title;
    @SerializedName("acti_title")
    private String acti_title;
    @SerializedName("acti_description")
    private String acti_description;
    @SerializedName("type_title")
    private String type_title;
    @SerializedName("type_code")
    private String type_code;
    @SerializedName("allowed_planning_start")
    private String allowed_planning_start;
    @SerializedName("allowed_planning_end")
    private String allowed_planning_end;
    @SerializedName("nb_hours")
    private String nb_hours;
    @SerializedName("nb_group")
    private Integer nb_group;
    @SerializedName("has_exam_subject")
    private Boolean has_exam_subject;
    @SerializedName("begin")
    private String begin;
    @SerializedName("start")
    private String start;
    @SerializedName("end")
    private String end;
    @SerializedName("num_event")
    private Integer num_event;
    @SerializedName("title")
    private String title;
    @SerializedName("description")
    private String description;
    @SerializedName("nb_registered")
    private Integer nb_registered;
    @SerializedName("id_dir")
    private String id_dir;
    @SerializedName("room")
    private Room room;
    @SerializedName("seats")
    private String seats;
    @SerializedName("desc_webservice")
    private String desc_webservice;
    @SerializedName("name_bocal")
    private String name_bocal;
}

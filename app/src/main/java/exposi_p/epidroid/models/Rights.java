package exposi_p.epidroid.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by sound on 28/01/16.
 */
public class Rights {
    @SerializedName("ged_read")
    private Integer ged_read;
    @SerializedName("ged_write")
    private Integer ged_write;

    public Integer getGed_read() {
        return ged_read;
    }

    public void setGed_read(Integer ged_read) {
        this.ged_read = ged_read;
    }

    public Integer getGed_write() {
        return ged_write;
    }

    public void setGed_write(Integer ged_write) {
        this.ged_write = ged_write;
    }
}

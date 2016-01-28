package exposi_p.epidroid.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sound on 28/01/16.
 */
public class InfosPost {
    @SerializedName("ip")
    private String ip;
    @SerializedName("board")
    private Board board;
    @SerializedName("history")
    private List<History> history = new ArrayList<History>();
    @SerializedName("infos")
    private Infos infos;
    @SerializedName("current")
    private List<Current> current = new ArrayList<Current>();

    /**
     * @return The ip
     */
    public String getIp() {
        return ip;
    }

    /**
     * @param ip The ip
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * @return The board
     */
    public Board getBoard() {
        return board;
    }

    /**
     * @param board The board
     */
    public void setBoard(Board board) {
        this.board = board;
    }

    /**
     * @return The history
     */
    public List<History> getHistory() {
        return history;
    }

    /**
     * @param history The history
     */
    public void setHistory(List<History> history) {
        this.history = history;
    }

    /**
     * @return The infos
     */
    public Infos getInfos() {
        return infos;
    }

    /**
     * @param infos The infos
     */
    public void setInfos(Infos infos) {
        this.infos = infos;
    }

    /**
     * @return The current
     */
    public List<Current> getCurrent() {
        return current;
    }

    /**
     * @param current The current
     */
    public void setCurrent(List<Current> current) {
        this.current = current;
    }
}

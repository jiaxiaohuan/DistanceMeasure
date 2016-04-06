package net.sxkeji.xddistance;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "PICTURE_INFO".
 */
public class PictureInfo {

    private Long id;
    /** Not-null value. */
    private String path;
    /** Not-null value. */
    private String distance;
    /** Not-null value. */
    private String time;
    private String tips;

    public PictureInfo() {
    }

    public PictureInfo(Long id) {
        this.id = id;
    }

    public PictureInfo(Long id, String path, String distance, String time, String tips) {
        this.id = id;
        this.path = path;
        this.distance = distance;
        this.time = time;
        this.tips = tips;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /** Not-null value. */
    public String getPath() {
        return path;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setPath(String path) {
        this.path = path;
    }

    /** Not-null value. */
    public String getDistance() {
        return distance;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setDistance(String distance) {
        this.distance = distance;
    }

    /** Not-null value. */
    public String getTime() {
        return time;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setTime(String time) {
        this.time = time;
    }

    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips;
    }

}
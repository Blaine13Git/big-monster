package com.muyi.bigMonster.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class LiveVideoAttribute implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_video_attribute.id
     *
     * @mbg.generated Fri May 22 19:26:03 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_video_attribute.account_id
     *
     * @mbg.generated Fri May 22 19:26:03 CST 2020
     */
    private Integer accountId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_video_attribute.fps
     *
     * @mbg.generated Fri May 22 19:26:03 CST 2020
     */
    private Integer fps;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_video_attribute.bitrate
     *
     * @mbg.generated Fri May 22 19:26:03 CST 2020
     */
    private Integer bitrate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_video_attribute.gop
     *
     * @mbg.generated Fri May 22 19:26:03 CST 2020
     */
    private Integer gop;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_video_attribute.quality
     *
     * @mbg.generated Fri May 22 19:26:03 CST 2020
     */
    private Integer quality;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_video_attribute.create_time
     *
     * @mbg.generated Fri May 22 19:26:03 CST 2020
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_video_attribute.update_time
     *
     * @mbg.generated Fri May 22 19:26:03 CST 2020
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table live_video_attribute
     *
     * @mbg.generated Fri May 22 19:26:03 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_video_attribute.id
     *
     * @return the value of live_video_attribute.id
     *
     * @mbg.generated Fri May 22 19:26:03 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live_video_attribute
     *
     * @mbg.generated Fri May 22 19:26:03 CST 2020
     */
    public LiveVideoAttribute withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_video_attribute.id
     *
     * @param id the value for live_video_attribute.id
     *
     * @mbg.generated Fri May 22 19:26:03 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_video_attribute.account_id
     *
     * @return the value of live_video_attribute.account_id
     *
     * @mbg.generated Fri May 22 19:26:03 CST 2020
     */
    public Integer getAccountId() {
        return accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live_video_attribute
     *
     * @mbg.generated Fri May 22 19:26:03 CST 2020
     */
    public LiveVideoAttribute withAccountId(Integer accountId) {
        this.setAccountId(accountId);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_video_attribute.account_id
     *
     * @param accountId the value for live_video_attribute.account_id
     *
     * @mbg.generated Fri May 22 19:26:03 CST 2020
     */
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_video_attribute.fps
     *
     * @return the value of live_video_attribute.fps
     *
     * @mbg.generated Fri May 22 19:26:03 CST 2020
     */
    public Integer getFps() {
        return fps;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live_video_attribute
     *
     * @mbg.generated Fri May 22 19:26:03 CST 2020
     */
    public LiveVideoAttribute withFps(Integer fps) {
        this.setFps(fps);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_video_attribute.fps
     *
     * @param fps the value for live_video_attribute.fps
     *
     * @mbg.generated Fri May 22 19:26:03 CST 2020
     */
    public void setFps(Integer fps) {
        this.fps = fps;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_video_attribute.bitrate
     *
     * @return the value of live_video_attribute.bitrate
     *
     * @mbg.generated Fri May 22 19:26:03 CST 2020
     */
    public Integer getBitrate() {
        return bitrate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live_video_attribute
     *
     * @mbg.generated Fri May 22 19:26:03 CST 2020
     */
    public LiveVideoAttribute withBitrate(Integer bitrate) {
        this.setBitrate(bitrate);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_video_attribute.bitrate
     *
     * @param bitrate the value for live_video_attribute.bitrate
     *
     * @mbg.generated Fri May 22 19:26:03 CST 2020
     */
    public void setBitrate(Integer bitrate) {
        this.bitrate = bitrate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_video_attribute.gop
     *
     * @return the value of live_video_attribute.gop
     *
     * @mbg.generated Fri May 22 19:26:03 CST 2020
     */
    public Integer getGop() {
        return gop;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live_video_attribute
     *
     * @mbg.generated Fri May 22 19:26:03 CST 2020
     */
    public LiveVideoAttribute withGop(Integer gop) {
        this.setGop(gop);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_video_attribute.gop
     *
     * @param gop the value for live_video_attribute.gop
     *
     * @mbg.generated Fri May 22 19:26:03 CST 2020
     */
    public void setGop(Integer gop) {
        this.gop = gop;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_video_attribute.quality
     *
     * @return the value of live_video_attribute.quality
     *
     * @mbg.generated Fri May 22 19:26:03 CST 2020
     */
    public Integer getQuality() {
        return quality;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live_video_attribute
     *
     * @mbg.generated Fri May 22 19:26:03 CST 2020
     */
    public LiveVideoAttribute withQuality(Integer quality) {
        this.setQuality(quality);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_video_attribute.quality
     *
     * @param quality the value for live_video_attribute.quality
     *
     * @mbg.generated Fri May 22 19:26:03 CST 2020
     */
    public void setQuality(Integer quality) {
        this.quality = quality;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_video_attribute.create_time
     *
     * @return the value of live_video_attribute.create_time
     *
     * @mbg.generated Fri May 22 19:26:03 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live_video_attribute
     *
     * @mbg.generated Fri May 22 19:26:03 CST 2020
     */
    public LiveVideoAttribute withCreateTime(Date createTime) {
        this.setCreateTime(createTime);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_video_attribute.create_time
     *
     * @param createTime the value for live_video_attribute.create_time
     *
     * @mbg.generated Fri May 22 19:26:03 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_video_attribute.update_time
     *
     * @return the value of live_video_attribute.update_time
     *
     * @mbg.generated Fri May 22 19:26:03 CST 2020
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live_video_attribute
     *
     * @mbg.generated Fri May 22 19:26:03 CST 2020
     */
    public LiveVideoAttribute withUpdateTime(Date updateTime) {
        this.setUpdateTime(updateTime);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_video_attribute.update_time
     *
     * @param updateTime the value for live_video_attribute.update_time
     *
     * @mbg.generated Fri May 22 19:26:03 CST 2020
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live_video_attribute
     *
     * @mbg.generated Fri May 22 19:26:03 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", accountId=").append(accountId);
        sb.append(", fps=").append(fps);
        sb.append(", bitrate=").append(bitrate);
        sb.append(", gop=").append(gop);
        sb.append(", quality=").append(quality);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}

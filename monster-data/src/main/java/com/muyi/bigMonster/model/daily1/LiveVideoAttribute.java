package com.muyi.bigMonster.model.daily1;

import java.io.Serializable;
import java.util.Date;

public class LiveVideoAttribute implements Serializable {
    private Integer id;

    private Integer accountId;

    private Integer fps;

    private Integer bitrate;

    private Integer gop;

    private Integer quality;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public LiveVideoAttribute withId(Integer id) {
        this.setId(id);
        return this;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public LiveVideoAttribute withAccountId(Integer accountId) {
        this.setAccountId(accountId);
        return this;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getFps() {
        return fps;
    }

    public LiveVideoAttribute withFps(Integer fps) {
        this.setFps(fps);
        return this;
    }

    public void setFps(Integer fps) {
        this.fps = fps;
    }

    public Integer getBitrate() {
        return bitrate;
    }

    public LiveVideoAttribute withBitrate(Integer bitrate) {
        this.setBitrate(bitrate);
        return this;
    }

    public void setBitrate(Integer bitrate) {
        this.bitrate = bitrate;
    }

    public Integer getGop() {
        return gop;
    }

    public LiveVideoAttribute withGop(Integer gop) {
        this.setGop(gop);
        return this;
    }

    public void setGop(Integer gop) {
        this.gop = gop;
    }

    public Integer getQuality() {
        return quality;
    }

    public LiveVideoAttribute withQuality(Integer quality) {
        this.setQuality(quality);
        return this;
    }

    public void setQuality(Integer quality) {
        this.quality = quality;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public LiveVideoAttribute withCreateTime(Date createTime) {
        this.setCreateTime(createTime);
        return this;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public LiveVideoAttribute withUpdateTime(Date updateTime) {
        this.setUpdateTime(updateTime);
        return this;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

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
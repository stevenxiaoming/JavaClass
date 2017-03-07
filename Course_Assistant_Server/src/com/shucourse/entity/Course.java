/**
 * @Title: Class.java
 * @Package: com.shuclass.entity
 * @Description: TODO
 * @author Steven Ming
 * @date 2017-2-16 下午12:06:30
 * @version V1.0
 */
package com.shucourse.entity;

import java.io.Serializable;

/**
 * @author Steven Ming
 * @datetime 2017-2-16 下午12:06:30
 */
public class Course implements Serializable {
    private static final long serialVersionUID = 1L;
    private String cId;      // 课程号[8位数字]
    private String cName;    // 课程名
    private Double cCredit;  // 学分[0-n的浮点数，有0.5分的情况]
    private String tId;      // 教师号[4位数字]
    private String tName;    // 教师名
    private String cTime;    // 上课时间[体育的上课时间需要处理]
    private String cLocation;// 上课地点
    private Integer cSize;   // 容量
    private Integer cNumber; // 人数
    private String cCampus;  // 校区
    private String cLimit;   // 选课限制
    private String qaTime;   // 答疑时间
    private String qaLocation;// 答疑地点
    
    public Course() {}
    
    @Override
    public String toString() {
        return "Course [cId=" + cId + ", cName=" + cName + ", cCredit="
                + cCredit + ", tId=" + tId + ", tName=" + tName + ", cTime="
                + cTime + ", cLocation=" + cLocation + ", cSize=" + cSize
                + ", cNumber=" + cNumber + ", cCampus=" + cCampus + ", cLimit="
                + cLimit + ", qaTime=" + qaTime + ", qaLocation=" + qaLocation
                + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cCampus == null) ? 0 : cCampus.hashCode());
        result = prime * result + ((cCredit == null) ? 0 : cCredit.hashCode());
        result = prime * result + ((cId == null) ? 0 : cId.hashCode());
        result = prime * result + ((cLimit == null) ? 0 : cLimit.hashCode());
        result = prime * result
                + ((cLocation == null) ? 0 : cLocation.hashCode());
        result = prime * result + ((cName == null) ? 0 : cName.hashCode());
        result = prime * result + ((cNumber == null) ? 0 : cNumber.hashCode());
        result = prime * result + ((cSize == null) ? 0 : cSize.hashCode());
        result = prime * result + ((cTime == null) ? 0 : cTime.hashCode());
        result = prime * result
                + ((qaLocation == null) ? 0 : qaLocation.hashCode());
        result = prime * result + ((qaTime == null) ? 0 : qaTime.hashCode());
        result = prime * result + ((tId == null) ? 0 : tId.hashCode());
        result = prime * result + ((tName == null) ? 0 : tName.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Course other = (Course) obj;
        if (cCampus == null) {
            if (other.cCampus != null)
                return false;
        } else if (!cCampus.equals(other.cCampus))
            return false;
        if (cCredit == null) {
            if (other.cCredit != null)
                return false;
        } else if (!cCredit.equals(other.cCredit))
            return false;
        if (cId == null) {
            if (other.cId != null)
                return false;
        } else if (!cId.equals(other.cId))
            return false;
        if (cLimit == null) {
            if (other.cLimit != null)
                return false;
        } else if (!cLimit.equals(other.cLimit))
            return false;
        if (cLocation == null) {
            if (other.cLocation != null)
                return false;
        } else if (!cLocation.equals(other.cLocation))
            return false;
        if (cName == null) {
            if (other.cName != null)
                return false;
        } else if (!cName.equals(other.cName))
            return false;
        if (cNumber == null) {
            if (other.cNumber != null)
                return false;
        } else if (!cNumber.equals(other.cNumber))
            return false;
        if (cSize == null) {
            if (other.cSize != null)
                return false;
        } else if (!cSize.equals(other.cSize))
            return false;
        if (cTime == null) {
            if (other.cTime != null)
                return false;
        } else if (!cTime.equals(other.cTime))
            return false;
        if (qaLocation == null) {
            if (other.qaLocation != null)
                return false;
        } else if (!qaLocation.equals(other.qaLocation))
            return false;
        if (qaTime == null) {
            if (other.qaTime != null)
                return false;
        } else if (!qaTime.equals(other.qaTime))
            return false;
        if (tId == null) {
            if (other.tId != null)
                return false;
        } else if (!tId.equals(other.tId))
            return false;
        if (tName == null) {
            if (other.tName != null)
                return false;
        } else if (!tName.equals(other.tName))
            return false;
        return true;
    }

    public String getcId() {
        return cId;
    }
    public void setcId(String cId) {
        this.cId = cId;
    }
    public String getcName() {
        return cName;
    }
    public void setcName(String cName) {
        this.cName = cName;
    }
    public Double getcCredit() {
        return cCredit;
    }
    public void setcCredit(Double cCredit) {
        this.cCredit = cCredit;
    }

    public String gettId() {
        return tId;
    }
    public void settId(String tId) {
        this.tId = tId;
    }
    public String gettName() {
        return tName;
    }
    public void settName(String tName) {
        this.tName = tName;
    }
    public String getcTime() {
        return cTime;
    }
    public void setcTime(String cTime) {
        this.cTime = cTime;
    }
    public String getcLocation() {
        return cLocation;
    }
    public void setcLocation(String cLocation) {
        this.cLocation = cLocation;
    }
    public Integer getcSize() {
        return cSize;
    }
    public void setcSize(Integer cSize) {
        this.cSize = cSize;
    }
    public Integer getcNumber() {
        return cNumber;
    }
    public void setcNumber(Integer cNumber) {
        this.cNumber = cNumber;
    }
    public String getcCampus() {
        return cCampus;
    }
    public void setcCampus(String cCampus) {
        this.cCampus = cCampus;
    }
    public String getcLimit() {
        return cLimit;
    }
    public void setcLimit(String cLimit) {
        this.cLimit = cLimit;
    }
    public String getQaTime() {
        return qaTime;
    }
    public void setQaTime(String qaTime) {
        this.qaTime = qaTime;
    }
    public String getQaLocation() {
        return qaLocation;
    }
    public void setQaLocation(String qaLocation) {
        this.qaLocation = qaLocation;
    }
    
}

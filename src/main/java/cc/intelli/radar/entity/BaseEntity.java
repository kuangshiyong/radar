package cc.intelli.radar.entity;

import java.util.Calendar;
import java.util.Date;

/**
 * @author guaguagua-mac
 */
abstract class BaseEntity {

    private Date insertTime =
            new Date(Calendar.getInstance().getTime().getTime());

    BaseEntity() {
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
}

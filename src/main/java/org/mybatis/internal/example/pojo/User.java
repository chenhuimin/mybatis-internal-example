package org.mybatis.internal.example.pojo;

/**
 * Created by selina on 2018/4/3.
 */
public class User {
    private Integer lfPartyId;
    private String partyName;

    public Integer getLfPartyId() {
        return lfPartyId;
    }

    public void setLfPartyId(Integer lfPartyId) {
        this.lfPartyId = lfPartyId;
    }

    public String getPartyName() {
        return partyName;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }
}

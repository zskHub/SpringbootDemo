package priv.zsk.second.entity;

/**
 * @author:zsk
 * @CreateTime:2018-11-28 14:18
 */
public class UserAddressEntity {
    private int id;
    private Integer userId;
    private String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
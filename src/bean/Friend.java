package bean;

public class Friend {
    private int id;
    private String name;
    private String location;
    private String phoneNum;

    public Friend(String name, String location, String phoneNum) {
        this.name = name;
        this.location = location;
        this.phoneNum = phoneNum;
    }


    public Friend(int id, String name, String location, String phoneNum) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.phoneNum = phoneNum;
    }

    public Friend(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}

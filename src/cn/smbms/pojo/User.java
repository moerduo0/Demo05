package cn.smbms.pojo;

public class User {
    private Integer dogId;
    private String dogname;
    private String dogpwd ;
    private Integer dogAge;

    public User() {
    }

    public User(Integer dogId, String dogname, String dogpwd, Integer dogAge) {
        this.dogId = dogId;
        this.dogname = dogname;
        this.dogpwd = dogpwd;
        this.dogAge = dogAge;
    }

    public Integer getDogId() {
        return dogId;
    }

    public void setDogId(Integer dogId) {
        this.dogId = dogId;
    }

    public String getDogname() {
        return dogname;
    }

    public void setDogname(String dogname) {
        this.dogname = dogname;
    }

    public String getDogpwd() {
        return dogpwd;
    }

    public void setDogpwd(String dogpwd) {
        this.dogpwd = dogpwd;
    }

    public Integer getDogAge() {
        return dogAge;
    }

    public void setDogAge(Integer dogAge) {
        this.dogAge = dogAge;
    }

    @Override
    public String toString() {
        return "User{" +
                "dogId=" + dogId +
                ", dogname='" + dogname + '\'' +
                ", dogpwd='" + dogpwd + '\'' +
                ", dogAge=" + dogAge +
                '}';
    }
}


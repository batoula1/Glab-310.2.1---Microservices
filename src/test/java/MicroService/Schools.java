package MicroService;


import java.util.UUID;

public class Schools {
    private UUID id;
    private String schoolname;
    private String address;

    public Schools(UUID id, String schoolname, String address) {
        this.id = id;
        this.schoolname = schoolname;
        this.address = address;
    }

    public UUID getId() {
        return id;
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Schools{" +
                "id=" + id +
                ", schoolname='" + schoolname + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
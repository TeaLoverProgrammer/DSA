import java.util.List;

public class Bucket {
    private double address;
    private String key;
    private Integer value;

    //if there is a collision then the bucket neeeds to saved in here.
    private List<Bucket> bucket;

    public double getAddress() {
        return address;
    }

    public void setAddress(Double address) {
        this.address = address;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}

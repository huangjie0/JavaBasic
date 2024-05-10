package HuangpuClassExaminationPaperOne;
/**
 * 囚犯对象
 * */

public class Convict {
    private int code;    //囚犯编号
    private int location;    //囚犯位置

    public Convict(int code, int location) {
        this.code = code;
        this.location = location;
    }

    public Convict() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Convict{" +
                "code=" + code +
                ", location=" + location +
                '}';
    }
}

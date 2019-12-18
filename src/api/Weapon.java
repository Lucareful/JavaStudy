package api;

/**
 * @author Luenci
 * @version 1.0
 * @date 2019/12/18 18:15
 * @info 类作为成员变量
 */
public class Weapon {
    private String code;

    public Weapon() {
    }

    public Weapon(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

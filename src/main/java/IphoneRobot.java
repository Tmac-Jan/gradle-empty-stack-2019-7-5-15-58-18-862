/**
 * @title: IphoneRobot
 * @projectName: gradle-empty-stack-2019-7-5-15-58-18-862
 * @description: TODO
 * @author: macmanboy@foxmail.com(Gio Zhang)
 * @date: 2019/7/12 22:57
 */
public class IphoneRobot {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Iphone getIphone() {
        return iphone;
    }

    public void setIphone(Iphone iphone) {
        this.iphone = iphone;
    }

    private String name;
    private Iphone iphone;

    public void printMessage(String message) {
        iphone.printMessage(message);
    }
}

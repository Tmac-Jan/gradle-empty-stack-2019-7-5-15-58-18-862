/**
 * @title: Person
 * @projectName: gradle-empty-stack-2019-7-5-15-58-18-862
 * @description: TODO
 * @author: macmanboy@foxmail.com(Gio Zhang)
 * @date: 2019/7/12 22:59
 */
public class Person {

    private Mobile mobile;
    public Person(){}

    public Mobile getMobile() {
        return mobile;
    }

    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }

    public Person(Mobile mobile) {
        this.mobile = mobile;
    }

    public  void printMessage(String message){
        mobile.printMessage(message);
    }
}

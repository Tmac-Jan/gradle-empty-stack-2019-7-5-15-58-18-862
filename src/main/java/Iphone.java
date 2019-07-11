public class Iphone extends Mobile {
   public Iphone(){}

  public Iphone(String name, String color, String brand) {
    super(name, color, brand);
  }
  @Override
  public void printMessage(String message) {
    super.printMessage("<iPhone>Message : ["+message+"]");
  }
}

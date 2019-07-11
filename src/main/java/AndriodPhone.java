public class AndriodPhone extends Mobile {

  public AndriodPhone(){}

  public AndriodPhone(String name, String color, String brand) {
    super(name, color, brand);
  }

  @Override
  public void printMessage(String message) {
    System.out.println("<Andriod>Message : ["+message+"]");
  }
}

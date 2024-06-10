//extending base barbie class and creating a personalized barbie class
class My_Barbie extends Barbie {
  private String house;
  private double rich;

  //creating constructor - passing in variables
  public My_Barbie(String name, String hairStyle, String clothing, String shoes, String house, double rich){
    super(name, hairStyle, clothing, shoes);
    this.house = house;
    this.rich = rich;
  }

  //returning house
  public String house() {
    return house;
  }

  //setting house
  public void setHouse(String house) {
    this.house = house;
  }

  //returning rich var
  public double getRich() {
    return rich;
  }

  //setting rich va
  public void setRich(double rich) {
    this.rich = rich;
  }

///returning barbie info - name, hair, clothing, shoes, house, and rich (money var)
@Override
public String toString() {
return "Barbie " + super.getName() + " has " + super.getHairStyle() + " hair and is wearing a " + super.getClothing() + ", with " + super.getShoes() + " shoes. She lives in a " + house + ". She has $" + rich + " in her bank account.";
  }


}
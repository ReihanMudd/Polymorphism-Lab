//Barbie class
class Barbie {

  //creating private variables
  private String name;
  private String hairStyle;
  private String clothing;
  private String shoes;

  //constructor - passing in values
  public Barbie(String name, String hairStyle, String clothing, String shoes) {
    //setting values
    this.name = name;
    this.hairStyle = hairStyle;
    this.clothing = clothing;
    this.shoes = shoes;
  }

  //returning name
  public String getName() {
    return name;
  }

  //setting name
  public void setName() {
    this.name = name;
  }

  //returning hairstyle
  public String getHairStyle() {
    return hairStyle;
  }

  //setting hairstyle
  public void setHairStyle() {
    this.hairStyle = hairStyle;
  }

  //returning clothing
  public String getClothing() {
    return clothing;
  }

  //setting clothing
  public void setClothing() {
    this.clothing = clothing;
  }

  //returning shoes
  public String getShoes() {
    return shoes;
  }

  //setting shoes
  public void setShoes() {
    this.shoes = shoes;
  }

  //returning barbie info - name, hair, clothing, shoes
  public String toString() {
    return "Barbie " + name + " has " + hairStyle + " hair and is wearing " + clothing + " with " + shoes + " shoes.";
  }
}
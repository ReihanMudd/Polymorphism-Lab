//extending barbie class to beach barbie
class Beach_Barbie extends Barbie {
  private String hat;
  private String sunglasses;

  //constructing beach barbie class with variables
  public Beach_Barbie(String name, String hairStyle, String clothing, String shoes, String hat, String sunglasses) {
    //passing in variables to parent class
    super(name, hairStyle, clothing, shoes);

    //setting values
    this.hat = hat;
    this.sunglasses = sunglasses;
  }

  //returning hat
  public String getHat() {
    return hat;
  }

  //setting hat
  public void setHat(String hat) {
    this.hat = hat;
  }

  //returning value of sunglasses
  public String getSunglasses() {
    return sunglasses;
  }

  //setting value of sunglasses
  public void setSunglasses(String sunglasses) {
    this.sunglasses = sunglasses;
  }

  //overriding base class print method - returning name, hair, hat, clothing, shoes, and sunglasses
  @Override
  public String toString() {
    return "Barbie " + super.getName() + " has " + super.getHairStyle() + " hair and is wearing a " +  hat + " hat, a " + super.getClothing() + ", with " + super.getShoes() + " shoes and " + sunglasses + " sunglasses.";
  }
}
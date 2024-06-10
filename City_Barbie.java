//extending barbie class to city barbie
class City_Barbie extends Barbie {
  private String job;

  //creating constructor with variables
  public City_Barbie(String name, String hairStyle, String clothing, String shoes, String job) {
    //passing values to parent class
    super(name, hairStyle, clothing, shoes);
    //setting values to private variable
    this.job = job;
  } 

  //returning job
  public String getJob() {
    return job;
  }

  //setting job value
  public void setJob(String job) {
    this.job = job;
  }

  //overriding parent class method - returning name, hair, clothing, shoes, job
  @Override
  public String toString() {
    return "Barbie " + super.getName() + " has " + super.getHairStyle() + " hair and is wearing a " + super.getClothing() + ", with " + super.getShoes() + " shoes. She works as a " + job + " job.";
  }
}
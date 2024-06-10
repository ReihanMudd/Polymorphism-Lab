public class Main {
    public static void main(String[] args) {
        // Create a regular Barbie instance
        Barbie regularBarbie = new Barbie("Rachel", "straight blonde", "pink dress", "high heeled");
        System.out.println(regularBarbie);
        System.out.println();

        // Create a Beach_Barbie instance
        Beach_Barbie beachBarbie = new Beach_Barbie("Mariposa", "curly blonde", "pink bathing suit", "sandal", "bucket", "Gucci");
        System.out.println(beachBarbie);
        System.out.println();

        // Create a City_Barbie instance
        City_Barbie cityBarbie = new City_Barbie("Midge", "wavy brunette", "checkered pink suit", "dress", "fashion designer");
        System.out.println(cityBarbie);
        System.out.println();

        // Create a My_Barbie instance
        My_Barbie myBarbie = new My_Barbie("Chelsea", "red", "jeans and t-shirt", "sneakers", "dream house", 1000000.0);
        System.out.println(myBarbie);
    }
}
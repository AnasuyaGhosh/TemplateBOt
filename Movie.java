public class Movie {
    // Instance Variables
    String name;
    String blurb;
    int year;
    String age;

    // Constructor Declaration of Class
    public Movie (String name, String blurb, String age, int year) {
        this.name = name;
        this.year = year;
        this.blurb = blurb;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public String getBlurb()  {
        return blurb;
    }
    public String getAge() {
        return age;
    }
    public int getYear() {
        return year;
    }
    
}

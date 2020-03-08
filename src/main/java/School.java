public class School {
    private String name;
    private String city;

    public School() {
    }

    public School(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

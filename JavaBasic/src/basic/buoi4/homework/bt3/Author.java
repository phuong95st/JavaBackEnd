package basic.buoi4.homework.bt3;

public class Author {
    private String name;
    private String email;
    private char gender;

    // constuctor
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // getter, setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    // method
    public String toString(){
        return String.format("Author[name=%s,email=%s,gender=%s]",this.name, this.email, this.gender);
    }
}

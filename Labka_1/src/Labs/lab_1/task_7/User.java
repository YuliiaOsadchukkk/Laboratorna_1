package Labs.lab_1.task_7;

public class User {

    private String firstName;
    private String lastName;
    private int age;
    private String email;

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public User(final String firstName, final String lastName, final int age, final String email) {
        this.age = age;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;
        return age == user.age && firstName == user.firstName && lastName == user. lastName;
    }

    @Override
    public int hashCode() {
        return  31 * this.getFirstName().hashCode() + 31 * this.getLastName().hashCode() + 31 * this.getAge();
    }

}

package Labs.lab_1.task_11;

public class Driver {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public Driver(final String firstName, final String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final Driver driver = (Driver) o;
        return firstName == driver.firstName && lastName == driver.lastName;
    }

    @Override
    public int hashCode() {
        return  31 * this.getFirstName().hashCode() + 31 * this.getLastName().hashCode();
    }

    @Override
    public String toString() {
        return this.getFirstName() + this.getLastName();
    }

}


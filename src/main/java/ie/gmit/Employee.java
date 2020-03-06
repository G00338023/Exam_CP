package ie.gmit;

public class Employee {
    String Title;
    String Name;
    String PPS;
    int PhoneNumber;
    String EmploymentType;
    int Age;
    String length;

    public Employee(String title, String name, String PPS, int phoneNumber, String employmentType, int age) {
        Title = title;
        Name = name;
        this.PPS = PPS;
        PhoneNumber = phoneNumber;
        EmploymentType = employmentType;
        Age = age;

        if (title == "") {
            throw new IllegalArgumentException("Missing title");
        } else if (name == "") {
            throw new IllegalArgumentException("Missing/Invalid name");
        } else if (PPS == "") {
            throw new IllegalArgumentException("Missing PPS");
        } else if (phoneNumber.length() > 7) {
            throw new IllegalArgumentException("Invalid phoneNumber");
        }
        else if (employmentType == "") {
            throw new IllegalArgumentException("Invalid employmentType error");
        }
        else if (age <= 18) {
            throw new IllegalArgumentException("Age must be over 18");
        }
    }

    public String getTitle() {
        return Title;
    }

    public String getName() {
        return Name;
    }

    public String getPPS() {
        return PPS;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public String getEmploymentType() {
        return EmploymentType;
    }

    public int getAge() {
        return Age;
    }
}


//phoneNumber.length <=6 || phoneNumber.Length >=8 )
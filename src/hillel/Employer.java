package hillel;

public class Employer {
    private String fullName;
    private String jobTitle;
    private String mail;
    private String telephoneNumber;
    private int age;

    public Employer(String fullName, String jobTitle, String mail, String telephoneNumber, int age) {
        this.fullName = fullName;
        this.jobTitle = jobTitle;
        this.mail = mail;
        this.telephoneNumber = telephoneNumber;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employer{" +
                "fullName='" + fullName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", mail='" + mail + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ", age=" + age +
                '}';
    }
}


public class User {
    private int id;
    private String name;
    private String surname;
    private String nickname;
    private byte age;
    public String mobile;
    private String email;
    private String password;
    byte chekAge = 0;

    public User(String name, String surname, String nickname, byte age, String mobile, String email, String password) {
    }
    public User(String nickname, String password){
    }

    public User(String mobile){
    }
    public User(){
    }

    public String getName() { //геттер для имени
        return name;
    }

    public void setName(String name) { //сеттер для имени
        this.name = name;
    }

    public String getSurname() { //геттер для фамилии
        return surname;
    }

    public void setSurname(String surname) { //сеттер для фамилии
        this.surname = surname;
    }

    public String getNick() { //геттер для ника
        return nickname;
    }

    public void setNick(String nickname) { //сеттер для ника
        this.nickname = nickname;
    }

    public int getAge() { //геттер для возраста
        return age;
    }

    public void setAge(byte age) { //сеттер для возраста
        if (age >= 16) {
            this.age = age;
        } else {
            this.age = (byte) (16 - age);
            switch (this.age){
                case(1):
                    System.out.println("Ошибка! Возраст не подходит. Побробуйте через " + this.age + " год.");
                    System.exit(0);
                case(2):
                case(3):
                case(4):
                    System.out.println("Ошибка! Возраст не подходит. Побробуйте через " + this.age + " года.");
                    System.exit(0);
                default:
                    System.out.println("Ошибка! Возраст не подходит. Побробуйте через " + this.age + " лет.");
                    System.exit(0);
            }
        }
    }

    public String getMobile() { //геттер для номера
        return mobile;
    }

    public void setMobile(String mobile) { //сеттер для номера
        this.mobile = mobile;
    }

    public String getEmail() { //геттер для емэйла
        return email;
    }

    public void setEmail(String email) { //сеттер для емэйла
        this.email = email;
    }

    public String getPassword() { //геттер для пароля
        return password;
    }

    public void setPassword(String password) { //сеттер для пароля
        this.password = password;
    }

    public int getId() { //геттер для id
        return id;
    }

    public void setId(int id) { //сеттер для id
        this.id = id;
    }

    public String toString() {
        return "User [id=" + id + ", Nickname=" + nickname
                + ", Name=" + name + ", Surname=" + surname
                + ", Age=" + age + ", Mobile=" + mobile
                + ", Email=" + email + ", Password=" + password + "]";
    }
}


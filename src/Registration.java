import java.io.IOException;
import java.util.Scanner;

public class Registration {

    public static void reg() throws IOException {
        int yes = 1;
        int no = 0;
        int answer = 2;
        String txtAnswer;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Вы уже зарегистрированы? ");
            System.out.println("Ответьте 1, если ваш ответ Да;");
            System.out.print("Ответьте 0, если ваш ответ Нет: ");
            answer = Integer.parseInt(sc.nextLine());
            //switch (txtAnswer){
                //ase ("Да"):
                    //answer = 1;
               // case ("Нет"):
                  //  answer = 0;
           // }
            if (answer == yes) {
                System.out.print("Введите ник: ");
                Messeng.nick = sc.nextLine();
                //System.out.print("Введите пароль: ");
                //String password = sc.nextLine();
                //User user = new User(Messeng.nick, password);
                //user.setNick(Messeng.nick);
                //String usernickname = user.getNick();
                Messeng.NICKNAME();
                break;
            }
            else if (answer == no) {
                System.out.print("Введите имя: ");
                String name = sc.nextLine();
                System.out.print("Введите фамилию: ");
                String surname = sc.nextLine();
                System.out.print("Введите ник: ");
                Messeng.nick = sc.nextLine();
                byte age;
                while (true) {
                    System.out.print("Введите возраст: ");
                    try {
                        age = Byte.parseByte(sc.nextLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.print("Ошибка! ");
                    }
                }
                while (true) {
                    System.out.print("Введите номер: ");
                    Mobile.mobile = sc.nextLine();
                    Mobile.standartMob();
                    if (Mobile.mobile.length() == 11) {
                        break;
                    } else {
                        System.out.print("Ошибка! ");
                    }
                }
                System.out.print("Введите email: ");
                String email = sc.nextLine();
                System.out.print("Введите пароль: ");
                String password = sc.nextLine();
                User user = new User(name, surname, Messeng.nick, age, Mobile.mobile, email, password);

                user.setAge(age);
                int userage = user.getAge();

                user.setName(name);
                String username = user.getName();

                user.setSurname(surname);
                String usersurname = user.getSurname();

                user.setNick(Messeng.nick);
                String usernickname = user.getNick();
                Messeng.NICKNAME();

                user.setMobile(Mobile.mobile);
                String usermobile = user.getMobile();

                user.setEmail(email);
                String useremail = user.getEmail();

                user.setPassword(password);
                String userpassword = user.getPassword();

                user.setId(ID.ID());
                int userid = user.getId();

                Main m = new Main();
                Main.user = user.toString();
                Database.txtSaveFile(Database.users, Main.user);

                System.out.println(Main.user);
                break;
            } else {
                System.out.println("Попробуйте ещё раз.");
            }
        }
    }
}



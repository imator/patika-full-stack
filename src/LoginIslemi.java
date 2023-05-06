import java.util.Scanner;

public class LoginIslemi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String USER_NAME = "Patika", enteredUserName;
        String userPassword = "Java", enteredUserPassword, newPassword;

        System.out.print("Kullanıcı Adı: ");
        enteredUserName = inp.nextLine();

        System.out.print("Kullanıcı Şifresi: ");
        enteredUserPassword = inp.nextLine();

        if ((USER_NAME.equals(enteredUserName)) && (userPassword.equals(enteredUserPassword))) {
            System.out.println("PATİKA SİSTEMİNE HOŞ GELDİNİZ...");
        }
        else{
            System.out.println("Girdiğiniz bilgileri kontrol ediniz...");
        }
        if ((USER_NAME.equals(enteredUserName)) && !userPassword.equals(enteredUserPassword)) {
            System.out.print("Şifrenizi Sıfırlanacak!\nLütfen yeni şifre giriniz:");
            newPassword = inp.nextLine();

            if (!newPassword.equals(userPassword) && !newPassword.equals(enteredUserPassword)) {
                System.out.println("Şifre oluşturuldu");
            } else {
                System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
            }
        }


    }
}

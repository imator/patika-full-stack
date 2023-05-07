import java.util.Scanner;

public class AtmProjesi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String USER_NAME = "Patika", PASSWORD = "java";
        String userName, password;
        int right = 3;

        int secim;
        int balance = 1500,cash;

        System.out.println("PATİKA BANK'A HOŞGELDİNİZ");
        do {
            //Kullanıcı adı ve şifrenin alınması
            System.out.print("Kullanıcı Adınız: ");
            userName = inp.nextLine();
            System.out.print("Kullanıcı Şifresi: ");
            password = inp.nextLine();

            if (userName.equals(USER_NAME) && password.equals(PASSWORD)) {
                do {
                    System.out.println(" ");
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz...");
                    System.out.println("1:Para Çekmek -- 2:Para Yatırmak -- 3:Bakiye Sorgula -- 4:Çıkış");
                    System.out.print("Seçim: ");
                    secim = inp.nextInt();

                    switch (secim) {
                        case 1:
                            System.out.print("Çekilecek Mitar: ");
                            cash = inp.nextInt();
                            if(balance>=cash){
                                balance = balance - cash;
                                System.out.println("Hesabınızdan " + cash +" TL Çekilmiştir" );
                            }
                            else {
                                System.out.println("Yetersiz Bakiye!!!");
                            }
                            break;
                        case 2:
                            System.out.print("Yatırılacak Tutar: ");
                            cash = inp.nextInt();
                            balance += cash;
                            System.out.println("Hesabınıza " + cash +" TL Yatırılmıştır" );
                            break;
                        case 3:
                            System.out.println("Hesabınızda " + balance +" TL Vardır" );
                            break;
                        case 4:
                            System.out.println("Çıkış Yapılıyor .....");
                            break;
                        default:
                            System.out.println("Geçersiz Seçim" );
                    }
                } while (secim != 4);
                System.out.println("Hoşçakalın.......");
                break;
            } else {
                right--;
                System.out.println("Kullanıcı Adı veya Şifre Hatalı !!! Kalan Hakkınız: " + right);
                System.out.println(" ");
            }
        } while (right != 0);
        if (right == 0 )  System.out.println("Hesabınıza Bloke Koyuldu.Lütfen Müşteri Temsilcisi ile İletişime Geçiniz...");
    }
}

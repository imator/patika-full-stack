public class AsalSayiBulma {
    public static void main(String[] args) {
        System.out.println("1-100 Arasındaki Asal Sayılar");
        int cnt=0;
        for (int i = 2; i <= 100; i++) {
            for (int j = 2; j <= i ; j++) {
                if(i%j==0) cnt++;
            }
            if(cnt==1) System.out.print(i + " ");
            cnt=0;
        }
    }

}

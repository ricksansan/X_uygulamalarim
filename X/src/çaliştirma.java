import java.util.Random;
import java.util.Scanner;

public class çaliştirma {
    void kayıtişlemleri() {
        System.out.println("                                                  " + "X");

        System.out.println("X'e üye misin\neğer kayıtlı iseniz 1'i değilseniz 2'yi tuşlayınız");
        Scanner inp = new Scanner(System.in);
        int x = inp.nextInt();
        String sifre = "islamcel", kullancıAdi = "1234567891";

        String ı, j;

        Random as = new Random();
        int v = as.nextInt(1000000);

        switch (x) {

            case 1:
                Scanner imo = new Scanner(System.in);

                int u = 0;
                for (u = 0; u < 2; u++) {
                    if (u == 0) {
                        System.out.println("kullanıcı adınızı giriniz:");
                    }
                    ı = imo.nextLine();
                    if (ı.equals(kullancıAdi)) {
                        System.out.println("şifrenizi giriniz");
                        j = imo.nextLine();
                        if (j.equals(sifre)) {
                            int n = as.nextInt(100000);
                            System.out.println("kodunuz:" + n);
                            System.out.println("telefona gelen şifreyi giriniz");
                            int t = imo.nextInt();
                            Scanner inu = new Scanner(System.in);
                            if (n == t) {
                                System.out.println("X'e başarıyla giriş yaptınız");
                                System.out.println("hey X'e hoşgeldin ne yapmak istersin?");

                                System.out.println("1-oyunlar\n2-banka işlemleri");
                                int e = inu.nextInt();
                                if (e == 1) {

                                    hızlıEğlencelikler z = new hızlıEğlencelikler();
                                    z.oyun();
                                } else if (e == 2) {
                                    Banka doyt = new Banka();
                                    doyt.banka();
                                } else
                                    System.out.println("yanlış değer tekrar giriniz");

                                u += 2;
                            }
                        } else {
                            System.out.println("yanlış kullanıcı adı veya şifre tekrar deneyiniz");
                            if (u == 1) {
                                Scanner amp = new Scanner(System.in);
                                System.out.println("deneme hakkınız bitmiştir başka giriş yöntemleri deneyiniz");
                                System.out.println("şifrenizi mi unuttunuz? başka giriş yollarrı denemek için 1'i tuşlayınız");
                                int ü = amp.nextInt();
                                if (ü == 1) {
                                    int ç = 0;

                                    while (ç < 1000) {
                                        Scanner ipo = new Scanner(System.in);
                                        System.out.println("telefonunuza gelen kodu giriniz");

                                        if (ç == 0) {
                                            System.out.println(v);
                                        }
                                        int p = ipo.nextInt();


                                        Scanner iğo = new Scanner(System.in);
                                        if (p == v) {
                                            String ğ;
                                            System.out.println("yeni şifrenizi giriniz");
                                            ğ = iğo.nextLine();

                                            int o = ğ.length();

                                            if (o < 10) {
                                                System.out.println("şifreniz en az 8 haneli olmalıdır tekrar deneyiniz");

                                            } else {
                                                sifre = ğ;
                                                System.out.println("sifreniz basarıyla yenilenmiştir");
                                                ç += 1000;

                                            }

                                        }
                                        ç++;

                                    }

                                }
                            }
                        }
                    }
                }


                break;
            case 2:
                Scanner iko = new Scanner(System.in);
                int a = 0;
                while (a < 1000) {
                    String y;
                    if (a == 0) {
                        System.out.println("X'e kaydınız başlatılıyor...");
                    }
                    System.out.println("lütfen kullanıcı adınızı giriniz");
                    y = iko.nextLine();
                    int lenght = y.length();
                    if (lenght < 8) {
                        System.out.println("Kullanıcı adınızı en az 8 haneli olmalı lütfen tekrar deneyiniz");
                        continue;
                    }
                    int b = 0;
                    while (b < 10) {
                        String z;
                        System.out.println("lütfen şifre giriniz");
                        z = iko.nextLine();
                        int leng2 = z.length();
                        if (leng2 < 10) {
                            System.out.println("şifreniz en az 8 haneli olmalıdır");

                        } else {
                            System.out.println("Artık bir X üyesisiniz tebrikler!");
                            System.out.println("giriş için anasayfaya yönlendiriliyorsunuz");
                            System.out.println("-----ANA SAYFA-----");
                            System.out.println("KULLANICI ADINIZI GİRİNİZ");

                            String l = iko.nextLine();
                            if (l.equals(y)) {
                                System.out.println("şifrenizi giriniz");
                                String q = iko.nextLine();
                                Scanner ito = new Scanner(System.in);
                                if (q.equals(z)) {
                                    System.out.println("X'e hoşgeldiniz");
                                    System.out.println("X'e başarıyla giriş yaptınız");
                                    System.out.println("hey X'e hoşgeldin ne yapmak istersin?");

                                    System.out.println("\n1-oyunlar\n2-banka işlemleri");
                                    int e = ito.nextInt();
                                    if (e == 1) {

                                        hızlıEğlencelikler d = new hızlıEğlencelikler();
                                        d.oyun();
                                    } else if (e == 2) {
                                        Banka doyt = new Banka();
                                        doyt.banka();
                                    } else
                                        System.out.println("yanlış değer tekrar giriniz");

                                } else {
                                    System.out.println("yanlış kullanıcı adı veya şifre lütfen tekrar deneyiniz");
                                }
                            }

                            b = b + 10;
                        }
                    }
                    a = a + 1000;
                    a++;
                }
                break;

            default:
                System.out.println("yanlış değer girdiniz");


        }

    }

}


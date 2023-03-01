import java.util.Random;
import java.util.Scanner;

public class hızlıEğlencelikler {

     void oyun() {
        Scanner ino = new Scanner(System.in);
        System.out.println("-----Hoş Geldiniz------");
        System.out.println("Ne oynamak istersiniz:" + "\n1-sayı tahmin oyunu\n2-Taş-kağıt-makas\n");
        int u = ino.nextInt();
        if (u == 1) {
            Random st = new Random();

            int number = (int) (Math.random() * 100);

            Scanner inp = new Scanner(System.in);
            int sayi = 0;
            boolean isWin = false;
            int[] wrong = new int[5];
            boolean isWrong = false;

            while (sayi < 5) {

                if (sayi == 0) {
                    System.out.println("bir sayı giriniz");
                }
                int x = inp.nextInt();
                if (x < 0 || x > 100) {
                    System.out.println("lütfen 1-100 arası değer giriniz");
                    if (isWrong) {
                        sayi++;
                        System.out.println("çok fazla hatalı giriş yaptınız kalan hakkınız:" + (5 - sayi));
                    } else {
                        isWrong = true;
                        System.out.println("bir dahakine hakkınızdan füşülür");
                    }
                    continue;
                }

                if (x == number) {


                isWin = true;


                } else if (x < number) {
                    System.out.println("girdiğiniz sayı değerden küçük lütfen arttırınız");
                } else {
                    System.out.println("girdiğiniz sayı değerden büyük lütfen azaltınız");
                }

                if (sayi == 3) {
                    System.out.println("son tahmin hakkınız dikkatli olunuz");
                }
                if (sayi == 4) {
                    System.out.println("tahmin hakkınız bitti");

                }
                sayi++;


            }
            if (!isWin) {
                System.out.println("kaybettiniz!");

                System.out.println("hey X'e hoşgeldin ne yapmak istersin?");
                   Scanner iğğ=new Scanner(System.in);
                System.out.println("\n1-oyunlar\n2-banka işlemleri");
                int e = iğğ.nextInt();
                if (e == 1) {

                    hızlıEğlencelikler iü = new hızlıEğlencelikler();
                    iü.oyun();
                } else if (e == 2) {
                    Banka doyt = new Banka();
                    doyt.banka();
                } else
                    System.out.println("yanlış değer tekrar giriniz");

            }


            }

           /* for (int arra : wrong) {
                System.out.println("sayı tahmin oyunu");
                System.out.println(arra);
            }*/
            //System.out.println(number);

         if (u == 2) {
            System.out.println("taş-kağıt-makas oyununa hoşgeldiniz");
            int c = 0;
            int a = 0, q = 0;
            while (c < 3) {
                int pc;
                Random sa = new Random();
                //int num=(int) (Math.random());
                pc = sa.nextInt(3) + 1;

                Scanner in = new Scanner(System.in);
                System.out.println("\n1-taş\n2-kağıt\n3-makas");
                int x = in.nextInt();
                if (x == pc) {

                }
                if (pc == 1 && x == 3) {

                    a++;
                }
                if (pc == 1 && x == 2) {

                    q++;
                }
                if (pc == 2 && x == 1) {
                    a++;
                }
                if (pc == 2 && x == 3) {

                    q++;
                }
                if (pc == 3 && x == 1) {

                    a++;
                }
                if (pc == 3 && x == 2) {

                    q++;
                }

                if (q == 2) {
                    System.out.println("kazandınız tebrikler");
                    Scanner inğ=new Scanner(System.in);
                    c += 3;
                    System.out.println("X'e başarıyla giriş yaptınız");
                    System.out.println("hey X'e hoşgeldin ne yapmak istersin?");

                    System.out.println("\n1-oyunlar\n2-banka işlemleri");
                    int e = inğ.nextInt();
                    if (e == 1) {

                        hızlıEğlencelikler d = new hızlıEğlencelikler();
                        d.oyun();
                    } else if (e == 2) {
                        Banka doyt = new Banka();
                        doyt.banka();
                    } else
                        System.out.println("yanlış değer tekrar giriniz");

                }
                }
                if (a == 2) {
                    System.out.println("kaybettiniz!");
                    c += 3;

                }

            }

        }

    }






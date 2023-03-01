import java.util.Scanner;

public class Banka {
    void banka() {
        int bakiye = 100000000;
        int z = 0;
        int pound = 23, usd = 19, euro = 21;
        while (z < 1000000) {
            System.out.println("yapmak istediğiniz işlem nedir seçiniz");
            System.out.println("1-para çekme\n2-para yatırma\n3-döviz işlemleri\n4-Bakiye sorgulama");

            Scanner inp = new Scanner(System.in);
            int x = inp.nextInt();
            switch (x) {
                case 1:
                    System.out.println("çekmek istediğiniz miktarı giriniz:");
                    int y = inp.nextInt();
                    if (y <= bakiye) {
                        bakiye -= y;
                        // System.out.println(bakiye);
                        System.out.println("hey X'e hoşgeldin ne yapmak istersin?");

                        System.out.println("1-oyunlar\n2-banka işlemleri");
                        int e = inp.nextInt();
                        if (e == 1) {

                            hızlıEğlencelikler zzx = new hızlıEğlencelikler();
                            zzx.oyun();
                        } else if (e == 2) {
                            Banka doyt = new Banka();
                            doyt.banka();
                        } else
                            System.out.println("yanlış değer tekrar giriniz");

                    } else {
                        System.out.println("bu kadar bakiyeniz bulunmamaktadır");
                        System.out.println("hey X'e hoşgeldin ne yapmak istersin?");

                        System.out.println("1-oyunlar\n2-banka işlemleri");
                        int zğ = inp.nextInt();
                        if (zğ == 1) {

                            hızlıEğlencelikler zzxa = new hızlıEğlencelikler();
                            zzxa.oyun();
                        } else if (zğ == 2) {
                            Banka doyt = new Banka();
                            doyt.banka();
                        } else
                            System.out.println("yanlış değer tekrar giriniz");
                    }
                    break;
                case 2:
                    System.out.println("yatırmak istediğiniz miktarı giriniz");
                    int w = inp.nextInt();
                    bakiye += w;
                    System.out.println("hey X'e hoşgeldin ne yapmak istersin?");

                    System.out.println("1-oyunlar\n2-banka işlemleri");
                    int zğ = inp.nextInt();
                    if (zğ == 1) {

                        hızlıEğlencelikler zzxa = new hızlıEğlencelikler();
                        zzxa.oyun();
                    } else if (zğ == 2) {
                        Banka doyt = new Banka();
                        doyt.banka();
                    } else
                        System.out.println("yanlış değer tekrar giriniz");


                    break;
                case 3:
                    Scanner illp = new Scanner(System.in);
                    System.out.println("hangi dövizleri almak istersiniz:" + "\n1-pound\n2-usd\n3-euro");

                    int epr = illp.nextInt();
                    if (epr == 1) {
                        System.out.println("kaç pound almak istiyorsunuz:");
                        int j = inp.nextInt();
                        System.out.println(pound + " liradan " + j + " kadar pound alırsanız şu kadar tutar " + (j * pound));
                        System.out.println("işlemi onaylıyorsanız 1'i tuşlayınız");
                        int o = illp.nextInt();
                        if (o == 1) {
                            System.out.println("isleminiz başarıyla gerçekleşmiştir");
                            bakiye -= (j * pound);
                            System.out.println("hey X'e hoşgeldin ne yapmak istersin?");

                            System.out.println("1-oyunlar\n2-banka işlemleri");
                            int e = inp.nextInt();
                            if (e == 1) {

                                hızlıEğlencelikler zw = new hızlıEğlencelikler();
                                zw.oyun();
                            } else if (e == 2) {
                                Banka doyt = new Banka();
                                doyt.banka();

                            } else
                                System.out.println("yanlış değer tekrar giriniz");
                            System.out.println("hey X'e hoşgeldin ne yapmak istersin?");

                            System.out.println("1-oyunlar\n2-banka işlemleri");
                            int ell = inp.nextInt();
                            if (ell == 1) {

                                hızlıEğlencelikler ztr = new hızlıEğlencelikler();
                                ztr.oyun();
                            } else if (ell == 2) {
                                Banka doyt = new Banka();
                                doyt.banka();
                            } else
                                System.out.println("yanlış değer tekrar giriniz");

                        }

                    } else {
                        System.out.println("işleminiz iptal edilmiştir");
                        System.out.println("hey X'e hoşgeldin ne yapmak istersin?");

                        System.out.println("1-oyunlar\n2-banka işlemleri");
                        int e = inp.nextInt();
                        if (e == 1) {

                            hızlıEğlencelikler zee = new hızlıEğlencelikler();
                            zee.oyun();
                        } else if (e == 2) {
                            Banka doyt = new Banka();
                            doyt.banka();
                        } else
                            System.out.println("yanlış değer tekrar giriniz");
                    }

                    if (epr == 2) {
                        int k = inp.nextInt();
                        System.out.println("kaç usd almak istiyorsunuz:");
                        System.out.println(usd + " liradan " + k + " kadar usd alırsanız şu kadar tutar " + (k * usd));
                        System.out.println("işlemi onaylıyorsanız 1'i tuşlayınız");
                        int ğ = inp.nextInt();
                        if (ğ == 1) {
                            System.out.println("isleminiz başarıyla gerçekleşmiştir");
                            bakiye -= (k * usd);
                            System.out.println("hey X'e hoşgeldin ne yapmak istersin?");

                            System.out.println("1-oyunlar\n2-banka işlemleri");
                            int e = inp.nextInt();
                            if (e == 1) {

                                hızlıEğlencelikler zo = new hızlıEğlencelikler();
                                zo.oyun();
                            } else if (e == 2) {
                                Banka doyt = new Banka();
                                doyt.banka();
                            } else
                                System.out.println("yanlış değer tekrar giriniz");
                            System.out.println("hey X'e hoşgeldin ne yapmak istersin?");

                            System.out.println("1-oyunlar\n2-banka işlemleri");
                            int er = inp.nextInt();
                            if (er == 1) {

                                hızlıEğlencelikler zwe = new hızlıEğlencelikler();
                                zwe.oyun();
                            } else if (er == 2) {
                                Banka doyt = new Banka();
                                doyt.banka();
                            } else
                                System.out.println("yanlış değer tekrar giriniz");

                        }
                    } else {
                        System.out.println("işleminiz iptal edilmiştir");
                        System.out.println("hey X'e hoşgeldin ne yapmak istersin?");

                        System.out.println("1-oyunlar\n2-banka işlemleri");
                        int e = inp.nextInt();
                        if (e == 1) {

                            hızlıEğlencelikler zer = new hızlıEğlencelikler();
                            zer.oyun();
                        } else if (e == 2) {
                            Banka doyt = new Banka();
                            doyt.banka();
                        } else
                            System.out.println("yanlış değer tekrar giriniz");
                    }


                    if (epr == 3) {
                        System.out.println("kaç euro almak istiyorsunuz:");
                        int p = inp.nextInt();
                        System.out.println(euro + " liradan " + p + " kadar euro alırsanız şu kadar tutar " + (p * euro));
                        System.out.println("işlemi onaylıyorsanız 1'i tuşlayınız");
                        int ü = inp.nextInt();
                        if (ü == 1) {
                            System.out.println("isleminiz başarıyla gerçekleşmiştir");
                            System.out.println("hey X'e hoşgeldin ne yapmak istersin?");

                            System.out.println("1-oyunlar\n2-banka işlemleri");
                            int e = inp.nextInt();
                            if (e == 1) {

                                hızlıEğlencelikler zel = new hızlıEğlencelikler();
                                zel.oyun();
                            } else if (e == 2) {
                                Banka doyt = new Banka();
                                doyt.banka();
                            } else
                                System.out.println("yanlış değer tekrar giriniz");
                            bakiye -= (p * euro);


                        } else {
                            System.out.println("işleminiz iptal edilmiştir");
                            System.out.println("hey X'e hoşgeldin ne yapmak istersin?");

                            System.out.println("1-oyunlar\n2-banka işlemleri");
                            int e = inp.nextInt();
                            if (e == 1) {

                                hızlıEğlencelikler zey = new hızlıEğlencelikler();
                                zey.oyun();
                            } else if (e == 2) {
                                Banka doyt = new Banka();
                                doyt.banka();
                            } else
                                System.out.println("yanlış değer tekrar giriniz");
                        }


                    }
                case 4:
                    System.out.println("bakiyeniz:"+bakiye);

                    System.out.println("hey X'e hoşgeldin ne yapmak istersin?");

                    System.out.println("1-oyunlar\n2-banka işlemleri");
                    int as = inp.nextInt();
                    if (as== 1) {

                        hızlıEğlencelikler zzxa = new hızlıEğlencelikler();
                        zzxa.oyun();
                    } else if (as== 2) {
                        Banka doyt = new Banka();
                        doyt.banka();
                    } else
                        System.out.println("yanlış değer tekrar giriniz");
            }

        }

    }

}



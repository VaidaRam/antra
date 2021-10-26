package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
////        System.out.println("\" ");
//        System.out.println(Math.random()); //dazniausiai reikalinga kokioms loterijoms, hakinimui
//
//// 1 . parašyti sakinį
//        String vardas = "Aš esu Vaida";
//        String pavarde = "Ramanauske";
//        String amzius = "man yra 31 metai";
//        System.out.println(vardas + " " + pavarde + " " + amzius);
////        2 budas - destytojo
//        String name = "Vaida";
//        String surname = "Ramanauske";
//        int birthYear = 1990;
//        int actualYear = 2021;
//        System.out.println("As esu "+name+" "+surname+". Man yra " + (actualYear - birthYear) + " metai");
//
//// 2. Math.random
//        Math.random(); //0 < x < 1 0.0000000001, 0.999999999999 gražina kažką kas nurodyta tose ribose
//        double rnd = Math.random() * 4;
//        int rndInt = (int) rnd; // java paima sveika skaicius issikvietus south (rndInt)
//        System.out.println( Math.random() * 4);
//        double random = (int)(Math.random() * 6 + 2); // jei pilkuoja, tai niekur nenaudojama. turi pajuoduoti
//// 3. Naudokite funkcija Math.random().
// Sukurkite du kintamuosius ir naudodamiesi funkcija Math.random() jiems priskirkite atsitiktines reikšmes nuo 0 iki 4.
// Didesnę reikšmę padalinkite iš mažesnės. Atspausdinkite rezultatą jį suapvalinę iki 2 skaičių po kablelio. //
//        Math.random();
//        double num = 3.65894565;
//        double rounded = ((int) (num * 100)) * 0.01; // 1 variantas (rounded)
//        double rounded2 = Math.floor(num*100)/100; // 2 variantas (rounded2)
//        System.out.println(rounded2);
//// 2 uzduoties sprendimas
//        int first = (int)(Math.random() * 5);
//        int second = (int)(Math.random() * 5);
//        System.out.println("pirmas skaicius "+first+", antras skaicius "+second);
//        if(first == 0 || second == 0){ // first!=0 && second!=0 - kad nei tas nei tas negali buti 0
//            System.out.println("dalyba is nulio negalima");
//        }
////        paprastas sprendimas 2 uzduoties
//        int first = 4;
//        int second = 3;
//        if(first > second){
//            System.out.println( (double) Math.round( (double) first / second *100) /100 );
//        }else{
//            System.out.println( (double) Math.round( (double) second / first *100) /100 ); // else veikti pradeda tada kai if pasidaro false, kai netenkina salygos
//        }

//    3 uzdavinys    Naudokite funkcija Math.random(). Sukurkite tris kintamuosius ir naudodamiesi funkcija Math.random() jiems priskirkite atsitiktines reikšmes nuo 0 iki 25. Raskite ir atspausdinkite kintąmąjį turintį vidurinę reikšmę.

//        sukurti kintamuosius
//        int a = (int) ( Math.random() * 26);
//        int b = (int) ( Math.random() * 26);
//        int c = (int) ( Math.random() * 26);
//        System.out.println("a = "+a+", b = "+b+", c="+c);
//
//        if (a != b && b != c && a != c){ // eliminuoja visus galimus variantus kad veiktu tik sekantys veiksmai
//            System.out.println("neturime triju skirtingu skaiciu");
//        }else {
//
//            if ((a > b && b > c) || (c > b && b > a)) {
//                System.out.println(b);
//            }
//            if ((a > c && c > b) || (b > c && c > a)) {
//                System.out.println(c);
//            }
//            if ((b > a && a > c) || (c > a && a > b)) {
//                System.out.println(a);
//            }
//        }


//4 uzduotis - Įvedami skaičiai -a, b, c –kraštinių ilgiai, trys kintamieji (naudojame int) (naudokite Math.random()funkcija nuo 1 iki 10).
// Parašykite Java programą, kuri nustatytų, ar galima sudaryti trikampį ir atsakymą atspausdintų.
//
//        int a = (int) ( Math.random() * 10) +1; // kintamuosius random rasome taip
//        int b = (int) ( Math.random() * 10) +1;
//        int c = (int) ( Math.random() * 10) +1;
//        // pasitikrinti gali a=1; b=5; c=4;
//        System.out.println("a = "+a+", b = "+b+", c = "+c); //jei atitinka salyga tada pasirenka kuri varianta atitinka
//        if(a + b > c && a + c > b && c + b > a){
//            System.out.println("trikampis galimas");
//            if(a == b && b == c){
//                System.out.println("trikampis lygiakrastis"); // visos krastines
//            }else if(a == b || b == c || a == c){
//                System.out.println("trikampis BENT lygiasonis"); //bent dvi krastines
//            }
//        }else{
//            System.out.println("nesamone");
//        }
//
//5. uzduotis - Sukurti kintamąjį su stringu: “An American in Paris”.
// Jame visas “a” (didžiąsias ir mažąsias) pakeisti žvaigždutėm “*”.  Rezultatą atspausdinti.


//9. uzduotis - nebaigta
//        int h = 12;
//        int m = 24;
//        int s = 50;
//        int xTtime = 259;
//        System.out.println("random sugeneruotas laikas - "+h+":"+m+":"+s);
//        System.out.println("random sugeneruotos sekundes kurias reikes prideti "+xTtime);
////        s= (s+xTtime) % 60;
//        System.out.println("susumavus s + xTime, gauname laike telpa minuciu: "+((s+xTtime) / 60));
//        System.out.println("ir sekundziu "+(s+xTtime) * 60);
//        s = (s+xTtime) % 60;

// 2.1 uzduotis Sukurti du kintamuosius. Jiems priskirti savo mylimo aktoriaus vardą ir pavardę kaip stringus (Jonas Jonaitis).
// Atspausdinti trumpesnį stringą.
//        String str = "Will";
//        String str1 = "Smith";
//        System.out.println(str.length()); //paraso kiek yra simboliu stringe
//        System.out.println(str1.length()); //paraso kiek yra simboliu stringe
//        System.out.println(str.substring(0, 3));
//        System.out.println(str1.substring(0, 2));

//        // destytojo sprendimas
//        String str = "Will";
//        String str1 = "Smith";
//        if(str.length() > str1.length()){
//            System.out.println(str1);
//        }
//        if(str.length() < str1.length()){
//            System.out.println(str);
//        }

// 2.2 Sukurti du kintamuosius. Jiems priskirti savo mylimo aktoriaus vardą ir pavardę kaip stringus.
// Vardą atspausdinti tik didžiosiom raidėm, o pavardę tik mažosioms.
//        String name = "Will";
//        String surName = "Smith";
//        System.out.println(name.toUpperCase() + " " + surName.toLowerCase());

//  2.3 Sukurti du kintamuosius. Jiems priskirti savo mylimo aktoriaus vardą ir pavardę kaip stringus.
//  Sukurti trečią kintamąjį ir jam priskirti stringą,
//  sudarytą iš pirmų vardo ir pavardės kintamųjų raidžių.
//  Jį atspausdinti.
//        String a = "Will";
//        String b = "Smith";
//        String all = a.charAt(0)+""+b.charAt(0);
//        System.out.println(all);
//        System.out.println(a.charAt(0));
//        System.out.println((int)a.charAt(0));
//        System.out.println(b.charAt(0));
//        System.out.println((int)b.charAt(0));
//  2.4 Sukurti du kintamuosius. Jiems priskirti savo mylimo aktoriaus vardą ir pavardę kaip stringus.
//  Sukurti trečią kintamąjį ir jam priskirti stringą, sudarytą iš trijų paskutinių vardo ir pavardės kintamųjų raidžių.
//  Jį atspausdinti.
//        String a = "Will";
//        String b = "Smith";
//        System.out.println( a.substring( a.length()-3) + b.substring( b.length()-3));
//  2.5 Sukurti kintamąjį su stringu: “An American in Paris”.
//  Jame visas “a” (didžiąsias ir mažąsias) pakeisti žvaigždutėm “*”.
//  Rezultatą atspausdinti.

//        String text = "An Anerican in Paris";
//        System.out.println(text.replace("a", "*").replace("A", "*"));

//  Sukurti kintamąjį su stringu: “An American in Paris”.
//  Jame ištrinti visas balses.
//  Rezultatą atspausdinti.
//  Kodą pakartoti su stringais: “Breakfast at Tiffany's”,
//  “2001: A Space Odyssey” ir
//  “It's a Wonderful Life”.
//        String text = "An Anerican in Paris";
//        String text1 = "Breakfast at Tiffany's";
//        String text2 = "2001: A Space Odyssey";
//        String text3 = "It's a Wonderful Life";
//
//        System.out.println(text.replaceAll("[AEIOUaeiou]",""));
//        System.out.println(text1.replaceAll("[AEIOUaeiou]",""));
//        System.out.println(text2.replaceAll("[AEIOUaeiou]",""));
//        System.out.println(text3.replaceAll("[AEIOUaeiou]",""));
//  2.7 Stringe, kurį generuoja toks kodas:
//  ""Star Wars: Episode "+ " ".repeat( (int) (Math.random() * 10))+((int) (Math.random() * 7)+1) + " - A New Hope"
//  Surasti ir atspausdinti epizodo numerį.
//        String starWars = "Star Wars: Episode "+ " ".repeat( (int) (Math.random() * 10))+((int) (Math.random() * 7)+1) + " - A New Hope";
//        System.out.println(starWars.substring(starWars.length()-14,starWars.length()-13));
//      PVZ
//        String gen = "Star Wars: Episode "+ " ".repeat( (int) (Math.random() * 10))+((int) (Math.random() * 7)+1) + " - A New Hope";
//        System.out.println(gen);
//        gen = gen.replaceAll("[^0-9]+", " ");
//        System.out.println(Arrays.asList(gen.trim())); //masyvo rasymas
//  2.8 Suskaičiuoti kiek stringe “Don't Be a Menace to South Central While Drinking Your Juice in the Hood” yra žodžių trumpesnių arba lygių nei 5 raidės.
//  Pakartokite kodą su stringu “Tik nereikia gąsdinti Pietų Centro, geriant sultis pas save kvartale”.





// Scanner pvz. kaip bendrauti tiesiogiai su JAVA
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("kuo tu vardu?");
//        String name = scanner.nextLine(); // i java irasom Varda ir paspaudus enter jis toliau atspausdina
//        System.out.println("oba, mano vardas irgi " +name);
//        System.out.println( "jusu spalto agento vardas yra "+ new StringBuilder(name).reverse().toString());
////        pasaro is kitos puses pavadinima su reverse

//        pvz try ir catch
//        try{
////          scanner.nextInt();
//            System.out.println("pavyko gauti skaiciu");
//        }catch (Exception e){
//            System.out.println("nepavyko gauti skaiciaus");
//        }

//        System.out.println(23%10); /// liekana (3) nes 23-10-10=3

//        int saicius = 17;
//        skaicius = skaicius +1; tolygu kaip skaicius += 1;
//        skaicius+= 1; /// padidina vienu kartu
//        skaicius += 20; // tai didina 20 kartu
//        skaicius -= 20; // mazina tiek kartu
//        skaicius --; // sumazeja vienetu
//        ++skaicius; // reiskia laika kada ivertis padidinamas
//        --skaicius;

//        int a = 10;
//        System.out.println(a + ++a); // 10+ padidina iki 11 - ++a; o jei a++ tai veliau tik padaro 11 ir nepaskaiciuoja
//
//        for (int i = 1; i < 10; i++) { //i=2
//            System.out.println(i);
//            if (i % 5 == 0) { // taip rasoma neporinis skaicius, arba nedalomas is 5 ir neturintis liekanos
////                continue; // ties kur parašom jis sustoja ir nevykdo kodo, soka i kita iteracija
//                break; // nutraukia cikla sita funkcija
//            }
//            System.out.println(i);
//        }

//        4. 1 Sugeneruokite masyvą iš 30 elementų (indeksai nuo 0 iki 29), kurių reikšmės yra atsitiktiniai skaičiai nuo 5 iki 25.


















































    }
}

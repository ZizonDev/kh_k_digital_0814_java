package 상근날드;

import java.util.Scanner;

/* [문제]
    상근날드에서 가장 잘 팔리는 메뉴는 세트 메뉴이다. 주문할 때, 자신이 원하는 햄버거와 음료를 하나씩 골라, 세트로 구매하면, 가격의 합계에서 50원을 뺀 가격이 세트 메뉴의 가격이 된다.
    햄버거는 총 3종류 상덕버거, 중덕버거, 하덕버거가 있고, 음료는 콜라와 사이다 두 종류가 있다.
    햄버거와 음료의 가격이 주어졌을 때, 가장 싼 세트 메뉴의 가격을 출력하는 프로그램을 작성하시오.

   [입력]
    입력은 총 다섯 줄이다. 첫째 줄에는 상덕버거, 둘째 줄에는 중덕버거, 셋째 줄에는 하덕버거의 가격이 주어진다.
    넷째 줄에는 콜라의 가격, 다섯째 줄에는 사이다의 가격이 주어진다. 모든 가격은 100원 이상, 2000원 이하이다.

   [출력]
    첫째 줄에 가장 싼 세트 메뉴의 가격을 출력한다.
 */
public class TheCheapestMenu {
    public static void main(String[] args) {
        int[] menu = new int[5];           // 햄버거 3개, 음료 2개
        Scanner sc = new Scanner(System.in);
        System.out.print("메뉴 가격 입력 : ");
        for (int i = 0; i < menu.length; i++) {menu[i] = sc.nextInt();}     // 5개 값을 입력받은 것.
        int minBurger = menu[0];           // 햄버거 중 가장 싼 메뉴 찾기 위한 시작 값.
        int minDrink = menu[3];            // 음료 중 가장 싼 메뉴 찾기 위한 시작 값.
        for(int i = 0; i < menu.length; i++) {
            if (i < 3 && minBurger > menu[i]) { minBurger = menu[i]; }
            if (i > 2 && minDrink > menu[i]) { minDrink = menu[i]; }
        }
        System.out.println(minBurger + minDrink - 50);
    }
}

// 삼항 연산자를 사용할 수도 있음!


//        Scanner sc = new Scanner(System.in);
//        System.out.print("상덕버거 가격 : ");
//        int price1 = sc.nextInt();
//        System.out.print("중덕버거 가격 : ");
//        int price2 = sc.nextInt();
//        System.out.print("하덕버거 가격 : ");
//        int price3 = sc.nextInt();
//        System.out.print("콜라 가격 : ");
//        int price4 = sc.nextInt();
//        System.out.print("사이다 가격 : ");
//        int price5 = sc.nextInt();
//
//        int[] burger = {price1, price2, price3};
//        int[] drink = {price4, price5};
//        int setPrice = 150;
//        int tmp = 0;
//        for (int i = 0; i < burger.length; i++) {
//            for (int j = i; j < burger.length; j++) {
//                if (burger[i] > burger[j]) {
//                    tmp = burger[j];
//                    burger[j] = burger[i];
//                    burger[i] = tmp;
//                }
//            }
//            if (price4 > price5) {
//                setPrice = burger[0] + price5 - 50;
//            } else {
//                setPrice = burger[0] + price4 - 50;
//            }
//        }
//        if (setPrice <= 2000) {
//            System.out.println("가장 싼 세트 메뉴의 가격 : " + setPrice);
//        } else {
//            System.out.println("세트 메뉴의 가격이 2000원을 초과하였습니다.");
//        }
//
//    }
//}


//        Scanner sc = new Scanner(System.in);
//        System.out.print("상덕버거의 가격을 입력하세요 : ");
//        int priceHigh = sc.nextInt();
//        System.out.print("중덕버거의 가격을 입력하세요 : ");
//        int priceMiddle = sc.nextInt();
//        System.out.print("하덕버거의 가격을 입력하세요 : ");
//        int priceLow = sc.nextInt();
//        System.out.print("콜라의 가격을 입력하세요 : ");
//        int priceCoke = sc.nextInt();
//        System.out.print("사이다의 가격을 입력하세요 : ");
//        int priceCider = sc.nextInt();
//        int set1, set2;
//        set1 = 150; set2 = 150;
//
//        if (priceHigh < priceMiddle) {
//            if (priceMiddle < priceLow) {set1 = priceHigh;}
//        }
//        else if (priceMiddle < priceLow) {
//                if (priceMiddle < priceHigh) {set1 = priceMiddle;}
//        }
//        else {set1 = priceLow;}
//
//        if (priceCoke < priceCider) {set2 = priceCoke;}
//        else {set2 = priceCider;}
//
//        int result = set1 + set2 - 50;
//
//        if (result <= 2000) {System.out.println("가장 싼 세트 메뉴의 가격은 " + result + "원 입니다.");}
//        else {System.out.println("세트 메뉴의 가격이 2000원을 초과하였습니다.");}
//        }


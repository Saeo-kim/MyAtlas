package com.atlas;
import java.util.Scanner; //입력받기 위한 도구 불러오기


public class Main {
	
	public static void main(String[] args) {
		
		Clothes myShirt = new Clothes("T-shirt", 20000, "L");
		
		System.out.println(myShirt.getInfo());
		
		Scanner sc = new Scanner(System.in); //입력을 받을 준비

		//1. 상품 목록 데이터 만들기 (Instead using DB)
		Product[] catalog = {
			new Product("운동화", 50000),
			new Product("티셔츠", 20000),
			new Product("모자", 15000)
		};
	
		//2. 목록 출력
		System.out.println("--- 상품 목록 ---");
		for (int i = 0; i < catalog.length; i++) {
			System.out.println((i + 1) + ". " + catalog[i].name + " (" + catalog[i].price + "원)");
		};
	
		 // 3. 선택 (클릭 대신 번호 입력)
        System.out.print("구매할 상품 번호를 입력하세요: ");
        int choice = Integer.parseInt(sc.nextLine()) - 1;

        // 4. 자동 계산
        if (choice >= 0 && choice < catalog.length) {
            Product selected = catalog[choice];
            System.out.println(selected.name + "를 선택하셨습니다.");
            System.out.println("결제 금액: " + selected.price + "원");
        } else {
            System.out.println("없는 상품입니다.");
        };
    };
};
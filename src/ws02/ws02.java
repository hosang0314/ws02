package ws02;

import java.util.Scanner;

public class ws02 {

	public static void main(String[] args) {
		System.out.println("주민번호를 입력하세요>>");
		Scanner sc = new Scanner(System.in);
		char jm = sc.next().charAt(6);
		if(jm=='1' || jm=='3') {
			System.out.println("남자입니다.");
		}else if(jm=='2' || jm=='4'){
			System.out.println("여자입니다.");
		}else {
			System.out.println("잘못된 주민번호입니다.");
		}

	}

}

package ws02;

import java.util.Scanner;

public class ws02 {

	public static void main(String[] args) {
		System.out.println("�ֹι�ȣ�� �Է��ϼ���>>");
		Scanner sc = new Scanner(System.in);
		char jm = sc.next().charAt(6);
		if(jm=='1' || jm=='3') {
			System.out.println("�����Դϴ�.");
		}else if(jm=='2' || jm=='4'){
			System.out.println("�����Դϴ�.");
		}else {
			System.out.println("�߸��� �ֹι�ȣ�Դϴ�.");
		}

	}

}

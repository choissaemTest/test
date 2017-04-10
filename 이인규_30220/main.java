package 이인규_30220;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class main {

	static String filepath = "C:\\test\\30220 이인규.txt";
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		while (true) {
			System.out.println("-------------------------------------------");
			System.out.println("도서 관리 프로그램입니다. 항목을 입력해주세요.");
			System.out.println("1. 책 출력");
			System.out.println("2. 책 추가");
			System.out.println("3. 책 검색");
			System.out.println("4. 책 삭제");
			System.out.println("그 외 다른 키 : 종료");
			System.out.println("-------------------------------------------");

			int choice = -1;
			choice = scan.nextInt();

			System.out.println("선택 된 메뉴 : " + choice);

			switch (choice) {
			case 1:
				printB();
				break;

			case 2:
				addB();
				break;

			case 3:
				searchB();
				break;

			case 4:
				deleteB();
				break;

			default:
				System.out.println("종료합니다.");
				System.exit(0);
			}
		}

	}

	private static void printB() throws IOException {
		System.out.println("책 목록을 출력합니다.");
		BufferedReader br = new BufferedReader(new FileReader(filepath));

		while (filepath != null) {
			br.readLine();
			System.out.println(filepath);
			br.close();
		}
	}

	private static void addB() throws IOException {
		book a = new book();

		System.out.println("책을 추가합니다. 항목을 입력해주세요.");
		scan.nextLine();

		System.out.println("책 이름 : ");
		a.setName(scan.nextLine());

		System.out.println("저자 : ");
		a.setAuthor(scan.nextLine());

		System.out.println("가격 : ");
		a.setPrice(scan.nextLine());

		BufferedWriter bw = new BufferedWriter(new FileWriter(filepath, true));
		bw.write(a.getName() + "\t" + a.getAuthor() + "\t" + a.getPrice());
		bw.newLine();
		bw.close();

	}

	private static void searchB() throws IOException {
		String findingdata = new String();
		System.out.println("세부 사항을 입력해주세요.");
		findingdata = scan.nextLine();
		BufferedReader br = new BufferedReader(new FileReader(filepath));
		while (filepath != null){
		}
		
	}

	private static void deleteB() {
		System.out.println("기능을 선택해주세요.");
		System.out.println("1. 전체 삭제");
		System.out.println("2. 선택 삭제");

		int choi = -1;
		choi = scan.nextInt();

		switch (choi) {
		case 1:
			System.out.println("전체 삭제를 진행합니다.");
			break;

		case 2:
			System.out.println("선택 삭제를 진행합니다.");
			break;
		}
	}
}

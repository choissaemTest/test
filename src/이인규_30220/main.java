package ���α�_30220;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class main {

	static String filepath = "C:\\test\\30220 ���α�.txt";
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		while (true) {
			System.out.println("-------------------------------------------");
			System.out.println("���� ���� ���α׷��Դϴ�. �׸��� �Է����ּ���.");
			System.out.println("1. å ���");
			System.out.println("2. å �߰�");
			System.out.println("3. å �˻�");
			System.out.println("4. å ����");
			System.out.println("�� �� �ٸ� Ű : ����");
			System.out.println("-------------------------------------------");

			int choice = -1;
			choice = scan.nextInt();

			System.out.println("���� �� �޴� : " + choice);

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
				System.out.println("�����մϴ�.");
				System.exit(0);
			}
		}

	}

	private static void printB() throws IOException {
		System.out.println("å ����� ����մϴ�.");
		BufferedReader br = new BufferedReader(new FileReader(filepath));

		while (filepath != null) {
			br.readLine();
			System.out.println(filepath);
			br.close();
		}
	}

	private static void addB() throws IOException {
		book a = new book();

		System.out.println("å�� �߰��մϴ�. �׸��� �Է����ּ���.");
		scan.nextLine();

		System.out.println("å �̸� : ");
		a.setName(scan.nextLine());

		System.out.println("���� : ");
		a.setAuthor(scan.nextLine());

		System.out.println("���� : ");
		a.setPrice(scan.nextLine());

		BufferedWriter bw = new BufferedWriter(new FileWriter(filepath, true));
		bw.write(a.getName() + "\t" + a.getAuthor() + "\t" + a.getPrice());
		bw.newLine();
		bw.close();

	}

	private static void searchB() throws IOException {
		String findingdata = new String();
		System.out.println("���� ������ �Է����ּ���.");
		findingdata = scan.nextLine();
		BufferedReader br = new BufferedReader(new FileReader(filepath));
		while (filepath != null){
		}
		
	}

	private static void deleteB() {
		System.out.println("����� �������ּ���.");
		System.out.println("1. ��ü ����");
		System.out.println("2. ���� ����");

		int choi = -1;
		choi = scan.nextInt();

		switch (choi) {
		case 1:
			System.out.println("��ü ������ �����մϴ�.");
			break;

		case 2:
			System.out.println("���� ������ �����մϴ�.");
			break;
		}
	}
}

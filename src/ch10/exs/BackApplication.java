package ch10.exs;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.LongPredicate;

public class BackApplication {

	// 비밀번호는 4자리로만 입력
	// ㅇㅖ금은 제한 없음
	// 입금시 계좌번호를 알면 입금가능
	// 잔고보다 큰금액은 인출할수없음
	// 출금시 계좌번호와 비밀번호가 일치해야만 인출
	// 예금주의 이름이나 계좌번호는 게좌 생성후 변경할 수 없음
	// 비밀번호는 계좌번호 이름,기존 비밀번호가 일치하는 경우에만 변경할 수 있음
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Account> accounts = new ArrayList();
		String msg = """
				-------------------------------------------------
				1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료
				-------------------------------------------------
				선택 >
				""";
		System.out.println(msg);
		Scanner in = new Scanner(System.in);
		String menu = in.nextLine();
		while (true) {
			// 계좌생성
			if (menu.equals("1")) {
				String accountOwner;
				String password;
				long balance = 0;
				try {
					System.out.println("이름을 입력하세요.");
					accountOwner = in.nextLine();

					do {
						System.out.println("비밀번호를 입력하세요");
						password = in.nextLine();
						try {
							int pLength = password.length();
							if (pLength != 4) {
								System.out.println("비밀번호는 4자리여야합니다.");
								password = in.nextLine();
							}
						} catch (Exception e) {
							System.err.println(e);
						}
					} while (password.length() != 4);

					do {
						System.out.println("초기금액을 입력하세요");
						balance = in.nextLong();
//						balance = in.nextLine();
						try {
//							long parsedBalance = Long.parseLong(balance);
							LongPredicate checkBalance = a -> a < (long) 100;
//							boolean checkMoreThenHundred = checkBalance.test(parsedBalance);
							boolean checkMoreThenHundred = checkBalance.test(balance);

							if (checkMoreThenHundred) {
								System.out.println("100보다 크게 입력해야합니다.");
							}
						} catch (NumberFormatException e) {
							System.out.println("글자는 취급하지 않습니다. 초기금액을 입력하세요");
							in.next();
							balance = 0;
						}

					} while (balance < 100);

					Integer sizeOfAccounts = accounts.size();
					accounts.add(new Account(sizeOfAccounts.toString(), accountOwner, balance, password));
					System.out.println("계좌가 생성되었습니다.");
					System.out.println("-----------------");
					System.out.println(msg);
					menu = in.nextLine();
				} catch (Exception e) {
					System.err.println(e);
				}
			} else if (menu.equals("2")) {
				// 계좌목록
				System.out.println("2222");
			} else if (menu.equals("3")) {
				// 예금
			} else if (menu.equals("4")) {
				// 출금
			} else if (menu.equals("5")) {
				// 종료
				System.out.println("안녕히가시오.");
				break;
			} else {
				System.out.println("잘못누르셨습니다.");
				System.out.println(msg);

			}
		}
	}

}

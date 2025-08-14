package ch10.exs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BackApplication {
	// 요구사항 : 1. 계좌 생성할 때 반드시 초기 입금액을 0보다 크게 입력해야 한다.
	// 계좌번호는 유일해야 함.
	// - 비밀번호는 숫자 4자리로만 입력해야 함.(Optional)
	// 2. 예금은 금액 제한 없음
	// 입금시 계좌번호만 알면 입금할 수 있음
	// 3. 잔고보다 큰 금액은 인출할 수 없음 (마이너스 통장 X)
	// 출금시 계좌번호와 비밀번호가 일치해야만 인출할 수 있음(Optional)
	// 4. 예금주의 이름이나 계좌번호는 계좌 생성 후 변경할 수 없음
	// 비밀번호는 계좌번호, 이름, 기존 비밀번호가 일치하는 경우에만 변경할 수 있음(Optional)

	public static void main(String[] args) {
		String msg = """
				-------------------------------------------------
				1. 계좌생성 | 2.계좌목록 | 3. 예금 | 4. 출금 | 5. 종료
				-------------------------------------------------
				선택>
				""";

		Scanner in = new Scanner(System.in);
//		Account[] accounts = new Account[100];
//		List<Account> accountList = new ArrayList<>();
		List<Account> accountList = new LinkedList<>();
		Map<String, Account> accountMap = new HashMap<>();
//		int index = 0;
		String menu = "";
//		String accountNo = "";
//		String accountOwner = "";
//		long balance = 0;
//		String password = "";
//		String password1 = "";
//		long money = 0;
		while (true) {
			System.out.println(msg);
			menu = in.nextLine();
			if (menu.equals("5")) {
				System.out.println("안녕히 가세요~");
				break;
			}
			switch (menu) {
			case "1" -> { // 계좌생성
				if (createAccount(in, accountList)) {
				}
			}
			case "2" -> { // 목록 출력
				listAccounts(accountList);
			}
			case "3" -> { // 입금
				depositAccount(in, accountList);
			}
			case "4" -> { // 출금
				withdrawAccount(in, accountList);
			}
			default -> System.out.println("메뉴 번호를 확인하세요");
			}
		}

	}

	private static boolean isDuplicated(List<Account> accountList, String accountNo) {
		for (Account account : accountList) {
			if (account.getAccountNo().equals(accountNo)) {
				return true;
			}
		}
		return false;
	}

	private static int findAccount(List<Account> accountList, String accountNo) {

		for (int i = 0; i < accountList.size(); i++) {
			if (accountList.get(i).getAccountNo().equals(accountNo)) {
				return i;
			}
		}
		return -1;
	}

	private static boolean createAccount(Scanner in, List<Account> accountList) {
		String msg1 = """
				-------
				계좌생성
				-------""";
		System.out.println(msg1);
		System.out.print("계좌번호 : ");
		String accountNo = in.nextLine();
		System.out.print("계좌주 : ");
		String accountOwner = in.nextLine();
		System.out.print("비밀번호 : ");
		String password = in.nextLine();
		System.out.print("비밀번호 (재입력) : ");
		String password1 = in.nextLine();
		System.out.print("초기 입금액 : ");
		long balance = Long.parseLong(in.nextLine());
		// 계좌번호가 유일한지 체크 추가 ??? 어떻게 하는게 더 효율적인지 생각해보기
		if (isDuplicated(accountList, accountNo)) {// 계좌번호 중복
			System.out.println("계좌번호가 중복되어 계좌 생성을 할 수 없습니다ㅣ 다시 입력하세요");
		} else if (accountNo.isBlank() || accountOwner.isBlank() || !password.equals(password1) || balance <= 0) {
			System.out.println("계좌 생성을 위한 필수값이 입력되지 않았거나 비밀번호가 서로 다릅니다. 다시 입력하세요");
		} else {
			accountList.add(new Account(accountNo, accountOwner, password, balance));
			System.out.println("계좌가 생성되었습니다.");
			return true;

		}
		return false;
	}

	private static void withdrawAccount(Scanner in, List<Account> accountList) {
		String msg4 = """
				-------
				출금
				-------""";
		System.out.println(msg4);
		System.out.print("계좌번호 : ");
		String accountNo = in.nextLine();
		int ind = findAccount(accountList, accountNo);
		if (ind >= 0) { // 계좌를 찾은 경우
			System.out.print("비밀번호 : ");
			String password = in.nextLine();
			if (!password.isBlank() && accountList.get(ind).getPassword().equals(password)) {
				System.out.print("출금액 : ");
				long money = Long.parseLong(in.nextLine());
				accountList.get(ind).withdraw(money);
			} else {
				System.out.println("비밀번호 불일치로 출금할 수 없습니다.");
			}
		}
	}

	private static void depositAccount(Scanner in, List<Account> accountList) {
		String msg3 = """
				-------
				예금
				-------""";
		System.out.println(msg3);
		System.out.print("계좌번호 : ");
		String accountNo = in.nextLine();
		System.out.print("입금액 : ");
		long money = Long.parseLong(in.nextLine());
		int ind = findAccount(accountList, accountNo);
		if (ind >= 0) { // 계좌를 찾은 경우
			accountList.get(ind).deposit(money);
			System.out.println("입금이 완료되었습니다.");
		} else { // 해당 계좌를 못찾은 경우
			System.out.println("입금할 계좌 정보가 없습니다.");
		}
	}

	private static void listAccounts(List<Account> accountList) {
		String msg2 = """
				-------
				계좌목록
				-------""";
		System.out.println(msg2);
		for (Account account : accountList) {
			System.out.println(account);
		}
	}
}
//
//import java.util.ArrayList;
//import java.util.Scanner;
//import java.util.function.LongPredicate;
//
//public class BackApplication {
//
//	// 비밀번호는 4자리로만 입력
//	// ㅇㅖ금은 제한 없음
//	// 입금시 계좌번호를 알면 입금가능
//	// 잔고보다 큰금액은 인출할수없음
//	// 출금시 계좌번호와 비밀번호가 일치해야만 인출
//	// 예금주의 이름이나 계좌번호는 게좌 생성후 변경할 수 없음
//	// 비밀번호는 계좌번호 이름,기존 비밀번호가 일치하는 경우에만 변경할 수 있음
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		ArrayList<Account> accounts = new ArrayList();
//		String msg = """
//				-------------------------------------------------
//				1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료
//				-------------------------------------------------
//				선택 >
//				""";
//		System.out.println(msg);
//		Scanner in = new Scanner(System.in);
//		String menu = in.nextLine();
//		while (true) {
//			// 계좌생성
//			if (menu.equals("1")) {
//				String accountOwner;
//				String password;
//				long balance = 0;
//				try {
//					System.out.println("이름을 입력하세요.");
//					accountOwner = in.nextLine();
//
//					do {
//						System.out.println("비밀번호를 입력하세요");
//						password = in.nextLine();
//						try {
//							int pLength = password.length();
//							if (pLength != 4) {
//								System.out.println("비밀번호는 4자리여야합니다.");
//								password = in.nextLine();
//							}
//						} catch (Exception e) {
//							System.err.println(e);
//						}
//					} while (password.length() != 4);
//
//					do {
//						System.out.println("초기금액을 입력하세요");
//						balance = in.nextLong();
////						balance = in.nextLine();
//						try {
////							long parsedBalance = Long.parseLong(balance);
//							LongPredicate checkBalance = a -> a < (long) 100;
////							boolean checkMoreThenHundred = checkBalance.test(parsedBalance);
//							boolean checkMoreThenHundred = checkBalance.test(balance);
//
//							if (checkMoreThenHundred) {
//								System.out.println("100보다 크게 입력해야합니다.");
//							}
//						} catch (NumberFormatException e) {
//							System.out.println("글자는 취급하지 않습니다. 초기금액을 입력하세요");
//							in.next();
//							balance = 0;
//						}
//
//					} while (balance < 100);
//
//					Integer sizeOfAccounts = accounts.size();
//					accounts.add(new Account(sizeOfAccounts.toString(), accountOwner, balance, password));
//					System.out.println("계좌가 생성되었습니다.");
//					System.out.println("-----------------");
//					System.out.println(msg);
//					menu = in.nextLine();
//				} catch (Exception e) {
//					System.err.println(e);
//				}
//			} else if (menu.equals("2")) {
//				// 계좌목록
//				System.out.println("2222");
//			} else if (menu.equals("3")) {
//				// 예금
//			} else if (menu.equals("4")) {
//				// 출금
//			} else if (menu.equals("5")) {
//				// 종료
//				System.out.println("안녕히가시오.");
//				break;
//			} else {
//				System.out.println("잘못누르셨습니다.");
//				System.out.println(msg);
//
//			}
//		}
//	}
//
//}

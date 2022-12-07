package swPrj;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class Display {
	public void show() {
		Account newone = new Account();
		Admin boss = new Admin();

		while (true) {
			System.out.println("Enter your choice:");
			System.out.println("1-Sign up as a user");
			System.out.println("2-Sign in as an admin or as a user");
			System.out.println("3-Sign out");
			System.out.println("4-Exit");
			Scanner myObj = new Scanner(System.in);
			Scanner myObj2 = new Scanner(System.in);
			Scanner n = new Scanner(System.in);
			int choice = myObj.nextInt();

			if (choice == 1) {
				System.out.println("Enter your username:");
				String name = myObj2.nextLine();
				System.out.println("Enter your Email:");
				String email = myObj2.nextLine();
				System.out.println("Enter your password:");
				String password = myObj2.nextLine();
				if (newone.signUp(name, password, email)) {
					System.out.println("Signed up successfully!");
				} else {
					System.out.println("This account already exists");
				}
			} else if (choice == 2) {
				System.out.println("Enter your username:");
				String name2 = myObj2.nextLine();
				System.out.println("Enter your Email:");
				String email2 = myObj2.nextLine();
				System.out.println("Enter your password:");
				String password2 = myObj2.nextLine();
				if (newone.signIn(name2, password2, email2)) {
					User newOne = Account.checkSignIn(email2, password2);
					System.out.println("Signed In successfully");
					System.out.println("1-Do a transaction");
					System.out.println("2-view wallet balance");
					System.out.println("3-add to wallet");
					System.out.println("4-Check discounts");
					int menuChoice = myObj.nextInt();
					if (menuChoice == 1) {
						System.out.println("Which service you want to search for?");
						int searchChoice = newOne.searchService();
						if (searchChoice == 1) {
							System.out.println("Ok mobile service.");
							MobileRecharge mR = new MobileRecharge();
							System.out.println("Choose the provider you want to use:");
							System.out.println("1-Vodafone");
							System.out.println("2-Etisalat");
							System.out.println("3-Orange");
							System.out.println("4-We");
							int providersChoice = myObj.nextInt();
							if (providersChoice == 1) {
								System.out.println("Choose your payment method: ");
								System.out.println("1-Cash");
								System.out.println("2-CreditCard");
								System.out.println("3-Wallet");
								int paymentChoice = myObj.nextInt();
								if (paymentChoice == 1) {
									System.out.print("Enter amount of money: ");
									double amount = myObj.nextDouble();
									System.out.println("Enter your phone number (must be equal 11 numbers)");
									String num = n.nextLine();
									Form fo = new Form(num, amount);
									Handler h = new Handler(fo);
									double o = 0, s = 0;
									if (boss.od.size() > 0) {
										o = boss.od.get(0).getDiscount();
									}
									if (boss.sd.size() > 0) {
										s = boss.sd.get(0).getDiscount();
									}
									o += s;

									if (mR.voda.cash1.pay(newOne, amount - o) && h.handle()) {
										System.out.println("Payment is done successfully :)");
									} else {
										System.out.println("Payment failed");
									}
								} else if (paymentChoice == 2) {
									System.out.print("Enter amount of money: ");
									double amount = myObj.nextDouble();
									System.out.println("Enter your phone number (must be equal 11 numbers)");
									String num = n.nextLine();
									Form fo = new Form(num, amount);
									Handler h = new Handler(fo);
									double o = 0, s = 0;
									if (boss.od.size() > 0) {
										o = boss.od.get(0).getDiscount();
									}
									if (boss.sd.size() > 0) {
										s = boss.sd.get(0).getDiscount();
									}
									o += s;
									if (mR.voda.creditCard1.pay(newOne, amount - o) && h.handle()) {
										System.out.println("Payment is done successfully :)");
									} else {
										System.out.println("Payment failed");
									}
								} else if (paymentChoice == 3) {
									System.out.print("Enter amount of money: ");
									double amount = myObj.nextDouble();
									System.out.println("Enter your phone number (must be equal 11 numbers)");
									String num = n.nextLine();
									Form fo = new Form(num, amount);
									Handler h = new Handler(fo);
									double o = 0, s = 0;
									if (boss.od.size() > 0) {
										o = boss.od.get(0).getDiscount();
									}
									if (boss.sd.size() > 0) {
										s = boss.sd.get(0).getDiscount();
									}
									o += s;
									if (mR.voda.wallet1.pay(newOne, amount - o) && h.handle()) {
										System.out.println("Payment is done successfully :)");
									} else {
										System.out.println("Payment failed");
									}
								}
							} else if (providersChoice == 2) {
								System.out.println("Choose your payment method: ");
								System.out.println("1-Cash");
								System.out.println("2-CreditCard");
								System.out.println("3-Wallet");
								int paymentChoice = myObj.nextInt();
								if (paymentChoice == 1) {
									System.out.print("Enter amount of money: ");
									double amount = myObj.nextDouble();
									System.out.println("Enter your phone number (must be equal 11 numbers)");
									String num = n.nextLine();
									Form fo = new Form(num, amount);
									Handler h = new Handler(fo);
									double o = 0, s = 0;
									if (boss.od.size() > 0) {
										o = boss.od.get(0).getDiscount();
									}
									if (boss.sd.size() > 0) {
										s = boss.sd.get(0).getDiscount();
									}
									o += s;
									if (mR.etisalat.cash1.pay(newOne, amount - o) && h.handle()) {
										System.out.println("Payment is done successfully :)");
									} else {
										System.out.println("Payment failed");
									}
								} else if (paymentChoice == 2) {
									System.out.print("Enter amount of money: ");
									double amount = myObj.nextDouble();
									System.out.println("Enter your phone number (must be equal 11 numbers)");
									String num = n.nextLine();
									Form fo = new Form(num, amount);
									Handler h = new Handler(fo);
									double o = 0, s = 0;
									if (boss.od.size() > 0) {
										o = boss.od.get(0).getDiscount();
									}
									if (boss.sd.size() > 0) {
										s = boss.sd.get(0).getDiscount();
									}
									o += s;
									if (mR.etisalat.creditCard1.pay(newOne, amount - o) && h.handle()) {
										System.out.println("Payment is done successfully :)");
									} else {
										System.out.println("Payment failed");
									}
								} else if (paymentChoice == 3) {
									System.out.print("Enter amount of money: ");
									double amount = myObj.nextDouble();
									System.out.println("Enter your phone number (must be equal 11 numbers)");
									String num = n.nextLine();
									Form fo = new Form(num, amount);
									Handler h = new Handler(fo);
									double o = 0, s = 0;
									if (boss.od.size() > 0) {
										o = boss.od.get(0).getDiscount();
									}
									if (boss.sd.size() > 0) {
										s = boss.sd.get(0).getDiscount();
									}
									o += s;
									if (mR.etisalat.wallet1.pay(newOne, amount - o) && h.handle()) {
										System.out.println("Payment is done successfully :)");
									} else {
										System.out.println("Payment failed");
									}

								}
							} else if (providersChoice == 3) {
								System.out.println("Choose your payment method: ");
								System.out.println("1-Cash");
								System.out.println("2-CreditCard");
								System.out.println("3-Wallet");
								int paymentChoice = myObj.nextInt();
								if (paymentChoice == 1) {
									System.out.print("Enter amount of money: ");
									double amount = myObj.nextDouble();
									System.out.println("Enter your phone number (must be equal 11 numbers)");
									String num = n.nextLine();
									Form fo = new Form(num, amount);
									Handler h = new Handler(fo);
									double o = 0, s = 0;
									if (boss.od.size() > 0) {
										o = boss.od.get(0).getDiscount();
									}
									if (boss.sd.size() > 0) {
										s = boss.sd.get(0).getDiscount();
									}
									o += s;
									if (mR.orange.cash1.pay(newOne, amount - o) && h.handle()) {
										System.out.println("Payment is done successfully :)");
									} else {
										System.out.println("Payment failed");
									}
								} else if (paymentChoice == 2) {
									System.out.print("Enter amount of money: ");
									double amount = myObj.nextDouble();
									System.out.println("Enter your phone number (must be equal 11 numbers)");
									String num = n.nextLine();
									Form fo = new Form(num, amount);
									Handler h = new Handler(fo);
									double o = 0, s = 0;
									if (boss.od.size() > 0) {
										o = boss.od.get(0).getDiscount();
									}
									if (boss.sd.size() > 0) {
										s = boss.sd.get(0).getDiscount();
									}
									o += s;
									if (mR.orange.creditCard1.pay(newOne, amount - o) && h.handle()) {
										System.out.println("Payment is done successfully :)");
									} else {
										System.out.println("Payment failed");
									}
								} else if (paymentChoice == 3) {
									System.out.print("Enter amount of money: ");
									double amount = myObj.nextDouble();
									System.out.println("Enter your phone number (must be equal 11 numbers)");
									String num = n.nextLine();
									Form fo = new Form(num, amount);
									Handler h = new Handler(fo);
									double o = 0, s = 0;
									if (boss.od.size() > 0) {
										o = boss.od.get(0).getDiscount();
									}
									if (boss.sd.size() > 0) {
										s = boss.sd.get(0).getDiscount();
									}
									o += s;
									if (mR.orange.wallet1.pay(newOne, amount - o) && h.handle()) {
										System.out.println("Payment is done successfully :)");
									} else {
										System.out.println("Payment failed");
									}

								}
							} else if (providersChoice == 4) {
								System.out.println("Choose your payment method: ");
								System.out.println("1-Cash");
								System.out.println("2-CreditCard");
								System.out.println("3-Wallet");
								int paymentChoice = myObj.nextInt();
								if (paymentChoice == 1) {
									System.out.print("Enter amount of money: ");
									double amount = myObj.nextDouble();
									System.out.println("Enter your phone number (must be equal 11 numbers)");
									String num = n.nextLine();
									Form fo = new Form(num, amount);
									Handler h = new Handler(fo);
									double o = 0, s = 0;
									if (boss.od.size() > 0) {
										o = boss.od.get(0).getDiscount();
									}
									if (boss.sd.size() > 0) {
										s = boss.sd.get(0).getDiscount();
									}
									o += s;
									if (mR.we.cash1.pay(newOne, amount - o) && h.handle()) {
										System.out.println("Payment is done successfully :)");
									} else {
										System.out.println("Payment failed");
									}
								} else if (paymentChoice == 2) {
									System.out.print("Enter amount of money: ");
									double amount = myObj.nextDouble();
									System.out.println("Enter your phone number (must be equal 11 numbers)");
									String num = n.nextLine();
									Form fo = new Form(num, amount);
									Handler h = new Handler(fo);
									double o = 0, s = 0;
									if (boss.od.size() > 0) {
										o = boss.od.get(0).getDiscount();
									}
									if (boss.sd.size() > 0) {
										s = boss.sd.get(0).getDiscount();
									}
									o += s;
									if (mR.we.creditCard1.pay(newOne, amount - o) && h.handle()) {
										System.out.println("Payment is done successfully :)");
									} else {
										System.out.println("Payment failed");
									}
								} else if (paymentChoice == 3) {
									System.out.print("Enter amount of money: ");
									double amount = myObj.nextDouble();
									System.out.println("Enter your phone number (must be equal 11 numbers)");
									String num = n.nextLine();
									Form fo = new Form(num, amount);
									Handler h = new Handler(fo);
									double o = 0, s = 0;
									if (boss.od.size() > 0) {
										o = boss.od.get(0).getDiscount();
									}
									if (boss.sd.size() > 0) {
										s = boss.sd.get(0).getDiscount();
									}
									o += s;
									if (mR.we.wallet1.pay(newOne, amount - o) && h.handle()) {
										System.out.println("Payment is done successfully :)");
									} else {
										System.out.println("Payment failed");
									}

								}
							} else {
								System.out.println("Wrong Choice");
							}

						} else if (searchChoice == 2) {
							System.out.println("okayyy internet");
							InternetPayment in = new InternetPayment();
							System.out.println("Choose the provider you want to use:");
							System.out.println("1-Vodafone");
							System.out.println("2-Etisalat");
							System.out.println("3-Orange");
							System.out.println("4-We");
							int providersChoice = myObj.nextInt();
							if (providersChoice == 1) {
								System.out.println("Choose your payment method: ");
								System.out.println("1-Cash");
								System.out.println("2-CreditCard");
								System.out.println("3-Wallet");
								int paymentChoice = myObj.nextInt();
								if (paymentChoice == 1) {
									System.out.print("Enter amount of money: ");
									double amount = myObj.nextDouble();
									System.out.println("Enter your phone number (must be equal 11 numbers)");
									String num = n.nextLine();
									Form fo = new Form(num, amount);
									Handler h = new Handler(fo);
									double o = 0, s = 0;
									if (boss.od.size() > 0) {
										o = boss.od.get(0).getDiscount();
									}
									if (boss.sd.size() > 0) {
										s = boss.sd.get(0).getDiscount();
									}
									o += s;
									if (in.voda.cash1.pay(newOne, amount - o) && h.handle()) {
										System.out.println("Payment is done successfully :)");
									} else {
										System.out.println("Payment failed");
									}
								} else if (paymentChoice == 2) {
									System.out.print("Enter amount of money: ");
									double amount = myObj.nextDouble();
									System.out.println("Enter your phone number (must be equal 11 numbers)");
									String num = n.nextLine();
									Form fo = new Form(num, amount);
									Handler h = new Handler(fo);
									double o = 0, s = 0;
									if (boss.od.size() > 0) {
										o = boss.od.get(0).getDiscount();
									}
									if (boss.sd.size() > 0) {
										s = boss.sd.get(0).getDiscount();
									}
									o += s;
									if (in.voda.creditCard1.pay(newOne, amount - o) && h.handle()) {
										System.out.println("Payment is done successfully :)");
									} else {
										System.out.println("Payment failed");
									}
								} else if (paymentChoice == 3) {
									System.out.print("Enter amount of money: ");
									double amount = myObj.nextDouble();
									System.out.println("Enter your phone number (must be equal 11 numbers)");
									String num = n.nextLine();
									Form fo = new Form(num, amount);
									Handler h = new Handler(fo);
									double o = 0, s = 0;
									if (boss.od.size() > 0) {
										o = boss.od.get(0).getDiscount();
									}
									if (boss.sd.size() > 0) {
										s = boss.sd.get(0).getDiscount();
									}
									o += s;
									if (in.voda.wallet1.pay(newOne, amount - o) && h.handle()) {
										System.out.println("Payment is done successfully :)");
									} else {
										System.out.println("Payment failed");
									}

								}
							} else if (providersChoice == 2) {
								System.out.println("Choose your payment method: ");
								System.out.println("1-Cash");
								System.out.println("2-CreditCard");
								System.out.println("3-Wallet");
								int paymentChoice = myObj.nextInt();
								if (paymentChoice == 1) {
									System.out.print("Enter amount of money: ");
									double amount = myObj.nextDouble();
									System.out.println("Enter your phone number (must be equal 11 numbers)");
									String num = n.nextLine();
									Form fo = new Form(num, amount);
									Handler h = new Handler(fo);
									double o = 0, s = 0;
									if (boss.od.size() > 0) {
										o = boss.od.get(0).getDiscount();
									}
									if (boss.sd.size() > 0) {
										s = boss.sd.get(0).getDiscount();
									}
									o += s;
									if (in.etisalat.cash1.pay(newOne, amount - o) && h.handle()) {
										System.out.println("Payment is done successfully :)");
									} else {
										System.out.println("Payment failed");
									}
								} else if (paymentChoice == 2) {
									System.out.print("Enter amount of money: ");
									double amount = myObj.nextDouble();
									System.out.println("Enter your phone number (must be equal 11 numbers)");
									String num = n.nextLine();
									Form fo = new Form(num, amount);
									Handler h = new Handler(fo);
									double o = 0, s = 0;
									if (boss.od.size() > 0) {
										o = boss.od.get(0).getDiscount();
									}
									if (boss.sd.size() > 0) {
										s = boss.sd.get(0).getDiscount();
									}
									o += s;
									if (in.etisalat.creditCard1.pay(newOne, amount - o) && h.handle()) {
										System.out.println("Payment is done successfully :)");
									} else {
										System.out.println("Payment failed");
									}
								} else if (paymentChoice == 3) {
									System.out.print("Enter amount of money: ");
									double amount = myObj.nextDouble();
									System.out.println("Enter your phone number (must be equal 11 numbers)");
									String num = n.nextLine();
									Form fo = new Form(num, amount);
									Handler h = new Handler(fo);
									double o = 0, s = 0;
									if (boss.od.size() > 0) {
										o = boss.od.get(0).getDiscount();
									}
									if (boss.sd.size() > 0) {
										s = boss.sd.get(0).getDiscount();
									}
									o += s;
									if (in.etisalat.wallet1.pay(newOne, amount - o) && h.handle()) {
										System.out.println("Payment is done successfully :)");
									} else {
										System.out.println("Payment failed");
									}
								}
							} else if (providersChoice == 3) {
								System.out.println("Choose your payment method: ");
								System.out.println("1-Cash");
								System.out.println("2-CreditCard");
								System.out.println("3-Wallet");
								int paymentChoice = myObj.nextInt();
								if (paymentChoice == 1) {
									System.out.print("Enter amount of money: ");
									double amount = myObj.nextDouble();
									System.out.println("Enter your phone number (must be equal 11 numbers)");
									String num = n.nextLine();
									Form fo = new Form(num, amount);
									Handler h = new Handler(fo);
									double o = 0, s = 0;
									if (boss.od.size() > 0) {
										o = boss.od.get(0).getDiscount();
									}
									if (boss.sd.size() > 0) {
										s = boss.sd.get(0).getDiscount();
									}
									o += s;
									if (in.orange.cash1.pay(newOne, amount - o) && h.handle()) {
										System.out.println("Payment is done successfully :)");
									} else {
										System.out.println("Payment failed");
									}
								} else if (paymentChoice == 2) {
									System.out.print("Enter amount of money: ");
									double amount = myObj.nextDouble();
									System.out.println("Enter your phone number (must be equal 11 numbers)");
									String num = n.nextLine();
									Form fo = new Form(num, amount);
									Handler h = new Handler(fo);
									double o = 0, s = 0;
									if (boss.od.size() > 0) {
										o = boss.od.get(0).getDiscount();
									}
									if (boss.sd.size() > 0) {
										s = boss.sd.get(0).getDiscount();
									}
									o += s;
									if (in.orange.creditCard1.pay(newOne, amount - o) && h.handle()) {
										System.out.println("Payment is done successfully :)");
									} else {
										System.out.println("Payment failed");
									}
								} else if (paymentChoice == 3) {
									System.out.print("Enter amount of money: ");
									double amount = myObj.nextDouble();
									System.out.println("Enter your phone number (must be equal 11 numbers)");
									String num = n.nextLine();
									Form fo = new Form(num, amount);
									Handler h = new Handler(fo);
									double o = 0, s = 0;
									if (boss.od.size() > 0) {
										o = boss.od.get(0).getDiscount();
									}
									if (boss.sd.size() > 0) {
										s = boss.sd.get(0).getDiscount();
									}
									o += s;
									if (in.orange.wallet1.pay(newOne, amount - o) && h.handle()) {
										System.out.println("Payment is done successfully :)");
									} else {
										System.out.println("Payment failed");
									}

								}
							} else if (providersChoice == 4) {
								System.out.println("Choose your payment method: ");
								System.out.println("1-Cash");
								System.out.println("2-CreditCard");
								System.out.println("3-Wallet");
								int paymentChoice = myObj.nextInt();
								if (paymentChoice == 1) {
									System.out.print("Enter amount of money: ");
									double amount = myObj.nextDouble();
									System.out.println("Enter your phone number (must be equal 11 numbers)");
									String num = n.nextLine();
									Form fo = new Form(num, amount);
									Handler h = new Handler(fo);
									double o = 0, s = 0;
									if (boss.od.size() > 0) {
										o = boss.od.get(0).getDiscount();
									}
									if (boss.sd.size() > 0) {
										s = boss.sd.get(0).getDiscount();
									}
									o += s;
									if (in.we.cash1.pay(newOne, amount - o) && h.handle()) {
										System.out.println("Payment is done successfully :)");
									} else {
										System.out.println("Payment failed");
									}
								} else if (paymentChoice == 2) {
									System.out.print("Enter amount of money: ");
									double amount = myObj.nextDouble();
									System.out.println("Enter your phone number (must be equal 11 numbers)");
									String num = n.nextLine();
									Form fo = new Form(num, amount);
									Handler h = new Handler(fo);
									double o = 0, s = 0;
									if (boss.od.size() > 0) {
										o = boss.od.get(0).getDiscount();
									}
									if (boss.sd.size() > 0) {
										s = boss.sd.get(0).getDiscount();
									}
									o += s;
									if (in.we.creditCard1.pay(newOne, amount - o) && h.handle()) {
										System.out.println("Payment is done successfully :)");
									} else {
										System.out.println("Payment failed");
									}
								} else if (paymentChoice == 3) {
									System.out.print("Enter amount of money: ");
									double amount = myObj.nextDouble();
									System.out.println("Enter your phone number (must be equal 11 numbers)");
									String num = n.nextLine();
									Form fo = new Form(num, amount);
									Handler h = new Handler(fo);
									double o = 0, s = 0;
									if (boss.od.size() > 0) {
										o = boss.od.get(0).getDiscount();
									}
									if (boss.sd.size() > 0) {
										s = boss.sd.get(0).getDiscount();
									}
									o += s;
									if (in.we.wallet1.pay(newOne, amount - o) && h.handle()) {
										System.out.println("Payment is done successfully :)");
									} else {
										System.out.println("Payment failed");
									}
								}
							} else {
								System.out.println("Wrong Choice");
							}
						} else if (searchChoice == 3) {
							System.out.println("Okay landlineee");
							Landline ll = new Landline();
							System.out.println("Choose the provider you want to use:");
							System.out.println("1-Monthly Receipt");
							System.out.println("2-Quarter Receipt");
							int providersChoice = myObj.nextInt();
							if (providersChoice == 1) {
								System.out.println("Choose your payment method: ");
								System.out.println("1-Cash");
								System.out.println("2-CreditCard");
								System.out.println("3-Wallet");
								int paymentChoice = myObj.nextInt();
								if (paymentChoice == 1) {
									System.out.print("Enter amount of money: ");
									double amount = myObj.nextDouble();
									System.out.println("Enter your phone number (must be equal 11 numbers)");
									String num = n.nextLine();
									Form fo = new Form(num, amount);
									Handler h = new Handler(fo);
									double o = 0, s = 0;
									if (boss.od.size() > 0) {
										o = boss.od.get(0).getDiscount();
									}
									if (boss.sd.size() > 0) {
										s = boss.sd.get(0).getDiscount();
									}
									o += s;
									if (ll.mR.cash1.pay(newOne, amount - o) && h.handle()) {
										System.out.println("Payment is done successfully :)");
									} else {
										System.out.println("Payment failed");
									}
								} else if (paymentChoice == 2) {
									System.out.print("Enter amount of money: ");
									double amount = myObj.nextDouble();
									System.out.println("Enter your phone number (must be equal 11 numbers)");
									String num = n.nextLine();
									Form fo = new Form(num, amount);
									Handler h = new Handler(fo);
									double o = 0, s = 0;
									if (boss.od.size() > 0) {
										o = boss.od.get(0).getDiscount();
									}
									if (boss.sd.size() > 0) {
										s = boss.sd.get(0).getDiscount();
									}
									o += s;
									if (ll.mR.creditCard1.pay(newOne, amount - o) && h.handle()) {
										System.out.println("Payment is done successfully :)");
									} else {
										System.out.println("Payment failed");
									}
								} else if (paymentChoice == 3) {
									System.out.print("Enter amount of money: ");
									double amount = myObj.nextDouble();
									System.out.println("Enter your phone number (must be equal 11 numbers)");
									String num = n.nextLine();
									Form fo = new Form(num, amount);
									Handler h = new Handler(fo);
									double o = 0, s = 0;
									if (boss.od.size() > 0) {
										o = boss.od.get(0).getDiscount();
									}
									if (boss.sd.size() > 0) {
										s = boss.sd.get(0).getDiscount();
									}
									o += s;
									if (ll.mR.wallet1.pay(newOne, amount - o) && h.handle()) {
										System.out.println("Payment is done successfully :)");
									} else {
										System.out.println("Payment failed");
									}
								}
							} else if (providersChoice == 2) {
								System.out.println("Choose your payment method: ");
								System.out.println("1-Cash");
								System.out.println("2-CreditCard");
								System.out.println("3-Wallet");
								int paymentChoice = myObj.nextInt();
								if (paymentChoice == 1) {
									System.out.print("Enter amount of money: ");
									double amount = myObj.nextDouble();
									System.out.println("Enter your phone number (must be equal 11 numbers)");
									String num = n.nextLine();
									Form fo = new Form(num, amount);
									Handler h = new Handler(fo);
									double o = 0, s = 0;
									if (boss.od.size() > 0) {
										o = boss.od.get(0).getDiscount();
									}
									if (boss.sd.size() > 0) {
										s = boss.sd.get(0).getDiscount();
									}
									o += s;
									if (ll.qR.cash1.pay(newOne, amount - o) && h.handle()) {
										System.out.println("Payment is done successfully :)");
									} else {
										System.out.println("Payment failed");
									}
								} else if (paymentChoice == 2) {
									System.out.print("Enter amount of money: ");
									double amount = myObj.nextDouble();
									System.out.println("Enter your phone number (must be equal 11 numbers)");
									String num = n.nextLine();
									Form fo = new Form(num, amount);
									Handler h = new Handler(fo);
									double o = 0, s = 0;
									if (boss.od.size() > 0) {
										o = boss.od.get(0).getDiscount();
									}
									if (boss.sd.size() > 0) {
										s = boss.sd.get(0).getDiscount();
									}
									o += s;
									if (ll.qR.creditCard1.pay(newOne, amount - o) && h.handle()) {
										System.out.println("Payment is done successfully :)");
									} else {
										System.out.println("Payment failed");
									}
								} else if (paymentChoice == 3) {
									System.out.print("Enter amount of money: ");
									double amount = myObj.nextDouble();
									System.out.println("Enter your phone number (must be equal 11 numbers)");
									String num = n.nextLine();
									Form fo = new Form(num, amount);
									Handler h = new Handler(fo);
									double o = 0, s = 0;
									if (boss.od.size() > 0) {
										o = boss.od.get(0).getDiscount();
									}
									if (boss.sd.size() > 0) {
										s = boss.sd.get(0).getDiscount();
									}
									o += s;
									if (ll.qR.wallet1.pay(newOne, amount - o) && h.handle()) {
										System.out.println("Payment is done successfully :)");
									} else {
										System.out.println("Payment failed");
									}
								}
							} else {
								System.out.println("Wrong Choice");
							}
						} else if (searchChoice == 4) {
							System.out.println("Okay Donations");
							Donations d = new Donations();
							System.out.println("Choose the provider you want to use:");
							System.out.println("1-Cancer Hospital");
							System.out.println("2-Schools");
							System.out.println("3-NGOs");
							int providersChoice = myObj.nextInt();
							if (providersChoice == 1) {
								System.out.println("Choose your payment method: ");
								System.out.println("1-Cash");
								System.out.println("2-CreditCard");
								System.out.println("3-Wallet");
								int paymentChoice = myObj.nextInt();
								if (paymentChoice == 1) {
									System.out.print("Enter amount of money: ");
									double amount = myObj.nextDouble();
									System.out.println("Enter your phone number (must be equal 11 numbers)");
									String num = n.nextLine();
									Form fo = new Form(num, amount);
									Handler h = new Handler(fo);
									double o = 0, s = 0;
									if (boss.od.size() > 0) {
										o = boss.od.get(0).getDiscount();
									}
									if (boss.sd.size() > 0) {
										s = boss.sd.get(0).getDiscount();
									}
									o += s;
									if (d.cH.cash1.pay(newOne, amount - o) && h.handle()) {
										System.out.println("Payment is done successfully :)");
									} else {
										System.out.println("Payment failed");
									}
								} else if (paymentChoice == 2) {
									System.out.print("Enter amount of money: ");
									double amount = myObj.nextDouble();
									System.out.println("Enter your phone number (must be equal 11 numbers)");
									String num = n.nextLine();
									Form fo = new Form(num, amount);
									Handler h = new Handler(fo);
									double o = 0, s = 0;
									if (boss.od.size() > 0) {
										o = boss.od.get(0).getDiscount();
									}
									if (boss.sd.size() > 0) {
										s = boss.sd.get(0).getDiscount();
									}
									o += s;
									if (d.cH.creditCard1.pay(newOne, amount - o) && h.handle()) {
										System.out.println("Payment is done successfully :)");
									} else {
										System.out.println("Payment failed");
									}
								} else if (paymentChoice == 3) {
									System.out.print("Enter amount of money: ");
									double amount = myObj.nextDouble();
									System.out.println("Enter your phone number (must be equal 11 numbers)");
									String num = n.nextLine();
									Form fo = new Form(num, amount);
									Handler h = new Handler(fo);
									double o = 0, s = 0;
									if (boss.od.size() > 0) {
										o = boss.od.get(0).getDiscount();
									}
									if (boss.sd.size() > 0) {
										s = boss.sd.get(0).getDiscount();
									}
									o += s;
									if (d.cH.wallet1.pay(newOne, amount - o) && h.handle()) {
										System.out.println("Payment is done successfully :)");
									} else {
										System.out.println("Payment failed");
									}
								}
							} else if (providersChoice == 2) {
								System.out.println("Choose your payment method: ");
								System.out.println("1-Cash");
								System.out.println("2-CreditCard");
								System.out.println("3-Wallet");
								int paymentChoice = myObj.nextInt();
								if (paymentChoice == 1) {
									System.out.print("Enter amount of money: ");
									double amount = myObj.nextDouble();
									System.out.println("Enter your phone number (must be equal 11 numbers)");
									String num = n.nextLine();
									Form fo = new Form(num, amount);
									Handler h = new Handler(fo);
									double o = 0, s = 0;
									if (boss.od.size() > 0) {
										o = boss.od.get(0).getDiscount();
									}
									if (boss.sd.size() > 0) {
										s = boss.sd.get(0).getDiscount();
									}
									o += s;
									if (d.s.cash1.pay(newOne, amount - o) && h.handle()) {
										System.out.println("Payment is done successfully :)");
									} else {
										System.out.println("Payment failed");
									}
								} else if (paymentChoice == 2) {
									System.out.print("Enter amount of money: ");
									double amount = myObj.nextDouble();
									System.out.println("Enter your phone number (must be equal 11 numbers)");
									String num = n.nextLine();
									Form fo = new Form(num, amount);
									Handler h = new Handler(fo);
									double o = 0, s = 0;
									if (boss.od.size() > 0) {
										o = boss.od.get(0).getDiscount();
									}
									if (boss.sd.size() > 0) {
										s = boss.sd.get(0).getDiscount();
									}
									o += s;
									if (d.s.creditCard1.pay(newOne, amount - o) && h.handle()) {
										System.out.println("Payment is done successfully :)");
									} else {
										System.out.println("Payment failed");
									}
								} else if (paymentChoice == 3) {
									System.out.print("Enter amount of money: ");
									double amount = myObj.nextDouble();
									System.out.println("Enter your phone number (must be equal 11 numbers)");
									String num = n.nextLine();
									Form fo = new Form(num, amount);
									Handler h = new Handler(fo);
									double o = 0, s = 0;
									if (boss.od.size() > 0) {
										o = boss.od.get(0).getDiscount();
									}
									if (boss.sd.size() > 0) {
										s = boss.sd.get(0).getDiscount();
									}
									o += s;
									if (d.s.wallet1.pay(newOne, amount - o) && h.handle()) {
										System.out.println("Payment is done successfully :)");
									} else {
										System.out.println("Payment failed");
									}
								}
							} else if (providersChoice == 3) {
								System.out.println("Choose your payment method: ");
								System.out.println("1-Cash");
								System.out.println("2-CreditCard");
								System.out.println("3-Wallet");
								int paymentChoice = myObj.nextInt();
								if (paymentChoice == 1) {
									System.out.print("Enter amount of money: ");
									double amount = myObj.nextDouble();
									System.out.println("Enter your phone number (must be equal 11 numbers)");
									String num = n.nextLine();
									Form fo = new Form(num, amount);
									Handler h = new Handler(fo);
									double o = 0, s = 0;
									if (boss.od.size() > 0) {
										o = boss.od.get(0).getDiscount();
									}
									if (boss.sd.size() > 0) {
										s = boss.sd.get(0).getDiscount();
									}
									o += s;
									if (d.ngo.cash1.pay(newOne, amount - o) && h.handle()) {
										System.out.println("Payment is done successfully :)");
									} else {
										System.out.println("Payment failed");
									}
								} else if (paymentChoice == 2) {
									System.out.print("Enter amount of money: ");
									double amount = myObj.nextDouble();
									System.out.println("Enter your phone number (must be equal 11 numbers)");
									String num = n.nextLine();
									Form fo = new Form(num, amount);
									Handler h = new Handler(fo);
									double o = 0, s = 0;
									if (boss.od.size() > 0) {
										o = boss.od.get(0).getDiscount();
									}
									if (boss.sd.size() > 0) {
										s = boss.sd.get(0).getDiscount();
									}
									o += s;
									if (d.ngo.creditCard1.pay(newOne, amount - o) && h.handle()) {
										System.out.println("Payment is done successfully :)");
									} else {
										System.out.println("Payment failed");
									}
								} else if (paymentChoice == 3) {
									System.out.print("Enter amount of money: ");
									double amount = myObj.nextDouble();
									System.out.println("Enter your phone number (must be equal 11 numbers)");
									String num = n.nextLine();
									Form fo = new Form(num, amount);
									Handler h = new Handler(fo);
									double o = 0, s = 0;
									if (boss.od.size() > 0) {
										o = boss.od.get(0).getDiscount();
									}
									if (boss.sd.size() > 0) {
										s = boss.sd.get(0).getDiscount();
									}
									o += s;
									if (d.ngo.wallet1.pay(newOne, amount - o) && h.handle()) {
										System.out.println("Payment is done successfully :)");
									} else {
										System.out.println("Payment failed");
									}
								}

							} else {
								System.out.println("Wrong Choice");
							}

						}
						System.out.println("Do you want to make a refund for last transaction");
						System.out.println("1-Yes");
						System.out.println("2-No");
						int refundChoice = myObj.nextInt();
						if (refundChoice == 1) {
							if (newOne.createRefundRequest(newOne)) {
								System.out.println("Your refund request has sent to the admin");
							}
						}

					} else if (menuChoice == 2) {
						System.out.println("Your balance in the wallet is " + newOne.wal);

					} else if (menuChoice == 3) {
						System.out.println("How much funds you want to add to the wallet?");
						Scanner funds = new Scanner(System.in);
						double fund = funds.nextDouble();

						newOne.addFunds(fund);
					} else if (menuChoice == 4) {
						System.out.println("Select what discounts type you want to see");
						System.out.println("1-Overall discount");
						System.out.println("2-Specific discount");
						int discountChoice = myObj.nextInt();
						if (discountChoice == 1) {
							for (int i = 0; i < boss.od.size(); i++) {
								System.out.println("Discount " + boss.od.get(i).getDiscount());
							}

						} else if (discountChoice == 2) {
							for (int i = 0; i < boss.sd.size(); i++) {
								System.out.println("Discount " + boss.sd.get(i).getDiscount() + "for this service --> "
										+ boss.sd.get(i).s);
							}

						}
					}

				} else if (name2.equals("admin") && password2.equals("admin") && email2.equals("admin")) {
					System.out.println("Hello Admin!");
					System.out.println("Enter your choice");
					System.out.println("1-Add discount");
					System.out.println("2-Refund requests");
					System.out.println("3-Exit");

					int adminChoice = myObj.nextInt();
					if (adminChoice == 1) {
						System.out.println("Choose what discount you want to add?");
						System.out.println("1-Overall");
						System.out.println("2-Specific");

						int s = myObj.nextInt();
						if (s == 1) {
							System.out.println("Enter the amount of discount");
							Scanner d = new Scanner(System.in);
							double am = myObj.nextDouble();
							boss.addOverall(am);
						} else if (s == 2) {
							System.out.println("Enter the amount of discount");
							int amt = myObj.nextInt();
							System.out.println("Enter the name of service");
							Scanner m = new Scanner(System.in);
							String maa = m.nextLine();
							boss.addSpecific(amt, maa);
						}

					} else if (adminChoice == 2) {
						for (int i = 0; i < boss.r.size(); i++) {
							System.out
									.println(boss.r.get(i).name + " Has requested a refund of " + boss.r.get(i).money);
							System.out.println("1-Accept");
							System.out.println("2-Refuse");
							int reqChoice = myObj.nextInt();
							if (reqChoice == 1) {
								if (boss.acceptRequest(boss.r.get(i).name)) {
									System.out.println("Request accepted");
								} else {
									System.out.println("There is not a refund request by this username");
								}
							} else {
								System.out.println("Request refused");
							}

						}

					} else if (adminChoice == 3) {
						break;
					}
				} else if (!newone.signIn(name2, password2, email2)) {
					System.out.println("Wrong info");
				}
			} else if (choice == 3) {
				if (newone.checkSignOut()) {
					System.out.println("You must to sign in to sign out");
				} else {
					System.out.println("Signed out successfully");
				}
			} else if (choice >= 4) {
				break;
			}

		}
		System.out.println("Thanks for using our software program :)");
	}

	public Display() {
		// TODO Auto-generated constructor stub
	}

}

package swPrj;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		Account newone = new Account();
		
		while (true) {
			System.out.println("Enter your choice:");
			System.out.println("1-Sign up");
			System.out.println("2-Sign in");
			System.out.println("3-Sign out");
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
					System.out.println("Signed In successfully");
					System.out.println(" ");
					User newOne = new User(name2, password2, email2);
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
								System.out.println("Enter your phone number (must equal 11 numbers)");
								String num = n.nextLine();
								Form fo = new Form(num, amount);
								Handler h = new Handler(fo);

								if (mR.voda.cash1.pay(newOne, amount) && h.handle()) {
									System.out.println("Payment is done successfully");
								}
							} else if (paymentChoice == 2) {
								System.out.print("Enter amount of money: ");
								double amount = myObj.nextDouble();
								System.out.println("Enter your phone number (must equal 11 numbers)");
								String num = n.nextLine();
								Form fo = new Form(num, amount);
								Handler h = new Handler(fo);

								if (mR.voda.creditCard1.pay(newOne, amount) && h.handle()) {
									System.out.println("Payment is done successfully");
								}
							} else if (paymentChoice == 3) {

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
								System.out.println("Enter your phone number (must equal 11 numbers)");
								String num = n.nextLine();
								Form fo = new Form(num, amount);
								Handler h = new Handler(fo);

								if (mR.etisalat.cash1.pay(newOne, amount) && h.handle()) {
									System.out.println("Payment is done successfully");
								}
							} else if (paymentChoice == 2) {
								System.out.print("Enter amount of money: ");
								double amount = myObj.nextDouble();
								System.out.println("Enter your phone number (must equal 11 numbers)");
								String num = n.nextLine();
								Form fo = new Form(num, amount);
								Handler h = new Handler(fo);

								if (mR.etisalat.creditCard1.pay(newOne, amount) && h.handle()) {
									System.out.println("Payment is done successfully");
								}
							} else if (paymentChoice == 3) {

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
								System.out.println("Enter your phone number (must equal 11 numbers)");
								String num = n.nextLine();
								Form fo = new Form(num, amount);
								Handler h = new Handler(fo);

								if (mR.orange.cash1.pay(newOne, amount) && h.handle()) {
									System.out.println("Payment is done successfully");
								}
							} else if (paymentChoice == 2) {
								System.out.print("Enter amount of money: ");
								double amount = myObj.nextDouble();
								System.out.println("Enter your phone number (must equal 11 numbers)");
								String num = n.nextLine();
								Form fo = new Form(num, amount);
								Handler h = new Handler(fo);

								if (mR.orange.creditCard1.pay(newOne, amount) && h.handle()) {
									System.out.println("Payment is done successfully");
								}
							} else if (paymentChoice == 3) {

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
								System.out.println("Enter your phone number (must equal 11 numbers)");
								String num = n.nextLine();
								Form fo = new Form(num, amount);
								Handler h = new Handler(fo);

								if (mR.we.cash1.pay(newOne, amount) && h.handle()) {
									System.out.println("Payment is done successfully");
								}
							} else if (paymentChoice == 2) {
								System.out.print("Enter amount of money: ");
								double amount = myObj.nextDouble();
								System.out.println("Enter your phone number (must equal 11 numbers)");
								String num = n.nextLine();
								Form fo = new Form(num, amount);
								Handler h = new Handler(fo);

								if (mR.we.creditCard1.pay(newOne, amount) && h.handle()) {
									System.out.println("Payment is done successfully");
								}
							} else if (paymentChoice == 3) {

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
								System.out.println("Enter your phone number (must equal 11 numbers)");
								String num = n.nextLine();
								Form fo = new Form(num, amount);
								Handler h = new Handler(fo);

								if (in.voda.cash1.pay(newOne, amount) && h.handle()) {
									System.out.println("Payment is done successfully");
								}
							} else if (paymentChoice == 2) {
								System.out.print("Enter amount of money: ");
								double amount = myObj.nextDouble();
								System.out.println("Enter your phone number (must equal 11 numbers)");
								String num = n.nextLine();
								Form fo = new Form(num, amount);
								Handler h = new Handler(fo);

								if (in.voda.creditCard1.pay(newOne, amount) && h.handle()) {
									System.out.println("Payment is done successfully");
								}
							} else if (paymentChoice == 3) {

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
								System.out.println("Enter your phone number (must equal 11 numbers)");
								String num = n.nextLine();
								Form fo = new Form(num, amount);
								Handler h = new Handler(fo);

								if (in.etisalat.cash1.pay(newOne, amount) && h.handle()) {
									System.out.println("Payment is done successfully");
								}
							} else if (paymentChoice == 2) {
								System.out.print("Enter amount of money: ");
								double amount = myObj.nextDouble();
								System.out.println("Enter your phone number (must equal 11 numbers)");
								String num = n.nextLine();
								Form fo = new Form(num, amount);
								Handler h = new Handler(fo);

								if (in.etisalat.creditCard1.pay(newOne, amount) && h.handle()) {
									System.out.println("Payment is done successfully");
								}
							} else if (paymentChoice == 3) {

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
								System.out.println("Enter your phone number (must equal 11 numbers)");
								String num = n.nextLine();
								Form fo = new Form(num, amount);
								Handler h = new Handler(fo);

								if (in.orange.cash1.pay(newOne, amount) && h.handle()) {
									System.out.println("Payment is done successfully");
								}
							} else if (paymentChoice == 2) {
								System.out.print("Enter amount of money: ");
								double amount = myObj.nextDouble();
								System.out.println("Enter your phone number (must equal 11 numbers)");
								String num = n.nextLine();
								Form fo = new Form(num, amount);
								Handler h = new Handler(fo);

								if (in.orange.creditCard1.pay(newOne, amount) && h.handle()) {
									System.out.println("Payment is done successfully");
								}
							} else if (paymentChoice == 3) {

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
								System.out.println("Enter your phone number (must equal 11 numbers)");
								String num = n.nextLine();
								Form fo = new Form(num, amount);
								Handler h = new Handler(fo);

								if (in.we.cash1.pay(newOne, amount) && h.handle()) {
									System.out.println("Payment is done successfully");
								}
							} else if (paymentChoice == 2) {
								System.out.print("Enter amount of money: ");
								double amount = myObj.nextDouble();
								System.out.println("Enter your phone number (must equal 11 numbers)");
								String num = n.nextLine();
								Form fo = new Form(num, amount);
								Handler h = new Handler(fo);

								if (in.we.creditCard1.pay(newOne, amount) && h.handle()) {
									System.out.println("Payment is done successfully");
								}
							} else if (paymentChoice == 3) {

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
								System.out.println("Enter your phone number (must equal 11 numbers)");
								String num = n.nextLine();
								Form fo = new Form(num, amount);
								Handler h = new Handler(fo);

								if (ll.mR.cash1.pay(newOne, amount) && h.handle()) {
									System.out.println("Payment is done successfully");
								}
							} else if (paymentChoice == 2) {
								System.out.print("Enter amount of money: ");
								double amount = myObj.nextDouble();
								System.out.println("Enter your phone number (must equal 11 numbers)");
								String num = n.nextLine();
								Form fo = new Form(num, amount);
								Handler h = new Handler(fo);

								if (ll.mR.creditCard1.pay(newOne, amount) && h.handle()) {
									System.out.println("Payment is done successfully");
								}
							} else if (paymentChoice == 3) {

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
								System.out.println("Enter your phone number (must equal 11 numbers)");
								String num = n.nextLine();
								Form fo = new Form(num, amount);
								Handler h = new Handler(fo);

								if (ll.qR.cash1.pay(newOne, amount) && h.handle()) {
									System.out.println("Payment is done successfully");
								}
							} else if (paymentChoice == 2) {
								System.out.print("Enter amount of money: ");
								double amount = myObj.nextDouble();
								System.out.println("Enter your phone number (must equal 11 numbers)");
								String num = n.nextLine();
								Form fo = new Form(num, amount);
								Handler h = new Handler(fo);

								if (ll.qR.creditCard1.pay(newOne, amount) && h.handle()) {
									System.out.println("Payment is done successfully");
								}
							} else if (paymentChoice == 3) {

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
								System.out.println("Enter your phone number (must equal 11 numbers)");
								String num = n.nextLine();
								Form fo = new Form(num, amount);
								Handler h = new Handler(fo);

								if (d.cH.cash1.pay(newOne, amount) && h.handle()) {
									System.out.println("Payment is done successfully");
								}
							} else if (paymentChoice == 2) {
								System.out.print("Enter amount of money: ");
								double amount = myObj.nextDouble();
								System.out.println("Enter your phone number (must equal 11 numbers)");
								String num = n.nextLine();
								Form fo = new Form(num, amount);
								Handler h = new Handler(fo);

								if (d.cH.creditCard1.pay(newOne, amount) && h.handle()) {
									System.out.println("Payment is done successfully");
								}
							} else if (paymentChoice == 3) {

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
								System.out.println("Enter your phone number (must equal 11 numbers)");
								String num = n.nextLine();
								Form fo = new Form(num, amount);
								Handler h = new Handler(fo);

								if (d.s.cash1.pay(newOne, amount) && h.handle()) {
									System.out.println("Payment is done successfully");
								}
							} else if (paymentChoice == 2) {
								System.out.print("Enter amount of money: ");
								double amount = myObj.nextDouble();
								System.out.println("Enter your phone number (must equal 11 numbers)");
								String num = n.nextLine();
								Form fo = new Form(num, amount);
								Handler h = new Handler(fo);

								if (d.s.creditCard1.pay(newOne, amount) && h.handle()) {
									System.out.println("Payment is done successfully");
								}
							} else if (paymentChoice == 3) {

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
								System.out.println("Enter your phone number (must equal 11 numbers)");
								String num = n.nextLine();
								Form fo = new Form(num, amount);
								Handler h = new Handler(fo);

								if (d.ngo.cash1.pay(newOne, amount) && h.handle()) {
									System.out.println("Payment is done successfully");
								}
							} else if (paymentChoice == 2) {
								System.out.print("Enter amount of money: ");
								double amount = myObj.nextDouble();
								System.out.println("Enter your phone number (must equal 11 numbers)");
								String num = n.nextLine();
								Form fo = new Form(num, amount);
								Handler h = new Handler(fo);

								if (d.ngo.creditCard1.pay(newOne, amount) && h.handle()) {
									System.out.println("Payment is done successfully");
								}
							} else if (paymentChoice == 3) {

							}

						} else {
							System.out.println("Wrong Choice");
						}
					}

				} else {
					System.out.println("Wrong info");
				}
			} else if (choice == 3) {
				System.out.println("Signed out successfully");
				continue;
			} else {
				break;
			}

		}
	}
}

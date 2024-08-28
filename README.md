# Fawry
Project title : Fawry<br>
We generated sping intializr by java 17 versioin and maven<br>
All team members has java 19 in their IDE<br>
We used intellij IDE to write the code<br>
To run the project:<br>
1- Run the program<br>
2- Go to postman<br>
3-Make a new request<br>
4-Click body
5-Click raw<br>
6-Click json<br>
7-Choose GET or POST<br>
8-if it's post -> write the paramaters names like this for example -> <br>
{<br>
  "username":"FCAI",<br>
  "password":"CU"<br>
}<br>
9-Write the URL
10-Click send
<br>
NOTE:There are functions you don't want to add the params like above example but you should write them like that in the URL -> 127.0.0.1:8080/Wallet/Add/50 <br>
the "50" in the last of the url is the amount the user need to add in wallet
<br>
the functions you want to use the second way is -> addMoneyToWallet ( in class WalletController) - addRequest( in class RefundController) - searchService ( in class Account Controller)
<br>
The other functions you can use the default way 
<br>
To know the params you want to write check the link below ↓

To view postman -> we have sent an invite to our eng. (Eng/Ahmed Hassan)
and here is a link if anyone else wants to join 
https://elements.getpostman.com/redirect?entityId=25110914-db54f4b7-72c9-49bc-9b17-cd75631a70b1&entityType=collection <br>
To use the functions of the program we have added the URLs in the table you want to type<br>
<br>


# Description
The Fawry System is a Java-based application designed to facilitate various financial transactions, such as payments, refunds, and account management. The project follows the Model-View-Controller (MVC) design pattern, ensuring a clear separation of concerns and promoting maintainable and scalable code. It also utilizes REST APIs for interaction between clients and the server, making it a flexible and extensible solution for managing different types of transactions and services.

Features:

Account Management:

Users can sign up and sign in to the system using their credentials. The system checks the validity of the provided credentials and allows users to access their accounts. If an account with the provided credentials does not exist, users are prompted to register a new account.
The AccountController class handles all account-related operations, including signing in and signing up. It interacts with the AccountDatabase to verify user credentials and manage account creation.
Service Search:

Users can search for available services, such as mobile recharge, internet payments, landline services, and donations. The system provides a list of matching services based on the user's input.
The AccountController includes a method to handle service searches, returning a list of services that match the search criteria or indicating if no matches are found.
Payment Management:

The system supports various payment methods, including wallet, credit card, and cash payments. Users can select their preferred payment method when making a transaction.
The PaymentController class manages the payment process, applying both overall and specific discounts to transactions based on predefined rules. It interacts with different service classes to handle specific service-related operations and calculates the final amount after applying applicable discounts.
Discount Management:

Admins can set overall or specific discounts for different services. These discounts are applied automatically when a user makes a payment.
The DiscountController manages discount operations. The controller allows the application of an overall discount to all services or a specific discount to a selected service, providing flexibility in discount management.
Refund Management:

Users can request refunds for specific transactions. The system processes these requests and updates the user's wallet or notifies them of the refund status.
The RefundController handles refund requests and tracks the status of each refund. If a refund request is accepted, the amount is credited back to the user's wallet. If denied, the user is informed accordingly.
Transaction Management:

The system maintains a detailed record of all transactions, including payments, refunds, and wallet additions. Users and admins can view different types of transactions as needed.
The TransactionController provides endpoints to view all types of transactions, ensuring transparency and easy access to transaction histories.
Wallet Management:

Users can manage their wallet balance by adding funds and viewing the current balance. The wallet serves as a payment method for transactions.
The WalletController allows users to add money to their wallet and view the current wallet balance. It interacts with the TransactionDatabase to update the wallet transactions accordingly.
Thanks,
<br>
<br>
<br>
<br>





OUR TEAM:<br>
1-Loay<br>
2-Ganna Khaled<br>
3-Habiba Adel<br>
4-Nadeen Medhat<br>

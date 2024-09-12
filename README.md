Bank Management System is a Java-based project designed to simulate banking operations with a user-friendly Graphical User Interface (GUI) developed using the Java Swing library. It connects to a SQL database to manage and store user data securely. The system allows users to perform essential banking operations, such as balance enquiry, deposits, withdrawals, and more.

**Features**

**User Authentication:**
Login: Secure login system for users.
Sign Up: Multi-step signup process (three steps) for new users to create an account.

**Banking Transactions:**
Deposit: Users can deposit money into their account.
Withdraw: Users can withdraw money from their account.
Fast Cash: Quick withdrawal options for specific amounts.
Balance Enquiry: Users can check their current balance.
Mini Statement: Users can view recent transactions.

**PIN Management:**
PIN Change: Users can update or change their ATM PIN securely.

**Database Management:**
All user and transaction data are securely stored and managed using SQL.
The Java Database Connectivity (JDBC) API is used to connect the application to the SQL database.

**Class Breakdown**
Login: Handles user login functionality.
Signup, Signup2, Signup3: Multi-step registration process to create new accounts.
Main_class: Acts as the core of the application, handling navigation between different modules.
Mini: Displays the user's mini-statement showing recent transactions.
Balance Enquiry: Shows the user's current account balance.
Connection: Establishes the connection between the Java application and the SQL database.
Deposit: Allows users to deposit money into their account.
Fastcash: Enables users to withdraw a predefined amount of money quickly.
Pin: Facilitates PIN change for enhanced security.
Withdrawal: Manages the money withdrawal process.

**Technologies Used**
Java (Core, OOP)
Java Swing (for GUI)
SQL (for database management)
JDBC (for SQL-Java connectivity)

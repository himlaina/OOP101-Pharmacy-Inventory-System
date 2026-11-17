# PharmAssist: A Java-Based Pharmacy Batch Inventory and Expiration Tracking System

## Project Description

PharmAssist is a Java-based console application designed to help small-scale pharmacies manage medicine records, monitor stock batches, track expiration dates, and record stock-in and stock-out transactions. It aims to provide a more organized way of monitoring pharmacy inventory and reducing issues caused by manual recordkeeping.

## Problem Being Addressed

Small-scale pharmacies face challenges in managing medicine inventories due to manual recordkeeping and inconsistent monitoring practices. These difficulties can result in inaccurate inventory records, unnoticed medicine expiration dates, stock shortages, and overstocking.

PharmAssist aims to address these problems by providing an organized system for managing medicine records, monitoring stock levels, tracking expiration dates, and recording inventory transactions.

## Project Objectives

The project aims to:

1. Develop a medicine management feature that allows users to add, update, delete, view, and search medicine records by name, ID, or category.
2. Implement batch tracking and expiration monitoring to record medicine quantities and expiration dates and classify batches as Expired, Near Expiry, or Safe.
3. Develop stock monitoring features that identify low-stock medicines and calculate recommended restock quantities.
4. Implement stock-in and stock-out transactions to update medicine quantities and maintain an inventory transaction history.
5. Generate inventory summaries showing available stocks, expired batches, near-expiry batches, and low-stock medicines.
6. Apply input validation and exception handling to prevent duplicate records and invalid entries.

## Target Users

### Pharmacists
- Manage medicine records.
- Monitor medicine batches.
- Check expiration dates.
- Review low-stock warnings.
- Generate inventory summaries.

### Pharmacy Assistants
- Add incoming medicine stocks.
- Record stock deductions.
- Search for medicine information.
- Update quantities.
- View inventory records.

## Main Features

1. **Add Medicine** – Registers a medicine's basic information, such as medicine ID, name, category, and minimum stock level.
2. **Update Medicine** – Allows users to modify existing medicine information.
3. **Delete Medicine** – Allows users to remove a medicine record after confirmation.
4. **View All Medicines** – Displays all registered medicines and their information.
5. **Search Medicine** – Allows users to search for a medicine using its name or unique medicine ID.
6. **Category Filter** – Allows users to filter medicine records by category.
7. **Record Stock-In** – Records newly received medicine supplies by entering the batch ID, quantity, and expiration date.
8. **Record Stock-Out** – Records medicines sold or removed and deducts the quantity from available stock.
9. **Batch Tracking** – Allows the same medicine to have multiple batches with separate quantities and expiration dates.
10. **Expiry Status Checker** – Checks expiration dates and classifies batches as Expired, Near Expiry, or Safe.
11. **Low-Stock Warning** – Identifies medicines whose total available quantities have fallen below their minimum stock levels.
12. **Restock Recommendation** – Calculates the additional quantity needed to reach the medicine's required stock level.
13. **Duplicate Medicine Checker** – Prevents users from registering a medicine with an already existing medicine ID.
14. **Transaction History** – Keeps records of stock-in and stock-out activities.
15. **Inventory Summary** – Displays the total number of registered medicines, available units, expired batches, near-expiry batches, and low-stock medicines.
16. **Input Validation** – Prevents invalid information, such as negative quantities, empty medicine names, and stock deductions exceeding available quantities.

## Technologies Used

- **Java** – Main programming language used to develop the application.
- **Java Console** – Used as the application's user interface.
- **Arrays/ArrayLists** – Used to store and manage medicine records, batch information, and transaction history while the program is running.
- **Exception Handling** – Uses try-catch statements to handle invalid inputs and unexpected errors.

## Team Members and Roles

| Team Member | Assigned Role |
|---|---|
| Corona, John Clarinez O. | Documentation |
| Morales, Cristine Jhoy D. | Lead Programmer |
| Polintang, Yanna Erika C. | System/Design Lead |
| Umahon, Meara Cerise M. | Project Leader |

## OOP Concepts Demonstrated

### Classes and Objects
Classes define the structure of system components, such as Medicine, MedicineBatch, and Transaction. Objects represent individual medicine records, batches, and transactions.

### Methods
Methods handle system operations such as adding or updating medicines, recording stock-in and stock-out transactions, checking expiration dates, and generating inventory summaries.

### Encapsulation
Class attributes are declared private to protect important data. Getter and setter methods provide controlled access to these attributes.

### Inheritance
A general Transaction class serves as a parent class, while StockInTransaction and StockOutTransaction inherit its common attributes and methods.

### Polymorphism
StockInTransaction and StockOutTransaction can provide their own implementations of a shared method, such as `processTransaction()`.

### Abstraction
An abstract Transaction class defines common transaction information and required methods while hiding specific processing details implemented by its subclasses.

### Exception Handling
Try-catch statements handle invalid inputs and unexpected errors, such as entering letters instead of numbers, providing invalid quantities, or entering incorrect date formats.

## Instructions for Running the Program

1. Make sure Java Development Kit (JDK) is installed on your computer.
2. Download or clone the PharmAssist project repository.
3. Open the project folder using a Java IDE.
4. Locate and open the main Java application file.
5. Run the main class using your Java IDE.
6. Follow the console menu and select the feature you want to use.
7. Enter the required information to process your selected operation.
8. View the results displayed by the application.

*Note: Confirm the exact main class name and running procedure with the Lead Programmer before finalizing this section.*

## Sample Screenshots

The following screenshots will be added once the application is completed and tested.

### Main Menu
[Insert actual screenshot of the PharmAssist main menu here.]

### Medicine Management
[Insert actual screenshot of the medicine management feature here.]

### Stock-In and Stock-Out
[Insert actual screenshot of the stock-in and stock-out transactions here.]

### Expiration Monitoring
[Insert actual screenshot showing Expired, Near Expiry, and Safe statuses here.]

### Inventory Summary
[Insert actual screenshot of the inventory summary and low-stock warnings here.]

## Known Limitations

1. The application is console-based and does not include a graphical user interface.
2. The application does not support online ordering or automatic supplier integration.
3. The application does not use cloud-based storage or online synchronization.
4. Data persistence is limited to local runtime memory (or basic local file storage/CSV if required later).
5. The system does not process financial payment transactions or POS printer receipts.

## Future Improvements

The following are possible improvements that may be considered in future versions:

- Develop a graphical user interface (GUI).
- Add cloud-based storage and online synchronization.
- Integrate supplier information and ordering features.
- Improve data storage and persistence.
- Add payment processing and POS receipt functionality.

## Project Contributors

The project was developed by Team T.E.A.M, Team 10, IT-2113, for OOP101 – Object-Oriented Programming.

| Contributor | GitHub Username |
|---|---|
| Corona, John Clarinez O. | `cocoycrown` |
| Morales, Cristine Jhoy D. | `himlaina` |
| Polintang, Yanna Erika C. | `banana-105` |
| Umahon, Meara Cerise M. | `meowra14` |

## Repository Information

**Repository Name:** OOP101-Pharmacy-Inventory-System

**GitHub Repository Link:** [Insert the actual repository link here.]

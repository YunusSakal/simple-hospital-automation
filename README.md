# simple-hospital-automation
created from Java Swing
Simple Hospital Automation System
This project is a simple hospital automation system where information related to clinics, such as the doctor's name and the number of patients, can be added and deleted. It also determines the number of busy and non-busy clinics, calculates the total number of patients, and counts the total number of clinics.

Project Overview
The Simple Hospital Automation System allows the management of clinics and tracking of doctor-patient relations. Clinics are added, and information such as doctor names and patient counts is entered. The data is stored in a database, and analysis is performed to identify busy and non-busy clinics.

Key Features:
Add and delete clinics.
Enter clinic name, doctor name, and patient count.
Calculate total clinic and patient counts.
Display busy and non-busy clinics.
Requirements
To run this project, you need to download and install the following dependencies and programs:

Dependencies (Referenced Libraries):

rs2xml.jar
mysql-connector-j-8.3.0.jar
Programs:

Eclipse IDE: To develop and run the Java-based project.
XAMPP: To start Apache and MySQL servers.
Installation
To run the project locally, follow these steps:

Install XAMPP:

Download and install XAMPP.
Open the XAMPP Control Panel, and start the Apache and MySQL services by clicking the Start buttons.
Click on the MySQL Admin button to open phpMyAdmin, and create a database named hastane.
Install Eclipse:

Download and install Eclipse IDE.
Import the project into Eclipse.
Add rs2xml.jar and mysql-connector-j-8.3.0.jar to the project as Referenced Libraries.
How to Run
Start Apache and MySQL from the XAMPP Control Panel.
Click on MySQL Admin and create a database named hastane in phpMyAdmin.
Open Eclipse and follow these steps:
Ensure that the Anasayfa.java, PoliklinlikEkle.java, and myJDBC.java files are all opened in the same package within the project.
Right-click on Anasayfa.java and select Run As -> Java Application.
The application is now ready to use.
Usage
Click on the PoliklinlikEkle button to add clinic information. Enter data such as doctor names, clinic names, and patient counts one by one.
All entered data is saved to the database.
The program automatically displays all the outputs on the right side, while the list of entered data is shown on the left side.
Contributing
If you want to contribute to the project, follow these steps:

Fork the project.
Create a new branch: git checkout -b feature-name
Commit your changes: git commit -m 'Add new feature'
Push to the branch: git push origin feature-name
Open a pull request.
License
This project is not under any specific license. Feel free to use and modify it.


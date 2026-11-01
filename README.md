# Car Maintenance and Repair Center Management System
In my project, I designed and implemented a console-based Java application for managing a car maintenance and repair center. The system handles customer registration, appointment scheduling, service and diagnostic reports, bill calculation, and a daily report of the serviced cars, with a separate menu for each role in the center: front desk, mechanic, and technician.

## System Roles
I divided the application into three roles, and each one has its own menu in the Client class. The front desk can register a new customer, schedule an appointment, calculate a customer's bill based on the national ID, and print the appointments of the day.

The mechanic can view the scheduled appointments and add a service report, while the technician can add a diagnostic report and generate a report for the serviced cars. One thing to note is that the schedule appointment option books the appointment for the most recently registered customer.

## Customers and Billing
I created an abstract Customer class that stores the customer's full name, address, national ID, contact number, and the customer's Car object, which holds the make, model, and plate number. There are three customer types that extend it: RegularCustomer, FleetCompanyCustomer, and StaffMembersCustomer.

Each type overrides the abstract calculateBill method with its own price. The regular price is 50, fleet company clients get a 30% discount and pay 35, and center staff members get a 50% discount and pay 25. Because of this, the BillCalculations class does not need to know the customer type, and adding a new type only requires adding a new class.

## Appointment Scheduling
In this project, appointments are available hourly between 9:00 AM and 5:00 PM, with a maximum of nine appointments per day. Before an appointment is created, the system checks that the time is not already reserved and that the customer has not already scheduled an appointment.

Another thing I implemented is an AppointmentProxy class that validates the entered time before forwarding the request to AppointmentManagement. Both classes implement the AppointmentSchedular interface.

## Reports
The mechanic adds a service report to an appointment by entering the repairs performed and the parts used. The technician adds a diagnostic report by entering the issues found and the recommended actions, and doing this marks the appointment as completed.

I also implemented GenerateDailyCarReport, which writes the completed appointments to a `dailyReport.txt` file. For each serviced car, the report includes the customer's national ID, the plate number, the service and diagnostic report details, and the appointment time.

## Design Patterns
I used one design pattern from each category. On one hand, I used the Factory pattern in RegisterCustomerFactory to create the correct customer type based on the user's choice, which keeps RegisterCustomer focused on collecting the registration data. I used the Proxy pattern in AppointmentProxy to validate the appointment time before scheduling.

On the other hand, I used the Chain of Responsibility pattern for validating the national ID during registration. The NationalIdValidate class implements the Handler interface and rejects a new customer if the national ID already exists, otherwise it adds the customer to the list. I used a single handler, but the pattern allows more validation steps to be added as separate classes.

## Design Principles
I applied the single responsibility, open-closed, and Liskov substitution principles in my design. For example, the open-closed principle is applied through the abstract calculateBill method, and Liskov substitution is applied through the three Customer subclasses, which can replace Customer without changing the behaviour of the program.

But my design has a minor violation of the interface segregation principle. The AppointmentSchedular interface declares two overloaded methods because the proxy needs one and the original class needs the other, so each class overrides a method it does not use. I also tried to follow clean code techniques by using meaningful names and keeping each method focused on one task.

## Testing
In the report, I documented test cases for addServiceReport, addDiagnosticResults, and calculateBill, using equivalence partitioning with valid and invalid appointment times and national IDs. I also explained the modifications I made to these methods to be able to test them with assertEquals, such as returning the printed message instead of printing it and removing the Scanner.

The source code in this repository is the original version of the system, so these testing modifications are not included. The report also discusses unit, component, system, and integration testing, along with their benefits and drawbacks.

## Project Documentation
I have also included a PDF containing an edited version of my original university project report. It includes the UML class diagrams, the relationships between the classes, the design patterns, the test cases, and the testing discussion. I removed the assignment instructions and unnecessary details while keeping the technical documentation.

## Technologies Used
- Java
- Visual Paradigm (UML diagrams)

## Project Information
- **Type:** Academic Project
- **Course:** Advanced Programming 2
- **Semester:** Fall 2025

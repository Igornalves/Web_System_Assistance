# Application for Dental Technical Assistance

## Introduction
This project is an application for technical assistance specialized in dental equipment. Here are listed the functional requirements, non-functional requirements and business rules that guide the development.

---
## Functional Requirements

### Registration and Management
- **Customer Registration:**
- Registration of customer information, including name, CPF/CNPJ, address, telephone and e-mail.
- Possibility of attaching relevant documentation (e.g.: contracts).

- **Equipment Registration:**
- Registration of dental equipment with information such as brand, model, serial number and warranty.
- Association of each piece of equipment with a customer.

- **Technician Registration:**
- Management of technician information, including name, specialization, availability and contacts.

- **Service Order Management (SO):**
- Creation, updating and viewing of service orders with details such as problem description, status (open, in progress, completed), responsible technician and estimated deadline.
- Automatic notifications to customers about updates in the SO.

- **Service Schedule:**
- Integrated calendar for scheduling technical visits, including alerts and reminders.

- **Reports:**
- Generation of detailed reports on service orders, maintenance history and technician performance.

### Communication
- **Messaging System:**
- Exchange of messages between customers, technicians and administrators directly through the application.

- **Automatic Notifications:**
- Sending of notifications by e-mail or push about changes in the status of service orders or expiring warranty periods.

### Payments
- **Payment Management:**
- Integration with payment systems for issuing invoices and online payments.
- Recording of payments received manually.

---

## Non-Functional Requirements

- **Usability:**
- User-friendly and intuitive interface to facilitate use by different user profiles.

- **Scalability:**
- Support for growth in the number of customers, technicians and service orders without loss of performance.

- **Security:**
- Implementation of encryption to protect sensitive data (e.g.: SSL/TLS for communications and hash for passwords).
- Access control with different permission levels (administrator, technician, customer).

- **Compatibility:**
- Availability for web and mobile devices (iOS and Android).

- **Performance:**
- Guaranteed execution of the main functionalities in less than 2 seconds in 95% of cases.

---

## Business Rules

- **Warranty Validation:**
- Equipment under warranty cannot generate charges for maintenance services, except in cases of proven misuse.

- **Priority in Service Orders:**
- Service orders for essential equipment in clinics (e.g.: autoclaves) must be prioritized.

- **Prior Approval:**
- Services whose cost exceeds a certain limit must be approved by the client before execution.

- **Service History:**
- Each piece of equipment must have a complete history of maintenance and repairs performed.

- **Associated Technicians:**
- A technician can only be assigned to a service order if he or she has valid certification for the equipment in question.

- **Payments:**
- Completed service orders can only be closed in the system after payment confirmation (when applicable).

---

## Final Considerations
This README serves as an initial guide for the development of the application. Updates and adjustments should be made according to feedback from stakeholders and users during the development process.
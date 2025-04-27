# Parking Lot Management System

This project is a **Parking Lot Management System** built using **Java**. It simulates a parking lot with features like vehicle entry and exit, parking spot management, ticket generation, and payment processing.

## Features

- **Vehicle Types**: Support for `TwoWheeler` and `FourWheeler` vehicles.
- **Parking Spot Types**: Separate parking spots for two-wheelers and four-wheelers.
- **Ticket Generation**: Upon entry, a ticket is generated with parking spot details and entry time.
- **Vehicle Entry/Exit**: Simulates vehicles entering and exiting the parking lot.
- **Cost Calculation**: Parking fees are calculated based on the vehicle type and time spent in the parking lot.

## Technologies Used

- **Programming Language**: Java
- **IDE**: Eclipse (or any Java IDE)
- **Version Control**: Git (for version control)
- **System Design**: Object-Oriented Design (OOD), SOLID Principles, Low-Level Design (LLD)

## Project Structure

The project consists of the following core components:

- **Vehicle**: Class representing vehicles, including their type and ticket details.
- **Ticket**: Class for ticket management, storing ticket ID, entry time, and parking spot details.
- **ParkingSpot**: Class representing a parking spot, including its type and cost.
- **ParkingManager**: Class for managing parking spots and allocating them based on vehicle type.
- **EntranceGate**: Class handling vehicle entry, parking spot allocation, and ticket generation.
- **ExitGate**: Class handling vehicle exit, payment processing, and parking spot freeing.

## Getting Started

### Prerequisites

- **Java 8 or above** installed on your system.
- **Eclipse IDE** or any Java IDE for development.
- **Git** for version control (if you're cloning the repository).

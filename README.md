# Java Test - Fluidity Software Solutions

##	How SOLID Principles have been satisfied
#### Single Responsibility - Each class has one responsibility
#### Open for extention but closed for modification - Adding new vehicle types doesn’t modify existing code
#### Liskovs Principle - All subclasses can replace the Vehicle abstraction
#### Interface Segregation - Electric cars is not forced to implement fuel methods
#### Dependencies inversion - Code depends on abstractions (Vehicle, FuelPowered), not concrete types

## Application is a Gradle Spring Boot app

## REST endpoints for /vehicles on port 8080

## Follows the SOLID architecture

## Uses dependency injection (DIP) with Spring


### Unit tests have been added for controller and factory classes
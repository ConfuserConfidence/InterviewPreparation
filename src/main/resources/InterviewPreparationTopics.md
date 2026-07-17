# Interview topics divided into multiple sections
### 1. Technical questions
####   1. CoreJava
####   2. Programming
####   3. Hibernate/ORM
####   4. Spring Boot
####   5. Microservices
####   6. Microservices Patterns
####   7. Kafka
####   8. Kubernetes

### 2. Project questions
### 3. HR questions

###  CoreJava:
####    1. Very important questions
####    2. Important questions
####    3. Least bothered as per interview But Basics

###  CoreJava (Very important questions):
####    1. Java Features (8/11/17/21 - it covers all the feature details, example: Streams, Functional Interfaces..etc)
####    2. Java Memory Management (Explain about JVM Memory)
####    3. Java Memory Model (Explain about How thread can access object values - happens before and other topics)
####    4. MultiThreading (Future, CompletableFuture and those methods)
####    5. HashMap internal working (what are the new additions to it based on recent versions)
####    6. SingleTon and Immutability (Check why String is immutable by default)
####    7. LinkedList internal working (implementation details)
####    8. ThreadPoll and ExecutorService
####    9. Generics

###  CoreJava (Important questions):
####    1. Design patterns in Java (Creational, Structural and Behavioral)
####    2. Design principles of Java (SOLID)
####    3. Concepts of DeadLock and Race condition (Know about how we can eliminate them)
####    4. Semaphore, ReentrantLock
####    5. what is better synchronized method or synchronized block?
####    6. String pool concept
####    7. Traditional Threads vs VirtualThreads
####    8. Runnable vs Callable

###  CoreJava (Least bothered as per interview But Basics):
####    1. OOPS Concepts
####    2. Write all OOPS concepts in single program
####    3. How can you prove that Java still an object-oriented programming language?
####    4. How many ways we can create a thread?
####    5. How many ways we can create an object?

###  Programming:
####    1. Very important questions
####    2. Important questions

###  Programming (Very important questions):
####    1. In List of Employees, collect the nth highest salary of specific (example: software) department
####    2. In List of Employees, collect all the employees who are the nth highest salary of those particular departments
####    3. Group the Employees, based on their Department
####    4. Sort the Employees based on their salary, department and then names
####    5. Collect the Employees who are the highest salaries of those particular departments
####    6. In the given string, collect the number of repetitions of characters in it (input: Tulugu, output: T=1, u=3,l=1,g=1)
####    7. Find the duplicate character in a string
####    8. Find the non-repetitive character in a string
####    9. Find the largest substring of the non-repetitive character in a string.

###  Programming (Important questions):
####    1. ATM Dispenser solution
####    2. Two sum
####    3. Find out cycle in LinkedList
####    4. LRU Cache

###  Hibernate/ORM:
####    1. Annotations
####    2. Relations
####    3. Lazy Loading
####    4. Session Factory
####    5. Session
####    6. Different types of Cache
####    7. 1+N problem and how to resolve it

###  Spring Boot:
####    1. @SpringBootApplication annotation (what are the annotations are included in this annotation)
####    2. @ConditionalOnProperty, @Configuration, @Bean annotation
####    3. @Controller vs @RestController
####    4. @Controller, @Service and @Repository (what if we don't mention them)
####    5. How spring default objects became singleton?
####    6. Which injection is better? (constructor or field level)
####    7. @Transactional annotation along with Propagation and Isolation
####    8. @Async vs CompletableFuture.runAsync() vs CompletableFuture.supplyAsync()
####    9. @ExceptionHadler along with @ControllerAdvice and make it as GlobalExceptionHandler
####    10. What are the feature of SpringBoot, what it offers you?
####    11. How does Spring boot different from other spring ecosystem?

###  Microservices:
####    1. Difference between Monolithic to Microservices?
####    2. How can you decide boundaries of Microservice?
####    3. What are the design patterns used in your project as part of Microservice?
####    4. How many microservices in your project and how do they communicate with each other?
####    5. How do you provide security for your microservices?
####    6. How exactly authentication and authorization happens in your microservice based on jwt token?
####    7. What happens jwt payload size increased? will it effect latency per request? what are the disadvantages of jwt token mechanism?
####    8. How can you communicate between different microservices which is already having security? how can you pass your token?
####    9. Explain me about hexagonal & CQRS design pattern?
####    10. How can you monitor the log for single request which goes to different microservices continuously?
####    11. How did you implemented centralized logging?
####    12. A service which deployed in cloud is keep getting increasing its memory, after one week server directly crashed. What could be the reason? How can you debug and quickly fix it?
####    13. What are the monitoring and observability tools and how do you use them in daily life?
####    14. Suppose I have a microservice which accepts 1Lakh requests for now, suddenly traffic increased to 10Lakh request per minute, how can you handle them?
####    15. How did you communicate between internal microservices and what are the challenges did you face as part of it?
####    16. Suppose we are handling 1lakh requests per minute, but database is not responding in quick time, in this phase how can you fix this immediately?
####    17. What are the design principles of microservices?
####    18. How can you design for BookMyShow or ecommerce website?
####    19. Define Latency and Throughput

###  Microservices Patterns:
####    1. API Gateway
####    2. Service Discovery
####    3. Retry
####    4. Circuit Breaker
####    5. MTls
####    6. Load Balancing
####    7. DB per service
####    8. Hexagonal
####    9. CQRS
####    10. SAGA (Choreography)
####    9. SAGA (Orchestration)

###  Kafka:
####    1. Define Broker, partition, topic, consumer and connector
####    2. What happens if our service replicas more than the partitions in kafka topic? and what is the contract between these two?
####    3. How can it maintain one message per once?
####    4. What is idempotency and how do you maintain that?
####    5. How do you configure Kafka?
####    6. How do you handle dead letter queue? are you using this pattern in your project?

###  Kubernetes:
####    1. What are the diffent deployment strategies are they and explain each one of them?
####    2. How are you maintaining the secrets and how do you get it back to application securely?
####    3. What is horizontal scaling and how do you configure it?
####    4. How do load balances knows which pod is healthy so that it will send the traffic to that pod?
####    5. How do you debug if the pod crashed after deployment?
####    6. What are ConfigMaps or secrets in service.yaml files?

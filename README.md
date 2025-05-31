# Modular Hexagonal Architecture Project

This project demonstrates a **Hexagonal (Ports and Adapters)** architecture in a modular Maven setup.  
It separates concerns by using three main modules:

| **Layer/Module**   | **Depends On**        | **Explanation**                                                            |
|---------------------|-----------------------|----------------------------------------------------------------------------|
| **domain**         | —                     | Pure domain logic. No external dependencies.                               |
| **application**    | domain                | Application services orchestrate domain logic.                              |
| **infrastructure** | application, domain   | Contains adapters and framework code (Spring), wires up everything.        |

## Key Principles

 **Domain layer**: Pure business logic. No knowledge of frameworks like Spring.  
 **Application layer**: Orchestrates use cases and uses domain interfaces.  
 **Infrastructure layer**: Wires up frameworks (Spring, DB, APIs) and implements adapters.


## infrastructure module

This module contains **adapters** and all the framework-related code, like Spring Boot configuration, REST APIs, database access, and external integrations.  

**What’s inside?**
- Spring Boot application starter
- Adapters implementing domain interfaces (e.g., database repositories)
- Configuration and integration with external systems

**What’s not inside?**
- No business logic or domain-specific rules
- No pure application logic (delegates to `application` services)

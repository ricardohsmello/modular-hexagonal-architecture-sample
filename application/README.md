## application module

This module defines **use cases** and orchestrates domain logic by leveraging the interfaces (ports) from the domain module.  
It **coordinates** domain interactions and ensures business rules are applied consistently.

**What’s inside?**
- Application services (e.g., `CreateProductService`, `UpdateProductService`)
- Use case orchestration

 **What’s not inside?**
- No direct framework dependencies
- No infrastructure code

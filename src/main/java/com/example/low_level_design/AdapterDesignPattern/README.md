# Adapter Design Pattern

The Adapter Design Pattern is used when two systems are incompatible with each other’s interfaces, but still need to work together.
It acts as a bridge or translator between them.

**Real-World Example (Server → Client)**

**Suppose:**<br>
- A server returns data in XML format
- A client only understands JSON format 
- They cannot communicate directly because their data formats are incompatible. 
- This is where the Adapter comes in.

**How Adapter Works Here**
- The client makes a request expecting JSON. 
- The server responds with XML. 
- **The Adapter:** 
  - Receives the XML response 
  - Converts (adapts) it into JSON 
  - The client receives the data in the format it understands.


**When to Use Adapter Pattern**
- When you cannot change existing code (legacy system)
- When a third-party API returns data in an unsupported format 
- When you need to integrate two systems with different interfaces
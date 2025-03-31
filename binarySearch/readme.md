# Binary Search API

A Spring Boot application that implements a binary search algorithm.

## API Endpoints

**Endpoint:** `POST /api/search/binary`

**Request Body:**
```json
{
  "array": [1, 2, 3, 4, 5, 6, 7, 8, 9, 10],
  "target": 7
}
```

**Response:**
```json
{
  "index": 6,
  "found": true,
  "comparisons": 3,
  "executionTimeNanos": 12345
}
```

## Running the Application

### Prerequisites
- Java 17 or later
- Maven

### Build and Run
```bash
mvn clean install
mvn spring-boot:run
```

The application will start on port 8080.

## Testing

To run the tests:
```bash
mvn test
```

## Example API Usage

Using cURL:
```bash
curl -X POST http://localhost:8080/api/search/binary \
  -H "Content-Type: application/json" \
  -d '{"array": [1, 2, 3, 4, 5, 6, 7, 8, 9, 10], "target": 7}'
```

Using Postman:
1. Create a new POST request to http://localhost:8080/api/search/binary
2. Set the body to raw JSON and enter:
   ```json
   {
     "array": [1, 2, 3, 4, 5, 6, 7, 8, 9, 10],
     "target": 7
   }
   ```
3. Send the request


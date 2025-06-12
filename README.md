# paginationexample
Spring Boot with Pagination

Pagination in Spring Boot using JPA - 
Pagination is a technique used to break down large datasets into smaller, manageable chunks (pages), improving performance and user experience.
In Spring Boot with Spring Data JPA, pagination is implemented using the Pageable interface and Page response.

It allows APIs to return limited records per request (e.g., 5 at a time), with options to fetch next pages using page and size query parameters.

Example-
GET /employees/findall?page=0&size=5

page=0 → First 5 records
page=1 → Next 5 records

✅ page (index-based):
Refers to the page number you want to retrieve.
✅ size:
Refers to the number of records per page.
Example:
size=5 means each page will return 5 employees.

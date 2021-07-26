# projection-example-spring-data-jpa

`/persons`

Normal API for all persons in DB. No projection

`/persons/first-name`

[Interface based projection](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#projections.interfaces). Problem is address (nested relationship) is fully queried ignoring the projection.

`/persons/last-name`

[Class based projection](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#projections.dtos) solving the previous problem. Big String and not great readibility.

`/persons/last-name-custom`

Using Criteria API. EntityManager used since projection is NOT supported with Specification as of this time. Links below  

https://github.com/spring-projects/spring-data-jpa/issues/1378  
https://github.com/spring-projects/spring-data-jpa/issues/1524

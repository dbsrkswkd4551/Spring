<h2># Spring Boot Test Project</h2>

<h3># Ch1 프로젝트 생성</h3>

<h4>pom.xml 설정</h4>
-org.springframework.boot:spring-boot-starter-parent: 라이브러리간의 버전 충돌을 막아주는 최적의 버전 조합을 제공해준다. 프로젝트 생성시 pom.xml의 최상단에 자동으로 선언된다</br>
-org.springframework.boot:spring-boot-starter-web: Spring MVC를 사용한 RESTful서비스를 개발하는데 사용된다</br>

<h4>Application.java</h4>
-@SpringBootApplication: EnableAutoConfiguration, @ComponentScan, @Configuration을 하나로 묶어 놓은 것이다. 해당 annotation을 설정한 클래스가 있는 package를 최상위 패키지로 인식하고 ComponentScan을 실시한다</br>
-스프링부트를 기동하기 위한 main 메소드가 존재한다</br>

<h4>정적리소스(html, jsp 등)</h4>
-Spring Boot 프로젝트는 별도의 커스터마이징이 없는 경우 정적 리소스의 위치는 다음과 같다.</br> 
◎ static</br> 
◎ public </br>
◎ resources </br>
◎ META-INF/resources</br>
보통 application.properties의 설정을 통해 따로 정적 콘텐츠를 모아놓는 디렉토리를 생성하여 관리한다</br></br></br>


<h3># Ch2 Controller생성</h3>

<h4>annotation</h4>
@Controller: </br>
-해당 클래스를 Controller로 사용한다고 SpringFrameWork에 알린다</br>
-필요한 비즈니스 로직을 호출하여 전달할 모델과 이동할 뷰 정보를 DispatherServlet에 반환한다. </br>
-Bean으로 등록한다. </br>
@RequestMapping: 
-요청에 대해 어떤 Controller, 어떤 메소드가 처리할지 맵핑하기 위한 어노테이션</br>
-클레스나 메서드 선언부에 URL를 명시하여 사용한다.</br>
-viewName 생략 시 path로 설정한 URL이 default viewName이 된다</br>
-spring 4.3 이후부터는 GetMapping("/login") == RequestMapping("login", method=@RequestMethod.GET)의 형식으로 사용 가능하다</br>
-@RequestParam: 사용자가 원하는 매개변수에 값을 매핑하기위해 사용한다.</br>
-@PathVariable: url경로를 변수화하여 사용할 수 있도록 해준다.</br>
ex) @RequestMapping("/member/{name}") public String member(@PathVariable("name") String name)</br>
-consumes: RequestBody에 담는 타입을 제한할 수 있는 속성이다.(자주 사용X)</br>
ex) @PostMappig("/login",consumes="application/json")</br>
-@ResponseBody: 단순히 데이터를 전송하고자 할 때 사용한다. return 값이 전달되며 String, Map, Json전달이 가능하다</br></br></br>

@RestController: </br>
-spring4.0 이상은 @Controller와 @ResponseBody의 기능을 수행하는 @RestController를 제공한다 </br>


<h3># Ch3 View 설정 및 JSP 연동하기</h3>

<h4>View</h4>
-스프링 부트에서도 여러가지 뷰를 사용 가능하다</br>
-JSP/JSTL</br>
-Thymeleaf</br>
-FreeMarker</br>
-Velocity</br>
-Groovy Template Engine</br>
-Tiles</br>
-톰캣기반 자바 웹어플리케이션에서는 보안상 jsp 위치를 URL로 직접 접근할 수 없는 WEB-INF폴더 아래 위치시킨다</br>
-동적 파일들의 파일 변경을 자동으로 반영하기 위해서는 org.springframework.boot:spring-boot-devtools를 pom.xml에 추가한다</br>


<h4>Controller</h4>
-ModelAndView 객체 생성, .addObject로 데이터를 입력하고, return을 통해 데이터를 view로 넘겨준다


<h3># Ch4 database연동하기</h3>

<h4>커넥션풀(Connection Pool)</h4>
-풀(Pool)속에 데이터베이스와의 연결(커넥션)들을 미리 만들어 두고 데이터베이스에 접근시 풀에 남아있는 커넥션중 하나를 받아와서 사용한뒤 반환하는 기법.</br>
-다수의 사용자가 데이터베이스에 접근하는 상황에서 DB 연결과 해제하는 과정을 진행하면 비효율적이다.</br>
-따라서 커넥션풀을 이용하여 미리 연결을 만들어놓고 사용자가 데이터 요청시 연결을 주는 형식으로 효율적인 DB 연결 및 자원 사용이 가능하다 </br>

<h4>Mysql, Mybatis 연결</h4>
-mysql:mysql-connector-java:runtime, org.mybatis.spring.boot:mybatis-spring-boot-starter:2.1.3을 pom.xml에 추가한다.
-application.properties에 다음 코드 입력</br> 
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver</br>
spring.datasource.url=jdbc:mysql://127.0.0.1:3306/{DB이름}?serverTimezone=Asia/Seoul&useSSL=false</br>
spring.datasource.username={사용자 계정}</br>
spring.datasource.password={사용자 비밀번호}</br>
mybatis.mapper-locations=classpath:mappers*.xml (main 패키지의 mapper와 동일하게 resources 디렉토리에 mapper.xml파일의 경로를 생성해야한다)</br>

<h4>동작 방식</h4>
-요청->Controller->Service->Mapper->쿼리 실행(Mapper.xml)</br>


<h3># Ch5 로그설정</h3>

<h4>logback</h4>
-레벨 순서: TRACE > DEBUG > INFO > WARN > ERROR</br>
- TRACE : 추적 레벨은 Debug보다 좀더 상세한 정보를 나타냅니다.</br>
- DEBUG : 프로그램을 디버깅하기 위한 정보를 표시합니다. (운영서버에서는 표시하지 않도록 설정함)</br>
- INFO  : 상태변경과 같은 정보성 로그를 표시합니다.</br>
- WARN  : 처리 가능한 문제, 향후 시스템 에러의 원인이 될 수 있는 경고성 메시지를 나타냄</br>
- ERROR : 요청을 처리하는 중 오류가 발생한 경우 표시합니다.</br>


<h3># Ch7 JPA</h3>

<h4>ORM(Object-Relational-Mapping</h4>
-객체가 테이블이 되도록 매핑시켜주는 프레임워크이다</br>
-프로그램의 복잡도를 줄이고 자바 객체와 쿼리를 분리할 수 있으며 트랜잭션 처리나 기타 데이터베이스 관련 작업들을 좀 더 편리하게 처리할 수 있는 방법</br>
-SQL Query가 아닌 직관적인 코드로서 데이터를 조작할 수 있다</br>
-ex)SELECT * FROM MEMBER; ->> MEMBER.findAll()</br>

<h4>JPA</h4>
-Java Persistence API(자바 ORM 기술에 대한 API 표준 명세)</br>
-ORM을 사용하기 위한 인터페이스를 모아둔 것</br>
-자바 어플리케이션에서 관게형 데이터베이스를 사용하는 방식을 정의한 인터페이스</br>
-ORM에 대한 자바 API 규격이며 Hibernate, OpenJPA 등이 JPA를 구현한 구현체이다</br>
-Hibernate이외에도 EcipseLinkm DataNucleus, OpenJPA, TopLink등이 있다</br>
-장점:</br>
-생산성이 뛰어나고 유지보수가 용이하다</br>
-객체지향적인 코드로 인해 더 직관적이고 비즈니스 로직에 더 집중할 수 있게 도와준다</br>
-객체지향적으로 데이터를 관리할 수 있기 때문에 프로그램 구조를 일관되게 유지할 수 있다
</br>
-DBMS에 대한 종속성이 줄어든다</br>
-단점:</br>
-어렵다

<h4>Hibernate</h4>
-JPA를 사용하기 위해 JPA를 구현한 ORM프레임워크 중 하나</br>
-JPA인터페이스를 직접 구현한 라이브러리</br>


<h3># Ch8 JUnit</h3>

<h4>JUnit</h4>
-Java에서 독립된 단위테스트를 지원해주는 프레임워크</br>
-단정(assert) 메서드로 테스트 케이스의 수행 결과를 판별한다</br>
-JUnit4 이후부터는 테스트를 지원하는 어노테이션을 제공한다(@Test, @Before, @After 등)</br>
-@Test 메서드가 호출될 때 마다 새로운 인스턴스를 생성하여 독립적인 테스트가 이루어진다</br>
-org.springframework.boot:spring-boot-starter-test, 스프링 이니셜라이저로 프로젝트 생성 시 자동으로 생성 </br>









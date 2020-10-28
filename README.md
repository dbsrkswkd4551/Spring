<h2># Spring Boot Test Project</h2>

<h3>Ch1 프로젝트 생성</h3>

<h4>pom.xml 설정</h4>
-org.springframework.boot:spring-boot-starter-parent: 라이브러리간의 버전 충돌을 막아주는 최적의 버전 조합을 제공해준다. 프로젝트 생성시 pom.xml의 최상단에 자동으로 선언된다</br>
-org.springframework.boot:spring-boot-starter-web: Spring MVC를 사용한 RESTful서비스를 개발하는데 사용된다</br>

<h4>Application.java</h4>
-@SpringBootApplication: EnableAutoConfiguration, @ComponentScan, @Configuration을 하나로 묶어 놓은 것이다. 해당 annotation을 설정한 클래스가 있는 package를 최상위 패키지로 인식하고 ComponentScan을 실시한다</br>
-스프링부트를 기동하기 위한 main 메소드가 존재한다</br>

<h4>정적리소스(html, jsp 등)</h4>
-Spring Boot 프로젝트는 별도의 커스터마이징이 없는 경우 정적 리소스의 위치는 다음과 같다.
◎ static</br> 
◎ public </br>
◎ resources </br>
◎ META-INF/resources</br>
보통 application.properties의 설정을 통해 따로 정적 콘텐츠를 모아놓는 디렉토리를 생성하여 관리한다</br>


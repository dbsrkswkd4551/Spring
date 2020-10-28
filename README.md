<h2># Spring Boot Test Project</h2>

<h3># Information</h3>

<h4>빌드</h4>
-소스코드 파일을 컴퓨터에서 실행할 수 있는 독립 소프트웨어 가공물로 변환하는 과정 또는 결과물</br>
-작성한 소스코드나 파일 및 자원 등을 WAS가 인식할 수 있는 구조로 패키징 하는 과정 및 결과물

<h4>빌드 도구</h4>
-빌드 도구란 프로젝트 생성, 테스트 빌드, 배포 등의 작업을 위한 전용 프로그램</br>
-늘어나는 라이브러리 추가, 라이브러리 버전 동기화의 어려움을 해소하고자 등장</br>
-초기에는 Ant를 많이 사용하였고 현재는 Maven, Gradle이 많이 쓰인다</br>

<h4>Maven</h4>
-자바용 프로젝트 관리 도구</br>
-프로젝트의 전체적인 생명주기(LifeCycle)를 관리하는 도구</br>
-필요한 라이브러리를 문서(pom.xml)에 정의해 놓으면 해당 라이브러리와 작동하는데 필요한 다른 라이브러리들까지 네트워크를 통해 자동으로 다운로드 받아준다</br>
-배포 관리가 가능하다</br>

<h4>Maven LifeCycle</h4>
-프로젝트 우측의 Maven -> LifeCycle에서 확인 가능하다</br>
-Default(Build): 일반적인 빌드 프로세스를 위한 모델</br>
-Clean: 빌드 시 생성되었던 파일을 삭제하는 단계</br>
-Validate: 프로젝트가 올바른지 확인하고 필요한 모든 정보를 사용할 수 있는지 확인하는 단계</br>
-Compile: 프로젝트의 소스코드를 컴파일 하는 단계</br>
-Test: 단위 테스트를 수행하는 단계</br>
-Package: 실제 컴파일된 소스코드와 리소스들을 jar, war등으로 배포하기 위한 패키지로 만드는 단계</br>
-Verify: 통합 테스트 결과에 대한 검사를 실행하여 품질 기준을 충족시키는지 확인하는 단계</br>
-Install: 패키지를 로컬 저장소에 설치하는 단계</br>
-Site: 프로젝트 문서와 사이트 작성, 생성하는 단계</br>
-Deploy: 만들어진 패키지를 원격 저장소에 릴리즈하는 단계</br>

<h4>Bean</h4>
-Spring IoC 컨테이너가 관리하는 자바 객체를 빈(Bean)이라고 한다</br>
-일반적으로 new 연산자를 통해 객체를 생성했을 때 그 객체는 Bean이 아니다</br>
-따라서 Bean을 등록하기 위해서는 @ComponentScan 어노테이션을 사용해서 빈을 등록한다.</br>
-또는 직접 Bean 설정 파일에 등록할 수도 있다. 자바 설정파일 클래스를 생성하고 @Configuration 어노테이션을 붙이고 그 안에 @Bean 어노테이션을 사용해 직접 Bean 정의가 가능하다.

<h3># Annotation</h3>

@SpringBootApplication: @Configuration, @EnableAutoConfiguration, @ComponentScan의 기능을 합쳐놓은 것. Spring Boot 프로젝트 생성시 Main 어플리케이션에서 선언되어 있기 때문에 자동으로 스프링의 기본적인 설정이 완료된다</br>
@Configuration: bean에 대해서 Context에 추가하거나 특정 클래스를 참조해올 수 있다</br>
@EnableAutoConfiguration: Spring Boot의 자동화 기능을 활성화 시켜준다
@ComponentScan: 패키지내에 application 컴포넌트가 어디에 위치해있는지 검사한다










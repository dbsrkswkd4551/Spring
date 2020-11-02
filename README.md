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
-또는 직접 Bean 설정 파일에 등록할 수도 있다. 자바 설정파일 클래스를 생성하고 @Configuration 어노테이션을 붙이고 그 안에 @Bean 어노테이션을 사용해 직접 Bean 정의가 가능하다.</br>

<h4>WEB-INF</h4>
-Web Information의 약자로 web에 관련된 정보를 의미한다.</br>
-WEB-INF폴더는 브라우저에서 직접적으로 접근이 불가능한 경로다. 따라서 브라우저에서 유저의 직접 접근이 어려워 보안성이 높다.</br>

<h4>Model과 ModelAndView의 차이</h4>
-Model은 파라미터 방식으로 메소드에 (Model model)파라미터를 넣어주고 String 형태로 리턴한다.</br>
-Model은 값을 넣을 때 .addAttribute()를 사용한다</br>
-public String Model(Model model){ model.addAttribute("name", "윤근상"); return "model"; }</br></br>

-ModelAndView는 컴포넌트 방식으로 ModelAndView 객체를 생성해서 객체형태로 리턴한다.</br>
-ModelAndView는 Model과 View를 합쳐놓은 것으로, 값을 넣을 때 .addObject()를 사용하고, setViewName()으로 보낼 곳의 View를 세팅한다.</br>
-Spring MVC가 @Controller 어노테이션을 지원하기 시작한 이후로 ModelAndView는 잘 사용하지 않는 편이다.</br>

<h4>Service와 ServiceImpl을 만드는 이유</h4>
-인터페이스는 객체의 사용방법을 정의한 타입이다. 다형성을 구현하는 중요한 역할을 한다. 즉 개발 코드를 수정하지 않고 사용하는 객체를 변경할 수 있게 해준다.</br>
-많은 개발자들이 이에 대해 명확한 답변을 하지는 못한다. 나도 고민해보기</br>

<h4>RedirectAttributes</h4>
-폼 형식의 문서를 작성 후, 서버로 보내면 곧이어 다른 페이지로 리다이렉트 한다. 하지만 이런 리다이렉트 방식이 GET방식이기 때문에 데이터를 전송하게 되면 URL을 통해 파라미터가 노출되는 위험이 있다.</br>
-폼(POST)->Redirect->서버(GET)</br>
-따라서 스프링의 RedirectAttributes 클래스를 사용하면 리다이렉트가 발생하기 전에 플래시 속성을 세션에 복사하여(addFlashAttribute()메소드 사용) 저장된 플래시 속성을 세션에서 모델로 이동시킨다. 그러면 헤더에 파라미터를 붙이지 않기 떄문에 URL에 노출되지 않는다.</br>


<h3># Annotation</h3>

@SpringBootApplication: @Configuration, @EnableAutoConfiguration, @ComponentScan의 기능을 합쳐놓은 것. Spring Boot 프로젝트 생성시 Main 어플리케이션에서 선언되어 있기 때문에 자동으로 스프링의 기본적인 설정이 완료된다</br>
@Configuration: bean에 대해서 Context에 추가하거나 특정 클래스를 참조해올 수 있다</br>
@EnableAutoConfiguration: Spring Boot의 자동화 기능을 활성화 시켜준다</br>
@ComponentScan: 패키지내에 application 컴포넌트가 어디에 위치해있는지 검사한다</br>










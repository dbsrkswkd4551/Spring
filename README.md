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

<h4>유효성 검증</h4>
-Validator, Hibernate를 사용하여 유효성 검증을 한다.</h4>


<h3># Annotation</h3>

@SpringBootApplication: @Configuration, @EnableAutoConfiguration, @ComponentScan의 기능을 합쳐놓은 것. Spring Boot 프로젝트 생성시 Main 어플리케이션에서 선언되어 있기 때문에 자동으로 스프링의 기본적인 설정이 완료된다</br>
@Configuration: bean에 대해서 Context에 추가하거나 특정 클래스를 참조해올 수 있다</br>
@EnableAutoConfiguration: Spring Boot의 자동화 기능을 활성화 시켜준다</br>
@ComponentScan: 패키지내에 application 컴포넌트가 어디에 위치해있는지 검사한다</br>



<h3># jsp</h3>

form:form태그: form id= "command" action="{page_url}" method="post"와 같다</br>
commandName, ModelAttribute: 폼에 있는 요소의 값을 채우기위한 객체를 찾을때 사용할 이름을 지정한다. 스프링 5버전 이후로는 commandName에서 에러가 발생하기 때문에 ModelAttribute옵션을 사용한다.</br>
form태그의 요소에 값을 제공할 객체 지정은 컨트롤러에서 하게 된다.</br> 
ex)model.addAttribute("board", board(객체)); </br>
public String boardForm(@ModelAttribute board board, Model, model) throws Exception</br>
public String boardForm(@ModelAttribute("board") board vo, Model model) throws Exception</br>
board.setTitle 등의 방식으로 객체를 전달해줄 수 있다</br>

form:input 태그: input type="text" 태그와 같다</br>
form:password 태그: input type="password" 태그와 같다</br>
form:hidden 태그: input type="hidden" 태그와 같다</br>
path 속성을 통해 modelAttribute로 불러온 객체의 프로퍼티를 지정할 수 있다</br>

form:select 태그: select id name, option value 태그를 합친 것과 같다 items 속성을 통해 option을 지정한다</br>
form:options 태그: item 속성을 통해 option을 지정한다.</br>
form:option 태그:  option태그를 직접 지정한다</br>

form:checkboxes 태그: input type-"check box" 태그와 같다</br>
form:checkbox 태그: 태그를 직접 지정한다</br>

form:radiobuttons 태그: input type="radiobutton" 태그와 같다</br>
form:radiobutton 태그: 태그를 직접 지정한다.</br>

form:textarea 태그: <textarea>태그 와 같다</br>


<h3># HTML</h3>
-ul: unordered list, 순서 없이 나타내는 리스트</br>
-ol: ordered list, 숫자 순서대로 나타내는 리스트</br>

oracle연결이 안될시
maven 웹 페이지에서 ojdbc7.jar(12.1.0.2.0) 다운 후 WEB-INF/lib에 넣기<br>
maven에 dependency 추가
        <dependency>
            <groupId>oracle.jdbc</groupId>
            <artifactId>OracleDriver</artifactId>
            <version>12.1.0.2.0</version>
            <scope>system</scope>
            <systemPath>${basedir}/src/main/webapp/WEB-INF/lib/ojdbc7.jar</systemPath>
        </dependency>


## ch3.Using Spring Boot

### 3.1. Build System
Dependency 관리를 위해 빌드 도구를 선택한다. 추천하는 도구는 **Maven**과 **Gradle**이 있다.

#### 3.1.1. Maven
        -통합테스트를 실행하기 전에 실행가능한 jar, war를 패키징하고, spring boot 애플리케이션을 
        실행하고, 빌드정보를 생성한다
        -필요한 라이브러리를 특정 문서(pom.xml)에 정의해 놓으면 내가 사용할 라이브러리 뿐만 아니라
        해당 라이브러리가 작동하는데 필요한 다른 라이브러리들까지 관리하여 네트워크를 통해
        자동으로 다운 받는다
        -스프링 부트 의존관계는 org.springframework.boot groupId를 사용한다. 

[참조문서1]: https://goddaehee.tistory.com/199
[참조문서2]: https://docs.spring.io/spring-boot/docs/2.4.0-SNAPSHOT/maven-plugin/reference/htmlsingle/#using
참조
[https://goddaehee.tistory.com/199][참조문서1] </br>
[https://docs.spring.io/spring-boot/docs/2.4.0-SNAPSHOT/maven-plugin/reference/htmlsingle/#using][참조문서2]

#### 3.1.2. Gradle
        -Groovy 기반의 빌드도구이다. Maven의 pom.xml을 Gradle로 변환도 가능하며 Maven의 중앙 저장소도 지원하기 때문에 라이브러리를 모두 그대로 가져다 사용 가능하다
        -compile("org.springframework.boot:groupId)의 형식으로 의존성을 설정한다
        
[참조문서3]: https://docs.spring.io/spring-boot/docs/2.4.0-SNAPSHOT/maven-plugin/reference/htmlsingle/
참조
[https://docs.spring.io/spring-boot/docs/2.4.0-SNAPSHOT/maven-plugin/reference/htmlsingle/][참조문서3]

#### 3.1.3. Ant
        -긴 스크립트 작성을 해야하기 때문에 안쓰는 추세
        
#### 3.1.4. starter
starter 의존성은 spring-boot-starter-* 의 네이밍 구조를 를 갖는다
        
### 3.2. Structuring Your Code
기존의 Spring은 web.xml문서를 통해 메타정보를 활용,     
        
### jj

화살표 함수는 함수를 간략히 기술할 수 있다. this를 묶는 것이 가능하다. const calcSum = (a, b, c) => { const result = a + b + c; return result;}; 화살표 함수의 정의가 한 줄인 경우 {}와 return을 생략할 수 있다
const calcSum = Function (a, b, c) { const result = a + b + c; return result;}      
함수의 파라미터 초깃값 설정, function calcSum(price, tax = 0.1) { const result = price + price * tax } calcSum(10000) 결과: 11000 calucSum(10000, 0.5) 결과: 150000
정해지지 않은 파라미터의 개수를 가지는 함수는 ...을 이용하여 ...파라미터와 같은 방식으로 정의한다. function calcSum(...prices) { let result = 0; for(const value of prices) { result += value;} return result; } calcSum(10, 20) 결과 30, calcSum(100, 200 300); 결과 600
자바스크립트는 웹페이지의 텍스트나 스타일을 변경할 수 있다. 이와 같이 HTML각 요소에 접근하는 방식은 DOM 인터페이스로 정의되어 있다. DOM은 트리 구조를 사용하여 HTML문서를 다룬다. 

트리의 각 구성요소를 노드라고 한다. 노드는 자바스크립트에서 Node객체로 취급하며, 요소를 가져오거나 추가하는 작업이 가능하다. Node 객체의 속성과 메소드는 노드.속성과 노드.메소드로 접근이 가능하다. HTML문서 전체의 요소는 document를 사용해 가져올 수 있으며, 그 자체가 커다란 Node 객체가 된다.
노드는 요소노드(태그), 속성노드(태그 속성), 텍스트노드(일반 텍스트)종류가 있다.
요소노드는 자바스크립트에서 element객체로 취급하며 요소의 데이터를 변경하거나 CSS클래스를 변경하는 등의 작업이 가능하다. 
DOM과 node의 차이??


### Pandas
Pandas는 열 중심 데이터 분석 API,
from __future__ import print_function
import pandas as pd
pd.__version__
Pandas의 기본 데이터 구조는 두 가지 클래스로 구현된다
DataFrame은 행 및 이름 지정된 열이 포함된 관계형 데이터 테이블
Series는 하나의 열이다. DataFrame에는 하나 이상의 Series와 각 Series의 이름이 포함된다

Series를 만드는 법은 Series 객체를 생성하는 것이다
pd.Series(['one', 'two', 'three'])

DataFrame 객체는 열 이름과 매핑되는 dict를 각각의 Series에 전달하여 만들 수 있다
city_names = pd.Series(['San Francisco', 'San Jose', 'Sacramento'])
population = pd.Series([852469, 1015785, 485199])
pd.DataFrame({'City name':city_names, 'Poulation':population})
하지만 대부분의 경우 전체 파일을 DataFrame으로 로드한다
pd.read_csv("url", sep=",")

DataFrame.head(), tail(): DataFrame 레코드 중 처음 몇개, 맨뒤 몇개만 표시한다. 데이터가 잘 로드되었는지 확인할때 사용하면 유용하다
DataFrame.hist('col'): 막대그래프로 한 열에서 값의 분포를 알 수 있다
DataFrame['column'] = pd.Series(....) 등으로 DataFrame수정이 가능하다

cities['Is wide and has saint name'] = (cities['Area square miles'] > 50) & cities['City name'].apply(lambda name: name.startswith('San'))
cities

### tensorflow
import tensorflow af tf
import matplotlib.pyplot as plt #데이터 세트 시각화
import numpy as np #저수준 숫자 Python 라이브러리
import pandas as pd #고수준 숫자 Python 라이브러리

파이썬-Pandas-tensorflow-












<h2># Spring RestAPI</h2>

<h3>ch2</h3>
-application.properties -> application.yml로 변경</br>
-HomeController에서 문자열, Json, .ftl파일 형태로 문자열 출력</br>
-@GetMapping: 해당 주소의 리소스를 이용하기 위해 GET method로 호출한다</br>
-@ResponseBody: 결과를 응답에 그대로 출력한다. @ResponseBody를 지정하지 않으면 return에 지정된 "helloworld"이름으로 된 파일을 프로젝트 경로에서 찾아 화면에 출력한다</br>

<h3>ch3</h3>
-H2 Database: 최소한의 리소스로 실행 가능한 경량 DB로서 테스트 용으로 사용하기 알맞다.</br>
-@RequiredArgsConstructor: class 상단에 선언하면 class 내부에 final로 선언된 객체에 대해서 Constructor Injection을 수행한다. 대신에 선언된 객체에 @Autowired를 사용해도 된다</br>
-@RestController: 결과 데이터를 JSON으로 내보낸다
-@RequestMapping(value="/v1"): api 리소스를 버전별로 관리하기 위해 v1을 모든 리소스 주소에 적용되도록 처리한다</br>
-userJpaRepo.findAll(): JPA를 사용하면 기본으로 CRUD에 대해서는 별다른 설정 없이 쿼리를 질의할 수 있도록 메소드를 지원한다. findAll()은 select msrl, name, uid from user; 쿼리를 내부적으로 실행 시켜준다</br>
-@PostMapping(value = "/user"): user테이블에 데이터를 1건 입력한다. JPA에서 기본적으로 제공하는  메소드이며 user 객체를 전달하면 insert into user(msrl, name, uid) values(null, ?, ?); 쿼리를 내부적으로 실행시켜준다</br>












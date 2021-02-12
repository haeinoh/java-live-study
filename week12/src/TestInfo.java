
public @interface TestInfo  {
    int count();
    String testString();
    Grade grade(); // enum도 정의 가능
    String myJob() default  "JOB"; // 기본값 지정도 가능
}

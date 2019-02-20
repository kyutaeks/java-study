package exam.ex03;

public class StaticExam01 {
	public static String name = "하하";

	public static void main(String[] args) {
		StaticExam01.name ="히히";
		StaticExam01 se = new StaticExam01();
		System.out.println(se.name);
		System.out.println(StaticExam01.name);
//		모든 클래스는 static 이다.static영역에서는 static만 사용가능하다.
//		즉  main 밑에 name= "나나";를 쓸수있다.
	}
}

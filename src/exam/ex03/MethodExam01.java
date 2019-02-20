package exam.ex03;

public class MethodExam01 {
	public String name = "홍길동";

	public static void setTest(MethodExam01 me1) {
		me1 = new MethodExam01();
	}

	public static void main(String[] args) {
		MethodExam01 me = new MethodExam01();
//		4라인으로 초기화 name = 홍길동
		System.out.println(me.name);
		me.name = "임꺽정";
		MethodExam01.setTest(me);
//		me 와 me1 이 바라보는 곳은 같다.
//		하지만 여기서 7라인에 me1 의 메모리를 새로 생성해줬기때문에 바라보는곳이 달라진다.

		System.out.println(me.name);

	}
}

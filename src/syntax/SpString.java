package syntax;

public class SpString {
	public static void main(String[] args) {
		String str = "\"\ta\nb";
		//역슬래쉬 넣으면 "가 출력됨
		//\t : 탭을 추가함
		//\n : 다음줄로 넘김
		//\\ : 역슬래쉬를 넣음
		//\r : \n과 똑같지만 시스템마다 달라서 \r을 앞에 넣어줘야하는 시스템이있다.
		//윈도우는 \n만 써줘도 된다.
		System.out.println(str);
	}
}

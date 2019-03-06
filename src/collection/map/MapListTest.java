package collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapListTest {
	public static void main(String[] args) {
		List<String> test = new ArrayList<>();
		test.add("홍길동");
		test.add("33");
		test.add("서울시 강서구");
		List<String> test2 = new ArrayList<>();
		test.add("ABC");
		test.add("22");
		test.add("서울시 종로");

		List<List<String>> test3 = new ArrayList<>();
		test3.add(test);
		System.out.println(test);
		System.out.println(test2);
		System.out.println(test3.get(0).get(1));
		

		Map<String, String> map = new HashMap<>();
		map.put("이름", "홍길동");
		map.put("나이", "33");
		map.put("주소", "강서구");

		Map<String, String> map1 = new HashMap<>();
		map1.put("이름", "ABC");
		map1.put("나이", "22");
		map1.put("주소", "서울시 종로");
		
		List<Map<String,String>> mapList = new ArrayList<>();
		mapList.add(map);
		mapList.add(map1);
		System.out.println(map);
		System.out.println(map1);
		System.out.println(mapList);
		System.out.println(mapList.get(1).get("이름"));

	}
}

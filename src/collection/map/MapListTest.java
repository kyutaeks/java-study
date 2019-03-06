package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapListTest {
	public static void main(String[] args) {
//		List<String> test = new ArrayList<>();
//		test.add("홍길동");
//		test.add("33");
//		test.add("서울시 강서구");
//		
//		List<String> test2 = new ArrayList<>();
//		test2.add("ABC");
//		test2.add("22");
//		test2.add("서울시 종로");
//
//		List<List<String>> test3 = new ArrayList<>();
//		test3.add(test);
//		test3.add(test2);
//		System.out.println(test);
//		System.out.println(test2);
//		System.out.println(test3.get(0).get(1));
		

		Map<String, String> map = new HashMap<>();
		map.put("이름", "홍길동");
		map.put("나이", "33");
		map.put("주소", "강서구");

		Map<String, String> map1 = new HashMap<>();
		map1.put("이름", "ABC");
		map1.put("나이", "22");
		map1.put("주소", "서울시 종로");
//		List 배열과 Map배열 둘다배열인데 Map 은 키값과 밸류를 가지고있는 배열 <- 이 두가지가 차이점이다.
//		List 안에 List가 있는거처럼 
//		Map안에도 Map이 들어갈수있다.
//		List<Map<String,String>> mapList = new ArrayList<>();
//		mapList.add(map);
//		mapList.add(map1);
//		System.out.println(map);
//		System.out.println(map1);
//		System.out.println(mapList);
//		System.out.println(mapList.get(1).get("나이"));
		
//		Iterator<String> it = map1.keySet().iterator();
//		while(it.hasNext()) {
//			String key = it.next();
//			System.out.println("key :" + key);
//			System.out.println("value :" + map1.get(key));
//		}
		
		Map<Map<String,String>,Map<String,String>> mmap = new HashMap<>();
		mmap.put(map,map1);
		System.out.println(mmap);
		System.out.println(mmap.get(map).get("이름"));
		

	}
}

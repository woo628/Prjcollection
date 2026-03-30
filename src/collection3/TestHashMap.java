package collection3;

import java.util.HashMap;

public class TestHashMap {

	public static void main(String[] args) {
		HashMap<String, Object> map = new HashMap<>();
		
		map.put("num", 1);
		map.put("name", "송중기");
		map.put("kor", 90);
		map.put("eng", 95);
		map.put("mat", 92);
		map.put("height", 178.3);
		
		System.out.println(map);
		
		int num = (int) map.get("num"); 
		
		// String name = (String) map.get("name"); 비추
		String name = String.valueOf(map.get("name")); // 필수 object > String
		
		int kor = (int) map.get("kor");
		int eng = (int) map.get("eng");
		int mat = (int) map.get("mat");
		double height = (double) map.get("height");
		System.out.println(num + " " + name + " " + kor + " " + eng + " " + mat + " " + height);
	}

}

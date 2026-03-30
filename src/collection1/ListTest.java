package collection1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		
		// 배열 → ArrayList로
		String [] names = {"홍길동","이길동","박길동","최길동"};
		List<String> nameList = Arrays.asList(names);
		
		System.out.println(nameList);
		
		// nameList.add("나길동"); → Arrays.asList(names) 변환한 리스트는 add() 할 수 없다 , size 변경 x
		for (int i = 0; i < nameList.size(); i++) {
			String name = nameList.get(i);
			System.out.print(name + " ");
		}
		System.out.println();
		
		// sort
		// 람다식 : (a,b) → a.compareTo(b)
		// boolean func(String a, String b) { return a,compareTo(b);}
		
		// 오름차순 Collections.sort(nameList); → ascending sort 
		Collections.sort(nameList);
		System.out.println(nameList);
		
		// 오름차순 정렬 a.compareTo(b)
		Collections.sort(nameList, (a,b) -> a.compareTo(b));
		System.out.println(nameList);
		
		// 내림차순 정렬
		Collections.sort(nameList, (a,b) -> b.compareTo(a));
		System.out.println(nameList);
		
		// 뒤집기
		Collections.reverse(nameList);
		System.out.println(nameList);
		
		
		
		
		
	}

}

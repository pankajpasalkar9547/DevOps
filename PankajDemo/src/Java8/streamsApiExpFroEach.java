package Java8;

import java.util.ArrayList;
import java.util.List;

public class streamsApiExpFroEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<10;i++)
		{
			list.add(i);
		}
		
		list.stream().forEach(p->{
			System.out.println(p);
		});

	}

}

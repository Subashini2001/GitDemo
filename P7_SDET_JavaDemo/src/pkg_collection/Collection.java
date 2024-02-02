
	package pkg_collection;
	import java.util.*;

	 
	public class Collection {
		public static void main(String args[]) {
			
			List<String> list=new ArrayList<String>();
			
			list.add("Shan");
			list.add("Bhuvana");
			list.add("Nathiya");
			list.add("Anu");
			list.add("Viji");
			list.add("Suba");
			
			Set<Integer> set= new LinkedHashSet<Integer>();
			
			set.add(100);
			set.add(23);
			set.add(15);
			set.add(88);
			set.add(83);
			set.add(92);
			
			Iterator<Integer> it=set.iterator();
			
			Map<String,Integer> map=new LinkedHashMap<String,Integer>();
			
			map.put(list.get(0),it.next());
			map.put(list.get(1),it.next());
			map.put(list.get(2),it.next());
			map.put(list.get(3),it.next());
			map.put(list.get(4),it.next());
			map.put(list.get(5),it.next());
			
			for(Map.Entry<String,Integer> entry : map.entrySet()) {
				System.out.println(entry.getKey()+" -> "+entry.getValue());
			}
		}
	 
	}


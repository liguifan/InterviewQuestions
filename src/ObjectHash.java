import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;


class Person{
	private int age;
	private String name;
	
	
	public Person(int a,String name){
		this.age=a;
		this.name=name;
	}
	
	
	public String toString(){
		return "name is "+name+" age is "+age;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}



public class ObjectHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Person p1=new Person(5, "liguifan");
		Person p2=new Person(3, "james");
		Person p3=new Person(7, "weizhen");
		Person p4=new Person(5, "liguifan");
		
		Map<Person, Integer> map=new HashMap<Person, Integer>();
		map.put(p1, 10);
		map.put(p2, 11);
		map.put(p3, 12);
		map.put(p4, 14);
		
		
		Queue<String> queue=new PriorityQueue<String>();
		List<String> list= new LinkedList<String>();
		
		
		for(Person p:map.keySet()){
			System.out.println(p+"  "+ map.get(p));
		}
		
	}

}

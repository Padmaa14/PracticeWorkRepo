package RegularPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapPractice {
	public static void main(String ar[]) {
		/**
		 * MAP's Iterate a map concurrent hashmap hashtable an every other things about
		 * map
		 */
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Padma");
		map.put(2, "rima0");
		map.put(3, "jinndra");
		map.put(4, "trupti");
		map.put(5, "jinndra");
		map.put(6, "trupti");
		map.put(7, "jinndra");
		map.put(8, "trupti");
		map.put(8, "jinndra");
		map.put(9, "trupti");
		map.remove(8);
		// Iterate using Map.Entry<K,V> map.entrySet()
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		// mapMethods
		// Put ALL method
		// Map with the object Person
		Map<Integer, String> map2 = new HashMap<>();
		map2.putAll(map);
		/**
		 * COMPUTE returns accepts in key and value in bi-function and returns the
		 * output
		 */
		map.compute(9, (key, val) -> val.concat(" bhandari"));

		Map<Person, Integer> obj = new HashMap<>();
		obj.put(new Person(1, 22, "sima", false), 1);
		obj.put(new Person(2, 21, "suraj", false), 7);
		obj.put(new Person(3, 29, "Radha", false), 9);
		obj.put(new Person(4, 24, "jayesh", false), 3);
		obj.put(new Person(5, 26, "bina", false), 5);
		//
		System.out.println("---- object as key in hashmap----------");
		for (Map.Entry<Person, Integer> ob : obj.entrySet()) {
			System.out.println(
					ob.getKey().getName() + " " + " with age " + ob.getKey().getAge() + " Roll-no: " + ob.getValue());
		}

		// Duplicate nos in array put in map with its count
		List<String> arrLlist = new ArrayList<>();
		arrLlist.add("padma");
		arrLlist.add("bina");
		arrLlist.add("radha");
		arrLlist.add("seema");
		arrLlist.add("padma");
		arrLlist.add("radha");
		Map<String, Long> mapa = arrLlist.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(mapa);// map with counting of which is duplicate stored in values
		// now to access the name of which is duplicate we need to do as below
		// we need to use entryset to access the map<k,v> key value pairs why because
		// map is not collection hence
		// so not mapa.stream() but as below
		System.out.println("---------------setfinal--------");
		Set<String> setfinal = mapa.entrySet().stream().filter(k -> k.getValue() > 1).map(e -> e.getKey())
				.collect(Collectors.toSet());
		
		System.out.println(setfinal);
		// another simple way to do this is that use frequency but it like doing it in
		// set so

		Set<String> set = arrLlist.stream().filter(ob -> Collections.frequency(arrLlist, ob) > 1)
				.collect(Collectors.toSet());
		System.out.println("-----------------------");
		System.out.println(set);
		

	}
}

class Person {
	int sr_no;
	int age;
	String name;
	boolean sex;
	int height;
	int weight;

	Person(int sr_no, int age, String name, boolean sex) {
		this.sr_no = sr_no;
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public int getSr_no() {
		return sr_no;
	}

	public void setSr_no(int sr_no) {
		this.sr_no = sr_no;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Person person = (Person) o;
		return sr_no == person.sr_no && age == person.age && sex == person.sex && height == person.height
				&& weight == person.weight && Objects.equals(name, person.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(sr_no, age, name, sex, height, weight);
	}

	@Override
	public String toString() {
		return "Person{" + "Serial no=" + sr_no + "age=" + age + ", name='" + name + '\'' + ", sex=" + sex + ", height="
				+ height + ", weight=" + weight + '}';
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

package RegularPractice.StreamsPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiPractice {
    public static void main(String[] args) {
        List<Customer> customerList = new ArrayList<>();
        List<Integer> phoneno = Arrays.asList(915689568, 919568569, 915454545, 729656969, 756956532);
        List<Integer> phone1 = Arrays.asList(729656969, 919568569, 915454545, 729656969, 756956532);
        List<Integer> phone2 = Arrays.asList(915689568, 919568569, 729656969, 729656969, 756956532);
        List<Integer> phone3 = Arrays.asList(729656969, 919568569, 915454545, 729656969, 756956532);
        customerList.add(new Customer(5, "sana", phoneno, new Address("delhi", 45556)));
        customerList.add(new Customer(6, "Aditi", null, new Address("pune", 45996)));
        customerList.add(new Customer(4, "Rina", phone2, new Address("Mumbai", 40026)));
        customerList.add(new Customer(2, "Priya", phone3, new Address("Mumbai", 45926)));

        //  customerList.stream().filter(a -> a.getAddress().getCity().equals("Mumbai")).forEach(System.out::println);
        List<Customer> lista = customerList.stream().filter(a -> a.getPhoneNos() != null && a.getPhoneNos().contains(915689568))
                .peek(System.out::println).collect(Collectors.toList());
       // lista.stream().forEach(System.out::println);
        
        //2nd and third largest element
        List<Integer> numbers=Arrays.asList(2,6,9,8,3,4);
        Integer maxNumber =numbers.stream().max(Comparator.comparing(Integer::valueOf)).get();
        List<Integer> maxNumbe=numbers.stream().sorted((a,a1)->-(a.compareTo(a1))).collect(Collectors.toList());
        Integer rdhighest=numbers.stream().sorted((a,a1)->-(a.compareTo(a1))).distinct().skip(2).findFirst().get();
        System.out.print(maxNumbe);
        System.out.println(rdhighest);

    }
}

class Customer {
    private long id;
    private String name;
    private List<Integer> phoneNos;

    public List<Integer> getPhoneNos() {
        return phoneNos;
    }

    public void setPhoneNos(List<Integer> phoneNos) {
        this.phoneNos = phoneNos;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Customer() {
    }

    public Customer(long id, String name, List<Integer> phoneNos, Address address) {
        this.id = id;
        this.name = name;
        this.phoneNos = phoneNos;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", name='" + name + '\'' + ", address=" + address + '}';
    }

    private Address address;
}

class Address {
    private String city;

    public Address(String city, int pincode) {
        this.city = city;
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Address{" + "city='" + city + '\'' + ", pincode='" + pincode + '\'' + '}';
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    private int pincode;

}

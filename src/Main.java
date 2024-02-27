import java.util.ArrayList;
import java.util.List;

public class Main {
    private static Company CreateCompany(int id,String name){
        Company company=new Company();
        company.companyId=id;
        company.companyName=name;
        return  company;
    }
    static void PrintList(List<Shop> shopList){
        for (Shop shop : shopList) {
            System.out.println(shop.shopName);
            System.out.println(shop.shopAddress);
            System.out.println(shop.shopId);
            System.out.println(shop.manager.name);
            System.out.println(shop.manager.lastName);
            System.out.println(shop.manager.birthDate);
            System.out.println("Employees:");
            for (int i = 0; i <shop.employees.size(); i++) {
                System.out.println(shop.employees.get(i).name);
            }
            System.out.println("Kasa Görevlisi:"+shop.kasaList.get(2).employee.name);
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<Shop> bimSubeListesi = createShopListBim();
        List<Shop> hakmarSubeListesi = createShopListHakmar();
        Company Hakmar=CreateCompany(1,"Hakmar");
        Hakmar.shops=hakmarSubeListesi;
        Company Bim=CreateCompany(2,"Bim");
        Bim.shops=bimSubeListesi;




        PrintList(hakmarSubeListesi);
        PrintList(bimSubeListesi);
    }

   public static List<Shop> createShopListHakmar() {
       List<Employee> employees1 = createListEmployeeHakmar();
       List<Kasa> kasaList1 = createKasaListHakmar(employees1);
       List<Employee> employees2 = createDifferentListEmployeeHakmar();
       List<Kasa> kasaList2 = createKasaListHakmar(employees2);
       List<Employee> employees3 = createAnotherDifferentListEmployeeHakmar();
       List<Kasa> kasaList3 = createKasaListHakmar(employees3);
        Shop shop = createShop("Hakmar Velibaba Subesi", "Velibaba mah nene hatun cadddesi", 1,
                createManager("12121","Numan","Yilmaz","12.12.1990"),employees1,kasaList1);
        Shop shop2 = createShop("Hakmar Pendik Merkez Sube", "Pendik mah nene hatun cadddesi", 2,
                createManager("23323","Ali","Yilmaz","12.12.1990"),employees2,kasaList2);
        Shop shop3 = createShop("Hakmar Kartal Merkez Sube", "Kartal mah nene hatun cadddesi", 3,
                     createManager("2332","Veli","Yilmaz","12.12.1990 "),employees3,kasaList3);
        List<Shop> shopList = new ArrayList<>();
        shopList.add(shop);
        shopList.add(shop2);
        shopList.add(shop3);
        return shopList;
    }
   public static List<Shop> createShopListBim() {
        List<Employee> employees1 = createListEmployeeBim();
        List<Kasa> kasaList1 = createKasaListBim(employees1);
        List<Employee> employees2 = createDifferentListEmployeeBim();
        List<Kasa> kasaList2 = createKasaListBim(employees2);
        List<Employee> employees3 = createAnotherDifferentListEmployeeBim();
        List<Kasa> kasaList3 = createKasaListBim(employees3);
        Shop shop = createShop("Bim Velibaba Subesi", "Velibaba mah nene hatun cadddesi", 1,
                createManager("12121","Numan","Yilmaz","12.12.1990"),
                employees1,kasaList1);
        Shop shop2 = createShop("Bim Pendik Merkez Sube", "Pendik mah nene hatun cadddesi", 2,
                createManager("23324","Ali","Yilmaz","12.12.1990"),
               employees2,kasaList2);
        Shop shop3 = createShop("Bim Kartal Merkez Sube", "Kartal mah nene hatun cadddesi", 3,
                createManager("2333","Yilmaz","Veli","01.12.2003 "),
               employees3,kasaList3);
        List<Shop> shopList = new ArrayList<>();
        shopList.add(shop);
        shopList.add(shop2);
        shopList.add(shop3);
        return shopList;
    }



    public static Shop createShop(String shopName, String shopAddress, int shopId, Manager manager,List<Employee> employeeList,List<Kasa> kasaList) {
        Shop shop = new Shop();
        shop.shopAddress = shopAddress;
        shop.shopName = shopName;
        shop.shopId = shopId;
        shop.manager = manager;
        shop.employees=employeeList;
        shop.kasaList=kasaList;
        return shop;
    }

    private static Manager createManager(String managerNo,String name,String lastName,String birthDate) {
        Manager manager = new Manager();
        manager.managerId= 32;
        manager.managerNo = managerNo;
        manager.name = name;
        manager.birthDate = birthDate;
        manager.lastName = lastName;
        return manager;
    }
    /*static List<Employee> createEmployee(int id,String employeeNo,String name,String lastname,String birthdate){
       Employee employeeList=new Employee();
        employeeList.employeeId=id;
        employeeList.employeeNo=employeeNo;
        employeeList.name=name;
        employeeList.lastName= lastname;
        employeeList.birthDate=birthdate;
        List<Employee> employees=new ArrayList<>();
        employees.add(employeeList);
        return employees;
    }*/

    public static Employee createEmployee(int id,String employeeNo,String name,String lastname,String birthdate){
        Employee employeeList=new Employee();
        employeeList.employeeId=id;
        employeeList.employeeNo=employeeNo;
        employeeList.name=name;
        employeeList.lastName= lastname;
        employeeList.birthDate=birthdate;
        return employeeList;
    }
    public static List<Employee> createListEmployeeHakmar(){
        List<Employee> employees=new ArrayList<>();
        Employee employee1=createEmployee(1,"200","Kemal","Kara","400");
        Employee employee2=createEmployee(2,"201","Sami","Iyi","403");
        Employee employee3=createEmployee(3,"204","Selami","Ses","405");
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        return employees;
    }
    public static List<Employee> createDifferentListEmployeeHakmar(){
        List<Employee> employees=new ArrayList<>();
        Employee employee1=createEmployee(1,"111","Mehmet","Yılmaz","123");
        Employee employee2=createEmployee(2,"222","Ayşe","Kaya","456");
        Employee employee3=createEmployee(3,"333","Mustafa","Demir","789");
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        return employees;
    }
    public static List<Employee> createAnotherDifferentListEmployeeHakmar(){
        List<Employee> employees=new ArrayList<>();
        Employee employee1=createEmployee(1,"444","Fatma","Kocabaş","321");
        Employee employee2=createEmployee(2,"555","Ahmet","Şahin","456");
        Employee employee3=createEmployee(3,"666","Zeynep","Kara","789");
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        return employees;
    }

    public static List<Employee> createListEmployeeBim(){
        List<Employee> employees=new ArrayList<>();
        Employee employee1=createEmployee(1,"123","Atay","Ergun","321");
        Employee employee2=createEmployee(2,"124","Ahmet","Alkan","122");
        Employee employee3=createEmployee(3,"125","Mehmet","Ak","120");
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        return employees;
    }
    public static List<Employee> createDifferentListEmployeeBim(){
        List<Employee> employees=new ArrayList<>();
        Employee employee1=createEmployee(1,"111","Ali","Veli","123");
        Employee employee2=createEmployee(2,"222","Ahmet","Mehmet","456");
        Employee employee3=createEmployee(3,"333","Ayşe","Fatma","789");
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        return employees;
    }
    public static List<Employee> createAnotherDifferentListEmployeeBim(){
        List<Employee> employees=new ArrayList<>();
        Employee employee1=createEmployee(1,"444","Zeynep","Deniz","321");
        Employee employee2=createEmployee(2,"555","Can","Emre","456");
        Employee employee3=createEmployee(3,"666","Elif","Gizem","789");
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        return employees;
    }

    public static Kasa createKasa(int kasa_id,String kasa_no,Employee employee){
        Kasa kasa=new Kasa();
        kasa.kasaId=kasa_id;
        kasa.kasaNo=kasa_no;
        kasa.employee=employee;
        return kasa;
    }
    public static List<Kasa> createKasaListHakmar(List<Employee> employees) {
        List<Kasa> kasaList = new ArrayList<>();
        for (Employee employee : employees) {
            Kasa kasa = createKasa(kasaList.size() + 1, "Kasa_" + (kasaList.size() + 1), employee);
            kasaList.add(kasa);
        }
        return kasaList;
    }
    public static List<Kasa> createKasaListBim(List<Employee> employees) {
        List<Kasa> kasaList = new ArrayList<>();
        for (Employee employee : employees) {
            Kasa kasa = createKasa(kasaList.size() + 1, "Kasa_" + (kasaList.size() + 1), employee);
            kasaList.add(kasa);
        }
        return kasaList;
        }
}
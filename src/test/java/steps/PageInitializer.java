package steps;

import Pages.AddNewEmployeePage;
import Pages.DashboardPage;
import Pages.EmployeeListPage;
import Pages.Loginpage;

public class PageInitializer {
    public static Loginpage loginpage;
    public static DashboardPage dash;
    public  static AddNewEmployeePage addNewEmployeePage;
    public static EmployeeListPage employeeListPage;

    public static void initializePageObjects(){
        loginpage = new Loginpage();
        dash = new DashboardPage();
        addNewEmployeePage = new AddNewEmployeePage();
        addNewEmployeePage = new AddNewEmployeePage();
    }
}

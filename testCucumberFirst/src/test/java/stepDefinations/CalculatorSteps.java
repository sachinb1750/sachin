package stepDefinations;


import static org.junit.Assert.assertNotNull;

//import com.sapient.impl.Calculator;


//import com.sapient.utils.WebDriverUtils;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CalculatorSteps extends Calculator{

    private Calculator calculater;

    @Before
    public void setUp() {
        calculater = new Calculator();
    }

    @Given("^Running Background Step$")
    public void backGroundStep() {
        System.out.println("Running Background Step");
    }


    @Given("^i have a calculator$")
    public void i_have_a_calculator() throws Throwable {
        System.out.println("Validate If I have a calculator");
        assertNotNull(calculater);
    }

    @When("^I add (\\d+) and (.*)$")
    public void i_add_and(int arg1, int arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        calculater.add(arg1, arg2);

    }

    @Then("^the result should be (\\d+)$")
    public void the_result_should_be(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Printing Results : " + calculater.getResult(calculater));
        calculater.getResult(calculater);
    }

    @Then("^the result should be \"([^\"]*)\"$")
    public void validateResult(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Printing Results : " + calculater.getResult(calculater));
        calculater.getResult(calculater);
    }

    @But("^Demonstrate Data Table$")
    public void demoDataTable(DataTable dt) {
        System.out.println("Demo Data Table");
        System.out.println("Printing Data Table : " + dt);
        System.out.println("Printing First Row : " + dt.getGherkinRows().get(0).getCells().size());
    }


    @When("^I subtract (\\d+) and (\\d+)$")
    public void i_subtract_and(int arg1, int arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        calculater.subtract(arg1, arg2);
    }


    @When("^I subtract \"([^\"]*)\" and \"([^\"]*)\"$")
    public void subtract(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Argument 1 : " +  arg1);
        System.out.println("Argument 2 : " +  arg2);
        calculater.subtract(Integer.valueOf(arg1), Integer.valueOf(arg2));
    }

    @When("^I multiply Input(\\d+) <val(\\d+)> and Input(\\d+) <val(\\d+)>$")
    public void i_multiply_Input_val_and_Input_val(int arg1, int arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        calculater.Multiply(arg1, arg2);
    }
    @When("^do some operation$")
    public void do_some_operation() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

}
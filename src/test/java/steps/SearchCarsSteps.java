package steps;

import java.util.List;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.CarsGuideHomePageActions;
import pages.actions.CarsSearchPageActions;
import utils.SeleniumDriver;

public class SearchCarsSteps {
	
	// Ctrl+Shift+o to import all 
	
	CarsGuideHomePageActions carsGuideHomePageActions=new CarsGuideHomePageActions();
	CarsSearchPageActions carsSearchPageActions=new CarsSearchPageActions();
	
	@Given("I am on the Home page {string} of Cars guide website")
	public void i_am_on_the_home_page_of_cars_guide_website(String websiteURL) {
	    SeleniumDriver.openPage(websiteURL);
	    
	}

	@When("I move to menu")
	public void i_move_to_menu(List<String> list) {
	    
		String menu = list.get(1);
		System.out.println("menu selected is "+menu);
		carsGuideHomePageActions.moveToBuySellMenu();
	}

	@And("click on {string} link")
	public void click_on_link(String searchCars) {
	    
		carsGuideHomePageActions.clickOnSearchCarsMenu();
	}

	@And("select {string} from Any Make dropdown")
	public void select_from_any_make_dropdown(String carBrand) {
	    
		carsSearchPageActions.selectCarMake(carBrand);
	}

	@And("select {string} from Any Model dropdown")
	public void select_from_any_model_dropdown(String carModel) {
		carsSearchPageActions.selectCarModel(carModel);
	}

	@And("select {string} from Any Location dropdown")
	public void select_from_any_location_dropdown(String carLocation) {
		carsSearchPageActions.selectCarLocation(carLocation);
	}

	@And("select {string} from Price dropdown")
	public void select_from_price_dropdown(String carPrice) {
		
		carsSearchPageActions.selectCarPrice(carPrice);
	    
	}

	@And("click on Find My Next Car")
	public void click_on_find_my_next_car() {
		
		carsSearchPageActions.clickOnFindMyNextCarButton();
	    
	}

	@Then("I Should see list of searched cars")
	public void i_should_see_list_of_searched_cars() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("page title shoul be {string}")
	public void page_title_shoul_be(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}

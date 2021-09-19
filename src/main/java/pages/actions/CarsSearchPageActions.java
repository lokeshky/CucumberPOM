package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.CarsSearchPageLocators;
import utils.SeleniumDriver;

public class CarsSearchPageActions {

	CarsSearchPageLocators carsSearchPageLocators= null;
	
	public CarsSearchPageActions() {
		
		this.carsSearchPageLocators=new CarsSearchPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carsSearchPageLocators);
	}
	
	public void selectCarMake(String carBrand) {
		
		Select selectCarMaker = new Select(carsSearchPageLocators.carMakeDropDown);
		selectCarMaker.selectByVisibleText(carBrand);
	}
	
	public void selectCarModel(String carModel) {
		
		Select selectCarMaker = new Select(carsSearchPageLocators.selectModelDropDown);
		selectCarMaker.selectByVisibleText(carModel);
	}

	public void selectCarLocation(String carLocation) {
	
	Select selectCarMaker = new Select(carsSearchPageLocators.selectLocationDropDown);
	selectCarMaker.selectByVisibleText(carLocation);
	}

	public void selectCarPrice(String carPrice) {
	
	Select selectCarMaker = new Select(carsSearchPageLocators.priceDropDown);
	selectCarMaker.selectByVisibleText(carPrice);
	}
	
	public void clickOnFindMyNextCarButton() {
		
		carsSearchPageLocators.findMyNextCarBtn.click();
		
		}
}


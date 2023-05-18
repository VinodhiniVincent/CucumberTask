package com.stepdef;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.pageobject.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class FlightBookingStepDef {

	HomePage home = new HomePage(Hook.driver);
	public static WebDriver driver;

	@Given("User Launch the application")
	public void userLaunchTheApplication() {
		Hook.driver.get("https://www.cheapair.com/");
	}

	@Given("User entered from and to")
	public void userEnteredFromAndTo(DataTable table) throws InterruptedException {
		Thread.sleep(2000);
		home.getFrom1Clear().click();
		List<String> list = table.asList();
		home.getFrom().sendKeys(list.get(0));
		Thread.sleep(1000);
		home.getFrom().sendKeys(Keys.ENTER);
		home.getTo().sendKeys(list.get(1));
		Thread.sleep(1000);
		home.getTo().sendKeys(Keys.ENTER);
	}

	@Given("User updated dates")
	public void userUpdatedDates() throws InterruptedException {
		home.getDeparture().click();
		home.getReturns().click();
		home.getOptions().click();
		Thread.sleep(1000);
	}

	@Given("User entered traveller count")
	public void userEnteredTravellerCount() {
		for(int i =1; i<=3;i++) {
			home.getAdults().click();
		}
		for(int i =1; i<=2;i++) {
			home.getSeniors().click();
		}
		for(int i =1; i<=2;i++) {
			home.getChildren().click();
		}
		for(int i =1; i<=1;i++) {
			home.getInfant().click();
		}
	}

	@Given("User clicked on search flights")
	public void userClickedOnSearchFlights() throws InterruptedException {
		home.getSearch().click();
		Hook.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@When("User clicked on lowest price economy flight")
	public void userClickedOnLowestPriceEconomyFlight() throws InterruptedException {
		Set<String> newWindow = Hook.driver.getWindowHandles();
		List<String> newWindows = new ArrayList<>();
		newWindows.addAll(newWindow);
		Hook.driver.switchTo().window(newWindows.get(1));
		home.getCloseButton().click();
		Hook.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		home.getEconomy().click();
		Hook.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		home.getEconomy1().click();
		Thread.sleep(4000);
	}

	@When("clicked on continue")
	public void clickedOnContinue() {
		home.getContinueto().click();
	}

	@Then("User entered passenger details")
	public void userEnteredPassengerDetails(DataTable table) {

		List<List<String>> list = table.asLists();
		home.getFirstName1().sendKeys(list.get(0).get(0));
		home.getLastName1().sendKeys(list.get(0).get(1));
		home.getFirstName2().sendKeys(list.get(1).get(0));
		home.getLastName2().sendKeys(list.get(1).get(1));
		home.getFirstName3().sendKeys(list.get(2).get(0));
		home.getLastName3().sendKeys(list.get(2).get(1));
		home.getFirstName4().sendKeys(list.get(3).get(0));
		home.getLastName4().sendKeys(list.get(3).get(1));
		home.getFirstName5().sendKeys(list.get(4).get(0));
		home.getLastName5().sendKeys(list.get(4).get(1));
		home.getFirstName6().sendKeys(list.get(5).get(0));
		home.getLastName6().sendKeys(list.get(5).get(1));
		home.getFirstName7().sendKeys(list.get(6).get(0));
		home.getLastName7().sendKeys(list.get(6).get(1));
		home.getFirstName8().sendKeys(list.get(7).get(0));
		home.getLastName8().sendKeys(list.get(7).get(1));
		home.getFirstName9().sendKeys(list.get(8).get(0));
		home.getLastName9().sendKeys(list.get(8).get(1));
	}
	@Then("User entered CC details")
	public void userEnteredCCDetails(DataTable table) {
		List<List<String>> lists = table.asLists();
		home.getCcNumber().sendKeys(lists.get(0).get(0));
		home.getCvv().sendKeys(lists.get(0).get(1));
		home.getName().sendKeys(lists.get(0).get(2));
		home.getAdd1().sendKeys(lists.get(0).get(3));
		home.getAdd2().sendKeys(lists.get(0).get(4));
		home.getCity().sendKeys(lists.get(0).get(5));
		home.getZip().sendKeys(lists.get(0).get(6));
		home.getPhone().sendKeys(lists.get(0).get(7));
	}
}

package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.stepdef.Hook;

public class HomePage {

	public HomePage(WebDriver driver) {
		PageFactory.initElements(Hook.driver, this);
	}
	@FindBy(id = "from1Clear")
	private WebElement from1Clear;
	
	public WebElement getFrom1Clear() {
		return from1Clear;
	}
	@FindBy(xpath = "//*[@tabindex='6']")
	private WebElement adults;
	
	@FindBy(xpath = "//*[@tabindex='8']")
	private WebElement seniors;
	
	@FindBy(xpath = "//*[@tabindex='10']")
	private WebElement children;
	
	@FindBy(xpath = "//*[@tabindex='12']")
	private WebElement infant;
	
	@FindBy(id = "from1")
	private WebElement from;
	
	public WebElement getAdults() {
		return adults;
	}

	public WebElement getSeniors() {
		return seniors;
	}

	public WebElement getChildren() {
		return children;
	}

	public WebElement getInfant() {
		return infant;
	}
	@FindBy(id = "to1")
	private WebElement to;
	
	@FindBy(id = "(//*[text()='Madras, India'])[1]")
	private WebElement madras;
	
	public WebElement getMadras() {
		return madras;
	}
	
	@FindBy(id = "(//*[text()='Delhi, India'])[1]")
	private WebElement delhi;
	
	public WebElement getDelhi() {
		return delhi;
	}
	@FindBy(id = "options")
	private WebElement options;
	
	@FindBy(xpath = "//*[@class='sc-hBxehG ctlyBb MarketingModal__CloseButton-sc-1805bkx-1 fsxaYy']")
	private WebElement closeButton; 
	
	public WebElement getCloseButton() {
		return closeButton;
	}
	@FindBy(xpath = "(//*[text()='5'])[2]")
	private WebElement departure;
	
	@FindBy(xpath = "(//*[text()='7'])[2]")
	private WebElement returns;
	
	
	@FindBy(xpath = "//*[text()='Search Flights']")
	private WebElement search;
	
	public WebElement getSearch() {
		return search;
	}

	public WebElement getOptions() {
		return options;
	}
	
	@FindBy(xpath = "//*[@class = 'sc-hBxehG dzkjdi']")
	private WebElement closeButton1;
	
	public WebElement getCloseButton1() {
		return closeButton1;
	}
	@FindBy(xpath = "(//*[text()='$196'])[2]")
	private WebElement economy;
	
	@FindBy(xpath = "(//*[text()='$196'])[3]")
	private WebElement economy1;
	
	public WebElement getEconomy1() {
		return economy1;
	}
	@FindBy(xpath = "//*[@class = 'sc-fnGiBr bJsruJ']")
	private WebElement continueto;
	
	@FindBy(id = "firstName1")
	private WebElement firstName1;
	
	@FindBy(id = "lastName1")
	private WebElement lastName1;
	
	@FindBy(id = "firstName2")
	private WebElement firstName2;
	
	@FindBy(id = "lastName2")
	private WebElement lastName2;
	
	@FindBy(id = "firstName3")
	private WebElement firstName3;
	
	@FindBy(id = "lastName3")
	private WebElement lastName3;
	
	@FindBy(id = "firstName4")
	private WebElement firstName4;
	
	@FindBy(id = "lastName4")
	private WebElement lastName4;
	
	@FindBy(id = "firstName5")
	private WebElement firstName5;
	
	@FindBy(id = "lastName5")
	private WebElement lastName5;
	
	@FindBy(id = "firstName6")
	private WebElement firstName6;
	
	@FindBy(id = "lastName6")
	private WebElement lastName6;
	
	@FindBy(id = "firstName7")
	private WebElement firstName7;
	
	@FindBy(id = "lastName7")
	private WebElement lastName7;
	
	@FindBy(id = "firstName8")
	private WebElement firstName8;
	
	@FindBy(id = "lastName8")
	private WebElement lastName8;

	@FindBy(id = "firstName9")
	private WebElement firstName9;
	
	@FindBy(id = "lastName9")
	private WebElement lastName9;
	
	@FindBy(id = "ccNum1")
	private WebElement ccNumber;
	
	@FindBy(id = "cvv1")
	private WebElement cvv;

	@FindBy(id = "paymentName1")
	private WebElement name;
	
	@FindBy(id = "paymentAddress1")
	private WebElement add1;
	
	@FindBy(id = "paymentAddress21")
	private WebElement add2;
	
	@FindBy(id = "paymanetCity1")
	private WebElement city;
	
	@FindBy(id = "paymentZip1")
	private WebElement zip;
	
	@FindBy(id = "paymentPhone1")
	private WebElement phone;

	public WebElement getFrom() {
		return from;
	}

	public WebElement getTo() {
		return to;
	}

	public WebElement getDeparture() {
		return departure;
	}

	public WebElement getReturns() {
		return returns;
	}

	public WebElement getEconomy() {
		return economy;
	}

	public WebElement getContinueto() {
		return continueto;
	}

	public WebElement getFirstName1() {
		return firstName1;
	}

	public WebElement getLastName1() {
		return lastName1;
	}

	public WebElement getFirstName2() {
		return firstName2;
	}

	public WebElement getLastName2() {
		return lastName2;
	}

	public WebElement getFirstName3() {
		return firstName3;
	}

	public WebElement getLastName3() {
		return lastName3;
	}

	public WebElement getFirstName4() {
		return firstName4;
	}

	public WebElement getLastName4() {
		return lastName4;
	}

	public WebElement getFirstName5() {
		return firstName5;
	}

	public WebElement getLastName5() {
		return lastName5;
	}

	public WebElement getFirstName6() {
		return firstName6;
	}

	public WebElement getLastName6() {
		return lastName6;
	}

	public WebElement getFirstName7() {
		return firstName7;
	}

	public WebElement getLastName7() {
		return lastName7;
	}

	public WebElement getFirstName8() {
		return firstName8;
	}

	public WebElement getLastName8() {
		return lastName8;
	}

	public WebElement getFirstName9() {
		return firstName9;
	}

	public WebElement getLastName9() {
		return lastName9;
	}

	public WebElement getCcNumber() {
		return ccNumber;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getAdd1() {
		return add1;
	}

	public WebElement getAdd2() {
		return add2;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getZip() {
		return zip;
	}

	public WebElement getPhone() {
		return phone;
	}
}

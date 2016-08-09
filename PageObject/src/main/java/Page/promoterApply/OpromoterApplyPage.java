package Page.promoterApply;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import BasicTool.WaitTool;
import DataBean.OpromoterBean;
import Page.AbstractPage;

public class OpromoterApplyPage extends AbstractPage{
	@FindBy(css="#check i[id='0']")
	private WebElement personRadioButton;
	
	@FindBy(css="#check i[id='1']")
	private WebElement companyRadioButton;
	
	@FindBy(css="#promoterName")
	private WebElement promoterNameTextFiled;
	
	@FindBy(css="#IdCardNo")
	private WebElement IdCardNoTextFiled;
	
	@FindBy(css="#telePhoneNo")
	private WebElement telePhoneNoTextFiled;
	
	@FindBy(css="#email")
	private WebElement emailTextFiled;
	
	@FindBy(css = "#province")
	private WebElement provinceTextFiled;
	
	@FindBy(css=".provinceContainer:not([style*='display: none']) .provinceA")
	private List<WebElement> provinceSelectList;
	
	@FindBy(css="#city")
	private WebElement cityTextFiled;
	
	@FindBy(css="#cooperSource")
	private WebElement cooperSourceTextFiled;
	
	@FindBy(css=".submit")
	private WebElement submitButton;
	
	@FindBy(css="a[href*='person']")
	private WebElement personOpromoterLink;
	
	@FindBy(css="a[href*='company']")
	private WebElement companyOpromoterLink;
	
	public OpromoterApplyPage(WebDriver driver) {
		super(driver);
		WaitTool.waitFor(driver, ExpectedConditions.visibilityOf(personRadioButton), 60);
	}
	
    public void fillOpromoterInformation(OpromoterBean opromoter) throws Exception{
    	if(opromoter.getPromotionDirection()== 0){
    		click(personRadioButton,promoterNameTextFiled);
    	}else{
    		click(companyRadioButton,promoterNameTextFiled);
    	}
    	if(StringUtils.isNoneEmpty(opromoter.getPromoterName())){
    		setInputText(promoterNameTextFiled, opromoter.getPromoterName());
    	}
    	if(StringUtils.isNoneEmpty(opromoter.getIdCardNo())){
    		setInputText(IdCardNoTextFiled, opromoter.getIdCardNo());
    	}
    	if(StringUtils.isNoneEmpty(opromoter.getTelePhoneNo())){
    		setInputText(telePhoneNoTextFiled, opromoter.getTelePhoneNo());
    	}
    	if(StringUtils.isNoneEmpty(opromoter.getEmail())){
    		setInputText(emailTextFiled, opromoter.getEmail());
    	}
    	if(StringUtils.isNoneEmpty(opromoter.getProvince())){
    		setInputText(provinceTextFiled, opromoter.getProvince());
    		emailTextFiled.click();
    	}
    	if(StringUtils.isNoneEmpty(opromoter.getCity())){
    		setInputText(cityTextFiled, opromoter.getCity());
    	}
    	if(StringUtils.isNoneEmpty(opromoter.getCooperSource())){
    		setInputText(cooperSourceTextFiled, opromoter.getCooperSource());
    	}
	}
	
    public void selectProvinceByLabel(String option) throws Exception{
    	provinceTextFiled.click();
    	WaitTool.waitFor(this.driver, ExpectedConditions.visibilityOf(provinceSelectList.get(0)),
                WaitTool.getDefaultWait4Page());
    	for (WebElement optionElement : provinceSelectList) {
            if (optionElement.getText().trim().equals(option)) {
                optionElement.click();
                return;
            }
        }
    	throw new Exception("The expected option is not listed in select list options");
    }
    
	public SucessToastPage clickSubmitButton() throws Exception{
		return click(submitButton,SucessToastPage.class);
	}
	
	public PersonOpromoterPage clickPersonOpromoterLink() throws Exception{
		 return click(personOpromoterLink,PersonOpromoterPage.class);
	}
	
	public CompanyOpromoterPage clickCompanyOpromoterLink() throws Exception{
		return click(companyOpromoterLink, CompanyOpromoterPage.class);
	}

}

package io.stage.hudinielevate.cms.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Properties;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.stage.hudinielevate.cms.base.BaseClass;
import io.stage.hudinielevate.cms.util.CommonUtil;
import io.stage.hudinielevate.cms.util.ElementActions;
import io.stage.hudinielevate.cms.util.ExcelUtil;

public class DesignConfigsPage extends BaseClass {

	public static WebDriver driver;
	public static Properties properties;
	public static ElementActions elementActions;
	public static CommonUtil commonUtil;

	//constructor for maintaining same driver instance
	public DesignConfigsPage(WebDriver driver) {
		this.driver = driver;
		elementActions = new ElementActions(driver);
		new WebDriverWait(driver, Duration.ofSeconds(10));
	}


	//Webelements for navigating design configs page
	private By designConfigsLnk=By.xpath("//div[@title='Design Configs']");

	//Webelements for pages module
	private By pageTb = By.xpath("//span[text()='Pages']");
	private By addPageBtn = By.xpath("//span[normalize-space()='Add Page']");
	private By nameTxtBx = By.id("name_input");
	private By addBtn = By.xpath("//span[text()='Add']");
	private By searchMenuTxtBx = By.xpath("//input[@type='text']");
	private By oneOfOneResultsTxt = By.xpath("//p[text()='1-1 of 1']");

	//Webelements for text banners module component
	private By pageNameTxt = By.xpath("(//tbody[@class='MuiTableBody-root']/tr/td)[1]");
	private By textbannercomponent = By.xpath("//div[text()='Text']");
	private By paddingtop = By.xpath("//input[@id='padding_top_input']");
	private By paddingdown = By.xpath("//input[@id='padding_bottom_input']");
	private By texttype = By.xpath("//div[@id='text_type_select']");////*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeLarge']
	private By visibletext=By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[3]");
	private By inputtext=By.xpath("//textarea[@id='input_text_input']");
	private By collapse1BHeroBanner = By.xpath("//div[@class='col-md-2 d-flex justify-content-end']");


	//Webelements related to carousels component
	private By carouselsDpDwn = By.xpath("//div[text()='Carousels']");
	private By LargeCarousel = By.xpath("//img[contains(@alt,'6 - Large IMG w/Carousel')]");
	private By hotelmodulecomonent=By.xpath("//div[@id='hotel_module_select']");
	private By hotelmodulecomonenttitle=By.xpath("//li[text()='Hotel Compendium']");
	private By imageupload1=By.xpath("//div[@class='mb-4 mt-4']//div[@class='d-flex align-items-center img-select justify-content-center']");
	private By title2 = By.xpath("(//div[@class='MuiFormControl-root w-100'])[2]");
	private By title2visibletext = By.xpath("//li[text()='Training sessions']");
	private By imageupload2 = By.xpath("//div[@class='col-md-12 mt-4']//div[@class='col-md-12 mt-4']//div[@class='d-flex align-items-center img-select justify-content-center']");
	private By inactivebutton = By.xpath("//input[contains(@value,'view_all_status_inactive')]");
	private By remove2 = By.xpath("//div[@class='text-underlined pointer']");
	private By remove3 = By.xpath("//div[@class='text-underlined pointer']");
	private By remove4=By.xpath("//div[@class='text-underlined pointer']");
	private By collapseLandscape2Dcomponent = By.xpath("//div[@class=' component-title col-md-10 ps-2'][normalize-space()='6 - Large IMG w/Carousel']");
    private By clickslide2=By.xpath("//span[normalize-space()='Slide 2']");
    private By getTitle3visibletext=By.xpath("//li[text()='Conventions']");
    private By loader=By.xpath("//div[@class='loader-container d-flex justify-content-center align-items-center h-100']");

	


	//Webelements related to image component
	private By imageDpDwn = By.xpath("//div[contains(text(),'Image Components')]");
	private By largeimage = By.xpath("//img[contains(@alt,'15 - Large Image')]");
	private By imageupload3 = By.xpath("//div[@class='d-flex align-items-center img-select justify-content-center']");
	private By collapselargeimage10Component = By.xpath("//div[contains(@class,'component-title col-md-10 ps-2')][normalize-space()='15 - Large Image']");
    
	private By saveasdraft=By.xpath("//span[text()='Save as Draft']");
    private By tagetlocation=By.xpath("//div[@class='page-builder-scroll scroll-styled']");

	//getter setter methods for navigating design configs page
	public By getDesignConfigsLnk() {
		return designConfigsLnk;
	}
	public void setDesignConfigsLnk(By designConfigsLnk) {
		this.designConfigsLnk = designConfigsLnk;
	}
	public By getClickslide2() {
		return clickslide2;
	}
	public void setClickslide2(By clickslide2) {
		this.clickslide2 = clickslide2;
	}
	public By getSaveasdraft() {
		return saveasdraft;
	}
	public void setSaveasdraft(By saveasdraft) {
		this.saveasdraft = saveasdraft;
	}
	public By getGetTitle3visibletext() {
		return getTitle3visibletext;
	}
	public void setGetTitle3visibletext(By getTitle3visibletext) {
		this.getTitle3visibletext = getTitle3visibletext;
	}
	 public By getLoader() {
			return loader;
		}
		public void setLoader(By loader) {
			this.loader = loader;
		}


	//getter setter method for pages module
	public By getPageTb() {
		return pageTb;
	}
	public void setPageTb(By pageTb) {
		this.pageTb = pageTb;
	}
	public By getTagetlocation() {
		return tagetlocation;
	}
	public void setTagetlocation(By tagetlocation) {
		this.tagetlocation = tagetlocation;
	}
	public By getAddPageBtn() {
		return addPageBtn;
	}
	public void setAddPageBtn(By addPageBtn) {
		this.addPageBtn = addPageBtn;
	}
	public By getNameTxtBx() {
		return nameTxtBx;
	}
	public void setNameTxtBx(By nameTxtBx) {
		this.nameTxtBx = nameTxtBx;
	}
	public By getAddBtn() {
		return addBtn;
	}
	public void setAddBtn(By addBtn) {
		this.addBtn = addBtn;
	}
	public By getSearchMenuTxtBx() {
		return searchMenuTxtBx;
	}
	public void setSearchMenuTxtBx(By searchMenuTxtBx) {
		this.searchMenuTxtBx = searchMenuTxtBx;
	}
	public By getOneOfOneResultsTxt() {
		return oneOfOneResultsTxt;
	}
	public void setOneOfOneResultsTxt(By oneOfOneResultsTxt) {
		this.oneOfOneResultsTxt = oneOfOneResultsTxt;
	}

	//getter setter for banners component
	public By getPageNameTxt() {
		return pageNameTxt;
	}
	public void setPageNameTxt(By pageNameTxt) {
		this.pageNameTxt = pageNameTxt;
	}
	public By getAddComponentBtn() {
		return addComponentBtn;
	}
	public void setAddComponentBtn(By addComponentBtn) {
		this.addComponentBtn = addComponentBtn;
	}
	private By addComponentBtn = By.xpath("//button[@type='submit']");
	public By getTextbannercomponent() {
		return textbannercomponent;
	}
	public void setTextbannercomponent(By textbannercomponent) {
		this.textbannercomponent = textbannercomponent;
	}
	public By getPaddingtop() {
		return paddingtop;
	}
	public void setPaddingtop(By paddingtop) {
		this.paddingtop = paddingtop;
	}
	public By getPaddingdown() {
		return paddingdown;
	}
	public void setPaddingdown(By paddingdown) {
		this.paddingdown = paddingdown;
	}
	public By getTexttype() {
		return texttype;
	}
	public void setTexttype(By texttype) {
		this.texttype = texttype;
	}
	public By getVisibletext() {
		return visibletext;
	}
	public void setVisibletext(By visibletext) {
		this.visibletext = visibletext;
	}
	public By getInputtext() {
		return inputtext;
	}
	public void setInputtext(By inputtext) {
		this.inputtext = inputtext;
	}
	public By getCollapse1BHeroBanner() {
		return collapse1BHeroBanner;
	}
	public void setCollapse1BHeroBanner(By collapse1bHeroBanner) {
		collapse1BHeroBanner = collapse1bHeroBanner;
	}
	public By getCarouselsDpDwn() {
		return carouselsDpDwn;
	}
	public void setCarouselsDpDwn(By carouselsDpDwn) {
		this.carouselsDpDwn = carouselsDpDwn;
	}
	public By getLargeCarousel() {
		return LargeCarousel;
	}
	public void setLargeCarousel(By largeCarousel) {
		LargeCarousel = largeCarousel;
	}
	public By getHotelmodulecomonent() {
		return hotelmodulecomonent;
	}
	public void setHotelmodulecomonent(By hotelmodulecomonent) {
		this.hotelmodulecomonent = hotelmodulecomonent;
	}
	public By getHotelmodulecomonenttitle() {
		return hotelmodulecomonenttitle;
	}
	public void setHotelmodulecomonenttitle(By hotelmodulecomonenttitle) {
		this.hotelmodulecomonenttitle = hotelmodulecomonenttitle;
	}
	public By getImageupload1() {
		return imageupload1;
	}
	public void setImageupload1(By imageupload1) {
		this.imageupload1 = imageupload1;
	}
	public By getTitle2() {
		return title2;
	}
	public void setTitle2(By title2) {
		this.title2 = title2;
	}
	public By getTitle2visibletext() {
		return title2visibletext;
	}
	public void setTitle2visibletext(By title2visibletext) {
		this.title2visibletext = title2visibletext;
	}
	public By getImageupload2() {
		return imageupload2;
	}
	public void setImageupload2(By imageupload2) {
		this.imageupload2 = imageupload2;
	}
	public By getInactivebutton() {
		return inactivebutton;
	}
	public void setInactivebutton(By inactivebutton) {
		this.inactivebutton = inactivebutton;
	}
	public By getRemove2() {
		return remove2;
	}
	public void setRemove2(By remove2) {
		this.remove2 = remove2;
	}
	public By getRemove3() {
		return remove3;
	}
	public void setRemove3(By remove3) {
		this.remove3 = remove3;
	}
	public By getRemove4() {
		return remove4;
	}
	public void setRemove4(By remove4) {
		this.remove4 = remove4;
	}
	public By getCollapseLandscape2Dcomponent() {
		return collapseLandscape2Dcomponent;
	}
	public void setCollapseLandscape2Dcomponent(By collapseLandscape2Dcomponent) {
		this.collapseLandscape2Dcomponent = collapseLandscape2Dcomponent;
	}
	public By getImageDpDwn() {
		return imageDpDwn;
	}
	public void setImageDpDwn(By imageDpDwn) {
		this.imageDpDwn = imageDpDwn;
	}
	public By getLargeimage() {
		return largeimage;
	}
	public void setLargeimage(By largeimage) {
		this.largeimage = largeimage;
	}
	public By getImageupload3() {
		return imageupload3;
	}
	public void setImageupload3(By imageupload3) {
		this.imageupload3 = imageupload3;
	}
	public By getCollapselargeimage10Component() {
		return collapselargeimage10Component;
	}
	public void setCollapselargeimage10Component(By collapselargeimage10Component) {
		this.collapselargeimage10Component = collapselargeimage10Component;
	}




	public void navigateToDesignConfigPage() {
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elementActions.clickOnElement(getDesignConfigsLnk());
	}

	public boolean createPage() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elementActions.clickOnElement(getAddPageBtn());
		elementActions.sendKeysElement(getNameTxtBx(),ExcelUtil.fetchData("DesignConfigs", 1, 0) );
		elementActions.clickOnElement(getAddBtn());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elementActions.sendKeysElement(getSearchMenuTxtBx(), ExcelUtil.fetchData("DesignConfigs", 1, 0));
		boolean isPageCreated = elementActions.checkIfElementIsPresent(getOneOfOneResultsTxt());
		return isPageCreated;
	}

	public void addComponentsInAPage() throws AWTException {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elementActions.sendKeysElement(getSearchMenuTxtBx(),ExcelUtil.fetchData("DesignConfigs", 1, 0));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elementActions.clickOnElement(getPageNameTxt());
		elementActions.clickOnElement(getAddComponentBtn());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elementActions.dragAndDropElement(getTextbannercomponent(),getTagetlocation());
		elementActions.sendKeysElement(getPaddingtop(),ExcelUtil.fetchData("DesignConfigs", 1, 1));
		elementActions.sendKeysElement(getPaddingdown(),ExcelUtil.fetchData("DesignConfigs", 1, 2));
		elementActions.clickOnElement(getTexttype());
		elementActions.clickOnElement(getVisibletext());
		elementActions.sendKeysElement(getInputtext(), ExcelUtil.fetchData("DesignConfigs", 1, 3));
		elementActions.clickOnElement(getCollapse1BHeroBanner());

		//carousel
		elementActions.scrollAndClick(getCarouselsDpDwn());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elementActions.dragAndDropElement(getLargeCarousel(), getTagetlocation());
		elementActions.clickOnElement(getHotelmodulecomonent());
		elementActions.clickOnElement(getHotelmodulecomonenttitle());
		//elementActions.uploadImage(getImageupload1());
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//WebElement uploadElement1 = elementActions.clickOnElement(getImageupload1());
		WebElement uploadElement1 = driver.findElement(By.xpath("//div[@class='mb-4 mt-4']//div[@class='d-flex align-items-center img-select justify-content-center']"));
		uploadElement1.click();
		Robot robot = new Robot();
		robot.delay(2000);
		String filePath = "C:\\Users\\AkshayBashetti\\OneDrive - Mankara PTE LTD\\Desktop\\test\\large.jpg"; // Use the absolute path or create a relative path
		StringSelection stringSelection = new StringSelection(filePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		elementActions.clickOnElement(getTitle2());
		/*try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		elementActions.clickOnElement(getTitle2visibletext());
		/*try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		WebElement uploadElement2 = driver.findElement(By.xpath("//div[@class='col-md-12 mt-4']//div[@class='col-md-12 mt-4']//div[@class='d-flex align-items-center img-select justify-content-center']"));
		uploadElement2.click();
		Robot robot1 = new Robot();
		robot1.delay(2000);
		String filePath1 = "C:\\Users\\AkshayBashetti\\OneDrive - Mankara PTE LTD\\Desktop\\test\\large2.jpg"; // Use the absolute path or create a relative path
		StringSelection stringSelection1 = new StringSelection(filePath1);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection1, null);
		robot1.keyPress(KeyEvent.VK_CONTROL);
		robot1.keyPress(KeyEvent.VK_V);
		robot1.keyRelease(KeyEvent.VK_V);
		robot1.keyRelease(KeyEvent.VK_CONTROL);
		robot1.keyPress(KeyEvent.VK_ENTER);
		robot1.keyRelease(KeyEvent.VK_ENTER);
		elementActions.clickOnElement(getInactivebutton());
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elementActions.clickOnElement(getClickslide2());
		elementActions.clickOnElement(getRemove2());
		elementActions.clickOnElement(getRemove3());
		elementActions.clickOnElement(getRemove4());
		elementActions.clickOnElement(getCollapseLandscape2Dcomponent());

		//image component
		elementActions.scrollAndClick(getImageDpDwn());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elementActions.dragAndDropElement(getLargeimage(), getTagetlocation());
		//elementActions.uploadImage();
		WebElement uploadElement3 = driver.findElement(By.xpath("//div[@class='d-flex align-items-center img-select justify-content-center']"));
		uploadElement3.click();
		Robot robot2 = new Robot();
		robot2.delay(2000);
		String filePath2 = "C:\\Users\\AkshayBashetti\\OneDrive - Mankara PTE LTD\\Desktop\\test\\test3.jpg"; // Use the absolute path or create a relative path
		StringSelection stringSelection2 = new StringSelection(filePath2);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection2, null);
		robot2.keyPress(KeyEvent.VK_CONTROL);
		robot2.keyPress(KeyEvent.VK_V);
		robot2.keyRelease(KeyEvent.VK_V);
		robot2.keyRelease(KeyEvent.VK_CONTROL);
		robot2.keyPress(KeyEvent.VK_ENTER);
		robot2.keyRelease(KeyEvent.VK_ENTER);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elementActions.clickOnElement(getCollapselargeimage10Component());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elementActions.navigateToPage(getSaveasdraft());
		elementActions.clickOnElement(getSaveasdraft());
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
  
	
	//update component
	public void updateComponentsInAPage() throws AWTException {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elementActions.sendKeysElement(getSearchMenuTxtBx(),ExcelUtil.fetchData("DesignConfigs", 1, 0));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elementActions.clickOnElement(getPageNameTxt());
		elementActions.clearData(getInputtext());
		elementActions.sendKeysElement(getInputtext(), ExcelUtil.fetchData("DesignConfigs", 1, 4));
		elementActions.clickOnElement(getCollapse1BHeroBanner());
		
		//carousel
		elementActions.clickOnElement(getTitle2());
		/*try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		elementActions.clickOnElement(getGetTitle3visibletext());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elementActions.clickOnElement(getCollapseLandscape2Dcomponent());
		//image
		WebElement uploadElement3 = driver.findElement(By.xpath("//div[@class='d-flex align-items-center img-select justify-content-center']//div[contains(@class,'image-container')]"));
		uploadElement3.click();
		Robot robot3 = new Robot();
		robot3.delay(2000);
		String filePath3 = "C:\\Users\\AkshayBashetti\\OneDrive - Mankara PTE LTD\\Desktop\\test\\test6.jpg"; // Use the absolute path or create a relative path
		StringSelection stringSelection2 = new StringSelection(filePath3);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection2, null);
		robot3.keyPress(KeyEvent.VK_CONTROL);
		robot3.keyPress(KeyEvent.VK_V);
		robot3.keyRelease(KeyEvent.VK_V);
		robot3.keyRelease(KeyEvent.VK_CONTROL);
		robot3.keyPress(KeyEvent.VK_ENTER);
		robot3.keyRelease(KeyEvent.VK_ENTER);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elementActions.clickOnElement(getCollapselargeimage10Component());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elementActions.navigateToPage(getSaveasdraft());
		elementActions.clickOnElement(getSaveasdraft());
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elementActions.clickOnElement(getSearchMenuTxtBx());
		
		
	}


}

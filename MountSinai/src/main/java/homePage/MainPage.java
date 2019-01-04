package homePage;

import base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class MainPage extends BaseUtil {
    @FindBy(xpath = "//img[@alt='Mount Sinai']")
    public static WebElement logo;
    @FindBy(xpath = "//span[@class='hidden-xs']")
    public static WebElement phoneNumber;
    @FindBy(xpath = "//a[text()='MyChart']")
    public static WebElement myChart;
    @FindBy(xpath = "//a[text()='For Physicians']")
    public static WebElement forPhysicians;
    @FindBy(xpath = "//a[text()='News']")
    public static WebElement news;
    @FindBy(xpath = "//a[text()='Icahn School of Medicine']")
    public static WebElement icahnSchoolOfMedicine;
    @FindBy(xpath = "//a[contains(text(),'Make a Gift')]")
    public static WebElement makeAGift;
    @FindBy(linkText = "Find a Doctor")
    public static WebElement findADoctor;
    @FindBy(linkText = "Request an Appointment")
    public static WebElement requestAnAppointment1;
    @FindBy (linkText = "Our Locations")
    public static WebElement ourLocations;
    @FindBy (linkText = "Patient Care")
    public static WebElement patientCare;
    @FindBy (linkText = "About Us")
    public static WebElement aboutUs;
    @FindBy (linkText = "SEARCH")
    public static WebElement search;
    //@FindBy(xpath = "//div[@class='dropdown-menu mega-dropdown-menu search']//button[@class='btn btn-large']")
    public static WebElement searchButton;
    @FindBy(xpath = "//a[@class='hpcards__container--a']//i[@class='fa fa-calendar']")
    public static WebElement calender;
    @FindBy(xpath = "//span[contains(text(),'Book Now') and @class ='hpcards__container--content--title' ]")
    public static WebElement bookNow;
    @FindBy(xpath = "//span[contains(text(),'Book Now') and @class ='hpcards__container--content--title' ]")
    public static WebElement descriptionBookNow;
    @FindBy(linkText = "Book an Appointment")
    public static WebElement bookAnAppointment;
    @FindBy(xpath = "//a[@class='hpcards__container--a']//i[@class='fa fa-briefcase']")
    public static WebElement briefcase;
    @FindBy(xpath = "//span[contains(text(),'Urgent Care') and @class ='hpcards__container--content--title' ]")
    public static WebElement urgentCare;
    @FindBy(xpath = "//p[text()='No appointment needed. Walk-ins welcome. Locations throughout the New York City area.']")
    public static WebElement descriptionUrgentCare;
    @FindBy(xpath = "//span[text()='Find a Location']")
    public static WebElement findALocation;
    @FindBy(xpath = "//a[@class='hpcards__container--a']//i[@class='fa fa-clock-o']")
    public static WebElement clock;
    @FindBy(xpath = "//span[contains(text(),'Same-Day') and @class ='hpcards__container--content--title' ]")
    public static WebElement sameDay;
    @FindBy(xpath = "//p[text()='Call 844-463-2778 or click to request a same-day appointment.']")
    public static WebElement descriptionSameDay;
    @FindBy(xpath = "//a[@class='btn hpcards__container--content--link']//span[text()='Request an Appointment']")
    public static WebElement requestAnAppointment2;
    @FindBy(xpath = "//a[@class='hpcards__container--a']//i[@class='fa fa-globe']")
    public static WebElement global;
    @FindBy(xpath = "//span[contains(text(),'International') and @class ='hpcards__container--content--title' ]")
    public static WebElement international;
    @FindBy(xpath = "//p[contains(text(),'International Services provides')]")
    public static WebElement descriptionInternational;
    @FindBy(linkText = "Learn More")
    public static WebElement learnMore;
    @FindBy(xpath = "//h2[@class='section_title hpcards__container--main--title']")
    public static WebElement callUs;
    @FindBy(xpath = "//span[text()='Specialty']//parent::label//parent::li")
    public static WebElement specialty;
    @FindBy(xpath = "//span[text()='Primary Care']//parent::label")
    public static WebElement primaryCare;
    @FindBy(xpath = "//span[text()='Name']//parent::label")
    public static WebElement name;
    @FindBy(xpath = "//h1[contains(text(),'Find a Doctor')]")
    public static WebElement findADoctor2;
    @FindBy(xpath = "//select[@id='specialty']")
    public static WebElement selectSpecialty;
    @FindBy(xpath = "//div[@id='byspecialty_div']//input[@name='zipcode']")
    public static WebElement enterZipCode;
    @FindBy(xpath = "//div[@id='byspecialty_div']//button[@type='submit']")
    public static WebElement goZipCode;
    @FindBy(xpath = "//h2[contains(text(),'Choose a Location')]")
    public static WebElement chooseALocation;






//input[@name='search-by']//span[contains(text(),'Hospitals')]  or  //span[contains(text(),'Hospitals')]parents::label

    public void checkLogo() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        logo.click();
    }
    public void checkPhoneNumber() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        phoneNumber.click();
    }
    public void checkMyChart() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        myChart.click();
    }
    public void checkForPhysicians() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        forPhysicians.click();
    }
    public void checkNews() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        news.click();
    }
    public void checkIcahnSchoolOfMedicine() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        icahnSchoolOfMedicine.click();
    }
    public void checkMakeAGift() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        makeAGift.click();
    }
    public void checkFindADoctor() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        findADoctor.click();
    }
    public void checkRequestAnAppointment1() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        requestAnAppointment1.click();
    }
    public void checkOurLocations() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ourLocations.click();
    }
    public void checkPatientCare() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        patientCare.click();
    }
    public void checkAboutUs() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        aboutUs.click();
    }
    public void checkSearch() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        search.click();
    }
//    public void checkSearchButton() {
//        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
//        }.getClass().getEnclosingMethod().getName()));
//        searchButton.click();
//    }
    public void checkCalender() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        calender.click();
    }
    public void checkBookNow() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        bookNow.click();
    }
    public void checkDescriptionBookNow() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        descriptionBookNow.click();
    }
    public void checkBookAnAppointment() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        bookAnAppointment.click();
    }
    public void checkBriefcase() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        briefcase.click();
    }
    public void checkUrgentCare() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        urgentCare.click();
    }
    public void checkDescriptionUrgentCare() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        descriptionUrgentCare.click();
    }
    public void checkFindALocation() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        findALocation.click();
    }
    public void checkClock() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clock.click();
    }
    public void checkSameDay() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        sameDay.click();
    }
    public void checkDescriptionSameDay() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        descriptionSameDay.click();
    }
    public void checkRequestAnAppointment2() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        requestAnAppointment2.click();
    }
    public void checkGlobal() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        global.click();
    }
    public void checkInternational() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        international.click();
    }
    public void checkDescriptionInternational() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        descriptionInternational.click();
    }
    public void checkLearnMore() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        learnMore.click();
    }
    public void checkCallUs() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        callUs.click();
    }
    public void checkSpecialty() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        specialty.click();
    }
    public void checkPrimaryCare() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        primaryCare.click();
    }
    public void checkName() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        name.click();
    }
    public void checkFindADoctor2() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        findADoctor2.click();
    }
    public void checkSelectSpecialty() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        selectSpecialty.click();
    }
    public void checkEnterZipCode() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        enterZipCode.click();
    }
    public void checkGoZipCode() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        goZipCode.click();
    }
    public void checkChooseALocation() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        chooseALocation.click();
    }










}
package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomCssSelectorConcept {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login/beta");

		//id----> #id (#input-email)
		
		//tag#id (input#input-email)
		
		//class---> .class (.form-control)
		//tag.class (input.form-control)
		
		//with multiple class --> .c1.c2.c3....cn
		//(.form-control.private-form__control.login-email)
		
		//with tag and multiple class (input.form-control.private-form__control.login-email)
		//.login-email
		
		//id and class:
		//#id.class-----#input-password.form-control
		//.class#id-----.login-email#username
		//tag#id.class------input#input-password.form-control
		//tag.class#id-----tag.login-email#username
		
		//other attr:
		//  tagname[attr='value]
		// input[type='password']
		// input[placeholder='Password']
		// a[class='btn btn-primary']
		
		//more than 1 atrr:
		// tagname[attr1='value[attr2='value][attr3='value]
		//  input[name='email'][class='form-control']
		//  input[name='email'][class='form-control'][type='text']
		
		//we can also use attr without value in css:
		//input[name][type][placeholder]
		//[id]----css
		//*[@id]-----xpath
		
		//text in css : NA
		
		//contains in css :
		//  tag[attr*='value']
		// select[class*='nav-progressive-search-dropdown']---css
		//select[contains(@class,'nav-progressive-search-dropdown')]----xpath
		
		
		// startswith in css :
		//tag[attr^='value']
		//  select[title^='Search']----css
		//select[starts-with(@title, 'Search')]-----xpath
		
		
		// endsWith in css:
		// tag[aatr$ ='value']
		// 	input[placeholder$= 'Amazon']
		//ends-with in xpath : NA
		
		///combining attributes:
		
		//  input[placeholder$= 'Amazon'][type='text'][class*='nav-input']
		
		//parent to child in css
		
		// tagattr>child tagname---direct child
		// tagattr child tagname---direct+indirect child
		// select[class*='nav-progressive-search-dropdown'] >option
		
		// div#nav-main>div-------returning 3 options
		// div#nav-main div-------returning 7 options
		
		// child to parent: backward traversing is NA in css.
		// child to ancestor: NA
		// to preceding sibling: NA
		// to following sibling :
		//  label[for='input-email']+input(use + for immediate following sibling)
		//  label[for='input-email']~input(use ~ for all following sibling)

		//indexing in css:
		// select#Form_getForm_Country option:first-child------for 1st child
		// select#Form_getForm_Country option:last-child------for lasst child
		// select#Form_getForm_Country option:nth-last-child(2)---second last child
		// select#Form_getForm_Country option:nth-child(3)----3rd child
		// select#Form_getForm_Country option:nth-child(odd)----alternate option on basis of odd nos
		// select#Form_getForm_Country option:nth-child(even)---- alternate option on basis of even nos
		//  select#Form_getForm_Country option:nth-child(n+5)-----starts from 5th child
		// select#Form_getForm_Country option:nth-child(7n)----starts for 7th and move like 7 14 21 .....
		
		//not in css:
		//input.form-control:not(.input-lg)-----excluding where class contains input-lg
		//input.form-control:not(.input-lg):not(#input-email)-----excluding where class contains input-lgand id(input-email

		// comma in css :
		//  input#username,input#remember, button#loginBtn, div.signup-link
		
		By impEles = By.cssSelector(" input#username,input#remember, button#loginBtn, div.signup-link");
		if(driver.findElements(impEles).size()==4) {
			System.out.println("imp eles present on the page...PASS");
			}
		else {
			System.out.println("imp eles not present on the page...FAIL");

		}
		
		
		
		
	}

}

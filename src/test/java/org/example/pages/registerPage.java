package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class registerPage {
    public WebElement registerLink()
    {
        return Hooks.driver.findElement(By.className("ico-register"));
    }
    public WebElement maleRadiobutton()
    {
        return Hooks.driver.findElement(By.id("gender-male"));
    }
    public WebElement femaleRadiobutton()
    {
        return Hooks.driver.findElement(By.id("gender-female"));
    }
    public WebElement firstNameTextbox()
    {
        return Hooks.driver.findElement(By.id("FirstName"));
    }
    public WebElement lastNameTextbox()
    {
        return Hooks.driver.findElement(By.id("LastName"));
    }
    public WebElement daySelectMenu()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthDay"));
    }
    public WebElement daySelect(int day)
    {
        return Hooks.driver.findElement(By.name("DateOfBirthDay")).findElement(By.cssSelector("option[value=\""+ Integer.toString(day) + "\"]"));
    }
    public WebElement monthSelectMenu()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthMonth"));
    }
    public WebElement monthSelect(int month)
    {
        return Hooks.driver.findElement(By.name("DateOfBirthMonth")).findElement(By.cssSelector("option[value=\""+ Integer.toString(month) + "\"]"));
    }
    public WebElement yearSelectMenu()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthYear"));
    }
        public WebElement yearSelect(int year)
    {
        return Hooks.driver.findElement(By.name("DateOfBirthYear")).findElement(By.cssSelector("option[value=\""+ Integer.toString(year) + "\"]"));
    }
    public WebElement emailTextbox()
    {
        return Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement passwordTextbox()
    {
        return Hooks.driver.findElement(By.id("Password"));
    }
    public WebElement confirmpasswordTextbox()
    {
        return Hooks.driver.findElement(By.id("ConfirmPassword"));
    }
    public WebElement registerButton()
    {
        return Hooks.driver.findElement(By.cssSelector("button[id=\"register-button\"]"));
    }
    public WebElement confirmationMessage()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"result\"]"));
    }
}

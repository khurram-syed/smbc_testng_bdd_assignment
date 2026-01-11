package com.smbc.steps;

import com.smbc.anagram.AnagramChecker;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class AnagramSteps {

    private String str1;
    private String str2;
    private boolean actualResult;

    private final AnagramChecker checker = new AnagramChecker();

    @Given("the input strings {string} and {string}")
    public void the_input_strings(String input1, String input2){
        str1 = input1;
        str2 = input2;
        System.out.println("the input strings... ");
    }

    @When("I check if they are anagrams")
    public void I_check_if_they_are_anagrams(){
        this.actualResult = checker.isAnagram(str1,str2);
    }

    @Then("the result should be {string}")
    public void the_result_should_be(String expected){
        boolean expectedResult = Boolean.parseBoolean(expected);
        Assert.assertEquals(expectedResult, actualResult, str1+" is not equal to "+str2);
    }
}

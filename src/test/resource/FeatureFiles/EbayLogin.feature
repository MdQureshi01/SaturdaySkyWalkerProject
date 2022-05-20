@regression @smoke @SKW101
Feature: Ebay Login Functionality

	Scenario Outline: Login with credentials. 
		Given Open Ebay Homepage
		And Click on sign in link
		And Click on verification box <
		When Input user valid credentials <email>
		And filter by <Brand>
		Then Item list should have products of "<Brand>"
		
	Examples:
        |Items		|Brand		   |
		|Shoes		|Nike		   |
		|Shirts		|Adidas		   |
		|Pants		|Unbranded	   |
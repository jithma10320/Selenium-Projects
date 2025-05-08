# Selenium Assignment - Mobile Phone Purchase Automation (TestNG Framework)

## Overview

This project implements a Selenium TestNG framework that simulates the process of purchasing a mobile phone on [eBay](https://www.ebay.com) without logging in. It follows a real-world user journey using automation best practices including Page Object Model (POM), WebDriverWait, and parameterization.

## Assignment Scenario

The test suite performs the following:

1. **Basic Navigation**
   - Launches Chrome browser
   - Navigates to eBay
   - Validates the URL

2. **Category & Product Selection**
   - Selects 'Electronics' > 'Cell Phones & Smartphones'
   - Applies filters like screen size

3. **Product Details & Cart Verification**
   - Selects a phone from results
   - Captures name and price
   - Adds to cart and verifies item details

4. **Checkout Process**
   - Proceeds to checkout as a guest
   - Fills in shipping information
   - Stops at login page

## Technologies Used

- Java
- Selenium WebDriver
- TestNG
- Maven
- ChromeDriver

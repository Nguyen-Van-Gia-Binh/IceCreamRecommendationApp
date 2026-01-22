# Ice Cream Recommendation App

## Description

This is a simple command-line Java application designed to manage ice cream sales and provide flavor recommendations. The application allows users to add sales data for various ice cream flavors, view a sorted list of all sales, see the top three most popular flavors, and get a flavor recommendation based on age.

## Features

*   **Menu-Driven Interface:** A user-friendly command-line menu to navigate through the application's features.
*   **Add Sales:** Add sales data for permitted ice cream flavors. The list of sales is automatically sorted by the number of items sold in descending order.
*   **List All Sales:** Display a complete list of all ice cream flavors and their corresponding sales numbers.
*   **Top Three Flavors:** View the top three most popular ice cream flavors based on sales data.
*   **Age-Based Recommendation:** Get a recommended ice cream flavor based on the user's age.
*   **Input Validation:** Basic validation to ensure that sales are only added for permitted flavors.

## How to Run

1.  **Navigate to the source directory:**
    Open a terminal or command prompt and navigate to the `src` folder of the project.
    ```sh
    cd C:/Users/MSI/IdeaProjects/IceCreamRecommendationApp/src
    ```

2.  **Compile the Java files:**
    Use the Java compiler to compile all the `.java` files.
    ```sh
    javac *.java
    ```

3.  **Run the application:**
    Run the `Main` class to start the application.
    ```sh
    java Main
    ```

4.  **Follow the on-screen menu instructions.**

## Code Structure

*   `Main.java`: This file contains the main entry point of the application. It is responsible for creating the user-facing menu system, handling user input, and interacting with the `IceCreamRecommendation` class.

*   `IceCreamRecommendation.java`: This class contains the core logic of the application. It manages the collections for permitted flavors and sales data. Its responsibilities include:
    *   Initializing and storing permitted ice cream flavors.
    *   Adding new sales and keeping the sales data sorted.
    *   Providing the top three most popular flavors.
    *   Recommending a flavor based on a given age.
    *   Listing all sales.

# Unit 3 - Data for Social Good Project

## User Story

Include your User Story you analyzed for your project here. Your User Story should have the following format:

As a restaurant chain owner, 
I want to analyze data from all my locations, 
so that I can identify my best-performing locations and areas for improvement.


## Dataset

The data was generated from ChatGPT

Locations (String): Names of the restaurant locations.
Monthly Sales (double): Total monthly sales for each location in dollars.
Customer Ratings (double): Average customer satisfaction ratings on a scale of 1 to 5.
Operating Costs (double): Monthly operating costs for each location in dollars.


## UML Diagram
![Screenshot 2024-12-12 at 7 12 31 PM](https://github.com/user-attachments/assets/2ad44587-478c-481f-a5eb-06827bd0006f)


## Description

This project is about helping a restaurant owner understand how their different locations are doing. The program uses 1D arrays to keep track of important information, like the names of the locations, how much money they make each month (monthly sales), customer ratings, and how much they spend (operating costs).
It calculates profit margins by subtracting operating costs from sales. The program also finds the location with the best customer reviews, the one making the most profit, and the overall best location by combining profit and ratings.
The program has two types of constructors: one that creates empty data and another that loads data from files. It includes methods to analyze the data, like calculating the average sales or sorting locations by how well they’re doing. Finally, the toString() method creates a detailed summary that shows all the important information in an easy-to-read format for the restaurant owner. This makes it simple to decide which locations are doing great and which ones might need improvement.


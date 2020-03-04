# HMS
 
Introduction
Your team has been tasked with creating a basic Hotel Management System in Java. This system should be able to keep track of the availability of all the rooms in a hotel over the course of a year. Each of your team members should take one of the components detailed below to work on. You have been given a number of interfaces to implement and a sample main method to use to test that your code is working.
You ​may not alter the interfaces in any way and you must structure your code as described in this brief. All the files you have been given should be placed in a package ie.cct.objectorientedconstructs. All the files you implement should be placed in a package called ie.cct.objectorientedconstructs.s123456s234567s345678 where 123456,  234567, and 345678 are replaced by each of your student numbers.

Provided files:
•	RoomType.java​ - defines the different type of rooms hotels can have
•	Month.java​ - defines the months and the number of days in each, you can ignore leap years
•	RoomInterface.java​ - lists the method signatures of a room in the hotel
•	HotelInterface.java​ - lists the method signatures of a hotel
•	HotelManagementSystemInterface.java - defines the method signatures for a hotel management system
•	SampleInteraction.java​ - a main method that tries your code out
•	mespil.txt​ - a text file to read the details of one hotel at start up Each of the code files is fully commented to make it clear what is required in each. Further explanations of each can be found at the end of this brief.

Specific Requirements
•	You are required to implement three classes:
o	Room.java​ - implements RoomInterface.java
o	Hotel.java​ - implements HotelInterface.java
o	HotelManagementSystem.java​ – implements HotelManagementSystemInterface.java 
•	You must implement all methods defined in the relevant interfaces, you may define additional helper methods if it makes your coding easier but is not required.
•	You must not change any of the method signatures, the interfaces, or the structure txt file. 
•	You must put the given files in a package called ie.cct.objectorientedconstructs.


Notes
•	This is an open-book assessment, you may use all notes and online sources for help. Anything you use should be fully attributed to its original source

Room:
A room should have the following properties:
•	a RoomType as defined by a String
•	a rate, how much the room costs, this should be a double.
•	a hashmap of availability, this hashmap should store a key-value combination of Month and a boolean array. That is for each month it should have an associated array with a true/false stored for each day of that month: Map<String, boolean[]> availability.
•	an id that uniquely identifies the room, this id should be a number generated from the number of already existing rooms in the hotel. 
There should be getter & setter methods for each of the room’s instance variables. In addition a room should be able to:
•	check its availability for a given Month and day, that is return true or false if the appropriate field in the hashmap is true or false.
•	book the room for a given Month and day. Return true or false if it is successful.

Hotel: 
A hotel should have a list of rooms and the hotel should have a name. There should be getter and setter methods for these variables. It should also be able to:
•	checkAvailability that requires a month, day, RoomType and length of proposed stay. This returns true or false if one specific room has the availability for the proposed amount of time. We don’t want guests having to swap rooms on a stay.
•	getRoomAvailable finds the room number of a room that is available for the proposed stay.
•	bookRoom checks first there is availability for the proposed stay, if there is, it gets the number of a room that satisfies the stay request and then books it by changing the availability of the room.

Hotel Management System: 
The hotel management system does not have any instance variables but does have two methods:
•	setupHotel method reads in from given text file to get the details of this hotel and sets up the hotel rooms. How many rooms there are and what type each is. You may assume that the structure of this file is always the same. It is called after the hotel itself, the first line is the name of the hotel, the second is the number of single rooms, the third is the number of double rooms and the fourth is the number of penthouse rooms.

•	Text File Structure: 
o	Mespil 	// hotel name.
o	Single:60:3 	// Single rooms, €60, there are 3 of them.
o	Double:80:5 	// Double rooms, €80, there are 5 of them.
o	Penthoulse:100:2 // Penthouse, €100, there are 2 of them.
•	getCalendar is a method that returns a String representing a calendar for a specific month. This calendar should put each week on a new line. If there is no availability on a particular day in any room then you should put a * beside the date. This method should not print out directly, it returns a string to be called in the main method.

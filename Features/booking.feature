Feature: CheapAir Flights

  Scenario: Booking Scenario
    Given User Launch the application
    And User entered from and to
    |Madras, India|
    |Delhi, India|
    And  User updated dates 
    And  User entered traveller count
    When User clicked on search flights
    When User clicked on lowest price economy flight
    When clicked on continue
    Then User entered passenger details
			|Vino|Subin|
			|Vinodhini|Vincent|
			|Subin|Sebastian|			
			|Subin|Vinodhini|			
			|Vincent|Joseph|			
			|Sebastian|Chinnappa|			
			|Frederick|Antony|			
			|Frederick|Vinodhini|			
			|Fredu|Poppy|
		And User entered CC details
		|1234567812345678|123|Vinodhini|Bangalore|Karnataka|Bangalore|560047|8880775777|
    
    

 
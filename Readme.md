
-------------
Instructions:
-------------

This Spring Boot2 is an initial application, to check how it works without any security.


----------------
What to Download
----------------

Just Download Eclipse and download its Spring Suite integration, 
or 
Download SpringSuite.

----------
How to Run
----------
Import Project with "Existing Maven" project, and select the directory where the project is extracted.

Now run the SpringBoot2Application class, and check at what <port> Tomcat server starts, and use that
<port> in the urls below. 


------------
How to Test
------------

There are 4 different functions are implemented:

1- Fibnoacci Series with Recursion
----------------------------------
http://localhost:<port>/api/user/fibonacciWR

2- Fibnoacci Series with Out Recursion
--------------------------------------
http://localhost:<port>/api/user/fibonacciWOR

3- Reverse String 
-----------------
http://localhost:<port>/api/user/reverseString

4- Count Words in a String
--------------------------
http://localhost:<port>/api/user/countWords

# scala

This is a test project to demonstrate a simple test driven approach for a basic shopping cart implementation 

### Synopsis of the approach

1.	maven is used with Scala maven plugins for compile and test
2.	integrated with Travis for Continuous integration. (link: https://travis-ci.org/hardeepmehe/scala)
3.	each step is a new feature, created feature branches for these steps and then raised pull request to merge onto the master only after build successful for the feature branch as well as the pull request. I have left the feature branch on GitHub for review which ideally is deleted after merge down.
4.	followed Test first approach, for more details, follow the commit history and the corresponding Travis build.
5.	assumption is made that the prices are not hardcoded in the system, ideally this will be provided through a reference table in the db., so created a trait for abstracting it out of the code. furthermore, I used Mocktio to mock the prices for the test case.
6.	used a primitive way of dependency inject via the constructor, there are definitely better ways to do this which needs more time and experience to explore and implement. (guice is one of the frameworks) 
7.	You might notice there is a couple of days gap between step 1 and step2 feature implementation. I was travelling back to UK and was involved in couple of other activities, hence the delay.
8.	Lastly, this is the first time ever that I have created Scala project. there will be a lot of gaps in the best practices, coding standard and conventions. I've gone with my understanding of JAVA and whatever I could pick up in the last couple of days alongside the actual development. kindly consider the same while evaluating the solution.




### status
[![Build Status](https://travis-ci.org/hardeepmehe/scala.svg?branch=master)](https://travis-ci.org/hardeepmehe/scala)
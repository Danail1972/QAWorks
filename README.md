# QAWorks
QAWorksAutomatedTests

I first started with setting up an automated testing environment using Cucumber here in my choice of an IDE being Eclipse. 

I had to choose between two options of installing it. The first and not very efficient from resource efficiency view point i.e. creating a Java project on Eclipse using the pre-existed Maven Project creation option. Instead I have created a manual Referenced Library containing all the necessary Jar files for my project. The list f files can be observed under the Recent Library folder. This approach is a light way and my favourite way of setting up dependencies.

I next created two packages TestRunners and Tests containing the main Cucumber ClassRunner-class responsible for connecting the features with the steps defined in the feature folder - Features and the actual testing code under the ContactUsStepDefinition-class.

The specific anotations RunWith and the CucumberOptions are both setting up and defining the main arguments under which the Cucumber class will react with the Features Folder and gluing the Scenarios with the actual code based in Tests Package.

As I am not that experienced I was unable to construct the java code the way it will cover the test steps correctly. I believe that, because I was unable to communicate properly with the QAWorks Site to be able to allocate elements even though I have used Chrome to look up the code and its HTML code. I did try to bypass the errors by catching all the Exceptions in a Try-Catch manner.

I consider that as a bug and I could have done it better if I had better understanding of the java's API and more concretely the Applets bit.

In the ContactUs.feature file I have expressed additional Scenarios which I believe that only the first two can be automated. The rest can be done manually for the purpose of the Acceptance Test satisfaction.

The Cucumber automated tool is a clever tool because its capable to automatically allocate annotations to classes all based on the gherkin syntax specifics Given, When and Then. Also Feature: Scenario: all that enhance the Agile documentation i.e. light way, just enough and just when needed.

I could have also created better class names but due to my intense learning of new tools over the weekend have stopped me from refining my work. Hope my presentation was unambiguous and informative. Thanks for viewing.

# Conference-Designer
=============

This is the Conference Designer sample for Obeo Designer. 

This sample is used for demo during conferences, with a customization with the current conference's program.

To install it, the easiest way is to download Obeo Designer Community Edition 9.1 which provides a ready-to-use bundle with Sirius: http://www.obeodesigner.com/download/ . Just check out this source code, and use a runtime workspace to try the sample with these projects:
* fr.obeo.conference.design
* fr.obeo.conference.sample.*


Last change: 
* Upgrade to Sirius 4.1 (and OD 9.1.0)
* full migration to AQL

# Demo Scenario

- Sample Tour
	- makingof : optional, to start with a fun introduction
	- show several diagrams, explain the different kind of representations
	- explain that this is a specific language
	- if technical attendees, explain that everything is store in simple XML/XMI files
- Ergonomic : 
  - with subject:
    - align with vertical helpers
    - same size + distribute vertically
    - touching mode
  - with makingof:
    - Pin / arrange all
    - container autosize
  - with track and location :
    - picture usage + location avec Map
    - dark border with the same content color 
  - usage of SVG icon instead of standards shapes. Ex : EA Goal screenshots v1 and v2
- HelloWorld : 
  - start from an Empty EMF project
  - close the 2nd OD instance
  - Create a new Ecore Modeling Project with the name "Helloworld"
  - Create this domain model : Conference ->* Talk (with a EAttribute Title:EString)
  - launch genmodel -> gen all
  - launch the 2nd instance
  - create a VP Specification Project Helloworl.design
  - create a diagram respresentation with a Square mapping for each Talk and a creation tool.
  - create a Modeling Project, add a Helloworld model, and create 2 talks : Hello et World
- Tip and Ticks
  - with Planning
    - Compartiments
  - with track
    - create a Validation rule for duration > 0
    - create a quick fix which set duration to 35
  - Conditional Style on 'Sirius' word 
  - with Stats
    - track label :  + ' - length:' + self.talks->select(myTalk | myTalk.name.contains('Sirius')).duration->sum()   
  - show table / tree specification  
- 10 min
  - create a diagram called All Tracks in the VSM (with *.design project and the sample in the same workspace) 
  - Container focus on Track
  - Node on Talk
  - Move Talk inside Track
  - change in container properties free forms to list
  - add duration and days information on talk's label
  - tool create talk
  - DnD tool to move a Talk tyo another Track
- 5 min more
  - DE on Talk
  - speaker as bordered node on Talk
  - Move tool on Talk with Selection Wizard
  - Table per track : Talk -> author.name.sep | duration | location.name
  - Navigation between these two representations      
  

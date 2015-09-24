#### Week 5 (Objects) Assignment
This week to assure that we all have the opportunity to uniformly create the same work so we can focus on best practices when creating objects in Java I am opting to use 2 questions from your book's Programming Challenges section for chapter 6. Questions 2 and 4 on pg 396

Please follow the design rules we identified in class so do not create set style methods unless asked to. The book references these as "mutator" methods we have been calling them "setters". Also order you class in the standard format:

1. Fields
2. Constructor
3. Accessor/Mutators
4. Public API
5. Private API

I will be grading these more specifically for adherence to design and style so keep that in mind and try to point these mistakes out to your peers in review.

My rubric is:
- proper indentation
- proper order of elements
- well documented classes and methods

I am listing those questions here as well for your convenience:

##### Question 2. Car Class
Write a class named Car that has the following fields:
- __yearModel__. The `yearModel` field is an `int` that holds the car's year model.
- __make__. The `make` field references a `String` object that holds the make of the car.
- __speed__. The `speed` field is an `int` that holds the car's current speed.
In addition, the class should have the following constructor and other methods.
- Constructor. The constructor should accept the car's `yearModel` and `make` fields. The constructor should also assign `0` to the `speed` field.
- Accessors. Appropriate `accessor` methods should `get` values stored in an object's `yearModel`, `make`, and `speed` fields.
- __accelerate__. The `accelerate` method should add `5` to the speed field each time it is called.
- __brake__. The `brake` method should subtract `5` from the `speed` feild each time it is called.

Demonstrate the class in a program that creates a `Car` object, and then calls the `accelerate` method 5 times. After each call to `accelerate` method, get the current speed of the car and display it. Then call the `brake` method 5 times. After each call to the `brake` method, get the current speed of the car and display it.

##### Question 4. RetailItem Class
Write a `class` named `RetailItem` that holds data about an item in a retail store. The class should have the following fields.
- __description__. The `description` field references a `String` object that holds a brief description of the item.
- __unitsOnHand__. The `unitsOnHand` field is an `int` variable that holds the number of units currently in the inventory.
- __price__. The price field is a `double` that holds the item's retail price.

Write a constructor that accepts arguments for each field, appropriate `mutator` methods that store values in these fields, and `accessor` methods that return the values in these fields. Once you have written the class, write a separate program that creates 3 `RetailItem` objects and stores any appropriate data you like in them.

##### Setup for Github
- Fork the repo to your personal account
- Clone your fork to your local computer
  - From Github Desktop
    - click the + on the top left
    - select clone then search for `CPT-163-27-F2015-Assignment-5-objects` use the one under the section with your github name
  - From Command Line
    - Copy the `https` link from your fork on github.com (its below the settings button on the right hand side of the page)
    - run `git clone <copied url>` (this will create a folder the same name as the repo in the directory you ran this command)
- Create a branch on your fork of the Assignment-2 Repo using the format <github-name>/<feature_description>
  - From Github Desktop
    - Click the `Add a Branch` button (It should be the button next to the dropdown that says `master`)
    - Make sure you create your branch from master
  - From Command Line
    - run `git checkout -b <branch_name>`
- In Netbeans create a new project and set the __Project Directory__ to the folder that was created when you cloned your fork.
- Write Code!
- Create a commit
  - From Github Desktop
    - Select your fork and fill-in the commit summary
    - Click `Sync`
  - From Command Line
    - run `git add .`
    - run `git commit -m "<your commit message>"`
    - run `git push origin <your_branch_name>`
- Go to Github.com and open your PR by clicking on `Compare and Open Pull Request`

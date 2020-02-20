# Easy Data Binding Sample
I love how Data Binding works, and this project shows you the simplest way for doing it. 

Under the hood when we use find view by ID to get a reference to views every time we search for a view in this way after it has been created or recreated Android has to traverse the view hierarchy to find it for us at RunTime. For a large or deep view hierarchy this can take enough time that it can slow down the app for the user.

To fix this there is a technique and pattern called data binding that allows us to connect a layout to an activity or fragment. at CompileTime the compiler generates a helper class called a binding class when the activity is created so it is an instance of that binding class and then we can access the view through this generated binding class without any extra overhead.

-----------------------------------------------

You can access to the full document on Medium by this link:

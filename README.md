# CISC275-Fall2018-first-git
1. Create java files to make this code compile and run.

2. What five objects are created in the main?
   an ArrayList of Dog
   Three Dogs
   A Comparator<Animal>

3. Can you spot the comparator constructor call? Where is the class definition for the comparator?
   the comparator constructor call is new Comparator<Animal>
   the class definiation is inside the brackets:{
       @Override
			public int compare(Animal a, Animal b){
			    return a.getLegs() - b.getLegs();
  }
   

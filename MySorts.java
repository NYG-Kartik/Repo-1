//Green Mushrooms: Kartik Vanjani, Tasnim Chowdhury, Emily Ortiz
//APCS PD 8
//HW 54
//11/1/22


import java.util.ArrayList;

public class MySorts {
  public MySorts(){} //default constructor

 //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
  //precond:  lo < hi && size > 0
  //postcond: returns an ArrayList of random integers
  //          from lo to hi, inclusive
  public static ArrayList populate( int size, int lo, int hi ) {
    ArrayList<Integer> retAL = new ArrayList<Integer>();
    while( size > 0 ) {
      // offset + rand int on interval [lo,hi]
      retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
      size--;
    }
    return retAL;
  }

  //randomly rearrange elements of an ArrayList
  public static void shuffle( ArrayList al )
  {
    int randomIndex;
    //setup for traversal fr right to left
    for( int i = al.size()-1; i > 0; i-- ) {
      //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
      //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  public static void bubbleSortV( ArrayList<Comparable> data ) {
    int passCtr = 0;
  	int swapCtr = 0;
    int compCtr = 0;

  	// does length-1 passes bc that is when everything is for sure sorted
    for (int j = 0; j < data.size()-1; j++){

      // traversing thruough array from last element to 0 index
    	for (int i = data.size()-1; i > j; i--){
					Comparable mainObj = data.get(i);
					Comparable adjacentObj = data.get(i-1);

        	// if value at index we are looking at is less than the value before it, swap
	      	if (mainObj.compareTo(adjacentObj) < 0) {
						data.set(i, adjacentObj);
						data.set(i-1, mainObj);
           	swapCtr++;
      		}
        	compCtr++;
        }
      passCtr++;
    }
    System.out.println(
    "\nBubbleSort Data | Comparisons: " + compCtr +
    " \tSwaps: " + swapCtr +
    " \tPasses: " + passCtr);
  } //end bubbleSortV


  public static ArrayList<Comparable> bubbleSort( ArrayList<Comparable> input ) {
   	ArrayList<Comparable> output = new ArrayList<Comparable>();
		// adding all of input's elements into output
		for (int i = 0; i < input.size(); i++){
			output.add(input.get(i));
		}
		//sort the copy
  		bubbleSortV(output);

		return output;
  	}

  public static void selectionSortV( ArrayList<Comparable> data ) {
    //note: this version places greatest value at "rightmost" end
    int passCtr = 0;
    int swapCtr = 0;
    int compCtr = 0;
    int maxPos; //maxPos will point to position of SELECTION (greatest value)

    //does length-1 passes bc that is when everything is sorted
    for(int pass=data.size()-1; pass > 0; pass-- ) {

//      System.out.println( "\nbegin pass " + (data.size()-pass) );//diag
      int min = (int)(data.get(0));; //creating variable to represent largest value of the current pass

      // sets the max (largest position) to pass, and goes right to left to determine the largest value and print its data.
      for( maxPos=pass; maxPos > 0; maxPos-- ) {
//        System.out.println( "maxPos: " + maxPos );//diag
//        System.out.println( data );//diag

        //if value at current index is greater than min, change min to current value
        compCtr++;
        if ((data.get(maxPos)).compareTo(min) > 0) {
          min = (int)(data.get(maxPos));
          swapCtr++;
        }
      }

      //swap
      data.set(data.indexOf(min), data.get(pass));
      data.set(pass, min);
//      System.out.println( "after swap: " +  data );//diag
      passCtr++;
    }
    System.out.println(
    "\nSelectionSort Data | Comparisons: " + compCtr +
    " \tSwaps: " + swapCtr +
    " \tPasses: " + passCtr);
  }//end selectionSort

  public static ArrayList<Comparable> selectionSort( ArrayList<Comparable> input ) {
   	ArrayList<Comparable> output = new ArrayList<Comparable>();
		// adding all of input's elements into output
		for (int i = 0; i < input.size(); i++){
			output.add(input.get(i));
		}
		//sort the copy
  		selectionSortV(output);

		return output;
  	}

  public static void insertionSortV( ArrayList<Comparable> data ) {
    // partition counter.
    int passCtr = 0;
    int swapCtr = 0;
    int compCtr = 0;
    for(int partition = 1; partition < data.size(); partition++) {
      passCtr++;
      //partition marks first item in unsorted region

//      System.out.println( "\npartition: " + partition + "\tdataset:"); //diag
//      System.out.println( data );

      //traverse sorted region from right to left
      for(int i = partition; i > 0; i --) {

        // "walk" the current item to where it belongs
        // by swapping adjacent items
        compCtr++;
        if ( data.get(i).compareTo(data.get(i-1)) < 0) {
//          System.out.println( "swap indices "+(i-1)+" & "+i+"..." ); //diag

          // swaps the values as necessary
          Comparable temp = data.get(i);
          data.set(i, data.get(i-1));
          data.set(i-1, temp);
          swapCtr++;
        }
        else {
          break;
        }
      }
    }
    System.out.println(
    "\nInsertionSort Data | Comparisons: " + compCtr +
    " \tSwaps: " + swapCtr +
    " \tPasses: " + passCtr);
  } //end insertionSortV

    public static ArrayList<Comparable> insertionSort( ArrayList<Comparable> input ) {
   	ArrayList<Comparable> output = new ArrayList<Comparable>();
		// adding all of input's elements into output
		for (int i = 0; i < input.size(); i++){
			output.add(input.get(i));
		}
		//sort the copy
  	insertionSortV(output);
		return output;
  	}


} //end Sorts

  public static void main( String [] args ) {

    // best case
    ArrayList glen = new ArrayList<Integer>();
    glen.add(1);
    glen.add(3);
    glen.add(5);
    glen.add(7);
    glen.add(12);

    //worst case
    ArrayList glen_ = new ArrayList<Integer>();
    glen_.add(12);
    glen_.add(7);
    glen_.add(5);
    glen_.add(3);
    glen_.add(1);

    Sorts bob = new Sorts();
    //random case
    ArrayList<Comparable> glenTen = bob.populate( 10, 1, 100);
    ArrayList<Comparable> glenHundred = bob.populate(100, 1, 100);
    ArrayList<Comparable> glenThousand = bob.populate(1000, 1, 100);



    //Bubble Sort Best Case
    System.out.println("\n\n***** Testing bubblesort best case... ***** ");
    System.out.println( "ArrayList glen before sorting: " + glen);
    ArrayList glenBubSrt = bob.bubbleSort(glen);
    //System.out.println( "\nArrayList glen after sorting: " + glenBubSrt);

    //Bubble Sort Worst Case
    System.out.println("\n\n***** Testing bubblesort worst case... ***** ");
    System.out.println( "ArrayList glen before sorting: " + glen_);
    ArrayList glen_BubSrt = bob.bubbleSort(glen_);
    //System.out.println( "\nArrayList glen after sorting: " + glen_BubSrt);

    //Bubble Sort Random Cases
    System.out.println("\n\n***** Testing BubbleSort random cases... ***** ");
    ///System.out.println( "\nArrayList glenR before sorting:\n" + glenR );
    System.out.print("Ten List");
    ArrayList bubglenTen = bob.bubbleSort(glenTen);
    System.out.print("Hundred List");
    ArrayList bubglenHundred = bob.bubbleSort(glenHundred);
    System.out.print("Thousand List");
    ArrayList bubglenThousand = bob.bubbleSort(glenThousand);
    //System.out.println( "\nArrayList glenR after sorting: " + bubglenR );



    //Selection Sort Best Case
    System.out.println("\n\n***** Testing selectionsort best case... ***** ");
    System.out.println( "ArrayList glen before sorting: " + glen );
    ArrayList glenSelSrt = bob.selectionSort(glen);
    //System.out.println( "\nArrayList glen after sorting: " + glenSelSrt );

    //Selection Sort Worst Case
    System.out.println("\n\n***** Testing selectionsort worst case... ***** ");
    System.out.println( "ArrayList glen before sorting: " + glen_ );
    ArrayList glen_SelSrt = bob.selectionSort(glen_);
    //System.out.println( "\nArrayList glen after sorting: " + glen_SelSrt);

    //Selection Sort Random Case
    System.out.println("\n\n***** Testing SelectionSort random cases... ***** ");
    //System.out.println( "\nArrayList glenR before sorting:\n" + glenR );
    //ArrayList selglenR = bob.selectionSort(glenR);
    //System.out.println( "\nArrayList glenR after sorting: " + selglenR );
    System.out.print("Ten List");
    ArrayList selglenTen = bob.selectionSort(glenTen);
    System.out.print("Hundred List");
    ArrayList selglenHundred = bob.selectionSort(glenHundred);
    System.out.print("Thousand List");
    ArrayList selglenThousand = bob.selectionSort(glenThousand);

    //Insertion Sort Best Case
    System.out.println("\n\n***** Testing insertionSort best case... ***** ");
    System.out.println( "\nArrayList glen before sorting: " + glen );
    ArrayList glenInsSrt = bob.insertionSort(glen);
    //System.out.println( "\nArrayList glen after sorting: " + glenInsSrt );

    //Insertion Sort Worst Case
    System.out.println("\n\n***** Testing insertionSort worst case... ***** ");
    System.out.println( "\nArrayList glen_ before sorting: " + glen_ );
    ArrayList glen_InsSrt = bob.insertionSort(glen_);
    //System.out.println( "\nArrayList glen_ after sorting: " + glen_InsSrt );

    //Insertion Sort Random Case
    System.out.println("\n\n***** Testing insertionSort random cases... ***** ");
    //System.out.println( "\nArrayList glenR before sorting:\n" + glenR );
    //ArrayList insglenR = bob.insertionSort(glenR);
    //System.out.println( "\nArrayList glenR after sorting: " + insglenR );
    System.out.print("Ten List");
    ArrayList insglenTen = bob.insertionSort(glenTen);
    System.out.print("Hundred List");
    ArrayList insglenHundred = bob.insertionSort(glenHundred);
    System.out.print("Thousand List");
    ArrayList insglenThousand = bob.insertionSort(glenThousand);


  }//end Main
}//end Driver

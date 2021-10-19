/*
Kartik Vanjani Vansh Saboo Jacob NG Krrish Team Richard
APCS PD8
HW 14 Customize Your Creation
2021-10-07
DISCO: I discovered that in the thing after the dot is the property before
so you can call it to print the message of a string and then use 
systemprintln to print it.
QCC: Do I have to define every single parameter for when the message is 
defined in the greet file?
*/
public class BigSib{

  private String richard, grizz, dotCom, tracy;


  public BigSib(){
    richard = "word up";
    grizz = "Hey ya";
    dotCom = "Sup";
    tracy = "Salutations";
  }



    public String greet(String name){
        if(name == "freshman"){
        return richard + " " + name;
    }
    else if(name == "Dr.Spaceman"){
        return grizz + " " + name;
    }
    else if(name == "Kong Fooey"){
        return dotCom + " " + name;
    }
    else if(name == "mom"){
        return tracy + " " + name;
    }
    else{
        return "idk";
    }
    }};

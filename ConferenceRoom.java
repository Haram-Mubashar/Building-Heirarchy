public class ConferenceRoom extends LabRoom{

      
       private boolean isOccupied=false;
       private final int capacity=150;
 
       public ConferenceRoom(String Name,int floorNum,int classNum,String className,String classType){

       super(Name,floorNum,classNum,className,classType);
       

       }

       public void Maintenance(){  //Abstract method

       System.out.println("The Conference room is maintained");
       }

       public void displayResources(){    //Abstract method

       System.out.println("The resources include:");
       System.out.println("Seats"+"\n"+"Screen"+"\n"+"Air Conditioner");
       }

       @Override
       public String toString(){

       return String.format("%s \nCapacity: %d \nIsOccupied: %b",super.toString(),capacity,isOccupied);
       }

       }
  

       

       
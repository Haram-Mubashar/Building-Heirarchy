public class LabRoom extends ClassRoom{

       private boolean isOccupied=false;
       private final int capacity=150;
 
       public LabRoom(String Name,int floorNum,int classNum,String className,String classType){
       
       super(Name,floorNum,classNum,className,classType);
      
       }

       public void Maintenance(){          //Abstract method


       System.out.println("The Labroom is maintained");
       }

       public void displayResources(){        //Abstract method

       System.out.println("The resources include:");
       System.out.println("Apparatus"+"\n"+"WhiteBoard"+"\n"+"Stools");
       }
  
       @Override
       public String toString(){

       return String.format("%s \nCapacity:%d \nIsOcuupied: %b",super.toString(),capacity,isOccupied);
       }

       }

       
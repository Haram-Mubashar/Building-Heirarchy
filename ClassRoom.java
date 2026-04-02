public class ClassRoom extends BuildingRoom{

       private String classType;
       private String className;
       private boolean isOccupied;
       private final int capacity=100;

       public ClassRoom(String Name,int floorNum,int classNum,String className,String classType){
       
       super(Name,floorNum,classNum);
       this.className=className;
       this.classType=classType;
       }

       public void  Maintenance(){        //Abstract method


       System.out.println("The classroom is maintained");
       }

       public void displayResources(){       //Abstract method

       System.out.println("The resources include:");
       System.out.println("Chairs"+"\n"+"Presenter"+"\n"+"Dice");
       }

       @Override
       public String toString(){

       
       return String.format("%s \nCLASSROOM INFO:\nName: %s  \nType: %s \nCapacity: %d \nIsOcuupied: %b ",super.toString(),className,classType,capacity,isOccupied);
       }
}
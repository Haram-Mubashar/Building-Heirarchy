public abstract class BuildingRoom{

       private String Name;
       private int classNum;
       private final int capacity=100;
       private int floorNum;
       private boolean isOccupied;


       public BuildingRoom(String Name,int floorNum,int classNum){
  
       this.Name=Name;
       this.floorNum=floorNum;
       this.classNum=classNum;
       }
       

       public abstract void  Maintenance();

       public void displayResources(){
       System.out.println("The resources include:");
       System.out.println("Reception"+"\n"+"Lobby"+"\n"+"MainOffice");
       }

       public void CleanArea(){
 
       System.out.println("The place has been cleaned!");
       }

       @Override
       public String toString(){
       
       return String.format("BUILDING INFO:\n Name: %s\n Floor: %d\n Class Number: %d\n Capacity: %d \nIsOccupied: %b",Name,floorNum,classNum,capacity,isOccupied);
       }

}
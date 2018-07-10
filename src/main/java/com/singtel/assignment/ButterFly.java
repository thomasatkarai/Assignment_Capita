package com.singtel.assignment;

public class ButterFly extends Bird implements Flyable {

   private ButterFlyStates state;
   public ButterFly(ButterFlyStates state){
	   this.state = state;
   }
   public String fly(){
	   if(state.equals(ButterFlyStates.BUTTERFLY)){
		   System.out.println("I can Fly");
		   return "CAN";
	   } else {
		   System.out.println("I can't Fly");
		   return null;
	   }
   }
   
   public String walk(){
	   if(state.equals(ButterFlyStates.CATARPILLAR)){
		   System.out.println("I can Walk");
		   return "CAN";
	   } else {
		   System.out.println("I can't walk");
		   return null;
	   } 
   }
public ButterFlyStates getState() {
	return state;
}
public void setState(ButterFlyStates state) {
	this.state = state;
}
}

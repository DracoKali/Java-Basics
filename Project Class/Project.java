import java.util.*;
class Project{

	private String name;
	private String discription;
	private double cost;

	public Project(){

	}

	public Project(String name, String discription, double cost){
		this.name = name;
		this.discription = discription;
		this.cost = cost;
	}

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setDiscription(String discription){
		this.discription = discription;
	}
	public String getDiscription(){
		return discription;
	}

	public void setCost(double cost){
		this.cost = cost;
	}
	public double getCost(){
		return cost;

	}
	private void elevatorPitch(){
		System.out.println(name + discription + cost);
	}

	

	



}









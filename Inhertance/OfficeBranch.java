package Inhertance;

	public class OfficeBranch extends HeadOffice{

	    private String location;

	    OfficeBranch(String location){
	    	super();
	        this.location = location;
	        
	    }

	    OfficeBranch(String location, String type){
	        super(type);
	        this.location = location;
	    }

	    String getLocation(){
	        return location;
	    }

	}

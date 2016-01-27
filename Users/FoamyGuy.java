public class FoamyGuy extends Room15User implements OnDayChangeListener{
	
    private boolean hasHadCoffee = false;
	private boolean hasCircle = true;

	
	public FoamyGuy() { 
		drinkCoffee();
	}
    
    public void drinkCoffee(){
        hasHadCoffee = true;
    }
	
    @Override
	public void onDayChange(Calendar curDay) {
		if (curDay.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY){
            if(this.hasHadCoffee == true){
                Room15.post("https://www.youtube.com/watch?v=kfVsfOSbJY0");
            }
        }
	}
}

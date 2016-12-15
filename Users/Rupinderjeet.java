package Users;

import com.google.Google;
import com.stackexchange.stackoverflow.meta;

// uses methods from Room15Vampire
public class Rupinderjeet extends Room15Vampire implements Room15Vampire.VampireInterface {

	public Rupinderjeet(){
		
		bite(this);
		promoteToHelpVampire(this);
		ask("compiled-questions");
	}
	
	public Rupinderjeet(String receivedHelp){
		drink(receivedHelp);
	}
	
	public Rupinderjeet(String receivedQuestion){
		dodge(receivedQuestion);
	}
	
	@Override void onHelpReceived(String helpResource){
		
		drink(helpResource);
		goWandering(60 * 1000);
		
		ask("generated-questions");
	}
	
	@Override void onHelpReceiveTimeout(final String askedQuestions){
		
		String jsCode = "[][(![]+[])[+[]]+([![]]+[][[]])[+!+[]+[+[]]]+(![]+[])[!+[]+!+[]]+(!![]+[])[+[]]+(!![]+[])[!+[]+!+[]+!+[]]+(!![]+[])[+!+[]]][([][(![]+[])[+[]]+([![]]+[][[]])[+!+[]+[+[]]]+(![]+[])[!+[]+!+[]]+(!![]+[])[+[]]+(!![]+[])[!+[]+!+[]+!+[]]+(!![]+[])[+!+[]]]+[])[!+[]+!+[]+!+[]]+(!![]+[][(![]+[])[+[]]+([![]]+[][[]])[+!+[]+[+[]]]+(![]+[])[!+[]+!+[]]+(!![]+[])[+[]]+(!![]+[])[!+[]+!+[]+!+[]]+(!![]+[])[+!+[]]])[+!+[]+[+[]]]+([][[]]+[])[+!+[]]+(![]+[])[!+[]+!+[]+!+[]]+(!![]+[])[+[]]+(!![]+[])[+!+[]]+([][[]]+[])[+[]]+([][(![]+[])[+[]]+([![]]+[][[]])[+!+[]+[+[]]]+(![]+[])[!+[]+!+[]]+(!![]+[])[+[]]+(!![]+[])[!+[]+!+[]+!+[]]+(!![]+[])[+!+[]]]+[])[!+[]+!+[]+!+[]]+(!![]+[])[+[]]+(!![]+[][(![]+[])[+[]]+([![]]+[][[]])[+!+[]+[+[]]]+(![]+[])[!+[]+!+[]]+(!![]+[])[+[]]+(!![]+[])[!+[]+!+[]+!+[]]+(!![]+[])[+!+[]]])[+!+[]+[+[]]]+(!![]+[])[+!+[]]]((!![]+[])[+[]]+(!![]+[])[+!+[]]+(!![]+[][(![]+[])[+[]]+([![]]+[][[]])[+!+[]+[+[]]]+(![]+[])[!+[]+!+[]]+(!![]+[])[+[]]+(!![]+[])[!+[]+!+[]+!+[]]+(!![]+[])[+!+[]]])[+!+[]+[+[]]]+(![]+[])[!+[]+!+[]]+(![]+[])[!+[]+!+[]])()";
		
		(new Google()).with(this)
			.useApi(Google.SEARCH_API)
			.setQuery(askedQuestions)
			.setSearchFilter("StackOverflow.com")
			.listener(){
				
				@Override void onFailure(Exception exception){
					ask(askedQuestions);
				}
				
				@Override void onSuccess(String helpResource){
					drink(helpResource);
					goWandering(60 * 1000);
					
					ask("generated-questions");
				}
				
				@Override void onInfiniteLoop(boolean isBannedOrKicked, Exception exception){
					
					if(!isBannedOrKicked){
						goWandering(60 * 60 * 1000);
						ask("generated-questions");
					} else {
						
						boolean isAllowed = (new MetaPost()).with(this)
								.getRoomLink(15)
								.fetchModerator("ArtOfCode")	// legendary helper
								.getSympathy("-force")
								.requestBanRemoval("pretty plz!")
								.post();
						
						if(isAllowed){
							ask("generated-questions");
						} else {
							// ( ͡° ͜ʖ ͡°) TODO : cure(this);
						}
					}					
				}
				
			}
			.useJavascript("console.log(" + jsCode + ");"); 
			.search();

	}

}

import play.*;
import play.jobs.*;
import play.mvc.Router;
import play.test.*;
import plugins.Akismet;

import models.*;

@OnApplicationStart
public class Bootstrap extends Job {
	
	public void doJob() {
		// Check if the database is empty
		if (User.count() == 0) {
			Fixtures.load("initial-data.yml");
		}		
	}
	
}
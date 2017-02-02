class Student01 extends CSEStudent {

  Student01 () {
    origin = "West";
  	ethnicity = "Asian";
  	minor = "Engineering in Corporate Practice";
  	activities = {"Slack", "Video games", "Ultimate frisbee", "Science Fiction", "Hackathons"};
  	spirituality = "Sometimes I think ghosts exist";
  	freeTime = {"Longboard", "Chill"};
	
	  self.myClothes.addLayer("Google hoodie");
	}
	
	@Override
	void graduateFromND() {
	  PostGrad.realPersonWorld.getJob("Seattle");
	};
	
	@Override
	void encounterSocialSituation() {
	  Social.encounter.clashRoyale();
	};
	
	@Override
	void study() {
	  // null
	};
	
	@Override
	public void spendFreeTime() {
	  Random rand = new Random();
	  int n = rand.nextInt(3);
	  School.freeTime.spendOn(self.activites[n]);
	};

}

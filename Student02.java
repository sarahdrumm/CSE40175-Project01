class Student02 extends CSEStudent {
    
    Student02 () {
        gender = "female";
        activities = {"Folk Choir", "Engineers Without Borders", "people pleasing"};             
        self.myClothes.addLayer("sweater");
    }
        
    @Override
    void graduateFromND() {
        PostGrad.realPersonWorld.getJob("Chicago");
    };
            
    @Override
    void encounterSocialSituation() {
        Social.encounter.chitChat();
    };
                
    @Override
    void study() {
        School.homework.turnin();
    };
                
    @Deprecated
    public void spendFreeTime() {};
                    
}

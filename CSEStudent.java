package com.notreDame;

class CSEStudent {
    
    protected class Clothes {
        String top;
        String bottom;
        Clothes(String top, String bottom) {
            self.top = top;
            self.bottom = bottom;
        }
        void addLayer(String top) {
            self.top += " and " + top;
        }
    }
        
    /*
     *  Attributes
     */
    String gender = "male";
    String origin = "midwest";
    String ethnicity = "white";
    String spirituality = "Roman Catholic";
    Clothes myClothes = new Clothes("t-shirt", "jeans");
    String minor = null;
    String[] activities;
    String[] freetime;
    
    /* 
     *   Methods
     */
    CSEStudent () {};
        
    public void graduateFromND() {
        //What now?
    };
        
    public void study() {};
        
    public void spendFreeTime() {};
};

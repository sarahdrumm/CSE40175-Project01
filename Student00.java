package com.notreDame;

import PostGrad.*;
import Social.*;
import School.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Student00 extends CSEStudent {

    Student00() {
        activities = {"Band", "School work", "Studying"};
        spirituality = "agnostic";
        freeTime = {"golfing"}; 
    }

    @Override
    void graduateFromND() {
        PostGrad.education.goToGradSchool();
    };

    @Override
    void encounterSocialSituation() {
        Social.encounter.hide();
    };

    @Override
    void study() {
        School.homework.complete();
        for (int i=0; i<3; i++) {
            School.homework.checkAnswers();
        }
        School.homework.turnin();
    };

    @Override
    public void spendFreeTime() {
        String pattern = "(study|school|work)";
        Pattern r = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);

        for (String activity : self.activities) {
            Matcher m = r.matcher(activity);
            if (m.find( )) {
                School.freeTime.spendOn(activity);
            }
        }
    };

}

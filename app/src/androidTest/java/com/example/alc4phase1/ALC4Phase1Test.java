package com.example.alc4phase1;

import android.support.test.runner.AndroidJUnit4;
import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.*;
import static android.support.test.espresso.action.ViewActions.*;
import static android.support.test.espresso.matcher.ViewMatchers.*;
import static android.support.test.espresso.Espresso.pressBack;
import static android.support.test.espresso.assertion.ViewAssertions.*;

@RunWith(AndroidJUnit4.class)
public class ALC4Phase1Test {

    @Rule
    public ActivityTestRule<ALC4Phase1> mALC4Phase1TestRule = new ActivityTestRule(ALC4Phase1.class);

    @Test
    public void buttonClick() {
        onView(withId(R.id.button_about_alc)).perform(click());
        onView(withId(R.id.web_about_alc)).check(matches(isJavascriptEnabled()));
        pressBack();

        onView(withId(R.id.button_my_profile)).perform(click());
        onView(withId(R.id.constraint_my_profile)).check(matches(hasChildCount(8)));
        pressBack();

    }

}
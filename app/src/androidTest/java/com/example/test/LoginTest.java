package com.example.test;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class LoginTest {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void logInTest(){
        onView(withId(R.id.firstNameEditText)).perform(typeText("Jung"), closeSoftKeyboard());
        onView(withId(R.id.lastNameEditText)).perform(typeText("SangHyeon"), closeSoftKeyboard());
        onView(withId(R.id.birthYearEditText)).perform(typeText("1999"), closeSoftKeyboard());
        onView(withId(R.id.testButton)).perform(click());

        onView(withId(R.id.wholeNameTextView)).check(matches(withText("JungSangHyeon")));
        onView(withId(R.id.ageTextView)).check(matches(withText("23")));
    }
}


package com.codecademy.simplecalculator3;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import androidx.test.espresso.ViewInteraction;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainActivityTest1 {
    @Rule
    public ActivityScenarioRule<MainActivity> mActivityScenarioRule =
            new ActivityScenarioRule<>(MainActivity.class);
    @Test
    public void mainActivityTest1() {

        ViewInteraction appCompatButton;
        appCompatButton = onView(allOf(withId(R.id.btnKey1))).perform(click());
        appCompatButton = onView(allOf(withId(R.id.btnEnter))).perform(click());
        appCompatButton = onView(allOf(withId(R.id.btnKey2))).perform(click());
        appCompatButton = onView(allOf(withId(R.id.btnEnter))).perform(click());
        appCompatButton = onView(allOf(withId(R.id.btnKey3))).perform(click());
        appCompatButton = onView(allOf(withId(R.id.btnEnter))).perform(click());
        appCompatButton = onView(allOf(withId(R.id.btnKey4))).perform(click());
        appCompatButton = onView(allOf(withId(R.id.btnEnter))).perform(click());
        appCompatButton = onView(allOf(withId(R.id.btnKey5))).perform(click());
        appCompatButton = onView(allOf(withId(R.id.btnEnter))).perform(click());
        appCompatButton = onView(allOf(withId(R.id.btnKey6))).perform(click());
        appCompatButton = onView(allOf(withId(R.id.btnEnter))).perform(click());
        appCompatButton = onView(allOf(withId(R.id.btnKey7))).perform(click());
        appCompatButton = onView(allOf(withId(R.id.btnEnter))).perform(click());
        appCompatButton = onView(allOf(withId(R.id.btnKey8))).perform(click());
        appCompatButton = onView(allOf(withId(R.id.btnEnter))).perform(click());




        /*
        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.btnButton), withText("1"),
                        childAtPosition(
                                allOf(withId(R.id.btnKey1),
                                        childAtPosition(
                                                withId(R.id.trKeysB),
                                                0)),
                                0),
                        isDisplayed()));
        appCompatButton.perform(click());
        */

        /*
        ViewInteraction appCompatButton2 = onView(
                allOf(withId(R.id.btnButton), withText("enter"),
                        childAtPosition(
                                allOf(withId(R.id.btnEnter),
                                        childAtPosition(
                                                withId(R.id.trActionsA),
                                                1)),
                                0),
                        isDisplayed()));
        appCompatButton2.perform(click());

        ViewInteraction appCompatButton3 = onView(
                allOf(withId(R.id.btnButton), withText("2"),
                        childAtPosition(
                                allOf(withId(R.id.btnKey2),
                                        childAtPosition(
                                                withId(R.id.trKeysB),
                                                1)),
                                0),
                        isDisplayed()));
        appCompatButton3.perform(click());

        ViewInteraction appCompatButton4 = onView(
                allOf(withId(R.id.btnButton), withText("enter"),
                        childAtPosition(
                                allOf(withId(R.id.btnEnter),
                                        childAtPosition(
                                                withId(R.id.trActionsA),
                                                1)),
                                0),
                        isDisplayed()));
        appCompatButton4.perform(click());

        ViewInteraction appCompatButton5 = onView(
                allOf(withId(R.id.btnButton), withText("3"),
                        childAtPosition(
                                allOf(withId(R.id.btnKey3),
                                        childAtPosition(
                                                withId(R.id.trKeysB),
                                                2)),
                                0),
                        isDisplayed()));
        appCompatButton5.perform(click());

        ViewInteraction appCompatButton6 = onView(
                allOf(withId(R.id.btnButton), withText("enter"),
                        childAtPosition(
                                allOf(withId(R.id.btnEnter),
                                        childAtPosition(
                                                withId(R.id.trActionsA),
                                                1)),
                                0),
                        isDisplayed()));
        appCompatButton6.perform(click());

        ViewInteraction appCompatButton7 = onView(
                allOf(withId(R.id.btnButton), withText("4"),
                        childAtPosition(
                                allOf(withId(R.id.btnKey4),
                                        childAtPosition(
                                                withId(R.id.trKeysC),
                                                0)),
                                0),
                        isDisplayed()));
        appCompatButton7.perform(click());

        ViewInteraction appCompatButton8 = onView(
                allOf(withId(R.id.btnButton), withText("enter"),
                        childAtPosition(
                                allOf(withId(R.id.btnEnter),
                                        childAtPosition(
                                                withId(R.id.trActionsA),
                                                1)),
                                0),
                        isDisplayed()));
        appCompatButton8.perform(click());

        ViewInteraction appCompatButton9 = onView(
                allOf(withId(R.id.btnButton), withText("5"),
                        childAtPosition(
                                allOf(withId(R.id.btnKey5),
                                        childAtPosition(
                                                withId(R.id.trKeysC),
                                                1)),
                                0),
                        isDisplayed()));
        appCompatButton9.perform(click());

        ViewInteraction appCompatButton10 = onView(
                allOf(withId(R.id.btnButton), withText("enter"),
                        childAtPosition(
                                allOf(withId(R.id.btnEnter),
                                        childAtPosition(
                                                withId(R.id.trActionsA),
                                                1)),
                                0),
                        isDisplayed()));
        appCompatButton10.perform(click());

        ViewInteraction appCompatButton11 = onView(
                allOf(withId(R.id.btnButton), withText("6"),
                        childAtPosition(
                                allOf(withId(R.id.btnKey6),
                                        childAtPosition(
                                                withId(R.id.trKeysC),
                                                2)),
                                0),
                        isDisplayed()));
        appCompatButton11.perform(click());

        ViewInteraction appCompatButton12 = onView(
                allOf(withId(R.id.btnButton), withText("enter"),
                        childAtPosition(
                                allOf(withId(R.id.btnEnter),
                                        childAtPosition(
                                                withId(R.id.trActionsA),
                                                1)),
                                0),
                        isDisplayed()));
        appCompatButton12.perform(click());

        ViewInteraction appCompatButton13 = onView(
                allOf(withId(R.id.btnButton), withText("7"),
                        childAtPosition(
                                allOf(withId(R.id.btnKey7),
                                        childAtPosition(
                                                withId(R.id.trKeysD),
                                                0)),
                                0),
                        isDisplayed()));
        appCompatButton13.perform(click());

        ViewInteraction appCompatButton14 = onView(
                allOf(withId(R.id.btnButton), withText("enter"),
                        childAtPosition(
                                allOf(withId(R.id.btnEnter),
                                        childAtPosition(
                                                withId(R.id.trActionsA),
                                                1)),
                                0),
                        isDisplayed()));
        appCompatButton14.perform(click());

        ViewInteraction appCompatButton15 = onView(
                allOf(withId(R.id.btnButton), withText("8"),
                        childAtPosition(
                                allOf(withId(R.id.btnKey8),
                                        childAtPosition(
                                                withId(R.id.trKeysD),
                                                1)),
                                0),
                        isDisplayed()));
        appCompatButton15.perform(click());

        ViewInteraction appCompatButton16 = onView(
                allOf(withId(R.id.btnButton), withText("enter"),
                        childAtPosition(
                                allOf(withId(R.id.btnEnter),
                                        childAtPosition(
                                                withId(R.id.trActionsA),
                                                1)),
                                0),
                        isDisplayed()));
        appCompatButton16.perform(click());

        ViewInteraction appCompatButton17 = onView(
                allOf(withId(R.id.btnButton), withText("1"),
                        childAtPosition(
                                allOf(withId(R.id.btnKey1),
                                        childAtPosition(
                                                withId(R.id.trKeysB),
                                                0)),
                                0),
                        isDisplayed()));
        appCompatButton17.perform(click());

        ViewInteraction appCompatButton18 = onView(
                allOf(withId(R.id.btnLeft), withText("�--"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                6),
                        isDisplayed()));
        appCompatButton18.perform(click());

        ViewInteraction appCompatButton19 = onView(
                allOf(withId(R.id.btnButton), withText("MEM"),
                        childAtPosition(
                                allOf(withId(R.id.btnMEM),
                                        childAtPosition(
                                                withId(R.id.trMEM),
                                                0)),
                                0),
                        isDisplayed()));
        appCompatButton19.perform(click());

        ViewInteraction appCompatButton20 = onView(
                allOf(withId(R.id.btnRight), withText("--�"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                7),
                        isDisplayed()));
        appCompatButton20.perform(click());

        ViewInteraction appCompatButton21 = onView(
                allOf(withId(R.id.btnButton), withText("del"),
                        childAtPosition(
                                allOf(withId(R.id.btnDelete),
                                        childAtPosition(
                                                withId(R.id.trActionsA),
                                                2)),
                                0),
                        isDisplayed()));
        appCompatButton21.perform(click());

        ViewInteraction appCompatButton22 = onView(
                allOf(withId(R.id.btnButton), withText("?"),
                        childAtPosition(
                                allOf(withId(R.id.btnAlpha),
                                        childAtPosition(
                                                withId(R.id.trActionsE),
                                                0)),
                                0),
                        isDisplayed()));
        appCompatButton22.perform(click());

        ViewInteraction appCompatButton23 = onView(
                allOf(withId(R.id.btnButton), withText("1"),
                        childAtPosition(
                                allOf(withId(R.id.btnKey1),
                                        childAtPosition(
                                                withId(R.id.trKeysB),
                                                0)),
                                0),
                        isDisplayed()));
        appCompatButton23.perform(click());

        ViewInteraction appCompatButton24 = onView(
                allOf(withId(R.id.btnButton), withText("1"),
                        childAtPosition(
                                allOf(withId(R.id.btnKey1),
                                        childAtPosition(
                                                withId(R.id.trKeysB),
                                                0)),
                                0),
                        isDisplayed()));
        appCompatButton24.perform(click());

        ViewInteraction appCompatButton25 = onView(
                allOf(withId(R.id.btnButton), withText("enter"),
                        childAtPosition(
                                allOf(withId(R.id.btnEnter),
                                        childAtPosition(
                                                withId(R.id.trActionsA),
                                                1)),
                                0),
                        isDisplayed()));
        appCompatButton25.perform(click());

        ViewInteraction appCompatButton26 = onView(
                allOf(withId(R.id.btnButton), withText("?"),
                        childAtPosition(
                                allOf(withId(R.id.btnAlpha),
                                        childAtPosition(
                                                withId(R.id.trActionsE),
                                                0)),
                                0),
                        isDisplayed()));
        appCompatButton26.perform(click());

        ViewInteraction appCompatButton27 = onView(
                allOf(withId(R.id.btnButton), withText("2"),
                        childAtPosition(
                                allOf(withId(R.id.btnKey2),
                                        childAtPosition(
                                                withId(R.id.trKeysB),
                                                1)),
                                0),
                        isDisplayed()));
        appCompatButton27.perform(click());

        ViewInteraction appCompatButton28 = onView(
                allOf(withId(R.id.btnButton), withText("2"),
                        childAtPosition(
                                allOf(withId(R.id.btnKey2),
                                        childAtPosition(
                                                withId(R.id.trKeysB),
                                                1)),
                                0),
                        isDisplayed()));
        appCompatButton28.perform(click());

        ViewInteraction appCompatButton29 = onView(
                allOf(withId(R.id.btnButton), withText("enter"),
                        childAtPosition(
                                allOf(withId(R.id.btnEnter),
                                        childAtPosition(
                                                withId(R.id.trActionsA),
                                                1)),
                                0),
                        isDisplayed()));
        appCompatButton29.perform(click());

        ViewInteraction appCompatButton30 = onView(
                allOf(withId(R.id.btnButton), withText("?"),
                        childAtPosition(
                                allOf(withId(R.id.btnAlpha),
                                        childAtPosition(
                                                withId(R.id.trActionsE),
                                                0)),
                                0),
                        isDisplayed()));
        appCompatButton30.perform(click());

        ViewInteraction appCompatButton31 = onView(
                allOf(withId(R.id.btnButton), withText("3"),
                        childAtPosition(
                                allOf(withId(R.id.btnKey3),
                                        childAtPosition(
                                                withId(R.id.trKeysB),
                                                2)),
                                0),
                        isDisplayed()));
        appCompatButton31.perform(click());

        ViewInteraction appCompatButton32 = onView(
                allOf(withId(R.id.btnButton), withText("3"),
                        childAtPosition(
                                allOf(withId(R.id.btnKey3),
                                        childAtPosition(
                                                withId(R.id.trKeysB),
                                                2)),
                                0),
                        isDisplayed()));
        appCompatButton32.perform(click());

        ViewInteraction appCompatButton33 = onView(
                allOf(withId(R.id.btnButton), withText("enter"),
                        childAtPosition(
                                allOf(withId(R.id.btnEnter),
                                        childAtPosition(
                                                withId(R.id.trActionsA),
                                                1)),
                                0),
                        isDisplayed()));
        appCompatButton33.perform(click());

        ViewInteraction appCompatButton34 = onView(
                allOf(withId(R.id.btnButton), withText("?"),
                        childAtPosition(
                                allOf(withId(R.id.btnAlpha),
                                        childAtPosition(
                                                withId(R.id.trActionsE),
                                                0)),
                                0),
                        isDisplayed()));
        appCompatButton34.perform(click());

        ViewInteraction appCompatButton35 = onView(
                allOf(withId(R.id.btnButton), withText("4"),
                        childAtPosition(
                                allOf(withId(R.id.btnKey4),
                                        childAtPosition(
                                                withId(R.id.trKeysC),
                                                0)),
                                0),
                        isDisplayed()));
        appCompatButton35.perform(click());

        ViewInteraction appCompatButton36 = onView(
                allOf(withId(R.id.btnButton), withText("4"),
                        childAtPosition(
                                allOf(withId(R.id.btnKey4),
                                        childAtPosition(
                                                withId(R.id.trKeysC),
                                                0)),
                                0),
                        isDisplayed()));
        appCompatButton36.perform(click());

        ViewInteraction appCompatButton37 = onView(
                allOf(withId(R.id.btnButton), withText("enter"),
                        childAtPosition(
                                allOf(withId(R.id.btnEnter),
                                        childAtPosition(
                                                withId(R.id.trActionsA),
                                                1)),
                                0),
                        isDisplayed()));
        appCompatButton37.perform(click());

        ViewInteraction appCompatButton38 = onView(
                allOf(withId(R.id.btnButton), withText("?"),
                        childAtPosition(
                                allOf(withId(R.id.btnAlpha),
                                        childAtPosition(
                                                withId(R.id.trActionsE),
                                                0)),
                                0),
                        isDisplayed()));
        appCompatButton38.perform(click());

        ViewInteraction appCompatButton39 = onView(
                allOf(withId(R.id.btnButton), withText("5"),
                        childAtPosition(
                                allOf(withId(R.id.btnKey5),
                                        childAtPosition(
                                                withId(R.id.trKeysC),
                                                1)),
                                0),
                        isDisplayed()));
        appCompatButton39.perform(click());

        ViewInteraction appCompatButton40 = onView(
                allOf(withId(R.id.btnButton), withText("5"),
                        childAtPosition(
                                allOf(withId(R.id.btnKey5),
                                        childAtPosition(
                                                withId(R.id.trKeysC),
                                                1)),
                                0),
                        isDisplayed()));
        appCompatButton40.perform(click());

        ViewInteraction appCompatButton41 = onView(
                allOf(withId(R.id.btnButton), withText("enter"),
                        childAtPosition(
                                allOf(withId(R.id.btnEnter),
                                        childAtPosition(
                                                withId(R.id.trActionsA),
                                                1)),
                                0),
                        isDisplayed()));
        appCompatButton41.perform(click());

        ViewInteraction appCompatButton42 = onView(
                allOf(withId(R.id.btnButton), withText("?"),
                        childAtPosition(
                                allOf(withId(R.id.btnAlpha),
                                        childAtPosition(
                                                withId(R.id.trActionsE),
                                                0)),
                                0),
                        isDisplayed()));
        appCompatButton42.perform(click());

        ViewInteraction appCompatButton43 = onView(
                allOf(withId(R.id.btnButton), withText("6"),
                        childAtPosition(
                                allOf(withId(R.id.btnKey6),
                                        childAtPosition(
                                                withId(R.id.trKeysC),
                                                2)),
                                0),
                        isDisplayed()));
        appCompatButton43.perform(click());

        ViewInteraction appCompatButton44 = onView(
                allOf(withId(R.id.btnButton), withText("6"),
                        childAtPosition(
                                allOf(withId(R.id.btnKey6),
                                        childAtPosition(
                                                withId(R.id.trKeysC),
                                                2)),
                                0),
                        isDisplayed()));
        appCompatButton44.perform(click());

        ViewInteraction appCompatButton45 = onView(
                allOf(withId(R.id.btnButton), withText("enter"),
                        childAtPosition(
                                allOf(withId(R.id.btnEnter),
                                        childAtPosition(
                                                withId(R.id.trActionsA),
                                                1)),
                                0),
                        isDisplayed()));
        appCompatButton45.perform(click());

        ViewInteraction appCompatButton46 = onView(
                allOf(withId(R.id.btnButton), withText("?"),
                        childAtPosition(
                                allOf(withId(R.id.btnAlpha),
                                        childAtPosition(
                                                withId(R.id.trActionsE),
                                                0)),
                                0),
                        isDisplayed()));
        appCompatButton46.perform(click());

        ViewInteraction appCompatButton47 = onView(
                allOf(withId(R.id.btnButton), withText("7"),
                        childAtPosition(
                                allOf(withId(R.id.btnKey7),
                                        childAtPosition(
                                                withId(R.id.trKeysD),
                                                0)),
                                0),
                        isDisplayed()));
        appCompatButton47.perform(click());

        ViewInteraction appCompatButton48 = onView(
                allOf(withId(R.id.btnButton), withText("7"),
                        childAtPosition(
                                allOf(withId(R.id.btnKey7),
                                        childAtPosition(
                                                withId(R.id.trKeysD),
                                                0)),
                                0),
                        isDisplayed()));
        appCompatButton48.perform(click());

        ViewInteraction appCompatButton49 = onView(
                allOf(withId(R.id.btnButton), withText("enter"),
                        childAtPosition(
                                allOf(withId(R.id.btnEnter),
                                        childAtPosition(
                                                withId(R.id.trActionsA),
                                                1)),
                                0),
                        isDisplayed()));
        appCompatButton49.perform(click());

        ViewInteraction appCompatButton50 = onView(
                allOf(withId(R.id.btnButton), withText("?"),
                        childAtPosition(
                                allOf(withId(R.id.btnAlpha),
                                        childAtPosition(
                                                withId(R.id.trActionsE),
                                                0)),
                                0),
                        isDisplayed()));
        appCompatButton50.perform(click());

        ViewInteraction appCompatButton51 = onView(
                allOf(withId(R.id.btnButton), withText("8"),
                        childAtPosition(
                                allOf(withId(R.id.btnKey8),
                                        childAtPosition(
                                                withId(R.id.trKeysD),
                                                1)),
                                0),
                        isDisplayed()));
        appCompatButton51.perform(click());

        ViewInteraction appCompatButton52 = onView(
                allOf(withId(R.id.btnButton), withText("8"),
                        childAtPosition(
                                allOf(withId(R.id.btnKey8),
                                        childAtPosition(
                                                withId(R.id.trKeysD),
                                                1)),
                                0),
                        isDisplayed()));
        appCompatButton52.perform(click());

        ViewInteraction appCompatButton53 = onView(
                allOf(withId(R.id.btnButton), withText("enter"),
                        childAtPosition(
                                allOf(withId(R.id.btnEnter),
                                        childAtPosition(
                                                withId(R.id.trActionsA),
                                                1)),
                                0),
                        isDisplayed()));
        appCompatButton53.perform(click());

        ViewInteraction appCompatButton54 = onView(
                allOf(withId(R.id.btnButton), withText("1"),
                        childAtPosition(
                                allOf(withId(R.id.btnKey1),
                                        childAtPosition(
                                                withId(R.id.trKeysB),
                                                0)),
                                0),
                        isDisplayed()));
        appCompatButton54.perform(click());

        ViewInteraction appCompatButton55 = onView(
                allOf(withId(R.id.btnLeft), withText("�--"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                6),
                        isDisplayed()));
        appCompatButton55.perform(click());

        ViewInteraction appCompatButton56 = onView(
                allOf(withId(R.id.btnButton), withText("EQU"),
                        childAtPosition(
                                allOf(withId(R.id.btnEQU),
                                        childAtPosition(
                                                withId(R.id.trEqu),
                                                0)),
                                0),
                        isDisplayed()));
        appCompatButton56.perform(click());

        ViewInteraction appCompatButton57 = onView(
                allOf(withId(R.id.btnButton), withText("?"),
                        childAtPosition(
                                allOf(withId(R.id.btnAlpha),
                                        childAtPosition(
                                                withId(R.id.trActionsE),
                                                0)),
                                0),
                        isDisplayed()));
        appCompatButton57.perform(click());

        ViewInteraction appCompatButton58 = onView(
                allOf(withId(R.id.btnRight), withText("--�"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                7),
                        isDisplayed()));
        appCompatButton58.perform(click());

        ViewInteraction appCompatButton59 = onView(
                allOf(withId(R.id.btnButton), withText("del"),
                        childAtPosition(
                                allOf(withId(R.id.btnDelete),
                                        childAtPosition(
                                                withId(R.id.trActionsA),
                                                2)),
                                0),
                        isDisplayed()));
        appCompatButton59.perform(click());
         */
    }

    private static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {

        return new TypeSafeMatcher<View>() {
            @Override
            public void describeTo(Description description) {
                description.appendText("Child at position " + position + " in parent ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                return parent instanceof ViewGroup && parentMatcher.matches(parent)
                        && view.equals(((ViewGroup) parent).getChildAt(position));
            }
        };
    }
}

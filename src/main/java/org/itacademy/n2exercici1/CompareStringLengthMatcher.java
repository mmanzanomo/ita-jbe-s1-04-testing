package org.itacademy.n2exercici1;


import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;

public class CompareStringLengthMatcher {

    public static Matcher<String> hasLength(Matcher<? super Integer> matcher) {
        return new FeatureMatcher<String, Integer> (matcher,
                "a String of length",
                "length") {

            @Override
            protected Integer featureValueOf(String actual) {
                return actual.length();
            }
        };
    }

}

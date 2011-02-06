package pl.gajowy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import static pl.gajowy.ExampleRanges.*;

public class PointContainingRangeTest {

    @Test
    public void shouldContainLowerBound() {
        assertThat(nonEmptyRange.contains(lowerBound), is(true));
    }

    @Test
    public void shouldNotContainUpperBound() {
        assertThat(nonEmptyRange.contains(upperBound), is(false));
    }

    @Test
    public void shouldContainMiddleElement() {
        assertThat(nonEmptyRange.contains(4), is(true));
    }

    @Test
    public void shouldNotContainBoundsIfTheyAreEqual() {
        int bound = 3;
        assertThat(rangeWithEqualBounds.contains(bound), is(false));
    }
}

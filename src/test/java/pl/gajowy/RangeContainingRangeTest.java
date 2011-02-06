package pl.gajowy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import static pl.gajowy.ExampleRanges.*;

public class RangeContainingRangeTest {

    @Test
    public void shouldNotContainRangeWithUpperBoundBiggerThanItsOwn() {
        assertThat(nonEmptyRange.contains(new Range(lowerBound, upperBound + 1)), is(false));
    }

    @Test
    public void shouldNotContainRangeWithLowerBoundLowerThanItsOwn() {
        assertThat(nonEmptyRange.contains(new Range(lowerBound - 1, upperBound)), is(false));
    }

    @Test
    public void shouldContainEmptyRange() {
        assertThat(nonEmptyRange.contains(rangeWithEqualBounds), is(true));
    }

    @Test
    public void shouldContainItself() {
        assertThat(nonEmptyRange.contains(nonEmptyRange), is(true));
    }

    @Test
    public void shouldContainRangeWithEqualsBounds() {
        assertThat(nonEmptyRange.contains(new Range(lowerBound, upperBound)), is(true));
    }

    @Test
    public void shouldContainRangeWithBoundsWithinRange() {
        assertThat(nonEmptyRange.contains(new Range(lowerBound + 1, upperBound - 1)), is(true));
    }
}

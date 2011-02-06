package pl.gajowy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static pl.gajowy.ExampleRanges.lowerBound;
import static pl.gajowy.ExampleRanges.nonEmptyRange;

public class EmptinessRangeTest {

    @Test
    public void shouldBeEmptyIfBoundsAreEqual() {
        assertThat(new Range(lowerBound, lowerBound).isEmpty(), is(true));
    }

    @Test
    public void shouldNotBeEmptyWhenLowerBoundIsLessThanUpperBound() {
        assertThat(nonEmptyRange.isEmpty(), is(false));
    }

    @Test
    public void shouldBeEmptyWhenLowerBoundIsGreaterThanUpperBound() {
        assertThat(new Range(5, 3).isEmpty(), is(true));
    }

}

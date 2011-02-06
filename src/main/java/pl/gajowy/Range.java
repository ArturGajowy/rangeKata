package pl.gajowy;

public class Range {
    private int lowerBound;
    private int upperBound;

    public Range(int lowerBound, int upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    public boolean contains(int point) {
        return lowerBound <= point && point < upperBound;
    }

    public boolean isEmpty() {
        return lowerBound >= upperBound;
    }

    public boolean contains(Range that) {
        return that.isEmpty() || (that.lowerBound >= this.lowerBound && that.upperBound <= this.upperBound);
    }
}

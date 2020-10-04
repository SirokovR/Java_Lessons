package pattern.iteratorPattern;

import pattern.iteratorPattern.profile.Profile;

public interface ProfileIterator {
        boolean hasNext();

        Profile getNext();

        void reset();
    }


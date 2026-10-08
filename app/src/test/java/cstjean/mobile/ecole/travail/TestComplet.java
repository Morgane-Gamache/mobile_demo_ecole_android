package cstjean.mobile.ecole.travail;

import junit.framework.TestSuite;

public class TestComplet {
    public static TestSuite suite() {
        TestSuite suite = new TestSuite();
        suite.addTestSuite(TestTravail.class);
        suite.addTestSuite(TestCoursSession.class);
        return suite;
    }
}

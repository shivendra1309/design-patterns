package structural.facade;

import static org.junit.Assert.*;

public class HelperFacadeTest {
    @org.junit.Test
    public void testFacade() throws Exception {
        HelperFacade.generateReport(DBTypes.MYSQL, ReportTypes.HTML, "test");
        HelperFacade.generateReport(DBTypes.MYSQL, ReportTypes.PDF, "test");
        HelperFacade.generateReport(DBTypes.ORACLE, ReportTypes.HTML, "test");
        HelperFacade.generateReport(DBTypes.ORACLE, ReportTypes.PDF, "test");
    }
}

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = { "pretty",
                "html:target/reports/html/cucumber-Westfalen_reports.html",
                "json:target/reports/json/json-reports/cucumber.json",
                "junit:target/reports/xml/xml-report/cucumber.xml",
                "rerun:target/reports/rerun.txt"
        },
        features = "src/test/resources/Features",
        glue="stepDef",
        tags="@US001_TC01",
        dryRun = false
)
public class Runner {
}

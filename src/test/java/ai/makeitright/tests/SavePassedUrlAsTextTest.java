package ai.makeitright.tests;

import ai.makeitright.utilities.DriverConfig;
import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

public class SavePassedUrlAsTextTest extends DriverConfig {

    private final String artifactsPath = System.getProperty("ARTIFACTS_PATH");
    private final String fileSeparator = System.getProperty("file.separator");
    private final String passedUrl = System.getProperty("previousParameters.url");

    @Test
    public void savePassedUrlAsTextFile() throws IOException {

        FileUtils.writeStringToFile(
                new File(artifactsPath + fileSeparator + "textFileWithPassedUrl.txt"),
                passedUrl,
                Charset.defaultCharset()
        );

    }

}

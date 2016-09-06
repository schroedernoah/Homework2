import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Homework2
{
    public static void main( String args[] )
    {
        String  filename = args[0];
        String  template = readFileAsString( filename );
        HashMap tags     = makeHashMap();

        // Write the TemplateProcessor class to enable these lines:
        TemplateProcessor t = new TemplateProcessor(tags);
        System.out.print( t.expand(template) );
    }

    public static HashMap makeHashMap()
    {
        HashMap tags = new HashMap();              // Create a hash map
        tags.put("name"       , "Chris");          // Put elements to the map
        tags.put("value"      , new Integer(10000));
        tags.put("taxed_value", new Double(10000 - 10000 * 0.4));
        tags.put("in_CA"      , false);
        return tags;
    }

    private static String readFileAsString( String filePath )
    {
        try {
            StringBuffer fileData = new StringBuffer(1000);
            BufferedReader reader = new BufferedReader(
                                        new FileReader(filePath));
            char[] buf = new char[1024];
            int numRead = 0;
            while ((numRead=reader.read(buf)) != -1)
            {
                String readData = String.valueOf(buf, 0, numRead);
                fileData.append(readData);
                buf = new char[1024];
            }
            reader.close();
            return fileData.toString();
	} catch (IOException e) {
            System.out.println( "An I/O error occurred." );
        }
        return "";
    }
}

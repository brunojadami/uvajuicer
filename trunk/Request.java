
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author bruno
 */
public class Request
{
    static private final String PROBLEMS_URL = "http://uhunt.felix-halim.net/api/p";
    static private final String USER_URL = "http://uhunt.felix-halim.net/api/subs/";

    public static String getProblems() throws Exception
    {
        return getContent(PROBLEMS_URL);
    }

    public static String getSubmissions(int user) throws Exception
    {
        return getContent(USER_URL + user);
    }

    private static String getContent(String link) throws Exception
    {
        URL url = new URL(link);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuffer newData = new StringBuffer(10000);
        String s = "";
        while (null != ((s = br.readLine())))
            newData.append(s);
        br.close();
        connection.disconnect();
        return new String(newData);
    }
}

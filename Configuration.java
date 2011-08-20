
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;

/**
 *
 * @author bruno
 */
public class Configuration
{
    static private LinkedList<Integer> users;
    static private LinkedList<Integer> problems;

    static public void loadConfig() throws Exception
    {
        users = new LinkedList<Integer>();
        problems = new LinkedList<Integer>();

        BufferedReader input =  new BufferedReader(new FileReader("configs"));
        String line = input.readLine();
        // users
        while (true)
        {
            line = input.readLine();
            if (line == null || line.indexOf("#") != -1)
                break;
            users.add(Integer.parseInt(line));
        }
        // problems
        while (true)
        {
            line = input.readLine();
            if (line == null || line.indexOf("#") != -1)
                break;
            problems.add(Integer.parseInt(line));
        }
        input.close();
    }

    static public LinkedList<Integer> getUsers()
    {
        return new LinkedList<Integer>(users);
    }

    static public LinkedList<Integer> getProblems()
    {
        return new LinkedList<Integer>(problems);
    }
}


import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception
    {
        Configuration.loadConfig();

        String problemsString = Request.getProblems();
        LinkedList<Problem> problems = Parser.parseProblems(problemsString);

        LinkedList<User> users = new LinkedList<User>();
        Iterator<Integer> it = Configuration.getUsers().iterator();
        while (it.hasNext())
        {
            int userId = it.next();
            String userString = Request.getSubmissions(userId);
            User user = Parser.parseUser(userString);
            users.add(user);
        }

        LinkedList<Integer> choosed = Chooser.getProblems(users, problems);
        it = choosed.iterator();
        while (it.hasNext())
        {
            int id = it.next();
            System.out.println(id);
            System.out.println(Problem.toLink(id));
        }
    }

}

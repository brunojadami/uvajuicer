
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author bruno
 */
public class Chooser
{
    public static LinkedList<Integer> getProblems(LinkedList<User> users, LinkedList<Problem> problems) throws Exception
    {
        LinkedList<Integer> choosed = new LinkedList<Integer>();
        Collections.sort(problems, new ProblemComparator());

        Iterator<Integer> it = Configuration.getProblems().iterator();
        while (it.hasNext())
        {
            int per = it.next();
            int param = per;
            per = per*problems.size()/100 - 1;
            per += Math.random() * 100 - 50;
            per = Math.max(0, per);
            per = Math.min(problems.size()-1, per);

            while (per != problems.size())
            {
                boolean valid = true;
                int id = problems.get(per).getId();
                for (int i = 0; i < users.size(); ++i)
                {
                    if (users.get(i).getAccepted().containsKey(id))
                    {
                        valid = false;
                        break;
                    }
                }
                if (valid)
                {
                    choosed.add(problems.get(per).getNumber());
                    break;
                }
                else
                    ++per;
            }

            if (per == problems.size())
            {
                per = param;
                while (per != -1)
                {
                    boolean valid = true;
                    int id = problems.get(per).getId();
                    for (int i = 0; i < users.size(); ++i)
                    {
                        if (users.get(i).getAccepted().containsKey(id))
                        {
                            valid = false;
                            break;
                        }
                    }
                    if (valid)
                    {
                        choosed.add(problems.get(per).getNumber());
                        break;
                    }
                    else
                        --per;
                }
            }

            if (per == -1)
                System.out.println("Could not get a problem for the parameter: " + param);
            else
                System.out.println("Choosed with dacu: " + problems.get(per).getDacu());
        }

        Collections.shuffle(choosed);
        System.out.println("Shuffled problems!");
        return choosed;
    }
}

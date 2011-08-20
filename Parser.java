
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class Parser
{
    public static LinkedList<Problem> parseProblems(String string)
    {
        string = string.replace('[', ' ');
        string = string.replace(']', ' ');
        string = string.replace(',', ' ');

        Scanner sc = new Scanner(string);
        LinkedList<Problem> problems = new LinkedList<Problem>();

        while (sc.hasNext())
        {
            Problem prob = new Problem();
            prob.setId(sc.nextInt());
            prob.setNumber(sc.nextInt());
            String str = sc.next();
            if (str.charAt(str.length()-1) != '\"' || str.substring(str.length()-2).equals("\\\""))
            {
                while (true)
                {
                     String aux = sc.next();
                     str += ' ';
                     str += aux;
                     if (aux.indexOf('"') != -1 && !str.substring(str.length()-2).equals("\\\""))
                         break;
                }
            }
            prob.setTitle(str);
            prob.setDacu(sc.nextInt());
            prob.setBestRun(sc.nextInt());
            prob.setBestMem(sc.nextInt());
            prob.setErrors(sc.nextInt());
            prob.setCantJudge(sc.nextInt());
            prob.setQueue(sc.nextInt());
            prob.setCompError(sc.nextInt());
            prob.setRestricted(sc.nextInt());
            prob.setRuntime(sc.nextInt());
            prob.setOutputLim(sc.nextInt());
            prob.setTle(sc.nextInt());
            prob.setMle(sc.nextInt());
            prob.setWa(sc.nextInt());
            prob.setPe(sc.nextInt());
            prob.setAccepted(sc.nextInt());
            prob.setOther(sc.nextInt());
            problems.add(prob);
        }

        System.out.println("Got " + problems.size() + " problems.");

        return problems;
    }

    public static User parseUser(String string)
    {
        string = string.substring(string.indexOf("[["), string.length()-2);
        string = string.replace('[', ' ');
        string = string.replace(']', ' ');
        string = string.replace(',', ' ');

        Scanner sc = new Scanner(string);
        User user = new User();

        while (sc.hasNext())
        {
            Submission sub = new Submission();
            sub.setId(sc.nextInt());
            sub.setProblem(sc.nextInt());
            sub.setVeredict(sc.nextInt());
            sub.setRuntime(sc.nextInt());
            sub.setMemory(sc.nextInt());
            sub.setTime(sc.nextInt());
            sub.setLang(sc.nextInt());
            sub.setRank(sc.nextInt());

            if (sub.getVeredict() == 90)
                user.addSubmission(sub);
        }

        return user;
    }
}

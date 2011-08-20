
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

/**
 *
 * @author bruno
 */
public class User
{
    private String name;
    private String uname;
    private HashMap<Integer, Submission> accepted = new HashMap<Integer, Submission>();

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the uname
     */
    public String getUname() {
        return uname;
    }

    /**
     * @param uname the uname to set
     */
    public void setUname(String uname) {
        this.uname = uname;
    }

    public void addSubmission(Submission submission)
    {
        getAccepted().put(submission.getProblem(), submission);
    }

    /**
     * @return the accepted
     */
    public HashMap<Integer, Submission> getAccepted() {
        return new HashMap<Integer, Submission>(accepted);
    }



    
}

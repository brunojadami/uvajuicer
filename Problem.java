
import java.util.Comparator;

/**
 *
 * @author bruno
 */
public class Problem
{
    static public String toLink(int number)
    {
        return "http://uva.onlinejudge.org/external/" + number/100 + "/" + number + ".html";
    }

    private int id;
    private int number;
    private String title;
    private int dacu;
    private int bestRun;
    private int bestMem;
    private int errors;
    private int cantJudge;
    private int queue;
    private int compError;
    private int restricted;
    private int runtime;
    private int outputLim;
    private int tle;
    private int mle;
    private int wa;
    private int pe;
    private int accepted;
    private int other;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return new String(title);
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the dacu
     */
    public int getDacu() {
        return dacu;
    }

    /**
     * @param dacu the dacu to set
     */
    public void setDacu(int dacu) {
        this.dacu = dacu;
    }

    /**
     * @return the bestRun
     */
    public int getBestRun() {
        return bestRun;
    }

    /**
     * @param bestRun the bestRun to set
     */
    public void setBestRun(int bestRun) {
        this.bestRun = bestRun;
    }

    /**
     * @return the bestMem
     */
    public int getBestMem() {
        return bestMem;
    }

    /**
     * @param bestMem the bestMem to set
     */
    public void setBestMem(int bestMem) {
        this.bestMem = bestMem;
    }

    /**
     * @return the errors
     */
    public int getErrors() {
        return errors;
    }

    /**
     * @param errors the errors to set
     */
    public void setErrors(int errors) {
        this.errors = errors;
    }

    /**
     * @return the cantJudge
     */
    public int getCantJudge() {
        return cantJudge;
    }

    /**
     * @param cantJudge the cantJudge to set
     */
    public void setCantJudge(int cantJudge) {
        this.cantJudge = cantJudge;
    }

    /**
     * @return the queue
     */
    public int getQueue() {
        return queue;
    }

    /**
     * @param queue the queue to set
     */
    public void setQueue(int queue) {
        this.queue = queue;
    }

    /**
     * @return the compError
     */
    public int getCompError() {
        return compError;
    }

    /**
     * @param compError the compError to set
     */
    public void setCompError(int compError) {
        this.compError = compError;
    }

    /**
     * @return the restricted
     */
    public int getRestricted() {
        return restricted;
    }

    /**
     * @param restricted the restricted to set
     */
    public void setRestricted(int restricted) {
        this.restricted = restricted;
    }

    /**
     * @return the runtime
     */
    public int getRuntime() {
        return runtime;
    }

    /**
     * @param runtime the runtime to set
     */
    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    /**
     * @return the outputLim
     */
    public int getOutputLim() {
        return outputLim;
    }

    /**
     * @param outputLim the outputLim to set
     */
    public void setOutputLim(int outputLim) {
        this.outputLim = outputLim;
    }

    /**
     * @return the tle
     */
    public int getTle() {
        return tle;
    }

    /**
     * @param tle the tle to set
     */
    public void setTle(int tle) {
        this.tle = tle;
    }

    /**
     * @return the mle
     */
    public int getMle() {
        return mle;
    }

    /**
     * @param mle the mle to set
     */
    public void setMle(int mle) {
        this.mle = mle;
    }

    /**
     * @return the wa
     */
    public int getWa() {
        return wa;
    }

    /**
     * @param wa the wa to set
     */
    public void setWa(int wa) {
        this.wa = wa;
    }

    /**
     * @return the pe
     */
    public int getPe() {
        return pe;
    }

    /**
     * @param pe the pe to set
     */
    public void setPe(int pe) {
        this.pe = pe;
    }

    /**
     * @return the accepted
     */
    public int getAccepted() {
        return accepted;
    }

    /**
     * @param accepted the accepted to set
     */
    public void setAccepted(int accepted) {
        this.accepted = accepted;
    }

    /**
     * @return the other
     */
    public int getOther() {
        return other;
    }

    /**
     * @param other the other to set
     */
    public void setOther(int other) {
        this.other = other;
    }
}

class ProblemComparator implements Comparator<Problem>
{
    public int compare(Problem a, Problem b)
    {
        return (a.getDacu() - b.getDacu());
    }
}

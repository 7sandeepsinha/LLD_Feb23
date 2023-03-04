package inheritance;

public class Instructor extends User{
    private int rating;
    private String batch;

    public Instructor(int id, String name, String phoneNo) {
        super(id, name, phoneNo);
    }

    public Instructor(int id, String name, String phoneNo, int rating, String batch) {
        super(id, name, phoneNo); //always initialise parent attributes first -> super has to be 1st line inside cons.
        this.rating = rating;
        this.batch = batch;
    }


    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }
}

/*
    Client -> Child constructor -> Parent constructor { initialise the attributes } -> Child constructor { values are inherited
    from parent, and initialise attributes in child } -> get child object
 */
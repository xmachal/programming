package mainpackage;

public class Provoles {
    private int provoliId;
    private String provoliFilm;
    private int provoliCinema;
    private String provoliStartDate;
    private String provoliEndDate;
    private int provoliNumberOfReservations;
    private boolean provoliIsAvailable;

    public Provoles(int provoliId, String provoliFilm, int provoliCinema, String provoliStartDate, String provoliEndDate, int provoliNumberOfReservations, boolean provoliIsAvailable) {
        this.provoliId = provoliId;
        this.provoliFilm = provoliFilm;
        this.provoliCinema = provoliCinema;
        this.provoliStartDate = provoliStartDate;
        this.provoliEndDate = provoliEndDate;
        this.provoliNumberOfReservations = provoliNumberOfReservations;
        this.provoliIsAvailable = provoliIsAvailable;
    }


    public int getProvoliId() {
        return provoliId;
    }

    public void setProvoliId(int provoliId) {
        this.provoliId = provoliId;
    }

    public String getProvoliFilm() {
        return provoliFilm;
    }

    public void setProvoliFilm(String provoliFilm) {
        this.provoliFilm = provoliFilm;
    }

    public int getProvoliCinema() {
        return provoliCinema;
    }

    public void setProvoliCinema(int provoliCinema) {
        this.provoliCinema = provoliCinema;
    }

    public String getProvoliStartDate() {
        return provoliStartDate;
    }

    public void setProvoliStartDate(String provoliStartDate) {
        this.provoliStartDate = provoliStartDate;
    }

    public String getProvoliEndDate() {
        return provoliEndDate;
    }

    public void setProvoliEndDate(String provoliEndDate) {
        this.provoliEndDate = provoliEndDate;
    }

    public int getProvoliNumberOfReservations() {
        return provoliNumberOfReservations;
    }

    public void setProvoliNumberOfReservations(int provoliNumberOfReservations) {
        this.provoliNumberOfReservations = provoliNumberOfReservations;
    }

    public boolean isProvoliIsAvailable() {
        return provoliIsAvailable;
    }

    public void setProvoliIsAvailable(boolean provoliIsAvailable) {
        this.provoliIsAvailable = provoliIsAvailable;
    }
}

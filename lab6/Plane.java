import java.util.Arrays;
import java.util.Comparator;

public class Plane {
    private final PlaneSeat[] seat;
    private int numEmptySeat;

    public Plane() {
        seat = new PlaneSeat[12];
        for (int i = 0; i < seat.length; i++) {
            seat[i] = new PlaneSeat(i + 1);
        }
        numEmptySeat = seat.length;
    }

    private PlaneSeat[] sortSeats() {
        PlaneSeat[] sortedSeats = Arrays.copyOf(seat, seat.length);
        Arrays.sort(sortedSeats, new Comparator<PlaneSeat>() {
            @Override
            public int compare(PlaneSeat first, PlaneSeat second) {
                return Integer.compare(first.getCustomerID(), second.getCustomerID());
            }
        });
        return sortedSeats;
    }

    public void showNumEmptySeats() {
        System.out.println("There are " + numEmptySeat + " empty seats");
    }

    public void showEmptySeats() {
        System.out.println("The following seats are empty:");
        for (PlaneSeat currentSeat : seat) {
            if (!currentSeat.isOccupied()) {
                System.out.println("SeatID " + currentSeat.getSeatID());
            }
        }
    }

    public void showAssignedSeats(boolean bySeatId) {
        System.out.println("The seat assignments are as follow:");
        PlaneSeat[] seatsToShow = bySeatId ? seat : sortSeats();
        for (PlaneSeat currentSeat : seatsToShow) {
            if (currentSeat.isOccupied()) {
                System.out.println("SeatID " + currentSeat.getSeatID()
                        + " assigned to CustomerID " + currentSeat.getCustomerID() + ".");
            }
        }
    }

    public void assignSeat(int seatId, int cust_id) {
        if (seatId < 1 || seatId > seat.length) {
            System.out.println("Invalid seat ID.");
            return;
        }
        if (cust_id <= 0) {
            System.out.println("Invalid customer ID.");
            return;
        }
        for (PlaneSeat currentSeat : seat) {
            if (currentSeat.isOccupied() && currentSeat.getCustomerID() == cust_id) {
                System.out.println("Customer already assigned to a seat.");
                return;
            }
        }
        PlaneSeat selectedSeat = seat[seatId - 1];
        if (selectedSeat.isOccupied()) {
            System.out.println("Seat already assigned to a customer.");
            return;
        }
        selectedSeat.assign(cust_id);
        numEmptySeat--;
        System.out.println("Seat Assigned!");
    }

    public void unAssignSeat(int seatId) {
        if (seatId < 1 || seatId > seat.length) {
            System.out.println("Invalid seat ID.");
            return;
        }
        PlaneSeat selectedSeat = seat[seatId - 1];
        if (!selectedSeat.isOccupied()) {
            System.out.println("Seat is not assigned.");
            return;
        }
        selectedSeat.unAssign();
        numEmptySeat++;
        System.out.println("Seat Unassigned!");
    }
}

public class SMARTLOCKERSYSTEM {
	public static void main(String[] args) {
		Parcel parcel = new Parcel("P101", "AISHA");
		Locker locker = new Locker("L01", parcel);

		System.out.println("Locker ID: " + locker.getLockerId());
		System.out.println("Parcel ID: " + locker.getCurrentParcel().getParcelId());
		System.out.println("Recipient: " + locker.getCurrentParcel().getRecipient());
	}
}

class Parcel {
	private String parcelId;
	private String recipient;

	public Parcel(String parcelId, String recipient) {
		this.parcelId = parcelId;
		this.recipient = recipient;
	}

	public String getParcelId() {
		return parcelId;
	}

	public String getRecipient() {
		return recipient;
	}
}

class Locker {
	private String lockerId;
	// HAS-A relationship: Locker has a Parcel.
	private Parcel currentParcel;

	public Locker(String lockerId, Parcel currentParcel) {
		this.lockerId = lockerId;
		this.currentParcel = currentParcel;
	}

	public String getLockerId() {
		return lockerId;
	}

	public Parcel getCurrentParcel() {
		return currentParcel;
	}
}

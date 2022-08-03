package eclipse;

public class Ticket {
	Integer id = -1;
	String summary = "";
	String description = "";
	String timFeedback = "";
	String version = "";
	String mergeRationale = "";
	Float plannedLOEHrs;
	Float actualLOEHrs;
}

enum TICKET_FILTER {
	CLOSED_ONLY,
	NO_CLOSED,
	ALL
}
package adapterpatternsw3;

public class Client {
    public static void main(String[] args) {

        // Adaptees
        AttendanceSystem attendanceSystem = new AttendanceSystem();
        GradingSystem gradingSystem = new GradingSystem();
        LibrarySystem librarySystem = new LibrarySystem();

        // Adapters
        SchoolManagementApp attendanceAdapter = new AttendanceSystemAdapter(attendanceSystem);
        SchoolManagementApp gradingAdapter = new GradingSystemAdapter(gradingSystem);
        SchoolManagementApp libraryAdapter = new LibrarySystemAdapter(librarySystem);

        // Unified usage
        System.out.println("=== School Management App Integration ===");
        attendanceAdapter.integrateSystem();
        gradingAdapter.integrateSystem();
        libraryAdapter.integrateSystem();
        
    }
}


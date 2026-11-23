public class HealthCheck {
    public static void main(String[] args) {
        boolean isSystemHealthy = true;
        boolean hasEnoughDiskSpace = true;

        if (isSystemHealthy && hasEnoughDiskSpace) {
            System.out.println("System status: Everything is OK.");
        } else if (!hasEnoughDiskSpace) {
            System.out.println("System status: Disk space low.");
        } else {
            System.out.println("System status: Action required.");
        }
    }
}

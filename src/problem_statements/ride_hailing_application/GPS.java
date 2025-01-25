package day6.problem_statements.ride_hailing_application;

public interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}


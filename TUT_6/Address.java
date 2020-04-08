package TUT_6;

public class Address {

    public String createAddress(String country){
        return String.format("Country: %s", country);
    }

    public String createAddress(String country, String city){
        return String.format("Country: %s, City: %s", country,city);
    }

    public String createAddress(String country, String city, int postalCode){
        return String.format("Country: %s, City: %s, PostalCode: %d", country,city,postalCode);
    }

    public String createAddress(String country, String city, int postalCode, String streetName){
        return String.format("Country: %s, City: %s, PostalCode: %d, StreetName: %s", country,city,postalCode,streetName);
    }

    public String createAddress(String country, String city, int postalCode, String streetName, int aptNumber){
        return String.format("Country: %s, City: %s, PostalCode: %d, StreetName: %s, AptNumber: %d", country,city,postalCode,streetName, aptNumber);
    }

}

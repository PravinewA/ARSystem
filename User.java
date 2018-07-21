package minorproject;
/**
 *
 * @author pravinewa
 */
public class User {
    
    private String vehiclenumber, companyname, ownername, vehicletype, municipality, contactnumber, registrationdate;

    public User(String vehiclenumber, String ownername, String companyname, String vehicletype, String municipality, String contactnumber, String registrationdate)
    {
        this.vehiclenumber = vehiclenumber;
        this.ownername = ownername;
        this.companyname = companyname;
        this.vehicletype = vehicletype;
        this.municipality = municipality;
        this.contactnumber = contactnumber;
        this.registrationdate = registrationdate;
    }
    public String getvehiclenumber()
    {
        return vehiclenumber;
    }
    public String getownername()
    {
        return ownername;
    }
    public String getcompanyname()
    {
        return companyname;
    }
    public String getvehicletype()
    {
        return vehicletype;
    }
    public String getmunicipality()
    {
        return municipality;
    }
    public String getcontactnumber()
    {
        return contactnumber;
    }
    public String getregistrationdate()
    {
        return registrationdate;
    }    
}

package demo.example.entity;

public class Construction_site {

  private int id;
  private String siteName;
  private int zipcode;
  private String address;

  public Construction_site(int id, String siteName, int zipcode, String address) {
    this.id = id;
    this.siteName = siteName;
    this.zipcode = zipcode;
    this.address = address;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getSiteName() {
    return siteName;
  }

  public void setSiteName(String siteName) {
    this.siteName = siteName;
  }

  public int getZipcode() {
    return zipcode;
  }

  public void setZipcode(int zipcode) {
    this.zipcode = zipcode;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }
}

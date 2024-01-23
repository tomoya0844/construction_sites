package demo.example.entity;

public class Construction_site {
  private int id;
  private String site_name;
  private Integer zipcode;
  private String address;

  public Construction_site(int id, String site_name, Integer zipcode, String address) {
    this.id = id;
    this.site_name = site_name;
    this.zipcode = zipcode;
    this.address = address;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getSite_name() {
    return site_name;
  }

  public void setSite_name(String site_name) {
    this.site_name = site_name;
  }

  public Integer getZipcode() {
    return zipcode;
  }

  public void setZipcode(Integer zipcode) {
    this.zipcode = zipcode;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }
}

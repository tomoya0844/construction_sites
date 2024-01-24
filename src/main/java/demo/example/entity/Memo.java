package demo.example.entity;

public class Memo {
  private int id;
  private int userId;
  private int siteId;

  public Memo(int id, int userId, int siteId) {
    this.id = id;
    this.userId = userId;
    this.siteId = siteId;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public int getSiteId() {
    return siteId;
  }

  public void setSiteId(int siteId) {
    this.siteId = siteId;
  }
}

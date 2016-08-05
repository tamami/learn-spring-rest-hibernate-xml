package lab.aikibo.bo;

public class SpptBoImpl implements SpptBo {
  SpptDao spptDao;

  public Sppt getSppt(String nop, String thn) {
    return spptDao.getSppt(nop, thn);
  }
}

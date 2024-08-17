public class Tv {
  private boolean _isOn = false;
  private int _currentChannel = 1;
  private int _volumeLevel = 10;

  public boolean isTvOnOff() {
    return _isOn;
  }

  public void set_isTvOnOff() {
    this._isOn = !this._isOn;
  }

  public int get_currentChannel() {
    return _currentChannel;
  }

  public void setIncreaseChannel() {
    if (this._currentChannel >= 10) return;

    this._currentChannel++;
  }

  public void setDecreaseChannel() {
    if (this._currentChannel <= 0) return;

    this._currentChannel--;
  }

  public int get_volumeLevel() {
    return _volumeLevel;
  }


  public void setIncreaseVolume() {
    if (this._volumeLevel >= 10) return;

    this._volumeLevel++;
  }

  public void setDecreaseVolume() {
    if (this._volumeLevel <= 0) return;

    this._volumeLevel--;
  }
}

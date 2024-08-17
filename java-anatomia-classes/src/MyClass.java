import java.util.Scanner;

public class MyClass {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean isRun = true;
    Tv tv = new Tv();
    OptionTv option = null;

    while (isRun) {
      System.out.print(
          "Digite uma das opções (ex: STATUS_TV, LIGAR_OU_DESLIGAR, PASSAR_CANAL, VOLTAR_CANAL, AUMENTAR_VOLUME, BAIXAR_VOLUME OU SAIR): ");
      String optionSelected = scanner.nextLine();

      for (OptionTv opt : OptionTv.values()) {
        if (opt.getOption().equalsIgnoreCase(optionSelected)) {
          option = opt;
          break;
        }
      }

      if (option == OptionTv.CLOSE) {
        scanner.close();
        isRun = false;
        return;
      }

      if (option == null) {
        System.out.println("Opção inválida.");
        scanner.close();
        return;
      }

      if (!tv.isTvOnOff() && (option != OptionTv.ON_OFF_TV && option != OptionTv.CURRENT_STATUS_TV)) {
        System.out.println("Para executar esta ação, a Tv precisa estar ligado.");
        continue;
      }

      switch (option) {
        case CURRENT_STATUS_TV:
          System.out.println(tv.isTvOnOff() ? "Tv Ligada" : "Tv Deligada");
          break;
        case ON_OFF_TV:
          tv.set_isTvOnOff();
          System.out.println(tv.isTvOnOff() ? "Tv Ligada" : "Tv Deligada");
          break;
        case CHANGE_CHANNEL_UP:
          tv.setIncreaseChannel();
          System.out.println("CANAL ATUAL: " + tv.get_currentChannel());
          break;
        case CHANGE_CHANNEL_DOWN:
          tv.setDecreaseChannel();
          System.out.println("CANAL ATUAL: " + tv.get_currentChannel());
          break;
        case VOLUME_UP:
          tv.setIncreaseVolume();
          System.out.println("VOLUME ATUAL: " + tv.get_volumeLevel());
          break;
        case VOLUME_DOWN:
          tv.setDecreaseVolume();
          System.out.println("VOLUME ATUAL: " + tv.get_volumeLevel());
          break;
        default:
          scanner.close();
          break;
      }

      option = null;
    }
  }

  public enum OptionTv {
    CURRENT_STATUS_TV("STATUS_TV"),
    ON_OFF_TV("LIGAR_OU_DESLIGAR"),
    CHANGE_CHANNEL_UP("PASSAR_CANAL"),
    CHANGE_CHANNEL_DOWN("VOLTAR_CANAL"),
    VOLUME_UP("AUMENTAR_VOLUME"),
    VOLUME_DOWN("BAIXAR_VOLUME"),
    CLOSE("SAIR");

    private final String option;

    OptionTv(String option) {
      this.option = option;
    }

    public String getOption() {
      return this.option;
    }
  }
}

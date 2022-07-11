package com.example.pertemuan1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class Nomer2Controller {
 @FXML
    private Text show;
    @FXML
    private Button satu;
    @FXML
    private Button dua;
    @FXML
    private Button tiga;
    @FXML
    private Button empat,lima,enam,tujuh,delapan,sembilan,nol,del,sama,tambah,kurang,kali,bagi;
    String hitung = "";
    int hasil = 0;
    int temp = 0;
    String doIt;


    @FXML
    protected void satu(){
       hitung += "1";
       show.setText(hitung);
    }

   public void dua(ActionEvent actionEvent) {
       hitung += "2";
       show.setText(hitung);
   }

   public void tiga(ActionEvent actionEvent) {
       hitung += "3";
       show.setText(hitung);
   }

    public void tambah(ActionEvent actionEvent) {
        show.setText("+");
        hasil = Integer.parseInt(hitung);
        temp += hasil;
        hitung = "";
        doIt = "tambah";
    }

    public void empat(ActionEvent actionEvent) {
        hitung += "4";
        show.setText(hitung);
    }

    public void lima(ActionEvent actionEvent) {
        hitung += "5";
        show.setText(hitung);
    }

    public void enam(ActionEvent actionEvent) {
        hitung += "6";
        show.setText(hitung);
    }

    public void kurang(ActionEvent actionEvent) {
        show.setText("+");
        hasil = Integer.parseInt(hitung);
        temp += hasil;
        hitung = "";
        doIt = "kurang";
    }

    public void delapan(ActionEvent actionEvent) {
        hitung += "8";
        show.setText(hitung);
    }

    public void tujuh(ActionEvent actionEvent) {
        hitung += "7";
        show.setText(hitung);
    }

    public void sembilan(ActionEvent actionEvent) {
        hitung += "9";
        show.setText(hitung);
    }

    public void kali(ActionEvent actionEvent) {
        show.setText("*");
        hasil = Integer.parseInt(hitung);
        temp *= hasil;
        hitung = "";
        doIt = "kali";
    }

    public void del(ActionEvent actionEvent) {
        hitung = "";
        show.setText(hitung);
    }

    public void nol(ActionEvent actionEvent) {
        hitung += "0";
        show.setText(hitung);
    }

    public void bagi(ActionEvent actionEvent) {
        show.setText("/");
        hasil = Integer.parseInt(hitung);
        temp /= hasil;
        hitung = "";
        doIt = "bagi";
    }

    public void sama(ActionEvent actionEvent) {
        if (doIt == "tambah") {temp += Integer.parseInt(hitung);}
        else if (doIt == "kurang") {temp -= Integer.parseInt(hitung);}
        else if (doIt == "kali") {temp *= Integer.parseInt(hitung);}
        else if (doIt == "bagi") {temp /= Integer.parseInt(hitung);}
        show.setText(String.valueOf(temp));
//        hasil = 0;
//        temp = 0;
        hitung = "";
    }
}

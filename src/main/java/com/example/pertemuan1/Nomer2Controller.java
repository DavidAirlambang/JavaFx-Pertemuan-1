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
    int temp = -9999;
    int a;
    int b;
    String operasi = "";
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
        operasi = hitung;
        operasi += "+";
        show.setText(operasi);
        if (temp != -9999){
            a = temp;
        } else {
            a = Integer.parseInt(hitung);
        }
        doIt = "tambah";
        hitung = "";
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
        operasi = hitung;
        operasi += "-";
        show.setText(operasi);
        if (temp != -9999){
            a = temp;
        } else {
            a = Integer.parseInt(hitung);
        }
        doIt = "kurang";
        hitung = "";
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
        operasi = hitung;
        operasi += "*";
        show.setText(operasi);
        if (temp != -9999){
            a = temp;
        } else {
            a = Integer.parseInt(hitung);
        }
        doIt = "kali";
        hitung = "";
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
        operasi = hitung;
        operasi += "/";
        show.setText(operasi);
        if (temp != -9999){
            a = temp;
        } else {
            a = Integer.parseInt(hitung);
        }
        doIt = "bagi";
        hitung = "";
    }

    public void sama(ActionEvent actionEvent) {
        b = Integer.parseInt(hitung);
        if (doIt == "tambah") {
            temp = a+b;
            show.setText(String.valueOf(a+b));
        } else if (doIt == "kurang"){
            temp = a-b;
            show.setText(String.valueOf(a-b));
        } else if (doIt == "kali"){
            temp = a*b;
            show.setText(String.valueOf(a*b));
        }else if (doIt == "bagi"){
            temp = a/b;
            show.setText(String.valueOf(a/b));
        }
        hitung = "";
    }
}

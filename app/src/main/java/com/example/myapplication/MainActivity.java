package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // 1. Değişken tanımlamaları
    private EditText etAdSoyad, etKullaniciAdi;
    private Button btnKayitOl, btnGirisYap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 2. XML elemanlarını Java'ya bağlama
        etAdSoyad = findViewById(R.id.etAdSoyad);
        etKullaniciAdi = findViewById(R.id.etKullaniciAdi);
        btnKayitOl = findViewById(R.id.btnKayitOl);
        btnGirisYap = findViewById(R.id.btnGirisYap);

        // 3. Kayıt Ol buton tıklaması
        btnKayitOl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String isim = etAdSoyad.getText().toString().trim();
                Toast.makeText(MainActivity.this, "Kayıt alındı: " + isim, Toast.LENGTH_SHORT).show();
            }
        });

        // 4. Giriş Yap buton tıklaması
        btnGirisYap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String kAdi = etKullaniciAdi.getText().toString().trim();
                Toast.makeText(MainActivity.this, "Giriş yapıldı: " + kAdi, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
package com.dycode.edu.tugas_3;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.FrameLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.frame_container)
    FrameLayout frameContainer;
    @BindView(R.id.btn_produk)
    Button btnProduk;
    @BindView(R.id.btn_transaksi)
    Button btnTransaksi;
    @BindView(R.id.btn_akun)
    Button btnAkun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();

        fragmentTransaction.add(R.id. frame_container , new FirstFragment());
        fragmentTransaction.add(R.id. frame_container , new SecondFragment());
        fragmentTransaction.add(R.id. frame_container , new ThirdFragment());
        fragmentTransaction.commit();
    }

    @OnClick(R.id. btn_produk )
    public void onBtnProdukClicked() {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id. frame_container , new FirstFragment());
        fragmentTransaction.commit();
    }
    @OnClick(R.id. btn_transaksi )
    public void onBtnTransaksiClicked() {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.frame_container, new SecondFragment());
        fragmentTransaction.commit();
    }
    @OnClick(R.id. btn_akun )
    public void onBtnAkunClicked() {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.frame_container, new ThirdFragment());
        fragmentTransaction.commit();
    }
}

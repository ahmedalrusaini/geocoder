package com.tester.ahmedalrusaini.apptester;
import android.location.Address;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.location.Geocoder;
import android.widget.TextView;
import java.io.IOException;
import java.util.List;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView lbl=findViewById(R.id.id);
        try {
            List city = new Geocoder(this).getFromLocation(50,50,1);
            Address address= (Address) city.get(0);
            String Country = address.getCountryName();
            lbl.setText(Country);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
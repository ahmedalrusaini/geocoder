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
            List list = new Geocoder(this).getFromLocation(26.35806861,43.98718053,1);
            Address address= (Address) list.get(0);

            String stringLocation = "";

            String getCountryName = address.getCountryName();
            String getCountryCode = address.getCountryCode();

            String getAdminArea = address.getAdminArea();
            String getSubAdminArea = address.getSubAdminArea();

            String getLocality = address.getLocality();
            String getSubLocality = address.getSubLocality();

            String getThoroughfare = address.getThoroughfare();
            String getSubThoroughfare = address.getSubThoroughfare();

            String getAddressLine = address.getAddressLine(0);

            String getFeatureName = address.getFeatureName();
            String getPremises = address.getPremises();

            String getPhone = address.getPhone();
            String getPostalCode = address.getPostalCode();

            String getUrl = address.getUrl();

            stringLocation += "getCountryName:" + getCountryName + "\n";
            stringLocation += "getCountryCode:" + getCountryCode + "\n";
            stringLocation += "getAdminArea:" + getAdminArea + "\n";
            stringLocation += "getSubAdminArea:" + getSubAdminArea + "\n";
            stringLocation += "getLocality:" + getLocality + "\n";
            stringLocation += "getSubLocality:" + getSubLocality + "\n";
            stringLocation += "getThoroughfare:" + getThoroughfare + "\n";
            stringLocation += "getSubThoroughfare:" + getSubThoroughfare + "\n";
            stringLocation += "getAddressLine:" + getAddressLine + "\n";
            stringLocation += "getFeatureName:" + getFeatureName + "\n";
            stringLocation += "getPremises:" + getPremises + "\n";
            stringLocation += "getPhone:" + getPhone + "\n";
            stringLocation += "getPostalCode:" + getPostalCode + "\n";
            stringLocation += "getUrl:" + getUrl + "\n";

            lbl.setText(stringLocation);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
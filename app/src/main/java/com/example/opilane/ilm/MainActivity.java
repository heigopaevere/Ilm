package com.example.opilane.ilm;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    TextView city_field, updated_field, weather_icon, current_temperature_field, details_field, humidity_field,
            pressure_field;

    Typeface weatherFont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        weatherFont=Typeface.createFromAsset(getApplicationContext().getAssets(),
                "fonts/weathericons-regular-webfont.ttf");

        city_field = findViewById(R.id.city_field);
        updated_field = findViewById(R.id.updated_field);
        weather_icon = findViewById(R.id.weather_icon);
        current_temperature_field = findViewById(R.id.current_temperature_field);
        details_field = findViewById(R.id.details_field);
        humidity_field = findViewById(R.id.humidity_field);
        pressure_field = findViewById(R.id.pressure_field);
        weather_icon = findViewById(R.id.weather_icon);
        weather_icon.setTypeface(weatherFont);

        function.placeIdTask asyncTask = new function.placeIdTask(new function.AsyncResponse() {
            @Override
            public void processFinish(String weather_city, String weather_description, String weather_temperature,
                                      String weather_humidity, String weather_pressure, String weather_updateOn,
                                      String weather_iconText, String sun_rise) {

                city_field.setText(weather_city);
                updated_field.setText(weather_updateOn);
                details_field.setText(weather_description);
                current_temperature_field.setText(weather_temperature);
                humidity_field.setText("Niiskus: " + weather_humidity);
                pressure_field.setText("Õhurõhk: " +weather_pressure);
                weather_icon.setText(Html.fromHtml(weather_iconText));
            }
        });
        asyncTask.execute("59.4369", "24.7535");
    }
}

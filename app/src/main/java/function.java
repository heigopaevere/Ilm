import android.os.AsyncTask;

import org.json.JSONObject;

import java.util.Date;

/**
 * Created by opilane on 26.04.2018.
 */

public class function {

    private static final String OPEN_WEATHER_MAP_URL ="api.openweathermap.org/data/2.5/weather?lat=%s&lon=%s&units=metric";
    private static final String OPEN_WEATHER_MAP_API ="d72d5911e6cca9ae23ad8d1c27adfa6a";

    private static String setWeatherIcon(int actualId, long sunrise, long sunset){
        int id = actualId /100;
        String icon = "";
        if (actualId == 800){
            long currentTime = new Date().getTime();
            icon = "&#xf00d;";
        }
        else {
            icon = "&#xf02e;";


        }
        else {
            switch (id){
                case 2 : icon = "&#xf01e;";
                    break;
                case 3 : icon = "&#xf01c;";
                    break;
                case 5 : icon = "&#xf019;";
                    break;
                case 6 : icon = "&#xf01b;";
                    break;
                case 7 : icon = "&#xf014;";
                    break;
                case 8 : icon = "&#xf013;";
            }
        }
        return icon;
    }
    public interface AsyncResponse{
        void processFinish(String output1, String output2, String output3, String output4,
                           String output5, String output6, String output7, String output8);
    }
    private static class placeIdTask extends AsyncTask<String, Void, JSONObject>{

        public AsyncResponse delegate = null;
        public placeIdTask (AsyncResponse asyncResponse){
            delegate = asyncResponse;
        }

        @Override
        protected JSONObject doInBackground(String... params) {
            JSONObject jsonObject = null;
            try {
                jsonWeather = getWea
            }
        }
    }
}

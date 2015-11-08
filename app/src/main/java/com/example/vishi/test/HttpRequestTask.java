package com.example.vishi.test;
import android.os.AsyncTask;
import android.util.Log;

import org.springframework.http.HttpMethod;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;
/**
 * Created by vishi on 11/8/15.
 */

public class HttpRequestTask extends AsyncTask<Void, Void, MyPojo> {
    public Asynchtask delegate = null;
    @Override
    protected MyPojo doInBackground(Void... params) {
        try {
            final String url = "http://192.168.0.200:8989/transfer?senderId=8454534776&receiverId=8454534777&fAmt=4998177";
            RestTemplate restTemplate = new RestTemplate();
            restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());

            MyPojo transfer = restTemplate.getForObject(url, MyPojo.class);
            Log.v("transfer", transfer.toString());
            return transfer;
        } catch (Exception e) {
            Log.e("MainActivity", e.getMessage(), e);
        }

        return null;
    }

    @Override
    protected void onPostExecute(MyPojo transfer) {
        delegate.processFinish(transfer);
        //TextView greetingIdText = (TextView) findViewById(R.id.id_value);
        //TextView greetingContentText = (TextView) findViewById(R.id.content_value);
        //greetingIdText.setText(greeting.getId());
        //greetingContentText.setText(greeting.getContent());
    }

}
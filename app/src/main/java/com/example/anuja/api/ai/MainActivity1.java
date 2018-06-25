//package com.example.anuja.api.ai;
//
//import android.Manifest;
//import android.content.pm.PackageManager;
//import android.support.v4.app.ActivityCompat;
//import android.support.v4.content.ContextCompat;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.util.Log;
//import android.view.View;
//import android.widget.TextView;
//
//import ai.api.AIListener;
//import ai.api.android.AIConfiguration;
//import ai.api.android.AIService;
//import ai.api.model.AIError;
//import ai.api.model.AIResponse;
//import ai.api.model.Result;
//
//import ai.api.AIListener;
//
//public class MainActivity extends AppCompatActivity implements AIListener {
//    AIService aiService;
//    TextView t;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        t= (TextView) findViewById(R.id.textView);
//        int permission = ContextCompat.checkSelfPermission(this,
//                Manifest.permission.RECORD_AUDIO);
//
//        if (permission != PackageManager.PERMISSION_GRANTED) {
//
//            makeRequest();
//        }
//        final AIConfiguration config = new AIConfiguration("2d662fabb6cb4e33bcbe3b9cfd2976d2",
//                AIConfiguration.SupportedLanguages.English,
//                AIConfiguration.RecognitionEngine.System);
//        aiService = AIService.getService(this, config);
//        aiService.setListener(this);
//    }
//
//    protected void makeRequest() {
//        ActivityCompat.requestPermissions(this,
//                new String[]{Manifest.permission.RECORD_AUDIO},
//                101);
//    }
//
//    @Override
//    public void onRequestPermissionsResult(int requestCode,
//                                           String permissions[], int[] grantResults) {
//        switch (requestCode) {
//            case 101: {
//
//                if (grantResults.length == 0
//                        || grantResults[0] !=
//                        PackageManager.PERMISSION_GRANTED) {
//
//
//                } else {
//
//                }
//                return;
//            }
//        }
//    }
//
//
//    public void buttonClicked(View view){
//        aiService.startListening();
//    }
//
//    @Override
//    public void onResult(AIResponse result) {
//
//        Log.d("anu",result.toString());
//        Result result1=result.getResult();
//        String message = result1.getFulfillment().getSpeech();
//        System.out.println("----------------------------------"+message);
//        t.setText("Query "+result1.getResolvedQuery()+" action: "+message);
//
//
//    }
//
//    @Override
//    public void onError(AIError error) {
//
//    }
//
//    @Override
//    public void onAudioLevel(float level) {
//
//    }
//
//    @Override
//    public void onListeningStarted() {
//
//    }
//
//    @Override
//    public void onListeningCanceled() {
//
//    }
//
//    @Override
//    public void onListeningFinished() {
//
//    }
//}
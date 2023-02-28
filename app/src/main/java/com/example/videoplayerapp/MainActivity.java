/**
Section 15

video no 125 to 128

Changes xml, java, Manifest, res->rawFolfer
*/

/**

 1)Request for permission to access internet -- using Manifest in android studio

 2) in xml create 2 video view widget  to play video

 3) in java
    one we create for local storage
    one we create from internet (online)
       for this we need permission from internet that permission we get from Manifest
           like we have to write code for that in Manifest

*/
package com.example.videoplayerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.UriMatcher;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
   VideoView vv1,vv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vv1=findViewById(R.id.videoView);
        vv2=findViewById(R.id.videoView2);

        // from local storage
        // this is the path syntex when we want to fetch video from local storage
        vv1.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.one_kiss);
        // this is the class which will show button like stop play fast forward etc etc
        // no need to create expitly
        MediaController mc =new MediaController(this);
        mc.setAnchorView(vv1);
        vv1.setMediaController(mc);


        // From internet
        // here wr are specifying the path for the link
        Uri uri=Uri.parse("https://static.videezy.com/system/resources/previews/000/002/231/original/5226496.mp4");
        // pass the uri to video view
        vv2.setVideoURI(uri);

        MediaController mc2 =new MediaController(this);
        mc2.setAnchorView(vv2);
        vv2.setMediaController(mc2);



    }
}
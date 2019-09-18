package com.akarshan.whatsapp;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    private Toolbar mToolbar;
    private ViewPager myViewPager;
    private TabLayout myTabLayout;
    private TabsAccessAdapter mytabsAccessAdapter;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToolbar= (Toolbar) findViewById(R.id.main_page_toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("WhatsApp");/**jo title set krenge wahi title aayega actionBar pr**/

        myViewPager= (ViewPager) findViewById(R.id.main_tab_pager);
        mytabsAccessAdapter=new TabsAccessAdapter(getSupportFragmentManager());
        myViewPager.setAdapter(mytabsAccessAdapter);
        myTabLayout= (TabLayout) findViewById(R.id.main_tab);
        myTabLayout.setupWithViewPager(myViewPager);


    }
}

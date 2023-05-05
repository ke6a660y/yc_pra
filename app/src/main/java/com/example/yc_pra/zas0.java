package com.example.yc_pra;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;

public class zas0 extends AppCompatActivity {

    ViewPager onBoardListElement;
    TextView next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zas0);

        onBoardListElement = findViewById(R.id.viewPager);
        next = findViewById(R.id.btnSkip);
        ScrollingPagerIndicator indicator = findViewById(R.id.indicator);

        Zas fragment1 = new Zas().newInstance(R.drawable.illustration);
        Zas2 fragment2 = new Zas2().newInstance(R.drawable.rr);
        zas3 fragment3 = new zas3().newInstance(R.drawable.tt);

        List<Fragment> onBoardList = new ArrayList<>();
        onBoardList.add(fragment1);
        onBoardList.add(fragment2);
        onBoardList.add(fragment3);

        zas0Adapter adapter = new zas0Adapter(getSupportFragmentManager(), onBoardList);
        onBoardListElement.setAdapter(adapter);
        indicator.attachToPager(onBoardListElement);
        onBoardListElement.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if(onBoardListElement.getCurrentItem() == 2) {
                    next.setText("Завершить");
                } else {
                    next.setText("Пропустить");
                }
            }

            @Override
            public void onPageSelected(int position) {
                if(position == 2) {
                    next.setText("Завершить");
                } else {
                    next.setText("Пропустить");
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                if(onBoardListElement.getCurrentItem() == 2) {
                    next.setText("Завершить");
                } else {
                    next.setText("Пропустить");
                }
            }
        });
        next.setOnClickListener(v -> {
            nextBtn(onBoardListElement.getCurrentItem());
        });

    }

    public void nextBtn(int position) {
        if(position == 2) {
            Intent auth = new Intent(this, vhod.class);
            startActivity(auth);
            finish();
        }
        onBoardListElement.beginFakeDrag();
        onBoardListElement.fakeDragBy(-800f);
        onBoardListElement.endFakeDrag();
    }

}
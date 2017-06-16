package com.groupon.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.groupon.R;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshListView;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity extends Activity {

    //mainActivity的顶部标题栏
    @BindView(R.id.tv_city)
    TextView tvCity;
    @BindView(R.id.img_down)
    ImageView imgDown;
    @BindView(R.id.linear_main_city)
    LinearLayout linearMainCity;
    @BindView(R.id.linear_main_search)
    LinearLayout linearMainSearch;
    @BindView(R.id.img_main_menu)
    ImageView imgMainMenu;

    //mainActivity的中部列表
    @BindView(R.id.rtrf_listView)
    PullToRefreshListView rtrfListView;
    //mainActivity的底部RadioGroup
    @BindView(R.id.radio_group)
    RadioGroup radioGroup;

    private ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
//        rtrfListView.addView();
//        initListView();
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton button = (RadioButton) group.findViewById(checkedId);

            }
        });
    }

    private void initListView() {
        list = rtrfListView.getRefreshableView();
        rtrfListView.setOnRefreshListener(new PullToRefreshBase.OnRefreshListener<ListView>() {
            @Override
            public void onRefresh(PullToRefreshBase<ListView> refreshView) {
//                adapter.;
                notifyAll();
                rtrfListView.onRefreshComplete();
            }
        });
    }
}

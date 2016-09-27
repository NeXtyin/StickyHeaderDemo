package cn.sadhu.stickyheaderdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<AppInfoBean> mDatas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_sticky_header);
        initDatas();

        RecyclerView StickRecyclerView = (RecyclerView) findViewById(R.id.stickRecyclerView);
        StickRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        StickyHeaderDecoraton stickHeaderDecoraton = new StickyHeaderDecoraton(48, this);
        stickHeaderDecoraton.setDatas(mDatas);
        StickRecyclerView.addItemDecoration(stickHeaderDecoraton);
        StickRecyclerView.setAdapter(new StickHeaderAdapter(mDatas));
    }


    private void initDatas() {

        mDatas = new ArrayList<>();
        String tag = "为您推荐";
        mDatas.add(DataUtil.generateAppInfo(tag));


        tag = "GooleApp";
        mDatas.add(DataUtil.generateAppInfo(tag));


        tag = "广告";
        mDatas.add(DataUtil.generateAppInfo(tag));
        mDatas.add(DataUtil.generateAppInfo(tag));
        mDatas.add(DataUtil.generateAppInfo(tag));
        mDatas.add(DataUtil.generateAppInfo(tag));
        mDatas.add(DataUtil.generateAppInfo(tag));
        mDatas.add(DataUtil.generateAppInfo(tag));
        mDatas.add(DataUtil.generateAppInfo(tag));
        mDatas.add(DataUtil.generateAppInfo(tag));
        mDatas.add(DataUtil.generateAppInfo(tag));

        tag = "豌豆荚推荐A";
        mDatas.add(DataUtil.generateAppInfo(tag));
        mDatas.add(DataUtil.generateAppInfo(tag));
        mDatas.add(DataUtil.generateAppInfo(tag));
        mDatas.add(DataUtil.generateAppInfo(tag));
        mDatas.add(DataUtil.generateAppInfo(tag));
        mDatas.add(DataUtil.generateAppInfo(tag));


        tag = "广告AD1";
        mDatas.add(DataUtil.generateAppInfo(tag));
        mDatas.add(DataUtil.generateAppInfo(tag));
        mDatas.add(DataUtil.generateAppInfo(tag));
        mDatas.add(DataUtil.generateAppInfo(tag));
        mDatas.add(DataUtil.generateAppInfo(tag));
        mDatas.add(DataUtil.generateAppInfo(tag));
        mDatas.add(DataUtil.generateAppInfo(tag));
        mDatas.add(DataUtil.generateAppInfo(tag));
        mDatas.add(DataUtil.generateAppInfo(tag));
        mDatas.add(DataUtil.generateAppInfo(tag));

    }
}

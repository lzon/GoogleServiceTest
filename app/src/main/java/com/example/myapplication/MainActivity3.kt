package com.example.myapplication

import android.media.metrics.Event
import android.os.Build
import android.os.Bundle
import android.util.EventLog
import android.view.MotionEvent
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.bin.david.form.core.SmartTable
import com.blankj.utilcode.util.LogUtils
import com.scwang.smartrefresh.layout.api.RefreshLayout
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener
import com.scwang.smartrefresh.layout.listener.OnRefreshListener


class MainActivity3 : AppCompatActivity(), OnRefreshListener, OnLoadMoreListener {
    private var table: SmartTable<PM25>? = null
    private lateinit var refreshLayout: RefreshLayout
    private var list = ArrayList<PM25>()

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        table = findViewById(R.id.table);
        refreshLayout = findViewById(R.id.refreshLayout);


        refreshLayout.setOnRefreshListener(this);
        refreshLayout.setOnLoadMoreListener(this);
        getData(false)

        table?.setOnScrollChangeListener { v, scrollX, scrollY, oldScrollX, oldScrollY ->
            LogUtils.w("=========${scrollY}")
        }
        refreshLayout.setEnableRefresh(false)
        refreshLayout.setEnableLoadMore(false)
        /*table?.matrixHelper?.setOnInterceptListener { event, distanceX, distanceY ->
                when (event.action) {
                    MotionEvent.ACTION_DOWN->{
                        table?.parent?.requestDisallowInterceptTouchEvent(true)
                        true
                }
            }
            super.dispatchTouchEvent(event);
        }*/
    }

    override fun onRefresh(refreshLayout: RefreshLayout) {
        list.clear()
        table!!.postDelayed(Runnable {
            for (i in 0..10) {
                var pM25 = PM25()
                list.add(pM25)
            }
            refreshLayout.finishRefresh(true)
        }, 2000)
    }

    override fun onLoadMore(refreshLayout: RefreshLayout) {
        table!!.postDelayed(Runnable {
            table!!.addData(list, true)
            refreshLayout.finishLoadMore()
        }, 3000)

    }

    fun getData(isFoot: Boolean) {


        for (i in 0..50) {
            var pM25 = PM25()
            list.add(pM25)
        }


        table!!.setData(list)


    }
}
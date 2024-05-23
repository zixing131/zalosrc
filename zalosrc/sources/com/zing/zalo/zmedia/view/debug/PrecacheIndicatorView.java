package com.zing.zalo.zmedia.view.debug;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zmedia.view.C17391z;
import com.zing.zalo.zmedia.view.ZVideoView;
import com.zing.zalo.zmedia.view.debug.PrecacheIndicatorView;
import java.util.ArrayList;
import java.util.List;
import ql0.C25325b;

/* loaded from: classes7.dex */
public class PrecacheIndicatorView extends View {

    /* renamed from: p */
    List f88495p;

    /* renamed from: q */
    ZVideoView f88496q;

    /* renamed from: r */
    C17391z f88497r;

    /* renamed from: s */
    C25325b f88498s;

    /* renamed from: t */
    Handler f88499t;

    /* renamed from: u */
    Thread f88500u;

    /* renamed from: v */
    boolean f88501v;

    public PrecacheIndicatorView(Context context, C17391z c17391z, ZVideoView zVideoView) {
        super(context);
        this.f88500u = null;
        this.f88501v = false;
        this.f88496q = zVideoView;
        this.f88497r = c17391z;
        this.f88498s = new C25325b(context);
        this.f88499t = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m92483d(List list) {
        if (!list.isEmpty()) {
            this.f88495p = list;
        } else {
            this.f88495p = null;
        }
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m92484e() {
        List<ZMediaPlayer.CacheItem> cacheDetails;
        while (!this.f88501v) {
            try {
                final ArrayList arrayList = new ArrayList();
                C17391z c17391z = this.f88497r;
                if (c17391z != null && (cacheDetails = ZMediaPlayer.getCacheDetails(c17391z.f88618a)) != null) {
                    arrayList.addAll(cacheDetails);
                }
                this.f88499t.post(new Runnable() { // from class: ql0.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        PrecacheIndicatorView.this.m92483d(arrayList);
                    }
                });
                try {
                    Thread.sleep(200L);
                } catch (InterruptedException e11) {
                    e11.printStackTrace();
                }
            } catch (Exception e12) {
                e12.printStackTrace();
                return;
            }
        }
    }

    /* renamed from: c */
    void m92485c() {
        if (this.f88500u == null) {
            Thread thread = new Thread(new Runnable() { // from class: ql0.c
                @Override // java.lang.Runnable
                public final void run() {
                    PrecacheIndicatorView.this.m92484e();
                }
            });
            this.f88500u = thread;
            thread.start();
        }
    }

    /* renamed from: f */
    public void m92486f() {
        this.f88501v = true;
        this.f88500u = null;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        long j11;
        super.onDraw(canvas);
        if (this.f88498s != null) {
            ZVideoView zVideoView = this.f88496q;
            long j12 = 0;
            if (zVideoView != null) {
                j11 = zVideoView.getCurrentPosition();
            } else {
                j11 = 0;
            }
            ZVideoView zVideoView2 = this.f88496q;
            if (zVideoView2 != null) {
                j12 = zVideoView2.getDuration();
            }
            this.f88498s.m131162a(canvas, this.f88495p, j11, j12);
        }
    }

    public void setVideo(C17391z c17391z) {
        if (ZMediaPlayerSettings.IS_SHOW_DEBUG_INFO_VIEW) {
            this.f88497r = c17391z;
            this.f88498s = new C25325b(getContext());
            this.f88501v = false;
            m92485c();
        }
    }
}

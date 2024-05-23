package com.zing.zalo.uicontrol;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.zmedia.view.C17391z;
import com.zing.zalo.zmedia.view.VideoController;
import com.zing.zalo.zmedia.view.ZVideoView;
import hf0.AbstractC20049k;
import hf0.C20044f;
import me0.AbstractC23136l9;
import vg.C28075g8;
import zl0.AbstractC32232i;

/* loaded from: classes4.dex */
public class MiniVideoLayout extends FrameLayout {

    /* renamed from: B */
    static final int f83237B = AbstractC23136l9.m118742r(180.0f);

    /* renamed from: A */
    VideoController f83238A;

    /* renamed from: p */
    boolean f83239p;

    /* renamed from: q */
    boolean f83240q;

    /* renamed from: r */
    int f83241r;

    /* renamed from: s */
    int f83242s;

    /* renamed from: t */
    int f83243t;

    /* renamed from: u */
    int f83244u;

    /* renamed from: v */
    int f83245v;

    /* renamed from: w */
    ZVideoView f83246w;

    /* renamed from: x */
    C17391z f83247x;

    /* renamed from: y */
    int f83248y;

    /* renamed from: z */
    int f83249z;

    public MiniVideoLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m87767b(View view) {
        C20044f.m104040a().m104041b();
    }

    /* renamed from: c */
    public void m87768c() {
        ZVideoView zVideoView = this.f83246w;
        if (zVideoView != null) {
            zVideoView.m92429s0();
            this.f83246w.m92412f0(true);
        }
        if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f83248y, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f83249z, 1073741824));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 0 && !this.f83239p) {
            this.f83239p = true;
            this.f83241r = motionEvent.getPointerId(0);
            this.f83242s = (int) motionEvent.getRawX();
            this.f83243t = (int) motionEvent.getRawY();
            this.f83244u = (int) getTranslationX();
            this.f83245v = (int) getTranslationY();
        } else if (motionEvent != null && motionEvent.getAction() == 2 && this.f83241r == motionEvent.getPointerId(0)) {
            int rawX = (int) (motionEvent.getRawX() - this.f83242s);
            int rawY = (int) (motionEvent.getRawY() - this.f83243t);
            if (this.f83239p && !this.f83240q && (Math.abs(rawX) >= AbstractC32232i.m155454b(0.4f, true) || Math.abs(rawY) >= AbstractC32232i.m155454b(0.4f, false))) {
                this.f83239p = false;
                this.f83240q = true;
                this.f83242s = (int) motionEvent.getRawX();
                this.f83243t = (int) motionEvent.getRawY();
            } else if (this.f83240q) {
                setTranslationX(this.f83244u + rawX);
                setTranslationY(this.f83245v + rawY);
            }
        } else if (motionEvent == null || motionEvent.getAction() == 1 || motionEvent.getAction() == 3 || motionEvent.getAction() == 6) {
            this.f83240q = false;
        }
        return this.f83240q;
    }

    public void setVideoData(C17391z c17391z) {
        this.f83247x = c17391z;
        if (c17391z != null) {
            int i11 = f83237B;
            this.f83249z = i11;
            this.f83248y = i11;
            float f11 = c17391z.f88626i;
            if (f11 > 0.0f) {
                this.f83249z = (int) (i11 / f11);
            }
            requestLayout();
            this.f83246w.setZVideo(c17391z);
            AbstractC20049k.m104116j(this.f83246w, c17391z, 0, c17391z.f88618a);
        }
    }

    public MiniVideoLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(AbstractC7409c0.layout_mini_player, this);
        ZVideoView zVideoView = (ZVideoView) findViewById(AbstractC6918a0.zvideo_view);
        this.f83246w = zVideoView;
        zVideoView.setForceHideController(false);
        this.f83246w.setLooping(true);
        this.f83246w.setRoundCorner(true);
        this.f83246w.setUseVideoRatio(false);
        this.f83246w.setVideoPlayerMode(2);
        this.f83246w.setAudioFocusControl(C28075g8.m141538e());
        VideoController videoController = this.f83246w.getVideoController();
        this.f83238A = videoController;
        videoController.f88210s.m92516i(new View.OnClickListener() { // from class: com.zing.zalo.uicontrol.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MiniVideoLayout.m87767b(view);
            }
        });
        this.f83238A.setOnFullScreenClickListener(AbstractC23136l9.f112240a);
    }
}

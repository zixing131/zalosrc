package com.zing.zalo.videoplayer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.uicontrol.draggableview.DraggableView;
import com.zing.zalo.videoplayer.DraggableVideoView;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import com.zing.zalo.zmedia.view.ZVideoView;
import me0.AbstractC23136l9;

/* loaded from: classes5.dex */
public class DraggableVideoView extends DraggableView {

    /* renamed from: i0 */
    ViewGroup f85174i0;

    /* renamed from: j0 */
    ZVideoView f85175j0;

    /* renamed from: k0 */
    boolean f85176k0;

    public DraggableVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f85176k0 = true;
        m89622E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public /* synthetic */ void m89620F(IMediaPlayer iMediaPlayer, int i11, int i12, int i13, int i14) {
        if (i11 > 0 && i12 > 0) {
            this.f85175j0.setVideoRatio(i11 / i12);
            m89623H();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public /* synthetic */ void m89621G() {
        float f11;
        try {
            float width = this.f85174i0.getWidth();
            float height = this.f85174i0.getHeight();
            float f12 = width / height;
            float m118731n0 = AbstractC23136l9.m118731n0(getContext()) / 2;
            float m118719j0 = AbstractC23136l9.m118719j0(getContext()) / 4;
            if (f12 < m118731n0 / m118719j0) {
                f11 = m118719j0 / height;
            } else {
                f11 = m118731n0 / width;
            }
            setMinimizeScale(f11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: E */
    void m89622E() {
        LayoutInflater.from(getContext()).inflate(AbstractC7409c0.draggable_video_view, (ViewGroup) this, true);
        ViewGroup viewGroup = (ViewGroup) findViewById(AbstractC6918a0.container);
        this.f85174i0 = viewGroup;
        viewGroup.setId(getDragViewId());
        m89624I();
        ZVideoView zVideoView = (ZVideoView) this.f85174i0.findViewById(AbstractC6918a0.videoView);
        this.f85175j0 = zVideoView;
        zVideoView.setIsFocusing(true);
        this.f85175j0.setOnVideoSizeChangedListener(new IMediaPlayer.OnVideoSizeChangedListener() { // from class: hf0.d
            @Override // com.zing.zalo.zmedia.player.IMediaPlayer.OnVideoSizeChangedListener
            public final void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i11, int i12, int i13, int i14) {
                DraggableVideoView.this.m89620F(iMediaPlayer, i11, i12, i13, i14);
            }
        });
    }

    /* renamed from: H */
    public void m89623H() {
        m88295A();
        this.f85174i0.requestLayout();
        m88316z();
        m89624I();
    }

    /* renamed from: I */
    public void m89624I() {
        this.f85174i0.post(new Runnable() { // from class: hf0.c
            @Override // java.lang.Runnable
            public final void run() {
                DraggableVideoView.this.m89621G();
            }
        });
    }

    public View getDragView() {
        return this.f85174i0;
    }

    public ZVideoView getVideoView() {
        return this.f85175j0;
    }

    @Override // com.zing.zalo.uicontrol.draggableview.DraggableView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        boolean z11 = true;
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                this.f85176k0 = true;
            }
        } else {
            ZVideoView zVideoView = this.f85175j0;
            if (zVideoView == null || !zVideoView.m92400F(motionEvent)) {
                z11 = false;
            }
            this.f85176k0 = z11;
        }
        if (!this.f85176k0) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}

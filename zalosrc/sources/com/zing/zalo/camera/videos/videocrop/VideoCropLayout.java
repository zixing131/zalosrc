package com.zing.zalo.camera.videos.videocrop;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import cf.C3451b;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.camera.videos.customviews.AbstractC7767a;
import com.zing.zalo.camera.videos.customviews.VideoSeekBarView;
import com.zing.zalo.camera.videos.customviews.VideoTimelineView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.uicontrol.SmoothScrollLinearLayoutManager;
import h40.AbstractC19849s1;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.AbstractC23222t7;
import p649xl.C29937n1;
import p679yf.C30923c;

/* loaded from: classes3.dex */
public class VideoCropLayout extends FrameLayout {

    /* renamed from: p */
    List f41726p;

    /* renamed from: q */
    Rect f41727q;

    /* renamed from: r */
    private VideoTimelineView f41728r;

    /* renamed from: s */
    private VideoSeekBarView f41729s;

    /* renamed from: t */
    private InterfaceC7776c f41730t;

    /* renamed from: u */
    private C29937n1 f41731u;

    /* renamed from: v */
    public int f41732v;

    /* renamed from: w */
    public float f41733w;

    /* renamed from: x */
    public float f41734x;

    /* renamed from: y */
    AbstractC7767a f41735y;

    /* renamed from: com.zing.zalo.camera.videos.videocrop.VideoCropLayout$a */
    /* loaded from: classes3.dex */
    class C7774a extends RecyclerView.AbstractC1892s {
        C7774a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            try {
                super.mo952b(recyclerView, i11);
                if (i11 == 0 && VideoCropLayout.this.f41730t != null) {
                    VideoCropLayout.this.f41730t.mo39158a(false, false, false);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            try {
                super.mo10176d(recyclerView, i11, i12);
                if (i11 != 0 && VideoCropLayout.this.f41730t != null) {
                    VideoCropLayout.this.f41730t.mo39158a(false, true, false);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.camera.videos.videocrop.VideoCropLayout$b */
    /* loaded from: classes3.dex */
    class C7775b extends AbstractC7767a {
        C7775b() {
        }

        @Override // com.zing.zalo.camera.videos.customviews.AbstractC7767a
        /* renamed from: c */
        public void mo39609c(boolean z11, boolean z12) {
            if (VideoCropLayout.this.f41730t != null) {
                VideoCropLayout.this.f41730t.mo39158a(!z11, false, z12);
            }
        }

        @Override // com.zing.zalo.camera.videos.customviews.AbstractC7767a
        /* renamed from: d */
        public void mo39610d(float f11) {
            if (VideoCropLayout.this.f41730t != null) {
                VideoCropLayout.this.f41730t.mo39158a(false, true, false);
            }
        }

        @Override // com.zing.zalo.camera.videos.customviews.AbstractC7767a
        /* renamed from: e */
        public void mo39611e(float f11) {
            if (VideoCropLayout.this.f41730t != null) {
                VideoCropLayout.this.f41730t.mo39158a(true, true, false);
            }
        }

        @Override // com.zing.zalo.camera.videos.customviews.AbstractC7767a
        /* renamed from: f */
        public void mo39612f(float f11) {
            if (VideoCropLayout.this.f41730t != null) {
                VideoCropLayout.this.f41730t.mo39158a(false, true, true);
            }
        }
    }

    /* renamed from: com.zing.zalo.camera.videos.videocrop.VideoCropLayout$c */
    /* loaded from: classes3.dex */
    public interface InterfaceC7776c {
        /* renamed from: a */
        void mo39158a(boolean z11, boolean z12, boolean z13);
    }

    public VideoCropLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41726p = new ArrayList();
        this.f41727q = new Rect();
        this.f41732v = 0;
        this.f41733w = 0.0f;
        this.f41734x = 1.0f;
        this.f41735y = new C7775b();
    }

    /* renamed from: b */
    public void m39614b(boolean z11) {
        if (z11 && (this.f41728r.getLayoutManager() instanceof SmoothScrollLinearLayoutManager)) {
            ((SmoothScrollLinearLayoutManager) this.f41728r.getLayoutManager()).m88006O2(true);
        }
        this.f41729s.setDisableTouch(false);
    }

    /* renamed from: c */
    public void m39615c(int i11, int i12, int i13) {
        if (this.f41729s == null) {
            VideoSeekBarView videoSeekBarView = new VideoSeekBarView(getContext());
            this.f41729s = videoSeekBarView;
            videoSeekBarView.setId(AbstractC6918a0.editor_video_seek_bar_view);
            this.f41729s.m39578c(AbstractC23222t7.f112582r, AbstractC23222t7.f112558f, AbstractC23222t7.f112528I, AbstractC23222t7.f112566j, AbstractC23222t7.f112556e);
            this.f41729s.setVideoSeekBarListener(this.f41735y);
            this.f41729s.setDisableTouch(true);
            if (i12 < i13) {
                this.f41729s.setMinProgress((i12 * 1.0f) / i13);
            } else {
                this.f41729s.setMinProgress(1.0f);
            }
            if (i11 < i13) {
                this.f41729s.setMaxProgress((i11 * 1.0f) / i13);
            } else {
                this.f41729s.setMaxProgress(1.0f);
            }
            this.f41731u.f138745q.addView(this.f41729s, new FrameLayout.LayoutParams(-1, -1, 80));
        }
    }

    /* renamed from: d */
    public void m39616d(String str, int i11, boolean z11) {
        if (this.f41728r == null) {
            Context context = getContext();
            VideoTimelineView videoTimelineView = new VideoTimelineView(context);
            this.f41728r = videoTimelineView;
            videoTimelineView.setId(AbstractC6918a0.editor_video_timeline_view);
            this.f41728r.m39597k2(context, str, i11, z11);
            if (this.f41728r.getLayoutManager() instanceof SmoothScrollLinearLayoutManager) {
                ((SmoothScrollLinearLayoutManager) this.f41728r.getLayoutManager()).m88006O2(false);
            }
            this.f41728r.m9826E(new C7774a());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AbstractC23222t7.f112539R, 80);
            int i12 = AbstractC23222t7.f112582r;
            layoutParams.setMargins(i12, 0, i12, AbstractC23222t7.f112552c);
            this.f41731u.f138745q.addView(this.f41728r, layoutParams);
        }
    }

    /* renamed from: e */
    public void m39617e(int i11, int i12, int i13) {
        float f11;
        VideoSeekBarView videoSeekBarView = this.f41729s;
        if (videoSeekBarView != null) {
            float f12 = 1.0f;
            if (i12 < i13) {
                f11 = (i12 * 1.0f) / i13;
            } else {
                f11 = 1.0f;
            }
            videoSeekBarView.setMinProgress(f11);
            if (i11 < i13) {
                f12 = (i11 * 1.0f) / i13;
            }
            this.f41729s.setMaxProgress(f12);
            this.f41729s.setLeftProgress(0.0f);
            this.f41729s.setRightProgress(f12);
        }
    }

    /* renamed from: f */
    public void m39618f(int i11, String str, boolean z11) {
        VideoTimelineView videoTimelineView = this.f41728r;
        if (videoTimelineView != null) {
            videoTimelineView.m39597k2(getContext(), str, i11, z11);
        }
    }

    /* renamed from: g */
    public void m39619g(boolean z11) {
        int i11;
        RobotoTextView robotoTextView = this.f41731u.f138748t;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 4;
        }
        AbstractC23136l9.m118744r1(robotoTextView, i11);
    }

    public long getCurrentPosition() {
        return getStartPoint() + ((long) Math.ceil(this.f41729s.getProgress() * (getEndPoint() - getStartPoint())));
    }

    public int getEndPoint() {
        return this.f41728r.getStartPoint() + ((int) Math.ceil(this.f41729s.getRightProgress() * this.f41728r.getVisibleLength()));
    }

    public int getStartPoint() {
        return this.f41728r.getStartPoint() + ((int) Math.ceil(this.f41729s.getLeftProgress() * this.f41728r.getVisibleLength()));
    }

    public C3451b getVideoTrimLogInfo() {
        VideoSeekBarView videoSeekBarView = this.f41729s;
        if (videoSeekBarView != null) {
            return videoSeekBarView.getVideoTrimLogInfo();
        }
        return new C3451b();
    }

    /* renamed from: h */
    public void m39620h() {
        this.f41732v = this.f41728r.computeHorizontalScrollOffset();
        this.f41733w = this.f41729s.getLeftProgress();
        this.f41734x = this.f41729s.getRightProgress();
    }

    /* renamed from: i */
    public void m39621i(C30923c c30923c) {
        try {
            double startPoint = getStartPoint();
            double endPoint = getEndPoint();
            double d11 = startPoint / 1000.0d;
            double d12 = endPoint / 1000.0d;
            this.f41731u.f138748t.setText(String.format("%s - %s", AbstractC23160o0.m119258i0(Math.floor(d11)), AbstractC23160o0.m119258i0(Math.floor(d12))));
            if (c30923c != null) {
                c30923c.f142631m = (int) startPoint;
                c30923c.f142632n = (int) (endPoint - startPoint);
            }
            this.f41731u.f138746r.setText(AbstractC23160o0.m119258i0(Math.floor(d11)));
            this.f41731u.f138747s.setText(AbstractC23160o0.m119258i0(Math.floor(d12)));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (Build.VERSION.SDK_INT >= 29 && !this.f41726p.isEmpty()) {
            setSystemGestureExclusionRects(this.f41726p);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f41731u = C29937n1.m148264a(this);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        VideoTimelineView videoTimelineView;
        super.onLayout(z11, i11, i12, i13, i14);
        if (Build.VERSION.SDK_INT >= 29 && this.f41726p.isEmpty() && (videoTimelineView = this.f41728r) != null) {
            Rect rect = this.f41727q;
            rect.left = 0;
            rect.top = i12 - videoTimelineView.getHeight();
            this.f41727q.right = AbstractC19849s1.m103551c();
            this.f41727q.bottom = i12 + (this.f41728r.getHeight() * 3);
            this.f41726p.add(this.f41727q);
            setSystemGestureExclusionRects(this.f41726p);
        }
    }

    public void setCurrentPosition(long j11) {
        int startPoint = getStartPoint();
        int endPoint = getEndPoint();
        if (j11 >= startPoint && j11 <= endPoint) {
            this.f41729s.setProgress((float) (Math.ceil((((float) (j11 - r2)) / ((int) Math.ceil(getEndPoint() - getStartPoint()))) * 1000.0f) / 1000.0d));
        }
    }

    public void setLeftProgress(float f11) {
        VideoSeekBarView videoSeekBarView = this.f41729s;
        if (videoSeekBarView != null) {
            videoSeekBarView.setLeftProgress(f11);
        }
    }

    public void setListener(InterfaceC7776c interfaceC7776c) {
        this.f41730t = interfaceC7776c;
    }

    public void setMaxDistanceLeftToRightProgress(float f11) {
        VideoSeekBarView videoSeekBarView = this.f41729s;
        if (videoSeekBarView != null) {
            videoSeekBarView.setMaxDistanceLeftToRightProcess(f11);
        }
    }

    public void setMaxProgress(float f11) {
        VideoSeekBarView videoSeekBarView = this.f41729s;
        if (videoSeekBarView != null) {
            videoSeekBarView.setMaxProgress(f11);
        }
    }

    public void setMinProgress(float f11) {
        VideoSeekBarView videoSeekBarView = this.f41729s;
        if (videoSeekBarView != null) {
            videoSeekBarView.setMinProgress(f11);
        }
    }

    public void setRightProgress(float f11) {
        VideoSeekBarView videoSeekBarView = this.f41729s;
        if (videoSeekBarView != null) {
            videoSeekBarView.setRightProgress(f11);
        }
    }
}

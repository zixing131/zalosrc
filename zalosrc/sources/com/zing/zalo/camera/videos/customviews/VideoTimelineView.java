package com.zing.zalo.camera.videos.customviews;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.util.LruCache;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.camera.videos.customviews.VideoTimelineView;
import com.zing.zalo.uicontrol.SmoothScrollLinearLayoutManager;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import fg0.ThreadFactoryC18928a;
import ho0.AbstractC20110a;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import nf.C23740i;
import nf.EnumC23739h;

/* loaded from: classes3.dex */
public class VideoTimelineView extends RecyclerView {

    /* renamed from: V0 */
    private ZVideoUtilMetadata f41706V0;

    /* renamed from: W0 */
    private LruCache f41707W0;

    /* renamed from: X0 */
    private int f41708X0;

    /* renamed from: Y0 */
    private long f41709Y0;

    /* renamed from: Z0 */
    private long f41710Z0;

    /* renamed from: a1 */
    private long f41711a1;

    /* renamed from: b1 */
    private long f41712b1;

    /* renamed from: c1 */
    private long f41713c1;

    /* renamed from: d1 */
    private int f41714d1;

    /* renamed from: e1 */
    private boolean f41715e1;

    /* renamed from: f1 */
    private ExecutorService f41716f1;

    /* renamed from: com.zing.zalo.camera.videos.customviews.VideoTimelineView$a */
    /* loaded from: classes3.dex */
    public class C7765a extends RecyclerView.AbstractC1880g {
        public C7765a() {
        }

        /* renamed from: N */
        public /* synthetic */ void m39601N(int i11) {
            try {
                if (VideoTimelineView.this.getAdapter() != null) {
                    VideoTimelineView.this.getAdapter().m10009q(i11);
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }

        /* renamed from: O */
        public /* synthetic */ void m39602O(int i11) {
            long j11;
            try {
                if (VideoTimelineView.this.f41706V0 == null) {
                    return;
                }
                if (i11 < VideoTimelineView.this.f41708X0 - 1) {
                    j11 = i11 * VideoTimelineView.this.f41709Y0;
                } else {
                    j11 = ((i11 - 1) * VideoTimelineView.this.f41709Y0) + VideoTimelineView.this.f41712b1;
                }
                long j12 = j11 * 1000;
                long currentTimeMillis = System.currentTimeMillis();
                Bitmap bitmap = VideoTimelineView.this.f41706V0.getBitmap(j12, 2, 320);
                AbstractC20110a.m104535d("get thumb at position - " + i11 + " time - " + (System.currentTimeMillis() - currentTimeMillis) + " microSecond=" + j12, new Object[0]);
                if (bitmap == null) {
                    return;
                }
                VideoTimelineView.this.f41707W0.put(Integer.valueOf(i11), bitmap);
                VideoTimelineView.this.post(new Runnable() { // from class: com.zing.zalo.camera.videos.customviews.g

                    /* renamed from: q */
                    public final /* synthetic */ int f41725q;

                    public /* synthetic */ RunnableC7773g(int i112) {
                        r2 = i112;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        VideoTimelineView.C7765a.this.m39601N(r2);
                    }
                });
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
        /* renamed from: P */
        public void mo9990A(C7766b c7766b, int i11) {
            ImageView imageView = (ImageView) c7766b.f7784p;
            imageView.setBackgroundResource(AbstractC16803z.sepline_videotrim);
            imageView.setAlpha(0.5f);
            imageView.setImageBitmap(null);
            if (VideoTimelineView.this.f41707W0 == null) {
                return;
            }
            if (VideoTimelineView.this.f41707W0.get(Integer.valueOf(i11)) == null) {
                c7766b.f41718I = VideoTimelineView.this.f41716f1.submit(new Runnable() { // from class: com.zing.zalo.camera.videos.customviews.f

                    /* renamed from: q */
                    public final /* synthetic */ int f41723q;

                    public /* synthetic */ RunnableC7772f(int i112) {
                        r2 = i112;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        VideoTimelineView.C7765a.this.m39602O(r2);
                    }
                });
            } else {
                imageView.setAlpha(1.0f);
                imageView.setImageBitmap((Bitmap) VideoTimelineView.this.f41707W0.get(Integer.valueOf(i112)));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
        /* renamed from: Q */
        public C7766b mo9992C(ViewGroup viewGroup, int i11) {
            return C7766b.m39606i0(viewGroup, VideoTimelineView.this.f41711a1);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
        /* renamed from: R */
        public void mo9997H(C7766b c7766b) {
            Future future = c7766b.f41718I;
            if (future != null) {
                future.cancel(true);
            }
            super.mo9997H(c7766b);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
        /* renamed from: k */
        public int mo10003k() {
            return VideoTimelineView.this.f41708X0;
        }
    }

    /* renamed from: com.zing.zalo.camera.videos.customviews.VideoTimelineView$b */
    /* loaded from: classes3.dex */
    public static class C7766b extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        Future f41718I;

        C7766b(View view) {
            super(view);
        }

        /* renamed from: i0 */
        static C7766b m39606i0(ViewGroup viewGroup, long j11) {
            ImageView imageView = new ImageView(viewGroup.getContext());
            imageView.setCropToPadding(true);
            imageView.setLayoutParams(new RecyclerView.LayoutParams((int) j11, -1));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            return new C7766b(imageView);
        }
    }

    public VideoTimelineView(Context context) {
        super(context);
        this.f41711a1 = -1L;
        this.f41712b1 = 0L;
        this.f41716f1 = Executors.newSingleThreadExecutor(new ThreadFactoryC18928a("VideoTimeline"));
    }

    /* renamed from: l2 */
    public /* synthetic */ void m39594l2() {
        LruCache lruCache = this.f41707W0;
        if (lruCache != null) {
            lruCache.evictAll();
        }
        this.f41716f1.shutdown();
        this.f41716f1 = null;
    }

    /* renamed from: m2 */
    public static /* synthetic */ boolean m39595m2(View view, MotionEvent motionEvent) {
        return true;
    }

    public int getStartPoint() {
        if (computeHorizontalScrollRange() == 0) {
            return 0;
        }
        return (int) Math.ceil(((float) (computeHorizontalScrollOffset() * this.f41713c1)) / computeHorizontalScrollRange());
    }

    public int getVisibleLength() {
        return (int) Math.ceil((((float) this.f41710Z0) / ((float) this.f41711a1)) * ((float) this.f41709Y0));
    }

    /* renamed from: j2 */
    public void m39596j2() {
        if (!this.f41716f1.isShutdown() && !this.f41716f1.isTerminated()) {
            this.f41716f1.submit(new Runnable() { // from class: com.zing.zalo.camera.videos.customviews.d
                public /* synthetic */ RunnableC7770d() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    VideoTimelineView.this.m39594l2();
                }
            });
        }
    }

    /* renamed from: k2 */
    public void m39597k2(Context context, String str, int i11, boolean z11) {
        try {
            setBackgroundColor(AbstractC23136l9.m118641B(context, AbstractC16801x.bg_video_timeline_thumb));
            this.f41715e1 = z11;
            if (z11) {
                setOnTouchListener(new View.OnTouchListener() { // from class: com.zing.zalo.camera.videos.customviews.e
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        boolean m39595m2;
                        m39595m2 = VideoTimelineView.m39595m2(view, motionEvent);
                        return m39595m2;
                    }
                });
            }
            this.f41714d1 = i11;
            ZVideoUtilMetadata zVideoUtilMetadata = new ZVideoUtilMetadata(str);
            this.f41706V0 = zVideoUtilMetadata;
            this.f41713c1 = Long.parseLong(zVideoUtilMetadata.getMetadata(ZVideoUtilMetadata.ZMETADATA_KEY_DURATION));
            setLayoutManager(new SmoothScrollLinearLayoutManager(context, 0, false));
            setPadding(getPaddingLeft(), AbstractC23222t7.f112554d, getPaddingRight(), AbstractC23222t7.f112554d);
            m39598n2(context);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: n2 */
    public void m39598n2(Context context) {
        int m118722k0;
        if (context instanceof Activity) {
            m118722k0 = AbstractC23136l9.m118766z(context);
        } else {
            m118722k0 = AbstractC23136l9.m118722k0();
        }
        long m118742r = m118722k0 - AbstractC23136l9.m118742r(32.0f);
        this.f41710Z0 = m118742r;
        long j11 = (this.f41713c1 * m118742r) / this.f41714d1;
        if (this.f41715e1) {
            long j12 = AbstractC23222t7.f112586t;
            this.f41711a1 = j12;
            this.f41708X0 = (int) Math.ceil(m118742r / j12);
            long ceil = (long) Math.ceil((this.f41713c1 * this.f41711a1) / this.f41710Z0);
            this.f41709Y0 = ceil;
            this.f41712b1 = ceil;
            if (this.f41710Z0 % this.f41711a1 > 0) {
                this.f41712b1 = this.f41713c1 - ((this.f41708X0 - 1) * ceil);
            }
        } else {
            EnumC23739h m124104a = C23740i.m124104a(m118722k0, context.getResources());
            if (m124104a == EnumC23739h.f114838p) {
                this.f41711a1 = this.f41710Z0 / 10;
            } else if (m124104a == EnumC23739h.f114839q) {
                this.f41711a1 = this.f41710Z0 / 20;
            } else {
                this.f41711a1 = this.f41710Z0 / 30;
            }
            int i11 = (int) (j11 / this.f41711a1);
            this.f41708X0 = i11;
            this.f41709Y0 = (long) Math.ceil(this.f41713c1 / i11);
        }
        LruCache lruCache = new LruCache(100);
        this.f41707W0 = lruCache;
        lruCache.evictAll();
        setAdapter(new C7765a());
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }
}

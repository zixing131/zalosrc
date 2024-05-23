package com.zing.zalo.shortvideo.p072ui.view;

import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import c20.C3226p;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.snaper.VideoLayout;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import com.zing.zalo.shortvideo.p072ui.view.PreviewPageLayout;
import com.zing.zalo.shortvideo.p072ui.widget.seek.SeekBar;
import com.zing.zalo.shortvideo.p072ui.widget.seek.VideoSeekBar;
import com.zing.zalo.shortvideo.p072ui.widget.tv.EllipsizedTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.Iterator;
import mj0.AbstractC23322a;
import pm0.C24848g0;
import q10.C25018i2;
import s20.AbstractC26105g;
import s20.AbstractC26112n;
import ui0.C27280g;
import v00.AbstractC27406a;
import v00.AbstractC27407b;

/* loaded from: classes5.dex */
public final class PreviewPageLayout extends FrameLayout {

    /* renamed from: A */
    private ArrayList f53086A;

    /* renamed from: p */
    private InterfaceC10346a f53087p;

    /* renamed from: q */
    private final int f53088q;

    /* renamed from: r */
    private final int f53089r;

    /* renamed from: s */
    private final int f53090s;

    /* renamed from: t */
    private final int f53091t;

    /* renamed from: u */
    private final int f53092u;

    /* renamed from: v */
    private final int f53093v;

    /* renamed from: w */
    private final int f53094w;

    /* renamed from: x */
    private ChoreographerFrameCallbackC10347b f53095x;

    /* renamed from: y */
    private Handler f53096y;

    /* renamed from: z */
    private C25018i2 f53097z;

    /* renamed from: com.zing.zalo.shortvideo.ui.view.PreviewPageLayout$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC10346a {
        /* renamed from: a */
        void mo54676a();
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.PreviewPageLayout$b */
    /* loaded from: classes5.dex */
    private static final class ChoreographerFrameCallbackC10347b implements Choreographer.FrameCallback {

        /* renamed from: p */
        private final PreviewPageLayout f53098p;

        /* renamed from: q */
        private boolean f53099q;

        /* renamed from: r */
        private boolean f53100r;

        /* renamed from: s */
        private Interpolator f53101s;

        /* renamed from: t */
        private long f53102t;

        /* renamed from: u */
        private long f53103u;

        public ChoreographerFrameCallbackC10347b(PreviewPageLayout previewPageLayout) {
            AbstractC19074t.m100208f(previewPageLayout, "view");
            this.f53098p = previewPageLayout;
            this.f53101s = new Interpolator() { // from class: com.zing.zalo.shortvideo.ui.view.c
                @Override // android.animation.TimeInterpolator
                public final float getInterpolation(float f11) {
                    float m54678b;
                    m54678b = PreviewPageLayout.ChoreographerFrameCallbackC10347b.m54678b(f11);
                    return m54678b;
                }
            };
            this.f53102t = 100L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static final float m54678b(float f11) {
            return f11;
        }

        /* renamed from: c */
        public final boolean m54679c() {
            return this.f53099q;
        }

        /* renamed from: d */
        public final boolean m54680d() {
            return this.f53100r;
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j11) {
            float f11;
            float alpha;
            if (this.f53103u == 0) {
                long j12 = j11 / 1000000;
                C25018i2 c25018i2 = null;
                if (this.f53100r) {
                    f11 = (float) this.f53102t;
                    C25018i2 c25018i22 = this.f53098p.f53097z;
                    if (c25018i22 == null) {
                        AbstractC19074t.m100223u("binding");
                    } else {
                        c25018i2 = c25018i22;
                    }
                    alpha = c25018i2.f119980y.getAlpha();
                } else {
                    f11 = (float) this.f53102t;
                    C25018i2 c25018i23 = this.f53098p.f53097z;
                    if (c25018i23 == null) {
                        AbstractC19074t.m100223u("binding");
                    } else {
                        c25018i2 = c25018i23;
                    }
                    alpha = 1.0f - c25018i2.f119980y.getAlpha();
                }
                this.f53103u = j12 - (f11 * alpha);
            }
            long min = Math.min((j11 / 1000000) - this.f53103u, this.f53102t);
            long j13 = this.f53102t;
            if (min <= j13) {
                float interpolation = this.f53101s.getInterpolation(((float) min) / ((float) j13));
                PreviewPageLayout previewPageLayout = this.f53098p;
                if (!this.f53100r) {
                    interpolation = 1.0f - interpolation;
                }
                previewPageLayout.setControlAlpha(interpolation);
                if (min < this.f53102t) {
                    Choreographer.getInstance().postFrameCallback(this);
                } else {
                    m54682f();
                }
            }
        }

        /* renamed from: e */
        public final void m54681e(boolean z11) {
            m54682f();
            this.f53100r = z11;
            this.f53099q = true;
            Choreographer.getInstance().postFrameCallback(this);
        }

        /* renamed from: f */
        public final void m54682f() {
            Choreographer.getInstance().removeFrameCallback(this);
            this.f53103u = 0L;
            this.f53099q = false;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.PreviewPageLayout$c */
    /* loaded from: classes5.dex */
    static final class C10348c extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ C25018i2 f53104q;

        /* renamed from: r */
        final /* synthetic */ PreviewPageLayout f53105r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10348c(C25018i2 c25018i2, PreviewPageLayout previewPageLayout) {
            super(1);
            this.f53104q = c25018i2;
            this.f53105r = previewPageLayout;
        }

        /* renamed from: a */
        public final void m54683a(boolean z11) {
            if (z11) {
                this.f53104q.f119973r.setHighlight(this.f53105r.f53096y.hasMessages(0));
            } else {
                this.f53105r.f53096y.removeCallbacksAndMessages(null);
                this.f53104q.f119973r.setHighlight(true);
            }
            this.f53105r.setPlayPauseState(z11);
            this.f53104q.f119973r.setSmoother(z11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54683a(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.PreviewPageLayout$d */
    /* loaded from: classes5.dex */
    static final class C10349d extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ C25018i2 f53106q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10349d(C25018i2 c25018i2) {
            super(2);
            this.f53106q = c25018i2;
        }

        /* renamed from: a */
        public final void m54684a(long j11, long j12) {
            if (!this.f53106q.f119973r.m56232d() || !this.f53106q.f119973r.m56230b()) {
                this.f53106q.f119973r.invalidate();
                this.f53106q.f119969C.setText(AbstractC26105g.m134338e(j11));
                this.f53106q.f119968B.setText(AbstractC26105g.m134338e(j12));
            }
            ImageView imageView = this.f53106q.f119975t;
            AbstractC19074t.m100207e(imageView, "btnPlay");
            AbstractC26112n.m134416p(imageView);
            this.f53106q.f119973r.setTouchable(true);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m54684a(((Number) obj).longValue(), ((Number) obj2).longValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.PreviewPageLayout$e */
    /* loaded from: classes5.dex */
    public static final class C10350e implements VideoSeekBar.InterfaceC10842a {

        /* renamed from: a */
        final /* synthetic */ C25018i2 f53107a;

        C10350e(C25018i2 c25018i2) {
            this.f53107a = c25018i2;
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.seek.VideoSeekBar.InterfaceC10842a
        /* renamed from: a */
        public int mo54685a() {
            return this.f53107a.f119981z.getCurrentPosition();
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.seek.VideoSeekBar.InterfaceC10842a
        /* renamed from: b */
        public int mo54686b() {
            return this.f53107a.f119981z.getDuration();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.PreviewPageLayout$f */
    /* loaded from: classes5.dex */
    public static final class C10351f implements SeekBar.InterfaceC10841a {

        /* renamed from: b */
        final /* synthetic */ C25018i2 f53109b;

        C10351f(C25018i2 c25018i2) {
            this.f53109b = c25018i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m54688e(C25018i2 c25018i2) {
            AbstractC19074t.m100208f(c25018i2, "$this_apply");
            c25018i2.f119973r.setHighlight(false);
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.seek.SeekBar.InterfaceC10841a
        /* renamed from: a */
        public void mo54689a(SeekBar seekBar, int i11, boolean z11) {
            AbstractC19074t.m100208f(seekBar, "seekBar");
            if (z11) {
                ChoreographerFrameCallbackC10347b choreographerFrameCallbackC10347b = PreviewPageLayout.this.f53095x;
                C25018i2 c25018i2 = this.f53109b;
                if (choreographerFrameCallbackC10347b.m54679c()) {
                    if (!choreographerFrameCallbackC10347b.m54680d()) {
                        choreographerFrameCallbackC10347b.m54681e(true);
                    }
                } else if (c25018i2.f119980y.getAlpha() < 1.0f) {
                    choreographerFrameCallbackC10347b.m54681e(true);
                }
                if (!this.f53109b.f119973r.m56232d()) {
                    this.f53109b.f119973r.setHighlight(true);
                }
                this.f53109b.f119969C.setText(AbstractC26105g.m134337d(i11));
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.seek.SeekBar.InterfaceC10841a
        /* renamed from: b */
        public void mo54690b(SeekBar seekBar) {
            AbstractC19074t.m100208f(seekBar, "seekBar");
            PreviewPageLayout.this.f53096y.removeCallbacksAndMessages(null);
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.seek.SeekBar.InterfaceC10841a
        /* renamed from: c */
        public void mo54691c(SeekBar seekBar, boolean z11) {
            AbstractC19074t.m100208f(seekBar, "seekBar");
            ChoreographerFrameCallbackC10347b choreographerFrameCallbackC10347b = PreviewPageLayout.this.f53095x;
            C25018i2 c25018i2 = this.f53109b;
            if (choreographerFrameCallbackC10347b.m54679c()) {
                if (choreographerFrameCallbackC10347b.m54680d()) {
                    choreographerFrameCallbackC10347b.m54681e(false);
                }
            } else if (c25018i2.f119980y.getAlpha() > 0.0f) {
                choreographerFrameCallbackC10347b.m54681e(false);
            }
            if (this.f53109b.f119973r.m56232d()) {
                Handler handler = PreviewPageLayout.this.f53096y;
                final C25018i2 c25018i22 = this.f53109b;
                handler.postDelayed(new Runnable() { // from class: m20.d1
                    @Override // java.lang.Runnable
                    public final void run() {
                        PreviewPageLayout.C10351f.m54688e(C25018i2.this);
                    }
                }, ViewConfiguration.getZoomControlsTimeout());
            }
            if (!z11) {
                this.f53109b.f119981z.m52621f0(seekBar.getProgress() * 1000);
                VideoLayout videoLayout = this.f53109b.f119981z;
                AbstractC19074t.m100207e(videoLayout, "lytVideo");
                if (!VideoLayout.m52568I(videoLayout, false, 1, null)) {
                    this.f53109b.f119981z.m52616R();
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewPageLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f53088q = AbstractC26112n.m134365F(this);
        this.f53089r = AbstractC26112n.m134433y(this, AbstractC27407b.zch_page_header_height);
        this.f53090s = AbstractC26112n.m134433y(this, AbstractC27407b.zch_page_video_footer_height);
        this.f53091t = AbstractC26112n.m134433y(this, AbstractC27407b.zch_page_padding);
        this.f53092u = AbstractC26112n.m134433y(this, AbstractC27407b.zch_page_video_seek_bar_height);
        this.f53093v = AbstractC26112n.m134433y(this, AbstractC27407b.zch_page_video_seek_time_margin);
        this.f53094w = AbstractC26112n.m134433y(this, AbstractC27407b.zch_page_video_footer_btn_height);
        this.f53095x = new ChoreographerFrameCallbackC10347b(this);
        this.f53096y = new Handler(Looper.getMainLooper());
        this.f53086A = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static final void m54670k(C25018i2 c25018i2, View view) {
        AbstractC19074t.m100208f(c25018i2, "$this_apply");
        c25018i2.f119975t.callOnClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static final void m54671l(C25018i2 c25018i2, View view) {
        AbstractC19074t.m100208f(c25018i2, "$this_apply");
        VideoLayout videoLayout = c25018i2.f119981z;
        AbstractC19074t.m100207e(videoLayout, "lytVideo");
        if (VideoLayout.m52568I(videoLayout, false, 1, null)) {
            c25018i2.f119981z.m52615Q();
        } else {
            c25018i2.f119981z.m52616R();
        }
    }

    /* renamed from: m */
    private static final void m54672m(View[] viewArr, float f11) {
        for (View view : viewArr) {
            view.setAlpha(f11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static final void m54673n(C25018i2 c25018i2, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(c25018i2, "$this_run");
        AbstractC19074t.m100208f(valueAnimator, "animator");
        float animatedFraction = valueAnimator.getAnimatedFraction();
        ImageView imageView = c25018i2.f119975t;
        AbstractC19074t.m100207e(imageView, "btnPlay");
        float f11 = animatedFraction * 1.0f;
        AbstractC26112n.m134423s0(imageView, 2.0f - f11);
        ProgressBar progressBar = c25018i2.f119972q;
        AbstractC19074t.m100207e(progressBar, "barLoading");
        AbstractC26112n.m134423s0(progressBar, 1.0f - f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static final float m54674p(float f11) {
        return f11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setControlAlpha(float f11) {
        C25018i2 c25018i2 = this.f53097z;
        if (c25018i2 == null) {
            AbstractC19074t.m100223u("binding");
            c25018i2 = null;
        }
        LinearLayout linearLayout = c25018i2.f119980y;
        AbstractC19074t.m100207e(linearLayout, "lytTime");
        m54672m(new View[]{linearLayout}, f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setPlayPauseState(boolean z11) {
        final C25018i2 c25018i2 = this.f53097z;
        if (c25018i2 == null) {
            AbstractC19074t.m100223u("binding");
            c25018i2 = null;
        }
        if (z11) {
            ImageView imageView = c25018i2.f119975t;
            imageView.animate().cancel();
            imageView.setAlpha(0.0f);
            AbstractC19074t.m100205c(imageView);
            AbstractC26112n.m134367H(imageView);
            ProgressBar progressBar = c25018i2.f119972q;
            AbstractC19074t.m100207e(progressBar, "barLoading");
            AbstractC26112n.m134423s0(progressBar, 1.0f);
            return;
        }
        ImageView imageView2 = c25018i2.f119975t;
        AbstractC19074t.m100205c(imageView2);
        AbstractC26112n.m134431w0(imageView2);
        imageView2.animate().alpha(1.0f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: m20.b1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PreviewPageLayout.m54673n(C25018i2.this, valueAnimator);
            }
        }).setInterpolator(new TimeInterpolator() { // from class: m20.c1
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f11) {
                float m54674p;
                m54674p = PreviewPageLayout.m54674p(f11);
                return m54674p;
            }
        }).setDuration(100L).start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        AbstractC19074t.m100208f(motionEvent, "event");
        C25018i2 c25018i2 = this.f53097z;
        if (c25018i2 == null) {
            AbstractC19074t.m100223u("binding");
            c25018i2 = null;
        }
        if (this.f53086A.isEmpty()) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1 || action == 3) {
                    c25018i2.f119976u.getBackground().setState(new int[0]);
                }
            } else if (c25018i2.f119976u.getTop() <= motionEvent.getY() && c25018i2.f119976u.getLeft() <= motionEvent.getX() && c25018i2.f119976u.getRight() >= motionEvent.getX()) {
                c25018i2.f119976u.getBackground().setState(new int[]{R.attr.state_pressed, R.attr.state_enabled});
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final InterfaceC10346a getCallback() {
        return this.f53087p;
    }

    /* renamed from: j */
    public final void m54675j(Video video) {
        AbstractC19074t.m100208f(video, "video");
        C25018i2 c25018i2 = this.f53097z;
        if (c25018i2 == null) {
            AbstractC19074t.m100223u("binding");
            c25018i2 = null;
        }
        ImageView imageView = c25018i2.f119975t;
        AbstractC19074t.m100207e(imageView, "btnPlay");
        AbstractC26112n.m134398g(imageView);
        c25018i2.f119973r.m56233e();
        EllipsizedTextView ellipsizedTextView = c25018i2.f119967A;
        AbstractC19074t.m100207e(ellipsizedTextView, "txtFooter");
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        AbstractC26112n.m134401h0(ellipsizedTextView, C27280g.m139659b(context, AbstractC23322a.zch_ic_play_solid_16, AbstractC27406a.zch_icon_secondary));
        c25018i2.f119967A.setText(AbstractC26105g.m134334a(video.m52845H()));
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        final C25018i2 m129850a = C25018i2.m129850a(this);
        AbstractC19074t.m100207e(m129850a, "bind(...)");
        View view = m129850a.f119970D;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColors(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 637534208, 1291845632, 1711276032});
        view.setBackground(gradientDrawable);
        m129850a.f119970D.setOnClickListener(new View.OnClickListener() { // from class: m20.z0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PreviewPageLayout.m54670k(C25018i2.this, view2);
            }
        });
        m129850a.f119975t.setOnClickListener(new View.OnClickListener() { // from class: m20.a1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PreviewPageLayout.m54671l(C25018i2.this, view2);
            }
        });
        m129850a.f119981z.setPlayStateChangedAction(new C10348c(m129850a, this));
        m129850a.f119981z.setProgressChangedAction(new C10349d(m129850a));
        m129850a.f119973r.setProgressProvider(new C10350e(m129850a));
        m129850a.f119973r.setListener(new C10351f(m129850a));
        this.f53097z = m129850a;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        AbstractC19074t.m100208f(motionEvent, "event");
        C25018i2 c25018i2 = this.f53097z;
        if (c25018i2 == null) {
            AbstractC19074t.m100223u("binding");
            c25018i2 = null;
        }
        if ((!this.f53086A.isEmpty()) || c25018i2.f119973r.getTop() > motionEvent.getY() || motionEvent.getAction() != 1) {
            return false;
        }
        return onTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int i15;
        C25018i2 c25018i2 = this.f53097z;
        if (c25018i2 == null) {
            AbstractC19074t.m100223u("binding");
            c25018i2 = null;
        }
        if (C3226p.Companion.m16363f()) {
            FrameLayout frameLayout = c25018i2.f119977v;
            AbstractC19074t.m100207e(frameLayout, "lytContent");
            AbstractC26112n.m134383X(frameLayout, 0, 0);
            i15 = this.f53088q;
        } else {
            i15 = this.f53088q;
            FrameLayout frameLayout2 = c25018i2.f119977v;
            AbstractC19074t.m100207e(frameLayout2, "lytContent");
            AbstractC26112n.m134383X(frameLayout2, i15, 0);
        }
        LinearLayout linearLayout = c25018i2.f119978w;
        AbstractC19074t.m100207e(linearLayout, "lytHeader");
        AbstractC26112n.m134383X(linearLayout, i15, 0);
        int measuredHeight = getMeasuredHeight();
        VideoSeekBar videoSeekBar = c25018i2.f119973r;
        AbstractC19074t.m100207e(videoSeekBar, "barSeek");
        AbstractC26112n.m134381V(videoSeekBar, measuredHeight, 0);
        int measuredWidth = (getMeasuredWidth() - c25018i2.f119980y.getMeasuredWidth()) / 2;
        int measuredHeight2 = (getMeasuredHeight() - this.f53092u) - this.f53093v;
        LinearLayout linearLayout2 = c25018i2.f119980y;
        AbstractC19074t.m100207e(linearLayout2, "lytTime");
        AbstractC26112n.m134381V(linearLayout2, measuredHeight2, measuredWidth);
        int measuredHeight3 = getMeasuredHeight();
        EllipsizedTextView ellipsizedTextView = c25018i2.f119967A;
        AbstractC19074t.m100207e(ellipsizedTextView, "txtFooter");
        AbstractC26112n.m134381V(ellipsizedTextView, measuredHeight3, 0);
        int measuredWidth2 = c25018i2.f119967A.getMeasuredWidth();
        int i16 = measuredHeight3 - ((this.f53090s - this.f53094w) / 2);
        SimpleShadowTextView simpleShadowTextView = c25018i2.f119976u;
        AbstractC19074t.m100207e(simpleShadowTextView, "btnSelect");
        AbstractC26112n.m134381V(simpleShadowTextView, i16, measuredWidth2);
        for (View view : this.f53086A) {
            AbstractC26112n.m134383X(view, (getMeasuredHeight() - view.getMeasuredHeight()) / 2, (getMeasuredWidth() - view.getMeasuredWidth()) / 2);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        C25018i2 c25018i2 = this.f53097z;
        if (c25018i2 == null) {
            AbstractC19074t.m100223u("binding");
            c25018i2 = null;
        }
        int m16358a = C3226p.Companion.m16358a(size, size2, this.f53088q, this.f53090s);
        FrameLayout frameLayout = c25018i2.f119977v;
        AbstractC19074t.m100207e(frameLayout, "lytContent");
        AbstractC26112n.m134387a0(frameLayout, size, 1073741824, m16358a, 1073741824);
        LinearLayout linearLayout = c25018i2.f119978w;
        AbstractC19074t.m100207e(linearLayout, "lytHeader");
        AbstractC26112n.m134387a0(linearLayout, size, 1073741824, this.f53089r, 1073741824);
        VideoSeekBar videoSeekBar = c25018i2.f119973r;
        AbstractC19074t.m100207e(videoSeekBar, "barSeek");
        AbstractC26112n.m134387a0(videoSeekBar, size, 1073741824, this.f53092u, 1073741824);
        LinearLayout linearLayout2 = c25018i2.f119980y;
        AbstractC19074t.m100207e(linearLayout2, "lytTime");
        AbstractC26112n.m134387a0(linearLayout2, 0, 0, 0, 0);
        SimpleShadowTextView simpleShadowTextView = c25018i2.f119976u;
        AbstractC19074t.m100207e(simpleShadowTextView, "btnSelect");
        AbstractC26112n.m134387a0(simpleShadowTextView, 0, 0, this.f53094w, 1073741824);
        EllipsizedTextView ellipsizedTextView = c25018i2.f119967A;
        AbstractC19074t.m100207e(ellipsizedTextView, "txtFooter");
        AbstractC26112n.m134387a0(ellipsizedTextView, (size - c25018i2.f119976u.getMeasuredWidth()) - this.f53091t, 1073741824, this.f53090s, 1073741824);
        Iterator it = this.f53086A.iterator();
        while (it.hasNext()) {
            ((View) it.next()).measure(i11, i12);
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        InterfaceC10346a interfaceC10346a;
        AbstractC19074t.m100208f(motionEvent, "event");
        C25018i2 c25018i2 = this.f53097z;
        if (c25018i2 == null) {
            AbstractC19074t.m100223u("binding");
            c25018i2 = null;
        }
        if (motionEvent.getAction() != 1) {
            return true;
        }
        if (c25018i2.f119973r.m56232d()) {
            if (motionEvent.getY() <= (getMeasuredHeight() + this.f53092u) - (this.f53090s * 2)) {
                return false;
            }
        } else if (motionEvent.getY() <= getMeasuredHeight() - this.f53090s) {
            c25018i2.f119975t.callOnClick();
            return true;
        }
        if (c25018i2.f119976u.getTop() <= motionEvent.getY() && c25018i2.f119976u.getLeft() <= motionEvent.getX() && c25018i2.f119976u.getRight() >= motionEvent.getX() && (interfaceC10346a = this.f53087p) != null) {
            interfaceC10346a.mo54676a();
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        AbstractC19074t.m100208f(view, "child");
        if (this.f53097z != null) {
            this.f53086A.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        AbstractC19074t.m100208f(view, "child");
        if (this.f53097z != null) {
            this.f53086A.remove(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z11) {
        super.requestDisallowInterceptTouchEvent(z11);
        C25018i2 c25018i2 = this.f53097z;
        if (c25018i2 == null) {
            AbstractC19074t.m100223u("binding");
            c25018i2 = null;
        }
        c25018i2.f119976u.getBackground().setState(new int[0]);
    }

    public final void setCallback(InterfaceC10346a interfaceC10346a) {
        this.f53087p = interfaceC10346a;
    }

    public final void setLoadingVisible(boolean z11) {
        C25018i2 c25018i2 = this.f53097z;
        if (c25018i2 == null) {
            AbstractC19074t.m100223u("binding");
            c25018i2 = null;
        }
        if (z11) {
            ProgressBar progressBar = c25018i2.f119972q;
            AbstractC19074t.m100207e(progressBar, "barLoading");
            AbstractC26112n.m134431w0(progressBar);
        } else {
            ProgressBar progressBar2 = c25018i2.f119972q;
            AbstractC19074t.m100207e(progressBar2, "barLoading");
            AbstractC26112n.m134367H(progressBar2);
        }
    }
}

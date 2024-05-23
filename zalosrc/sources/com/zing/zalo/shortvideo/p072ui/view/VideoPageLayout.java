package com.zing.zalo.shortvideo.p072ui.view;

import android.R;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.core.view.C1547f0;
import androidx.recyclerview.widget.RecyclerView;
import c20.C3226p;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.shortvideo.data.model.BreakSlot;
import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.model.LivestreamData;
import com.zing.zalo.shortvideo.data.model.LoadMoreInfo;
import com.zing.zalo.shortvideo.data.model.Section;
import com.zing.zalo.shortvideo.data.model.config.ChannelConfig;
import com.zing.zalo.shortvideo.data.model.config.CoreConfig;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.item.VideoItem;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.snaper.VideoLayout;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import com.zing.zalo.shortvideo.p072ui.view.SimilarVideosLayout;
import com.zing.zalo.shortvideo.p072ui.view.VideoPageLayout;
import com.zing.zalo.shortvideo.p072ui.widget.LoadingLayout;
import com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView;
import com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRefreshBar;
import com.zing.zalo.shortvideo.p072ui.widget.seek.SeekBar;
import com.zing.zalo.shortvideo.p072ui.widget.seek.VideoSeekBar;
import com.zing.zalo.shortvideo.p072ui.widget.tv.EllipsizedTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19055h0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import ln0.AbstractC22543l;
import m20.RunnableC22748g2;
import mj0.AbstractC23322a;
import pm0.C24848g0;
import pm0.C24860q;
import q10.C25026k2;
import q20.C25100w;
import r20.AbstractC25622b;
import r20.C25624d;
import r20.C25626f;
import r20.C25627g;
import r20.C25628h;
import s20.AbstractC26104f;
import s20.AbstractC26105g;
import s20.AbstractC26108j;
import s20.AbstractC26112n;
import ui0.C27280g;
import v00.AbstractC27406a;
import v00.AbstractC27407b;
import v00.AbstractC27413h;
import v00.C27417l;
import z10.C31179n0;

/* loaded from: classes5.dex */
public final class VideoPageLayout extends FrameLayout {

    /* renamed from: A */
    private final int f53496A;

    /* renamed from: B */
    private final String f53497B;

    /* renamed from: C */
    private final String f53498C;

    /* renamed from: D */
    private ValueAnimator f53499D;

    /* renamed from: E */
    private ChoreographerFrameCallbackC10528b f53500E;

    /* renamed from: F */
    private boolean f53501F;

    /* renamed from: G */
    private Handler f53502G;

    /* renamed from: H */
    private boolean f53503H;

    /* renamed from: I */
    private Handler f53504I;

    /* renamed from: J */
    private InterfaceC18494a f53505J;

    /* renamed from: K */
    private long f53506K;

    /* renamed from: L */
    private final C1547f0 f53507L;

    /* renamed from: M */
    private HashMap f53508M;

    /* renamed from: N */
    private AbstractC25622b f53509N;

    /* renamed from: O */
    private float f53510O;

    /* renamed from: P */
    private boolean f53511P;

    /* renamed from: Q */
    private int f53512Q;

    /* renamed from: R */
    private int f53513R;

    /* renamed from: S */
    private int f53514S;

    /* renamed from: T */
    private VelocityTracker f53515T;

    /* renamed from: U */
    private MotionEvent f53516U;

    /* renamed from: V */
    private MotionEvent f53517V;

    /* renamed from: W */
    private boolean f53518W;

    /* renamed from: a0 */
    private int f53519a0;

    /* renamed from: b0 */
    private int f53520b0;

    /* renamed from: c0 */
    private C25026k2 f53521c0;

    /* renamed from: d0 */
    private ArrayList f53522d0;

    /* renamed from: e0 */
    private InterfaceC18494a f53523e0;

    /* renamed from: p */
    private InterfaceC10526a f53524p;

    /* renamed from: q */
    private final int f53525q;

    /* renamed from: r */
    private final int f53526r;

    /* renamed from: s */
    private final int f53527s;

    /* renamed from: t */
    private final int f53528t;

    /* renamed from: u */
    private final int f53529u;

    /* renamed from: v */
    private final int f53530v;

    /* renamed from: w */
    private final int f53531w;

    /* renamed from: x */
    private final int f53532x;

    /* renamed from: y */
    private final int f53533y;

    /* renamed from: z */
    private final int f53534z;

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageLayout$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC10526a {

        /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageLayout$a$a */
        /* loaded from: classes5.dex */
        public static final class a {
            /* renamed from: a */
            public static /* synthetic */ void m55245a(InterfaceC10526a interfaceC10526a, boolean z11, int i11, Object obj) {
                if (obj == null) {
                    if ((i11 & 1) != 0) {
                        z11 = false;
                    }
                    interfaceC10526a.mo55236j(z11);
                    return;
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestSkipBreakSlot");
            }
        }

        /* renamed from: a */
        void mo55227a();

        /* renamed from: b */
        void mo55228b();

        /* renamed from: c */
        void mo55229c(Channel channel, boolean z11);

        /* renamed from: d */
        void mo55230d(long j11, long j12);

        /* renamed from: e */
        void mo55231e();

        /* renamed from: f */
        void mo55232f(int i11);

        /* renamed from: g */
        void mo55233g();

        /* renamed from: h */
        void mo55234h(int i11);

        /* renamed from: i */
        void mo55235i(Video video, int i11);

        /* renamed from: j */
        void mo55236j(boolean z11);

        /* renamed from: k */
        void mo55237k();

        /* renamed from: l */
        void mo55238l();

        /* renamed from: m */
        void mo55239m(BreakSlot breakSlot);

        /* renamed from: n */
        void mo55240n(String str, LoadMoreInfo loadMoreInfo);

        /* renamed from: o */
        void mo55241o(String str);

        /* renamed from: p */
        void mo55242p(String str, Section section, int i11, String str2);

        /* renamed from: q */
        void mo55243q(Channel channel);

        /* renamed from: r */
        void mo55244r(String str);
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageLayout$a0 */
    /* loaded from: classes5.dex */
    static final class C10527a0 extends AbstractC19075u implements InterfaceC18505l {
        C10527a0() {
            super(1);
        }

        /* renamed from: a */
        public final void m55246a(boolean z11) {
            if (z11) {
                if (VideoPageLayout.this.f53506K > 0 && VideoLayout.Companion.m52630a()) {
                    VideoPageLayout videoPageLayout = VideoPageLayout.this;
                    videoPageLayout.m55184m0(videoPageLayout.f53506K, VideoPageLayout.this.f53505J);
                    return;
                }
                return;
            }
            if (VideoPageLayout.this.f53504I.hasMessages(0)) {
                VideoPageLayout.this.m55178j0(false);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m55246a(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageLayout$b */
    /* loaded from: classes5.dex */
    public static final class ChoreographerFrameCallbackC10528b implements Choreographer.FrameCallback {

        /* renamed from: p */
        private final VideoPageLayout f53536p;

        /* renamed from: q */
        private boolean f53537q;

        /* renamed from: r */
        private boolean f53538r;

        /* renamed from: s */
        private Interpolator f53539s;

        /* renamed from: t */
        private long f53540t;

        /* renamed from: u */
        private long f53541u;

        public ChoreographerFrameCallbackC10528b(VideoPageLayout videoPageLayout) {
            AbstractC19074t.m100208f(videoPageLayout, "view");
            this.f53536p = videoPageLayout;
            this.f53539s = new Interpolator() { // from class: com.zing.zalo.shortvideo.ui.view.g
                @Override // android.animation.TimeInterpolator
                public final float getInterpolation(float f11) {
                    float m55248b;
                    m55248b = VideoPageLayout.ChoreographerFrameCallbackC10528b.m55248b(f11);
                    return m55248b;
                }
            };
            this.f53540t = 100L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static final float m55248b(float f11) {
            return f11;
        }

        /* renamed from: c */
        public final boolean m55249c() {
            return this.f53537q;
        }

        /* renamed from: d */
        public final boolean m55250d() {
            return this.f53538r;
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j11) {
            float f11;
            float alpha;
            if (this.f53541u == 0) {
                long j12 = j11 / 1000000;
                C25026k2 c25026k2 = null;
                if (this.f53538r) {
                    f11 = (float) this.f53540t;
                    C25026k2 c25026k22 = this.f53536p.f53521c0;
                    if (c25026k22 == null) {
                        AbstractC19074t.m100223u("binding");
                    } else {
                        c25026k2 = c25026k22;
                    }
                    alpha = c25026k2.f120037K.getAlpha();
                } else {
                    f11 = (float) this.f53540t;
                    C25026k2 c25026k23 = this.f53536p.f53521c0;
                    if (c25026k23 == null) {
                        AbstractC19074t.m100223u("binding");
                    } else {
                        c25026k2 = c25026k23;
                    }
                    alpha = 1.0f - c25026k2.f120037K.getAlpha();
                }
                this.f53541u = j12 - (f11 * alpha);
            }
            long min = Math.min((j11 / 1000000) - this.f53541u, this.f53540t);
            long j13 = this.f53540t;
            if (min <= j13) {
                float interpolation = this.f53539s.getInterpolation(((float) min) / ((float) j13));
                VideoPageLayout videoPageLayout = this.f53536p;
                if (!this.f53538r) {
                    interpolation = 1.0f - interpolation;
                }
                videoPageLayout.setControlAlpha(interpolation);
                if (min < this.f53540t) {
                    Choreographer.getInstance().postFrameCallback(this);
                } else {
                    m55252f();
                }
            }
        }

        /* renamed from: e */
        public final void m55251e(boolean z11) {
            m55252f();
            this.f53538r = z11;
            this.f53537q = true;
            Choreographer.getInstance().postFrameCallback(this);
        }

        /* renamed from: f */
        public final void m55252f() {
            Choreographer.getInstance().removeFrameCallback(this);
            this.f53541u = 0L;
            this.f53537q = false;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageLayout$b0 */
    /* loaded from: classes5.dex */
    static final class C10529b0 extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ C25026k2 f53542q;

        /* renamed from: r */
        final /* synthetic */ VideoPageLayout f53543r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10529b0(C25026k2 c25026k2, VideoPageLayout videoPageLayout) {
            super(1);
            this.f53542q = c25026k2;
            this.f53543r = videoPageLayout;
        }

        /* renamed from: a */
        public final void m55253a(boolean z11) {
            if (!z11) {
                this.f53543r.m55176i0();
                this.f53542q.f120050s.setHighlight(true);
            } else {
                this.f53542q.f120050s.setHighlight(this.f53543r.f53502G.hasMessages(0));
                this.f53543r.m55225x0(false);
            }
            this.f53543r.setPlayPauseState(z11);
            this.f53542q.f120050s.setSmoother(z11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m55253a(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageLayout$c */
    /* loaded from: classes5.dex */
    public static final class C10530c extends AbstractC19075u implements InterfaceC18494a {
        C10530c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m55254a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m55254a() {
            VideoPageLayout.this.m55201y0(false, 0);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageLayout$c0 */
    /* loaded from: classes5.dex */
    static final class C10531c0 extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ C25026k2 f53545q;

        /* renamed from: r */
        final /* synthetic */ VideoPageLayout f53546r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10531c0(C25026k2 c25026k2, VideoPageLayout videoPageLayout) {
            super(2);
            this.f53545q = c25026k2;
            this.f53546r = videoPageLayout;
        }

        /* renamed from: a */
        public final void m55255a(long j11, long j12) {
            boolean z11;
            if (!this.f53545q.f120050s.m56232d() || !this.f53545q.f120050s.m56230b()) {
                this.f53545q.f120050s.invalidate();
                this.f53545q.f120045S.setText(AbstractC26105g.m134338e(j11));
                this.f53545q.f120044R.setText(AbstractC26105g.m134338e(j12));
            }
            if (this.f53545q.f120031E.getScrollState() == 0) {
                VideoSeekBar videoSeekBar = this.f53545q.f120050s;
                if (this.f53546r.f53503H) {
                    BottomGuideLayout bottomGuideLayout = this.f53545q.f120033G;
                    AbstractC19074t.m100207e(bottomGuideLayout, "lytGuideBottom");
                    if (AbstractC26112n.m134379T(bottomGuideLayout)) {
                        View view = this.f53545q.f120039M;
                        AbstractC19074t.m100207e(view, "ovlFooter");
                        if (AbstractC26112n.m134376Q(view)) {
                            z11 = true;
                            videoSeekBar.setTouchable(z11);
                        }
                    }
                }
                z11 = false;
                videoSeekBar.setTouchable(z11);
            }
            if (!this.f53546r.f53501F) {
                this.f53546r.setControlReady(true);
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m55255a(((Number) obj).longValue(), ((Number) obj2).longValue());
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageLayout$d */
    /* loaded from: classes5.dex */
    public static final class C10532d extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ C25026k2 f53548r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10532d(C25026k2 c25026k2) {
            super(1);
            this.f53548r = c25026k2;
        }

        /* renamed from: a */
        public final void m55256a(float f11) {
            VideoPageLayout.this.f53510O = (-f11) / this.f53548r.f120046T.getMeasuredHeight();
            VideoPageLayout.this.requestLayout();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m55256a(((Number) obj).floatValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageLayout$d0 */
    /* loaded from: classes5.dex */
    public static final class C10533d0 implements VideoSeekBar.InterfaceC10842a {

        /* renamed from: a */
        final /* synthetic */ C25026k2 f53549a;

        C10533d0(C25026k2 c25026k2) {
            this.f53549a = c25026k2;
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.seek.VideoSeekBar.InterfaceC10842a
        /* renamed from: a */
        public int mo54685a() {
            return this.f53549a.f120038L.getCurrentPosition();
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.seek.VideoSeekBar.InterfaceC10842a
        /* renamed from: b */
        public int mo54686b() {
            return this.f53549a.f120038L.getDuration();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageLayout$e */
    /* loaded from: classes5.dex */
    public static final class C10534e extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ C25026k2 f53551r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10534e(C25026k2 c25026k2) {
            super(1);
            this.f53551r = c25026k2;
        }

        /* renamed from: a */
        public final void m55257a(float f11) {
            VideoPageLayout.this.f53510O = (-f11) / this.f53551r.f120046T.getMeasuredHeight();
            VideoPageLayout.this.requestLayout();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m55257a(((Number) obj).floatValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageLayout$e0 */
    /* loaded from: classes5.dex */
    public static final class C10535e0 extends RecyclerView.AbstractC1892s {

        /* renamed from: a */
        final /* synthetic */ C25026k2 f53552a;

        /* renamed from: b */
        final /* synthetic */ VideoPageLayout f53553b;

        C10535e0(C25026k2 c25026k2, VideoPageLayout videoPageLayout) {
            this.f53552a = c25026k2;
            this.f53553b = videoPageLayout;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            View view;
            View view2;
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            boolean z11 = false;
            View view3 = null;
            if (i11 == 0) {
                VideoSeekBar videoSeekBar = this.f53552a.f120050s;
                if (this.f53553b.f53503H && this.f53553b.f53501F) {
                    z11 = true;
                }
                videoSeekBar.setTouchable(z11);
                OverScrollableRecyclerView overScrollableRecyclerView = this.f53552a.f120031E;
                AbstractC19074t.m100207e(overScrollableRecyclerView, "lstVideo");
                int i12 = this.f53553b.f53519a0;
                RecyclerView.AbstractC1888o layoutManager = overScrollableRecyclerView.getLayoutManager();
                if (layoutManager != null) {
                    view2 = layoutManager.mo9732P(i12);
                } else {
                    view2 = null;
                }
                if (view2 instanceof VideoItem) {
                    view3 = view2;
                }
                VideoItem videoItem = (VideoItem) view3;
                if (videoItem != null) {
                    videoItem.setInfoActive(true);
                    return;
                }
                return;
            }
            this.f53552a.f120050s.setTouchable(false);
            OverScrollableRecyclerView overScrollableRecyclerView2 = this.f53552a.f120031E;
            AbstractC19074t.m100207e(overScrollableRecyclerView2, "lstVideo");
            int i13 = this.f53553b.f53519a0;
            RecyclerView.AbstractC1888o layoutManager2 = overScrollableRecyclerView2.getLayoutManager();
            if (layoutManager2 != null) {
                view = layoutManager2.mo9732P(i13);
            } else {
                view = null;
            }
            if (view instanceof VideoItem) {
                view3 = view;
            }
            VideoItem videoItem2 = (VideoItem) view3;
            if (videoItem2 != null) {
                videoItem2.setInfoActive(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageLayout$f */
    /* loaded from: classes5.dex */
    public static final class C10536f extends AbstractC19075u implements InterfaceC18505l {
        C10536f() {
            super(1);
        }

        /* renamed from: a */
        public final void m55258a(View view) {
            AbstractC19074t.m100208f(view, "it");
            InterfaceC10526a callback = VideoPageLayout.this.getCallback();
            if (callback != null) {
                callback.mo55237k();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m55258a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageLayout$f0 */
    /* loaded from: classes5.dex */
    public static final class C10537f0 implements SeekBar.InterfaceC10841a {

        /* renamed from: a */
        private long f53555a;

        /* renamed from: c */
        final /* synthetic */ C25026k2 f53557c;

        C10537f0(C25026k2 c25026k2) {
            this.f53557c = c25026k2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m55260e(C25026k2 c25026k2) {
            AbstractC19074t.m100208f(c25026k2, "$this_apply");
            c25026k2.f120050s.setHighlight(false);
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.seek.SeekBar.InterfaceC10841a
        /* renamed from: a */
        public void mo54689a(SeekBar seekBar, int i11, boolean z11) {
            AbstractC19074t.m100208f(seekBar, "seekBar");
            if (z11) {
                ChoreographerFrameCallbackC10528b choreographerFrameCallbackC10528b = VideoPageLayout.this.f53500E;
                C25026k2 c25026k2 = this.f53557c;
                if (choreographerFrameCallbackC10528b.m55249c()) {
                    if (!choreographerFrameCallbackC10528b.m55250d()) {
                        choreographerFrameCallbackC10528b.m55251e(true);
                    }
                } else if (c25026k2.f120037K.getAlpha() < 1.0f) {
                    choreographerFrameCallbackC10528b.m55251e(true);
                }
                if (!this.f53557c.f120050s.m56232d()) {
                    this.f53557c.f120050s.setHighlight(true);
                }
                this.f53557c.f120045S.setText(AbstractC26105g.m134337d(i11));
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.seek.SeekBar.InterfaceC10841a
        /* renamed from: b */
        public void mo54690b(SeekBar seekBar) {
            AbstractC19074t.m100208f(seekBar, "seekBar");
            this.f53555a = seekBar.getProgress() * 1000;
            VideoPageLayout.this.m55176i0();
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.seek.SeekBar.InterfaceC10841a
        /* renamed from: c */
        public void mo54691c(SeekBar seekBar, boolean z11) {
            View view;
            AbstractC19074t.m100208f(seekBar, "seekBar");
            ChoreographerFrameCallbackC10528b choreographerFrameCallbackC10528b = VideoPageLayout.this.f53500E;
            C25026k2 c25026k2 = this.f53557c;
            if (choreographerFrameCallbackC10528b.m55249c()) {
                if (choreographerFrameCallbackC10528b.m55250d()) {
                    choreographerFrameCallbackC10528b.m55251e(false);
                }
            } else if (c25026k2.f120037K.getAlpha() > 0.0f) {
                choreographerFrameCallbackC10528b.m55251e(false);
            }
            if (this.f53557c.f120050s.m56232d()) {
                Handler handler = VideoPageLayout.this.f53502G;
                final C25026k2 c25026k22 = this.f53557c;
                handler.postDelayed(new Runnable() { // from class: m20.n2
                    @Override // java.lang.Runnable
                    public final void run() {
                        VideoPageLayout.C10537f0.m55260e(C25026k2.this);
                    }
                }, ViewConfiguration.getZoomControlsTimeout());
            }
            if (!z11) {
                long progress = seekBar.getProgress();
                C25026k2 c25026k23 = this.f53557c;
                VideoPageLayout videoPageLayout = VideoPageLayout.this;
                OverScrollableRecyclerView overScrollableRecyclerView = c25026k23.f120031E;
                AbstractC19074t.m100207e(overScrollableRecyclerView, "lstVideo");
                int i11 = videoPageLayout.f53519a0;
                RecyclerView.AbstractC1888o layoutManager = overScrollableRecyclerView.getLayoutManager();
                if (layoutManager != null) {
                    view = layoutManager.mo9732P(i11);
                } else {
                    view = null;
                }
                if (!(view instanceof VideoItem)) {
                    view = null;
                }
                VideoItem videoItem = (VideoItem) view;
                if (videoItem != null) {
                    videoItem.setInfoExpand(false);
                }
                c25026k23.f120038L.m52621f0(progress);
                InterfaceC10526a callback = videoPageLayout.getCallback();
                if (callback != null) {
                    callback.mo55230d(this.f53555a, progress);
                }
                VideoLayout videoLayout = this.f53557c.f120038L;
                AbstractC19074t.m100207e(videoLayout, "lytVideo");
                if (!VideoLayout.m52568I(videoLayout, false, 1, null)) {
                    this.f53557c.f120038L.m52616R();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageLayout$g */
    /* loaded from: classes5.dex */
    public static final class C10538g extends AbstractC19075u implements InterfaceC18494a {
        C10538g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m55261a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m55261a() {
            InterfaceC10526a callback = VideoPageLayout.this.getCallback();
            if (callback != null) {
                callback.mo55237k();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageLayout$g0 */
    /* loaded from: classes5.dex */
    public static final class C10539g0 extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C10539g0 f53559q = new C10539g0();

        C10539g0() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m55262a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m55262a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageLayout$h */
    /* loaded from: classes5.dex */
    public static final class C10540h extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ Video f53561r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10540h(Video video) {
            super(1);
            this.f53561r = video;
        }

        /* renamed from: a */
        public final void m55263a(View view) {
            AbstractC19074t.m100208f(view, "it");
            InterfaceC10526a callback = VideoPageLayout.this.getCallback();
            if (callback != null) {
                String m52883c = this.f53561r.m52883c();
                AbstractC19074t.m100205c(m52883c);
                callback.mo55241o(m52883c);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m55263a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageLayout$h0 */
    /* loaded from: classes5.dex */
    static final class RunnableC10541h0 implements Runnable {
        RunnableC10541h0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                InterfaceC10526a callback = VideoPageLayout.this.getCallback();
                if (callback != null) {
                    callback.mo55228b();
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageLayout$i */
    /* loaded from: classes5.dex */
    public static final class C10542i extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ Video f53564r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10542i(Video video) {
            super(1);
            this.f53564r = video;
        }

        /* renamed from: a */
        public final void m55264a(View view) {
            AbstractC19074t.m100208f(view, "it");
            InterfaceC10526a callback = VideoPageLayout.this.getCallback();
            if (callback != null) {
                callback.mo55235i(this.f53564r, 1);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m55264a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageLayout$i0 */
    /* loaded from: classes5.dex */
    static final class C10543i0 extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ C25026k2 f53565q;

        /* renamed from: r */
        final /* synthetic */ C19055h0 f53566r;

        /* renamed from: s */
        final /* synthetic */ int f53567s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10543i0(C25026k2 c25026k2, C19055h0 c19055h0, int i11) {
            super(1);
            this.f53565q = c25026k2;
            this.f53566r = c19055h0;
            this.f53567s = i11;
        }

        /* renamed from: a */
        public final void m55265a(int i11) {
            this.f53565q.f120031E.scrollBy(0, i11 - this.f53566r.f94931p);
            BottomGuideLayout bottomGuideLayout = this.f53565q.f120033G;
            bottomGuideLayout.setScaleY(i11 / this.f53567s);
            bottomGuideLayout.setTranslationY((bottomGuideLayout.getHeight() * (1 - bottomGuideLayout.getScaleY())) / 2);
            this.f53566r.f94931p = i11;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m55265a(((Number) obj).intValue());
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageLayout$j */
    /* loaded from: classes5.dex */
    public static final class C10544j extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ Video f53569r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10544j(Video video) {
            super(1);
            this.f53569r = video;
        }

        /* renamed from: a */
        public final void m55266a(View view) {
            AbstractC19074t.m100208f(view, "it");
            InterfaceC10526a callback = VideoPageLayout.this.getCallback();
            if (callback != null) {
                callback.mo55235i(this.f53569r, 2);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m55266a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageLayout$j0 */
    /* loaded from: classes5.dex */
    public static final class C10545j0 implements Animator.AnimatorListener {

        /* renamed from: p */
        final /* synthetic */ InterfaceC18505l f53570p;

        /* renamed from: q */
        final /* synthetic */ int f53571q;

        public C10545j0(InterfaceC18505l interfaceC18505l, int i11) {
            this.f53570p = interfaceC18505l;
            this.f53571q = i11;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
            this.f53570p.mo205i9(Integer.valueOf(this.f53571q));
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageLayout$k */
    /* loaded from: classes5.dex */
    public static final class C10546k extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ Video f53573r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10546k(Video video) {
            super(1);
            this.f53573r = video;
        }

        /* renamed from: a */
        public final void m55267a(View view) {
            AbstractC19074t.m100208f(view, "it");
            InterfaceC10526a callback = VideoPageLayout.this.getCallback();
            if (callback != null) {
                callback.mo55235i(this.f53573r, 1);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m55267a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageLayout$k0 */
    /* loaded from: classes5.dex */
    public static final class C10547k0 implements Animator.AnimatorListener {

        /* renamed from: p */
        final /* synthetic */ C25026k2 f53574p;

        /* renamed from: q */
        final /* synthetic */ VideoPageLayout f53575q;

        public C10547k0(C25026k2 c25026k2, VideoPageLayout videoPageLayout) {
            this.f53574p = c25026k2;
            this.f53575q = videoPageLayout;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            long j11;
            CoreConfig m51425b;
            Long m51445h;
            AbstractC19074t.m100208f(animator, "animator");
            this.f53574p.f120033G.m53965c();
            BottomGuideLayout bottomGuideLayout = this.f53574p.f120033G;
            RunnableC10541h0 runnableC10541h0 = new RunnableC10541h0();
            ChannelConfig m140381e = C27417l.f129055a.m140381e();
            if (m140381e != null && (m51425b = m140381e.m51425b()) != null && (m51445h = m51425b.m51445h()) != null) {
                j11 = m51445h.longValue();
            } else {
                j11 = 5000;
            }
            bottomGuideLayout.postDelayed(runnableC10541h0, j11);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageLayout$l */
    /* loaded from: classes5.dex */
    static final class C10548l extends AbstractC19075u implements InterfaceC18494a {
        C10548l() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m55268a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m55268a() {
            InterfaceC10526a callback = VideoPageLayout.this.getCallback();
            if (callback != null) {
                InterfaceC10526a.a.m55245a(callback, false, 1, null);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageLayout$l0 */
    /* loaded from: classes5.dex */
    public static final class C10549l0 implements Animator.AnimatorListener {

        /* renamed from: p */
        final /* synthetic */ C25026k2 f53577p;

        public C10549l0(C25026k2 c25026k2) {
            this.f53577p = c25026k2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
            C25100w c25100w = C25100w.f120572a;
            Context context = this.f53577p.getRoot().getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            c25100w.m130168a(context, 30L);
            this.f53577p.f120050s.setTouchable(false);
            BottomGuideLayout bottomGuideLayout = this.f53577p.f120033G;
            AbstractC19074t.m100207e(bottomGuideLayout, "lytGuideBottom");
            AbstractC26112n.m134431w0(bottomGuideLayout);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageLayout$m */
    /* loaded from: classes5.dex */
    static final class C10550m extends AbstractC19075u implements InterfaceC18505l {
        C10550m() {
            super(1);
        }

        /* renamed from: a */
        public final void m55269a(View view) {
            AbstractC19074t.m100208f(view, "it");
            InterfaceC10526a callback = VideoPageLayout.this.getCallback();
            if (callback != null) {
                callback.mo55236j(true);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m55269a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageLayout$m0 */
    /* loaded from: classes5.dex */
    static final class C10551m0 extends AbstractC19075u implements InterfaceC18494a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageLayout$m0$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            public static final a f53580q = new a();

            a() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m55271a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m55271a() {
            }
        }

        C10551m0() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m55270a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m55270a() {
            VideoPageLayout.this.f53523e0.mo12V4();
            VideoPageLayout.this.f53523e0 = a.f53580q;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageLayout$n */
    /* loaded from: classes5.dex */
    static final class C10552n extends AbstractC19075u implements InterfaceC18494a {
        C10552n() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m55272a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m55272a() {
            InterfaceC10526a callback = VideoPageLayout.this.getCallback();
            if (callback != null) {
                InterfaceC10526a.a.m55245a(callback, false, 1, null);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageLayout$n0 */
    /* loaded from: classes5.dex */
    static final class C10553n0 extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ C25026k2 f53583r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10553n0(C25026k2 c25026k2) {
            super(1);
            this.f53583r = c25026k2;
        }

        /* renamed from: a */
        public final void m55273a(float f11) {
            VideoPageLayout.this.f53510O = (-f11) / this.f53583r.f120046T.getMeasuredHeight();
            VideoPageLayout.this.requestLayout();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m55273a(((Number) obj).floatValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageLayout$o */
    /* loaded from: classes5.dex */
    static final class C10554o extends AbstractC19075u implements InterfaceC18505l {
        C10554o() {
            super(1);
        }

        /* renamed from: a */
        public final void m55274a(View view) {
            AbstractC19074t.m100208f(view, "it");
            InterfaceC10526a callback = VideoPageLayout.this.getCallback();
            if (callback != null) {
                callback.mo55236j(true);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m55274a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageLayout$o0 */
    /* loaded from: classes5.dex */
    static final class C10555o0 extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C10555o0 f53585q = new C10555o0();

        C10555o0() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m55275a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m55275a() {
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageLayout$p */
    /* loaded from: classes5.dex */
    static final class C10556p extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ BreakSlot f53587r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10556p(BreakSlot breakSlot) {
            super(1);
            this.f53587r = breakSlot;
        }

        /* renamed from: a */
        public final void m55276a(View view) {
            AbstractC19074t.m100208f(view, "it");
            InterfaceC10526a callback = VideoPageLayout.this.getCallback();
            if (callback != null) {
                callback.mo55239m(this.f53587r);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m55276a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageLayout$p0 */
    /* loaded from: classes5.dex */
    public static final class C10557p0 extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C10557p0 f53588q = new C10557p0();

        C10557p0() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m55277a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m55277a() {
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageLayout$q */
    /* loaded from: classes5.dex */
    static final class C10558q extends AbstractC19075u implements InterfaceC18494a {
        C10558q() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m55278a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m55278a() {
            InterfaceC10526a callback = VideoPageLayout.this.getCallback();
            if (callback != null) {
                InterfaceC10526a.a.m55245a(callback, false, 1, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageLayout$q0 */
    /* loaded from: classes5.dex */
    public static final class C10559q0 extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final C10559q0 f53590q = new C10559q0();

        C10559q0() {
            super(1);
        }

        /* renamed from: a */
        public final void m55279a(float f11) {
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m55279a(((Number) obj).floatValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageLayout$r */
    /* loaded from: classes5.dex */
    static final class C10560r extends AbstractC19075u implements InterfaceC18505l {
        C10560r() {
            super(1);
        }

        /* renamed from: a */
        public final void m55280a(View view) {
            AbstractC19074t.m100208f(view, "it");
            InterfaceC10526a callback = VideoPageLayout.this.getCallback();
            if (callback != null) {
                callback.mo55236j(true);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m55280a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageLayout$r0 */
    /* loaded from: classes5.dex */
    static final class C10561r0 extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ Video f53593r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10561r0(Video video) {
            super(1);
            this.f53593r = video;
        }

        /* renamed from: a */
        public final void m55281a(View view) {
            AbstractC19074t.m100208f(view, "it");
            InterfaceC10526a callback = VideoPageLayout.this.getCallback();
            if (callback != null) {
                callback.mo55235i(this.f53593r, 2);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m55281a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageLayout$s */
    /* loaded from: classes5.dex */
    static final class C10562s extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C10562s f53594q = new C10562s();

        C10562s() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m55282a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m55282a() {
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageLayout$s0 */
    /* loaded from: classes5.dex */
    static final class C10563s0 extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ Video f53596r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10563s0(Video video) {
            super(1);
            this.f53596r = video;
        }

        /* renamed from: a */
        public final void m55283a(View view) {
            AbstractC19074t.m100208f(view, "it");
            InterfaceC10526a callback = VideoPageLayout.this.getCallback();
            if (callback != null) {
                callback.mo55235i(this.f53596r, 1);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m55283a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageLayout$t */
    /* loaded from: classes5.dex */
    public static final class C10564t extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C10564t f53597q = new C10564t();

        C10564t() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m55284a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m55284a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageLayout$u */
    /* loaded from: classes5.dex */
    public static final class C10565u extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final C10565u f53598q = new C10565u();

        C10565u() {
            super(1);
        }

        /* renamed from: a */
        public final void m55285a(float f11) {
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m55285a(((Number) obj).floatValue());
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageLayout$v */
    /* loaded from: classes5.dex */
    public static final class C10566v extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C10566v f53599q = new C10566v();

        C10566v() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m55286a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m55286a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageLayout$w */
    /* loaded from: classes5.dex */
    public static final class C10567w extends AbstractC19075u implements InterfaceC18494a {
        C10567w() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m55287a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m55287a() {
            VideoPageLayout.this.m55201y0(false, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageLayout$x */
    /* loaded from: classes5.dex */
    public static final class C10568x extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ C25026k2 f53602r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10568x(C25026k2 c25026k2) {
            super(1);
            this.f53602r = c25026k2;
        }

        /* renamed from: a */
        public final void m55288a(float f11) {
            VideoPageLayout.this.f53510O = (-f11) / this.f53602r.f120046T.getMeasuredHeight();
            VideoPageLayout.this.requestLayout();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m55288a(((Number) obj).floatValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageLayout$y */
    /* loaded from: classes5.dex */
    static final class C10569y extends AbstractC19075u implements InterfaceC18505l {
        C10569y() {
            super(1);
        }

        /* renamed from: a */
        public final void m55289a(View view) {
            AbstractC19074t.m100208f(view, "it");
            InterfaceC10526a callback = VideoPageLayout.this.getCallback();
            if (callback != null) {
                callback.mo55238l();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m55289a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.VideoPageLayout$z */
    /* loaded from: classes5.dex */
    public static final class C10570z implements SimilarVideosLayout.InterfaceC10446a {

        /* renamed from: a */
        private boolean f53604a;

        /* renamed from: c */
        final /* synthetic */ C25026k2 f53606c;

        C10570z(C25026k2 c25026k2) {
            this.f53606c = c25026k2;
        }

        @Override // com.zing.zalo.shortvideo.p072ui.view.SimilarVideosLayout.InterfaceC10446a
        /* renamed from: a */
        public void mo54974a(Channel channel, boolean z11) {
            AbstractC19074t.m100208f(channel, "channel");
            InterfaceC10526a callback = VideoPageLayout.this.getCallback();
            if (callback != null) {
                callback.mo55229c(channel, z11);
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.view.SimilarVideosLayout.InterfaceC10446a
        /* renamed from: b */
        public void mo54975b(String str, Section section, int i11, String str2) {
            AbstractC19074t.m100208f(str, "videoId");
            AbstractC19074t.m100208f(section, "section");
            AbstractC19074t.m100208f(str2, "uuid");
            InterfaceC10526a callback = VideoPageLayout.this.getCallback();
            if (callback != null) {
                callback.mo55242p(str, section, i11, str2);
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.view.SimilarVideosLayout.InterfaceC10446a
        /* renamed from: c */
        public void mo54976c() {
            VideoPageLayout.this.m55201y0(false, 1);
        }

        @Override // com.zing.zalo.shortvideo.p072ui.view.SimilarVideosLayout.InterfaceC10446a
        /* renamed from: d */
        public void mo54977d(String str, LoadMoreInfo loadMoreInfo) {
            AbstractC19074t.m100208f(str, "videoId");
            InterfaceC10526a callback = VideoPageLayout.this.getCallback();
            if (callback != null) {
                callback.mo55240n(str, loadMoreInfo);
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.view.SimilarVideosLayout.InterfaceC10446a
        /* renamed from: e */
        public void mo54978e(boolean z11) {
            if (z11) {
                VideoLayout videoLayout = this.f53606c.f120038L;
                AbstractC19074t.m100207e(videoLayout, "lytVideo");
                if (VideoLayout.m52568I(videoLayout, false, 1, null)) {
                    this.f53604a = true;
                    this.f53606c.f120038L.m52615Q();
                }
                this.f53606c.f120038L.setDeferring(true);
                return;
            }
            this.f53606c.f120038L.setDeferring(false);
            if (this.f53604a) {
                this.f53604a = false;
                this.f53606c.f120038L.m52616R();
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.view.SimilarVideosLayout.InterfaceC10446a
        /* renamed from: f */
        public void mo54979f(String str) {
            AbstractC19074t.m100208f(str, "hashtag");
            InterfaceC10526a callback = VideoPageLayout.this.getCallback();
            if (callback != null) {
                callback.mo55244r(str);
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.view.SimilarVideosLayout.InterfaceC10446a
        /* renamed from: g */
        public void mo54980g(Channel channel) {
            AbstractC19074t.m100208f(channel, "channel");
            InterfaceC10526a callback = VideoPageLayout.this.getCallback();
            if (callback != null) {
                callback.mo55243q(channel);
            }
        }

        @Override // com.zing.zalo.shortvideo.p072ui.view.SimilarVideosLayout.InterfaceC10446a
        /* renamed from: h */
        public void mo54981h() {
            VideoPageLayout.this.m55201y0(true, 1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoPageLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f53525q = AbstractC26112n.m134365F(this);
        this.f53526r = AbstractC26112n.m134433y(this, AbstractC27407b.zch_page_header_height);
        this.f53527s = AbstractC26112n.m134433y(this, AbstractC27407b.zch_page_video_footer_height);
        this.f53528t = AbstractC26112n.m134433y(this, AbstractC27407b.zch_page_padding);
        this.f53529u = AbstractC26112n.m134433y(this, AbstractC27407b.zch_page_video_seek_bar_height);
        this.f53530v = AbstractC26112n.m134433y(this, AbstractC27407b.zch_page_video_seek_time_margin);
        this.f53531w = AbstractC26112n.m134433y(this, AbstractC27407b.zch_page_video_load_more_size);
        this.f53532x = AbstractC26112n.m134433y(this, AbstractC27407b.zch_page_video_footer_btn_height);
        this.f53533y = AbstractC26112n.m134433y(this, AbstractC27407b.zch_page_video_footer_btn_spacing);
        this.f53534z = AbstractC26112n.m134433y(this, AbstractC27407b.zch_page_video_footer_emoji_size);
        this.f53496A = AbstractC26112n.m134433y(this, AbstractC27407b.zch_page_refresh_btn_height);
        this.f53497B = AbstractC26112n.m134366G(this, AbstractC27413h.zch_page_video_comment_hint, new Object[0]);
        this.f53498C = AbstractC26112n.m134366G(this, AbstractC27413h.zch_page_video_comment_hint_disable, new Object[0]);
        this.f53499D = new ValueAnimator();
        this.f53500E = new ChoreographerFrameCallbackC10528b(this);
        this.f53502G = new Handler(Looper.getMainLooper());
        this.f53504I = new Handler(Looper.getMainLooper());
        this.f53505J = C10555o0.f53585q;
        this.f53507L = new C1547f0(this);
        this.f53508M = new HashMap();
        this.f53519a0 = -1;
        this.f53520b0 = -1;
        this.f53522d0 = new ArrayList();
        this.f53523e0 = C10562s.f53594q;
    }

    /* renamed from: D */
    private final void m55154D(float f11) {
        float m116579b;
        float m116579b2;
        C25026k2 c25026k2 = this.f53521c0;
        if (c25026k2 == null) {
            AbstractC19074t.m100223u("binding");
            c25026k2 = null;
        }
        if (f11 <= 0.0f && (f11 != 0.0f || this.f53510O >= 0.5f)) {
            m55194u0(this, (-c25026k2.f120046T.getMeasuredHeight()) * this.f53510O, -c25026k2.f120046T.getMeasuredHeight(), f11, null, new C10534e(c25026k2), 8, null);
            return;
        }
        float f12 = (-c25026k2.f120046T.getMeasuredHeight()) * this.f53510O;
        m116579b = AbstractC22543l.m116579b(c25026k2.f120046T.getMeasuredHeight() * this.f53510O * 6.0f, this.f53513R);
        m116579b2 = AbstractC22543l.m116579b(m116579b, f11);
        m55158R(this, -c25026k2.f120046T.getMeasuredHeight(), f12, 0.0f, m116579b2, new C10530c(), new C10532d(c25026k2), 4, null);
        FrameLayout frameLayout = c25026k2.f120046T;
        AbstractC19074t.m100207e(frameLayout, "vieComment");
        AbstractC26112n.m134369J(frameLayout);
    }

    /* renamed from: E */
    static /* synthetic */ void m55155E(VideoPageLayout videoPageLayout, float f11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = 0.0f;
        }
        videoPageLayout.m55154D(f11);
    }

    /* renamed from: G */
    public static /* synthetic */ void m55156G(VideoPageLayout videoPageLayout, int i11, Video video, String str, boolean z11, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            z11 = true;
        }
        videoPageLayout.m55203F(i11, video, str, z11);
    }

    /* renamed from: Q */
    private final void m55157Q(float f11, float f12, float f13, float f14, final InterfaceC18494a interfaceC18494a, final InterfaceC18505l interfaceC18505l) {
        if (f12 >= f11 && f12 <= f13 && f14 != 0.0f) {
            C25624d c25624d = new C25624d(new C25626f(f12));
            c25624d.m132328c(new AbstractC25622b.r() { // from class: m20.j2
                @Override // r20.AbstractC25622b.r
                /* renamed from: a */
                public final void mo52475a(AbstractC25622b abstractC25622b, float f15, float f16) {
                    VideoPageLayout.m55159S(InterfaceC18505l.this, abstractC25622b, f15, f16);
                }
            });
            c25624d.m132327b(new AbstractC25622b.q() { // from class: m20.k2
                @Override // r20.AbstractC25622b.q
                /* renamed from: a */
                public final void mo52476a(AbstractC25622b abstractC25622b, boolean z11, float f15, float f16) {
                    VideoPageLayout.m55160T(InterfaceC18494a.this, abstractC25622b, z11, f15, f16);
                }
            });
            c25624d.m132372u(f14);
            c25624d.m132371t(f11);
            c25624d.m132370s(f13);
            c25624d.m132369r(0.1f);
            c25624d.mo132336n();
            this.f53509N = c25624d;
            return;
        }
        interfaceC18494a.mo12V4();
    }

    /* renamed from: R */
    static /* synthetic */ void m55158R(VideoPageLayout videoPageLayout, float f11, float f12, float f13, float f14, InterfaceC18494a interfaceC18494a, InterfaceC18505l interfaceC18505l, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = 0.0f;
        }
        if ((i11 & 2) != 0) {
            f12 = 0.0f;
        }
        if ((i11 & 4) != 0) {
            f13 = 0.0f;
        }
        if ((i11 & 8) != 0) {
            f14 = 0.0f;
        }
        if ((i11 & 16) != 0) {
            interfaceC18494a = C10564t.f53597q;
        }
        if ((i11 & 32) != 0) {
            interfaceC18505l = C10565u.f53598q;
        }
        videoPageLayout.m55157Q(f11, f12, f13, f14, interfaceC18494a, interfaceC18505l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public static final void m55159S(InterfaceC18505l interfaceC18505l, AbstractC25622b abstractC25622b, float f11, float f12) {
        AbstractC19074t.m100208f(interfaceC18505l, "$updAction");
        interfaceC18505l.mo205i9(Float.valueOf(f11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public static final void m55160T(InterfaceC18494a interfaceC18494a, AbstractC25622b abstractC25622b, boolean z11, float f11, float f12) {
        AbstractC19074t.m100208f(interfaceC18494a, "$endAction");
        if (!z11) {
            interfaceC18494a.mo12V4();
        }
    }

    /* renamed from: W */
    public static /* synthetic */ void m55161W(VideoPageLayout videoPageLayout, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        videoPageLayout.m55214V(z11);
    }

    /* renamed from: Z */
    public static /* synthetic */ void m55162Z(VideoPageLayout videoPageLayout, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        videoPageLayout.m55216Y(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e0 */
    public static final void m55168e0(VideoPageLayout videoPageLayout, View view) {
        AbstractC19074t.m100208f(videoPageLayout, "this$0");
        m55161W(videoPageLayout, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f0 */
    public static final void m55170f0(View view) {
    }

    /* renamed from: g0 */
    private final void m55172g0() {
        this.f53500E.m55252f();
    }

    /* renamed from: h0 */
    private final void m55174h0() {
        View view;
        C25026k2 c25026k2 = this.f53521c0;
        View view2 = null;
        if (c25026k2 == null) {
            AbstractC19074t.m100223u("binding");
            c25026k2 = null;
        }
        OverScrollableRecyclerView overScrollableRecyclerView = c25026k2.f120031E;
        AbstractC19074t.m100207e(overScrollableRecyclerView, "lstVideo");
        int i11 = this.f53519a0;
        RecyclerView.AbstractC1888o layoutManager = overScrollableRecyclerView.getLayoutManager();
        if (layoutManager != null) {
            view = layoutManager.mo9732P(i11);
        } else {
            view = null;
        }
        if (view instanceof VideoItem) {
            view2 = view;
        }
        VideoItem videoItem = (VideoItem) view2;
        if (videoItem != null) {
            videoItem.mo52021Z();
        }
        View view3 = c25026k2.f120039M;
        AbstractC19074t.m100207e(view3, "ovlFooter");
        AbstractC26112n.m134367H(view3);
        m55172g0();
        m55176i0();
        setPlayPauseState(true);
        setControlReady(false);
        setControlAlpha(0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i0 */
    public final void m55176i0() {
        this.f53502G.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j0 */
    public final void m55178j0(boolean z11) {
        this.f53504I.removeCallbacksAndMessages(null);
        if (z11) {
            this.f53506K = 0L;
            this.f53505J = C10539g0.f53559q;
        }
    }

    /* renamed from: k0 */
    static /* synthetic */ void m55180k0(VideoPageLayout videoPageLayout, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        videoPageLayout.m55178j0(z11);
    }

    /* renamed from: l0 */
    private static final void m55182l0(View[] viewArr, float f11) {
        for (View view : viewArr) {
            view.setAlpha(f11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m0 */
    public final void m55184m0(long j11, final InterfaceC18494a interfaceC18494a) {
        C25026k2 c25026k2 = this.f53521c0;
        if (c25026k2 == null) {
            AbstractC19074t.m100223u("binding");
            c25026k2 = null;
        }
        this.f53506K = j11;
        this.f53505J = interfaceC18494a;
        if (c25026k2.f120038L.m52612F()) {
            this.f53504I.postDelayed(new Runnable() { // from class: m20.l2
                @Override // java.lang.Runnable
                public final void run() {
                    VideoPageLayout.m55186n0(VideoPageLayout.this, interfaceC18494a);
                }
            }, j11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n0 */
    public static final void m55186n0(VideoPageLayout videoPageLayout, InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(videoPageLayout, "this$0");
        AbstractC19074t.m100208f(interfaceC18494a, "$action");
        if (videoPageLayout.isAttachedToWindow() && VideoLayout.Companion.m52630a()) {
            interfaceC18494a.mo12V4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p0 */
    public static final void m55188p0(InterfaceC18505l interfaceC18505l, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(interfaceC18505l, "$updateGuideFunc");
        AbstractC19074t.m100208f(valueAnimator, "it");
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        interfaceC18505l.mo205i9(Integer.valueOf(((Integer) animatedValue).intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setControlAlpha(float f11) {
        View view;
        C25026k2 c25026k2 = this.f53521c0;
        View view2 = null;
        if (c25026k2 == null) {
            AbstractC19074t.m100223u("binding");
            c25026k2 = null;
        }
        LinearLayout linearLayout = c25026k2.f120037K;
        AbstractC19074t.m100207e(linearLayout, "lytTime");
        m55182l0(new View[]{linearLayout}, f11);
        OverScrollableRecyclerView overScrollableRecyclerView = c25026k2.f120031E;
        AbstractC19074t.m100207e(overScrollableRecyclerView, "lstVideo");
        int i11 = this.f53519a0;
        RecyclerView.AbstractC1888o layoutManager = overScrollableRecyclerView.getLayoutManager();
        if (layoutManager != null) {
            view = layoutManager.mo9732P(i11);
        } else {
            view = null;
        }
        if (view instanceof VideoItem) {
            view2 = view;
        }
        VideoItem videoItem = (VideoItem) view2;
        if (videoItem != null) {
            videoItem.setControlAlpha(f11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setControlReady(boolean z11) {
        View view;
        C25026k2 c25026k2 = this.f53521c0;
        View view2 = null;
        if (c25026k2 == null) {
            AbstractC19074t.m100223u("binding");
            c25026k2 = null;
        }
        OverScrollableRecyclerView overScrollableRecyclerView = c25026k2.f120031E;
        AbstractC19074t.m100207e(overScrollableRecyclerView, "lstVideo");
        int i11 = this.f53519a0;
        RecyclerView.AbstractC1888o layoutManager = overScrollableRecyclerView.getLayoutManager();
        if (layoutManager != null) {
            view = layoutManager.mo9732P(i11);
        } else {
            view = null;
        }
        if (view instanceof VideoItem) {
            view2 = view;
        }
        VideoItem videoItem = (VideoItem) view2;
        if (videoItem != null) {
            videoItem.setControlReady(z11);
        }
        if (!z11) {
            c25026k2.f120050s.m56233e();
        }
        this.f53501F = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setPlayPauseState(boolean z11) {
        View view;
        C25026k2 c25026k2 = this.f53521c0;
        View view2 = null;
        if (c25026k2 == null) {
            AbstractC19074t.m100223u("binding");
            c25026k2 = null;
        }
        OverScrollableRecyclerView overScrollableRecyclerView = c25026k2.f120031E;
        AbstractC19074t.m100207e(overScrollableRecyclerView, "lstVideo");
        int i11 = this.f53519a0;
        RecyclerView.AbstractC1888o layoutManager = overScrollableRecyclerView.getLayoutManager();
        if (layoutManager != null) {
            view = layoutManager.mo9732P(i11);
        } else {
            view = null;
        }
        if (view instanceof VideoItem) {
            view2 = view;
        }
        VideoItem videoItem = (VideoItem) view2;
        if (videoItem != null) {
            videoItem.setPlayPauseState(z11);
        }
    }

    /* renamed from: t0 */
    private final void m55192t0(float f11, float f12, float f13, final InterfaceC18494a interfaceC18494a, final InterfaceC18505l interfaceC18505l) {
        if (f11 == f12 && f13 == 0.0f) {
            interfaceC18505l.mo205i9(Float.valueOf(f12));
            interfaceC18494a.mo12V4();
            return;
        }
        C25627g c25627g = new C25627g(new C25626f(f11));
        C25628h c25628h = new C25628h();
        c25628h.m132386d(1.0f);
        c25628h.m132388f(1000.0f);
        c25627g.m132382t(c25628h);
        c25627g.m132328c(new AbstractC25622b.r() { // from class: m20.e2
            @Override // r20.AbstractC25622b.r
            /* renamed from: a */
            public final void mo52475a(AbstractC25622b abstractC25622b, float f14, float f15) {
                VideoPageLayout.m55196v0(InterfaceC18505l.this, abstractC25622b, f14, f15);
            }
        });
        c25627g.m132327b(new AbstractC25622b.q() { // from class: m20.f2
            @Override // r20.AbstractC25622b.q
            /* renamed from: a */
            public final void mo52476a(AbstractC25622b abstractC25622b, boolean z11, float f14, float f15) {
                VideoPageLayout.m55198w0(InterfaceC18494a.this, abstractC25622b, z11, f14, f15);
            }
        });
        c25627g.m132335m(f13);
        c25627g.m132380q(f12);
        this.f53509N = c25627g;
    }

    /* renamed from: u0 */
    static /* synthetic */ void m55194u0(VideoPageLayout videoPageLayout, float f11, float f12, float f13, InterfaceC18494a interfaceC18494a, InterfaceC18505l interfaceC18505l, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = 0.0f;
        }
        if ((i11 & 2) != 0) {
            f12 = 0.0f;
        }
        if ((i11 & 4) != 0) {
            f13 = 0.0f;
        }
        if ((i11 & 8) != 0) {
            interfaceC18494a = C10557p0.f53588q;
        }
        if ((i11 & 16) != 0) {
            interfaceC18505l = C10559q0.f53590q;
        }
        videoPageLayout.m55192t0(f11, f12, f13, interfaceC18494a, interfaceC18505l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v0 */
    public static final void m55196v0(InterfaceC18505l interfaceC18505l, AbstractC25622b abstractC25622b, float f11, float f12) {
        AbstractC19074t.m100208f(interfaceC18505l, "$updAction");
        interfaceC18505l.mo205i9(Float.valueOf(f11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w0 */
    public static final void m55198w0(InterfaceC18494a interfaceC18494a, AbstractC25622b abstractC25622b, boolean z11, float f11, float f12) {
        AbstractC19074t.m100208f(interfaceC18494a, "$endAction");
        if (!z11) {
            interfaceC18494a.mo12V4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y0 */
    public final void m55201y0(boolean z11, int i11) {
        float f11;
        C25026k2 c25026k2 = this.f53521c0;
        if (c25026k2 == null) {
            AbstractC19074t.m100223u("binding");
            c25026k2 = null;
        }
        if (z11) {
            OverScrollableRecyclerView overScrollableRecyclerView = c25026k2.f120031E;
            AbstractC19074t.m100207e(overScrollableRecyclerView, "lstVideo");
            AbstractC26112n.m134367H(overScrollableRecyclerView);
            f11 = 2.1474836E9f;
        } else {
            OverScrollableRecyclerView overScrollableRecyclerView2 = c25026k2.f120031E;
            AbstractC19074t.m100207e(overScrollableRecyclerView2, "lstVideo");
            AbstractC26112n.m134431w0(overScrollableRecyclerView2);
            f11 = 0.0f;
        }
        LoadingLayout loadingLayout = c25026k2.f120035I;
        AbstractC19074t.m100207e(loadingLayout, "lytLoading");
        LinearLayout linearLayout = c25026k2.f120034H;
        AbstractC19074t.m100207e(linearLayout, "lytHeader");
        OverScrollableRefreshBar overScrollableRefreshBar = c25026k2.f120049r;
        AbstractC19074t.m100207e(overScrollableRefreshBar, "barRefresh");
        EllipsizedTextView ellipsizedTextView = c25026k2.f120041O;
        AbstractC19074t.m100207e(ellipsizedTextView, "txtFooter");
        RecyclingImageView recyclingImageView = c25026k2.f120056y;
        AbstractC19074t.m100207e(recyclingImageView, "btnEmoji");
        SimpleShadowTextView simpleShadowTextView = c25026k2.f120052u;
        AbstractC19074t.m100207e(simpleShadowTextView, "btnAnalytic");
        VideoSeekBar videoSeekBar = c25026k2.f120050s;
        AbstractC19074t.m100207e(videoSeekBar, "barSeek");
        View[] viewArr = {loadingLayout, linearLayout, overScrollableRefreshBar, ellipsizedTextView, recyclingImageView, simpleShadowTextView, videoSeekBar};
        for (int i12 = 0; i12 < 7; i12++) {
            viewArr[i12].setTranslationX(f11);
        }
        if (z11) {
            this.f53520b0 = i11;
            InterfaceC10526a interfaceC10526a = this.f53524p;
            if (interfaceC10526a != null) {
                interfaceC10526a.mo55232f(i11);
                return;
            }
            return;
        }
        this.f53520b0 = -1;
        InterfaceC10526a interfaceC10526a2 = this.f53524p;
        if (interfaceC10526a2 != null) {
            interfaceC10526a2.mo55234h(i11);
        }
    }

    /* renamed from: F */
    public final void m55203F(int i11, Video video, String str, boolean z11) {
        String str2;
        C31179n0 c31179n0;
        AbstractC19074t.m100208f(video, "video");
        AbstractC19074t.m100208f(str, "source");
        this.f53519a0 = i11;
        this.f53503H = video.m52880a0();
        if (z11) {
            m55174h0();
        }
        C25026k2 c25026k2 = this.f53521c0;
        if (c25026k2 == null) {
            AbstractC19074t.m100223u("binding");
            c25026k2 = null;
        }
        c25026k2.getRoot().setBackgroundColor(AbstractC26112n.m134426u(this, AbstractC27406a.zch_surface_background));
        int i12 = 0;
        if (video.m52915v0() && c25026k2.f120038L.m52613G()) {
            RecyclerView.AbstractC1880g adapter = c25026k2.f120031E.getAdapter();
            if (adapter instanceof C31179n0) {
                c31179n0 = (C31179n0) adapter;
            } else {
                c31179n0 = null;
            }
            if (c31179n0 != null && c31179n0.m151862c0().m51171p() == null && c31179n0.mo10003k() - 1 <= i11) {
                LinearLayout linearLayout = c25026k2.f120028B;
                AbstractC19074t.m100207e(linearLayout, "btnScrollDown");
                AbstractC26112n.m134367H(linearLayout);
                m55180k0(this, false, 1, null);
            } else {
                RecyclingImageView recyclingImageView = c25026k2.f120040N;
                Context context = getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                recyclingImageView.setImageDrawable(C27280g.m139659b(context, AbstractC23322a.zds_ic_chevron_double_up_line_24, AbstractC27406a.zch_icon_secondary));
                LinearLayout linearLayout2 = c25026k2.f120028B;
                AbstractC19074t.m100207e(linearLayout2, "btnScrollDown");
                AbstractC26112n.m134407k0(linearLayout2, new C10536f());
                LinearLayout linearLayout3 = c25026k2.f120028B;
                AbstractC19074t.m100207e(linearLayout3, "btnScrollDown");
                AbstractC26112n.m134431w0(linearLayout3);
                if (z11) {
                    m55180k0(this, false, 1, null);
                }
                if (!this.f53504I.hasMessages(0) && VideoLayout.Companion.m52630a()) {
                    m55184m0(5000L, new C10538g());
                }
            }
            EllipsizedTextView ellipsizedTextView = c25026k2.f120041O;
            AbstractC19074t.m100207e(ellipsizedTextView, "txtFooter");
            AbstractC26112n.m134367H(ellipsizedTextView);
            RecyclingImageView recyclingImageView2 = c25026k2.f120056y;
            AbstractC19074t.m100207e(recyclingImageView2, "btnEmoji");
            AbstractC26112n.m134367H(recyclingImageView2);
            SimpleShadowTextView simpleShadowTextView = c25026k2.f120052u;
            AbstractC19074t.m100207e(simpleShadowTextView, "btnAnalytic");
            AbstractC26112n.m134367H(simpleShadowTextView);
        } else {
            if (AbstractC19074t.m100204b(str, "SOURCE_CHANNEL")) {
                String m50769l = video.m52887f().m50769l();
                Channel m140377a = C27417l.f129055a.m140377a();
                if (m140377a != null) {
                    str2 = m140377a.m50769l();
                } else {
                    str2 = null;
                }
                if (AbstractC19074t.m100204b(m50769l, str2)) {
                    if (video.m52863R() == 0) {
                        EllipsizedTextView ellipsizedTextView2 = c25026k2.f120041O;
                        AbstractC19074t.m100207e(ellipsizedTextView2, "txtFooter");
                        Context context2 = getContext();
                        AbstractC19074t.m100207e(context2, "getContext(...)");
                        AbstractC26112n.m134401h0(ellipsizedTextView2, C27280g.m139659b(context2, AbstractC23322a.zch_ic_play_solid_16, AbstractC27406a.zch_icon_secondary));
                        EllipsizedTextView ellipsizedTextView3 = c25026k2.f120041O;
                        AbstractC19074t.m100207e(ellipsizedTextView3, "txtFooter");
                        AbstractC26112n.m134425t0(ellipsizedTextView3, AbstractC27406a.zch_text_secondary);
                        c25026k2.f120041O.setText(AbstractC26105g.m134334a(video.m52845H()));
                        EllipsizedTextView ellipsizedTextView4 = c25026k2.f120041O;
                        AbstractC19074t.m100207e(ellipsizedTextView4, "txtFooter");
                        AbstractC26112n.m134431w0(ellipsizedTextView4);
                    } else {
                        EllipsizedTextView ellipsizedTextView5 = c25026k2.f120041O;
                        AbstractC19074t.m100207e(ellipsizedTextView5, "txtFooter");
                        AbstractC26112n.m134401h0(ellipsizedTextView5, null);
                        EllipsizedTextView ellipsizedTextView6 = c25026k2.f120041O;
                        AbstractC19074t.m100207e(ellipsizedTextView6, "txtFooter");
                        AbstractC26112n.m134425t0(ellipsizedTextView6, AbstractC27406a.zch_text_primary_a60);
                        c25026k2.f120041O.setText(video.m52865S());
                        EllipsizedTextView ellipsizedTextView7 = c25026k2.f120041O;
                        AbstractC19074t.m100207e(ellipsizedTextView7, "txtFooter");
                        AbstractC26112n.m134431w0(ellipsizedTextView7);
                    }
                    if (video.m52883c() != null) {
                        SimpleShadowTextView simpleShadowTextView2 = c25026k2.f120052u;
                        AbstractC19074t.m100207e(simpleShadowTextView2, "btnAnalytic");
                        AbstractC26112n.m134407k0(simpleShadowTextView2, new C10540h(video));
                        SimpleShadowTextView simpleShadowTextView3 = c25026k2.f120052u;
                        AbstractC19074t.m100207e(simpleShadowTextView3, "btnAnalytic");
                        AbstractC26112n.m134431w0(simpleShadowTextView3);
                        RecyclingImageView recyclingImageView3 = c25026k2.f120056y;
                        AbstractC19074t.m100207e(recyclingImageView3, "btnEmoji");
                        AbstractC26112n.m134367H(recyclingImageView3);
                    } else {
                        SimpleShadowTextView simpleShadowTextView4 = c25026k2.f120052u;
                        AbstractC19074t.m100207e(simpleShadowTextView4, "btnAnalytic");
                        AbstractC26112n.m134367H(simpleShadowTextView4);
                        RecyclingImageView recyclingImageView4 = c25026k2.f120056y;
                        AbstractC19074t.m100207e(recyclingImageView4, "btnEmoji");
                        AbstractC26112n.m134407k0(recyclingImageView4, new C10542i(video));
                        RecyclingImageView recyclingImageView5 = c25026k2.f120056y;
                        AbstractC19074t.m100207e(recyclingImageView5, "btnEmoji");
                        AbstractC26112n.m134431w0(recyclingImageView5);
                    }
                    LinearLayout linearLayout4 = c25026k2.f120028B;
                    AbstractC19074t.m100207e(linearLayout4, "btnScrollDown");
                    AbstractC26112n.m134367H(linearLayout4);
                    m55180k0(this, false, 1, null);
                }
            }
            if (video.m52886e0()) {
                EllipsizedTextView ellipsizedTextView8 = c25026k2.f120041O;
                AbstractC19074t.m100207e(ellipsizedTextView8, "txtFooter");
                AbstractC26112n.m134425t0(ellipsizedTextView8, AbstractC27406a.zch_text_disable);
                c25026k2.f120041O.setText(this.f53498C);
                EllipsizedTextView ellipsizedTextView9 = c25026k2.f120041O;
                AbstractC19074t.m100207e(ellipsizedTextView9, "txtFooter");
                AbstractC26112n.m134431w0(ellipsizedTextView9);
                c25026k2.f120041O.setOnClickListener(null);
                RecyclingImageView recyclingImageView6 = c25026k2.f120056y;
                AbstractC19074t.m100207e(recyclingImageView6, "btnEmoji");
                AbstractC26112n.m134367H(recyclingImageView6);
                c25026k2.f120056y.setOnClickListener(null);
            } else {
                c25026k2.f120041O.setText(this.f53497B);
                EllipsizedTextView ellipsizedTextView10 = c25026k2.f120041O;
                AbstractC19074t.m100207e(ellipsizedTextView10, "txtFooter");
                AbstractC26112n.m134425t0(ellipsizedTextView10, AbstractC27406a.zch_text_primary_a60);
                EllipsizedTextView ellipsizedTextView11 = c25026k2.f120041O;
                AbstractC19074t.m100207e(ellipsizedTextView11, "txtFooter");
                AbstractC26112n.m134407k0(ellipsizedTextView11, new C10544j(video));
                EllipsizedTextView ellipsizedTextView12 = c25026k2.f120041O;
                AbstractC19074t.m100207e(ellipsizedTextView12, "txtFooter");
                AbstractC26112n.m134431w0(ellipsizedTextView12);
                RecyclingImageView recyclingImageView7 = c25026k2.f120056y;
                AbstractC19074t.m100207e(recyclingImageView7, "btnEmoji");
                AbstractC26112n.m134407k0(recyclingImageView7, new C10546k(video));
                RecyclingImageView recyclingImageView8 = c25026k2.f120056y;
                AbstractC19074t.m100207e(recyclingImageView8, "btnEmoji");
                AbstractC26112n.m134431w0(recyclingImageView8);
            }
            LinearLayout linearLayout42 = c25026k2.f120028B;
            AbstractC19074t.m100207e(linearLayout42, "btnScrollDown");
            AbstractC26112n.m134367H(linearLayout42);
            m55180k0(this, false, 1, null);
        }
        EllipsizedTextView ellipsizedTextView13 = c25026k2.f120041O;
        AbstractC19074t.m100207e(ellipsizedTextView13, "txtFooter");
        SimpleShadowTextView simpleShadowTextView5 = c25026k2.f120052u;
        AbstractC19074t.m100207e(simpleShadowTextView5, "btnAnalytic");
        LinearLayout linearLayout5 = c25026k2.f120028B;
        AbstractC19074t.m100207e(linearLayout5, "btnScrollDown");
        View[] viewArr = {ellipsizedTextView13, simpleShadowTextView5, linearLayout5};
        while (true) {
            if (i12 < 3) {
                if (AbstractC26112n.m134380U(viewArr[i12])) {
                    LinearLayout linearLayout6 = c25026k2.f120028B;
                    AbstractC19074t.m100205c(linearLayout6);
                    if (AbstractC26112n.m134380U(linearLayout6)) {
                        VideoSeekBar videoSeekBar = c25026k2.f120050s;
                        AbstractC19074t.m100207e(videoSeekBar, "barSeek");
                        AbstractC26112n.m134385Z(videoSeekBar);
                    } else {
                        VideoSeekBar videoSeekBar2 = c25026k2.f120050s;
                        AbstractC19074t.m100207e(videoSeekBar2, "barSeek");
                        AbstractC26112n.m134396f(videoSeekBar2);
                    }
                    VideoSeekBar videoSeekBar3 = c25026k2.f120050s;
                    AbstractC19074t.m100207e(videoSeekBar3, "barSeek");
                    AbstractC26112n.m134431w0(videoSeekBar3);
                } else {
                    i12++;
                }
            } else {
                VideoSeekBar videoSeekBar4 = c25026k2.f120050s;
                AbstractC19074t.m100207e(videoSeekBar4, "barSeek");
                AbstractC26112n.m134367H(videoSeekBar4);
                break;
            }
        }
        SimpleShadowTextView simpleShadowTextView6 = c25026k2.f120029C;
        AbstractC19074t.m100207e(simpleShadowTextView6, "btnSkip");
        AbstractC26112n.m134367H(simpleShadowTextView6);
        SimpleShadowTextView simpleShadowTextView7 = c25026k2.f120055x;
        AbstractC19074t.m100207e(simpleShadowTextView7, "btnDone");
        AbstractC26112n.m134367H(simpleShadowTextView7);
    }

    /* renamed from: H */
    public final void m55204H(int i11, BreakSlot breakSlot, String str) {
        AbstractC19074t.m100208f(breakSlot, "suggestion");
        AbstractC19074t.m100208f(str, "source");
        this.f53519a0 = i11;
        this.f53503H = false;
        m55174h0();
        C31179n0 c31179n0 = null;
        m55180k0(this, false, 1, null);
        C25026k2 c25026k2 = this.f53521c0;
        if (c25026k2 == null) {
            AbstractC19074t.m100223u("binding");
            c25026k2 = null;
        }
        c25026k2.getRoot().setBackgroundColor(AbstractC26112n.m134426u(this, AbstractC27406a.zch_layer_radial_blue_end));
        if (VideoLayout.Companion.m52630a() && breakSlot.m50681b() > 0) {
            m55184m0(breakSlot.m50681b(), new C10548l());
        }
        RecyclerView.AbstractC1880g adapter = c25026k2.f120031E.getAdapter();
        if (adapter instanceof C31179n0) {
            c31179n0 = (C31179n0) adapter;
        }
        if (c31179n0 != null && c31179n0.mo10003k() - 1 <= i11 && !AbstractC19074t.m100204b(str, "SOURCE_FOR_U")) {
            LinearLayout linearLayout = c25026k2.f120028B;
            AbstractC19074t.m100207e(linearLayout, "btnScrollDown");
            AbstractC26112n.m134367H(linearLayout);
        } else {
            RecyclingImageView recyclingImageView = c25026k2.f120040N;
            Context context = getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            recyclingImageView.setImageDrawable(C27280g.m139659b(context, AbstractC23322a.zds_ic_chevron_double_up_line_24, AbstractC27406a.zch_icon_secondary));
            LinearLayout linearLayout2 = c25026k2.f120028B;
            AbstractC19074t.m100207e(linearLayout2, "btnScrollDown");
            AbstractC26112n.m134407k0(linearLayout2, new C10550m());
            LinearLayout linearLayout3 = c25026k2.f120028B;
            AbstractC19074t.m100207e(linearLayout3, "btnScrollDown");
            AbstractC26112n.m134431w0(linearLayout3);
        }
        VideoSeekBar videoSeekBar = c25026k2.f120050s;
        AbstractC19074t.m100207e(videoSeekBar, "barSeek");
        AbstractC26112n.m134385Z(videoSeekBar);
        VideoSeekBar videoSeekBar2 = c25026k2.f120050s;
        AbstractC19074t.m100207e(videoSeekBar2, "barSeek");
        AbstractC26112n.m134431w0(videoSeekBar2);
        EllipsizedTextView ellipsizedTextView = c25026k2.f120041O;
        AbstractC19074t.m100207e(ellipsizedTextView, "txtFooter");
        AbstractC26112n.m134367H(ellipsizedTextView);
        RecyclingImageView recyclingImageView2 = c25026k2.f120056y;
        AbstractC19074t.m100207e(recyclingImageView2, "btnEmoji");
        AbstractC26112n.m134367H(recyclingImageView2);
        SimpleShadowTextView simpleShadowTextView = c25026k2.f120052u;
        AbstractC19074t.m100207e(simpleShadowTextView, "btnAnalytic");
        AbstractC26112n.m134367H(simpleShadowTextView);
        SimpleShadowTextView simpleShadowTextView2 = c25026k2.f120029C;
        AbstractC19074t.m100207e(simpleShadowTextView2, "btnSkip");
        AbstractC26112n.m134367H(simpleShadowTextView2);
        SimpleShadowTextView simpleShadowTextView3 = c25026k2.f120055x;
        AbstractC19074t.m100207e(simpleShadowTextView3, "btnDone");
        AbstractC26112n.m134367H(simpleShadowTextView3);
    }

    /* renamed from: I */
    public final void m55205I(int i11, LivestreamData livestreamData) {
        AbstractC19074t.m100208f(livestreamData, "stream");
        this.f53519a0 = i11;
        this.f53503H = false;
        m55174h0();
        C25026k2 c25026k2 = null;
        m55180k0(this, false, 1, null);
        C25026k2 c25026k22 = this.f53521c0;
        if (c25026k22 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c25026k2 = c25026k22;
        }
        c25026k2.getRoot().setBackgroundColor(AbstractC26112n.m134426u(this, AbstractC27406a.zch_surface_background));
        VideoSeekBar videoSeekBar = c25026k2.f120050s;
        AbstractC19074t.m100207e(videoSeekBar, "barSeek");
        AbstractC26112n.m134385Z(videoSeekBar);
        VideoSeekBar videoSeekBar2 = c25026k2.f120050s;
        AbstractC19074t.m100207e(videoSeekBar2, "barSeek");
        AbstractC26112n.m134431w0(videoSeekBar2);
        LinearLayout linearLayout = c25026k2.f120028B;
        AbstractC19074t.m100207e(linearLayout, "btnScrollDown");
        AbstractC26112n.m134367H(linearLayout);
        EllipsizedTextView ellipsizedTextView = c25026k2.f120041O;
        AbstractC19074t.m100207e(ellipsizedTextView, "txtFooter");
        AbstractC26112n.m134367H(ellipsizedTextView);
        RecyclingImageView recyclingImageView = c25026k2.f120056y;
        AbstractC19074t.m100207e(recyclingImageView, "btnEmoji");
        AbstractC26112n.m134367H(recyclingImageView);
        SimpleShadowTextView simpleShadowTextView = c25026k2.f120052u;
        AbstractC19074t.m100207e(simpleShadowTextView, "btnAnalytic");
        AbstractC26112n.m134367H(simpleShadowTextView);
        SimpleShadowTextView simpleShadowTextView2 = c25026k2.f120029C;
        AbstractC19074t.m100207e(simpleShadowTextView2, "btnSkip");
        AbstractC26112n.m134367H(simpleShadowTextView2);
        SimpleShadowTextView simpleShadowTextView3 = c25026k2.f120055x;
        AbstractC19074t.m100207e(simpleShadowTextView3, "btnDone");
        AbstractC26112n.m134367H(simpleShadowTextView3);
    }

    /* renamed from: J */
    public final void m55206J(int i11, BreakSlot breakSlot) {
        AbstractC19074t.m100208f(breakSlot, "onboarding");
        this.f53519a0 = i11;
        this.f53503H = false;
        m55174h0();
        C25026k2 c25026k2 = null;
        m55180k0(this, false, 1, null);
        C25026k2 c25026k22 = this.f53521c0;
        if (c25026k22 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c25026k2 = c25026k22;
        }
        c25026k2.getRoot().setBackgroundColor(AbstractC26112n.m134426u(this, AbstractC27406a.zch_layer_radial_blue_end));
        if (VideoLayout.Companion.m52630a() && breakSlot.m50681b() > 0) {
            m55184m0(breakSlot.m50681b(), new C10552n());
        }
        SimpleShadowTextView simpleShadowTextView = c25026k2.f120029C;
        AbstractC19074t.m100207e(simpleShadowTextView, "btnSkip");
        AbstractC26112n.m134407k0(simpleShadowTextView, new C10554o());
        SimpleShadowTextView simpleShadowTextView2 = c25026k2.f120029C;
        AbstractC19074t.m100207e(simpleShadowTextView2, "btnSkip");
        AbstractC26112n.m134431w0(simpleShadowTextView2);
        SimpleShadowTextView simpleShadowTextView3 = c25026k2.f120055x;
        AbstractC19074t.m100207e(simpleShadowTextView3, "btnDone");
        AbstractC26112n.m134407k0(simpleShadowTextView3, new C10556p(breakSlot));
        SimpleShadowTextView simpleShadowTextView4 = c25026k2.f120055x;
        AbstractC19074t.m100207e(simpleShadowTextView4, "btnDone");
        AbstractC26112n.m134431w0(simpleShadowTextView4);
        VideoSeekBar videoSeekBar = c25026k2.f120050s;
        AbstractC19074t.m100207e(videoSeekBar, "barSeek");
        AbstractC26112n.m134385Z(videoSeekBar);
        VideoSeekBar videoSeekBar2 = c25026k2.f120050s;
        AbstractC19074t.m100207e(videoSeekBar2, "barSeek");
        AbstractC26112n.m134431w0(videoSeekBar2);
        EllipsizedTextView ellipsizedTextView = c25026k2.f120041O;
        AbstractC19074t.m100207e(ellipsizedTextView, "txtFooter");
        AbstractC26112n.m134367H(ellipsizedTextView);
        RecyclingImageView recyclingImageView = c25026k2.f120056y;
        AbstractC19074t.m100207e(recyclingImageView, "btnEmoji");
        AbstractC26112n.m134367H(recyclingImageView);
        SimpleShadowTextView simpleShadowTextView5 = c25026k2.f120052u;
        AbstractC19074t.m100207e(simpleShadowTextView5, "btnAnalytic");
        AbstractC26112n.m134367H(simpleShadowTextView5);
        LinearLayout linearLayout = c25026k2.f120028B;
        AbstractC19074t.m100207e(linearLayout, "btnScrollDown");
        AbstractC26112n.m134367H(linearLayout);
        m55207K(breakSlot);
    }

    /* renamed from: K */
    public final void m55207K(BreakSlot breakSlot) {
        AbstractC19074t.m100208f(breakSlot, "onboarding");
        C25026k2 c25026k2 = this.f53521c0;
        if (c25026k2 == null) {
            AbstractC19074t.m100223u("binding");
            c25026k2 = null;
        }
        ArrayList m50685f = breakSlot.m50685f();
        if (m50685f != null && !m50685f.isEmpty()) {
            Iterator it = m50685f.iterator();
            while (it.hasNext()) {
                if (((BreakSlot.Option) it.next()).m50702c()) {
                    SimpleShadowTextView simpleShadowTextView = c25026k2.f120055x;
                    AbstractC19074t.m100207e(simpleShadowTextView, "btnDone");
                    AbstractC26112n.m134396f(simpleShadowTextView);
                    SimpleShadowTextView simpleShadowTextView2 = c25026k2.f120055x;
                    AbstractC19074t.m100207e(simpleShadowTextView2, "btnDone");
                    AbstractC26112n.m134416p(simpleShadowTextView2);
                    return;
                }
            }
        }
        SimpleShadowTextView simpleShadowTextView3 = c25026k2.f120055x;
        AbstractC19074t.m100207e(simpleShadowTextView3, "btnDone");
        AbstractC26112n.m134368I(simpleShadowTextView3);
        SimpleShadowTextView simpleShadowTextView4 = c25026k2.f120055x;
        AbstractC19074t.m100207e(simpleShadowTextView4, "btnDone");
        AbstractC26112n.m134398g(simpleShadowTextView4);
    }

    /* renamed from: L */
    public final void m55208L(int i11) {
        this.f53519a0 = i11;
        this.f53503H = false;
        m55174h0();
        C25026k2 c25026k2 = null;
        m55180k0(this, false, 1, null);
        C25026k2 c25026k22 = this.f53521c0;
        if (c25026k22 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c25026k2 = c25026k22;
        }
        c25026k2.getRoot().setBackgroundColor(AbstractC26112n.m134426u(this, AbstractC27406a.zch_surface_background));
        VideoSeekBar videoSeekBar = c25026k2.f120050s;
        AbstractC19074t.m100207e(videoSeekBar, "barSeek");
        AbstractC26112n.m134431w0(videoSeekBar);
        LinearLayout linearLayout = c25026k2.f120028B;
        AbstractC19074t.m100207e(linearLayout, "btnScrollDown");
        AbstractC26112n.m134367H(linearLayout);
        EllipsizedTextView ellipsizedTextView = c25026k2.f120041O;
        AbstractC19074t.m100207e(ellipsizedTextView, "txtFooter");
        AbstractC26112n.m134367H(ellipsizedTextView);
        RecyclingImageView recyclingImageView = c25026k2.f120056y;
        AbstractC19074t.m100207e(recyclingImageView, "btnEmoji");
        AbstractC26112n.m134367H(recyclingImageView);
        SimpleShadowTextView simpleShadowTextView = c25026k2.f120052u;
        AbstractC19074t.m100207e(simpleShadowTextView, "btnAnalytic");
        AbstractC26112n.m134367H(simpleShadowTextView);
        SimpleShadowTextView simpleShadowTextView2 = c25026k2.f120029C;
        AbstractC19074t.m100207e(simpleShadowTextView2, "btnSkip");
        AbstractC26112n.m134367H(simpleShadowTextView2);
        SimpleShadowTextView simpleShadowTextView3 = c25026k2.f120055x;
        AbstractC19074t.m100207e(simpleShadowTextView3, "btnDone");
        AbstractC26112n.m134367H(simpleShadowTextView3);
    }

    /* renamed from: M */
    public final void m55209M(int i11, BreakSlot breakSlot) {
        AbstractC19074t.m100208f(breakSlot, "survey");
        this.f53519a0 = i11;
        this.f53503H = false;
        m55174h0();
        C25026k2 c25026k2 = null;
        m55180k0(this, false, 1, null);
        C25026k2 c25026k22 = this.f53521c0;
        if (c25026k22 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c25026k2 = c25026k22;
        }
        c25026k2.getRoot().setBackgroundColor(AbstractC26112n.m134426u(this, AbstractC27406a.zch_surface_background));
        if (VideoLayout.Companion.m52630a() && breakSlot.m50681b() > 0) {
            m55184m0(breakSlot.m50681b(), new C10558q());
        }
        RecyclingImageView recyclingImageView = c25026k2.f120040N;
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        recyclingImageView.setImageDrawable(C27280g.m139659b(context, AbstractC23322a.zds_ic_chevron_double_up_line_24, AbstractC27406a.zch_icon_secondary));
        LinearLayout linearLayout = c25026k2.f120028B;
        AbstractC19074t.m100207e(linearLayout, "btnScrollDown");
        AbstractC26112n.m134407k0(linearLayout, new C10560r());
        LinearLayout linearLayout2 = c25026k2.f120028B;
        AbstractC19074t.m100207e(linearLayout2, "btnScrollDown");
        AbstractC26112n.m134431w0(linearLayout2);
        VideoSeekBar videoSeekBar = c25026k2.f120050s;
        AbstractC19074t.m100207e(videoSeekBar, "barSeek");
        AbstractC26112n.m134385Z(videoSeekBar);
        VideoSeekBar videoSeekBar2 = c25026k2.f120050s;
        AbstractC19074t.m100207e(videoSeekBar2, "barSeek");
        AbstractC26112n.m134431w0(videoSeekBar2);
        EllipsizedTextView ellipsizedTextView = c25026k2.f120041O;
        AbstractC19074t.m100207e(ellipsizedTextView, "txtFooter");
        AbstractC26112n.m134367H(ellipsizedTextView);
        RecyclingImageView recyclingImageView2 = c25026k2.f120056y;
        AbstractC19074t.m100207e(recyclingImageView2, "btnEmoji");
        AbstractC26112n.m134367H(recyclingImageView2);
        SimpleShadowTextView simpleShadowTextView = c25026k2.f120052u;
        AbstractC19074t.m100207e(simpleShadowTextView, "btnAnalytic");
        AbstractC26112n.m134367H(simpleShadowTextView);
        SimpleShadowTextView simpleShadowTextView2 = c25026k2.f120029C;
        AbstractC19074t.m100207e(simpleShadowTextView2, "btnSkip");
        AbstractC26112n.m134367H(simpleShadowTextView2);
        SimpleShadowTextView simpleShadowTextView3 = c25026k2.f120055x;
        AbstractC19074t.m100207e(simpleShadowTextView3, "btnDone");
        AbstractC26112n.m134367H(simpleShadowTextView3);
    }

    /* renamed from: N */
    public final void m55210N(int i11, Video video, String str) {
        AbstractC19074t.m100208f(video, "video");
        AbstractC19074t.m100208f(str, "source");
        m55203F(i11, video, str, false);
        C25026k2 c25026k2 = this.f53521c0;
        if (c25026k2 == null) {
            AbstractC19074t.m100223u("binding");
            c25026k2 = null;
        }
        if (this.f53501F) {
            c25026k2.f120050s.setTouchable(this.f53503H);
        }
    }

    /* renamed from: O */
    public final void m55211O() {
        if (this.f53511P) {
            this.f53511P = false;
            post(new RunnableC22748g2(this));
        }
    }

    /* renamed from: P */
    public final void m55212P() {
        if (!this.f53511P) {
            this.f53511P = true;
            post(new RunnableC22748g2(this));
        }
    }

    /* renamed from: U */
    public final boolean m55213U() {
        C25026k2 c25026k2 = this.f53521c0;
        if (c25026k2 == null) {
            AbstractC19074t.m100223u("binding");
            c25026k2 = null;
        }
        BottomGuideLayout bottomGuideLayout = c25026k2.f120033G;
        AbstractC19074t.m100207e(bottomGuideLayout, "lytGuideBottom");
        if (AbstractC26112n.m134380U(bottomGuideLayout)) {
            BottomGuideLayout bottomGuideLayout2 = c25026k2.f120033G;
            AbstractC19074t.m100207e(bottomGuideLayout2, "lytGuideBottom");
            AbstractC26112n.m134367H(bottomGuideLayout2);
            if (this.f53499D.isRunning()) {
                this.f53499D.cancel();
                return true;
            }
            return true;
        }
        return false;
    }

    /* renamed from: V */
    public final void m55214V(boolean z11) {
        float m116579b;
        C25026k2 c25026k2 = this.f53521c0;
        if (c25026k2 == null) {
            AbstractC19074t.m100223u("binding");
            c25026k2 = null;
        }
        if (z11) {
            AbstractC25622b abstractC25622b = this.f53509N;
            if (abstractC25622b != null) {
                abstractC25622b.m132329d();
            }
            this.f53523e0 = C10566v.f53599q;
            this.f53510O = 0.0f;
            m55201y0(false, 0);
            requestLayout();
            return;
        }
        if (this.f53510O == 1.0f) {
            float f11 = (-c25026k2.f120046T.getMeasuredHeight()) * this.f53510O;
            m116579b = AbstractC22543l.m116579b(c25026k2.f120046T.getMeasuredHeight() * this.f53510O * 6.0f, this.f53513R);
            m55158R(this, -c25026k2.f120046T.getMeasuredHeight(), f11, 0.0f, m116579b, new C10567w(), new C10568x(c25026k2), 4, null);
            FrameLayout frameLayout = c25026k2.f120046T;
            AbstractC19074t.m100207e(frameLayout, "vieComment");
            AbstractC26112n.m134369J(frameLayout);
        }
    }

    /* renamed from: X */
    public final void m55215X() {
        C25026k2 c25026k2 = this.f53521c0;
        if (c25026k2 == null) {
            AbstractC19074t.m100223u("binding");
            c25026k2 = null;
        }
        ProgressBar progressBar = c25026k2.f120048q;
        AbstractC19074t.m100207e(progressBar, "barLoadingMore");
        AbstractC26112n.m134367H(progressBar);
    }

    /* renamed from: Y */
    public final void m55216Y(boolean z11) {
        C25026k2 c25026k2 = this.f53521c0;
        if (c25026k2 == null) {
            AbstractC19074t.m100223u("binding");
            c25026k2 = null;
        }
        SimilarVideosLayout root = c25026k2.f120051t.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        SimilarVideosLayout.m54933K(root, z11, 0.0f, 2, null);
    }

    /* renamed from: a0 */
    public final boolean m55217a0(InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(interfaceC18494a, "action");
        if (this.f53510O >= 1.0f) {
            return true;
        }
        this.f53523e0 = interfaceC18494a;
        return false;
    }

    /* renamed from: b0 */
    public final boolean m55218b0() {
        return this.f53520b0 == 0;
    }

    /* renamed from: c0 */
    public final boolean m55219c0() {
        return this.f53518W;
    }

    /* renamed from: d0 */
    public final boolean m55220d0() {
        return this.f53520b0 == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        AbstractC19074t.m100208f(motionEvent, "event");
        C25026k2 c25026k2 = this.f53521c0;
        if (c25026k2 == null) {
            AbstractC19074t.m100223u("binding");
            c25026k2 = null;
        }
        if (this.f53522d0.isEmpty()) {
            if (m55218b0() && getNestedScrollAxes() != 0) {
                motionEvent.offsetLocation(0.0f, (1.0f - this.f53510O) * c25026k2.f120046T.getMeasuredHeight());
            }
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1 || action == 3) {
                    this.f53518W = false;
                    InterfaceC10526a interfaceC10526a = this.f53524p;
                    if (interfaceC10526a != null) {
                        interfaceC10526a.mo55231e();
                    }
                    if (!m55218b0() && !m55220d0()) {
                        SimpleShadowTextView simpleShadowTextView = c25026k2.f120052u;
                        AbstractC19074t.m100207e(simpleShadowTextView, "btnAnalytic");
                        if (AbstractC26112n.m134380U(simpleShadowTextView)) {
                            c25026k2.f120052u.getBackground().setState(new int[0]);
                        }
                        SimpleShadowTextView simpleShadowTextView2 = c25026k2.f120029C;
                        AbstractC19074t.m100207e(simpleShadowTextView2, "btnSkip");
                        if (AbstractC26112n.m134380U(simpleShadowTextView2)) {
                            c25026k2.f120029C.getBackground().setState(new int[0]);
                        }
                        SimpleShadowTextView simpleShadowTextView3 = c25026k2.f120055x;
                        AbstractC19074t.m100207e(simpleShadowTextView3, "btnDone");
                        if (AbstractC26112n.m134380U(simpleShadowTextView3)) {
                            c25026k2.f120055x.getBackground().setState(new int[0]);
                        }
                        LinearLayout linearLayout = c25026k2.f120028B;
                        AbstractC19074t.m100207e(linearLayout, "btnScrollDown");
                        if (AbstractC26112n.m134380U(linearLayout)) {
                            c25026k2.f120028B.getBackground().setState(new int[0]);
                        }
                    } else {
                        return super.dispatchTouchEvent(motionEvent);
                    }
                }
            } else {
                this.f53516U = AbstractC26104f.m134330a(motionEvent);
                this.f53518W = true;
                InterfaceC10526a interfaceC10526a2 = this.f53524p;
                if (interfaceC10526a2 != null) {
                    interfaceC10526a2.mo55233g();
                }
                if (!m55218b0() && !m55220d0()) {
                    if (this.f53504I.hasMessages(0)) {
                        m55178j0(false);
                    }
                    if (this.f53499D.isRunning()) {
                        this.f53499D.cancel();
                    }
                    SimpleShadowTextView simpleShadowTextView4 = c25026k2.f120052u;
                    AbstractC19074t.m100207e(simpleShadowTextView4, "btnAnalytic");
                    if (AbstractC26112n.m134380U(simpleShadowTextView4) && c25026k2.f120052u.getTop() <= motionEvent.getY() && c25026k2.f120052u.getLeft() <= motionEvent.getX() && c25026k2.f120052u.getRight() >= motionEvent.getX()) {
                        c25026k2.f120052u.getBackground().setState(new int[]{R.attr.state_pressed, R.attr.state_enabled});
                    }
                    SimpleShadowTextView simpleShadowTextView5 = c25026k2.f120029C;
                    AbstractC19074t.m100207e(simpleShadowTextView5, "btnSkip");
                    if (AbstractC26112n.m134380U(simpleShadowTextView5) && c25026k2.f120029C.getTop() <= motionEvent.getY() && c25026k2.f120029C.getLeft() <= motionEvent.getX() && c25026k2.f120029C.getRight() >= motionEvent.getX()) {
                        c25026k2.f120029C.getBackground().setState(new int[]{R.attr.state_pressed, R.attr.state_enabled});
                    }
                    SimpleShadowTextView simpleShadowTextView6 = c25026k2.f120055x;
                    AbstractC19074t.m100207e(simpleShadowTextView6, "btnDone");
                    if (AbstractC26112n.m134380U(simpleShadowTextView6) && c25026k2.f120055x.isEnabled() && c25026k2.f120055x.getTop() <= motionEvent.getY() && c25026k2.f120055x.getLeft() <= motionEvent.getX() && c25026k2.f120055x.getRight() >= motionEvent.getX()) {
                        c25026k2.f120055x.getBackground().setState(new int[]{R.attr.state_pressed, R.attr.state_enabled});
                    }
                    LinearLayout linearLayout2 = c25026k2.f120028B;
                    AbstractC19074t.m100207e(linearLayout2, "btnScrollDown");
                    if (AbstractC26112n.m134380U(linearLayout2) && c25026k2.f120028B.getTop() <= motionEvent.getY()) {
                        c25026k2.f120028B.getBackground().setState(new int[]{R.attr.state_pressed, R.attr.state_enabled});
                    }
                } else {
                    return super.dispatchTouchEvent(motionEvent);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final InterfaceC10526a getCallback() {
        return this.f53524p;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        if (m55218b0()) {
            return this.f53507L.m7761a();
        }
        return super.getNestedScrollAxes();
    }

    /* renamed from: o0 */
    public final boolean m55221o0() {
        C25026k2 c25026k2 = this.f53521c0;
        if (c25026k2 == null) {
            AbstractC19074t.m100223u("binding");
            c25026k2 = null;
        }
        int measuredHeight = c25026k2.f120033G.getMeasuredHeight();
        if (measuredHeight == 0) {
            return false;
        }
        final C10543i0 c10543i0 = new C10543i0(c25026k2, new C19055h0(), measuredHeight);
        ValueAnimator ofInt = ValueAnimator.ofInt(0, measuredHeight);
        ofInt.setDuration(750L);
        ofInt.setInterpolator(new OvershootInterpolator());
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: m20.m2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                VideoPageLayout.m55188p0(InterfaceC18505l.this, valueAnimator);
            }
        });
        AbstractC19074t.m100205c(ofInt);
        ofInt.addListener(new C10549l0(c25026k2));
        ofInt.addListener(new C10545j0(c10543i0, measuredHeight));
        ofInt.addListener(new C10547k0(c25026k2, this));
        ofInt.start();
        AbstractC19074t.m100207e(ofInt, "apply(...)");
        this.f53499D = ofInt;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AbstractC25622b abstractC25622b = this.f53509N;
        if (abstractC25622b != null) {
            abstractC25622b.m132329d();
        }
        this.f53508M.clear();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f53512Q = viewConfiguration.getScaledTouchSlop();
        this.f53513R = viewConfiguration.getScaledMinimumFlingVelocity() * 10;
        this.f53514S = viewConfiguration.getScaledMaximumFlingVelocity();
        C25026k2 m129869a = C25026k2.m129869a(this);
        AbstractC19074t.m100207e(m129869a, "bind(...)");
        m129869a.f120054w.setOnClickListener(new View.OnClickListener() { // from class: m20.h2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoPageLayout.m55168e0(VideoPageLayout.this, view);
            }
        });
        m129869a.f120051t.getRoot().setCallback(new C10570z(m129869a));
        m129869a.f120038L.setActiveChangedAction(new C10527a0());
        m129869a.f120038L.setPlayStateChangedAction(new C10529b0(m129869a, this));
        m129869a.f120038L.setProgressChangedAction(new C10531c0(m129869a, this));
        m129869a.f120050s.setProgressProvider(new C10533d0(m129869a));
        m129869a.f120031E.m9826E(new C10535e0(m129869a, this));
        m129869a.f120050s.setListener(new C10537f0(m129869a));
        m129869a.f120056y.setImageResource(AbstractC23322a.zch_ic_emoji_line_24);
        m129869a.f120039M.setOnClickListener(new View.OnClickListener() { // from class: m20.i2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoPageLayout.m55170f0(view);
            }
        });
        SimpleShadowTextView simpleShadowTextView = m129869a.f120027A;
        AbstractC19074t.m100207e(simpleShadowTextView, "btnRefresh");
        AbstractC26112n.m134407k0(simpleShadowTextView, new C10569y());
        this.f53521c0 = m129869a;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View view;
        InterfaceC10526a interfaceC10526a;
        AbstractC19074t.m100208f(motionEvent, "event");
        C25026k2 c25026k2 = this.f53521c0;
        View view2 = null;
        if (c25026k2 == null) {
            AbstractC19074t.m100223u("binding");
            c25026k2 = null;
        }
        if (!this.f53522d0.isEmpty()) {
            return false;
        }
        if (m55218b0()) {
            AbstractC25622b abstractC25622b = this.f53509N;
            if (abstractC25622b != null && abstractC25622b.m132331h()) {
                return true;
            }
            onTouchEvent(motionEvent);
            if (this.f53515T != null) {
                return true;
            }
            return false;
        }
        if (m55220d0()) {
            return false;
        }
        BottomGuideLayout bottomGuideLayout = c25026k2.f120033G;
        AbstractC19074t.m100207e(bottomGuideLayout, "lytGuideBottom");
        if (AbstractC26112n.m134380U(bottomGuideLayout) && ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (interfaceC10526a = this.f53524p) != null)) {
            interfaceC10526a.mo55228b();
        }
        View view3 = c25026k2.f120039M;
        AbstractC19074t.m100207e(view3, "ovlFooter");
        if (!AbstractC26112n.m134380U(view3)) {
            VideoSeekBar videoSeekBar = c25026k2.f120050s;
            AbstractC19074t.m100207e(videoSeekBar, "barSeek");
            if (!AbstractC26112n.m134379T(videoSeekBar) && c25026k2.f120050s.getTop() <= motionEvent.getY()) {
                getParent().requestDisallowInterceptTouchEvent(c25026k2.f120050s.m56229a());
                if (motionEvent.getAction() == 1) {
                    if (c25026k2.f120050s.m56232d()) {
                        if (motionEvent.getY() <= (getMeasuredHeight() + this.f53529u) - (this.f53527s * 2)) {
                            return false;
                        }
                    } else if (motionEvent.getY() <= getMeasuredHeight() - this.f53527s) {
                        OverScrollableRecyclerView overScrollableRecyclerView = c25026k2.f120031E;
                        AbstractC19074t.m100207e(overScrollableRecyclerView, "lstVideo");
                        int i11 = this.f53519a0;
                        RecyclerView.AbstractC1888o layoutManager = overScrollableRecyclerView.getLayoutManager();
                        if (layoutManager != null) {
                            view = layoutManager.mo9732P(i11);
                        } else {
                            view = null;
                        }
                        if (view instanceof VideoItem) {
                            view2 = view;
                        }
                        VideoItem videoItem = (VideoItem) view2;
                        if (videoItem == null) {
                            return true;
                        }
                        motionEvent.offsetLocation(-c25026k2.f120032F.getLeft(), -c25026k2.f120032F.getTop());
                        return videoItem.onTouchEvent(motionEvent);
                    }
                    LinearLayout linearLayout = c25026k2.f120028B;
                    AbstractC19074t.m100207e(linearLayout, "btnScrollDown");
                    if (AbstractC26112n.m134380U(linearLayout)) {
                        c25026k2.f120028B.performClick();
                    } else {
                        SimpleShadowTextView simpleShadowTextView = c25026k2.f120029C;
                        AbstractC19074t.m100207e(simpleShadowTextView, "btnSkip");
                        if (AbstractC26112n.m134380U(simpleShadowTextView) && c25026k2.f120029C.getTop() <= motionEvent.getY() && c25026k2.f120029C.getLeft() <= motionEvent.getX() && c25026k2.f120029C.getRight() >= motionEvent.getX()) {
                            c25026k2.f120029C.performClick();
                        } else {
                            SimpleShadowTextView simpleShadowTextView2 = c25026k2.f120055x;
                            AbstractC19074t.m100207e(simpleShadowTextView2, "btnDone");
                            if (AbstractC26112n.m134380U(simpleShadowTextView2) && c25026k2.f120055x.isEnabled() && c25026k2.f120055x.getTop() <= motionEvent.getY() && c25026k2.f120055x.getLeft() <= motionEvent.getX() && c25026k2.f120055x.getRight() >= motionEvent.getX()) {
                                c25026k2.f120055x.performClick();
                            } else {
                                EllipsizedTextView ellipsizedTextView = c25026k2.f120041O;
                                AbstractC19074t.m100207e(ellipsizedTextView, "txtFooter");
                                if (AbstractC26112n.m134380U(ellipsizedTextView) && c25026k2.f120041O.getLeft() <= motionEvent.getX() && c25026k2.f120041O.getRight() >= motionEvent.getX()) {
                                    c25026k2.f120041O.performClick();
                                } else {
                                    SimpleShadowTextView simpleShadowTextView3 = c25026k2.f120052u;
                                    AbstractC19074t.m100207e(simpleShadowTextView3, "btnAnalytic");
                                    if (AbstractC26112n.m134380U(simpleShadowTextView3) && c25026k2.f120052u.getTop() <= motionEvent.getY() && c25026k2.f120052u.getRight() >= motionEvent.getX()) {
                                        c25026k2.f120052u.performClick();
                                    } else {
                                        RecyclingImageView recyclingImageView = c25026k2.f120056y;
                                        AbstractC19074t.m100207e(recyclingImageView, "btnEmoji");
                                        if (AbstractC26112n.m134380U(recyclingImageView) && c25026k2.f120056y.getTop() <= motionEvent.getY() && c25026k2.f120056y.getRight() >= motionEvent.getX()) {
                                            c25026k2.f120056y.performClick();
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int i15;
        C25026k2 c25026k2 = this.f53521c0;
        if (c25026k2 == null) {
            AbstractC19074t.m100223u("binding");
            c25026k2 = null;
        }
        LoadingLayout loadingLayout = c25026k2.f120035I;
        AbstractC19074t.m100207e(loadingLayout, "lytLoading");
        AbstractC26112n.m134383X(loadingLayout, 0, 0);
        if (C3226p.Companion.m16363f()) {
            if (m55220d0()) {
                FrameLayout frameLayout = c25026k2.f120032F;
                AbstractC19074t.m100207e(frameLayout, "lytContent");
                AbstractC26112n.m134383X(frameLayout, c25026k2.f120051t.getRoot().m54966F(), 0);
            } else {
                FrameLayout frameLayout2 = c25026k2.f120032F;
                AbstractC19074t.m100207e(frameLayout2, "lytContent");
                AbstractC26112n.m134383X(frameLayout2, (int) (0 + (this.f53525q * this.f53510O)), 0);
            }
            i15 = this.f53525q;
        } else {
            i15 = this.f53525q;
            FrameLayout frameLayout3 = c25026k2.f120032F;
            AbstractC19074t.m100207e(frameLayout3, "lytContent");
            AbstractC26112n.m134383X(frameLayout3, i15, 0);
        }
        LinearLayout linearLayout = c25026k2.f120034H;
        AbstractC19074t.m100207e(linearLayout, "lytHeader");
        if (AbstractC26112n.m134378S(linearLayout)) {
            LinearLayout linearLayout2 = c25026k2.f120034H;
            AbstractC19074t.m100207e(linearLayout2, "lytHeader");
            AbstractC26112n.m134383X(linearLayout2, i15, 0);
        }
        int measuredWidth = (getMeasuredWidth() - c25026k2.f120049r.getMeasuredWidth()) / 2;
        int i16 = i15 + this.f53526r;
        OverScrollableRefreshBar overScrollableRefreshBar = c25026k2.f120049r;
        AbstractC19074t.m100207e(overScrollableRefreshBar, "barRefresh");
        AbstractC26112n.m134383X(overScrollableRefreshBar, i16, measuredWidth);
        SimpleShadowTextView simpleShadowTextView = c25026k2.f120027A;
        AbstractC19074t.m100207e(simpleShadowTextView, "btnRefresh");
        AbstractC26112n.m134383X(simpleShadowTextView, i16, (getMeasuredWidth() - c25026k2.f120027A.getMeasuredWidth()) / 2);
        ProgressBar progressBar = c25026k2.f120048q;
        AbstractC19074t.m100207e(progressBar, "barLoadingMore");
        if (AbstractC26112n.m134378S(progressBar)) {
            int measuredWidth2 = (getMeasuredWidth() - this.f53531w) / 2;
            int measuredHeight = getMeasuredHeight() - this.f53527s;
            ProgressBar progressBar2 = c25026k2.f120048q;
            AbstractC19074t.m100207e(progressBar2, "barLoadingMore");
            AbstractC26112n.m134381V(progressBar2, measuredHeight, measuredWidth2);
        }
        int measuredHeight2 = (int) (getMeasuredHeight() - (c25026k2.f120046T.getMeasuredHeight() * this.f53510O));
        FrameLayout frameLayout4 = c25026k2.f120046T;
        AbstractC19074t.m100207e(frameLayout4, "vieComment");
        AbstractC26112n.m134383X(frameLayout4, measuredHeight2, 0);
        int measuredHeight3 = m55220d0() ? 0 : getMeasuredHeight();
        SimilarVideosLayout root = c25026k2.f120051t.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        AbstractC26112n.m134383X(root, measuredHeight3, 0);
        BottomGuideLayout bottomGuideLayout = c25026k2.f120033G;
        AbstractC19074t.m100207e(bottomGuideLayout, "lytGuideBottom");
        if (AbstractC26112n.m134378S(bottomGuideLayout)) {
            int bottom = c25026k2.f120032F.getBottom();
            BottomGuideLayout bottomGuideLayout2 = c25026k2.f120033G;
            AbstractC19074t.m100207e(bottomGuideLayout2, "lytGuideBottom");
            AbstractC26112n.m134381V(bottomGuideLayout2, bottom, 0);
        }
        VideoSeekBar videoSeekBar = c25026k2.f120050s;
        AbstractC19074t.m100207e(videoSeekBar, "barSeek");
        if (AbstractC26112n.m134378S(videoSeekBar)) {
            int measuredHeight4 = getMeasuredHeight();
            VideoSeekBar videoSeekBar2 = c25026k2.f120050s;
            AbstractC19074t.m100207e(videoSeekBar2, "barSeek");
            AbstractC26112n.m134381V(videoSeekBar2, measuredHeight4, 0);
            View view = c25026k2.f120039M;
            AbstractC19074t.m100207e(view, "ovlFooter");
            if (AbstractC26112n.m134378S(view)) {
                View view2 = c25026k2.f120039M;
                AbstractC19074t.m100207e(view2, "ovlFooter");
                AbstractC26112n.m134381V(view2, measuredHeight4, 0);
            }
            LinearLayout linearLayout3 = c25026k2.f120028B;
            AbstractC19074t.m100207e(linearLayout3, "btnScrollDown");
            if (AbstractC26112n.m134378S(linearLayout3)) {
                LinearLayout linearLayout4 = c25026k2.f120028B;
                AbstractC19074t.m100207e(linearLayout4, "btnScrollDown");
                AbstractC26112n.m134381V(linearLayout4, measuredHeight4, 0);
            } else {
                EllipsizedTextView ellipsizedTextView = c25026k2.f120041O;
                AbstractC19074t.m100207e(ellipsizedTextView, "txtFooter");
                if (AbstractC26112n.m134378S(ellipsizedTextView)) {
                    EllipsizedTextView ellipsizedTextView2 = c25026k2.f120041O;
                    AbstractC19074t.m100207e(ellipsizedTextView2, "txtFooter");
                    AbstractC26112n.m134381V(ellipsizedTextView2, measuredHeight4, 0);
                    SimpleShadowTextView simpleShadowTextView2 = c25026k2.f120052u;
                    AbstractC19074t.m100207e(simpleShadowTextView2, "btnAnalytic");
                    if (AbstractC26112n.m134378S(simpleShadowTextView2)) {
                        int measuredWidth3 = c25026k2.f120041O.getMeasuredWidth();
                        int i17 = measuredHeight4 - ((this.f53527s - this.f53532x) / 2);
                        SimpleShadowTextView simpleShadowTextView3 = c25026k2.f120052u;
                        AbstractC19074t.m100207e(simpleShadowTextView3, "btnAnalytic");
                        AbstractC26112n.m134381V(simpleShadowTextView3, i17, measuredWidth3);
                    } else {
                        int measuredWidth4 = c25026k2.f120041O.getMeasuredWidth();
                        int i18 = measuredHeight4 - ((this.f53527s - this.f53534z) / 2);
                        RecyclingImageView recyclingImageView = c25026k2.f120056y;
                        AbstractC19074t.m100207e(recyclingImageView, "btnEmoji");
                        AbstractC26112n.m134381V(recyclingImageView, i18, measuredWidth4);
                    }
                } else {
                    int i19 = this.f53528t;
                    int i21 = measuredHeight4 - ((this.f53527s - this.f53532x) / 2);
                    SimpleShadowTextView simpleShadowTextView4 = c25026k2.f120029C;
                    AbstractC19074t.m100207e(simpleShadowTextView4, "btnSkip");
                    if (AbstractC26112n.m134378S(simpleShadowTextView4)) {
                        SimpleShadowTextView simpleShadowTextView5 = c25026k2.f120029C;
                        AbstractC19074t.m100207e(simpleShadowTextView5, "btnSkip");
                        AbstractC26112n.m134381V(simpleShadowTextView5, i21, i19);
                        int measuredWidth5 = i19 + c25026k2.f120029C.getMeasuredWidth() + this.f53533y;
                        SimpleShadowTextView simpleShadowTextView6 = c25026k2.f120055x;
                        AbstractC19074t.m100207e(simpleShadowTextView6, "btnDone");
                        AbstractC26112n.m134381V(simpleShadowTextView6, i21, measuredWidth5);
                    }
                }
            }
            int measuredWidth6 = (getMeasuredWidth() - c25026k2.f120037K.getMeasuredWidth()) / 2;
            int measuredHeight5 = (getMeasuredHeight() - this.f53529u) - this.f53530v;
            LinearLayout linearLayout5 = c25026k2.f120037K;
            AbstractC19074t.m100207e(linearLayout5, "lytTime");
            AbstractC26112n.m134381V(linearLayout5, measuredHeight5, measuredWidth6);
        }
        for (View view3 : this.f53522d0) {
            AbstractC26112n.m134383X(view3, (getMeasuredHeight() - view3.getMeasuredHeight()) / 2, (getMeasuredWidth() - view3.getMeasuredWidth()) / 2);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int paddingRight;
        int i13;
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        C25026k2 c25026k2 = this.f53521c0;
        if (c25026k2 == null) {
            AbstractC19074t.m100223u("binding");
            c25026k2 = null;
        }
        C3226p.a aVar = C3226p.Companion;
        int m16358a = aVar.m16358a(size, size2, this.f53525q, this.f53527s);
        int m16359b = aVar.m16359b(size, size2, this.f53511P);
        int i14 = (size2 - this.f53525q) - m16359b;
        float f11 = this.f53510O;
        if (f11 > 0.0f) {
            m16358a = (int) ((m16358a * (1.0f - f11)) + (m16359b * f11));
        }
        SimilarVideosLayout root = c25026k2.f120051t.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        AbstractC26112n.m134387a0(root, size, 1073741824, size2, 1073741824);
        if (m55220d0()) {
            m16358a = c25026k2.f120051t.getRoot().m54965E();
        }
        SimpleShadowTextView simpleShadowTextView = c25026k2.f120027A;
        AbstractC19074t.m100207e(simpleShadowTextView, "btnRefresh");
        AbstractC26112n.m134387a0(simpleShadowTextView, 0, 0, this.f53496A, 1073741824);
        FrameLayout frameLayout = c25026k2.f120032F;
        AbstractC19074t.m100207e(frameLayout, "lytContent");
        AbstractC26112n.m134387a0(frameLayout, size, 1073741824, m16358a, 1073741824);
        FrameLayout frameLayout2 = c25026k2.f120046T;
        AbstractC19074t.m100207e(frameLayout2, "vieComment");
        AbstractC26112n.m134387a0(frameLayout2, size, 1073741824, i14, 1073741824);
        LoadingLayout loadingLayout = c25026k2.f120035I;
        AbstractC19074t.m100207e(loadingLayout, "lytLoading");
        AbstractC26112n.m134387a0(loadingLayout, size, 1073741824, size2, 1073741824);
        LinearLayout linearLayout = c25026k2.f120034H;
        AbstractC19074t.m100207e(linearLayout, "lytHeader");
        if (AbstractC26112n.m134378S(linearLayout)) {
            LinearLayout linearLayout2 = c25026k2.f120034H;
            AbstractC19074t.m100207e(linearLayout2, "lytHeader");
            AbstractC26112n.m134387a0(linearLayout2, size, 1073741824, this.f53526r, 1073741824);
        }
        OverScrollableRefreshBar overScrollableRefreshBar = c25026k2.f120049r;
        AbstractC19074t.m100207e(overScrollableRefreshBar, "barRefresh");
        AbstractC26112n.m134387a0(overScrollableRefreshBar, 0, 0, 0, 0);
        ProgressBar progressBar = c25026k2.f120048q;
        AbstractC19074t.m100207e(progressBar, "barLoadingMore");
        if (AbstractC26112n.m134378S(progressBar)) {
            ProgressBar progressBar2 = c25026k2.f120048q;
            AbstractC19074t.m100207e(progressBar2, "barLoadingMore");
            int i15 = this.f53531w;
            AbstractC26112n.m134387a0(progressBar2, i15, 1073741824, i15, 1073741824);
        }
        VideoSeekBar videoSeekBar = c25026k2.f120050s;
        AbstractC19074t.m100207e(videoSeekBar, "barSeek");
        if (AbstractC26112n.m134378S(videoSeekBar)) {
            VideoSeekBar videoSeekBar2 = c25026k2.f120050s;
            AbstractC19074t.m100207e(videoSeekBar2, "barSeek");
            AbstractC26112n.m134387a0(videoSeekBar2, size, 1073741824, this.f53529u, 1073741824);
            LinearLayout linearLayout3 = c25026k2.f120037K;
            AbstractC19074t.m100207e(linearLayout3, "lytTime");
            AbstractC26112n.m134387a0(linearLayout3, 0, 0, 0, 0);
            View view = c25026k2.f120039M;
            AbstractC19074t.m100207e(view, "ovlFooter");
            if (AbstractC26112n.m134378S(view)) {
                View view2 = c25026k2.f120039M;
                AbstractC19074t.m100207e(view2, "ovlFooter");
                AbstractC26112n.m134387a0(view2, size, 1073741824, this.f53527s, 1073741824);
            }
            LinearLayout linearLayout4 = c25026k2.f120028B;
            AbstractC19074t.m100207e(linearLayout4, "btnScrollDown");
            if (AbstractC26112n.m134378S(linearLayout4)) {
                LinearLayout linearLayout5 = c25026k2.f120028B;
                AbstractC19074t.m100207e(linearLayout5, "btnScrollDown");
                AbstractC26112n.m134387a0(linearLayout5, size, 1073741824, this.f53527s, 1073741824);
            } else {
                EllipsizedTextView ellipsizedTextView = c25026k2.f120041O;
                AbstractC19074t.m100207e(ellipsizedTextView, "txtFooter");
                if (AbstractC26112n.m134378S(ellipsizedTextView)) {
                    SimpleShadowTextView simpleShadowTextView2 = c25026k2.f120052u;
                    AbstractC19074t.m100207e(simpleShadowTextView2, "btnAnalytic");
                    if (AbstractC26112n.m134378S(simpleShadowTextView2)) {
                        SimpleShadowTextView simpleShadowTextView3 = c25026k2.f120052u;
                        AbstractC19074t.m100207e(simpleShadowTextView3, "btnAnalytic");
                        AbstractC26112n.m134387a0(simpleShadowTextView3, 0, 0, this.f53532x, 1073741824);
                        paddingRight = c25026k2.f120052u.getMeasuredWidth();
                        i13 = this.f53528t;
                    } else {
                        RecyclingImageView recyclingImageView = c25026k2.f120056y;
                        AbstractC19074t.m100207e(recyclingImageView, "btnEmoji");
                        int i16 = this.f53534z;
                        AbstractC26112n.m134387a0(recyclingImageView, i16, 1073741824, i16, 1073741824);
                        paddingRight = this.f53534z - c25026k2.f120056y.getPaddingRight();
                        i13 = this.f53528t;
                    }
                    int i17 = size - (paddingRight + i13);
                    EllipsizedTextView ellipsizedTextView2 = c25026k2.f120041O;
                    AbstractC19074t.m100207e(ellipsizedTextView2, "txtFooter");
                    AbstractC26112n.m134387a0(ellipsizedTextView2, i17, 1073741824, this.f53527s, 1073741824);
                } else {
                    int i18 = (size - ((this.f53528t * 2) + this.f53533y)) / 2;
                    SimpleShadowTextView simpleShadowTextView4 = c25026k2.f120029C;
                    AbstractC19074t.m100207e(simpleShadowTextView4, "btnSkip");
                    if (AbstractC26112n.m134378S(simpleShadowTextView4)) {
                        SimpleShadowTextView simpleShadowTextView5 = c25026k2.f120029C;
                        AbstractC19074t.m100207e(simpleShadowTextView5, "btnSkip");
                        AbstractC26112n.m134387a0(simpleShadowTextView5, i18, 1073741824, this.f53532x, 1073741824);
                        SimpleShadowTextView simpleShadowTextView6 = c25026k2.f120055x;
                        AbstractC19074t.m100207e(simpleShadowTextView6, "btnDone");
                        AbstractC26112n.m134387a0(simpleShadowTextView6, i18, 1073741824, this.f53532x, 1073741824);
                    }
                }
            }
        } else {
            EllipsizedTextView ellipsizedTextView3 = c25026k2.f120041O;
            AbstractC19074t.m100207e(ellipsizedTextView3, "txtFooter");
            AbstractC26112n.m134367H(ellipsizedTextView3);
            RecyclingImageView recyclingImageView2 = c25026k2.f120056y;
            AbstractC19074t.m100207e(recyclingImageView2, "btnEmoji");
            AbstractC26112n.m134367H(recyclingImageView2);
            SimpleShadowTextView simpleShadowTextView7 = c25026k2.f120052u;
            AbstractC19074t.m100207e(simpleShadowTextView7, "btnAnalytic");
            AbstractC26112n.m134367H(simpleShadowTextView7);
            SimpleShadowTextView simpleShadowTextView8 = c25026k2.f120029C;
            AbstractC19074t.m100207e(simpleShadowTextView8, "btnSkip");
            AbstractC26112n.m134367H(simpleShadowTextView8);
            SimpleShadowTextView simpleShadowTextView9 = c25026k2.f120055x;
            AbstractC19074t.m100207e(simpleShadowTextView9, "btnDone");
            AbstractC26112n.m134367H(simpleShadowTextView9);
            LinearLayout linearLayout6 = c25026k2.f120028B;
            AbstractC19074t.m100207e(linearLayout6, "btnScrollDown");
            AbstractC26112n.m134367H(linearLayout6);
        }
        BottomGuideLayout bottomGuideLayout = c25026k2.f120033G;
        AbstractC19074t.m100207e(bottomGuideLayout, "lytGuideBottom");
        if (AbstractC26112n.m134378S(bottomGuideLayout)) {
            BottomGuideLayout bottomGuideLayout2 = c25026k2.f120033G;
            AbstractC19074t.m100207e(bottomGuideLayout2, "lytGuideBottom");
            AbstractC26112n.m134387a0(bottomGuideLayout2, size, 1073741824, 0, 0);
        }
        Iterator it = this.f53522d0.iterator();
        while (it.hasNext()) {
            ((View) it.next()).measure(i11, i12);
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f11, float f12, boolean z11) {
        AbstractC19074t.m100208f(view, "child");
        if (!m55218b0()) {
            return super.onNestedFling(view, f11, f12, z11);
        }
        if (!z11) {
            m55154D(-f12);
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f11, float f12) {
        AbstractC19074t.m100208f(view, "child");
        if (!m55218b0()) {
            return super.onNestedPreFling(view, f11, f12);
        }
        if (this.f53510O < 1.0f) {
            m55154D(-f12);
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i11, int i12, int[] iArr) {
        Integer num;
        AbstractC19074t.m100208f(view, "child");
        AbstractC19074t.m100208f(iArr, "consumed");
        if (!m55218b0()) {
            super.onNestedPreScroll(view, i11, i12, iArr);
            return;
        }
        C25026k2 c25026k2 = this.f53521c0;
        if (c25026k2 == null) {
            AbstractC19074t.m100223u("binding");
            c25026k2 = null;
        }
        int measuredHeight = c25026k2.f120046T.getMeasuredHeight();
        float f11 = measuredHeight;
        int i13 = (int) (this.f53510O * f11);
        if (i12 > 0) {
            int i14 = measuredHeight - i13;
            if (i14 > i12) {
                iArr[1] = i12;
            } else {
                iArr[1] = i14;
            }
            if (iArr[1] > 0) {
                this.f53510O = (i13 + r5) / f11;
                requestLayout();
                return;
            }
            return;
        }
        if ((view instanceof OverScrollableRecyclerView) && !view.canScrollVertically(-1) && ((OverScrollableRecyclerView) view).getOffsetY() >= 0.0f && (num = (Integer) this.f53508M.get(view)) != null && num.intValue() == 0) {
            this.f53510O = Math.max(0, i13 + i12) / f11;
            iArr[1] = i12;
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i11, int i12, int i13, int i14) {
        Integer num;
        AbstractC19074t.m100208f(view, "child");
        if (!m55218b0()) {
            super.onNestedScroll(view, i11, i12, i13, i14);
            return;
        }
        if (i12 != 0) {
            HashMap hashMap = this.f53508M;
            Integer num2 = (Integer) hashMap.get(view);
            if (num2 == null) {
                num2 = 0;
            }
            hashMap.put(view, Integer.valueOf(num2.intValue() + Math.abs(i12)));
        }
        if (i14 < 0) {
            if (((view instanceof OverScrollableRecyclerView) && (((OverScrollableRecyclerView) view).getOffsetY() != 0.0f || view.canScrollVertically(-1))) || (num = (Integer) this.f53508M.get(view)) == null || num.intValue() != 0) {
                return;
            }
            C25026k2 c25026k2 = this.f53521c0;
            if (c25026k2 == null) {
                AbstractC19074t.m100223u("binding");
                c25026k2 = null;
            }
            float measuredHeight = c25026k2.f120046T.getMeasuredHeight();
            if (((int) (this.f53510O * measuredHeight)) > (-i14)) {
                this.f53510O = (r3 + i14) / measuredHeight;
            } else {
                this.f53510O = 0.0f;
            }
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i11) {
        AbstractC19074t.m100208f(view, "child");
        AbstractC19074t.m100208f(view2, ZinstantMetaConstant.TARGET_VIEWPORT);
        if (!m55218b0()) {
            super.onNestedScrollAccepted(view, view2, i11);
        } else {
            this.f53508M.put(view2, 0);
            this.f53507L.m7762b(view, view2, i11);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        InterfaceC10526a interfaceC10526a = this.f53524p;
        if (interfaceC10526a != null) {
            interfaceC10526a.mo55227a();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i11) {
        AbstractC19074t.m100208f(view, "child");
        AbstractC19074t.m100208f(view2, ZinstantMetaConstant.TARGET_VIEWPORT);
        if (m55218b0()) {
            if ((i11 & 2) != 0) {
                return true;
            }
            return false;
        }
        return super.onStartNestedScroll(view, view2, i11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        AbstractC19074t.m100208f(view, "child");
        if (!m55218b0()) {
            super.onStopNestedScroll(view);
            return;
        }
        AbstractC25622b abstractC25622b = this.f53509N;
        if (abstractC25622b == null || !abstractC25622b.m132331h()) {
            m55155E(this, 0.0f, 1, null);
        }
        this.f53507L.m7764d(view);
        this.f53508M.remove(view);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        AbstractC19074t.m100208f(motionEvent, "event");
        if (!m55218b0()) {
            return super.onTouchEvent(motionEvent);
        }
        AbstractC25622b abstractC25622b = this.f53509N;
        if (abstractC25622b != null && abstractC25622b.m132331h()) {
            return true;
        }
        int action = motionEvent.getAction();
        C25026k2 c25026k2 = null;
        if (action != 0) {
            float f11 = 0.0f;
            if (action != 2) {
                if (this.f53517V == null) {
                    MotionEvent motionEvent2 = this.f53516U;
                    if (motionEvent2 != null) {
                        float y11 = motionEvent2.getY();
                        C25026k2 c25026k22 = this.f53521c0;
                        if (c25026k22 == null) {
                            AbstractC19074t.m100223u("binding");
                            c25026k22 = null;
                        }
                        if (y11 < c25026k22.f120046T.getTop()) {
                            float y12 = motionEvent.getY();
                            C25026k2 c25026k23 = this.f53521c0;
                            if (c25026k23 == null) {
                                AbstractC19074t.m100223u("binding");
                                c25026k23 = null;
                            }
                            if (y12 < c25026k23.f120046T.getTop()) {
                                m55161W(this, false, 1, null);
                            }
                        }
                    }
                    return true;
                }
                VelocityTracker velocityTracker2 = this.f53515T;
                if (velocityTracker2 != null) {
                    AbstractC19074t.m100205c(velocityTracker2);
                    velocityTracker2.addMovement(motionEvent);
                    VelocityTracker velocityTracker3 = this.f53515T;
                    AbstractC19074t.m100205c(velocityTracker3);
                    velocityTracker3.computeCurrentVelocity(1000, this.f53514S);
                    VelocityTracker velocityTracker4 = this.f53515T;
                    AbstractC19074t.m100205c(velocityTracker4);
                    C24860q m134358c = AbstractC26108j.m134358c(velocityTracker4, this.f53513R, this.f53514S);
                    boolean booleanValue = ((Boolean) m134358c.m129213a()).booleanValue();
                    float floatValue = ((Number) m134358c.m129214b()).floatValue();
                    if (booleanValue) {
                        f11 = floatValue;
                    }
                    m55154D(f11);
                    this.f53515T = null;
                }
                this.f53517V = null;
            } else {
                MotionEvent motionEvent3 = this.f53517V;
                if (motionEvent3 != null && getNestedScrollAxes() == 0 && this.f53515T == null && AbstractC26104f.m134333d(motionEvent3, motionEvent, this.f53512Q)) {
                    VelocityTracker obtain = VelocityTracker.obtain();
                    this.f53515T = obtain;
                    AbstractC19074t.m100205c(obtain);
                    obtain.addMovement(motionEvent3);
                    this.f53517V = AbstractC26104f.m134330a(motionEvent);
                }
                MotionEvent motionEvent4 = this.f53517V;
                if (motionEvent4 != null && getNestedScrollAxes() == 0 && (velocityTracker = this.f53515T) != null) {
                    AbstractC19074t.m100205c(velocityTracker);
                    velocityTracker.addMovement(motionEvent);
                    float y13 = motionEvent.getY() - motionEvent4.getY();
                    if (y13 < 0.0f) {
                        this.f53510O = 1.0f;
                        requestLayout();
                    } else {
                        C25026k2 c25026k24 = this.f53521c0;
                        if (c25026k24 == null) {
                            AbstractC19074t.m100223u("binding");
                        } else {
                            c25026k2 = c25026k24;
                        }
                        this.f53510O = Math.max(0.0f, 1.0f - (y13 / c25026k2.f120046T.getMeasuredHeight()));
                        requestLayout();
                    }
                }
            }
        } else {
            float y14 = motionEvent.getY();
            C25026k2 c25026k25 = this.f53521c0;
            if (c25026k25 == null) {
                AbstractC19074t.m100223u("binding");
                c25026k25 = null;
            }
            if (y14 >= c25026k25.f120046T.getTop()) {
                this.f53517V = AbstractC26104f.m134330a(motionEvent);
            } else {
                this.f53517V = null;
            }
            this.f53515T = null;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        AbstractC19074t.m100208f(view, "child");
        if (this.f53521c0 != null) {
            this.f53522d0.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        AbstractC19074t.m100208f(view, "child");
        if (this.f53521c0 != null) {
            this.f53522d0.remove(view);
        }
    }

    /* renamed from: q0 */
    public final void m55222q0() {
        C25026k2 c25026k2 = this.f53521c0;
        if (c25026k2 == null) {
            AbstractC19074t.m100223u("binding");
            c25026k2 = null;
        }
        if (this.f53510O == 0.0f) {
            m55201y0(true, 0);
            m55194u0(this, 0.0f, -c25026k2.f120046T.getMeasuredHeight(), 0.0f, new C10551m0(), new C10553n0(c25026k2), 5, null);
        }
    }

    /* renamed from: r0 */
    public final void m55223r0() {
        C25026k2 c25026k2 = this.f53521c0;
        if (c25026k2 == null) {
            AbstractC19074t.m100223u("binding");
            c25026k2 = null;
        }
        ProgressBar progressBar = c25026k2.f120048q;
        AbstractC19074t.m100207e(progressBar, "barLoadingMore");
        AbstractC26112n.m134431w0(progressBar);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z11) {
        super.requestDisallowInterceptTouchEvent(z11);
        if (!m55220d0() && !m55218b0()) {
            C25026k2 c25026k2 = this.f53521c0;
            C25026k2 c25026k22 = null;
            if (c25026k2 == null) {
                AbstractC19074t.m100223u("binding");
                c25026k2 = null;
            }
            c25026k2.f120028B.getBackground().setState(new int[0]);
            C25026k2 c25026k23 = this.f53521c0;
            if (c25026k23 == null) {
                AbstractC19074t.m100223u("binding");
                c25026k23 = null;
            }
            c25026k23.f120052u.getBackground().setState(new int[0]);
            C25026k2 c25026k24 = this.f53521c0;
            if (c25026k24 == null) {
                AbstractC19074t.m100223u("binding");
                c25026k24 = null;
            }
            c25026k24.f120029C.getBackground().setState(new int[0]);
            C25026k2 c25026k25 = this.f53521c0;
            if (c25026k25 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c25026k22 = c25026k25;
            }
            c25026k22.f120055x.getBackground().setState(new int[0]);
        }
    }

    /* renamed from: s0 */
    public final void m55224s0(Video video) {
        AbstractC19074t.m100208f(video, "video");
        C25026k2 c25026k2 = this.f53521c0;
        if (c25026k2 == null) {
            AbstractC19074t.m100223u("binding");
            c25026k2 = null;
        }
        c25026k2.f120051t.getRoot().m54970N(video);
    }

    public final void setCallback(InterfaceC10526a interfaceC10526a) {
        this.f53524p = interfaceC10526a;
    }

    /* renamed from: x0 */
    public final void m55225x0(boolean z11) {
        C25026k2 c25026k2 = this.f53521c0;
        if (c25026k2 == null) {
            AbstractC19074t.m100223u("binding");
            c25026k2 = null;
        }
        if (z11) {
            VideoSeekBar videoSeekBar = c25026k2.f120050s;
            AbstractC19074t.m100207e(videoSeekBar, "barSeek");
            AbstractC26112n.m134385Z(videoSeekBar);
            c25026k2.f120050s.setTouchable(false);
            View view = c25026k2.f120039M;
            AbstractC19074t.m100207e(view, "ovlFooter");
            AbstractC26112n.m134431w0(view);
            c25026k2.f120039M.setBackgroundColor(AbstractC26112n.m134426u(this, AbstractC27406a.zch_black_a80));
            return;
        }
        VideoSeekBar videoSeekBar2 = c25026k2.f120050s;
        AbstractC19074t.m100207e(videoSeekBar2, "barSeek");
        AbstractC26112n.m134396f(videoSeekBar2);
        View view2 = c25026k2.f120039M;
        AbstractC19074t.m100207e(view2, "ovlFooter");
        AbstractC26112n.m134367H(view2);
    }

    /* renamed from: z0 */
    public final void m55226z0(Video video, String str) {
        String str2;
        AbstractC19074t.m100208f(video, "video");
        AbstractC19074t.m100208f(str, "source");
        if (AbstractC19074t.m100204b(str, "SOURCE_CHANNEL")) {
            String m50769l = video.m52887f().m50769l();
            Channel m140377a = C27417l.f129055a.m140377a();
            if (m140377a != null) {
                str2 = m140377a.m50769l();
            } else {
                str2 = null;
            }
            if (AbstractC19074t.m100204b(m50769l, str2)) {
                return;
            }
        }
        C25026k2 c25026k2 = this.f53521c0;
        if (c25026k2 == null) {
            AbstractC19074t.m100223u("binding");
            c25026k2 = null;
        }
        if (video.m52886e0()) {
            EllipsizedTextView ellipsizedTextView = c25026k2.f120041O;
            AbstractC19074t.m100207e(ellipsizedTextView, "txtFooter");
            AbstractC26112n.m134425t0(ellipsizedTextView, AbstractC27406a.zch_text_disable);
            c25026k2.f120041O.setText(this.f53498C);
            EllipsizedTextView ellipsizedTextView2 = c25026k2.f120041O;
            AbstractC19074t.m100207e(ellipsizedTextView2, "txtFooter");
            AbstractC26112n.m134431w0(ellipsizedTextView2);
            c25026k2.f120041O.setOnClickListener(null);
            RecyclingImageView recyclingImageView = c25026k2.f120056y;
            AbstractC19074t.m100207e(recyclingImageView, "btnEmoji");
            AbstractC26112n.m134367H(recyclingImageView);
            c25026k2.f120056y.setOnClickListener(null);
            return;
        }
        c25026k2.f120041O.setText(this.f53497B);
        EllipsizedTextView ellipsizedTextView3 = c25026k2.f120041O;
        AbstractC19074t.m100207e(ellipsizedTextView3, "txtFooter");
        AbstractC26112n.m134425t0(ellipsizedTextView3, AbstractC27406a.zch_text_primary_a60);
        EllipsizedTextView ellipsizedTextView4 = c25026k2.f120041O;
        AbstractC19074t.m100207e(ellipsizedTextView4, "txtFooter");
        AbstractC26112n.m134407k0(ellipsizedTextView4, new C10561r0(video));
        EllipsizedTextView ellipsizedTextView5 = c25026k2.f120041O;
        AbstractC19074t.m100207e(ellipsizedTextView5, "txtFooter");
        AbstractC26112n.m134431w0(ellipsizedTextView5);
        RecyclingImageView recyclingImageView2 = c25026k2.f120056y;
        AbstractC19074t.m100207e(recyclingImageView2, "btnEmoji");
        AbstractC26112n.m134407k0(recyclingImageView2, new C10563s0(video));
        RecyclingImageView recyclingImageView3 = c25026k2.f120056y;
        AbstractC19074t.m100207e(recyclingImageView3, "btnEmoji");
        AbstractC26112n.m134431w0(recyclingImageView3);
    }
}

package com.zing.zalo.shortvideo.p072ui.component.p073rv.snaper;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import c20.C3220j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.model.LivestreamData;
import com.zing.zalo.shortvideo.data.utils.AbstractC9464a;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.snaper.LivestreamVideoLayout;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zmedia.view.C17391z;
import com.zing.zalo.zmedia.view.ZVideoView;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import g20.C19205a;
import im0.AbstractC20626a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.SupervisorKt;
import ln0.AbstractC22543l;
import p10.EnumC24601e;
import p354n3.C23528a;
import p379o3.AbstractRunnableC23992c;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import q10.C25025k1;
import q20.C25083f;
import q20.C25092o;
import s20.AbstractC26112n;
import u20.C26986g;
import v00.AbstractC27406a;
import v00.AbstractC27408c;
import v00.AbstractC27410e;
import v00.C27417l;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* loaded from: classes5.dex */
public final class LivestreamVideoLayout extends FrameLayout {

    /* renamed from: A */
    private InterfaceC18494a f51117A;

    /* renamed from: B */
    private InterfaceC18494a f51118B;

    /* renamed from: C */
    private final C26986g f51119C;

    /* renamed from: D */
    private C3220j f51120D;

    /* renamed from: E */
    private C9766b f51121E;

    /* renamed from: F */
    private Handler f51122F;

    /* renamed from: G */
    private final Handler f51123G;

    /* renamed from: H */
    private final long f51124H;

    /* renamed from: I */
    private final Handler f51125I;

    /* renamed from: J */
    private final long f51126J;

    /* renamed from: K */
    private long f51127K;

    /* renamed from: L */
    private int f51128L;

    /* renamed from: M */
    private float f51129M;

    /* renamed from: N */
    private int f51130N;

    /* renamed from: O */
    private final InterfaceC24854k f51131O;

    /* renamed from: P */
    private boolean f51132P;

    /* renamed from: Q */
    private final int f51133Q;

    /* renamed from: R */
    private LivestreamData f51134R;

    /* renamed from: S */
    private boolean f51135S;

    /* renamed from: T */
    private ZVideoView f51136T;

    /* renamed from: U */
    private ZVideoView f51137U;

    /* renamed from: V */
    private LivestreamData f51138V;

    /* renamed from: W */
    private long f51139W;

    /* renamed from: a0 */
    private long f51140a0;

    /* renamed from: b0 */
    private long f51141b0;

    /* renamed from: c0 */
    private long f51142c0;

    /* renamed from: d0 */
    private long f51143d0;

    /* renamed from: e0 */
    private Long f51144e0;

    /* renamed from: f0 */
    private boolean f51145f0;

    /* renamed from: p */
    private float f51146p;

    /* renamed from: q */
    private float f51147q;

    /* renamed from: r */
    private boolean f51148r;

    /* renamed from: s */
    private boolean f51149s;

    /* renamed from: t */
    private boolean f51150t;

    /* renamed from: u */
    private InterfaceC18505l f51151u;

    /* renamed from: v */
    private InterfaceC18494a f51152v;

    /* renamed from: w */
    private InterfaceC18505l f51153w;

    /* renamed from: x */
    private InterfaceC18505l f51154x;

    /* renamed from: y */
    private InterfaceC18509p f51155y;

    /* renamed from: z */
    private ArrayList f51156z;

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.LivestreamVideoLayout$a */
    /* loaded from: classes5.dex */
    static final class C9737a extends AbstractC19075u implements InterfaceC18494a {
        C9737a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C25025k1 mo12V4() {
            return C25025k1.m129868a(LivestreamVideoLayout.this);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.LivestreamVideoLayout$b */
    /* loaded from: classes5.dex */
    static final class C9738b extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final C9738b f51158q = new C9738b();

        C9738b() {
            super(1);
        }

        /* renamed from: a */
        public final void m52552a(boolean z11) {
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52552a(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.LivestreamVideoLayout$c */
    /* loaded from: classes5.dex */
    static final class C9739c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C9739c f51159q = new C9739c();

        C9739c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m52553a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m52553a() {
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.LivestreamVideoLayout$d */
    /* loaded from: classes5.dex */
    static final class C9740d extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final C9740d f51160q = new C9740d();

        C9740d() {
            super(1);
        }

        /* renamed from: a */
        public final void m52554a(boolean z11) {
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52554a(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.LivestreamVideoLayout$e */
    /* loaded from: classes5.dex */
    static final class C9741e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C9741e f51161q = new C9741e();

        C9741e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m52555a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m52555a() {
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.LivestreamVideoLayout$f */
    /* loaded from: classes5.dex */
    static final class C9742f extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final C9742f f51162q = new C9742f();

        C9742f() {
            super(1);
        }

        /* renamed from: a */
        public final void m52556a(boolean z11) {
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52556a(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.LivestreamVideoLayout$g */
    /* loaded from: classes5.dex */
    static final class C9743g extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        public static final C9743g f51163q = new C9743g();

        C9743g() {
            super(2);
        }

        /* renamed from: a */
        public final void m52557a(int i11, C9766b c9766b) {
            AbstractC19074t.m100208f(c9766b, "<anonymous parameter 1>");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m52557a(((Number) obj).intValue(), (C9766b) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.LivestreamVideoLayout$h */
    /* loaded from: classes5.dex */
    static final class C9744h extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C9744h f51164q = new C9744h();

        C9744h() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m52558a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m52558a() {
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.LivestreamVideoLayout$i */
    /* loaded from: classes5.dex */
    static final class C9745i extends AbstractC19075u implements InterfaceC18494a {
        C9745i() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m52559a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m52559a() {
            LivestreamVideoLayout.this.f51153w.mo205i9(Boolean.TRUE);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.LivestreamVideoLayout$j */
    /* loaded from: classes5.dex */
    static final class C9746j extends AbstractC19075u implements InterfaceC18494a {
        C9746j() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m52560a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m52560a() {
            LivestreamVideoLayout.this.f51153w.mo205i9(Boolean.FALSE);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.LivestreamVideoLayout$k */
    /* loaded from: classes5.dex */
    static final class C9747k extends AbstractC19075u implements InterfaceC18505l {
        C9747k() {
            super(1);
        }

        /* renamed from: a */
        public final void m52561a(long j11) {
            LivestreamVideoLayout.this.m52496d0(j11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m52561a(((Number) obj).longValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.LivestreamVideoLayout$l */
    /* loaded from: classes5.dex */
    public static final class C9748l extends C23999j {

        /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.LivestreamVideoLayout$l$a */
        /* loaded from: classes5.dex */
        static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f51169t;

            /* renamed from: u */
            final /* synthetic */ Bitmap f51170u;

            /* renamed from: v */
            final /* synthetic */ LivestreamVideoLayout f51171v;

            /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.LivestreamVideoLayout$l$a$a */
            /* loaded from: classes5.dex */
            public static final class C32734a extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f51172t;

                /* renamed from: u */
                final /* synthetic */ LivestreamVideoLayout f51173u;

                /* renamed from: v */
                final /* synthetic */ Bitmap f51174v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C32734a(LivestreamVideoLayout livestreamVideoLayout, Bitmap bitmap, Continuation continuation) {
                    super(2, continuation);
                    this.f51173u = livestreamVideoLayout;
                    this.f51174v = bitmap;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new C32734a(this.f51173u, this.f51174v, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    AbstractC28298d.m142578e();
                    if (this.f51172t == 0) {
                        AbstractC24862s.m129228b(obj);
                        this.f51173u.getBinding().f120025q.setImageBitmap(this.f51174v);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // en0.InterfaceC18509p
                /* renamed from: r */
                public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C32734a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Bitmap bitmap, LivestreamVideoLayout livestreamVideoLayout, Continuation continuation) {
                super(2, continuation);
                this.f51170u = bitmap;
                this.f51171v = livestreamVideoLayout;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f51170u, this.f51171v, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f51169t;
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    C25083f c25083f = C25083f.f120483a;
                    Bitmap m130014a = c25083f.m130014a(this.f51170u, 100.0f);
                    if (m130014a != null) {
                        LivestreamVideoLayout livestreamVideoLayout = this.f51171v;
                        c25083f.m130015c(m130014a, livestreamVideoLayout.f51133Q);
                        MainCoroutineDispatcher m112681c = Dispatchers.m112681c();
                        C32734a c32734a = new C32734a(livestreamVideoLayout, m130014a, null);
                        this.f51169t = 1;
                        if (BuildersKt.m112534g(m112681c, c32734a, this) == m142578e) {
                            return m142578e;
                        }
                    }
                }
                AbstractRunnableC23992c.m125520D();
                return C24848g0.f119245a;
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        C9748l() {
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            Bitmap m18839c;
            if (c3979l != null && (m18839c = c3979l.m18839c()) != null) {
                BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112680b().mo112823d0(SupervisorKt.m112864b(null, 1, null))), null, null, new a(m18839c, LivestreamVideoLayout.this, null), 3, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.LivestreamVideoLayout$m */
    /* loaded from: classes5.dex */
    public static final class C9749m extends AbstractC19075u implements InterfaceC18494a {
        C9749m() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m52564a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m52564a() {
            LivestreamVideoLayout.this.requestLayout();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.LivestreamVideoLayout$n */
    /* loaded from: classes5.dex */
    public static final class C9750n extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C9750n f51176q = new C9750n();

        C9750n() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m52565a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m52565a() {
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.snaper.LivestreamVideoLayout$o */
    /* loaded from: classes5.dex */
    public static final class C9751o implements ZVideoView.InterfaceC17345q {

        /* renamed from: p */
        private int f51177p = -1;

        /* renamed from: q */
        final /* synthetic */ ZVideoView f51178q;

        /* renamed from: r */
        final /* synthetic */ LivestreamVideoLayout f51179r;

        /* renamed from: s */
        final /* synthetic */ ZVideoView f51180s;

        C9751o(ZVideoView zVideoView, LivestreamVideoLayout livestreamVideoLayout, ZVideoView zVideoView2) {
            this.f51178q = zVideoView;
            this.f51179r = livestreamVideoLayout;
            this.f51180s = zVideoView2;
        }

        /* renamed from: b */
        public static final void m52567b(LivestreamVideoLayout livestreamVideoLayout, ZVideoView zVideoView) {
            LivestreamData livestreamData;
            AbstractC19074t.m100208f(livestreamVideoLayout, "this$0");
            AbstractC19074t.m100208f(zVideoView, "$this_run");
            if (livestreamVideoLayout.m52528F() && !livestreamVideoLayout.m52529G() && (livestreamData = livestreamVideoLayout.f51134R) != null && livestreamData.m51029q() == EnumC24601e.f118373r.m128090c()) {
                zVideoView.start();
            }
        }

        @Override // com.zing.zalo.zmedia.view.ZVideoView.InterfaceC17345q
        /* renamed from: D */
        public void mo44076D(int i11) {
            String str;
            String str2;
            C17391z video = this.f51178q.getVideo();
            if (video != null) {
                str = video.f88618a;
            } else {
                str = null;
            }
            LivestreamData livestreamData = this.f51179r.f51134R;
            if (livestreamData != null) {
                str2 = livestreamData.m51016f();
            } else {
                str2 = null;
            }
            if (!AbstractC19074t.m100204b(str, str2)) {
                if (i11 == 1 && this.f51179r.f51142c0 == 0) {
                    this.f51179r.f51142c0 = System.currentTimeMillis();
                }
                if (i11 == 2 && this.f51179r.f51143d0 != 0) {
                    this.f51179r.f51143d0 = System.currentTimeMillis() - this.f51179r.f51142c0;
                    return;
                }
                return;
            }
            if (i11 == this.f51180s.getCurrentState() && i11 != this.f51177p) {
                if (i11 != 3) {
                    this.f51179r.m52483N(false);
                } else {
                    this.f51179r.m52483N(!r6.getLoadingManager().m139093d());
                }
                if (i11 == -1) {
                    this.f51179r.m52482M();
                } else if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 == 3) {
                                this.f51179r.m52487T();
                                this.f51179r.f51154x.mo205i9(Boolean.TRUE);
                            } else if (i11 == 4) {
                                this.f51179r.m52512o0();
                                this.f51179r.f51154x.mo205i9(Boolean.FALSE);
                            } else if (i11 == 6) {
                                this.f51179r.m52481L();
                            }
                        } else {
                            if (this.f51179r.f51140a0 != 0) {
                                this.f51179r.f51141b0 = System.currentTimeMillis() - this.f51179r.f51140a0;
                            }
                            this.f51179r.m52481L();
                            this.f51179r.m52512o0();
                            if (this.f51179r.m52528F() && !this.f51179r.m52529G()) {
                                this.f51179r.f51122F.post(new Runnable() { // from class: c20.i

                                    /* renamed from: q */
                                    public final /* synthetic */ ZVideoView f13748q;

                                    public /* synthetic */ RunnableC3219i(ZVideoView zVideoView) {
                                        r2 = zVideoView;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        LivestreamVideoLayout.C9751o.m52567b(LivestreamVideoLayout.this, r2);
                                    }
                                });
                            }
                        }
                    } else {
                        if (this.f51179r.f51140a0 == 0) {
                            this.f51179r.f51140a0 = System.currentTimeMillis();
                        }
                        this.f51179r.m52484O();
                    }
                } else {
                    this.f51179r.f51122F.removeCallbacksAndMessages(null);
                    ZVideoView zVideoView = this.f51180s;
                    zVideoView.setViewRatio(zVideoView.getVideoRatio());
                }
                this.f51177p = i11;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivestreamVideoLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(context, "context");
        View.inflate(context, AbstractC27410e.zch_layout_livestream, this);
        setWillNotDraw(false);
        this.f51151u = C9738b.f51158q;
        this.f51152v = C9739c.f51159q;
        this.f51153w = C9740d.f51160q;
        this.f51154x = C9742f.f51162q;
        this.f51155y = C9743g.f51163q;
        this.f51156z = new ArrayList();
        this.f51117A = C9744h.f51164q;
        this.f51118B = C9741e.f51161q;
        this.f51119C = new C26986g(new C9745i(), new C9746j(), new C9747k());
        this.f51122F = new Handler(Looper.getMainLooper());
        this.f51123G = new Handler(Looper.getMainLooper());
        this.f51124H = 30000L;
        this.f51125I = new Handler(Looper.getMainLooper());
        this.f51126J = 500L;
        m129210a = AbstractC24856m.m129210a(new C9737a());
        this.f51131O = m129210a;
        this.f51133Q = AbstractC26112n.m134426u(this, AbstractC27406a.zch_curtain);
    }

    /* renamed from: D */
    private final void m52478D(boolean z11) {
        if (z11) {
            LivestreamData livestreamData = this.f51134R;
            if (livestreamData != null) {
                setBlurBackground(livestreamData);
                return;
            }
            return;
        }
        getBinding().f120025q.setImageBitmap(null);
        getBinding().f120025q.setBackgroundResource(AbstractC27406a.zch_surface_background);
    }

    /* renamed from: I */
    public static /* synthetic */ boolean m52479I(LivestreamVideoLayout livestreamVideoLayout, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return livestreamVideoLayout.m52530H(z11);
    }

    /* renamed from: K */
    private final void m52480K() {
        this.f51128L += (int) (C27417l.f129055a.m140382f().m130131a() - this.f51127K);
        Iterator it = new ArrayList(this.f51156z).iterator();
        while (it.hasNext()) {
            ((InterfaceC18505l) it.next()).mo205i9(Long.valueOf(this.f51128L));
        }
        m52544p0();
    }

    /* renamed from: L */
    public final void m52481L() {
        this.f51119C.m139092c();
        this.f51123G.removeCallbacksAndMessages(null);
    }

    /* renamed from: M */
    public final void m52482M() {
        m52484O();
    }

    /* renamed from: N */
    public final void m52483N(boolean z11) {
        if (this.f51149s != z11) {
            this.f51149s = z11;
            if (z11) {
                this.f51130N = 0;
                this.f51119C.m139095j();
                m52544p0();
                m52480K();
                m52485R();
                return;
            }
            m52511n0();
            m52480K();
        }
    }

    /* renamed from: O */
    public final void m52484O() {
        LivestreamData livestreamData = this.f51134R;
        if (livestreamData != null && livestreamData.m51029q() == EnumC24601e.f118373r.m128090c()) {
            this.f51119C.m139094h();
            Handler handler = this.f51123G;
            ZVideoView zVideoView = this.f51136T;
            if (zVideoView != null && zVideoView.getCurrentState() == 1 && !handler.hasMessages(0)) {
                handler.postDelayed(new Runnable() { // from class: c20.g
                    public /* synthetic */ RunnableC3217g() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        LivestreamVideoLayout.this.m52482M();
                    }
                }, this.f51124H);
            }
        }
    }

    /* renamed from: R */
    private final void m52485R() {
        this.f51125I.postDelayed(new Runnable() { // from class: c20.h
            public /* synthetic */ RunnableC3218h() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                LivestreamVideoLayout.m52486S(LivestreamVideoLayout.this);
            }
        }, this.f51126J);
    }

    /* renamed from: S */
    public static final void m52486S(LivestreamVideoLayout livestreamVideoLayout) {
        AbstractC19074t.m100208f(livestreamVideoLayout, "this$0");
        livestreamVideoLayout.m52485R();
        livestreamVideoLayout.m52480K();
    }

    /* renamed from: T */
    public final void m52487T() {
        float f11;
        if (this.f51136T != null) {
            C9766b c9766b = this.f51121E;
            if (c9766b != null) {
                f11 = c9766b.m52668d();
            } else {
                f11 = 1.0f;
            }
            setVolumeValue(f11);
        }
    }

    /* renamed from: W */
    private final void m52488W(int i11) {
        int m116580c;
        ZVideoView zVideoView = this.f51136T;
        if (zVideoView != null) {
            C9766b c9766b = this.f51121E;
            AbstractC19074t.m100205c(c9766b);
            C17391z m52667c = c9766b.m52667c();
            m52667c.f88629l = 8;
            zVideoView.setZVideo(m52667c);
            C9766b c9766b2 = this.f51121E;
            AbstractC19074t.m100205c(c9766b2);
            m116580c = AbstractC22543l.m116580c((int) c9766b2.m52665a(), i11);
            zVideoView.m92411e0(m116580c);
            this.f51132P = false;
        }
    }

    /* renamed from: X */
    static /* synthetic */ void m52489X(LivestreamVideoLayout livestreamVideoLayout, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        livestreamVideoLayout.m52488W(i11);
    }

    /* renamed from: Z */
    private final void m52490Z() {
        ZVideoView zVideoView = this.f51137U;
        if (zVideoView != null) {
            zVideoView.m92429s0();
            m52493b0(zVideoView);
            zVideoView.m92412f0(true);
            removeView(zVideoView);
            this.f51137U = null;
            this.f51138V = null;
        }
    }

    /* renamed from: b0 */
    private final void m52493b0(ZVideoView zVideoView) {
        zVideoView.setOnCompletionListener(null);
        zVideoView.setOnPlayerStateChangedListener(null);
        zVideoView.setOnVideoSizeChangedListener(null);
        zVideoView.setOnInfoListener(null);
        zVideoView.setOnErrorListener(null);
    }

    /* renamed from: d0 */
    public final void m52496d0(long j11) {
        LivestreamData livestreamData = this.f51134R;
        if (livestreamData != null && livestreamData.m51029q() == EnumC24601e.f118373r.m128090c() && j11 >= 6000 && AbstractC20626a.m107394j(CoreUtility.getAppContext())) {
            if (this.f51130N < 2) {
                this.f51119C.m139095j();
                C9766b c9766b = this.f51121E;
                if (c9766b == null) {
                    LivestreamData livestreamData2 = this.f51134R;
                    if (livestreamData2 != null) {
                        c9766b = C9766b.Companion.m52674a(livestreamData2);
                    } else {
                        c9766b = null;
                    }
                }
                LivestreamData livestreamData3 = this.f51134R;
                if (c9766b != null && livestreamData3 != null) {
                    m52490Z();
                    ZVideoView zVideoView = this.f51136T;
                    if (zVideoView != null) {
                        AbstractC26112n.m134431w0(zVideoView);
                    }
                    m52540j0(c9766b, livestreamData3);
                    m52525B();
                }
            } else if (this.f51145f0) {
                m52481L();
                this.f51117A.mo12V4();
                m52543m0();
                ZVideoView zVideoView2 = this.f51136T;
                if (zVideoView2 != null) {
                    AbstractC26112n.m134367H(zVideoView2);
                }
                this.f51119C.m139095j();
            }
            this.f51130N++;
        }
    }

    /* renamed from: f0 */
    public static final boolean m52499f0(ZVideoView zVideoView, LivestreamVideoLayout livestreamVideoLayout, IMediaPlayer iMediaPlayer, int i11, int i12) {
        String str;
        ZVideoView zVideoView2;
        AbstractC19074t.m100208f(zVideoView, "$videoView");
        AbstractC19074t.m100208f(livestreamVideoLayout, "this$0");
        C17391z video = zVideoView.getVideo();
        String str2 = null;
        if (video != null) {
            str = video.f88618a;
        } else {
            str = null;
        }
        LivestreamData livestreamData = livestreamVideoLayout.f51134R;
        if (livestreamData != null) {
            str2 = livestreamData.m51016f();
        }
        if (AbstractC19074t.m100204b(str, str2) && i12 == -4043 && (zVideoView2 = livestreamVideoLayout.f51136T) != null) {
            zVideoView2.m92410d0();
        }
        return true;
    }

    /* renamed from: g0 */
    public static final void m52501g0(LivestreamVideoLayout livestreamVideoLayout, ZVideoView zVideoView, IMediaPlayer iMediaPlayer, int i11, int i12, int i13, int i14) {
        Float f11;
        AbstractC19074t.m100208f(livestreamVideoLayout, "this$0");
        AbstractC19074t.m100208f(zVideoView, "$this_run");
        C9766b c9766b = livestreamVideoLayout.f51121E;
        if (c9766b != null) {
            f11 = Float.valueOf(c9766b.m52666b());
        } else {
            f11 = null;
        }
        if (!AbstractC19074t.m100203a(f11, zVideoView.getVideoRatio())) {
            C9766b c9766b2 = livestreamVideoLayout.f51121E;
            if (c9766b2 != null) {
                c9766b2.m52670f(zVideoView.getVideoRatio());
            }
            zVideoView.setViewRatio(zVideoView.getVideoRatio());
            zVideoView.requestLayout();
        }
    }

    /* renamed from: h0 */
    public static final boolean m52503h0(ZVideoView zVideoView, LivestreamVideoLayout livestreamVideoLayout, ZVideoView zVideoView2, IMediaPlayer iMediaPlayer, int i11, int i12, Object obj) {
        String str;
        AbstractC19074t.m100208f(zVideoView, "$videoView");
        AbstractC19074t.m100208f(livestreamVideoLayout, "this$0");
        AbstractC19074t.m100208f(zVideoView2, "$this_run");
        C17391z video = zVideoView.getVideo();
        String str2 = null;
        if (video != null) {
            str = video.f88618a;
        } else {
            str = null;
        }
        LivestreamData livestreamData = livestreamVideoLayout.f51134R;
        if (livestreamData != null) {
            str2 = livestreamData.m51016f();
        }
        if (!AbstractC19074t.m100204b(str, str2)) {
            return false;
        }
        boolean z11 = true;
        if (i11 != 3) {
            if (i11 != 701) {
                if (i11 == 702) {
                    livestreamVideoLayout.m52481L();
                    if (zVideoView2.getCurrentState() != 3) {
                        z11 = false;
                    }
                    livestreamVideoLayout.m52483N(z11);
                }
            } else {
                livestreamVideoLayout.m52484O();
                livestreamVideoLayout.m52483N(false);
            }
        } else {
            ZVideoView zVideoView3 = livestreamVideoLayout.f51136T;
            if (zVideoView3 != null) {
                AbstractC26112n.m134420r(zVideoView3, 0L, 0L, null, 7, null);
            }
            livestreamVideoLayout.f51152v.mo12V4();
            livestreamVideoLayout.f51132P = true;
            livestreamVideoLayout.f51152v = C9750n.f51176q;
        }
        return false;
    }

    /* renamed from: i0 */
    public static final void m52505i0(LivestreamVideoLayout livestreamVideoLayout, IMediaPlayer iMediaPlayer) {
        AbstractC19074t.m100208f(livestreamVideoLayout, "this$0");
        livestreamVideoLayout.m52496d0(6000L);
    }

    /* renamed from: n0 */
    private final void m52511n0() {
        this.f51125I.removeCallbacksAndMessages(null);
    }

    /* renamed from: o0 */
    public final void m52512o0() {
        if (this.f51136T != null) {
            setVolumeValue(0.0f);
        }
    }

    private final void setVolumeValue(float f11) {
        this.f51129M = f11;
        ZVideoView zVideoView = this.f51136T;
        if (zVideoView != null) {
            zVideoView.setVolume(f11);
        }
    }

    /* renamed from: u0 */
    private final void m52518u0() {
        C9766b c9766b = this.f51121E;
        if (c9766b == null) {
            LivestreamData livestreamData = this.f51134R;
            if (livestreamData != null) {
                c9766b = C9766b.Companion.m52674a(livestreamData);
            } else {
                c9766b = null;
            }
        }
        LivestreamData livestreamData2 = this.f51134R;
        if (c9766b != null && livestreamData2 != null) {
            m52490Z();
            ZVideoView zVideoView = this.f51136T;
            if (zVideoView != null) {
                AbstractC26112n.m134431w0(zVideoView);
            }
            m52540j0(c9766b, livestreamData2);
            m52525B();
            if (this.f51135S) {
                m52478D(false);
            }
        }
    }

    /* renamed from: w0 */
    public static /* synthetic */ void m52521w0(LivestreamVideoLayout livestreamVideoLayout, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        livestreamVideoLayout.m52549v0(i11, z11);
    }

    /* renamed from: B */
    public final void m52525B() {
        m52545q0();
        this.f51148r = true;
        m52533Q();
        this.f51151u.mo205i9(Boolean.TRUE);
    }

    /* renamed from: C */
    public final void m52526C(InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(interfaceC18505l, "action");
        this.f51156z.add(interfaceC18505l);
    }

    /* renamed from: E */
    public final void m52527E() {
        m52532P();
        m52531J(false);
        this.f51148r = false;
        this.f51151u.mo205i9(Boolean.FALSE);
    }

    /* renamed from: F */
    public final boolean m52528F() {
        return this.f51148r;
    }

    /* renamed from: G */
    public final boolean m52529G() {
        return this.f51150t;
    }

    /* renamed from: H */
    public final boolean m52530H(boolean z11) {
        ZVideoView zVideoView = this.f51136T;
        if (zVideoView != null && zVideoView.getCurrentState() == 3 && (z11 || !this.f51119C.m139093d())) {
            return true;
        }
        return false;
    }

    /* renamed from: J */
    public final void m52531J(boolean z11) {
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i11;
        String str;
        Channel m51010b;
        m52511n0();
        int i12 = this.f51128L;
        LivestreamData livestreamData = this.f51134R;
        if (i12 > 0 && livestreamData != null) {
            this.f51128L = 0;
            long j11 = this.f51139W;
            C27417l c27417l = C27417l.f129055a;
            long m130131a = c27417l.m140382f().m130131a();
            long j12 = this.f51141b0;
            if (z11) {
                this.f51140a0 = 0L;
                this.f51141b0 = 0L;
            }
            this.f51139W = 0L;
            Long l11 = this.f51144e0;
            if (l11 != null) {
                z12 = AbstractC9464a.m51719b(l11, 1L);
            } else {
                z12 = false;
            }
            Long l12 = this.f51144e0;
            if (l12 != null) {
                z13 = AbstractC9464a.m51719b(l12, 2L);
            } else {
                z13 = false;
            }
            Long l13 = this.f51144e0;
            if (l13 != null) {
                z14 = AbstractC9464a.m51719b(l13, 8L);
            } else {
                z14 = false;
            }
            Long l14 = this.f51144e0;
            if (l14 != null) {
                z15 = AbstractC9464a.m51719b(l14, 4L);
            } else {
                z15 = false;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("hide_reaction_stats", Boolean.valueOf(z13));
            linkedHashMap.put("hide_viewer_stats", Boolean.valueOf(z12));
            linkedHashMap.put("disallow_comment", Boolean.valueOf(z15));
            linkedHashMap.put("disallow_reaction", Boolean.valueOf(z14));
            Integer m51017g = livestreamData.m51017g();
            if (m51017g != null) {
                linkedHashMap.put("list_index", Integer.valueOf(m51017g.intValue()));
            }
            if (!this.f51145f0) {
                linkedHashMap.put("is_auto_swipe", Integer.valueOf(VideoLayout.Companion.m52630a() ? 1 : 0));
            }
            LivestreamData livestreamData2 = this.f51134R;
            if (livestreamData2 != null && (m51010b = livestreamData2.m51010b()) != null && m51010b.m50741Q()) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            linkedHashMap.put("is_following", Integer.valueOf(i11));
            String m51025m = livestreamData.m51025m();
            if (m51025m != null && m51025m.length() != 0) {
                if (c27417l.m140378b().m51233f()) {
                    str = "direct_zalo_message";
                } else {
                    str = "zmessage, zdinary, copy_link, other";
                }
            } else {
                str = null;
            }
            if (str != null) {
                linkedHashMap.put("share_options", str);
            }
            C19205a.d dVar = new C19205a.d(livestreamData, j12, i12, j11, m130131a, this.f51145f0, linkedHashMap);
            C19205a c19205a = C19205a.f95429a;
            c19205a.m100725b0(dVar);
            c19205a.m100719U(livestreamData.m51016f());
        }
    }

    /* renamed from: P */
    public final void m52532P() {
        ZVideoView zVideoView;
        ZVideoView zVideoView2;
        if (this.f51148r && (zVideoView = this.f51136T) != null && zVideoView.getCurrentState() == 3 && (zVideoView2 = this.f51136T) != null) {
            zVideoView2.pause();
        }
    }

    /* renamed from: Q */
    public final void m52533Q() {
        ZVideoView zVideoView;
        LivestreamData livestreamData;
        ZVideoView zVideoView2;
        if (this.f51148r) {
            ZVideoView zVideoView3 = this.f51136T;
            if (((zVideoView3 != null && zVideoView3.getCurrentState() == 4) || ((zVideoView = this.f51136T) != null && zVideoView.getCurrentState() == 2 && !this.f51150t && (livestreamData = this.f51134R) != null && livestreamData.m51029q() == EnumC24601e.f118373r.m128090c())) && (zVideoView2 = this.f51136T) != null) {
                zVideoView2.start();
            }
        }
    }

    /* renamed from: U */
    public final void m52534U(C9766b c9766b, LivestreamData livestreamData) {
        String str;
        AbstractC19074t.m100208f(c9766b, "source");
        AbstractC19074t.m100208f(livestreamData, "video");
        if (this.f51137U != null) {
            LivestreamData livestreamData2 = this.f51138V;
            if (livestreamData2 != null) {
                str = livestreamData2.m51016f();
            } else {
                str = null;
            }
            if (AbstractC19074t.m100204b(str, livestreamData.m51016f())) {
                return;
            }
        }
        m52490Z();
        ZVideoView zVideoView = new ZVideoView(getContext(), null);
        this.f51137U = zVideoView;
        this.f51138V = livestreamData;
        addView(zVideoView, 1);
        m52535V(zVideoView);
        C17391z m52667c = c9766b.m52667c();
        m52667c.f88629l = 8;
        zVideoView.setZVideo(m52667c);
        zVideoView.m92410d0();
        zVideoView.setAlpha(0.0f);
    }

    /* renamed from: V */
    public final void m52535V(ZVideoView zVideoView) {
        AbstractC19074t.m100208f(zVideoView, "videoView");
        setVideoListener(zVideoView);
        zVideoView.setKeepScreenOn(true);
        ZMediaPlayerSettings.PlayConfig playConfig = ZMediaPlayerSettings.getPlayConfig(11);
        if (playConfig != null) {
            playConfig.setAutoStartOnPrepared(false);
            playConfig.setLoopInfinite(true);
            playConfig.setEnableLiveStream(true);
        } else {
            playConfig = null;
        }
        zVideoView.setPlayConfig(playConfig);
        zVideoView.setVideoPlayerMode(1);
        zVideoView.getVideoController().setAllowShowLoadingView(false);
        zVideoView.setExcludeSystemDecorationSize(false);
        zVideoView.setForceHideController(true);
        zVideoView.setUseVideoRatio(false);
    }

    /* renamed from: Y */
    public final void m52536Y() {
        m52543m0();
        ZVideoView zVideoView = this.f51136T;
        if (zVideoView != null) {
            m52493b0(zVideoView);
            zVideoView.m92412f0(true);
        }
        ZVideoView zVideoView2 = this.f51137U;
        if (zVideoView2 != null) {
            zVideoView2.m92429s0();
            m52493b0(zVideoView2);
            zVideoView2.m92412f0(true);
        }
    }

    /* renamed from: a0 */
    public final void m52537a0() {
        ZVideoView zVideoView = this.f51136T;
        if (zVideoView != null) {
            zVideoView.m92429s0();
            m52493b0(zVideoView);
            zVideoView.m92412f0(true);
            removeView(zVideoView);
        }
        this.f51136T = null;
    }

    /* renamed from: c0 */
    public final void m52538c0(InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(interfaceC18505l, "action");
        this.f51156z.remove(interfaceC18505l);
    }

    /* renamed from: e0 */
    public final void m52539e0() {
        this.f51130N = 0;
        this.f51119C.m139095j();
        C9766b c9766b = this.f51121E;
        if (c9766b == null) {
            LivestreamData livestreamData = this.f51134R;
            if (livestreamData != null) {
                c9766b = C9766b.Companion.m52674a(livestreamData);
            } else {
                c9766b = null;
            }
        }
        LivestreamData livestreamData2 = this.f51134R;
        if (c9766b != null && livestreamData2 != null) {
            m52490Z();
            ZVideoView zVideoView = this.f51136T;
            if (zVideoView != null) {
                AbstractC26112n.m134431w0(zVideoView);
            }
            m52540j0(c9766b, livestreamData2);
            m52525B();
        }
    }

    public final C25025k1 getBinding() {
        return (C25025k1) this.f51131O.getValue();
    }

    public final LivestreamData getCurrentStreamData() {
        return this.f51134R;
    }

    public final boolean getHasFirstFrame() {
        return this.f51132P;
    }

    public final C26986g getLoadingManager() {
        return this.f51119C;
    }

    public final int getRetryCount() {
        return this.f51130N;
    }

    public final ZVideoView getVideoView() {
        return this.f51136T;
    }

    public final ZVideoView getZVideoView() {
        return this.f51136T;
    }

    /* renamed from: j0 */
    public final void m52540j0(C9766b c9766b, LivestreamData livestreamData) {
        boolean z11;
        AbstractC19074t.m100208f(c9766b, "source");
        AbstractC19074t.m100208f(livestreamData, "stream");
        m52543m0();
        ZVideoView zVideoView = this.f51137U;
        if (zVideoView != null) {
            m52537a0();
            setNextVideoView(zVideoView);
            this.f51140a0 = this.f51142c0;
            this.f51141b0 = this.f51143d0;
            this.f51142c0 = 0L;
            this.f51143d0 = 0L;
            z11 = true;
        } else {
            z11 = false;
        }
        setBlurBackground(livestreamData);
        this.f51134R = livestreamData;
        m52549v0(livestreamData.m51029q(), true);
        if (livestreamData.m51029q() == EnumC24601e.f118373r.m128090c()) {
            ZVideoView zVideoView2 = this.f51136T;
            if (zVideoView2 != null) {
                zVideoView2.setAlpha(0.0f);
            }
            this.f51121E = c9766b;
            if (!z11) {
                m52489X(this, 0, 1, null);
            } else {
                m52525B();
            }
        }
    }

    /* renamed from: k0 */
    public final void m52541k0() {
        m52545q0();
        m52544p0();
        m52480K();
        m52485R();
        this.f51140a0 = 0L;
        this.f51141b0 = 0L;
    }

    /* renamed from: l0 */
    public final void m52542l0() {
        ZVideoView zVideoView = this.f51136T;
        if (zVideoView != null) {
            AbstractC26112n.m134431w0(zVideoView);
        }
    }

    /* renamed from: m0 */
    public final void m52543m0() {
        ZVideoView zVideoView = this.f51136T;
        if (zVideoView != null) {
            zVideoView.m92429s0();
        }
        this.f51121E = null;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f51136T = getBinding().f120026r;
        ZVideoView zVideoView = getBinding().f120026r;
        AbstractC19074t.m100207e(zVideoView, "zvvVideo");
        m52535V(zVideoView);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        Rect m16328a;
        RecyclingImageView recyclingImageView = getBinding().f120025q;
        AbstractC19074t.m100207e(recyclingImageView, "rivBackground");
        AbstractC26112n.m134383X(recyclingImageView, 0, 0);
        C3220j c3220j = this.f51120D;
        if (c3220j != null && (m16328a = c3220j.m16328a()) != null) {
            ZVideoView zVideoView = this.f51136T;
            if (zVideoView != null) {
                AbstractC26112n.m134383X(zVideoView, m16328a.top, m16328a.left);
            }
            ZVideoView zVideoView2 = this.f51137U;
            if (zVideoView2 != null) {
                AbstractC26112n.m134383X(zVideoView2, m16328a.top, m16328a.left);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        Rect m16328a;
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        RecyclingImageView recyclingImageView = getBinding().f120025q;
        AbstractC19074t.m100207e(recyclingImageView, "rivBackground");
        AbstractC26112n.m134387a0(recyclingImageView, size, 1073741824, size2, 1073741824);
        C3220j c3220j = this.f51120D;
        if (c3220j != null && (m16328a = c3220j.m16328a()) != null) {
            ZVideoView zVideoView = this.f51136T;
            if (zVideoView != null) {
                AbstractC26112n.m134387a0(zVideoView, m16328a.width(), 1073741824, m16328a.height(), 1073741824);
            }
            ZVideoView zVideoView2 = this.f51137U;
            if (zVideoView2 != null) {
                AbstractC26112n.m134387a0(zVideoView2, m16328a.width(), 1073741824, m16328a.height(), 1073741824);
            }
        }
        setMeasuredDimension(size, size2);
    }

    /* renamed from: p0 */
    public final void m52544p0() {
        this.f51127K = C27417l.f129055a.m140382f().m130131a();
    }

    /* renamed from: q0 */
    public final void m52545q0() {
        this.f51139W = C27417l.f129055a.m140382f().m130131a();
    }

    /* renamed from: r0 */
    public final void m52546r0(long j11) {
        this.f51144e0 = Long.valueOf(j11);
    }

    /* renamed from: s0 */
    public final void m52547s0(boolean z11, Channel channel) {
        String str;
        Channel m51010b;
        AbstractC19074t.m100208f(channel, "channel");
        String m50769l = channel.m50769l();
        LivestreamData livestreamData = this.f51134R;
        Channel channel2 = null;
        if (livestreamData != null && (m51010b = livestreamData.m51010b()) != null) {
            str = m51010b.m50769l();
        } else {
            str = null;
        }
        if (AbstractC19074t.m100204b(m50769l, str)) {
            LivestreamData livestreamData2 = this.f51134R;
            if (livestreamData2 != null) {
                channel2 = livestreamData2.m51010b();
            }
            if (channel2 != null) {
                channel2.m50770l0(z11);
            }
        }
    }

    public final void setBlurBackground(LivestreamData livestreamData) {
        AbstractC19074t.m100208f(livestreamData, "livestreamData");
        C23528a c23528a = (C23528a) new C23528a(getContext()).m123612r(getBinding().f120025q);
        c23528a.m123599d();
        String m50754c = livestreamData.m51010b().m50754c();
        C24003n c24003n = new C24003n(C25092o.f120501a.m130066e(), AbstractC26112n.m134434z(this, AbstractC27408c.zch_placeholder_thumbnail_video), 0, false, 0, false, null, 124, null);
        C9748l c9748l = new C9748l();
        c9748l.m125609e1(true);
        C24848g0 c24848g0 = C24848g0.f119245a;
    }

    public final void setCurrentStreamData(LivestreamData livestreamData) {
        AbstractC19074t.m100208f(livestreamData, "data");
        this.f51134R = livestreamData;
    }

    public final void setDeferring(boolean z11) {
        if (this.f51150t != z11) {
            this.f51150t = z11;
        }
    }

    public final void setErrorAction(InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(interfaceC18494a, "action");
        this.f51117A = interfaceC18494a;
    }

    public final void setFirstFrameAction(InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(interfaceC18494a, "action");
        this.f51152v = interfaceC18494a;
        this.f51132P = false;
    }

    public final void setHasFirstFrame(boolean z11) {
        this.f51132P = z11;
    }

    public final void setIsStreamDetail(boolean z11) {
        this.f51145f0 = z11;
    }

    public final void setItemPosition(float f11) {
        this.f51147q = f11;
        setTranslationY(this.f51146p + f11);
    }

    public final void setListPosition(float f11) {
        this.f51146p = f11;
        setTranslationY(f11 + this.f51147q);
    }

    public final void setLoadingChangedAction(InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(interfaceC18505l, "action");
        this.f51153w = interfaceC18505l;
    }

    public final void setNewVideoView(ZVideoView zVideoView) {
        this.f51136T = zVideoView;
    }

    public final void setNextVideoView(ZVideoView zVideoView) {
        AbstractC19074t.m100208f(zVideoView, "videoView");
        this.f51136T = zVideoView;
        this.f51137U = null;
    }

    public final void setOnPlayError(InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(interfaceC18494a, "action");
        this.f51118B = interfaceC18494a;
    }

    public final void setPlayerEndedAction(InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(interfaceC18509p, "action");
        this.f51155y = interfaceC18509p;
    }

    public final void setReservedView(ZVideoView zVideoView) {
        AbstractC19074t.m100208f(zVideoView, "reservedView");
        m52537a0();
        m52493b0(zVideoView);
        this.f51136T = zVideoView;
        addView(zVideoView);
        setVideoListener(zVideoView);
    }

    public final void setRetryCount(int i11) {
        this.f51130N = i11;
    }

    public final void setSharedVideoLayoutor(C3220j c3220j) {
        AbstractC19074t.m100208f(c3220j, "layoutor");
        C3220j c3220j2 = this.f51120D;
        if (c3220j2 != null) {
            c3220j2.m16336i(null);
        }
        this.f51120D = c3220j;
        if (c3220j != null) {
            c3220j.m16336i(new C9749m());
        }
        requestLayout();
    }

    public final void setSimpleSharedLayoutor(C3220j c3220j) {
        AbstractC19074t.m100208f(c3220j, "layoutor");
        this.f51120D = c3220j;
    }

    public final void setVideoListener(ZVideoView zVideoView) {
        AbstractC19074t.m100208f(zVideoView, "videoView");
        zVideoView.setOnCompletionListener(new IMediaPlayer.OnCompletionListener() { // from class: c20.c
            public /* synthetic */ C3213c() {
            }

            @Override // com.zing.zalo.zmedia.player.IMediaPlayer.OnCompletionListener
            public final void onVideoCompletion(IMediaPlayer iMediaPlayer) {
                LivestreamVideoLayout.m52505i0(LivestreamVideoLayout.this, iMediaPlayer);
            }
        });
        zVideoView.setOnErrorListener(new IMediaPlayer.OnErrorListener() { // from class: c20.d

            /* renamed from: q */
            public final /* synthetic */ LivestreamVideoLayout f13739q;

            public /* synthetic */ C3214d(LivestreamVideoLayout this) {
                r2 = this;
            }

            @Override // com.zing.zalo.zmedia.player.IMediaPlayer.OnErrorListener
            public final boolean onError(IMediaPlayer iMediaPlayer, int i11, int i12) {
                boolean m52499f0;
                m52499f0 = LivestreamVideoLayout.m52499f0(ZVideoView.this, r2, iMediaPlayer, i11, i12);
                return m52499f0;
            }
        });
        zVideoView.setOnVideoSizeChangedListener(new IMediaPlayer.OnVideoSizeChangedListener() { // from class: c20.e

            /* renamed from: q */
            public final /* synthetic */ ZVideoView f13741q;

            public /* synthetic */ C3215e(ZVideoView zVideoView2) {
                r2 = zVideoView2;
            }

            @Override // com.zing.zalo.zmedia.player.IMediaPlayer.OnVideoSizeChangedListener
            public final void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i11, int i12, int i13, int i14) {
                LivestreamVideoLayout.m52501g0(LivestreamVideoLayout.this, r2, iMediaPlayer, i11, i12, i13, i14);
            }
        });
        zVideoView2.setOnInfoListener(new IMediaPlayer.OnInfoListener() { // from class: c20.f

            /* renamed from: q */
            public final /* synthetic */ LivestreamVideoLayout f13743q;

            /* renamed from: r */
            public final /* synthetic */ ZVideoView f13744r;

            public /* synthetic */ C3216f(LivestreamVideoLayout this, ZVideoView zVideoView2) {
                r2 = this;
                r3 = zVideoView2;
            }

            @Override // com.zing.zalo.zmedia.player.IMediaPlayer.OnInfoListener
            public final boolean onInfo(IMediaPlayer iMediaPlayer, int i11, int i12, Object obj) {
                boolean m52503h0;
                m52503h0 = LivestreamVideoLayout.m52503h0(ZVideoView.this, r2, r3, iMediaPlayer, i11, i12, obj);
                return m52503h0;
            }
        });
        zVideoView2.setOnPlayerStateChangedListener(new C9751o(zVideoView2, this, zVideoView2));
    }

    /* renamed from: t0 */
    public final void m52548t0(boolean z11) {
        this.f51135S = z11;
        if (z11) {
            LivestreamData livestreamData = this.f51134R;
            if (livestreamData != null && livestreamData.m51029q() == EnumC24601e.f118373r.m128090c()) {
                m52478D(false);
                return;
            }
            return;
        }
        m52478D(true);
    }

    /* renamed from: v0 */
    public final void m52549v0(int i11, boolean z11) {
        Integer num;
        LivestreamData livestreamData = this.f51134R;
        if (livestreamData != null) {
            num = Integer.valueOf(livestreamData.m51029q());
        } else {
            num = null;
        }
        if (num != null && i11 == num.intValue() && !z11) {
            return;
        }
        LivestreamData livestreamData2 = this.f51134R;
        if (livestreamData2 != null) {
            livestreamData2.m51011b0(i11);
        }
        EnumC24601e enumC24601e = EnumC24601e.f118373r;
        if (i11 != enumC24601e.m128090c() && this.f51135S) {
            m52478D(true);
        }
        if (i11 == EnumC24601e.f118375t.m128090c()) {
            m52543m0();
            ZVideoView zVideoView = this.f51136T;
            if (zVideoView != null) {
                AbstractC26112n.m134367H(zVideoView);
                return;
            }
            return;
        }
        if (i11 == enumC24601e.m128090c()) {
            if (!z11) {
                m52518u0();
                return;
            }
            return;
        }
        if (i11 == EnumC24601e.f118377v.m128090c()) {
            m52543m0();
            ZVideoView zVideoView2 = this.f51136T;
            if (zVideoView2 != null) {
                AbstractC26112n.m134367H(zVideoView2);
                return;
            }
            return;
        }
        if (i11 == EnumC24601e.f118376u.m128090c()) {
            m52532P();
            ZVideoView zVideoView3 = this.f51136T;
            if (zVideoView3 != null) {
                AbstractC26112n.m134367H(zVideoView3);
                return;
            }
            return;
        }
        if (i11 == EnumC24601e.f118374s.m128090c()) {
            m52481L();
            m52543m0();
            ZVideoView zVideoView4 = this.f51136T;
            if (zVideoView4 != null) {
                AbstractC26112n.m134367H(zVideoView4);
            }
        }
    }

    /* renamed from: x0 */
    public final void m52550x0(String str, String str2) {
        String str3;
        ZVideoView zVideoView;
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        AbstractC19074t.m100208f(str2, "id");
        LivestreamData livestreamData = this.f51134R;
        String str4 = null;
        if (livestreamData != null) {
            str3 = livestreamData.m51016f();
        } else {
            str3 = null;
        }
        if (AbstractC19074t.m100204b(str3, str2)) {
            LivestreamData livestreamData2 = this.f51134R;
            if (livestreamData2 != null) {
                str4 = livestreamData2.m51030t();
            }
            if (!AbstractC19074t.m100204b(str4, str)) {
                LivestreamData livestreamData3 = this.f51134R;
                if (livestreamData3 != null) {
                    livestreamData3.m51015e0(str);
                }
                LivestreamData livestreamData4 = this.f51134R;
                if (livestreamData4 != null && livestreamData4.m51029q() == EnumC24601e.f118373r.m128090c() && (zVideoView = this.f51136T) != null && !zVideoView.isPlaying()) {
                    m52518u0();
                }
            }
        }
    }
}

package com.zing.zalo.p077ui.floatingmp3;

import ac.C0708i;
import ac.C0732w;
import am.AbstractC0924m0;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.AbstractC1803x;
import com.zing.mp3.sdk.view.widgets.PlaybarView;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.libbubbleview.AbstractC8948a;
import com.zing.zalo.libbubbleview.C8949b;
import com.zing.zalo.libbubbleview.FloatingCloseButton;
import com.zing.zalo.libbubbleview.FloatingItemView;
import com.zing.zalo.p077ui.floatingmp3.C11891a;
import com.zing.zalo.p077ui.floatingmp3.FloatingMp3PlayerView;
import com.zing.zalo.zdesign.component.TrackingFrameLayout;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zview.AbstractC17454d;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19053g0;
import ho0.AbstractC20110a;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import me0.AbstractC23136l9;
import p156fb.InterfaceC18856b;
import p173fz.C19172a;
import p354n3.C23528a;
import p363nh.C23744a;
import p379o3.C23994e;
import p379o3.C23995f;
import p681yh.EnumC30982b;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;
import yt.AbstractC31072b;
import yt.AbstractC31078h;
import yt.C31071a;
import z60.InterfaceC31703f;

/* loaded from: classes5.dex */
public final class FloatingMp3PlayerView extends TrackingFrameLayout implements View.OnTouchListener, C23744a.c {
    public static final C11879a Companion = new C11879a(null);

    /* renamed from: A */
    private int f61873A;

    /* renamed from: B */
    private float f61874B;

    /* renamed from: C */
    private float f61875C;

    /* renamed from: D */
    private float f61876D;

    /* renamed from: E */
    private float f61877E;

    /* renamed from: F */
    private int f61878F;

    /* renamed from: G */
    private int f61879G;

    /* renamed from: H */
    private boolean f61880H;

    /* renamed from: I */
    private AbstractC31072b f61881I;

    /* renamed from: J */
    private boolean f61882J;

    /* renamed from: K */
    private PlaybarView f61883K;

    /* renamed from: L */
    private boolean f61884L;

    /* renamed from: M */
    private int f61885M;

    /* renamed from: N */
    private int f61886N;

    /* renamed from: O */
    private FloatingItemView.EnumC8947c f61887O;

    /* renamed from: P */
    private FloatingItemView.EnumC8947c f61888P;

    /* renamed from: Q */
    private int f61889Q;

    /* renamed from: R */
    private float f61890R;

    /* renamed from: S */
    private float f61891S;

    /* renamed from: T */
    private float f61892T;

    /* renamed from: U */
    private float f61893U;

    /* renamed from: V */
    private final float f61894V;

    /* renamed from: W */
    private float f61895W;

    /* renamed from: a0 */
    private final float f61896a0;

    /* renamed from: b0 */
    private final float f61897b0;

    /* renamed from: c0 */
    private float f61898c0;

    /* renamed from: d0 */
    private float f61899d0;

    /* renamed from: e0 */
    private String f61900e0;

    /* renamed from: f0 */
    private boolean f61901f0;

    /* renamed from: g0 */
    private boolean f61902g0;

    /* renamed from: h0 */
    private boolean f61903h0;

    /* renamed from: q */
    private final ZaloActivity f61904q;

    /* renamed from: r */
    private final CoroutineScope f61905r;

    /* renamed from: s */
    private final int f61906s;

    /* renamed from: t */
    private final int f61907t;

    /* renamed from: u */
    private C8949b f61908u;

    /* renamed from: v */
    private boolean f61909v;

    /* renamed from: w */
    private FloatingItemView.InterfaceC8946b f61910w;

    /* renamed from: x */
    private C31071a f61911x;

    /* renamed from: y */
    private InterfaceC31703f f61912y;

    /* renamed from: z */
    private long f61913z;

    /* renamed from: com.zing.zalo.ui.floatingmp3.FloatingMp3PlayerView$a */
    /* loaded from: classes5.dex */
    public static final class C11879a {
        private C11879a() {
        }

        public /* synthetic */ C11879a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.floatingmp3.FloatingMp3PlayerView$b */
    /* loaded from: classes5.dex */
    public static final class EnumC11880b extends Enum {

        /* renamed from: p */
        public static final EnumC11880b f61914p = new EnumC11880b("LEFT", 0);

        /* renamed from: q */
        public static final EnumC11880b f61915q = new EnumC11880b("RIGHT", 1);

        /* renamed from: r */
        private static final /* synthetic */ EnumC11880b[] f61916r;

        /* renamed from: s */
        private static final /* synthetic */ InterfaceC30165a f61917s;

        static {
            EnumC11880b[] m66026b = m66026b();
            f61916r = m66026b;
            f61917s = AbstractC30166b.m148796a(m66026b);
        }

        private EnumC11880b(String str, int i11) {
            super(str, i11);
        }

        /* renamed from: b */
        private static final /* synthetic */ EnumC11880b[] m66026b() {
            return new EnumC11880b[]{f61914p, f61915q};
        }

        public static EnumC11880b valueOf(String str) {
            return (EnumC11880b) Enum.valueOf(EnumC11880b.class, str);
        }

        public static EnumC11880b[] values() {
            return (EnumC11880b[]) f61916r.clone();
        }
    }

    /* renamed from: com.zing.zalo.ui.floatingmp3.FloatingMp3PlayerView$c */
    /* loaded from: classes5.dex */
    public static final class EnumC11881c extends Enum {

        /* renamed from: p */
        public static final EnumC11881c f61918p = new EnumC11881c("MINI", 0);

        /* renamed from: q */
        public static final EnumC11881c f61919q = new EnumC11881c("FULL", 1);

        /* renamed from: r */
        private static final /* synthetic */ EnumC11881c[] f61920r;

        /* renamed from: s */
        private static final /* synthetic */ InterfaceC30165a f61921s;

        static {
            EnumC11881c[] m66027b = m66027b();
            f61920r = m66027b;
            f61921s = AbstractC30166b.m148796a(m66027b);
        }

        private EnumC11881c(String str, int i11) {
            super(str, i11);
        }

        /* renamed from: b */
        private static final /* synthetic */ EnumC11881c[] m66027b() {
            return new EnumC11881c[]{f61918p, f61919q};
        }

        public static EnumC11881c valueOf(String str) {
            return (EnumC11881c) Enum.valueOf(EnumC11881c.class, str);
        }

        public static EnumC11881c[] values() {
            return (EnumC11881c[]) f61920r.clone();
        }
    }

    /* renamed from: com.zing.zalo.ui.floatingmp3.FloatingMp3PlayerView$d */
    /* loaded from: classes5.dex */
    public static final class C11882d implements InterfaceC18856b {
        C11882d() {
        }

        @Override // p156fb.InterfaceC18856b
        /* renamed from: a */
        public void mo66028a() {
            AbstractC20110a.f98889a.m104564x("ZingMp3Sdk").mo104548a("Player -> onConnectionFailed", new Object[0]);
            FloatingMp3PlayerView.this.f61902g0 = false;
            InterfaceC31703f interfaceC31703f = FloatingMp3PlayerView.this.f61912y;
            if (interfaceC31703f == null) {
                AbstractC19074t.m100223u("songListener");
                interfaceC31703f = null;
            }
            interfaceC31703f.mo66115a();
        }

        @Override // p156fb.InterfaceC18855a
        /* renamed from: b */
        public void mo66029b(ImageView imageView, String str) {
            AbstractC19074t.m100208f(imageView, "iv");
            AbstractC19074t.m100208f(str, "thumb");
            FloatingMp3PlayerView.this.m65991A(str);
        }

        @Override // p156fb.InterfaceC18856b
        /* renamed from: e */
        public void mo66030e() {
            FloatingMp3PlayerView.this.m65996J();
        }

        @Override // p156fb.InterfaceC18856b
        /* renamed from: i */
        public void mo66031i() {
            AbstractC20110a.f98889a.m104564x("ZingMp3Sdk").mo104548a("Player -> requestShow", new Object[0]);
            FloatingMp3PlayerView.this.f61902g0 = true;
            FloatingMp3PlayerView.this.m66022I();
        }

        @Override // p156fb.InterfaceC18856b
        /* renamed from: j */
        public void mo66032j() {
            AbstractC20110a.f98889a.m104564x("ZingMp3Sdk").mo104548a("Player -> requestHide", new Object[0]);
            FloatingMp3PlayerView.this.m66024u();
        }

        @Override // p156fb.InterfaceC18856b
        /* renamed from: k */
        public void mo66033k(boolean z11) {
            FloatingMp3PlayerView floatingMp3PlayerView = FloatingMp3PlayerView.this;
            floatingMp3PlayerView.m66020E(floatingMp3PlayerView.getXForCurrentMode(), FloatingMp3PlayerView.this.f61891S, 0L);
        }
    }

    /* renamed from: com.zing.zalo.ui.floatingmp3.FloatingMp3PlayerView$e */
    /* loaded from: classes5.dex */
    public static final class C11883e extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f61923t;

        C11883e(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C11883e(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            boolean z11;
            AbstractC28298d.m142578e();
            if (this.f61923t == 0) {
                AbstractC24862s.m129228b(obj);
                FloatingMp3PlayerView.this.f61873A = AbstractC0924m0.m3243M3();
                int m100600k = C19172a.m100600k("floating_mp3@dismiss_threshold", 3);
                boolean z12 = false;
                AbstractC20110a.f98889a.m104564x("ZingMp3Sdk").mo104548a("Dismiss threshold = " + m100600k + ", dismiss count = " + FloatingMp3PlayerView.this.f61873A, new Object[0]);
                PlaybarView playbarView = FloatingMp3PlayerView.this.f61883K;
                if (playbarView == null) {
                    AbstractC19074t.m100223u("playBarView");
                    playbarView = null;
                }
                if (FloatingMp3PlayerView.this.f61873A >= m100600k) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                playbarView.setOnlyShowWhenPlaying(z11);
                if (C19172a.m100600k("floating_mp3@stay_in_app", 1) == 1) {
                    z12 = true;
                }
                playbarView.setStayInAppWhenResume(z12);
                playbarView.setOpenMusicAppWhenResumeIntervalInMillis(C19172a.m100600k("floating_mp3@open_app_interval", 3600) * 1000);
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C11883e) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.floatingmp3.FloatingMp3PlayerView$f */
    /* loaded from: classes5.dex */
    public static final class C11884f extends C23994e {

        /* renamed from: w0 */
        final /* synthetic */ String f61926w0;

        C11884f(String str) {
            this.f61926w0 = str;
        }

        @Override // p379o3.AbstractRunnableC23992c
        /* renamed from: B1 */
        public void mo1932C(String str, Bitmap bitmap, C23995f c23995f) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(c23995f, "status");
            FloatingMp3PlayerView.this.f61900e0 = this.f61926w0;
            PlaybarView playbarView = null;
            if (c23995f.m125657h() != 200) {
                PlaybarView playbarView2 = FloatingMp3PlayerView.this.f61883K;
                if (playbarView2 == null) {
                    AbstractC19074t.m100223u("playBarView");
                    playbarView2 = null;
                }
                playbarView2.getIvThumb().setImageBitmap(null);
                return;
            }
            if (bitmap != null) {
                PlaybarView playbarView3 = FloatingMp3PlayerView.this.f61883K;
                if (playbarView3 == null) {
                    AbstractC19074t.m100223u("playBarView");
                } else {
                    playbarView = playbarView3;
                }
                playbarView.getIvThumb().setImageBitmap(bitmap);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.floatingmp3.FloatingMp3PlayerView$g */
    /* loaded from: classes5.dex */
    static final class C11885g extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f61927t;

        C11885g(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C11885g(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f61927t == 0) {
                AbstractC24862s.m129228b(obj);
                PlaybarView playbarView = FloatingMp3PlayerView.this.f61883K;
                if (playbarView == null) {
                    AbstractC19074t.m100223u("playBarView");
                    playbarView = null;
                }
                if (!playbarView.getOnlyShowWhenPlaying()) {
                    FloatingMp3PlayerView floatingMp3PlayerView = FloatingMp3PlayerView.this;
                    floatingMp3PlayerView.f61873A++;
                    AbstractC0924m0.m3347Pk(floatingMp3PlayerView.f61873A);
                }
                AbstractC20110a.f98889a.m104564x("ZingMp3Sdk").mo104548a("Dismiss count after session end = " + FloatingMp3PlayerView.this.f61873A, new Object[0]);
                AbstractC0924m0.m3492Uk(System.currentTimeMillis());
                AbstractC0924m0.m3434Sk(0L);
                C0732w m1189a = C0732w.Companion.m1189a();
                C0708i c0708i = new C0708i();
                c0708i.m1073d("duration", System.currentTimeMillis() - FloatingMp3PlayerView.this.f61913z);
                C24848g0 c24848g0 = C24848g0.f119245a;
                C0732w.m1177r(m1189a, "floating_mp3_drag_to_dismiss", null, c0708i, null, 10, null);
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C11885g) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.floatingmp3.FloatingMp3PlayerView$h */
    /* loaded from: classes5.dex */
    public static final class C11886h extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f61929t;

        /* renamed from: com.zing.zalo.ui.floatingmp3.FloatingMp3PlayerView$h$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f61931t;

            /* renamed from: u */
            final /* synthetic */ FloatingMp3PlayerView f61932u;

            /* renamed from: v */
            final /* synthetic */ C19053g0 f61933v;

            /* renamed from: w */
            final /* synthetic */ C19053g0 f61934w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(FloatingMp3PlayerView floatingMp3PlayerView, C19053g0 c19053g0, C19053g0 c19053g02, Continuation continuation) {
                super(2, continuation);
                this.f61932u = floatingMp3PlayerView;
                this.f61933v = c19053g0;
                this.f61934w = c19053g02;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f61932u, this.f61933v, this.f61934w, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f61931t == 0) {
                    AbstractC24862s.m129228b(obj);
                    FloatingMp3PlayerView.m65999N(this.f61932u, this.f61933v.f94930p, this.f61934w.f94930p, false, 0L, false, 28, null);
                    return C24848g0.f119245a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        C11886h(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C11886h(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f61929t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                float mo47818z = C11891a.b.m66078g(C11891a.Companion, null, 1, null).mo47818z();
                C19053g0 c19053g0 = new C19053g0();
                c19053g0.f94930p = FloatingMp3PlayerView.this.getMaxX();
                C19053g0 c19053g02 = new C19053g0();
                c19053g02.f94930p = FloatingMp3PlayerView.this.getMaxY() / 2;
                if (mo47818z > 0.0f) {
                    FloatingMp3PlayerView.this.f61889Q = AbstractC0924m0.m3330P3();
                    c19053g0.f94930p = FloatingMp3PlayerView.this.getXForCurrentMode();
                    c19053g02.f94930p = mo47818z * FloatingMp3PlayerView.this.getMaxY();
                }
                MainCoroutineDispatcher m112681c = Dispatchers.m112681c();
                a aVar = new a(FloatingMp3PlayerView.this, c19053g0, c19053g02, null);
                this.f61929t = 1;
                if (BuildersKt.m112534g(m112681c, aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C11886h) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.floatingmp3.FloatingMp3PlayerView$i */
    /* loaded from: classes5.dex */
    public static final class C11887i extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f61935t;

        C11887i(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C11887i(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f61935t == 0) {
                AbstractC24862s.m129228b(obj);
                C0732w.m1177r(C0732w.Companion.m1189a(), "floating_mp3_player_visible", null, null, null, 14, null);
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C11887i) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.floatingmp3.FloatingMp3PlayerView$j */
    /* loaded from: classes5.dex */
    public static final class C11888j extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f61936t;

        C11888j(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C11888j(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f61936t == 0) {
                AbstractC24862s.m129228b(obj);
                AbstractC0924m0.m3463Tk(FloatingMp3PlayerView.this.f61889Q);
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C11888j) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingMp3PlayerView(C8949b c8949b, Context context, AbstractC31072b abstractC31072b, FloatingItemView.InterfaceC8946b interfaceC8946b, C31071a c31071a, InterfaceC31703f interfaceC31703f) {
        super(context, null, 0);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(abstractC31072b, "floatingItemData");
        AbstractC19074t.m100208f(interfaceC8946b, "mAButtonListener");
        AbstractC19074t.m100208f(c31071a, "floatingConfig");
        AbstractC19074t.m100208f(interfaceC31703f, "mp3SongListener");
        Context context2 = getContext();
        AbstractC19074t.m100206d(context2, "null cannot be cast to non-null type com.zing.zalo.activity.ZaloActivity");
        ZaloActivity zaloActivity = (ZaloActivity) context2;
        this.f61904q = zaloActivity;
        this.f61905r = AbstractC1803x.m9388a(zaloActivity);
        AbstractC8948a.a aVar = AbstractC8948a.Companion;
        Context context3 = getContext();
        AbstractC19074t.m100205c(context3);
        this.f61906s = aVar.m47751c(context3, 50.0f);
        this.f61907t = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f61882J = true;
        this.f61889Q = EnumC11880b.f61915q.ordinal();
        this.f61892T = 1.0f;
        this.f61893U = 0.5f;
        AbstractC19074t.m100207e(getContext(), "getContext(...)");
        this.f61894V = aVar.m47751c(r1, 16.0f);
        this.f61895W = (AbstractC23136l9.m118725l0(getContext()) * 3) / 4;
        Context context4 = getContext();
        AbstractC19074t.m100207e(context4, "getContext(...)");
        float m47751c = aVar.m47751c(context4, 16.0f);
        this.f61896a0 = m47751c;
        Context context5 = getContext();
        AbstractC19074t.m100207e(context5, "getContext(...)");
        float m47751c2 = aVar.m47751c(context5, 24.0f);
        this.f61897b0 = m47751c2;
        AbstractC19074t.m100207e(getContext(), "getContext(...)");
        float f11 = 2;
        this.f61898c0 = aVar.m47751c(r4, 58.0f) + (m47751c * f11);
        AbstractC19074t.m100207e(getContext(), "getContext(...)");
        this.f61899d0 = aVar.m47751c(r1, 58.0f) + (m47751c2 * f11);
        this.f61901f0 = true;
        this.f61908u = c8949b;
        this.f61881I = abstractC31072b;
        this.f61910w = interfaceC8946b;
        this.f61911x = c31071a;
        this.f61912y = interfaceC31703f;
        m66017w();
    }

    /* renamed from: A */
    public final void m65991A(String str) {
        AbstractC20110a.f98889a.m104564x("ZingMp3Sdk").mo104548a("Player -> load thumb: " + str, new Object[0]);
        if (str.length() == 0) {
            return;
        }
        new C23528a(getContext()).m123596a(str, Bitmap.class, 0L, new C11884f(str));
    }

    /* renamed from: B */
    private final void m65992B() {
        PlaybarView playbarView = this.f61883K;
        PlaybarView playbarView2 = null;
        if (playbarView == null) {
            AbstractC19074t.m100223u("playBarView");
            playbarView = null;
        }
        playbarView.measure(-2, -2);
        PlaybarView playbarView3 = this.f61883K;
        if (playbarView3 == null) {
            AbstractC19074t.m100223u("playBarView");
            playbarView3 = null;
        }
        this.f61898c0 = playbarView3.getMeasuredWidth();
        PlaybarView playbarView4 = this.f61883K;
        if (playbarView4 == null) {
            AbstractC19074t.m100223u("playBarView");
        } else {
            playbarView2 = playbarView4;
        }
        this.f61899d0 = playbarView2.getMeasuredHeight();
    }

    /* renamed from: C */
    public static final void m65993C(FloatingMp3PlayerView floatingMp3PlayerView) {
        AbstractC19074t.m100208f(floatingMp3PlayerView, "this$0");
        floatingMp3PlayerView.m66019D();
    }

    /* renamed from: G */
    private final void m65994G() {
        BuildersKt__Builders_commonKt.m112540d(this.f61905r, Dispatchers.m112680b(), null, new C11886h(null), 2, null);
    }

    /* renamed from: H */
    private final void m65995H() {
        InterfaceC31703f interfaceC31703f = null;
        if (this.f61901f0) {
            this.f61901f0 = false;
            BuildersKt__Builders_commonKt.m112540d(this.f61905r, Dispatchers.m112680b(), null, new C11887i(null), 2, null);
        }
        PlaybarView playbarView = this.f61883K;
        if (playbarView == null) {
            AbstractC19074t.m100223u("playBarView");
            playbarView = null;
        }
        if (playbarView.getVisibility() == 0) {
            InterfaceC31703f interfaceC31703f2 = this.f61912y;
            if (interfaceC31703f2 == null) {
                AbstractC19074t.m100223u("songListener");
            } else {
                interfaceC31703f = interfaceC31703f2;
            }
            interfaceC31703f.mo66116b();
            return;
        }
        m65999N(this, getXForCurrentMode(), this.f61891S, false, 0L, false, 28, null);
        PlaybarView playbarView2 = this.f61883K;
        if (playbarView2 == null) {
            AbstractC19074t.m100223u("playBarView");
            playbarView2 = null;
        }
        playbarView2.setVisibility(0);
        InterfaceC31703f interfaceC31703f3 = this.f61912y;
        if (interfaceC31703f3 == null) {
            AbstractC19074t.m100223u("songListener");
        } else {
            interfaceC31703f = interfaceC31703f3;
        }
        interfaceC31703f.mo66116b();
        AbstractC20110a.f98889a.m104564x("ZingMp3Sdk").mo104548a("STATE: view visible", new Object[0]);
    }

    /* renamed from: J */
    public final void m65996J() {
        Bundle bundle = new Bundle();
        bundle.putInt("SHOW_WITH_FLAGS", 16777216);
        this.f61904q.mo35579p().m93069k2(Mp3SongZdsModalBottomSheet.class, bundle, 2, true);
    }

    /* renamed from: L */
    private final void m65997L() {
        boolean z11;
        int i11;
        int i12;
        FloatingItemView.EnumC8947c enumC8947c = this.f61887O;
        FloatingItemView.EnumC8947c enumC8947c2 = this.f61888P;
        if (enumC8947c == enumC8947c2) {
            return;
        }
        this.f61887O = enumC8947c2;
        if (enumC8947c2 == FloatingItemView.EnumC8947c.f47808q) {
            z11 = true;
        } else {
            z11 = false;
        }
        PlaybarView playbarView = this.f61883K;
        PlaybarView playbarView2 = null;
        if (playbarView == null) {
            AbstractC19074t.m100223u("playBarView");
            playbarView = null;
        }
        ViewGroup.LayoutParams layoutParams = playbarView.getLayoutParams();
        if (z11) {
            AbstractC8948a.a aVar = AbstractC8948a.Companion;
            Context context = getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            C31071a c31071a = this.f61911x;
            if (c31071a == null) {
                AbstractC19074t.m100223u("floatingConfig");
                c31071a = null;
            }
            float m150987n = c31071a.m150987n();
            C31071a c31071a2 = this.f61911x;
            if (c31071a2 == null) {
                AbstractC19074t.m100223u("floatingConfig");
                c31071a2 = null;
            }
            i11 = aVar.m47751c(context, m150987n * c31071a2.m150976c());
        } else {
            i11 = (int) this.f61895W;
        }
        layoutParams.width = i11;
        if (z11) {
            AbstractC8948a.a aVar2 = AbstractC8948a.Companion;
            Context context2 = getContext();
            AbstractC19074t.m100207e(context2, "getContext(...)");
            C31071a c31071a3 = this.f61911x;
            if (c31071a3 == null) {
                AbstractC19074t.m100223u("floatingConfig");
                c31071a3 = null;
            }
            float m150985l = c31071a3.m150985l();
            C31071a c31071a4 = this.f61911x;
            if (c31071a4 == null) {
                AbstractC19074t.m100223u("floatingConfig");
                c31071a4 = null;
            }
            i12 = aVar2.m47751c(context2, m150985l * c31071a4.m150976c());
        } else {
            i12 = -2;
        }
        layoutParams.height = i12;
        PlaybarView playbarView3 = this.f61883K;
        if (playbarView3 == null) {
            AbstractC19074t.m100223u("playBarView");
        } else {
            playbarView2 = playbarView3;
        }
        playbarView2.setLayoutParams(layoutParams);
    }

    /* renamed from: M */
    private final void m65998M(float f11, float f12, boolean z11, long j11, boolean z12) {
        float f13;
        float f14;
        float maxX = getMaxX();
        float minY = getMinY();
        float maxY = getMaxY();
        if (f11 > (maxX - this.f61878F) / 2) {
            PlaybarView playbarView = this.f61883K;
            if (playbarView == null) {
                AbstractC19074t.m100223u("playBarView");
                playbarView = null;
            }
            playbarView.setRightToLeftDirection(true);
            this.f61889Q = EnumC11880b.f61915q.ordinal();
        } else {
            PlaybarView playbarView2 = this.f61883K;
            if (playbarView2 == null) {
                AbstractC19074t.m100223u("playBarView");
                playbarView2 = null;
            }
            playbarView2.setRightToLeftDirection(false);
            this.f61889Q = EnumC11880b.f61914p.ordinal();
        }
        float xForCurrentMode = getXForCurrentMode();
        if (f12 < minY) {
            f12 = minY;
        } else if (f12 > maxY) {
            f12 = maxY;
        }
        if (z11) {
            m66020E(xForCurrentMode, f12, j11);
            AbstractC20110a.f98889a.m104564x("ZingMp3Sdk").mo104548a("Player -> validate (x, y) = (" + xForCurrentMode + ", " + f12 + ")", new Object[0]);
        }
        if (maxX > 0.0f) {
            f13 = xForCurrentMode / maxX;
        } else {
            f13 = 1.0f;
        }
        this.f61892T = f13;
        if (maxY > 0.0f) {
            f14 = f12 / maxY;
        } else {
            f14 = 0.5f;
        }
        this.f61893U = f14;
        if (z12) {
            FloatingItemView.InterfaceC8946b interfaceC8946b = this.f61910w;
            if (interfaceC8946b == null) {
                AbstractC19074t.m100223u("mAButtonListener");
                interfaceC8946b = null;
            }
            interfaceC8946b.mo47739f(this.f61892T, this.f61893U);
            BuildersKt__Builders_commonKt.m112540d(this.f61905r, Dispatchers.m112680b(), null, new C11888j(null), 2, null);
        }
    }

    /* renamed from: N */
    static /* synthetic */ void m65999N(FloatingMp3PlayerView floatingMp3PlayerView, float f11, float f12, boolean z11, long j11, boolean z12, int i11, Object obj) {
        boolean z13;
        long j12;
        boolean z14;
        if ((i11 & 4) != 0) {
            z13 = true;
        } else {
            z13 = z11;
        }
        if ((i11 & 8) != 0) {
            j12 = 0;
        } else {
            j12 = j11;
        }
        if ((i11 & 16) != 0) {
            z14 = true;
        } else {
            z14 = z12;
        }
        floatingMp3PlayerView.m65998M(f11, f12, z13, j12, z14);
    }

    public final float getMaxX() {
        Rect rect = new Rect();
        View mo35570g0 = this.f61904q.mo35570g0();
        if (mo35570g0 != null) {
            mo35570g0.getWindowVisibleDisplayFrame(rect);
        }
        return rect.right - this.f61898c0;
    }

    public final float getMaxY() {
        float m47750b;
        float f11;
        Rect rect = new Rect();
        View mo35570g0 = this.f61904q.mo35570g0();
        if (mo35570g0 != null) {
            mo35570g0.getWindowVisibleDisplayFrame(rect);
        }
        float f12 = rect.bottom;
        if (AbstractC23136l9.m118650F0(getContext())) {
            AbstractC8948a.a aVar = AbstractC8948a.Companion;
            AbstractC19074t.m100207e(getContext(), "getContext(...)");
            m47750b = f12 - aVar.m47750b(r3, AbstractC31078h.height_tab_main);
            f11 = this.f61899d0;
        } else {
            int m118716i0 = AbstractC23136l9.m118716i0(getContext());
            AbstractC8948a.a aVar2 = AbstractC8948a.Companion;
            Context context = getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            m47750b = m118716i0 - aVar2.m47750b(context, AbstractC31078h.height_tab_main);
            f11 = this.f61899d0;
        }
        return m47750b - f11;
    }

    private final float getMinY() {
        return AbstractC8948a.Companion.m47752e() + this.f61894V + getContext().getResources().getDimensionPixelSize(AbstractC17454d.action_bar_default_height);
    }

    public final float getXForCurrentMode() {
        float m118725l0;
        float f11;
        if (this.f61889Q == EnumC11880b.f61914p.ordinal()) {
            return 0.0f;
        }
        PlaybarView playbarView = this.f61883K;
        if (playbarView == null) {
            AbstractC19074t.m100223u("playBarView");
            playbarView = null;
        }
        if (playbarView.getMode() == EnumC11881c.f61918p.ordinal()) {
            m118725l0 = AbstractC23136l9.m118725l0(getContext());
            f11 = this.f61898c0;
        } else {
            m118725l0 = AbstractC23136l9.m118725l0(getContext());
            f11 = this.f61895W;
        }
        return m118725l0 - f11;
    }

    /* renamed from: v */
    private final void m66016v() {
        FloatingCloseButton m47760d;
        PlaybarView playbarView = this.f61883K;
        PlaybarView playbarView2 = null;
        if (playbarView == null) {
            AbstractC19074t.m100223u("playBarView");
            playbarView = null;
        }
        if (playbarView.getVisibility() == 0) {
            PlaybarView playbarView3 = this.f61883K;
            if (playbarView3 == null) {
                AbstractC19074t.m100223u("playBarView");
                playbarView3 = null;
            }
            playbarView3.setVisibility(8);
            PlaybarView playbarView4 = this.f61883K;
            if (playbarView4 == null) {
                AbstractC19074t.m100223u("playBarView");
            } else {
                playbarView2 = playbarView4;
            }
            playbarView2.setMode(EnumC11881c.f61918p.ordinal());
            C8949b c8949b = this.f61908u;
            if (c8949b != null && (m47760d = c8949b.m47760d()) != null) {
                m47760d.m47721g(false);
            }
            AbstractC20110a.f98889a.m104564x("ZingMp3Sdk").mo104548a("STATE: view gone", new Object[0]);
        }
    }

    /* renamed from: w */
    private final void m66017w() {
        AbstractC8948a.a aVar = AbstractC8948a.Companion;
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        C31071a c31071a = this.f61911x;
        PlaybarView playbarView = null;
        if (c31071a == null) {
            AbstractC19074t.m100223u("floatingConfig");
            c31071a = null;
        }
        this.f61885M = aVar.m47751c(context, c31071a.m150983j());
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        C31071a c31071a2 = this.f61911x;
        if (c31071a2 == null) {
            AbstractC19074t.m100223u("floatingConfig");
            c31071a2 = null;
        }
        float m150983j = c31071a2.m150983j();
        C31071a c31071a3 = this.f61911x;
        if (c31071a3 == null) {
            AbstractC19074t.m100223u("floatingConfig");
            c31071a3 = null;
        }
        this.f61886N = aVar.m47751c(context2, m150983j * c31071a3.m150976c());
        m66018y();
        m65992B();
        m65994G();
        PlaybarView playbarView2 = this.f61883K;
        if (playbarView2 == null) {
            AbstractC19074t.m100223u("playBarView");
        } else {
            playbarView = playbarView2;
        }
        addView(playbarView);
        setIdTracking("floating_mp3_player_view");
    }

    /* renamed from: y */
    private final void m66018y() {
        PlaybarView playbarView = new PlaybarView(new ContextThemeWrapper(getContext(), AbstractC8915g0.ZingMP3Sample), null, 0, 6, null);
        this.f61883K = playbarView;
        playbarView.setOnTouchListener(this);
        playbarView.setVisibility(8);
        playbarView.setMode(EnumC11881c.f61918p.ordinal());
        playbarView.setLayoutParams(new FrameLayout.LayoutParams((int) this.f61895W, -2));
        playbarView.setRightToLeftDirection(true);
        playbarView.setCallback(new C11882d());
        BuildersKt__Builders_commonKt.m112540d(this.f61905r, Dispatchers.m112680b(), null, new C11883e(null), 2, null);
    }

    /* renamed from: D */
    public final void m66019D() {
        this.f61895W = (AbstractC23136l9.m118725l0(getContext()) * 3) / 4;
        PlaybarView playbarView = this.f61883K;
        if (playbarView == null) {
            AbstractC19074t.m100223u("playBarView");
            playbarView = null;
        }
        playbarView.setLayoutParams(new FrameLayout.LayoutParams((int) this.f61895W, -2));
        float f11 = this.f61892T;
        if (f11 < 0.0f || f11 > 1.0f) {
            this.f61892T = 1.0f;
        }
        float f12 = this.f61893U;
        if (f12 < 0.0f || f12 > 1.0f) {
            this.f61893U = 0.5f;
        }
        m65999N(this, this.f61892T * getMaxX(), this.f61893U * getMaxY(), false, 0L, false, 28, null);
    }

    /* renamed from: E */
    public final void m66020E(float f11, float f12, long j11) {
        this.f61890R = f11;
        this.f61891S = f12;
        animate().x(f11).y(f12).setDuration(j11).start();
    }

    /* renamed from: F */
    public final void m66021F() {
        AbstractC20110a.f98889a.m104564x("ZingMp3Sdk").mo104548a("STATE: resume", new Object[0]);
        this.f61880H = false;
        PlaybarView playbarView = this.f61883K;
        if (playbarView == null) {
            AbstractC19074t.m100223u("playBarView");
            playbarView = null;
        }
        playbarView.m35276w();
        m66022I();
    }

    /* renamed from: I */
    public final void m66022I() {
        if (!this.f61902g0) {
            return;
        }
        if (C11891a.Companion.m66083c()) {
            m65995H();
        } else {
            m66016v();
        }
    }

    /* renamed from: K */
    public final void m66023K() {
        AbstractC20110a.f98889a.m104564x("ZingMp3Sdk").mo104548a("STATE: stop", new Object[0]);
        this.f61880H = true;
        m66016v();
        PlaybarView playbarView = this.f61883K;
        if (playbarView == null) {
            AbstractC19074t.m100223u("playBarView");
            playbarView = null;
        }
        playbarView.m35277x();
    }

    public final PlaybarView getPlayerView() {
        PlaybarView playbarView = this.f61883K;
        if (playbarView == null) {
            AbstractC19074t.m100223u("playBarView");
            return null;
        }
        return playbarView;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC20110a.f98889a.m104564x("ZingMp3Sdk").mo104548a("ATTACHED", new Object[0]);
        PlaybarView playbarView = null;
        C11891a.b.m66078g(C11891a.Companion, null, 1, null).m66072l0();
        C23744a.Companion.m124119a().m124115b(this, 73);
        PlaybarView playbarView2 = this.f61883K;
        if (playbarView2 == null) {
            AbstractC19074t.m100223u("playBarView");
            playbarView2 = null;
        }
        playbarView2.m35275v();
        PlaybarView playbarView3 = this.f61883K;
        if (playbarView3 == null) {
            AbstractC19074t.m100223u("playBarView");
        } else {
            playbarView = playbarView3;
        }
        playbarView.m35276w();
        this.f61913z = System.currentTimeMillis();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f61904q.mo35570g0().post(new Runnable() { // from class: z60.e
            public /* synthetic */ RunnableC31702e() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                FloatingMp3PlayerView.m65993C(FloatingMp3PlayerView.this);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AbstractC20110a.f98889a.m104564x("ZingMp3Sdk").mo104548a("DETACHED", new Object[0]);
        C23744a.Companion.m124119a().m124117e(this, 73);
        m66024u();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        C11892b c11892b;
        FloatingCloseButton floatingCloseButton;
        AbstractC31072b abstractC31072b;
        double d11;
        int[] iArr;
        C31071a c31071a;
        AbstractC19074t.m100208f(view, "view");
        AbstractC19074t.m100208f(motionEvent, "motionEvent");
        C8949b c8949b = this.f61908u;
        if (c8949b instanceof C11892b) {
            c11892b = (C11892b) c8949b;
        } else {
            c11892b = null;
        }
        if (c11892b != null && c11892b.m66110y()) {
            return true;
        }
        if (this.f61880H) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        C8949b c8949b2 = this.f61908u;
        if (c8949b2 != null) {
            floatingCloseButton = c8949b2.m47760d();
        } else {
            floatingCloseButton = null;
        }
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    long eventTime = motionEvent.getEventTime() - motionEvent.getDownTime();
                    if (Math.hypot(this.f61876D, this.f61877E) > this.f61907t && eventTime > ViewConfiguration.getTapTimeout()) {
                        this.f61909v = true;
                        if (floatingCloseButton != null) {
                            floatingCloseButton.m47720f();
                        }
                    }
                    if (this.f61909v) {
                        if (this.f61889Q == EnumC11880b.f61915q.ordinal()) {
                            PlaybarView playbarView = this.f61883K;
                            if (playbarView == null) {
                                AbstractC19074t.m100223u("playBarView");
                                playbarView = null;
                            }
                            if (playbarView.getMode() == EnumC11881c.f61919q.ordinal()) {
                                this.f61903h0 = true;
                            }
                        }
                        PlaybarView playbarView2 = this.f61883K;
                        if (playbarView2 == null) {
                            AbstractC19074t.m100223u("playBarView");
                            playbarView2 = null;
                        }
                        playbarView2.setMode(EnumC11881c.f61918p.ordinal());
                        this.f61884L = true;
                        C8949b c8949b3 = this.f61908u;
                        if (c8949b3 != null) {
                            d11 = c8949b3.m47762f(rawX, rawY);
                        } else {
                            d11 = 0.0d;
                        }
                        if (d11 < this.f61906s) {
                            this.f61888P = FloatingItemView.EnumC8947c.f47808q;
                            m65997L();
                            C8949b c8949b4 = this.f61908u;
                            if (c8949b4 == null || (iArr = c8949b4.m47759c(this)) == null) {
                                iArr = new int[2];
                            }
                            m66020E(iArr[0], iArr[1], 0L);
                            if (floatingCloseButton != null) {
                                C31071a c31071a2 = this.f61911x;
                                if (c31071a2 == null) {
                                    AbstractC19074t.m100223u("floatingConfig");
                                    c31071a = null;
                                } else {
                                    c31071a = c31071a2;
                                }
                                floatingCloseButton.m47722i(c31071a.m150977d());
                            }
                            if (this.f61882J) {
                                this.f61882J = false;
                                AbstractC8948a.a aVar = AbstractC8948a.Companion;
                                Context context = getContext();
                                AbstractC19074t.m100207e(context, "getContext(...)");
                                aVar.m47754i(context, 5L);
                            }
                        } else {
                            this.f61882J = true;
                            this.f61888P = FloatingItemView.EnumC8947c.f47807p;
                            if (floatingCloseButton != null) {
                                floatingCloseButton.m47723j();
                            }
                            this.f61878F = getWidth();
                            this.f61879G = getHeight();
                            float f11 = rawX + this.f61876D;
                            float f12 = rawY + this.f61877E;
                            if (this.f61903h0) {
                                m66020E((f11 + this.f61895W) - this.f61898c0, f12, 0L);
                            } else {
                                m66020E(f11, f12, 0L);
                            }
                            m65997L();
                        }
                    }
                }
            } else {
                this.f61909v = false;
                if (floatingCloseButton != null) {
                    floatingCloseButton.m47721g(true);
                }
                if (this.f61888P == FloatingItemView.EnumC8947c.f47808q) {
                    BuildersKt__Builders_commonKt.m112540d(this.f61905r, Dispatchers.m112680b(), null, new C11885g(null), 2, null);
                    PlaybarView playbarView3 = this.f61883K;
                    if (playbarView3 == null) {
                        AbstractC19074t.m100223u("playBarView");
                        playbarView3 = null;
                    }
                    playbarView3.m35274u();
                    FloatingItemView.InterfaceC8946b interfaceC8946b = this.f61910w;
                    if (interfaceC8946b == null) {
                        AbstractC19074t.m100223u("mAButtonListener");
                        interfaceC8946b = null;
                    }
                    AbstractC31072b abstractC31072b2 = this.f61881I;
                    if (abstractC31072b2 == null) {
                        AbstractC19074t.m100223u("floatingItemData");
                        abstractC31072b = null;
                    } else {
                        abstractC31072b = abstractC31072b2;
                    }
                    interfaceC8946b.mo47744k(abstractC31072b);
                    return true;
                }
                this.f61888P = FloatingItemView.EnumC8947c.f47807p;
                float f13 = this.f61876D + rawX;
                float f14 = this.f61877E + rawY;
                float f15 = rawX - this.f61874B;
                float f16 = rawY - this.f61875C;
                if (Math.abs(f15) < 10.0f && Math.abs(f16) < 10.0f) {
                    return view.onTouchEvent(motionEvent);
                }
                if (this.f61903h0) {
                    m65999N(this, (f13 + this.f61895W) - this.f61898c0, f14, this.f61884L, 300L, false, 16, null);
                } else {
                    m65999N(this, f13, f14, this.f61884L, 300L, false, 16, null);
                }
                this.f61903h0 = false;
                return true;
            }
        } else {
            this.f61874B = rawX;
            this.f61875C = rawY;
            this.f61876D = getX() - this.f61874B;
            this.f61877E = getY() - this.f61875C;
            this.f61888P = FloatingItemView.EnumC8947c.f47807p;
            this.f61884L = false;
        }
        return view.onTouchEvent(motionEvent);
    }

    /* renamed from: u */
    public final void m66024u() {
        m66023K();
        PlaybarView playbarView = this.f61883K;
        if (playbarView == null) {
            AbstractC19074t.m100223u("playBarView");
            playbarView = null;
        }
        playbarView.m35273s();
        AbstractC20110a.f98889a.m104564x("ZingMp3Sdk").mo104548a("STATE: destroy", new Object[0]);
    }

    @Override // p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        String str;
        AbstractC19074t.m100208f(objArr, "args");
        if (i11 == 73 && objArr.length != 0) {
            Object obj = objArr[0];
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type com.zing.zalo.connection.state.ConnectionState");
            if (((EnumC30982b) obj) == EnumC30982b.CONNECTED && (str = this.f61900e0) != null) {
                m65991A(str);
            }
        }
    }

    /* renamed from: z */
    public final boolean m66025z() {
        return this.f61880H;
    }
}

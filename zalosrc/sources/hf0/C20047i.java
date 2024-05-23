package hf0;

import ag0.C0809c1;
import am.AbstractC0939u;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import bo.InterfaceC2946a1;
import com.zing.zalo.MainApplication;
import com.zing.zalo.feed.components.FeedItemMusicModuleView;
import com.zing.zalo.feed.components.FeedItemZaloVideoContainerView;
import com.zing.zalo.p077ui.ZaloBubbleActivity;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zmedia.view.C17391z;
import com.zing.zalo.zmedia.view.VideoController;
import com.zing.zalo.zmedia.view.ZVideoView;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19051f0;
import fn0.C19055h0;
import hf0.C20040b;
import ho0.AbstractC20110a;
import java.util.HashMap;
import java.util.Map;
import me0.C23055e5;
import mm0.AbstractC23350e;
import np.InterfaceC23922a;
import p207he.C20024r;
import p348mi.AbstractC23304d;
import p361nb.C23669z;
import p363nh.C23744a;
import p420pb.C24709a;
import p448qh.AbstractC25280e;
import p509sp.C26354c;

/* renamed from: hf0.i */
/* loaded from: classes5.dex */
public final class C20047i extends AbstractC20049k implements C23744a.c {
    public static final b Companion = new b(null);

    /* renamed from: A */
    private int f98542A;

    /* renamed from: B */
    private int f98543B;

    /* renamed from: C */
    private boolean f98544C;

    /* renamed from: D */
    private boolean f98545D;

    /* renamed from: E */
    private long f98546E;

    /* renamed from: F */
    private boolean f98547F;

    /* renamed from: G */
    private C20040b.b f98548G;

    /* renamed from: H */
    private int f98549H;

    /* renamed from: I */
    private int f98550I;

    /* renamed from: J */
    private String f98551J;

    /* renamed from: K */
    private AbstractC25280e f98552K;

    /* renamed from: L */
    private Runnable f98553L;

    /* renamed from: M */
    private int f98554M;

    /* renamed from: N */
    private int f98555N;

    /* renamed from: O */
    private InterfaceC23922a f98556O;

    /* renamed from: P */
    private final Handler f98557P;

    /* renamed from: Q */
    private final Map f98558Q;

    /* renamed from: R */
    private final VideoController.AbstractC17311d f98559R;

    /* renamed from: s */
    private View f98560s;

    /* renamed from: t */
    private boolean f98561t;

    /* renamed from: u */
    private a f98562u;

    /* renamed from: v */
    private a f98563v;

    /* renamed from: w */
    private final Rect f98564w;

    /* renamed from: x */
    private final Rect f98565x;

    /* renamed from: y */
    private final HashMap f98566y;

    /* renamed from: z */
    private float f98567z;

    /* renamed from: hf0.i$a */
    /* loaded from: classes5.dex */
    public interface a {
    }

    /* renamed from: hf0.i$b */
    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final boolean m104097a() {
            C26354c c26354c = C26354c.f125196a;
            if (c26354c.m135673d()) {
                return false;
            }
            if (c26354c.mo104102a() || !c26354c.mo104103b()) {
                return true;
            }
            return C23055e5.m118270e();
        }

        /* renamed from: b */
        public final boolean m104098b(int i11) {
            if (C20024r.m103941j() || C20024r.m103945n()) {
                return false;
            }
            ZMediaPlayerSettings.VideoConfig m104113g = AbstractC20049k.m104113g(i11);
            if (m104113g != null && m104113g.getPlayInline() == 0) {
                return false;
            }
            C20048j c20048j = C20048j.f98580a;
            if (c20048j.m104105d()) {
                return false;
            }
            if (c20048j.mo104102a() || !c20048j.mo104103b()) {
                return true;
            }
            return C23055e5.m118270e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hf0.i$c */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18509p {
        c() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean m104099a(int i11, a aVar) {
            InterfaceC2946a1 feedMusicData;
            InterfaceC23922a m104079F;
            AbstractC19074t.m100208f(aVar, "rowView");
            if ((aVar instanceof FeedItemMusicModuleView) && (feedMusicData = ((FeedItemMusicModuleView) aVar).getFeedMusicData()) != null && (m104079F = C20047i.this.m104079F()) != null) {
                m104079F.mo85424b(feedMusicData.mo13947I(), feedMusicData.mo14159b());
            }
            return Boolean.FALSE;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            return m104099a(((Number) obj).intValue(), (a) obj2);
        }
    }

    /* renamed from: hf0.i$d */
    /* loaded from: classes5.dex */
    public static final class d extends VideoController.AbstractC17311d {

        /* renamed from: b */
        final /* synthetic */ int f98570b;

        d(int i11) {
            this.f98570b = i11;
        }

        @Override // com.zing.zalo.zmedia.view.VideoController.AbstractC17311d
        /* renamed from: b */
        public void mo82405b(ZVideoView zVideoView, boolean z11) {
            C17391z c17391z;
            if (zVideoView != null) {
                c17391z = zVideoView.getVideo();
            } else {
                c17391z = null;
            }
            if (c17391z == null) {
                return;
            }
            C20047i c20047i = C20047i.this;
            C17391z video = zVideoView.getVideo();
            AbstractC19074t.m100207e(video, "getVideo(...)");
            c20047i.m104089T(video, z11);
        }

        @Override // com.zing.zalo.zmedia.view.VideoController.AbstractC17311d
        /* renamed from: d */
        public void mo61750d(ZVideoView zVideoView, long j11, long j12) {
            AbstractC19074t.m100208f(zVideoView, "zVideoView");
            C20047i.this.m104070p0(j11, j12);
            AbstractC20049k.m104108a(zVideoView, this.f98570b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hf0.i$e */
    /* loaded from: classes5.dex */
    public static final class e extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: r */
        final /* synthetic */ ViewGroup f98572r;

        /* renamed from: s */
        final /* synthetic */ boolean f98573s;

        /* renamed from: t */
        final /* synthetic */ C19055h0 f98574t;

        /* renamed from: u */
        final /* synthetic */ boolean f98575u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ViewGroup viewGroup, boolean z11, C19055h0 c19055h0, boolean z12) {
            super(2);
            this.f98572r = viewGroup;
            this.f98573s = z11;
            this.f98574t = c19055h0;
            this.f98575u = z12;
        }

        /* renamed from: a */
        public final Boolean m104100a(int i11, a aVar) {
            boolean z11;
            AbstractC19074t.m100208f(aVar, "rowView");
            float m104048I = C20047i.this.m104048I(this.f98572r, aVar);
            if ((aVar instanceof C20040b.c) && this.f98573s && ((C20040b.c) aVar).mo44060f() && m104048I >= C20047i.this.f98567z) {
                this.f98574t.f94931p = i11;
            }
            if ((aVar instanceof FeedItemMusicModuleView) && this.f98575u && ((FeedItemMusicModuleView) aVar).m43875r0() && m104048I >= C20047i.this.f98567z) {
                this.f98574t.f94931p = i11;
            }
            if (this.f98574t.f94931p != -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            return Boolean.valueOf(z11);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            return m104100a(((Number) obj).intValue(), (a) obj2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hf0.i$f */
    /* loaded from: classes5.dex */
    public static final class f extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: r */
        final /* synthetic */ ViewGroup f98577r;

        /* renamed from: s */
        final /* synthetic */ C19051f0 f98578s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(ViewGroup viewGroup, C19051f0 c19051f0) {
            super(2);
            this.f98577r = viewGroup;
            this.f98578s = c19051f0;
        }

        /* renamed from: a */
        public final Boolean m104101a(int i11, a aVar) {
            boolean z11;
            AbstractC19074t.m100208f(aVar, "rowView");
            float m104048I = C20047i.this.m104048I(this.f98577r, aVar);
            if (((aVar instanceof C20040b.c) && ((C20040b.c) aVar).mo44060f()) || ((aVar instanceof FeedItemMusicModuleView) && ((FeedItemMusicModuleView) aVar).m43875r0())) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (aVar == C20047i.this.f98563v && (m104048I < C20047i.this.f98567z || !z11)) {
                this.f98578s.f94928p = true;
            }
            return Boolean.valueOf(this.f98578s.f94928p);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            return m104101a(((Number) obj).intValue(), (a) obj2);
        }
    }

    /* renamed from: hf0.i$g */
    /* loaded from: classes5.dex */
    public static final class g extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C23669z f98579a;

        g(C23669z c23669z) {
            this.f98579a = c23669z;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C24709a.m128299t(MainApplication.Companion.m35500c()).m128305K(this.f98579a);
        }
    }

    public C20047i(int i11) {
        super(i11);
        this.f98564w = new Rect();
        this.f98565x = new Rect();
        this.f98566y = new HashMap();
        this.f98567z = 0.5f;
        this.f98542A = 5;
        this.f98543B = -1;
        this.f98545D = true;
        this.f98547F = true;
        this.f98548G = C20040b.b.f98514q;
        this.f98551J = "";
        this.f98557P = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: hf0.g
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean m104049J;
                m104049J = C20047i.m104049J(C20047i.this, message);
                return m104049J;
            }
        });
        this.f98561t = true;
        this.f98558Q = new HashMap();
        this.f98559R = new d(i11);
    }

    /* renamed from: A */
    private final void m104042A() {
        m104092Z(true);
    }

    /* renamed from: B */
    private final void m104043B() {
        m104050K("doResume: " + this.f98563v);
        a aVar = this.f98563v;
        if (aVar != null) {
            if (aVar instanceof C20040b.c) {
                C20040b.c cVar = (C20040b.c) aVar;
                ZVideoView newVideoView = cVar.getNewVideoView();
                if (newVideoView != null && !(newVideoView.getContext() instanceof ZaloBubbleActivity)) {
                    m104076u(newVideoView, m104120f());
                    m104068o0(cVar, true);
                    return;
                }
                return;
            }
            if (aVar instanceof FeedItemMusicModuleView) {
                m104066n0((FeedItemMusicModuleView) aVar);
            }
        }
    }

    /* renamed from: C */
    private final void m104044C() {
        a aVar = this.f98563v;
        if (aVar != null && (aVar instanceof C20040b.c)) {
            C20040b.c cVar = (C20040b.c) aVar;
            cVar.setCurrentVideoView(false);
            m104075t(cVar, false);
        }
    }

    /* renamed from: D */
    private final int m104045D(ViewGroup viewGroup, int i11) {
        if (i11 == 1 && (viewGroup.getChildAt(0) instanceof a)) {
            return 0;
        }
        b bVar = Companion;
        boolean m104098b = bVar.m104098b(this.f98586p);
        boolean m104097a = bVar.m104097a();
        try {
            C19055h0 c19055h0 = new C19055h0();
            c19055h0.f94931p = -1;
            m104046E(viewGroup, i11, new e(viewGroup, m104098b, c19055h0, m104097a));
            return c19055h0.f94931p;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("TimelineViewAutoPlayerManager", e11);
            return -1;
        }
    }

    /* renamed from: E */
    private final void m104046E(ViewGroup viewGroup, int i11, InterfaceC18509p interfaceC18509p) {
        for (int i12 = 0; i12 < i11; i12++) {
            View childAt = viewGroup.getChildAt(i12);
            if ((childAt instanceof a) && ((Boolean) interfaceC18509p.mo240pC(Integer.valueOf(i12), childAt)).booleanValue()) {
                return;
            }
        }
    }

    /* renamed from: H */
    private final int m104047H(C17391z c17391z) {
        Integer num;
        if (c17391z == null) {
            return 0;
        }
        String str = c17391z.f88618a;
        AbstractC19074t.m100207e(str, "id");
        if (str.length() == 0 || (num = (Integer) this.f98558Q.get(c17391z.f88618a)) == null) {
            return 0;
        }
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public final float m104048I(View view, a aVar) {
        if (aVar != null && view != null) {
            Float f11 = (Float) this.f98566y.get(aVar);
            if (f11 == null) {
                float m104077w = m104077w(view, aVar);
                this.f98566y.put(aVar, Float.valueOf(m104077w));
                return m104077w;
            }
            return f11.floatValue();
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public static final boolean m104049J(C20047i c20047i, Message message) {
        AbstractC19074t.m100208f(c20047i, "this$0");
        AbstractC19074t.m100208f(message, "msg");
        if (message.what == 1) {
            c20047i.m104043B();
            return false;
        }
        return false;
    }

    /* renamed from: K */
    private final void m104050K(String str) {
    }

    /* renamed from: V */
    public static /* synthetic */ void m104051V(C20047i c20047i, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        c20047i.m104090U(z11);
    }

    /* renamed from: X */
    private final void m104052X(FeedItemMusicModuleView feedItemMusicModuleView) {
        InterfaceC23922a interfaceC23922a;
        InterfaceC2946a1 feedMusicData = feedItemMusicModuleView.getFeedMusicData();
        if (feedMusicData != null && (interfaceC23922a = this.f98556O) != null) {
            interfaceC23922a.mo85424b(feedMusicData.mo13947I(), feedMusicData.mo14159b());
        }
    }

    /* renamed from: Y */
    private final void m104053Y(C20040b.c cVar, boolean z11) {
        ZVideoView newVideoView;
        if (cVar != null && (newVideoView = cVar.getNewVideoView()) != null) {
            m104050K("pauseCurrentVideo(): isFocusing=" + z11);
            try {
                newVideoView.setIsFocusing(z11);
                m104075t(cVar, false);
                int currentState = newVideoView.getCurrentState();
                if (currentState != 0) {
                    if (currentState == 1 || currentState == 2 || currentState == 3) {
                        m104072q0(newVideoView);
                        newVideoView.pause();
                        AbstractC20049k.m104108a(newVideoView, m104120f());
                    }
                } else {
                    newVideoView.pause();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("TimelineViewAutoPlayerManager", e11);
            }
        }
    }

    /* renamed from: a0 */
    private final void m104054a0(final int i11, final int i12, final int i13) {
        if (this.f98552K != null && !this.f98544C) {
            Runnable runnable = this.f98553L;
            if (runnable != null) {
                this.f98557P.removeCallbacks(runnable);
            }
            Runnable runnable2 = new Runnable() { // from class: hf0.h
                @Override // java.lang.Runnable
                public final void run() {
                    C20047i.m104055b0(i13, i11, this, i12);
                }
            };
            this.f98557P.postDelayed(runnable2, 300L);
            this.f98553L = runnable2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b0 */
    public static final void m104055b0(int i11, int i12, C20047i c20047i, int i13) {
        int i14;
        AbstractC19074t.m100208f(c20047i, "this$0");
        if (i11 >= 0) {
            i14 = i11 + i12;
        } else {
            i14 = -1;
        }
        try {
            AbstractC25280e abstractC25280e = c20047i.f98552K;
            if (abstractC25280e != null) {
                abstractC25280e.m130835m(i12, i13, c20047i.f98548G, i14);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("TimelineViewAutoPlayerManager", e11);
        }
    }

    /* renamed from: c0 */
    private final void m104056c0() {
        m104044C();
        this.f98543B = -1;
        this.f98563v = null;
    }

    /* renamed from: d0 */
    private final void m104057d0() {
        this.f98554M = 0;
        this.f98555N = 0;
    }

    /* renamed from: e0 */
    private final void m104058e0(ZVideoView zVideoView, C17391z c17391z) {
        zVideoView.seekTo((int) AbstractC20049k.m104111d(m104120f(), c17391z.f88618a));
    }

    /* renamed from: f0 */
    private final void m104059f0(a aVar) {
        if (aVar instanceof C20040b.c) {
            C20040b.c cVar = (C20040b.c) aVar;
            cVar.setCurrentVideoView(true);
            m104075t(cVar, true);
        }
        this.f98563v = aVar;
    }

    /* renamed from: i0 */
    private final void m104060i0(C17391z c17391z, int i11) {
        if (c17391z != null) {
            String str = c17391z.f88618a;
            AbstractC19074t.m100207e(str, "id");
            if (str.length() != 0) {
                Map map = this.f98558Q;
                String str2 = c17391z.f88618a;
                AbstractC19074t.m100207e(str2, "id");
                map.put(str2, Integer.valueOf(i11));
            }
        }
    }

    /* renamed from: j0 */
    private final boolean m104061j0() {
        if (System.currentTimeMillis() - this.f98546E >= 200) {
            return true;
        }
        return false;
    }

    /* renamed from: k0 */
    private final boolean m104062k0(C17391z c17391z) {
        int m104047H;
        if (c17391z == null || (m104047H = m104047H(c17391z)) == 1) {
            return false;
        }
        if (m104047H == 2) {
            return true;
        }
        return Companion.m104098b(this.f98586p);
    }

    /* renamed from: l0 */
    private final boolean m104063l0(ViewGroup viewGroup, int i11) {
        try {
            C19051f0 c19051f0 = new C19051f0();
            m104046E(viewGroup, i11, new f(viewGroup, c19051f0));
            return c19051f0.f94928p;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("TimelineViewAutoPlayerManager", e11);
            return false;
        }
    }

    /* renamed from: m0 */
    private final boolean m104064m0(boolean z11) {
        m104050K("startOrResumeCurrentItem: " + this.f98563v);
        a aVar = this.f98563v;
        if (aVar instanceof C20040b.c) {
            AbstractC19074t.m100206d(aVar, "null cannot be cast to non-null type com.zing.zalo.videoplayer.AutoPlayerManager.VideoViewHolder");
            return m104068o0((C20040b.c) aVar, z11);
        }
        if (aVar instanceof FeedItemMusicModuleView) {
            AbstractC19074t.m100206d(aVar, "null cannot be cast to non-null type com.zing.zalo.feed.components.FeedItemMusicModuleView");
            return m104066n0((FeedItemMusicModuleView) aVar);
        }
        return false;
    }

    /* renamed from: n0 */
    private final boolean m104066n0(FeedItemMusicModuleView feedItemMusicModuleView) {
        InterfaceC2946a1 feedMusicData;
        if (!this.f98545D || (feedMusicData = feedItemMusicModuleView.getFeedMusicData()) == null) {
            return false;
        }
        InterfaceC23922a interfaceC23922a = this.f98556O;
        if (interfaceC23922a != null) {
            interfaceC23922a.mo85425c(feedMusicData.mo13947I(), feedMusicData.mo14159b());
            return true;
        }
        return true;
    }

    /* renamed from: o0 */
    private final boolean m104068o0(C20040b.c cVar, boolean z11) {
        if (!AbstractC23304d.f113276F2 && this.f98545D) {
            m104050K("startOrResumeCurrentVideo(): isFocusing=" + z11);
            if (cVar != null) {
                try {
                    ZVideoView newVideoView = cVar.getNewVideoView();
                    if (newVideoView != null) {
                        m104075t(cVar, true);
                        C17391z video = newVideoView.getVideo();
                        if (video != null && cVar.mo44060f()) {
                            if (m104047H(video) == 1) {
                                m104058e0(newVideoView, video);
                                return true;
                            }
                            if (!m104062k0(video)) {
                                return false;
                            }
                            m104050K("startOrResumeCurrentVideo(): video=" + video);
                            newVideoView.setIsFocusing(z11);
                            switch (newVideoView.getCurrentState()) {
                                case -1:
                                case 0:
                                case 5:
                                case 6:
                                    newVideoView.m92411e0((int) AbstractC20049k.m104111d(m104120f(), video.f88618a));
                                    return true;
                                case 1:
                                    AbstractC20110a.f98889a.m104564x("ZVideoView").mo104548a(">> Timelineplayer videoview STATE_PREPARING", new Object[0]);
                                    newVideoView.start();
                                    newVideoView.m92419m0(true);
                                    newVideoView.getVideoController().m92295S(false);
                                    return false;
                                case 2:
                                case 3:
                                case 4:
                                    newVideoView.start();
                                    return true;
                                default:
                                    return false;
                            }
                        }
                        m104050K("prepareCurrentPlayerForManualPlay()");
                        int currentState = newVideoView.getCurrentState();
                        if (currentState == 2 || currentState == 3 || currentState == 4 || currentState == 5) {
                            newVideoView.m92429s0();
                        }
                        newVideoView.m92421n0(true);
                        if (cVar.mo44060f()) {
                            newVideoView.getVideoController().m92306h(true);
                        }
                        return false;
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122776f("TimelineViewAutoPlayerManager", e11);
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p0 */
    public final void m104070p0(long j11, long j12) {
        this.f98554M = j11 < ((long) this.f98554M) ? (int) j12 : (int) j11;
        this.f98555N = (int) j12;
    }

    /* renamed from: q0 */
    private final void m104072q0(ZVideoView zVideoView) {
        C23669z m92432u0 = zVideoView.m92432u0(0);
        if (m92432u0 != null) {
            C0809c1.m2050b(new g(m92432u0));
        }
    }

    /* renamed from: t */
    private final void m104075t(C20040b.c cVar, boolean z11) {
        ZVideoView newVideoView;
        VideoController videoController;
        if (cVar != null && (newVideoView = cVar.getNewVideoView()) != null && (videoController = newVideoView.getVideoController()) != null) {
            if (z11) {
                videoController.m92307i(this.f98559R);
                m104057d0();
            } else {
                videoController.m92289M(this.f98559R);
                cVar.mo44058d(this.f98554M, this.f98555N);
                m104057d0();
            }
        }
    }

    /* renamed from: u */
    private final void m104076u(ZVideoView zVideoView, int i11) {
        try {
            C17391z video = zVideoView.getVideo();
            if (video != null && m104062k0(video)) {
                zVideoView.seekTo((int) AbstractC20049k.m104111d(i11, video.f88618a));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("TimelineViewAutoPlayerManager", e11);
        }
    }

    /* renamed from: w */
    private final float m104077w(View view, a aVar) {
        if (aVar == null || view == null) {
            return 0.0f;
        }
        int i11 = 0;
        if (aVar instanceof C20040b.c) {
            C20040b.c cVar = (C20040b.c) aVar;
            ZVideoView newVideoView = cVar.getNewVideoView();
            if (newVideoView == null || newVideoView.getHeight() == 0) {
                return 0.0f;
            }
            this.f98564w.setEmpty();
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            Rect rect = this.f98564w;
            int i12 = iArr[0];
            rect.set(i12, iArr[1], view.getWidth() + i12, iArr[1] + view.getHeight());
            this.f98565x.setEmpty();
            int[] iArr2 = new int[2];
            newVideoView.getLocationInWindow(iArr2);
            Rect rect2 = this.f98565x;
            int i13 = iArr2[0];
            rect2.set(i13, iArr2[1], newVideoView.getWidth() + i13, iArr2[1] + newVideoView.getHeight());
            int max = Math.max(this.f98564w.top, this.f98565x.top);
            int min = Math.min(this.f98564w.bottom, this.f98565x.bottom);
            if (max < 0) {
                max = 0;
            }
            if (min >= 0) {
                i11 = min;
            }
            float height = ((i11 - max) * 1.0f) / newVideoView.getHeight();
            m104050K("calculateVideoVisiblePercentage(): position=" + cVar.getDataPosition() + ", parentViewRect=" + this.f98564w + ", videoViewRect=" + this.f98565x + ", visiblePercent=" + height);
            if (height < 0.0f) {
                return 0.0f;
            }
            return height;
        }
        if (!(aVar instanceof FeedItemMusicModuleView)) {
            return 0.0f;
        }
        Rect rect3 = new Rect();
        Rect rect4 = new Rect();
        int[] iArr3 = new int[2];
        view.getLocationInWindow(iArr3);
        int i14 = iArr3[0];
        rect3.set(i14, iArr3[1], view.getWidth() + i14, iArr3[1] + view.getHeight());
        int[] iArr4 = new int[2];
        FeedItemMusicModuleView feedItemMusicModuleView = (FeedItemMusicModuleView) aVar;
        feedItemMusicModuleView.getLocationInWindow(iArr4);
        int i15 = iArr4[0];
        rect4.set(i15, iArr4[1], feedItemMusicModuleView.getWidth() + i15, iArr4[1] + feedItemMusicModuleView.getHeight());
        int max2 = Math.max(rect3.top, rect4.top);
        int min2 = Math.min(rect3.bottom, rect4.bottom);
        if (max2 < 0) {
            max2 = 0;
        }
        if (min2 >= 0) {
            i11 = min2;
        }
        float height2 = ((i11 - max2) * 1.0f) / feedItemMusicModuleView.getHeight();
        m104050K("calculateVideoVisiblePercentage(): parentViewRect=" + this.f98564w + ", videoViewRect=" + this.f98565x + ", visiblePercent=" + height2);
        if (height2 < 0.0f) {
            return 0.0f;
        }
        return height2;
    }

    /* renamed from: z */
    private final void m104078z(ViewGroup viewGroup, int i11, int i12) {
        try {
            this.f98560s = viewGroup;
            if (i12 <= 0) {
                return;
            }
            this.f98566y.clear();
            int m104045D = m104045D(viewGroup, i12);
            boolean m104063l0 = m104063l0(viewGroup, i12);
            int i13 = m104045D + i11;
            m104050K("checkAutoPlayableItemAndStartPlay(): nextViewIdx=" + m104045D + " playIndex=" + i13 + " shouldPauseCurr=" + m104063l0 + " firstVisible=" + i11 + ", visibleCount=" + i12);
            if (m104063l0) {
                m104051V(this, false, 1, null);
            }
            if (!Companion.m104097a()) {
                m104046E(viewGroup, i12, new c());
            }
            if (m104045D == -1) {
                InterfaceC23922a interfaceC23922a = this.f98556O;
                if (interfaceC23922a != null) {
                    interfaceC23922a.mo85423a();
                    return;
                }
                return;
            }
            this.f98546E = System.currentTimeMillis();
            int i14 = this.f98543B;
            if (i13 != i14 && i14 != -1) {
                m104091W(false);
                m104056c0();
            }
            a aVar = this.f98563v;
            if ((aVar instanceof FeedItemZaloVideoContainerView) && i13 == this.f98543B) {
                AbstractC19074t.m100206d(aVar, "null cannot be cast to non-null type com.zing.zalo.feed.components.FeedItemZaloVideoContainerView");
                if (AbstractC19074t.m100204b(((FeedItemZaloVideoContainerView) aVar).m44301b(), Boolean.FALSE)) {
                    return;
                }
            }
            KeyEvent.Callback childAt = viewGroup.getChildAt(m104045D);
            AbstractC19074t.m100206d(childAt, "null cannot be cast to non-null type com.zing.zalo.videoplayer.TimelineViewAutoPlayerManager.AutoPlayableItem");
            m104059f0((a) childAt);
            if (this.f98563v instanceof C20040b.c) {
                m104054a0(i11, i12, m104045D);
            }
            if (m104064m0(true)) {
                this.f98543B = i13;
                m104050K("checkAutoPlayableItemAndStartPlay(): Play success currViewIdx=" + i13);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("TimelineViewAutoPlayerManager", e11);
        }
    }

    /* renamed from: F */
    public final InterfaceC23922a m104079F() {
        return this.f98556O;
    }

    /* renamed from: G */
    public final AbstractC25280e m104080G() {
        return this.f98552K;
    }

    /* renamed from: L */
    public void m104081L() {
        m104050K("onDestroy()");
        AbstractC20049k.m104117k(this.f98586p);
        this.f98561t = false;
        AbstractC25280e abstractC25280e = this.f98552K;
        if (abstractC25280e != null) {
            abstractC25280e.mo130838p();
        }
    }

    /* renamed from: M */
    public boolean m104082M(int i11, KeyEvent keyEvent) {
        ZVideoView newVideoView;
        AbstractC19074t.m100208f(keyEvent, "event");
        m104050K("onKeyUp(): keyCode=" + i11);
        try {
            a aVar = this.f98563v;
            if (aVar != null && (aVar instanceof C20040b.c) && (newVideoView = ((C20040b.c) aVar).getNewVideoView()) != null) {
                return newVideoView.onKeyUp(i11, keyEvent);
            }
            return false;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("TimelineViewAutoPlayerManager", e11);
            return false;
        }
    }

    /* renamed from: N */
    public void m104083N() {
        m104050K("onPause()");
        m104042A();
        C23744a.Companion.m124119a().m124117e(this, 41);
    }

    /* renamed from: O */
    public void m104084O() {
        m104050K("onResume()");
        m104043B();
        C23744a.Companion.m124119a().m124115b(this, 41);
    }

    /* renamed from: P */
    public final void m104085P(String str, RecyclerView recyclerView, int i11, int i12, C20040b.b bVar) {
        AbstractC19074t.m100208f(str, "precacheId");
        AbstractC19074t.m100208f(recyclerView, "recyclerView");
        AbstractC19074t.m100208f(bVar, "scrollDirection");
        if (!this.f98561t) {
            return;
        }
        try {
            this.f98551J = str;
            this.f98548G = bVar;
            this.f98549H = i11;
            this.f98550I = i12;
            int i13 = i11 + i12;
            int i14 = this.f98543B;
            if (i14 != -1 && (i14 < i11 || i14 > i13)) {
                m104051V(this, false, 1, null);
            }
            if (m104061j0() && !this.f98544C) {
                m104078z(recyclerView, i11, i12);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("TimelineViewAutoPlayerManager", e11);
        }
    }

    /* renamed from: Q */
    public final void m104086Q(RecyclerView recyclerView, int i11) {
        AbstractC19074t.m100208f(recyclerView, "recyclerView");
        if (!this.f98561t) {
            return;
        }
        try {
            if (this.f98542A != 0 && i11 == 0) {
                this.f98544C = false;
                this.f98547F = true;
                this.f98546E = 0L;
                m104085P(this.f98551J, recyclerView, this.f98549H, this.f98550I, this.f98548G);
            } else {
                this.f98544C = true;
            }
            this.f98542A = i11;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("TimelineViewAutoPlayerManager", e11);
        }
    }

    /* renamed from: R */
    public void m104087R() {
    }

    /* renamed from: S */
    public void m104088S(boolean z11) {
        m104050K("onSwitchTab()");
        this.f98545D = z11;
        if (z11) {
            m104064m0(true);
        } else {
            m104042A();
        }
    }

    /* renamed from: T */
    public final void m104089T(C17391z c17391z, boolean z11) {
        AbstractC19074t.m100208f(c17391z, "zVideo");
        boolean m104098b = Companion.m104098b(this.f98586p);
        if (!z11 && m104098b) {
            m104060i0(c17391z, 1);
        } else if (z11 && !m104098b) {
            m104060i0(c17391z, 2);
        } else {
            m104060i0(c17391z, 0);
        }
    }

    /* renamed from: U */
    public final void m104090U(boolean z11) {
        m104091W(z11);
        m104056c0();
    }

    /* renamed from: W */
    public final void m104091W(boolean z11) {
        m104050K("pauseCurrentItem: " + this.f98563v);
        a aVar = this.f98563v;
        this.f98562u = aVar;
        if (aVar != null) {
            if (aVar instanceof C20040b.c) {
                m104053Y((C20040b.c) aVar, z11);
            } else if (aVar instanceof FeedItemMusicModuleView) {
                m104052X((FeedItemMusicModuleView) aVar);
            }
        }
        m104044C();
    }

    /* renamed from: Z */
    public final void m104092Z(boolean z11) {
        a aVar = this.f98563v;
        if (aVar != null && (aVar instanceof C20040b.c)) {
            this.f98562u = aVar;
            m104053Y((C20040b.c) aVar, z11);
        }
        m104044C();
    }

    /* renamed from: g0 */
    public final void m104093g0(InterfaceC23922a interfaceC23922a) {
        this.f98556O = interfaceC23922a;
    }

    /* renamed from: h0 */
    public final void m104094h0(AbstractC25280e abstractC25280e) {
        this.f98552K = abstractC25280e;
    }

    /* renamed from: v */
    public final void m104095v() {
        try {
            a aVar = this.f98563v;
            if (aVar != null && (aVar instanceof C20040b.c)) {
                AbstractC20049k.m104108a(((C20040b.c) aVar).getNewVideoView(), m104120f());
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("TimelineViewAutoPlayerManager", e11);
        }
    }

    @Override // p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        if (i11 == 41) {
            this.f98557P.sendEmptyMessageDelayed(1, 500L);
        }
    }

    /* renamed from: y */
    public final void m104096y(RecyclerView recyclerView) {
        AbstractC19074t.m100208f(recyclerView, "recyclerView");
        this.f98547F = true;
        this.f98546E = 0L;
        m104085P(this.f98551J, recyclerView, this.f98549H, this.f98550I, this.f98548G);
    }
}

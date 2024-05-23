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
import com.zing.zalo.MainApplication;
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
import java.util.HashMap;
import java.util.Map;
import me0.C23055e5;
import mm0.AbstractC23350e;
import p207he.C20024r;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p361nb.C23669z;
import p363nh.C23744a;
import p420pb.C24709a;
import p448qh.AbstractC25280e;
import pm0.C24848g0;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: hf0.b */
/* loaded from: classes5.dex */
public final class C20040b extends AbstractC20049k implements C23744a.c, Handler.Callback {
    public static final a Companion = new a(null);

    /* renamed from: A */
    private int f98486A;

    /* renamed from: B */
    private boolean f98487B;

    /* renamed from: C */
    private boolean f98488C;

    /* renamed from: D */
    private long f98489D;

    /* renamed from: E */
    private boolean f98490E;

    /* renamed from: F */
    private b f98491F;

    /* renamed from: G */
    private int f98492G;

    /* renamed from: H */
    private int f98493H;

    /* renamed from: I */
    private String f98494I;

    /* renamed from: J */
    private AbstractC25280e f98495J;

    /* renamed from: K */
    private Runnable f98496K;

    /* renamed from: L */
    private int f98497L;

    /* renamed from: M */
    private int f98498M;

    /* renamed from: N */
    private final Handler f98499N;

    /* renamed from: O */
    private final Rect f98500O;

    /* renamed from: P */
    private final Rect f98501P;

    /* renamed from: Q */
    private HashMap f98502Q;

    /* renamed from: R */
    private final Map f98503R;

    /* renamed from: S */
    private final VideoController.AbstractC17311d f98504S;

    /* renamed from: s */
    private View f98505s;

    /* renamed from: t */
    private boolean f98506t;

    /* renamed from: u */
    private c f98507u;

    /* renamed from: v */
    private c f98508v;

    /* renamed from: w */
    private float f98509w;

    /* renamed from: x */
    private boolean f98510x;

    /* renamed from: y */
    private boolean f98511y;

    /* renamed from: z */
    private int f98512z;

    /* renamed from: hf0.b$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final boolean m104023a(C17391z c17391z, int i11) {
            int m121229Nb;
            AbstractC19074t.m100208f(c17391z, "zVideo");
            if ((!c17391z.f88630m && i11 != 0 && i11 != 7) || C20024r.m103941j() || C20024r.m103945n()) {
                return false;
            }
            ZMediaPlayerSettings.VideoConfig m104113g = AbstractC20049k.m104113g(i11);
            if ((m104113g != null && m104113g.getPlayInline() == 0) || (m121229Nb = AbstractC23309i.m121229Nb()) == 0) {
                return false;
            }
            if (m121229Nb == 1 || m121229Nb != 2) {
                return true;
            }
            return C23055e5.m118270e();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: hf0.b$b */
    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: p */
        public static final b f98513p = new b("DOWN", 0);

        /* renamed from: q */
        public static final b f98514q = new b("UP", 1);

        /* renamed from: r */
        private static final /* synthetic */ b[] f98515r;

        /* renamed from: s */
        private static final /* synthetic */ InterfaceC30165a f98516s;

        static {
            b[] m104024b = m104024b();
            f98515r = m104024b;
            f98516s = AbstractC30166b.m148796a(m104024b);
        }

        private b(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ b[] m104024b() {
            return new b[]{f98513p, f98514q};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f98515r.clone();
        }
    }

    /* renamed from: hf0.b$c */
    /* loaded from: classes5.dex */
    public interface c {
        /* renamed from: d */
        void mo44058d(int i11, int i12);

        /* renamed from: f */
        boolean mo44060f();

        int getDataPosition();

        ZVideoView getNewVideoView();

        void setCurrentVideoView(boolean z11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hf0.b$d */
    /* loaded from: classes5.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: r */
        final /* synthetic */ ViewGroup f98518r;

        /* renamed from: s */
        final /* synthetic */ C19051f0 f98519s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ViewGroup viewGroup, C19051f0 c19051f0) {
            super(2);
            this.f98518r = viewGroup;
            this.f98519s = c19051f0;
        }

        /* renamed from: a */
        public final void m104025a(int i11, c cVar) {
            AbstractC19074t.m100208f(cVar, "rowView");
            float m103977L = C20040b.this.m103977L(this.f98518r, cVar);
            if (cVar == C20040b.this.f98508v) {
                if (m103977L < C20040b.this.f98509w || !cVar.mo44060f()) {
                    this.f98519s.f94928p = true;
                }
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m104025a(((Number) obj).intValue(), (c) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: hf0.b$e */
    /* loaded from: classes5.dex */
    public static final class e extends VideoController.AbstractC17311d {
        e() {
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
            C20040b c20040b = C20040b.this;
            C17391z video = zVideoView.getVideo();
            AbstractC19074t.m100207e(video, "getVideo(...)");
            c20040b.m104010U(video, z11);
        }

        @Override // com.zing.zalo.zmedia.view.VideoController.AbstractC17311d
        /* renamed from: d */
        public void mo61750d(ZVideoView zVideoView, long j11, long j12) {
            AbstractC19074t.m100208f(zVideoView, "zVideoView");
            C20040b.this.m103991o0(j11, j12);
            AbstractC20049k.m104108a(zVideoView, C20040b.this.m104120f());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hf0.b$f */
    /* loaded from: classes5.dex */
    public static final class f extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: r */
        final /* synthetic */ ViewGroup f98522r;

        /* renamed from: s */
        final /* synthetic */ C19055h0 f98523s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(ViewGroup viewGroup, C19055h0 c19055h0) {
            super(2);
            this.f98522r = viewGroup;
            this.f98523s = c19055h0;
        }

        /* renamed from: a */
        public final void m104026a(int i11, c cVar) {
            AbstractC19074t.m100208f(cVar, "rowView");
            if (C20040b.this.m103977L(this.f98522r, cVar) >= 0.1f) {
                this.f98523s.f94931p = i11;
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m104026a(((Number) obj).intValue(), (c) obj2);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hf0.b$g */
    /* loaded from: classes5.dex */
    public static final class g extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: r */
        final /* synthetic */ ViewGroup f98525r;

        /* renamed from: s */
        final /* synthetic */ C19055h0 f98526s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(ViewGroup viewGroup, C19055h0 c19055h0) {
            super(2);
            this.f98525r = viewGroup;
            this.f98526s = c19055h0;
        }

        /* renamed from: a */
        public final void m104027a(int i11, c cVar) {
            AbstractC19074t.m100208f(cVar, "rowView");
            float m103977L = C20040b.this.m103977L(this.f98525r, cVar);
            if (cVar.mo44060f() && m103977L >= C20040b.this.f98509w) {
                if (this.f98526s.f94931p == -1 || cVar == C20040b.this.f98508v) {
                    this.f98526s.f94931p = i11;
                }
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m104027a(((Number) obj).intValue(), (c) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: hf0.b$h */
    /* loaded from: classes5.dex */
    public static final class h extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C23669z f98527a;

        h(C23669z c23669z) {
            this.f98527a = c23669z;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C24709a.m128299t(MainApplication.Companion.m35500c()).m128305K(this.f98527a);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C20040b(RecyclerView.AbstractC1880g abstractC1880g, int i11) {
        this(abstractC1880g, i11, false, 4, null);
        AbstractC19074t.m100208f(abstractC1880g, "adapter");
    }

    /* renamed from: B */
    private final void m103969B() {
        ZVideoView zVideoView;
        c cVar = this.f98508v;
        if (cVar != null) {
            zVideoView = cVar.getNewVideoView();
        } else {
            zVideoView = null;
        }
        if (zVideoView != null && !(zVideoView.getContext() instanceof ZaloBubbleActivity)) {
            m103997t(zVideoView, m104120f());
            m104000A(true);
        }
    }

    /* renamed from: C */
    private final void m103970C() {
        c cVar = this.f98508v;
        if (cVar != null) {
            cVar.setCurrentVideoView(false);
            m103996s(cVar, false);
        }
    }

    /* renamed from: D */
    private final int m103971D(ViewGroup viewGroup, int i11) {
        boolean z11;
        try {
            C19055h0 c19055h0 = new C19055h0();
            c19055h0.f94931p = -1;
            if (this.f98491F == b.f98514q) {
                z11 = true;
            } else {
                z11 = false;
            }
            m103974G(viewGroup, i11, z11, new f(viewGroup, c19055h0));
            return c19055h0.f94931p;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("AutoPlayerManager", e11);
            return -1;
        }
    }

    /* renamed from: E */
    private final int m103972E(ViewGroup viewGroup, c cVar) {
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                return -1;
            }
            View childAt = viewGroup.getChildAt(childCount);
            if ((childAt instanceof c) && AbstractC19074t.m100204b(childAt, cVar)) {
                return this.f98492G + childCount;
            }
        }
    }

    /* renamed from: F */
    private final int m103973F(ViewGroup viewGroup, int i11) {
        boolean z11 = false;
        if (i11 == 1 && (viewGroup.getChildAt(0) instanceof c)) {
            return 0;
        }
        try {
            C19055h0 c19055h0 = new C19055h0();
            c19055h0.f94931p = -1;
            if (this.f98491F == b.f98514q) {
                z11 = true;
            }
            m103974G(viewGroup, i11, z11, new g(viewGroup, c19055h0));
            return c19055h0.f94931p;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("AutoPlayerManager", e11);
            return -1;
        }
    }

    /* renamed from: G */
    private final void m103974G(ViewGroup viewGroup, int i11, boolean z11, InterfaceC18509p interfaceC18509p) {
        if (!z11) {
            for (int i12 = 0; i12 < i11; i12++) {
                View childAt = viewGroup.getChildAt(i12);
                if (childAt instanceof c) {
                    interfaceC18509p.mo240pC(Integer.valueOf(i12), childAt);
                }
            }
            return;
        }
        while (true) {
            i11--;
            if (-1 < i11) {
                View childAt2 = viewGroup.getChildAt(i11);
                if (childAt2 instanceof c) {
                    interfaceC18509p.mo240pC(Integer.valueOf(i11), childAt2);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: H */
    static /* synthetic */ void m103975H(C20040b c20040b, ViewGroup viewGroup, int i11, boolean z11, InterfaceC18509p interfaceC18509p, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        c20040b.m103974G(viewGroup, i11, z11, interfaceC18509p);
    }

    /* renamed from: K */
    private final int m103976K(C17391z c17391z) {
        Integer num;
        if (c17391z == null) {
            return 0;
        }
        String str = c17391z.f88618a;
        AbstractC19074t.m100207e(str, "id");
        if (str.length() == 0 || (num = (Integer) this.f98503R.get(c17391z.f88618a)) == null) {
            return 0;
        }
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public final float m103977L(View view, c cVar) {
        if (cVar != null && view != null) {
            Float f11 = (Float) this.f98502Q.get(cVar);
            if (f11 == null) {
                float m103998v = m103998v(view, cVar);
                this.f98502Q.put(cVar, Float.valueOf(m103998v));
                return m103998v;
            }
            return f11.floatValue();
        }
        return 0.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x009a, code lost:            return;     */
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m103978M(ViewGroup viewGroup, int i11, int i12) {
        Integer num;
        ZVideoView newVideoView;
        try {
            m104016f0(viewGroup);
            if (i12 <= 0) {
                return;
            }
            this.f98502Q.clear();
            int m103973F = m103973F(viewGroup, i12);
            boolean m103999y = m103999y(viewGroup, i12);
            if (this.f98511y && m103973F == -1) {
                Object obj = this.f98508v;
                if (obj != null && (obj instanceof View)) {
                    AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type android.view.View");
                    int indexOfChild = viewGroup.indexOfChild((View) obj);
                    if (indexOfChild >= 0 && m103977L(viewGroup, this.f98508v) >= 0.1f) {
                        m103973F = indexOfChild;
                    }
                }
                if (m103973F >= 0) {
                    m103999y = false;
                } else {
                    m103973F = m103971D(viewGroup, i12);
                }
            }
            if (m103999y) {
                m104011V(false);
            }
            m104012W(i11, i12, m103973F);
            if (m103973F == -1) {
                return;
            }
            this.f98489D = System.currentTimeMillis();
            int i13 = i11 + m103973F;
            if (this.f98486A == i13) {
                KeyEvent.Callback childAt = viewGroup.getChildAt(m103973F);
                AbstractC19074t.m100206d(childAt, "null cannot be cast to non-null type com.zing.zalo.videoplayer.AutoPlayerManager.VideoViewHolder");
                m104015e0((c) childAt);
                c cVar = this.f98508v;
                if (cVar != null && (newVideoView = cVar.getNewVideoView()) != null) {
                    num = Integer.valueOf(newVideoView.getCurrentState());
                } else {
                    num = null;
                }
                if (num != null && num.intValue() == 4) {
                    m104000A(true);
                    return;
                }
                if (num.intValue() != 0) {
                    return;
                }
            }
            m103988m0();
            KeyEvent.Callback childAt2 = viewGroup.getChildAt(m103973F);
            AbstractC19074t.m100206d(childAt2, "null cannot be cast to non-null type com.zing.zalo.videoplayer.AutoPlayerManager.VideoViewHolder");
            m104015e0((c) childAt2);
            if (m104000A(true)) {
                if (this.f98510x) {
                    this.f98490E = false;
                }
                this.f98486A = i13;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("maybePlayVideo(): Play success currViewIdx=");
                sb2.append(i13);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("AutoPlayerManager", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X */
    public static final void m103979X(int i11, int i12, C20040b c20040b, int i13) {
        int i14;
        AbstractC19074t.m100208f(c20040b, "this$0");
        if (i11 >= 0) {
            i14 = i11 + i12;
        } else {
            i14 = -1;
        }
        try {
            AbstractC25280e abstractC25280e = c20040b.f98495J;
            if (abstractC25280e != null) {
                abstractC25280e.m130835m(i12, i13, c20040b.f98491F, i14);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("AutoPlayerManager", e11);
        }
    }

    /* renamed from: Y */
    private final void m103980Y(ZVideoView zVideoView) {
        int currentState = zVideoView.getCurrentState();
        if (currentState == 2 || currentState == 3 || currentState == 4 || currentState == 5) {
            zVideoView.m92429s0();
        }
        zVideoView.m92421n0(true);
        c cVar = this.f98508v;
        AbstractC19074t.m100205c(cVar);
        if (cVar.mo44060f()) {
            zVideoView.getVideoController().m92306h(true);
        }
    }

    /* renamed from: a0 */
    private final void m103981a0() {
        m103970C();
        this.f98486A = -1;
        this.f98508v = null;
    }

    /* renamed from: b0 */
    private final void m103982b0() {
        this.f98497L = 0;
        this.f98498M = 0;
    }

    /* renamed from: c0 */
    private final void m103983c0(ZVideoView zVideoView, C17391z c17391z) {
        zVideoView.seekTo((int) AbstractC20049k.m104111d(m104120f(), c17391z.f88618a));
    }

    /* renamed from: h0 */
    private final void m103984h0(C17391z c17391z, int i11) {
        if (c17391z != null) {
            String str = c17391z.f88618a;
            AbstractC19074t.m100207e(str, "id");
            if (str.length() != 0) {
                Map map = this.f98503R;
                String str2 = c17391z.f88618a;
                AbstractC19074t.m100207e(str2, "id");
                map.put(str2, Integer.valueOf(i11));
            }
        }
    }

    /* renamed from: j0 */
    private final boolean m103985j0() {
        if (this.f98510x) {
            return this.f98490E;
        }
        if (System.currentTimeMillis() - this.f98489D >= 200) {
            return true;
        }
        return false;
    }

    /* renamed from: k0 */
    private final boolean m103986k0(C17391z c17391z) {
        int m103976K;
        if (c17391z == null || (m103976K = m103976K(c17391z)) == 1) {
            return false;
        }
        if (m103976K == 2) {
            return true;
        }
        return Companion.m104023a(c17391z, this.f98586p);
    }

    /* renamed from: l0 */
    private final boolean m103987l0(ZVideoView zVideoView, C17391z c17391z, boolean z11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("startOrResumeAutoPlay(): video=");
        sb2.append(c17391z);
        zVideoView.setIsFocusing(z11);
        switch (zVideoView.getCurrentState()) {
            case -1:
            case 0:
            case 5:
            case 6:
                zVideoView.m92411e0((int) AbstractC20049k.m104111d(m104120f(), c17391z.f88618a));
                return true;
            case 1:
                zVideoView.start();
                zVideoView.m92419m0(true);
                zVideoView.getVideoController().m92295S(false);
                return true;
            case 2:
            case 3:
            case 4:
                zVideoView.start();
                return true;
            default:
                return false;
        }
    }

    /* renamed from: m0 */
    private final void m103988m0() {
        m104011V(false);
        this.f98507u = this.f98508v;
        m103970C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o0 */
    public final void m103991o0(long j11, long j12) {
        this.f98497L = j11 < ((long) this.f98497L) ? (int) j12 : (int) j11;
        this.f98498M = (int) j12;
    }

    /* renamed from: p0 */
    private final void m103993p0(ZVideoView zVideoView) {
        C23669z m92432u0 = zVideoView.m92432u0(0);
        if (m92432u0 != null) {
            C0809c1.m2050b(new h(m92432u0));
        }
    }

    /* renamed from: s */
    private final void m103996s(c cVar, boolean z11) {
        ZVideoView newVideoView;
        VideoController videoController;
        if (cVar != null && (newVideoView = cVar.getNewVideoView()) != null && (videoController = newVideoView.getVideoController()) != null) {
            if (z11) {
                videoController.m92307i(this.f98504S);
                m103982b0();
            } else {
                videoController.m92289M(this.f98504S);
                cVar.mo44058d(this.f98497L, this.f98498M);
                m103982b0();
            }
        }
    }

    /* renamed from: t */
    private final void m103997t(ZVideoView zVideoView, int i11) {
        try {
            C17391z video = zVideoView.getVideo();
            if (video != null && m103986k0(video)) {
                zVideoView.seekTo((int) AbstractC20049k.m104111d(i11, video.f88618a));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("AutoPlayerManager", e11);
        }
    }

    /* renamed from: v */
    private final float m103998v(View view, c cVar) {
        ZVideoView newVideoView;
        if (cVar == null || view == null || (newVideoView = cVar.getNewVideoView()) == null || newVideoView.getHeight() == 0) {
            return 0.0f;
        }
        this.f98500O.setEmpty();
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        Rect rect = this.f98500O;
        int i11 = 0;
        int i12 = iArr[0];
        rect.set(i12, iArr[1], view.getWidth() + i12, iArr[1] + view.getHeight());
        this.f98501P.setEmpty();
        int[] iArr2 = new int[2];
        newVideoView.getLocationInWindow(iArr2);
        Rect rect2 = this.f98501P;
        int i13 = iArr2[0];
        rect2.set(i13, iArr2[1], newVideoView.getWidth() + i13, iArr2[1] + newVideoView.getHeight());
        int max = Math.max(this.f98500O.top, this.f98501P.top);
        int min = Math.min(this.f98500O.bottom, this.f98501P.bottom);
        if (max < 0) {
            max = 0;
        }
        if (min >= 0) {
            i11 = min;
        }
        float height = ((i11 - max) * 1.0f) / newVideoView.getHeight();
        if (height < 0.0f) {
            return 0.0f;
        }
        return height;
    }

    /* renamed from: y */
    private final boolean m103999y(ViewGroup viewGroup, int i11) {
        try {
            C19051f0 c19051f0 = new C19051f0();
            m103975H(this, viewGroup, i11, false, new d(viewGroup, c19051f0), 4, null);
            return c19051f0.f94928p;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("AutoPlayerManager", e11);
            return false;
        }
    }

    /* renamed from: A */
    public final boolean m104000A(boolean z11) {
        ZVideoView newVideoView;
        if (!AbstractC23304d.f113276F2 && this.f98488C) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("checkStartOrResumeCurrentPlayer(): isFocusing=");
            sb2.append(z11);
            try {
                c cVar = this.f98508v;
                if (cVar != null && (newVideoView = cVar.getNewVideoView()) != null) {
                    m103996s(this.f98508v, true);
                    C17391z video = newVideoView.getVideo();
                    if (video != null) {
                        c cVar2 = this.f98508v;
                        AbstractC19074t.m100205c(cVar2);
                        if (cVar2.mo44060f()) {
                            if (m103976K(video) == 1) {
                                m103983c0(newVideoView, video);
                                return true;
                            }
                            if (!m103986k0(video)) {
                                return false;
                            }
                            return m103987l0(newVideoView, video, z11);
                        }
                    }
                    m103980Y(newVideoView);
                }
                return false;
            } catch (Exception e11) {
                AbstractC23350e.m122776f("AutoPlayerManager", e11);
            }
        }
        return false;
    }

    /* renamed from: I */
    public final c m104001I() {
        return this.f98508v;
    }

    /* renamed from: J */
    public final AbstractC25280e m104002J() {
        return this.f98495J;
    }

    /* renamed from: N */
    public void m104003N() {
        AbstractC20049k.m104117k(this.f98586p);
        this.f98506t = false;
        AbstractC25280e abstractC25280e = this.f98495J;
        if (abstractC25280e != null) {
            abstractC25280e.mo130838p();
        }
    }

    /* renamed from: O */
    public boolean m104004O(int i11, KeyEvent keyEvent) {
        ZVideoView zVideoView;
        AbstractC19074t.m100208f(keyEvent, "event");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onKeyUp(): keyCode=");
        sb2.append(i11);
        try {
            c cVar = this.f98508v;
            if (cVar != null) {
                zVideoView = cVar.getNewVideoView();
            } else {
                zVideoView = null;
            }
            if (zVideoView != null) {
                return zVideoView.onKeyUp(i11, keyEvent);
            }
            return false;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("AutoPlayerManager", e11);
            return false;
        }
    }

    /* renamed from: P */
    public void m104005P() {
        m104011V(true);
        m103996s(this.f98508v, false);
        C23744a.Companion.m124119a().m124117e(this, 41);
    }

    /* renamed from: Q */
    public void m104006Q() {
        this.f98499N.sendEmptyMessageDelayed(2, 500L);
        C23744a.Companion.m124119a().m124115b(this, 41);
    }

    /* renamed from: R */
    public final void m104007R(String str, RecyclerView recyclerView, int i11, int i12, b bVar) {
        AbstractC19074t.m100208f(str, "precacheId");
        AbstractC19074t.m100208f(recyclerView, "recyclerView");
        AbstractC19074t.m100208f(bVar, "scrollDirection");
        if (!this.f98506t) {
            return;
        }
        try {
            this.f98494I = str;
            this.f98491F = bVar;
            this.f98492G = i11;
            this.f98493H = i12;
            int i13 = i11 + i12;
            int i14 = this.f98486A;
            if (i14 != -1 && (i14 < i11 || i14 > i13)) {
                m104011V(false);
                m103981a0();
            }
            if (!m103985j0()) {
                return;
            }
            m103978M(recyclerView, i11, i12);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("AutoPlayerManager", e11);
        }
    }

    /* renamed from: S */
    public final void m104008S(RecyclerView recyclerView, int i11) {
        AbstractC19074t.m100208f(recyclerView, "recyclerView");
        if (!this.f98506t) {
            return;
        }
        try {
            if (this.f98512z != 0 && i11 == 0) {
                this.f98487B = false;
                this.f98490E = true;
                this.f98489D = 0L;
                m104007R(this.f98494I, recyclerView, this.f98492G, this.f98493H, this.f98491F);
            } else {
                this.f98487B = true;
                if (this.f98510x) {
                    this.f98490E = false;
                }
            }
            this.f98512z = i11;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("AutoPlayerManager", e11);
        }
    }

    /* renamed from: T */
    public void m104009T() {
    }

    /* renamed from: U */
    public final void m104010U(C17391z c17391z, boolean z11) {
        AbstractC19074t.m100208f(c17391z, "zVideo");
        boolean m104023a = Companion.m104023a(c17391z, this.f98586p);
        if (!z11 && m104023a) {
            m103984h0(c17391z, 1);
        } else if (z11 && !m104023a) {
            m103984h0(c17391z, 2);
        } else {
            m103984h0(c17391z, 0);
        }
    }

    /* renamed from: V */
    public final void m104011V(boolean z11) {
        ZVideoView newVideoView;
        c cVar = this.f98508v;
        if (cVar != null && (newVideoView = cVar.getNewVideoView()) != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("pauseCurrentPlayer(): isFocusing=");
            sb2.append(z11);
            try {
                newVideoView.setIsFocusing(z11);
                m103996s(this.f98508v, false);
                int currentState = newVideoView.getCurrentState();
                if (currentState != 0) {
                    if (currentState == 1 || currentState == 2 || currentState == 3) {
                        m103993p0(newVideoView);
                        newVideoView.pause();
                        AbstractC20049k.m104108a(newVideoView, m104120f());
                    }
                } else {
                    newVideoView.pause();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("AutoPlayerManager", e11);
            }
        }
    }

    /* renamed from: W */
    public final void m104012W(final int i11, final int i12, final int i13) {
        if (this.f98495J != null) {
            if (this.f98510x || !this.f98487B) {
                Runnable runnable = this.f98496K;
                if (runnable != null) {
                    this.f98499N.removeCallbacks(runnable);
                }
                Runnable runnable2 = new Runnable() { // from class: hf0.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        C20040b.m103979X(i13, i11, this, i12);
                    }
                };
                this.f98499N.postDelayed(runnable2, 300L);
                this.f98496K = runnable2;
            }
        }
    }

    /* renamed from: Z */
    public final void m104013Z(c cVar, int i11) {
        C17391z video;
        if (cVar == null) {
            return;
        }
        c cVar2 = this.f98508v;
        if (cVar != cVar2) {
            m103988m0();
            m104015e0(cVar);
            ZVideoView newVideoView = cVar.getNewVideoView();
            if (newVideoView != null && (video = newVideoView.getVideo()) != null) {
                m104010U(video, true);
            }
            m104000A(true);
        } else {
            m103996s(cVar2, true);
        }
        this.f98486A = i11;
    }

    /* renamed from: d0 */
    public final void m104014d0(boolean z11) {
        this.f98511y = z11;
    }

    /* renamed from: e0 */
    public final void m104015e0(c cVar) {
        AbstractC19074t.m100208f(cVar, "holder");
        cVar.setCurrentVideoView(true);
        m103996s(cVar, true);
        this.f98508v = cVar;
    }

    /* renamed from: f0 */
    public final void m104016f0(View view) {
        AbstractC19074t.m100208f(view, "parentView");
        this.f98505s = view;
    }

    /* renamed from: g0 */
    public final void m104017g0(AbstractC25280e abstractC25280e) {
        this.f98495J = abstractC25280e;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        AbstractC19074t.m100208f(message, "msg");
        int i11 = message.what;
        if (i11 != 1) {
            if (i11 == 2) {
                m103969B();
                return false;
            }
            return false;
        }
        m103969B();
        return false;
    }

    /* renamed from: i0 */
    public final void m104018i0(float f11) {
        this.f98509w = f11;
    }

    /* renamed from: n0 */
    public final void m104019n0(ViewGroup viewGroup, c cVar) {
        AbstractC19074t.m100208f(viewGroup, "parentView");
        AbstractC19074t.m100208f(cVar, "newHolder");
        m104011V(false);
        int m103972E = m103972E(viewGroup, cVar);
        if (m103972E != -1 && m103972E != this.f98486A) {
            this.f98486A = m103972E;
            this.f98507u = this.f98508v;
            m103970C();
            m104015e0(cVar);
        }
    }

    /* renamed from: u */
    public final void m104020u() {
        try {
            c cVar = this.f98508v;
            if (cVar != null) {
                AbstractC20049k.m104108a(cVar.getNewVideoView(), m104120f());
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("AutoPlayerManager", e11);
        }
    }

    /* renamed from: w */
    public final void m104021w(RecyclerView recyclerView) {
        AbstractC19074t.m100208f(recyclerView, "recyclerView");
        this.f98490E = true;
        this.f98489D = 0L;
        m104007R(this.f98494I, recyclerView, this.f98492G, this.f98493H, this.f98491F);
    }

    @Override // p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        if (i11 == 41) {
            this.f98499N.sendEmptyMessageDelayed(1, 500L);
        }
    }

    /* renamed from: z */
    public final void m104022z() {
        ZVideoView newVideoView;
        try {
            c cVar = this.f98508v;
            if (cVar != null && (newVideoView = cVar.getNewVideoView()) != null) {
                if (m103998v(this.f98505s, this.f98508v) >= this.f98509w) {
                    if (newVideoView.getCurrentState() != 3) {
                        m104000A(true);
                    }
                } else {
                    m104011V(false);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("AutoPlayerManager", e11);
        }
    }

    public C20040b(int i11) {
        super(i11);
        this.f98509w = 0.5f;
        this.f98510x = true;
        this.f98512z = 5;
        this.f98486A = -1;
        this.f98488C = true;
        this.f98490E = true;
        this.f98491F = b.f98514q;
        this.f98494I = "";
        this.f98499N = new Handler(Looper.getMainLooper(), this);
        this.f98500O = new Rect();
        this.f98501P = new Rect();
        this.f98502Q = new HashMap();
        this.f98503R = new HashMap();
        this.f98504S = new e();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20040b(RecyclerView.AbstractC1880g abstractC1880g, int i11, boolean z11) {
        super(i11);
        AbstractC19074t.m100208f(abstractC1880g, "adapter");
        this.f98509w = 0.5f;
        this.f98510x = true;
        this.f98512z = 5;
        this.f98486A = -1;
        this.f98488C = true;
        this.f98490E = true;
        this.f98491F = b.f98514q;
        this.f98494I = "";
        this.f98499N = new Handler(Looper.getMainLooper(), this);
        this.f98500O = new Rect();
        this.f98501P = new Rect();
        this.f98502Q = new HashMap();
        this.f98503R = new HashMap();
        this.f98504S = new e();
        this.f98510x = z11;
        this.f98506t = true;
    }

    public /* synthetic */ C20040b(RecyclerView.AbstractC1880g abstractC1880g, int i11, boolean z11, int i12, AbstractC19060k abstractC19060k) {
        this(abstractC1880g, i11, (i12 & 4) != 0 ? true : z11);
    }
}

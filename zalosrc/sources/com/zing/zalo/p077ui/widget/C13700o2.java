package com.zing.zalo.p077ui.widget;

import ad0.InterfaceC0753o;
import ag0.AbstractC0840r;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Size;
import android.view.ViewGroup;
import android.widget.ImageView;
import bd0.C2770a;
import bd0.C2771b;
import c30.C3229a;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowMultiStickers;
import com.zing.zalo.p077ui.chat.chatrow.InterfaceC11505n2;
import com.zing.zalo.zlottie.widget.C17291a;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gg0.AbstractC19444a;
import ln0.AbstractC22543l;
import me0.AbstractC23080g8;
import me0.AbstractC23136l9;
import me0.C23278z2;
import mm0.AbstractC23350e;
import p354n3.C23528a;
import p363nh.C23744a;
import p379o3.AbstractC24006q;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import p471r3.C25630b;
import pb0.AbstractC24710a;
import pb0.AbstractC24711b;
import pb0.AbstractC24712c;
import pb0.C24713d;
import pb0.C24714e;
import pb0.C24715f;
import pb0.C24716g;
import pb0.C24718i;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import vg.C28020b3;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: com.zing.zalo.ui.widget.o2 */
/* loaded from: classes6.dex */
public class C13700o2 implements Drawable.Callback {
    public static final a Companion = new a(null);

    /* renamed from: P */
    private static final ImageView.ScaleType f70799P = ImageView.ScaleType.FIT_CENTER;

    /* renamed from: A */
    private Drawable f70800A;

    /* renamed from: B */
    private boolean f70801B;

    /* renamed from: C */
    private String f70802C;

    /* renamed from: D */
    private int f70803D;

    /* renamed from: E */
    private int f70804E;

    /* renamed from: F */
    private boolean f70805F;

    /* renamed from: G */
    private final InterfaceC24854k f70806G;

    /* renamed from: H */
    private final InterfaceC24854k f70807H;

    /* renamed from: I */
    private String f70808I;

    /* renamed from: J */
    private InterfaceC0753o f70809J;

    /* renamed from: K */
    private final InterfaceC24854k f70810K;

    /* renamed from: L */
    private final InterfaceC24854k f70811L;

    /* renamed from: M */
    private int f70812M;

    /* renamed from: N */
    private int f70813N;

    /* renamed from: O */
    private int f70814O;

    /* renamed from: p */
    private final C2770a f70815p;

    /* renamed from: q */
    private d f70816q;

    /* renamed from: r */
    private C25630b f70817r;

    /* renamed from: s */
    private final Rect f70818s;

    /* renamed from: t */
    private int f70819t;

    /* renamed from: u */
    private PointF f70820u;

    /* renamed from: v */
    private c f70821v;

    /* renamed from: w */
    private AbstractC24712c f70822w;

    /* renamed from: x */
    private InterfaceC11505n2 f70823x;

    /* renamed from: y */
    private b f70824y;

    /* renamed from: z */
    private Bitmap f70825z;

    /* renamed from: com.zing.zalo.ui.widget.o2$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: b */
        public final boolean m76548b(C25630b c25630b) {
            if (!c25630b.m132448z() && c25630b.m132434l() != 7 && c25630b.m132434l() != 8 && c25630b.m132434l() != 2 && c25630b.m132434l() != 5) {
                C25630b.a aVar = C25630b.f122553O;
                if (!aVar.m132452d(c25630b) && !aVar.m132450b(c25630b) && !aVar.m132449a(c25630b)) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: c */
        public final ImageView.ScaleType m76549c() {
            return C13700o2.f70799P;
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.o2$b */
    /* loaded from: classes6.dex */
    public interface b {
        /* renamed from: l */
        void mo76550l();
    }

    /* renamed from: com.zing.zalo.ui.widget.o2$c */
    /* loaded from: classes6.dex */
    public static final class c extends Enum {

        /* renamed from: p */
        public static final c f70826p = new c("PHOTO", 0);

        /* renamed from: q */
        public static final c f70827q = new c("LOTTIE", 1);

        /* renamed from: r */
        public static final c f70828r = new c("FSS", 2);

        /* renamed from: s */
        public static final c f70829s = new c("NORMAL", 3);

        /* renamed from: t */
        public static final c f70830t = new c("KEYFRAME", 4);

        /* renamed from: u */
        public static final c f70831u = new c("EMPTY", 5);

        /* renamed from: v */
        private static final /* synthetic */ c[] f70832v;

        /* renamed from: w */
        private static final /* synthetic */ InterfaceC30165a f70833w;

        static {
            c[] m76551b = m76551b();
            f70832v = m76551b;
            f70833w = AbstractC30166b.m148796a(m76551b);
        }

        private c(String str, int i11) {
            super(str, i11);
        }

        /* renamed from: b */
        private static final /* synthetic */ c[] m76551b() {
            return new c[]{f70826p, f70827q, f70828r, f70829s, f70830t, f70831u};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f70832v.clone();
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.o2$d */
    /* loaded from: classes6.dex */
    public static final class d extends Enum {

        /* renamed from: p */
        public static final d f70834p = new d("SIZE_AUTO", 0);

        /* renamed from: q */
        public static final d f70835q = new d("SIZE_FIXED_HEIGHT", 1);

        /* renamed from: r */
        public static final d f70836r = new d("SIZE_BY_DEVICE", 2);

        /* renamed from: s */
        public static final d f70837s = new d("SIZE_BY_INPUT_REF", 3);

        /* renamed from: t */
        private static final /* synthetic */ d[] f70838t;

        /* renamed from: u */
        private static final /* synthetic */ InterfaceC30165a f70839u;

        static {
            d[] m76552b = m76552b();
            f70838t = m76552b;
            f70839u = AbstractC30166b.m148796a(m76552b);
        }

        private d(String str, int i11) {
            super(str, i11);
        }

        /* renamed from: b */
        private static final /* synthetic */ d[] m76552b() {
            return new d[]{f70834p, f70835q, f70836r, f70837s};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f70838t.clone();
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.o2$e */
    /* loaded from: classes6.dex */
    public /* synthetic */ class e {

        /* renamed from: a */
        public static final /* synthetic */ int[] f70840a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f70841b;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.f70835q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.f70836r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.f70837s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f70840a = iArr;
            int[] iArr2 = new int[c.values().length];
            try {
                iArr2[c.f70830t.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[c.f70828r.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[c.f70829s.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[c.f70827q.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[c.f70826p.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            f70841b = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.widget.o2$f */
    /* loaded from: classes6.dex */
    public static final class f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final f f70842q = new f();

        f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C23528a mo12V4() {
            return new C23528a(MainApplication.Companion.m35500c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.widget.o2$g */
    /* loaded from: classes6.dex */
    public static final class g extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final g f70843q = new g();

        g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Drawable mo12V4() {
            return AbstractC23136l9.m118663M(AbstractC16803z.bg_ai_sticker_badge);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.widget.o2$h */
    /* loaded from: classes6.dex */
    public static final class h extends AbstractC19075u implements InterfaceC18494a {
        h() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C17291a mo12V4() {
            C3229a c3229a = C3229a.f13790a;
            C17291a c17291a = new C17291a(c3229a.m16387a(), String.valueOf(c3229a.m16387a()), C13700o2.this.f70813N, C13700o2.this.f70813N, false);
            c17291a.setCallback(C13700o2.this);
            return c17291a;
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.o2$i */
    /* loaded from: classes6.dex */
    public static final class i extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ String f70845l1;

        /* renamed from: m1 */
        final /* synthetic */ String f70846m1;

        /* renamed from: n1 */
        final /* synthetic */ C13700o2 f70847n1;

        i(String str, String str2, C13700o2 c13700o2) {
            this.f70845l1 = str;
            this.f70846m1 = str2;
            this.f70847n1 = c13700o2;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(interfaceC3968a, "iv");
            AbstractC19074t.m100208f(c3979l, "bm");
            AbstractC19074t.m100208f(c23995f, "status");
            if (AbstractC19074t.m100204b(str, this.f70845l1) && AbstractC19074t.m100204b(this.f70846m1, this.f70847n1.m76521C())) {
                this.f70847n1.m76541e0(c3979l.m18839c());
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.o2$j */
    /* loaded from: classes6.dex */
    public static final class j implements C28020b3.c {

        /* renamed from: b */
        final /* synthetic */ String f70849b;

        j(String str) {
            this.f70849b = str;
        }

        @Override // vg.C28020b3.c
        /* renamed from: a */
        public void mo76556a(C25630b c25630b, Bitmap bitmap) {
            C25630b c25630b2;
            if (c25630b != null && (c25630b2 = C13700o2.this.f70817r) != null && c25630b.m132429g() == c25630b2.m132429g() && AbstractC19074t.m100204b(this.f70849b, C13700o2.this.m76521C())) {
                if (bitmap != null) {
                    C13700o2.this.m76541e0(bitmap);
                } else if (AbstractC24006q.m125853Z1(c25630b.m132446x())) {
                    AbstractC24006q.m125840K1(c25630b.m132446x());
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.o2$k */
    /* loaded from: classes6.dex */
    public static final class k implements InterfaceC0753o {
        k() {
        }

        @Override // ad0.InterfaceC0753o
        /* renamed from: A0 */
        public int mo1321A0() {
            return (C13700o2.this.m76524H() - C13700o2.this.f70818s.left) - C13700o2.this.f70818s.right;
        }

        @Override // ad0.InterfaceC0753o
        /* renamed from: B0 */
        public boolean mo1322B0(C25630b c25630b, String str) {
            AbstractC19074t.m100208f(str, "playingId");
            C2770a.a m13312c = C13700o2.this.m76546z().m13312c();
            if (m13312c != null && !m13312c.mo13318a() && C13700o2.this.m76526J() && mo1323C0(c25630b) && !TextUtils.isEmpty(str) && AbstractC19074t.m100204b(str, C13700o2.this.m76521C())) {
                return true;
            }
            return false;
        }

        @Override // ad0.InterfaceC0753o
        /* renamed from: C0 */
        public boolean mo1323C0(C25630b c25630b) {
            Integer num;
            C25630b c25630b2 = C13700o2.this.f70817r;
            Integer num2 = null;
            if (c25630b2 != null) {
                num = Integer.valueOf(c25630b2.m132429g());
            } else {
                num = null;
            }
            if (c25630b != null) {
                num2 = Integer.valueOf(c25630b.m132429g());
            }
            return AbstractC19074t.m100204b(num, num2);
        }

        @Override // ad0.InterfaceC0753o
        /* renamed from: D0 */
        public Drawable mo1324D0() {
            return C13700o2.this.f70800A;
        }

        @Override // ad0.InterfaceC0753o
        /* renamed from: E0 */
        public void mo1325E0(String str) {
            AbstractC19074t.m100208f(str, "playingId");
            if (AbstractC19074t.m100204b(str, C13700o2.this.m76521C())) {
                C13700o2.this.m76537Z(false);
                b m76523F = C13700o2.this.m76523F();
                if (m76523F != null) {
                    m76523F.mo76550l();
                }
            }
        }

        @Override // ad0.InterfaceC0753o
        /* renamed from: F0 */
        public int mo1326F0() {
            return (C13700o2.this.m76522E() - C13700o2.this.f70818s.top) - C13700o2.this.f70818s.bottom;
        }

        @Override // ad0.InterfaceC0753o
        /* renamed from: G0 */
        public Bitmap mo1327G0() {
            return C13700o2.this.f70825z;
        }

        @Override // ad0.InterfaceC0753o
        /* renamed from: b */
        public boolean mo1328b() {
            C2770a.a m13312c = C13700o2.this.m76546z().m13312c();
            if (m13312c == null || !m13312c.mo13319b()) {
                return false;
            }
            return true;
        }

        @Override // ad0.InterfaceC0753o
        public ViewGroup getMainLayout() {
            InterfaceC11505n2 m76519A = C13700o2.this.m76519A();
            if (m76519A != null) {
                return m76519A.mo62027e();
            }
            return null;
        }

        @Override // ad0.InterfaceC0753o
        public Point getPosition() {
            PointF pointF = C13700o2.this.f70820u;
            return new Point((int) pointF.x, (int) pointF.y);
        }

        @Override // ad0.InterfaceC0753o
        public void invalidate() {
            C13700o2.this.invalidate();
        }

        @Override // ad0.InterfaceC0753o
        public void postInvalidate() {
            C13700o2.this.invalidate();
        }

        @Override // ad0.InterfaceC0753o
        /* renamed from: x0 */
        public boolean mo1329x0() {
            C2770a.a m13312c = C13700o2.this.m76546z().m13312c();
            if (m13312c == null || !m13312c.isShown()) {
                return false;
            }
            return true;
        }

        @Override // ad0.InterfaceC0753o
        /* renamed from: y0 */
        public int mo1330y0() {
            Context m76520B = C13700o2.this.m76520B();
            if (m76520B == null) {
                m76520B = MainApplication.Companion.m35500c();
            }
            return AbstractC23136l9.m118657J(m76520B, AbstractC16802y.item_sticker_height);
        }

        @Override // ad0.InterfaceC0753o
        /* renamed from: z0 */
        public void mo1331z0(String[] strArr) {
            C2770a.a m13312c = C13700o2.this.m76546z().m13312c();
            if (m13312c != null && (m13312c instanceof ChatRowMultiStickers)) {
                C23744a.Companion.m124119a().m124116d(139, strArr, ((ChatRowMultiStickers) m13312c).getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.widget.o2$l */
    /* loaded from: classes6.dex */
    public static final class l extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final l f70851q = new l();

        l() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C3977j mo12V4() {
            return new C3977j(MainApplication.Companion.m35500c());
        }
    }

    public C13700o2(C2770a c2770a) {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        AbstractC19074t.m100208f(c2770a, "args");
        this.f70815p = c2770a;
        this.f70816q = d.f70834p;
        Rect m13313d = c2770a.m13313d();
        this.f70818s = m13313d == null ? new Rect(0, 0, 0, 0) : m13313d;
        this.f70820u = new PointF(0.0f, 0.0f);
        this.f70821v = c.f70826p;
        this.f70802C = "";
        m129210a = AbstractC24856m.m129210a(l.f70851q);
        this.f70806G = m129210a;
        m129210a2 = AbstractC24856m.m129210a(f.f70842q);
        this.f70807H = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(new h());
        this.f70810K = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(g.f70843q);
        this.f70811L = m129210a4;
        Context m76520B = m76520B();
        this.f70812M = AbstractC23136l9.m118745s(m76520B == null ? MainApplication.Companion.m35500c() : m76520B, 22.0f);
        Context m76520B2 = m76520B();
        this.f70813N = AbstractC23136l9.m118745s(m76520B2 == null ? MainApplication.Companion.m35500c() : m76520B2, 16.0f);
        Context m76520B3 = m76520B();
        this.f70814O = AbstractC23136l9.m118745s(m76520B3 == null ? MainApplication.Companion.m35500c() : m76520B3, 2.0f);
        InterfaceC0753o m76513r = m76513r();
        this.f70809J = m76513r;
        this.f70822w = m76515u(this, this.f70817r, null, m76513r, 2, null);
        m76505h0(c2770a.m13314e(), c2770a.m13315f(), null);
    }

    /* renamed from: D */
    private final C3977j m76489D() {
        return (C3977j) this.f70806G.getValue();
    }

    /* renamed from: G */
    private final c m76490G(C25630b c25630b) {
        boolean z11;
        if (c25630b == null) {
            return c.f70831u;
        }
        if (Companion.m76548b(c25630b)) {
            if (c25630b.m132395C() && !this.f70815p.m13311b()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                return c.f70830t;
            }
            C25630b.a aVar = C25630b.f122553O;
            if (aVar.m132449a(this.f70817r)) {
                return c.f70827q;
            }
            if (aVar.m132451c(c25630b)) {
                return c.f70828r;
            }
            return c.f70829s;
        }
        return c.f70826p;
    }

    /* renamed from: K */
    private final void m76491K(C25630b c25630b, String str, boolean z11, boolean z12) {
        if (z11) {
            this.f70805F = true;
        }
        m76534W(z12);
        this.f70802C = str;
        m76540d0(c25630b);
    }

    /* renamed from: M */
    public static final void m76492M(C13700o2 c13700o2, C25630b c25630b) {
        AbstractC19074t.m100208f(c13700o2, "this$0");
        c13700o2.m76540d0(c25630b);
    }

    /* renamed from: P */
    public static /* synthetic */ void m76493P(C13700o2 c13700o2, C25630b c25630b, String str, boolean z11, boolean z12, boolean z13, boolean z14, int i11, Object obj) {
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        if (obj == null) {
            if ((i11 & 4) != 0) {
                z15 = false;
            } else {
                z15 = z11;
            }
            if ((i11 & 8) != 0) {
                z16 = false;
            } else {
                z16 = z12;
            }
            if ((i11 & 16) != 0) {
                z17 = false;
            } else {
                z17 = z13;
            }
            if ((i11 & 32) != 0) {
                z18 = false;
            } else {
                z18 = z14;
            }
            c13700o2.m76529O(c25630b, str, z15, z16, z17, z18);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: playSticker");
    }

    /* renamed from: Q */
    private final void m76494Q(String str, boolean z11, boolean z12) {
        AbstractC24712c abstractC24712c = this.f70822w;
        if (abstractC24712c instanceof AbstractC24710a) {
            ((AbstractC24710a) abstractC24712c).m128319A(str, z11, z12);
        } else if (abstractC24712c instanceof AbstractC24711b) {
            ((AbstractC24711b) abstractC24712c).mo128329t(z12);
        }
    }

    /* renamed from: S */
    public static /* synthetic */ void m76495S(C13700o2 c13700o2, boolean z11, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 1) != 0) {
                z11 = false;
            }
            c13700o2.m76530R(z11);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resetRenderData");
    }

    /* renamed from: c0 */
    public static /* synthetic */ void m76499c0(C13700o2 c13700o2, d dVar, int i11, Size size, int i12, Object obj) {
        if (obj == null) {
            if ((i12 & 4) != 0) {
                size = null;
            }
            c13700o2.m76539b0(dVar, i11, size);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setScaleOption");
    }

    /* renamed from: h0 */
    private final void m76505h0(d dVar, int i11, Size size) {
        this.f70816q = dVar;
        this.f70819t = i11;
        int i12 = this.f70803D;
        int i13 = this.f70804E;
        int i14 = e.f70840a[dVar.ordinal()];
        if (i14 != 1) {
            if (i14 != 2) {
                if (i14 != 3) {
                    Context m76520B = m76520B();
                    if (m76520B == null) {
                        m76520B = MainApplication.Companion.m35500c();
                    }
                    int m118745s = AbstractC23136l9.m118745s(m76520B, 110.0f);
                    this.f70804E = m118745s;
                    this.f70803D = m118745s;
                } else {
                    this.f70803D = i11;
                    float f11 = 1.0f;
                    if (size != null && size.getWidth() * size.getHeight() > 0) {
                        f11 = size.getHeight() / size.getWidth();
                    }
                    this.f70804E = (int) (this.f70803D * f11);
                }
            } else {
                Context m76520B2 = m76520B();
                if (m76520B2 == null) {
                    m76520B2 = MainApplication.Companion.m35500c();
                }
                int m118402g = AbstractC23080g8.m118402g(m76520B2);
                this.f70804E = m118402g;
                this.f70803D = m118402g;
            }
        } else {
            this.f70804E = i11;
            this.f70803D = i11;
        }
        if (i12 != this.f70803D || i13 != this.f70804E) {
            this.f70822w.mo128321p();
        }
    }

    public final void invalidate() {
        if (AbstractC19444a.m101693a()) {
            C2770a.a m13312c = this.f70815p.m13312c();
            if (m13312c != null) {
                m13312c.invalidate();
                return;
            }
            return;
        }
        C2770a.a m13312c2 = this.f70815p.m13312c();
        if (m13312c2 != null) {
            m13312c2.postInvalidate();
        }
    }

    /* renamed from: k */
    private final boolean m76508k(C25630b c25630b) {
        if (m76509l(c25630b) && !C3229a.f13790a.m16395i()) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    private final boolean m76509l(C25630b c25630b) {
        if (C3229a.f13790a.m16391e() && this.f70815p.m13316g() && c25630b.m132447y()) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    private final void m76510m(Canvas canvas) {
        int m116580c;
        int m116580c2;
        C25630b c25630b = this.f70817r;
        if (c25630b != null && m76508k(c25630b)) {
            canvas.save();
            m116580c = AbstractC22543l.m116580c(this.f70803D - this.f70812M, 0);
            m116580c2 = AbstractC22543l.m116580c(this.f70804E - this.f70812M, 0);
            canvas.translate(m116580c, m116580c2);
            Drawable m76517x = m76517x();
            if (m76517x != null) {
                int i11 = this.f70812M;
                m76517x.setBounds(0, 0, i11, i11);
            }
            Drawable m76517x2 = m76517x();
            if (m76517x2 != null) {
                m76517x2.draw(canvas);
            }
            int i12 = this.f70812M;
            int i13 = this.f70814O;
            int i14 = this.f70813N;
            canvas.translate((((i12 - i13) - i14) / 2) + i13, (((i12 - i13) - i14) / 2) + i13);
            m76518y().draw(canvas);
            m76518y().start();
            canvas.restore();
        }
    }

    /* renamed from: p */
    public static /* synthetic */ void m76511p(C13700o2 c13700o2, C25630b c25630b, boolean z11, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                z11 = false;
            }
            c13700o2.m76544n(c25630b, z11);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkLoadThumb");
    }

    /* renamed from: q */
    public static final void m76512q(C25630b c25630b, C13700o2 c13700o2) {
        AbstractC19074t.m100208f(c13700o2, "this$0");
        c13700o2.m76541e0(C28020b3.f130648a.m141206w(c25630b));
    }

    /* renamed from: r */
    private final InterfaceC0753o m76513r() {
        return new k();
    }

    /* renamed from: s */
    private final AbstractC24712c m76514s(C25630b c25630b, c cVar, InterfaceC0753o interfaceC0753o) {
        boolean z11;
        AbstractC24712c c24716g;
        if (c25630b != null) {
            z11 = m76509l(c25630b);
        } else {
            z11 = false;
        }
        if (cVar == null) {
            cVar = m76490G(c25630b);
        }
        c cVar2 = cVar;
        int i11 = e.f70841b[cVar2.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3 && i11 != 4) {
                    if (i11 != 5) {
                        c24716g = new C24714e(new C2771b(c25630b, null, f70799P, false, false, false, false, z11, ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_422, null));
                        c24716g.mo128321p();
                    } else {
                        c24716g = new C24718i(new C2771b(c25630b, null, f70799P, false, false, false, false, z11, ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_422, null));
                    }
                } else {
                    c24716g = new C24713d(new C2771b(c25630b, cVar2, f70799P, this.f70815p.m13317h(), this.f70801B, this.f70815p.m13311b(), this.f70815p.m13310a(), z11));
                }
            } else {
                c24716g = new C24715f(new C2771b(c25630b, cVar2, f70799P, this.f70815p.m13317h(), this.f70801B, this.f70815p.m13311b(), this.f70815p.m13310a(), z11));
            }
        } else {
            c24716g = new C24716g(new C2771b(c25630b, null, null, false, this.f70801B, this.f70815p.m13311b(), false, z11, 78, null));
        }
        c24716g.mo128322r(interfaceC0753o);
        return c24716g;
    }

    /* renamed from: u */
    static /* synthetic */ AbstractC24712c m76515u(C13700o2 c13700o2, C25630b c25630b, c cVar, InterfaceC0753o interfaceC0753o, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                cVar = null;
            }
            return c13700o2.m76514s(c25630b, cVar, interfaceC0753o);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createStickerDrawer");
    }

    /* renamed from: w */
    private final C23528a m76516w() {
        return (C23528a) this.f70807H.getValue();
    }

    /* renamed from: x */
    private final Drawable m76517x() {
        return (Drawable) this.f70811L.getValue();
    }

    /* renamed from: y */
    private final C17291a m76518y() {
        return (C17291a) this.f70810K.getValue();
    }

    /* renamed from: A */
    public final InterfaceC11505n2 m76519A() {
        return this.f70823x;
    }

    /* renamed from: B */
    public final Context m76520B() {
        C2770a.a m13312c = this.f70815p.m13312c();
        if (m13312c != null) {
            return m13312c.getContext();
        }
        return null;
    }

    /* renamed from: C */
    public final String m76521C() {
        return this.f70802C;
    }

    /* renamed from: E */
    public final int m76522E() {
        return this.f70804E;
    }

    /* renamed from: F */
    public final b m76523F() {
        return this.f70824y;
    }

    /* renamed from: H */
    public final int m76524H() {
        return this.f70803D;
    }

    /* renamed from: I */
    public final boolean m76525I() {
        C24716g c24716g;
        AbstractC24712c abstractC24712c = this.f70822w;
        if (abstractC24712c instanceof C24716g) {
            c24716g = (C24716g) abstractC24712c;
        } else {
            c24716g = null;
        }
        if (c24716g != null) {
            return c24716g.m128366D();
        }
        return false;
    }

    /* renamed from: J */
    public final boolean m76526J() {
        return this.f70805F;
    }

    /* renamed from: L */
    public final void m76527L(C25630b c25630b) {
        AbstractC0840r.m2251h(new Runnable() { // from class: com.zing.zalo.ui.widget.n2

            /* renamed from: q */
            public final /* synthetic */ C25630b f70750q;

            public /* synthetic */ RunnableC13695n2(C25630b c25630b2) {
                r2 = c25630b2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C13700o2.m76492M(C13700o2.this, r2);
            }
        });
    }

    /* renamed from: N */
    public final void m76528N() {
        AbstractC24710a abstractC24710a;
        AbstractC24712c abstractC24712c = this.f70822w;
        if (abstractC24712c instanceof AbstractC24710a) {
            abstractC24710a = (AbstractC24710a) abstractC24712c;
        } else {
            abstractC24710a = null;
        }
        if (abstractC24710a != null) {
            abstractC24710a.m128325v();
        }
    }

    /* renamed from: O */
    public final synchronized void m76529O(C25630b c25630b, String str, boolean z11, boolean z12, boolean z13, boolean z14) {
        AbstractC19074t.m100208f(str, "animationId");
        if (c25630b == null) {
            return;
        }
        C25630b.a aVar = C25630b.f122553O;
        if (aVar.m132450b(c25630b)) {
            if (!this.f70815p.m13310a()) {
                return;
            }
            if (!aVar.m132451c(c25630b)) {
                return;
            }
        }
        m76491K(c25630b, str, z11, z14);
        m76494Q(str, z12, z13);
        C28020b3.f130648a.m141191e(this.f70817r);
    }

    /* renamed from: R */
    public final synchronized void m76530R(boolean z11) {
        AbstractC24710a abstractC24710a = null;
        try {
            try {
                this.f70817r = null;
                this.f70825z = null;
                this.f70800A = null;
                m76543g0("");
                m76505h0(this.f70816q, this.f70819t, null);
                AbstractC24712c abstractC24712c = this.f70822w;
                if (abstractC24712c instanceof AbstractC24710a) {
                    abstractC24710a = (AbstractC24710a) abstractC24712c;
                }
                if (abstractC24710a != null) {
                    abstractC24710a.m128326w(z11);
                }
                this.f70805F = false;
                m76534W(false);
                m76518y().stop();
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: T */
    public final void m76531T() {
        C24716g c24716g;
        AbstractC24712c abstractC24712c = this.f70822w;
        if (abstractC24712c instanceof C24716g) {
            c24716g = (C24716g) abstractC24712c;
        } else {
            c24716g = null;
        }
        if (c24716g != null) {
            c24716g.m128367E();
        }
    }

    /* renamed from: U */
    public final void m76532U() {
        AbstractC24710a abstractC24710a;
        AbstractC24712c abstractC24712c = this.f70822w;
        if (abstractC24712c instanceof AbstractC24710a) {
            abstractC24710a = (AbstractC24710a) abstractC24712c;
        } else {
            abstractC24710a = null;
        }
        if (abstractC24710a != null && abstractC24710a.m128324u()) {
            this.f70805F = true;
            abstractC24710a.m128327y();
        }
    }

    /* renamed from: V */
    public final void m76533V(InterfaceC11505n2 interfaceC11505n2) {
        this.f70823x = interfaceC11505n2;
    }

    /* renamed from: W */
    public final void m76534W(boolean z11) {
        AbstractC24710a abstractC24710a;
        this.f70801B = z11;
        AbstractC24712c abstractC24712c = this.f70822w;
        if (abstractC24712c instanceof AbstractC24710a) {
            abstractC24710a = (AbstractC24710a) abstractC24712c;
        } else {
            abstractC24710a = null;
        }
        if (abstractC24710a != null) {
            abstractC24710a.m128328z(z11);
        }
    }

    /* renamed from: X */
    public final void m76535X(b bVar) {
        this.f70824y = bVar;
    }

    /* renamed from: Y */
    public final void m76536Y(int i11, int i12, int i13, int i14) {
        this.f70818s.set(i11, i12, i13, i14);
    }

    /* renamed from: Z */
    public final void m76537Z(boolean z11) {
        this.f70805F = z11;
    }

    /* renamed from: a0 */
    public final void m76538a0(float f11, float f12) {
        this.f70820u.set(f11, f12);
    }

    /* renamed from: b0 */
    public final void m76539b0(d dVar, int i11, Size size) {
        AbstractC19074t.m100208f(dVar, "sizeType");
        m76505h0(dVar, i11, size);
    }

    /* renamed from: d0 */
    public final void m76540d0(C25630b c25630b) {
        AbstractC24710a abstractC24710a;
        C25630b m128342h;
        String str;
        c m76490G = m76490G(c25630b);
        if (c25630b != null && (m128342h = this.f70822w.m128342h()) != null && m128342h.m132429g() == c25630b.m132429g() && m76490G == this.f70821v) {
            C25630b m128342h2 = this.f70822w.m128342h();
            if (m128342h2 != null) {
                str = m128342h2.m132446x();
            } else {
                str = null;
            }
            if (AbstractC19074t.m100204b(str, c25630b.m132446x())) {
                this.f70822w.mo128345s(c25630b);
                this.f70817r = c25630b;
            }
        }
        this.f70821v = m76490G;
        AbstractC24712c abstractC24712c = this.f70822w;
        if (abstractC24712c instanceof AbstractC24710a) {
            abstractC24710a = (AbstractC24710a) abstractC24712c;
        } else {
            abstractC24710a = null;
        }
        if (abstractC24710a != null) {
            AbstractC24710a.m128318x(abstractC24710a, false, 1, null);
        }
        this.f70822w.mo128322r(null);
        this.f70822w = m76514s(c25630b, m76490G, this.f70809J);
        this.f70817r = c25630b;
    }

    /* renamed from: e0 */
    public final void m76541e0(Bitmap bitmap) {
        if (!AbstractC19074t.m100204b(bitmap, this.f70825z)) {
            this.f70800A = null;
            this.f70825z = bitmap;
            invalidate();
        }
    }

    /* renamed from: f0 */
    public final void m76542f0(Drawable drawable) {
        if (!AbstractC19074t.m100204b(drawable, this.f70800A)) {
            this.f70825z = null;
            this.f70800A = drawable;
            invalidate();
        }
    }

    protected final void finalize() {
        AbstractC24710a abstractC24710a;
        AbstractC24712c abstractC24712c = this.f70822w;
        if (abstractC24712c instanceof AbstractC24710a) {
            abstractC24710a = (AbstractC24710a) abstractC24712c;
        } else {
            abstractC24710a = null;
        }
        if (abstractC24710a != null) {
            abstractC24710a.m128326w(true);
        }
    }

    /* renamed from: g0 */
    public final void m76543g0(String str) {
        if (!AbstractC19074t.m100204b(this.f70808I, str)) {
            this.f70808I = str;
            if (str != null && str.length() != 0) {
                m76544n(this.f70817r, false);
            } else {
                this.f70825z = null;
                this.f70800A = null;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        AbstractC19074t.m100208f(drawable, "who");
        C2770a.a m13312c = this.f70815p.m13312c();
        if (m13312c != null) {
            m13312c.invalidate();
        }
    }

    /* renamed from: n */
    public final void m76544n(C25630b c25630b, boolean z11) {
        String str;
        C24003n m120068F;
        Bitmap bitmap = this.f70825z;
        if (bitmap != null && !bitmap.isRecycled()) {
            return;
        }
        String str2 = this.f70802C;
        String str3 = this.f70808I;
        Bitmap bitmap2 = null;
        if (str3 != null && str3.length() > 0) {
            str = this.f70808I;
        } else if (c25630b != null) {
            str = c25630b.m132444v();
        } else {
            str = null;
        }
        if (str != null && str.length() > 0) {
            String str4 = this.f70808I;
            if (str4 != null && str4.length() > 0) {
                m120068F = C23278z2.m120091Q0();
            } else {
                m120068F = C23278z2.m120068F();
            }
            C3979l m125676A2 = C23999j.m125676A2(str, m120068F.f116260a, m120068F.f116266g);
            if (m125676A2 != null) {
                bitmap2 = m125676A2.m18839c();
            }
            if (bitmap2 != null) {
                m76541e0(m125676A2.m18839c());
                return;
            } else {
                ((C23528a) m76516w().m123612r(m76489D())).m123579C(str, m120068F, new i(str, str2, this));
                return;
            }
        }
        if (c25630b != null && !C25630b.f122553O.m132451c(c25630b)) {
            if (c25630b.m132448z()) {
                Bitmap m141205v = C28020b3.f130648a.m141205v(c25630b, false);
                if (m141205v != null) {
                    m76541e0(m141205v);
                    return;
                } else {
                    AbstractC0840r.m2251h(new Runnable() { // from class: com.zing.zalo.ui.widget.m2

                        /* renamed from: q */
                        public final /* synthetic */ C13700o2 f70717q;

                        public /* synthetic */ RunnableC13690m2(C13700o2 this) {
                            r2 = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C13700o2.m76512q(C25630b.this, r2);
                        }
                    });
                    return;
                }
            }
            if (!TextUtils.isEmpty(c25630b.m132446x())) {
                C3979l m125837F1 = AbstractC24006q.m125837F1(AbstractC24006q.m125850W1(c25630b.m132446x(), z11));
                if (m125837F1 != null && m125837F1.m18839c() != null && !m125837F1.m18839c().isRecycled()) {
                    m76541e0(m125837F1.m18839c());
                    return;
                }
                return;
            }
            C28020b3.f130648a.m141204u(c25630b, new j(str2), z11);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j11) {
        AbstractC19074t.m100208f(drawable, "who");
        AbstractC19074t.m100208f(runnable, "what");
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        AbstractC19074t.m100208f(drawable, "who");
        AbstractC19074t.m100208f(runnable, "what");
    }

    /* renamed from: v */
    public final void m76545v(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        try {
            canvas.save();
            PointF pointF = this.f70820u;
            float f11 = pointF.x;
            Rect rect = this.f70818s;
            canvas.translate(f11 + rect.left, pointF.y + rect.top);
            this.f70822w.mo128338b(canvas);
            m76510m(canvas);
            canvas.restore();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: z */
    public final C2770a m76546z() {
        return this.f70815p;
    }
}

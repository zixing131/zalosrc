package ad0;

import ag0.AbstractC0840r;
import android.graphics.Canvas;
import android.graphics.Point;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.work.AbstractC2144f;
import com.zing.zalo.common.C7852a;
import com.zing.zalo.p077ui.chat.ChatFrameLayout;
import com.zing.zalo.uicontrol.C16673w;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import mm0.AbstractC23350e;
import p098dc.InterfaceC17872f;
import p363nh.C23744a;
import p471r3.C25630b;
import p530tx.AbstractC26903a;
import vg.C28181s2;

/* renamed from: ad0.l */
/* loaded from: classes4.dex */
public final class C0750l implements InterfaceC0746h, InterfaceC0745g, C7852a.f {
    public static final a Companion = new a(null);

    /* renamed from: A */
    private final Runnable f2509A;

    /* renamed from: p */
    private final b f2510p;

    /* renamed from: q */
    private C25630b f2511q;

    /* renamed from: r */
    private boolean f2512r;

    /* renamed from: s */
    private String f2513s;

    /* renamed from: t */
    private boolean f2514t;

    /* renamed from: u */
    private boolean f2515u;

    /* renamed from: v */
    private InterfaceC0753o f2516v;

    /* renamed from: w */
    private boolean f2517w;

    /* renamed from: x */
    private boolean f2518x;

    /* renamed from: y */
    private C7852a f2519y;

    /* renamed from: z */
    private final Handler f2520z;

    /* renamed from: ad0.l$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: ad0.l$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        private final C25630b f2521a;

        /* renamed from: b */
        private final boolean f2522b;

        /* renamed from: c */
        private final boolean f2523c;

        public b(C25630b c25630b, boolean z11, boolean z12) {
            this.f2521a = c25630b;
            this.f2522b = z11;
            this.f2523c = z12;
        }

        /* renamed from: a */
        public final boolean m1318a() {
            return this.f2522b;
        }

        /* renamed from: b */
        public final C25630b m1319b() {
            return this.f2521a;
        }

        /* renamed from: c */
        public final boolean m1320c() {
            return this.f2523c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC19074t.m100204b(this.f2521a, bVar.f2521a) && this.f2522b == bVar.f2522b && this.f2523c == bVar.f2523c;
        }

        public int hashCode() {
            C25630b c25630b = this.f2521a;
            return ((((c25630b == null ? 0 : c25630b.hashCode()) * 31) + AbstractC2144f.m11520a(this.f2522b)) * 31) + AbstractC2144f.m11520a(this.f2523c);
        }

        public String toString() {
            return "Params(stickerInfo=" + this.f2521a + ", loop=" + this.f2522b + ", isForcePNGListDecoder=" + this.f2523c + ")";
        }
    }

    /* renamed from: ad0.l$c */
    /* loaded from: classes4.dex */
    public static final class c extends Handler {
        c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            InterfaceC0753o interfaceC0753o;
            InterfaceC0753o interfaceC0753o2;
            AbstractC19074t.m100208f(message, "msg");
            if (message.what == 1) {
                try {
                    if (C0750l.this.f2516v != null && ((interfaceC0753o = C0750l.this.f2516v) == null || interfaceC0753o.mo1322B0(C0750l.this.f2511q, C0750l.this.f2513s))) {
                        if (C0750l.this.f2516v != null && ((interfaceC0753o2 = C0750l.this.f2516v) == null || interfaceC0753o2.mo1329x0())) {
                            C0750l.this.m1302K();
                        }
                        C0750l.this.mo1259p();
                        return;
                    }
                    C0750l.this.mo1259p();
                    return;
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                }
            }
            super.handleMessage(message);
        }
    }

    public C0750l(b bVar) {
        AbstractC19074t.m100208f(bVar, "args");
        this.f2510p = bVar;
        this.f2511q = bVar.m1319b();
        this.f2512r = bVar.m1318a();
        this.f2513s = "";
        this.f2520z = new c(Looper.getMainLooper());
        this.f2509A = new Runnable() { // from class: ad0.j
            @Override // java.lang.Runnable
            public final void run() {
                C0750l.m1301J(C0750l.this);
            }
        };
    }

    /* renamed from: C */
    private final boolean m1294C() {
        String str;
        if (this.f2519y == null && m1300I()) {
            this.f2519y = new C7852a(this);
        }
        C7852a c7852a = this.f2519y;
        if (c7852a != null) {
            C25630b c25630b = this.f2511q;
            if (c25630b != null) {
                str = c25630b.m132431i();
            } else {
                str = null;
            }
            c7852a.m39994W(str);
        }
        if (this.f2519y != null) {
            return true;
        }
        return false;
    }

    /* renamed from: D */
    private final boolean m1295D() {
        InterfaceC0753o interfaceC0753o = this.f2516v;
        if (interfaceC0753o != null && ((interfaceC0753o == null || interfaceC0753o.mo1322B0(this.f2511q, this.f2513s)) && (!this.f2518x || this.f2512r))) {
            return false;
        }
        this.f2518x = true;
        InterfaceC0753o interfaceC0753o2 = this.f2516v;
        if (interfaceC0753o2 != null) {
            interfaceC0753o2.mo1325E0(this.f2513s);
        }
        return true;
    }

    /* renamed from: E */
    private final void m1296E() {
        final C16673w c16673w;
        InterfaceC17872f m1298G = m1298G();
        if (m1298G instanceof C16673w) {
            c16673w = (C16673w) m1298G;
        } else {
            c16673w = null;
        }
        if (c16673w != null) {
            this.f2520z.post(new Runnable() { // from class: ad0.k
                @Override // java.lang.Runnable
                public final void run() {
                    C0750l.m1297F(C0750l.this, c16673w);
                }
            });
        } else {
            this.f2518x = true;
        }
        InterfaceC0753o interfaceC0753o = this.f2516v;
        if (interfaceC0753o != null) {
            interfaceC0753o.invalidate();
        }
        m1304M(m1299H());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public static final void m1297F(C0750l c0750l, C16673w c16673w) {
        AbstractC19074t.m100208f(c0750l, "this$0");
        AbstractC19074t.m100208f(c16673w, "$it");
        C7852a c7852a = c0750l.f2519y;
        if (c7852a != null) {
            c7852a.m39998h0(c16673w);
        }
    }

    /* renamed from: G */
    private final InterfaceC17872f m1298G() {
        return C28181s2.m141720n(C28181s2.f131306a, this.f2511q, this.f2510p.m1320c(), 0, 0, 0, 28, null);
    }

    /* renamed from: H */
    private final int m1299H() {
        InterfaceC17872f m1298G = m1298G();
        if (m1298G != null) {
            return m1298G.mo88376c(0);
        }
        return 1000;
    }

    /* renamed from: I */
    private final boolean m1300I() {
        InterfaceC17872f m1298G = m1298G();
        if ((m1298G == null || m1298G.getType() != 0) && !this.f2510p.m1320c()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public static final void m1301J(C0750l c0750l) {
        AbstractC19074t.m100208f(c0750l, "this$0");
        try {
            c0750l.m1303L();
            if (c0750l.m1295D()) {
                return;
            }
            c0750l.m1296E();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public final void m1302K() {
        if (!m1295D()) {
            AbstractC0840r.m2251h(this.f2509A);
        }
    }

    /* renamed from: L */
    private final void m1303L() {
        this.f2520z.removeMessages(1);
    }

    /* renamed from: M */
    private final void m1304M(int i11) {
        m1303L();
        Message obtain = Message.obtain();
        obtain.what = 1;
        this.f2520z.sendMessageDelayed(obtain, i11);
    }

    @Override // ad0.InterfaceC0746h
    /* renamed from: a */
    public boolean mo1288a() {
        C7852a c7852a = this.f2519y;
        if (c7852a == null || c7852a.m39987G()) {
            return false;
        }
        return true;
    }

    @Override // com.zing.zalo.common.C7852a.f
    /* renamed from: b */
    public boolean mo1309b() {
        InterfaceC0753o interfaceC0753o = this.f2516v;
        if (interfaceC0753o == null || !interfaceC0753o.mo1328b()) {
            return false;
        }
        return true;
    }

    @Override // ad0.InterfaceC0747i
    /* renamed from: c */
    public void mo1251c(boolean z11) {
        this.f2512r = z11;
    }

    @Override // ad0.InterfaceC0745g
    /* renamed from: d */
    public void mo1287d() {
        C7852a c7852a = this.f2519y;
        if (c7852a != null) {
            c7852a.m39993V();
        }
    }

    @Override // com.zing.zalo.common.C7852a.f
    /* renamed from: e */
    public boolean mo1310e() {
        return true;
    }

    @Override // ad0.InterfaceC0747i
    /* renamed from: f */
    public void mo1253f(C25630b c25630b) {
        AbstractC19074t.m100208f(c25630b, "stickerInfo");
        this.f2511q = c25630b;
        C7852a c7852a = this.f2519y;
        if (c7852a != null) {
            c7852a.m39994W(c25630b.m132431i());
        }
    }

    @Override // com.zing.zalo.common.C7852a.f
    /* renamed from: g */
    public void mo1311g(int i11, String str) {
        C23744a.Companion.m124119a().m124116d(138, Integer.valueOf(i11), str);
    }

    @Override // com.zing.zalo.common.C7852a.f
    public int getAnimHeight() {
        InterfaceC0753o interfaceC0753o = this.f2516v;
        if (interfaceC0753o != null) {
            return interfaceC0753o.mo1326F0();
        }
        return 0;
    }

    @Override // com.zing.zalo.common.C7852a.f
    public int getAnimWidth() {
        InterfaceC0753o interfaceC0753o = this.f2516v;
        if (interfaceC0753o != null) {
            return interfaceC0753o.mo1321A0();
        }
        return 0;
    }

    @Override // com.zing.zalo.common.C7852a.f
    public C7852a.d getDimensionFullScreenEvent() {
        return new C7852a.d(AbstractC26903a.m138661b(), AbstractC26903a.m138662c());
    }

    @Override // com.zing.zalo.common.C7852a.f
    public ImageView getFullscreenView() {
        ChatFrameLayout chatFrameLayout;
        ViewGroup mainLayout = getMainLayout();
        if (mainLayout instanceof ChatFrameLayout) {
            chatFrameLayout = (ChatFrameLayout) mainLayout;
        } else {
            chatFrameLayout = null;
        }
        if (chatFrameLayout == null) {
            return null;
        }
        return chatFrameLayout.getFullscreenView();
    }

    @Override // com.zing.zalo.common.C7852a.f
    public ViewGroup getMainLayout() {
        InterfaceC0753o interfaceC0753o = this.f2516v;
        if (interfaceC0753o != null) {
            return interfaceC0753o.getMainLayout();
        }
        return null;
    }

    @Override // com.zing.zalo.common.C7852a.f
    public Point getPosition() {
        InterfaceC0753o interfaceC0753o = this.f2516v;
        if (interfaceC0753o != null) {
            return interfaceC0753o.getPosition();
        }
        return null;
    }

    @Override // ad0.InterfaceC0747i
    /* renamed from: i */
    public void mo1257i(boolean z11) {
        m1303L();
    }

    @Override // com.zing.zalo.common.C7852a.f
    public void invalidate() {
        InterfaceC0753o interfaceC0753o = this.f2516v;
        if (interfaceC0753o != null) {
            interfaceC0753o.invalidate();
        }
    }

    @Override // ad0.InterfaceC0747i
    /* renamed from: j */
    public boolean mo1258j() {
        return this.f2517w;
    }

    @Override // com.zing.zalo.common.C7852a.f
    /* renamed from: k */
    public void mo1312k() {
    }

    @Override // com.zing.zalo.common.C7852a.f
    /* renamed from: l */
    public void mo1313l(String[] strArr) {
        InterfaceC0753o interfaceC0753o = this.f2516v;
        if (interfaceC0753o != null) {
            interfaceC0753o.mo1331z0(strArr);
        }
    }

    @Override // ad0.InterfaceC0746h
    /* renamed from: m */
    public boolean mo1289m(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        C7852a c7852a = this.f2519y;
        if (c7852a != null && !c7852a.m39987G()) {
            c7852a.m40000y(canvas);
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.common.C7852a.f
    /* renamed from: n */
    public float mo1314n(float f11, float f12) {
        if (f12 <= 0.0f) {
            return 1.0f;
        }
        return (getAnimHeight() * 1.0f) / f12;
    }

    @Override // ad0.InterfaceC0746h
    /* renamed from: o */
    public void mo1290o() {
        C7852a c7852a = this.f2519y;
        if (c7852a != null) {
            c7852a.m39999w();
            c7852a.m39996b0(false);
        }
    }

    @Override // ad0.InterfaceC0747i
    /* renamed from: p */
    public void mo1259p() {
        this.f2517w = true;
        m1303L();
        InterfaceC0753o interfaceC0753o = this.f2516v;
        if (interfaceC0753o != null) {
            interfaceC0753o.mo1325E0(this.f2513s);
        }
    }

    @Override // ad0.InterfaceC0747i
    /* renamed from: q */
    public void mo1260q() {
        mo1262v(this.f2513s, this.f2514t, this.f2515u);
    }

    @Override // com.zing.zalo.common.C7852a.f
    /* renamed from: r */
    public boolean mo1315r() {
        return this.f2512r;
    }

    @Override // com.zing.zalo.common.C7852a.f
    /* renamed from: s */
    public void mo1316s() {
        this.f2518x = true;
        m1304M(0);
    }

    @Override // ad0.InterfaceC0747i
    /* renamed from: t */
    public void mo1261t(InterfaceC0753o interfaceC0753o) {
        this.f2516v = interfaceC0753o;
    }

    @Override // com.zing.zalo.common.C7852a.f
    /* renamed from: u */
    public boolean mo1317u() {
        return this.f2515u;
    }

    @Override // ad0.InterfaceC0747i
    /* renamed from: v */
    public void mo1262v(String str, boolean z11, boolean z12) {
        C7852a c7852a;
        AbstractC19074t.m100208f(str, "animationId");
        if (m1294C()) {
            this.f2513s = str;
            this.f2517w = false;
            this.f2514t = z11;
            this.f2515u = z12;
            if (z11 && (c7852a = this.f2519y) != null) {
                c7852a.m39988L();
            }
            m1302K();
        }
    }
}

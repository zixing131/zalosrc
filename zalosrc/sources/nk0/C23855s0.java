package nk0;

import android.graphics.Canvas;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.zing.zalo.zinstant.InterfaceC17139d;
import com.zing.zalo.zinstant.component.p081ui.ZinstantView;
import com.zing.zalo.zinstant.utils.AbstractC17203o;
import com.zing.zalo.zinstant.utils.C17204p;
import com.zing.zalo.zinstant.utils.InterfaceC17194f;
import com.zing.zalo.zinstant.view.ZinstantLayout;
import com.zing.zalo.zinstant.zom.meta.ImpressionMeta;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zinstant.zom.node.ZOMDocument;
import com.zing.zalo.zinstant.zom.node.ZOMFontFace;
import com.zing.zalo.zinstant.zom.node.ZOMGlobalConfig;
import com.zing.zalo.zinstant.zom.properties.ZOMRect;
import ho0.AbstractC20110a;
import ik0.InterfaceC20578a0;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import pj0.C24779e;
import pj0.InterfaceC24775a;
import pj0.InterfaceC24786l;
import pj0.InterfaceC24787m;
import pj0.InterfaceC24794t;
import pk0.AbstractC24805d;
import qk0.AbstractC25310f;
import qk0.InterfaceC25316l;
import tk0.C26730b;
import vj0.C28273g;
import wj0.InterfaceC29061b;

/* renamed from: nk0.s0 */
/* loaded from: classes7.dex */
public class C23855s0 implements InterfaceC20578a0, InterfaceC23806a, InterfaceC23809b {

    /* renamed from: a */
    public ZOM f115177a;

    /* renamed from: b */
    public ZOMDocument f115178b;

    /* renamed from: c */
    public AbstractC25310f f115179c;

    /* renamed from: h */
    private C24779e f115184h;

    /* renamed from: p */
    InterfaceC23809b f115192p;

    /* renamed from: d */
    private final Set f115180d = new LinkedHashSet();

    /* renamed from: e */
    private boolean f115181e = true;

    /* renamed from: f */
    private final HashMap f115182f = new HashMap();

    /* renamed from: g */
    public WeakReference f115183g = new WeakReference(null);

    /* renamed from: i */
    public final AbstractC24805d f115185i = new a();

    /* renamed from: j */
    private final Handler f115186j = new Handler(Looper.getMainLooper());

    /* renamed from: k */
    private int f115187k = 0;

    /* renamed from: l */
    private final Runnable f115188l = new b();

    /* renamed from: m */
    private final Runnable f115189m = new Runnable() { // from class: nk0.k0
        public /* synthetic */ RunnableC23837k0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C23855s0.this.m124600M();
        }
    };

    /* renamed from: n */
    private final Runnable f115190n = new Runnable() { // from class: nk0.l0
        public /* synthetic */ RunnableC23840l0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C23855s0.this.m124601N();
        }
    };

    /* renamed from: o */
    private final Runnable f115191o = new Runnable() { // from class: nk0.m0
        public /* synthetic */ RunnableC23843m0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C23855s0.this.m124602O();
        }
    };

    /* renamed from: q */
    private final Runnable f115193q = new Runnable() { // from class: nk0.n0
        public /* synthetic */ RunnableC23845n0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C23855s0.this.m124603P();
        }
    };

    /* renamed from: r */
    private final Runnable f115194r = new Runnable() { // from class: nk0.o0
        public /* synthetic */ RunnableC23847o0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C23855s0.this.m124604Q();
        }
    };

    /* renamed from: s */
    private WeakReference f115195s = new WeakReference(null);

    /* renamed from: t */
    private final InterfaceC24794t f115196t = new c();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nk0.s0$a */
    /* loaded from: classes7.dex */
    public class a extends AbstractC24805d {
        a() {
        }

        @Override // pk0.AbstractC24805d
        /* renamed from: f */
        public InterfaceC25316l mo124652f() {
            return (InterfaceC25316l) C23855s0.this.f115183g.get();
        }
    }

    /* renamed from: nk0.s0$b */
    /* loaded from: classes7.dex */
    public class b implements Runnable {

        /* renamed from: nk0.s0$b$a */
        /* loaded from: classes7.dex */
        class a implements InterfaceC24775a {
            a() {
            }

            @Override // pj0.InterfaceC24775a
            /* renamed from: a */
            public void onSuccess(Void r22) {
                ZOMFontFace zOMFontFace;
                AbstractC25310f abstractC25310f = C23855s0.this.f115179c;
                if (abstractC25310f != null && abstractC25310f.m131003G() == AbstractC25310f.a.ZinstantNode && (zOMFontFace = C23855s0.this.f115178b.mFontFace) != null && zOMFontFace.needInvalidate()) {
                    C23855s0.this.m124608d0();
                }
            }

            @Override // pj0.InterfaceC24775a
            /* renamed from: c */
            public void mo15338c(Exception exc) {
            }
        }

        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC25310f abstractC25310f = C23855s0.this.f115179c;
            if (abstractC25310f != null) {
                abstractC25310f.onStart();
            }
            ZOMDocument zOMDocument = C23855s0.this.f115178b;
            if (zOMDocument != null && C28273g.m142446q(zOMDocument.mFontFace)) {
                C28273g.m142439i().m142457v(C23855s0.this.f115178b.mFontFace, new a(), false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nk0.s0$c */
    /* loaded from: classes7.dex */
    public class c implements InterfaceC24794t {
        c() {
        }

        @Override // pj0.InterfaceC24794t
        /* renamed from: a */
        public InterfaceC24786l mo92018a() {
            InterfaceC24794t m124619x = C23855s0.this.m124619x();
            if (m124619x != null) {
                return m124619x.mo92018a();
            }
            return null;
        }

        @Override // pj0.InterfaceC24794t
        /* renamed from: b */
        public InterfaceC24787m mo92019b() {
            InterfaceC24794t m124619x = C23855s0.this.m124619x();
            if (m124619x != null) {
                return m124619x.mo92019b();
            }
            return null;
        }

        @Override // pj0.InterfaceC24794t
        /* renamed from: c */
        public void mo92020c() {
            InterfaceC24794t m124619x = C23855s0.this.m124619x();
            if (m124619x != null) {
                m124619x.mo92020c();
            }
        }
    }

    public C23855s0(ZOMDocument zOMDocument) {
        this.f115178b = zOMDocument;
        zOMDocument.setOwnerRoot(this);
        this.f115177a = zOMDocument.mZOMRoot;
        m124622C();
        m124607a0();
    }

    /* renamed from: L */
    public static /* synthetic */ boolean m124599L(String str, ZOM zom) {
        if (zom != null && TextUtils.equals(str, zom.mAnchorType) && zom.mVisibility == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: M */
    public /* synthetic */ void m124600M() {
        AbstractC25310f abstractC25310f = this.f115179c;
        if (abstractC25310f != null) {
            abstractC25310f.onPause();
        }
    }

    /* renamed from: N */
    public /* synthetic */ void m124601N() {
        AbstractC25310f abstractC25310f = this.f115179c;
        if (abstractC25310f != null) {
            abstractC25310f.onResume();
        }
    }

    /* renamed from: O */
    public /* synthetic */ void m124602O() {
        AbstractC25310f abstractC25310f = this.f115179c;
        if (abstractC25310f != null) {
            abstractC25310f.onStop();
        }
    }

    /* renamed from: P */
    public /* synthetic */ void m124603P() {
        ZOMDocument zOMDocument = this.f115178b;
        if (zOMDocument != null) {
            zOMDocument.onAttach();
        }
    }

    /* renamed from: Q */
    public /* synthetic */ void m124604Q() {
        ZOMDocument zOMDocument = this.f115178b;
        if (zOMDocument != null) {
            zOMDocument.onDetach();
        }
    }

    /* renamed from: R */
    public static /* synthetic */ boolean m124605R(String str, ZOM zom) {
        if (zom != null && TextUtils.equals(str, zom.mID)) {
            return true;
        }
        return false;
    }

    /* renamed from: T */
    public static C23855s0 m124606T(InterfaceC20578a0 interfaceC20578a0) {
        if (interfaceC20578a0 instanceof ZOMDocument) {
            ZOMDocument zOMDocument = (ZOMDocument) interfaceC20578a0;
            InterfaceC23809b interfaceC23809b = zOMDocument.mOwnerRoot.get();
            if (interfaceC23809b instanceof C23855s0) {
                return (C23855s0) interfaceC23809b;
            }
            return new C23855s0(zOMDocument);
        }
        if (interfaceC20578a0 instanceof C23855s0) {
            return (C23855s0) interfaceC20578a0;
        }
        return null;
    }

    /* renamed from: a0 */
    private void m124607a0() {
        String str;
        ZOM m124647u;
        try {
            ZOMDocument zOMDocument = this.f115178b;
            if (zOMDocument != null) {
                str = zOMDocument.mZinstantMetadata.getViewportId();
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str) && (m124647u = m124647u(new InterfaceC17194f() { // from class: nk0.r0

                /* renamed from: a */
                public final /* synthetic */ String f115175a;

                public /* synthetic */ C23853r0(String str2) {
                    r1 = str2;
                }

                @Override // com.zing.zalo.zinstant.utils.InterfaceC17194f
                /* renamed from: a */
                public final boolean mo91804a(Object obj) {
                    boolean m124605R;
                    m124605R = C23855s0.m124605R(r1, (ZOM) obj);
                    return m124605R;
                }
            }, false)) != null) {
                ZOMRect zOMRect = m124647u.mBound;
                this.f115184h = new C24779e(zOMRect.left, zOMRect.top, zOMRect.right, zOMRect.bottom);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        if (this.f115184h == null) {
            ZOM zom = this.f115177a;
            this.f115184h = new C24779e(0, 0, zom.mWidth, zom.mHeight);
        }
    }

    /* renamed from: d0 */
    public void m124608d0() {
        ZinstantView zinstantView;
        InterfaceC25316l interfaceC25316l = (InterfaceC25316l) this.f115183g.get();
        if (interfaceC25316l != null) {
            zinstantView = (ZinstantView) interfaceC25316l.getView();
        } else {
            zinstantView = null;
        }
        if (zinstantView != null && (zinstantView.getParent() instanceof ZinstantLayout)) {
            ((ZinstantLayout) zinstantView.getParent()).m91967F0();
        }
    }

    /* renamed from: s */
    private AbstractC25310f m124618s(ZOM zom) {
        return C17204p.m91834a(this, zom);
    }

    /* renamed from: x */
    public InterfaceC24794t m124619x() {
        return (InterfaceC24794t) this.f115195s.get();
    }

    /* renamed from: A */
    public ZOM m124620A() {
        ZOMDocument zOMDocument = this.f115178b;
        if (zOMDocument != null) {
            return zOMDocument.mZOMRoot;
        }
        AbstractC25310f abstractC25310f = this.f115179c;
        if (abstractC25310f != null) {
            return abstractC25310f.m131007J();
        }
        return null;
    }

    /* renamed from: B */
    public boolean m124621B() {
        return this.f115178b != null;
    }

    /* renamed from: C */
    public void m124622C() {
        AbstractC25310f m124618s = m124618s(this.f115177a);
        if (m124618s != null) {
            this.f115179c = m124618s;
        }
    }

    /* renamed from: D */
    public boolean m124623D() {
        return this.f115187k == 0;
    }

    /* renamed from: E */
    public boolean m124624E() {
        return this.f115187k == 3;
    }

    /* renamed from: F */
    public boolean m124625F() {
        return this.f115187k == 2;
    }

    /* renamed from: G */
    public boolean m124626G() {
        return this.f115178b != null;
    }

    /* renamed from: H */
    public boolean m124627H(InterfaceC20578a0 interfaceC20578a0) {
        if (interfaceC20578a0 instanceof C23855s0) {
            if (interfaceC20578a0 == this) {
                return true;
            }
            return false;
        }
        if ((interfaceC20578a0 instanceof ZOMDocument) && interfaceC20578a0 == this.f115178b) {
            return true;
        }
        return false;
    }

    /* renamed from: I */
    public boolean m124628I() {
        return this.f115187k == 1;
    }

    /* renamed from: J */
    public boolean m124629J() {
        if (!m124625F() && !m124628I()) {
            return false;
        }
        return true;
    }

    /* renamed from: K */
    public boolean m124630K() {
        return this.f115187k == 4;
    }

    /* renamed from: S */
    public boolean m124631S() {
        ZOMDocument zOMDocument = this.f115178b;
        if (zOMDocument != null) {
            return zOMDocument.mZinstantMetadata.isTrackingTimeOnScreen();
        }
        return false;
    }

    /* renamed from: U */
    public void m124632U() {
        this.f115193q.run();
    }

    /* renamed from: V */
    public void m124633V() {
        this.f115194r.run();
    }

    /* renamed from: W */
    public void m124634W(Canvas canvas) {
        AbstractC25310f abstractC25310f = this.f115179c;
        if (abstractC25310f != null && abstractC25310f.m131003G() == AbstractC25310f.a.ZinstantNode) {
            this.f115179c.m131020o(canvas);
            ZOMDocument zOMDocument = this.f115178b;
            if (zOMDocument != null && this.f115181e) {
                this.f115181e = false;
                zOMDocument.onFirstViewDrawn();
            }
        }
    }

    /* renamed from: X */
    public boolean m124635X(MotionEvent motionEvent, int i11) {
        AbstractC25310f abstractC25310f = this.f115179c;
        if (abstractC25310f != null && abstractC25310f.m131003G() == AbstractC25310f.a.ZinstantNode) {
            return ((AbstractC23825g0) this.f115179c).mo124513p1(motionEvent, i11);
        }
        return false;
    }

    /* renamed from: Y */
    public void m124636Y(AbstractC23838k1 abstractC23838k1) {
        synchronized (this.f115180d) {
            this.f115180d.add(abstractC23838k1);
        }
        InterfaceC25316l interfaceC25316l = (InterfaceC25316l) this.f115183g.get();
        if (interfaceC25316l != null) {
            if (interfaceC25316l.getView() instanceof InterfaceC29061b) {
                ((InterfaceC29061b) interfaceC25316l.getView()).mo91520w(this, abstractC23838k1);
                return;
            }
            throw new IllegalArgumentException("ZinstantRoot must be held by ZINSComponent.");
        }
    }

    /* renamed from: Z */
    public void m124637Z(AbstractC23838k1 abstractC23838k1) {
        synchronized (this.f115180d) {
            this.f115180d.remove(abstractC23838k1);
        }
        InterfaceC25316l interfaceC25316l = (InterfaceC25316l) this.f115183g.get();
        if (interfaceC25316l != null) {
            if (interfaceC25316l.getView() instanceof InterfaceC29061b) {
                ((InterfaceC29061b) interfaceC25316l.getView()).mo91517q(abstractC23838k1);
                return;
            }
            throw new IllegalArgumentException("ZinstantRoot must be held by ZINSComponent.");
        }
    }

    @Override // nk0.InterfaceC23809b
    /* renamed from: a */
    public boolean mo124393a() {
        InterfaceC23809b interfaceC23809b = this.f115192p;
        if (interfaceC23809b != null) {
            return interfaceC23809b.mo124393a();
        }
        ZOMDocument zOMDocument = this.f115178b;
        if (zOMDocument != null && zOMDocument.isTrackingLayout()) {
            return true;
        }
        return false;
    }

    @Override // nk0.InterfaceC23809b
    /* renamed from: b */
    public ZOMGlobalConfig mo124394b() {
        InterfaceC23809b interfaceC23809b = this.f115192p;
        if (interfaceC23809b != null) {
            return interfaceC23809b.mo124394b();
        }
        ZOMDocument zOMDocument = this.f115178b;
        if (zOMDocument != null) {
            return zOMDocument.mGlobalConfig;
        }
        return null;
    }

    /* renamed from: b0 */
    public void m124638b0(String str, String str2) {
        ZOMDocument zOMDocument = this.f115178b;
        if (zOMDocument != null) {
            zOMDocument.performExternalAction(str, str2);
        }
    }

    @Override // nk0.InterfaceC23809b
    /* renamed from: c */
    public void mo124395c(Runnable runnable, Object obj, boolean z11) {
        InterfaceC23809b interfaceC23809b = this.f115192p;
        if (interfaceC23809b != null) {
            interfaceC23809b.mo124395c(runnable, obj, z11);
            return;
        }
        ZOMDocument zOMDocument = this.f115178b;
        if (zOMDocument != null) {
            zOMDocument.queueNativeTask(runnable, obj, z11);
        }
    }

    /* renamed from: c0 */
    public void m124639c0(Runnable runnable) {
        mo124395c(runnable, null, false);
    }

    @Override // ik0.InterfaceC20578a0
    public boolean checkIntegrity(int i11, int i12, String str, int i13, InterfaceC17139d interfaceC17139d, String str2) {
        ZOMDocument zOMDocument = this.f115178b;
        if (zOMDocument != null && zOMDocument.checkIntegrity(i11, i12, str, i13, interfaceC17139d, str2)) {
            return true;
        }
        return false;
    }

    @Override // ik0.InterfaceC20578a0
    public String checksum() {
        ZOMDocument zOMDocument = this.f115178b;
        if (zOMDocument != null) {
            return zOMDocument.checksum();
        }
        return "";
    }

    @Override // nk0.InterfaceC23809b
    /* renamed from: d */
    public ZOMDocument mo124396d() {
        InterfaceC23809b interfaceC23809b = this.f115192p;
        if (interfaceC23809b != null) {
            return interfaceC23809b.mo124396d();
        }
        return this.f115178b;
    }

    @Override // nk0.InterfaceC23809b
    /* renamed from: e */
    public String mo124397e() {
        InterfaceC23809b interfaceC23809b = this.f115192p;
        if (interfaceC23809b != null) {
            return interfaceC23809b.mo124397e();
        }
        ZOMDocument zOMDocument = this.f115178b;
        if (zOMDocument != null) {
            return zOMDocument.mZINSDataExtras;
        }
        return null;
    }

    /* renamed from: e0 */
    public void m124640e0(InterfaceC23809b interfaceC23809b) {
        this.f115192p = interfaceC23809b;
    }

    @Override // nk0.InterfaceC23809b
    /* renamed from: f */
    public C26730b mo124398f() {
        InterfaceC23809b interfaceC23809b;
        if (!m124626G() && (interfaceC23809b = this.f115192p) != null) {
            return interfaceC23809b.mo124398f();
        }
        ZOMDocument zOMDocument = this.f115178b;
        if (zOMDocument != null) {
            return zOMDocument.getPermissionChecker();
        }
        return null;
    }

    /* renamed from: f0 */
    public void m124641f0(InterfaceC24794t interfaceC24794t) {
        this.f115195s = new WeakReference(interfaceC24794t);
    }

    @Override // nk0.InterfaceC23809b
    /* renamed from: g */
    public ImpressionMeta mo124399g() {
        InterfaceC23809b interfaceC23809b = this.f115192p;
        if (interfaceC23809b != null) {
            return interfaceC23809b.mo124399g();
        }
        ZOMDocument zOMDocument = this.f115178b;
        if (zOMDocument != null) {
            return zOMDocument.mZinstantMetadata.getImpressionMeta();
        }
        return null;
    }

    /* renamed from: g0 */
    public void m124642g0(InterfaceC25316l interfaceC25316l) {
        this.f115183g = new WeakReference(interfaceC25316l);
        this.f115187k = 0;
    }

    @Override // nk0.InterfaceC23809b
    public String getDelegateID() {
        InterfaceC23809b interfaceC23809b = this.f115192p;
        if (interfaceC23809b != null) {
            return interfaceC23809b.getDelegateID();
        }
        ZOMDocument zOMDocument = this.f115178b;
        if (zOMDocument != null) {
            return zOMDocument.getDelegateID();
        }
        return null;
    }

    @Override // ik0.InterfaceC20578a0
    public int getHeight() {
        return this.f115177a.mHeight;
    }

    @Override // nk0.InterfaceC23809b
    public String getOriginalId() {
        InterfaceC23809b interfaceC23809b = this.f115192p;
        if (interfaceC23809b != null) {
            return interfaceC23809b.getOriginalId();
        }
        ZOMDocument zOMDocument = this.f115178b;
        if (zOMDocument != null) {
            return zOMDocument.getOriginalId();
        }
        return null;
    }

    @Override // ik0.InterfaceC20578a0
    public String getZinstantDataId() {
        InterfaceC23809b interfaceC23809b = this.f115192p;
        if (interfaceC23809b != null) {
            return interfaceC23809b.getZinstantDataId();
        }
        ZOMDocument zOMDocument = this.f115178b;
        if (zOMDocument != null) {
            return zOMDocument.getZinstantDataId();
        }
        return null;
    }

    @Override // nk0.InterfaceC23809b
    /* renamed from: h */
    public InterfaceC24794t mo124400h() {
        return this.f115196t;
    }

    /* renamed from: h0 */
    public int m124643h0() {
        return this.f115177a.mType;
    }

    /* renamed from: i0 */
    public void m124644i0() {
        AbstractC25310f abstractC25310f = this.f115179c;
        if (abstractC25310f != null) {
            abstractC25310f.mo124501S0();
        }
    }

    @Override // ik0.InterfaceC20578a0
    public String identifyKey() {
        ZOMDocument zOMDocument = this.f115178b;
        if (zOMDocument != null) {
            return zOMDocument.identifyKey();
        }
        return null;
    }

    @Override // nk0.InterfaceC23806a
    public void onPause() {
        if (m124625F()) {
            if (m124626G()) {
                this.f115186j.post(new Runnable() { // from class: nk0.j0
                    public /* synthetic */ RunnableC23834j0() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C23855s0.this.m124633V();
                    }
                });
            }
            this.f115187k = 3;
            this.f115189m.run();
        }
    }

    @Override // nk0.InterfaceC23806a
    public void onResume() {
        if (m124623D() || m124630K()) {
            onStart();
        }
        if (m124628I() || m124624E()) {
            this.f115187k = 2;
            this.f115190n.run();
            if (m124626G()) {
                this.f115186j.post(new Runnable() { // from class: nk0.p0
                    public /* synthetic */ RunnableC23849p0() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C23855s0.this.m124632U();
                    }
                });
            }
        }
    }

    @Override // nk0.InterfaceC23806a
    public void onStart() {
        if (m124623D() || m124630K()) {
            this.f115187k = 1;
            this.f115188l.run();
        }
        onResume();
    }

    @Override // nk0.InterfaceC23806a
    public void onStop() {
        if (m124625F()) {
            onPause();
        }
        if (m124624E() || m124628I()) {
            this.f115187k = 4;
            this.f115191o.run();
        }
    }

    /* renamed from: r */
    public void m124645r() {
        AbstractC25310f abstractC25310f = this.f115179c;
        if (abstractC25310f != null && abstractC25310f.m131003G() == AbstractC25310f.a.ZinstantNode) {
            this.f115179c.m131019n();
        }
    }

    /* renamed from: t */
    public boolean m124646t(ZOMDocument zOMDocument) {
        return this.f115178b == zOMDocument;
    }

    /* renamed from: u */
    public ZOM m124647u(InterfaceC17194f interfaceC17194f, boolean z11) {
        return AbstractC17203o.Companion.m91833a(this.f115177a, interfaceC17194f, z11);
    }

    /* renamed from: v */
    public ZOM m124648v(String str) {
        if (!this.f115182f.containsKey(str)) {
            this.f115182f.put(str, m124647u(new InterfaceC17194f() { // from class: nk0.q0

                /* renamed from: a */
                public final /* synthetic */ String f115173a;

                public /* synthetic */ C23851q0(String str2) {
                    r1 = str2;
                }

                @Override // com.zing.zalo.zinstant.utils.InterfaceC17194f
                /* renamed from: a */
                public final boolean mo91804a(Object obj) {
                    boolean m124599L;
                    m124599L = C23855s0.m124599L(r1, (ZOM) obj);
                    return m124599L;
                }
            }, false));
        }
        return (ZOM) this.f115182f.get(str2);
    }

    /* renamed from: w */
    public Set m124649w() {
        LinkedHashSet linkedHashSet;
        synchronized (this.f115180d) {
            linkedHashSet = new LinkedHashSet(this.f115180d);
        }
        return linkedHashSet;
    }

    /* renamed from: y */
    public synchronized C24779e m124650y() {
        C24779e c24779e = this.f115184h;
        if (c24779e != null && c24779e.m128798d() > 0 && this.f115184h.m128797c() > 0) {
            return this.f115184h;
        }
        C24779e c24779e2 = new C24779e(0, 0, m124651z(), getHeight());
        this.f115184h = c24779e2;
        return c24779e2;
    }

    /* renamed from: z */
    public int m124651z() {
        return this.f115177a.mWidth;
    }

    public C23855s0(ZOM zom) {
        this.f115177a = zom;
        m124622C();
    }
}

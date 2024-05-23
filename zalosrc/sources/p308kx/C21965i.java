package p308kx;

import android.os.Debug;
import android.os.PowerManager;
import com.zing.zalocore.CoreUtility;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Vector;
import mx.AbstractC23466c;
import mx.AbstractC23474k;
import mx.C23476m;
import p190gx.AbstractC19676f;

/* renamed from: kx.i */
/* loaded from: classes4.dex */
public class C21965i extends AbstractC19676f {

    /* renamed from: n */
    private static Vector f108116n = new Vector();

    /* renamed from: f */
    private C21967k f108117f;

    /* renamed from: g */
    private PowerManager.WakeLock f108118g;

    /* renamed from: h */
    private long f108119h;

    /* renamed from: i */
    private Exception f108120i;

    /* renamed from: j */
    private boolean f108121j = false;

    /* renamed from: k */
    private boolean f108122k = true;

    /* renamed from: l */
    private int f108123l = 0;

    /* renamed from: m */
    private WeakReference f108124m = new WeakReference(this);

    public C21965i(int i11, String str) {
        this.f108118g = ((PowerManager) CoreUtility.getAppContext().getSystemService("power")).newWakeLock(i11, str);
        if (C23476m.m123248f() && !Debug.isDebuggerConnected()) {
            this.f108120i = new Exception();
        }
        AbstractC19676f.m103251n(new Runnable() { // from class: kx.b

            /* renamed from: q */
            public final /* synthetic */ int f108109q;

            /* renamed from: r */
            public final /* synthetic */ String f108110r;

            public /* synthetic */ RunnableC21958b(int i112, String str2) {
                r2 = i112;
                r3 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C21965i.this.m114676E(r2, r3);
            }
        });
    }

    /* renamed from: A */
    public static Vector m114673A() {
        return f108116n;
    }

    /* renamed from: C */
    public /* synthetic */ void m114674C() {
        this.f108119h = -1L;
        if (CoreUtility.f89235k.get()) {
            this.f108121j = true;
            this.f108117f.m114714a(this.f108118g, -1L);
        }
        if (!f108116n.contains(this.f108124m)) {
            f108116n.add(this.f108124m);
        }
        this.f108123l++;
    }

    /* renamed from: D */
    public /* synthetic */ void m114675D() {
        C21966j m114715b = this.f108117f.m114715b(this.f108118g);
        if (m114715b != null && m114715b.m114707l() > 3600000) {
            m114686R(m114715b);
        }
    }

    /* renamed from: E */
    public /* synthetic */ void m114676E(int i11, String str) {
        this.f108117f = new C21967k();
        m114695y(this.f108118g, i11, str, System.currentTimeMillis());
    }

    /* renamed from: F */
    public static /* synthetic */ void m114677F() {
        Iterator it = f108116n.iterator();
        while (it.hasNext()) {
            C21965i c21965i = (C21965i) ((WeakReference) it.next()).get();
            if (c21965i != null) {
                c21965i.m114685P();
            }
        }
    }

    /* renamed from: G */
    public static /* synthetic */ void m114678G() {
        Iterator it = f108116n.iterator();
        while (it.hasNext()) {
            C21965i c21965i = (C21965i) ((WeakReference) it.next()).get();
            if (c21965i != null) {
                c21965i.m114684M();
            }
        }
    }

    /* renamed from: H */
    public /* synthetic */ void m114679H() {
        if (this.f108122k) {
            this.f108123l--;
        } else {
            this.f108123l = 0;
        }
        C21966j m114717d = this.f108117f.m114717d(this.f108118g);
        if (!this.f108121j || this.f108123l != 0 || m114717d == null) {
            return;
        }
        if (m114717d.m114707l() > 3600000) {
            m114686R(m114717d);
        }
        f108116n.remove(this.f108124m);
        this.f108121j = false;
    }

    /* renamed from: I */
    public /* synthetic */ void m114680I() {
        if (this.f108122k) {
            this.f108123l--;
        } else {
            this.f108123l = 0;
        }
        C21966j m114717d = this.f108117f.m114717d(this.f108118g);
        if (!this.f108121j || this.f108123l != 0 || m114717d == null) {
            return;
        }
        if (m114717d.m114707l() > 3600000) {
            m114686R(m114717d);
        }
        f108116n.remove(this.f108124m);
        this.f108121j = false;
    }

    /* renamed from: J */
    public /* synthetic */ void m114681J(boolean z11) {
        this.f108122k = z11;
        this.f108117f.m114718e(this.f108118g, z11);
    }

    /* renamed from: K */
    public static void m114682K() {
        AbstractC19676f.m103251n(new Runnable() { // from class: kx.f
            @Override // java.lang.Runnable
            public final void run() {
                C21965i.m114677F();
            }
        });
    }

    /* renamed from: L */
    public static void m114683L() {
        AbstractC19676f.m103251n(new Runnable() { // from class: kx.g
            @Override // java.lang.Runnable
            public final void run() {
                C21965i.m114678G();
            }
        });
    }

    /* renamed from: M */
    private void m114684M() {
        for (int i11 = 0; i11 < this.f108123l; i11++) {
            this.f108117f.m114717d(this.f108118g);
        }
    }

    /* renamed from: P */
    private void m114685P() {
        if (this.f108118g.isHeld()) {
            this.f108121j = true;
            for (int i11 = 0; i11 < this.f108123l; i11++) {
                this.f108117f.m114714a(this.f108118g, this.f108119h);
            }
        }
    }

    /* renamed from: R */
    private void m114686R(C21966j c21966j) {
        String m123212o = AbstractC23466c.m123212o("battery/wakelock/");
        StringBuilder sb2 = new StringBuilder();
        String m123238b = AbstractC23474k.m123238b(this.f108120i, true);
        sb2.append(c21966j.m157670a());
        sb2.append("\t");
        sb2.append(7);
        sb2.append("\t");
        sb2.append(c21966j.m157671b());
        sb2.append("\t");
        sb2.append(c21966j.m114709n());
        sb2.append("\t");
        sb2.append(c21966j.m114707l());
        sb2.append("\t");
        sb2.append(m123238b);
        sb2.append("\n");
        AbstractC23466c.m123219v(sb2.toString(), m123212o);
    }

    /* renamed from: y */
    private void m114695y(PowerManager.WakeLock wakeLock, int i11, String str, long j11) {
        this.f108117f.m114716c(wakeLock, i11, str, j11);
    }

    /* renamed from: B */
    public boolean m114696B() {
        return this.f108118g.isHeld();
    }

    /* renamed from: N */
    public void m114697N() {
        this.f108118g.release();
        AbstractC19676f.m103251n(new Runnable() { // from class: kx.a
            public /* synthetic */ RunnableC21957a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C21965i.this.m114679H();
            }
        });
    }

    /* renamed from: O */
    public void m114698O(int i11) {
        this.f108118g.release(i11);
        AbstractC19676f.m103251n(new Runnable() { // from class: kx.e
            public /* synthetic */ RunnableC21961e() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C21965i.this.m114680I();
            }
        });
    }

    /* renamed from: Q */
    public void m114699Q(boolean z11) {
        this.f108118g.setReferenceCounted(z11);
        AbstractC19676f.m103251n(new Runnable() { // from class: kx.c

            /* renamed from: q */
            public final /* synthetic */ boolean f108112q;

            public /* synthetic */ RunnableC21959c(boolean z112) {
                r2 = z112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C21965i.this.m114681J(r2);
            }
        });
    }

    protected void finalize() {
        if (m114696B()) {
            m114699Q(false);
            m114697N();
        }
        super.finalize();
    }

    public String toString() {
        return this.f108118g.toString();
    }

    /* renamed from: x */
    public void m114700x() {
        this.f108118g.acquire();
        AbstractC19676f.m103251n(new Runnable() { // from class: kx.d
            public /* synthetic */ RunnableC21960d() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C21965i.this.m114674C();
            }
        });
    }

    /* renamed from: z */
    public void m114701z() {
        AbstractC19676f.m103251n(new Runnable() { // from class: kx.h
            public /* synthetic */ RunnableC21964h() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C21965i.this.m114675D();
            }
        });
    }
}

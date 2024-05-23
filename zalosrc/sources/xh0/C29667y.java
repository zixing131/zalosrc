package xh0;

import android.hardware.Camera;
import android.os.Handler;
import android.util.Pair;
import com.zing.zalo.C8937j0;
import ho0.AbstractC20110a;
import java.io.IOException;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import p664y.AbstractC30228a;
import rw.C25982c;
import rw.C25983d;
import rw.C25985f;
import xh0.C29667y;
import yh0.AbstractC30984a;
import yh0.C30985b;
import zh0.C32211b;

/* renamed from: xh0.y */
/* loaded from: classes7.dex */
public class C29667y {

    /* renamed from: m */
    protected static boolean f136955m = false;

    /* renamed from: a */
    private final C25982c f136956a;

    /* renamed from: c */
    private int f136958c;

    /* renamed from: f */
    private C30985b f136961f;

    /* renamed from: l */
    private final C25982c.a f136967l;

    /* renamed from: b */
    private final AtomicBoolean f136957b = new AtomicBoolean(false);

    /* renamed from: d */
    private InterfaceC29653k f136959d = null;

    /* renamed from: e */
    private final WeakHashMap f136960e = new WeakHashMap();

    /* renamed from: g */
    private final AtomicBoolean f136962g = new AtomicBoolean(false);

    /* renamed from: h */
    private int f136963h = 0;

    /* renamed from: i */
    private boolean f136964i = false;

    /* renamed from: j */
    private int f136965j = -1;

    /* renamed from: k */
    private int f136966k = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xh0.y$a */
    /* loaded from: classes7.dex */
    public class a implements C32211b.a {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m147482d(AtomicBoolean atomicBoolean) {
            try {
                synchronized (atomicBoolean) {
                    C29667y.this.m147441I();
                    atomicBoolean.set(true);
                    atomicBoolean.notifyAll();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // zh0.C32211b.a
        /* renamed from: a */
        public void mo147483a(int i11) {
            AbstractC20110a.m104535d("3rd camera release: %s", Integer.valueOf(i11));
        }

        @Override // zh0.C32211b.a
        /* renamed from: b */
        public void mo147484b(int i11) {
            AbstractC20110a.m104535d("3rd camera open: %s", Integer.valueOf(i11));
            try {
                if (C29667y.this.f136956a.m133823c().m133842a().m133854c() && C29667y.this.f136959d == null) {
                    return;
                }
                C29667y.this.f136956a.removeMessages(2);
                C29667y.this.f136956a.removeMessages(3);
                C29667y.this.f136956a.removeMessages(4);
                C29667y.this.f136956a.removeMessages(5);
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                C29667y.this.f136956a.m133827k(new Runnable() { // from class: xh0.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        C29667y.a.this.m147482d(atomicBoolean);
                    }
                });
                synchronized (atomicBoolean) {
                    try {
                        if (!atomicBoolean.get()) {
                            atomicBoolean.wait(500L);
                        }
                    } finally {
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xh0.y$b */
    /* loaded from: classes7.dex */
    public static class b {

        /* renamed from: a */
        private static C29667y f136969a;
    }

    private C29667y() {
        C25982c.a aVar = new C25982c.a() { // from class: xh0.s
            @Override // rw.C25982c.a
            /* renamed from: a */
            public final boolean mo98562a(C25985f c25985f) {
                boolean m147463v;
                m147463v = C29667y.this.m147463v(c25985f);
                return m147463v;
            }
        };
        this.f136967l = aVar;
        AbstractC20110a.m104535d("new ZCameraManager", new Object[0]);
        C25983d c25983d = new C25983d("CameraManagerThread");
        c25983d.start();
        C25982c c25982c = new C25982c(c25983d.m133836a(), aVar);
        this.f136956a = c25982c;
        c25982c.sendEmptyMessage(6);
        C32211b.m155324b().m155330h(new a());
    }

    /* renamed from: A */
    private void m147437A(final InterfaceC29641d0 interfaceC29641d0, Handler handler) {
        try {
            InterfaceC29653k interfaceC29653k = this.f136959d;
            if (interfaceC29653k != null) {
                interfaceC29653k.mo147419c();
            }
        } catch (IOException e11) {
            e11.printStackTrace();
        }
        Objects.requireNonNull(interfaceC29641d0);
        handler.post(new Runnable(interfaceC29641d0) { // from class: xh0.t
            @Override // java.lang.Runnable
            public final void run() {
                C29667y.m147462u(null);
            }
        });
    }

    /* renamed from: C */
    private void m147438C(C29668z c29668z) {
        boolean z11;
        InterfaceC29653k interfaceC29653k = this.f136959d;
        if (interfaceC29653k != null) {
            if (interfaceC29653k.mo147418b() != c29668z.f136970a) {
                this.f136956a.removeMessages(7);
                this.f136959d.mo147424h();
                this.f136959d.mo147417a();
                this.f136959d = null;
            } else {
                Object obj = c29668z.f136971b;
                if (obj != null) {
                    this.f136960e.put(obj, null);
                }
            }
        }
        this.f136956a.removeMessages(10);
        this.f136956a.removeMessages(7);
        if (this.f136959d == null) {
            int i11 = c29668z.f136970a;
            if (this.f136961f != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f136959d = new C29659q(i11, z11, C29643e0.m147395d());
            Object obj2 = c29668z.f136971b;
            if (obj2 != null) {
                this.f136960e.put(obj2, null);
            }
        }
        this.f136959d.mo147421e(c29668z);
        InterfaceC29636b interfaceC29636b = c29668z.f136972c;
        if (interfaceC29636b != null) {
            interfaceC29636b.mo38592qC(this.f136959d.mo147422f());
        }
        this.f136956a.removeMessages(1);
        this.f136956a.sendEmptyMessageDelayed(1, 10000L);
    }

    /* renamed from: F */
    private void m147439F() {
        try {
            if (this.f136959d == null) {
                return;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            this.f136956a.m133826j(new Runnable() { // from class: xh0.r
                @Override // java.lang.Runnable
                public final void run() {
                    C29667y.this.m147464w(atomicBoolean);
                }
            });
            synchronized (atomicBoolean) {
                try {
                    if (atomicBoolean.get()) {
                        return;
                    }
                    atomicBoolean.wait(1000L);
                } finally {
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: H */
    private void m147440H(C29639c0 c29639c0) {
        if (this.f136959d != null) {
            C8937j0.m47656d().m40937b();
            f136955m = true;
            if ((this.f136959d.mo147426j(this.f136961f) || this.f136959d.mo147425i()) && C29643e0.m147392a() > 0) {
                this.f136956a.m133835s(this.f136956a.m133825i(7, c29639c0), C29643e0.m147392a());
            } else {
                m147441I();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public void m147441I() {
        InterfaceC29653k interfaceC29653k = this.f136959d;
        if (interfaceC29653k != null) {
            interfaceC29653k.mo147424h();
            this.f136959d.mo147417a();
            this.f136959d = null;
            m147456j();
        }
    }

    /* renamed from: J */
    public static void m147442J() {
        if (b.f136969a != null) {
            m147458p().m147439F();
        }
    }

    /* renamed from: M */
    private void m147443M(C29635a0 c29635a0) {
        boolean z11;
        InterfaceC29653k interfaceC29653k = this.f136959d;
        if (interfaceC29653k != null) {
            int mo147418b = interfaceC29653k.mo147418b();
            C29668z c29668z = c29635a0.f136875a;
            if (mo147418b == c29668z.f136970a) {
                m147438C(c29668z);
                m147444N(c29635a0.f136876b);
                return;
            } else {
                this.f136956a.removeMessages(7);
                this.f136959d.mo147424h();
                this.f136959d.mo147417a();
                this.f136959d = null;
            }
        }
        this.f136956a.removeMessages(10);
        this.f136956a.removeMessages(7);
        int i11 = c29635a0.f136875a.f136970a;
        if (this.f136961f != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f136959d = new C29659q(i11, z11, C29643e0.m147395d());
        Object obj = c29635a0.f136875a.f136971b;
        if (obj != null) {
            this.f136960e.put(obj, null);
        }
        this.f136959d.mo147421e(c29635a0.f136875a);
        C29637b0 c29637b0 = c29635a0.f136876b;
        if (c29637b0 != null) {
            m147444N(c29637b0);
        }
        InterfaceC29636b interfaceC29636b = c29635a0.f136875a.f136972c;
        if (interfaceC29636b != null) {
            interfaceC29636b.mo38592qC(this.f136959d.mo147422f());
        }
        this.f136956a.removeMessages(1);
        this.f136956a.sendEmptyMessageDelayed(1, 10000L);
    }

    /* renamed from: N */
    private void m147444N(C29637b0 c29637b0) {
        InterfaceC29653k interfaceC29653k = this.f136959d;
        if (interfaceC29653k == null) {
            AbstractC20110a.m104538g("StartPreviewInternal. Camera is in wrong state", new Object[0]);
            return;
        }
        try {
            interfaceC29653k.mo147427k(c29637b0, this.f136961f);
        } catch (IOException e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: P */
    private void m147445P() {
        InterfaceC29653k interfaceC29653k = this.f136959d;
        if (interfaceC29653k == null) {
            AbstractC20110a.m104538g("StopPreviewInternal. Camera is in wrong state", new Object[0]);
        } else {
            interfaceC29653k.mo147424h();
        }
    }

    /* renamed from: R */
    private void m147446R(final InterfaceC29641d0 interfaceC29641d0, Handler handler) {
        try {
            InterfaceC29653k interfaceC29653k = this.f136959d;
            if (interfaceC29653k != null) {
                interfaceC29653k.mo147420d();
            }
        } catch (IOException e11) {
            e11.printStackTrace();
        }
        Objects.requireNonNull(interfaceC29641d0);
        handler.post(new Runnable(interfaceC29641d0) { // from class: xh0.w
            @Override // java.lang.Runnable
            public final void run() {
                C29667y.m147467z(null);
            }
        });
    }

    /* renamed from: j */
    private void m147456j() {
        C30985b c30985b;
        try {
            synchronized (this.f136962g) {
                try {
                    if (!this.f136962g.get()) {
                        return;
                    }
                    if (this.f136963h == 0 && this.f136964i && (c30985b = this.f136961f) != null) {
                        InterfaceC29653k interfaceC29653k = this.f136959d;
                        if (interfaceC29653k != null && !interfaceC29653k.mo147426j(c30985b)) {
                            this.f136961f.m150622l();
                            this.f136961f = null;
                            this.f136962g.set(false);
                            m147459r();
                        }
                    }
                } finally {
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: k */
    private void m147457k() {
        synchronized (this.f136957b) {
            try {
                if (!this.f136957b.get()) {
                    m147460s();
                    this.f136957b.set(true);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: p */
    public static C29667y m147458p() {
        if (b.f136969a != null) {
            return b.f136969a;
        }
        synchronized (b.class) {
            try {
                if (b.f136969a == null) {
                    C29667y unused = b.f136969a = new C29667y();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return b.f136969a;
    }

    /* renamed from: r */
    private void m147459r() {
        AtomicBoolean atomicBoolean;
        AbstractC20110a.m104535d("initGLThreadInternal", new Object[0]);
        if (!C29643e0.m147394c()) {
            return;
        }
        synchronized (this.f136962g) {
            try {
                try {
                    C30985b c30985b = new C30985b((C30985b.a) null, AbstractC30984a.f142950e);
                    this.f136961f = c30985b;
                    c30985b.m150612b();
                    this.f136961f.m150621k();
                    this.f136963h = 0;
                    this.f136964i = false;
                    this.f136962g.set(true);
                    atomicBoolean = this.f136962g;
                } catch (Throwable th2) {
                    this.f136963h = 0;
                    this.f136964i = false;
                    this.f136962g.set(true);
                    this.f136962g.notifyAll();
                    throw th2;
                }
            } catch (RuntimeException e11) {
                AbstractC20110a.m104539h(e11);
                this.f136961f.m150622l();
                this.f136961f = null;
                this.f136963h = 0;
                this.f136964i = false;
                this.f136962g.set(true);
                atomicBoolean = this.f136962g;
            }
            atomicBoolean.notifyAll();
        }
    }

    /* renamed from: s */
    private void m147460s() {
        AbstractC20110a.m104535d("initManager", new Object[0]);
        this.f136958c = Camera.getNumberOfCameras();
    }

    /* renamed from: t */
    private void m147461t() {
        if (this.f136959d == null) {
            this.f136960e.clear();
        } else if (this.f136960e.isEmpty()) {
            this.f136956a.sendEmptyMessage(5);
        } else {
            this.f136956a.removeMessages(1);
            this.f136956a.sendEmptyMessageDelayed(1, 10000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public static /* synthetic */ void m147462u(InterfaceC29641d0 interfaceC29641d0) {
        interfaceC29641d0.m147391a(new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:            return false;     */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ boolean m147463v(C25985f c25985f) {
        AbstractC20110a.m104535d("handleMessage: %s", Integer.valueOf(c25985f.f123961a));
        switch (c25985f.f123961a) {
            case 1:
                m147461t();
                break;
            case 2:
                Object obj = c25985f.f123964d;
                if (obj instanceof C29668z) {
                    m147438C((C29668z) obj);
                    break;
                }
                break;
            case 3:
                m147444N((C29637b0) c25985f.f123964d);
                break;
            case 4:
                m147445P();
                break;
            case 5:
                m147440H((C29639c0) c25985f.f123964d);
                break;
            case 6:
                m147459r();
                m147457k();
                break;
            case 7:
                m147441I();
                break;
            case 8:
                Pair pair = (Pair) c25985f.f123964d;
                AbstractC30228a.m149044a(pair.first);
                m147437A(null, (Handler) pair.second);
                break;
            case 9:
                Pair pair2 = (Pair) c25985f.f123964d;
                AbstractC30228a.m149044a(pair2.first);
                m147446R(null, (Handler) pair2.second);
                break;
            case 10:
                m147456j();
                break;
            case 11:
                m147443M((C29635a0) c25985f.f123964d);
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ void m147464w(AtomicBoolean atomicBoolean) {
        try {
            m147441I();
            synchronized (atomicBoolean) {
                atomicBoolean.set(true);
                atomicBoolean.notify();
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public static /* synthetic */ void m147465x(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public static /* synthetic */ void m147466y(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public static /* synthetic */ void m147467z(InterfaceC29641d0 interfaceC29641d0) {
        interfaceC29641d0.m147391a(new Object[0]);
    }

    /* renamed from: B */
    public C30985b m147468B() {
        try {
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        synchronized (this.f136962g) {
            try {
                if (!this.f136962g.get()) {
                    return null;
                }
                if (this.f136961f == null) {
                    return null;
                }
                C30985b c30985b = new C30985b(this.f136961f, AbstractC30984a.f142948c);
                this.f136963h++;
                this.f136964i = true;
                return c30985b;
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public void m147469D(C30985b c30985b, Runnable runnable) {
        C30985b c30985b2 = this.f136961f;
        if (c30985b2 != null && c30985b2 == c30985b) {
            this.f136956a.m133826j(runnable);
        } else {
            AbstractC20110a.m104538g("postInGLThread: wrong call", new Object[0]);
        }
    }

    /* renamed from: E */
    public void m147470E(Runnable runnable) {
        C25982c c25982c = this.f136956a;
        if (c25982c != null) {
            c25982c.m133826j(runnable);
        }
    }

    /* renamed from: G */
    public void m147471G(C29639c0 c29639c0) {
        this.f136956a.m133832p(this.f136956a.m133825i(5, c29639c0));
    }

    /* renamed from: K */
    public void m147472K(final Runnable runnable) {
        this.f136956a.m133826j(new Runnable() { // from class: xh0.u
            @Override // java.lang.Runnable
            public final void run() {
                C29667y.m147465x(runnable);
            }
        });
    }

    /* renamed from: L */
    public void m147473L(final Runnable runnable, int i11) {
        this.f136956a.m133829m(new Runnable() { // from class: xh0.v
            @Override // java.lang.Runnable
            public final void run() {
                C29667y.m147466y(runnable);
            }
        }, i11);
    }

    /* renamed from: O */
    public void m147474O() {
        this.f136956a.m133832p(this.f136956a.m133824h(4));
    }

    /* renamed from: Q */
    public int m147475Q() {
        InterfaceC29653k interfaceC29653k = this.f136959d;
        if (interfaceC29653k == null) {
            AbstractC20110a.m104538g("SwitchCameraId. Camera is in wrong state", new Object[0]);
            return -1;
        }
        if (interfaceC29653k.mo147423g()) {
            return m147478n();
        }
        return m147479o();
    }

    /* renamed from: l */
    public void m147476l(C30985b c30985b) {
        if (c30985b != null) {
            try {
                if (c30985b.m150616f() == this.f136961f) {
                    c30985b.m150622l();
                    synchronized (this.f136962g) {
                        this.f136963h--;
                    }
                    this.f136956a.sendEmptyMessage(10);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: m */
    public void m147477m(C29635a0 c29635a0) {
        this.f136956a.m133832p(this.f136956a.m133825i(11, c29635a0));
    }

    /* renamed from: n */
    public int m147478n() {
        int i11 = this.f136966k;
        if (i11 != -1) {
            return i11;
        }
        try {
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            for (int i12 = 0; i12 < m147480q(); i12++) {
                Camera.getCameraInfo(i12, cameraInfo);
                if (cameraInfo.facing == 0) {
                    this.f136966k = i12;
                    return i12;
                }
            }
        } catch (RuntimeException e11) {
            e11.printStackTrace();
        }
        return 0;
    }

    /* renamed from: o */
    public int m147479o() {
        int i11 = this.f136965j;
        if (i11 != -1) {
            return i11;
        }
        try {
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            for (int i12 = 0; i12 < m147480q(); i12++) {
                Camera.getCameraInfo(i12, cameraInfo);
                if (cameraInfo.facing == 1) {
                    this.f136965j = i12;
                    return i12;
                }
            }
        } catch (RuntimeException e11) {
            e11.printStackTrace();
        }
        return 0;
    }

    /* renamed from: q */
    public int m147480q() {
        m147457k();
        return this.f136958c;
    }
}

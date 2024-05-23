package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.C4070a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC4072b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C4086d;
import com.google.android.gms.common.internal.AbstractC4181g;
import com.google.android.gms.common.internal.AbstractC4214r;
import com.google.android.gms.common.internal.C4182g0;
import com.google.android.gms.common.internal.C4208p;
import com.google.android.gms.common.internal.InterfaceC4217s;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import com.zing.zalo.zinstant.zom.node.ZOM;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p229i5.AbstractC20289j;
import p342m6.AbstractC22888j;
import p342m6.C22890k;
import p504s5.HandlerC26145m;
import p664y.AbstractC30228a;
import p665y0.C30240b;
import p704z4.C31218b;
import p704z4.C31256y;
import p704z4.C31257z;
import p704z4.InterfaceC31234j;

/* renamed from: com.google.android.gms.common.api.internal.c */
/* loaded from: classes2.dex */
public class C4083c implements Handler.Callback {

    /* renamed from: G */
    public static final Status f16263G = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* renamed from: H */
    private static final Status f16264H = new Status(4, "The user must be signed in to make this API call.");

    /* renamed from: I */
    private static final Object f16265I = new Object();

    /* renamed from: J */
    private static C4083c f16266J;

    /* renamed from: E */
    private final Handler f16271E;

    /* renamed from: F */
    private volatile boolean f16272F;

    /* renamed from: t */
    private TelemetryData f16277t;

    /* renamed from: u */
    private InterfaceC4217s f16278u;

    /* renamed from: v */
    private final Context f16279v;

    /* renamed from: w */
    private final C4070a f16280w;

    /* renamed from: x */
    private final C4182g0 f16281x;

    /* renamed from: p */
    private long f16273p = 5000;

    /* renamed from: q */
    private long f16274q = 120000;

    /* renamed from: r */
    private long f16275r = 10000;

    /* renamed from: s */
    private boolean f16276s = false;

    /* renamed from: y */
    private final AtomicInteger f16282y = new AtomicInteger(1);

    /* renamed from: z */
    private final AtomicInteger f16283z = new AtomicInteger(0);

    /* renamed from: A */
    private final Map f16267A = new ConcurrentHashMap(5, 0.75f, 1);

    /* renamed from: B */
    private C4116n f16268B = null;

    /* renamed from: C */
    private final Set f16269C = new C30240b();

    /* renamed from: D */
    private final Set f16270D = new C30240b();

    private C4083c(Context context, Looper looper, C4070a c4070a) {
        this.f16272F = true;
        this.f16279v = context;
        HandlerC26145m handlerC26145m = new HandlerC26145m(looper, this);
        this.f16271E = handlerC26145m;
        this.f16280w = c4070a;
        this.f16281x = new C4182g0(c4070a);
        if (AbstractC20289j.m105927a(context)) {
            this.f16272F = false;
        }
        handlerC26145m.sendMessage(handlerC26145m.obtainMessage(6));
    }

    /* renamed from: a */
    public static void m19354a() {
        synchronized (f16265I) {
            try {
                C4083c c4083c = f16266J;
                if (c4083c != null) {
                    c4083c.f16283z.incrementAndGet();
                    Handler handler = c4083c.f16271E;
                    handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: i */
    public static Status m19356i(C31218b c31218b, ConnectionResult connectionResult) {
        return new Status(connectionResult, "API: " + c31218b.m152101b() + " is not available on this device. Connection failed with: " + String.valueOf(connectionResult));
    }

    /* renamed from: j */
    private final C4123p0 m19357j(AbstractC4072b abstractC4072b) {
        C31218b m19245n = abstractC4072b.m19245n();
        C4123p0 c4123p0 = (C4123p0) this.f16267A.get(m19245n);
        if (c4123p0 == null) {
            c4123p0 = new C4123p0(this, abstractC4072b);
            this.f16267A.put(m19245n, c4123p0);
        }
        if (c4123p0.m19537J()) {
            this.f16270D.add(m19245n);
        }
        c4123p0.m19529A();
        return c4123p0;
    }

    /* renamed from: k */
    private final InterfaceC4217s m19358k() {
        if (this.f16278u == null) {
            this.f16278u = AbstractC4214r.m19744a(this.f16279v);
        }
        return this.f16278u;
    }

    /* renamed from: l */
    private final void m19359l() {
        TelemetryData telemetryData = this.f16277t;
        if (telemetryData != null) {
            if (telemetryData.m19625t() > 0 || m19382g()) {
                m19358k().mo16707a(telemetryData);
            }
            this.f16277t = null;
        }
    }

    /* renamed from: m */
    private final void m19360m(C22890k c22890k, int i11, AbstractC4072b abstractC4072b) {
        C4137u0 m19556b;
        if (i11 != 0 && (m19556b = C4137u0.m19556b(this, i11, abstractC4072b.m19245n())) != null) {
            AbstractC22888j m117594a = c22890k.m117594a();
            Handler handler = this.f16271E;
            handler.getClass();
            m117594a.mo117573b(new Executor() { // from class: z4.r

                /* renamed from: p */
                public final /* synthetic */ Handler f144269p;

                public /* synthetic */ ExecutorC31249r(Handler handler2) {
                    r1 = handler2;
                }

                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    r1.post(runnable);
                }
            }, m19556b);
        }
    }

    /* renamed from: y */
    public static C4083c m19370y(Context context) {
        C4083c c4083c;
        synchronized (f16265I) {
            try {
                if (f16266J == null) {
                    f16266J = new C4083c(context.getApplicationContext(), AbstractC4181g.m19679d().getLooper(), C4070a.m19196p());
                }
                c4083c = f16266J;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c4083c;
    }

    /* renamed from: A */
    public final AbstractC22888j m19372A(AbstractC4072b abstractC4072b, AbstractC4092f abstractC4092f, AbstractC4101i abstractC4101i, Runnable runnable) {
        C22890k c22890k = new C22890k();
        m19360m(c22890k, abstractC4092f.m19406e(), abstractC4072b);
        C4088d1 c4088d1 = new C4088d1(new C31257z(abstractC4092f, abstractC4101i, runnable), c22890k);
        Handler handler = this.f16271E;
        handler.sendMessage(handler.obtainMessage(8, new C31256y(c4088d1, this.f16283z.get(), abstractC4072b)));
        return c22890k.m117594a();
    }

    /* renamed from: B */
    public final AbstractC22888j m19373B(AbstractC4072b abstractC4072b, C4086d.a aVar, int i11) {
        C22890k c22890k = new C22890k();
        m19360m(c22890k, i11, abstractC4072b);
        C4094f1 c4094f1 = new C4094f1(aVar, c22890k);
        Handler handler = this.f16271E;
        handler.sendMessage(handler.obtainMessage(13, new C31256y(c4094f1, this.f16283z.get(), abstractC4072b)));
        return c22890k.m117594a();
    }

    /* renamed from: G */
    public final void m19374G(AbstractC4072b abstractC4072b, int i11, AbstractC4080b abstractC4080b) {
        C4085c1 c4085c1 = new C4085c1(i11, abstractC4080b);
        Handler handler = this.f16271E;
        handler.sendMessage(handler.obtainMessage(4, new C31256y(c4085c1, this.f16283z.get(), abstractC4072b)));
    }

    /* renamed from: H */
    public final void m19375H(AbstractC4072b abstractC4072b, int i11, AbstractC4098h abstractC4098h, C22890k c22890k, InterfaceC31234j interfaceC31234j) {
        m19360m(c22890k, abstractC4098h.m19433d(), abstractC4072b);
        C4091e1 c4091e1 = new C4091e1(i11, abstractC4098h, c22890k, interfaceC31234j);
        Handler handler = this.f16271E;
        handler.sendMessage(handler.obtainMessage(4, new C31256y(c4091e1, this.f16283z.get(), abstractC4072b)));
    }

    /* renamed from: I */
    public final void m19376I(MethodInvocation methodInvocation, int i11, long j11, int i12) {
        Handler handler = this.f16271E;
        handler.sendMessage(handler.obtainMessage(18, new C4139v0(methodInvocation, i11, j11, i12)));
    }

    /* renamed from: J */
    public final void m19377J(ConnectionResult connectionResult, int i11) {
        if (!m19383h(connectionResult, i11)) {
            Handler handler = this.f16271E;
            handler.sendMessage(handler.obtainMessage(5, i11, 0, connectionResult));
        }
    }

    /* renamed from: b */
    public final void m19378b() {
        Handler handler = this.f16271E;
        handler.sendMessage(handler.obtainMessage(3));
    }

    /* renamed from: c */
    public final void m19379c(AbstractC4072b abstractC4072b) {
        Handler handler = this.f16271E;
        handler.sendMessage(handler.obtainMessage(7, abstractC4072b));
    }

    /* renamed from: d */
    public final void m19380d(C4116n c4116n) {
        synchronized (f16265I) {
            try {
                if (this.f16268B != c4116n) {
                    this.f16268B = c4116n;
                    this.f16269C.clear();
                }
                this.f16269C.addAll(c4116n.m19507t());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e */
    public final void m19381e(C4116n c4116n) {
        synchronized (f16265I) {
            try {
                if (this.f16268B == c4116n) {
                    this.f16268B = null;
                    this.f16269C.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: g */
    public final boolean m19382g() {
        if (this.f16276s) {
            return false;
        }
        RootTelemetryConfiguration m19740a = C4208p.m19739b().m19740a();
        if (m19740a != null && !m19740a.m19619J()) {
            return false;
        }
        int m19685a = this.f16281x.m19685a(this.f16279v, 203400000);
        if (m19685a != -1 && m19685a != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public final boolean m19383h(ConnectionResult connectionResult, int i11) {
        return this.f16280w.m19214z(this.f16279v, connectionResult, i11);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        C31218b c31218b;
        C31218b c31218b2;
        C31218b c31218b3;
        C31218b c31218b4;
        C31218b c31218b5;
        int i11 = message.what;
        long j11 = 300000;
        C4123p0 c4123p0 = null;
        switch (i11) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j11 = 10000;
                }
                this.f16275r = j11;
                this.f16271E.removeMessages(12);
                for (C31218b c31218b6 : this.f16267A.keySet()) {
                    Handler handler = this.f16271E;
                    handler.sendMessageDelayed(handler.obtainMessage(12, c31218b6), this.f16275r);
                }
                return true;
            case 2:
                AbstractC30228a.m149044a(message.obj);
                throw null;
            case 3:
                for (C4123p0 c4123p02 : this.f16267A.values()) {
                    c4123p02.m19543z();
                    c4123p02.m19529A();
                }
                return true;
            case 4:
            case 8:
            case 13:
                C31256y c31256y = (C31256y) message.obj;
                C4123p0 c4123p03 = (C4123p0) this.f16267A.get(c31256y.f144273c.m19245n());
                if (c4123p03 == null) {
                    c4123p03 = m19357j(c31256y.f144273c);
                }
                if (c4123p03.m19537J() && this.f16283z.get() != c31256y.f144272b) {
                    c31256y.f144271a.mo19386a(f16263G);
                    c4123p03.m19535H();
                } else {
                    c4123p03.m19530B(c31256y.f144271a);
                }
                return true;
            case 5:
                int i12 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator it = this.f16267A.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        C4123p0 c4123p04 = (C4123p0) it.next();
                        if (c4123p04.m19539o() == i12) {
                            c4123p0 = c4123p04;
                        }
                    }
                }
                if (c4123p0 != null) {
                    if (connectionResult.m19188t() != 13) {
                        c31218b = c4123p0.f16414r;
                        c4123p0.m19511d(m19356i(c31218b, connectionResult));
                    } else {
                        c4123p0.m19511d(new Status(17, "Error resolution was canceled by the user, original error message: " + this.f16280w.mo19199g(connectionResult.m19188t()) + ": " + connectionResult.m19184F()));
                    }
                } else {
                    Log.wtf("GoogleApiManager", "Could not find API instance " + i12 + " while trying to fail enqueued calls.", new Exception());
                }
                return true;
            case 6:
                if (this.f16279v.getApplicationContext() instanceof Application) {
                    ComponentCallbacks2C4077a.m19299c((Application) this.f16279v.getApplicationContext());
                    ComponentCallbacks2C4077a.m19298b().m19301a(new C4108k0(this));
                    if (!ComponentCallbacks2C4077a.m19298b().m19303e(true)) {
                        this.f16275r = 300000L;
                    }
                }
                return true;
            case 7:
                m19357j((AbstractC4072b) message.obj);
                return true;
            case 9:
                if (this.f16267A.containsKey(message.obj)) {
                    ((C4123p0) this.f16267A.get(message.obj)).m19534G();
                }
                return true;
            case 10:
                Iterator it2 = this.f16270D.iterator();
                while (it2.hasNext()) {
                    C4123p0 c4123p05 = (C4123p0) this.f16267A.remove((C31218b) it2.next());
                    if (c4123p05 != null) {
                        c4123p05.m19535H();
                    }
                }
                this.f16270D.clear();
                return true;
            case 11:
                if (this.f16267A.containsKey(message.obj)) {
                    ((C4123p0) this.f16267A.get(message.obj)).m19536I();
                }
                return true;
            case 12:
                if (this.f16267A.containsKey(message.obj)) {
                    ((C4123p0) this.f16267A.get(message.obj)).m19538a();
                }
                return true;
            case 14:
                AbstractC30228a.m149044a(message.obj);
                throw null;
            case 15:
                C4126q0 c4126q0 = (C4126q0) message.obj;
                Map map = this.f16267A;
                c31218b2 = c4126q0.f16426a;
                if (map.containsKey(c31218b2)) {
                    Map map2 = this.f16267A;
                    c31218b3 = c4126q0.f16426a;
                    C4123p0.m19527x((C4123p0) map2.get(c31218b3), c4126q0);
                }
                return true;
            case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                C4126q0 c4126q02 = (C4126q0) message.obj;
                Map map3 = this.f16267A;
                c31218b4 = c4126q02.f16426a;
                if (map3.containsKey(c31218b4)) {
                    Map map4 = this.f16267A;
                    c31218b5 = c4126q02.f16426a;
                    C4123p0.m19528y((C4123p0) map4.get(c31218b5), c4126q02);
                }
                return true;
            case 17:
                m19359l();
                return true;
            case 18:
                C4139v0 c4139v0 = (C4139v0) message.obj;
                if (c4139v0.f16459c == 0) {
                    m19358k().mo16707a(new TelemetryData(c4139v0.f16458b, Arrays.asList(c4139v0.f16457a)));
                } else {
                    TelemetryData telemetryData = this.f16277t;
                    if (telemetryData != null) {
                        List m19623F = telemetryData.m19623F();
                        if (telemetryData.m19625t() == c4139v0.f16458b && (m19623F == null || m19623F.size() < c4139v0.f16460d)) {
                            this.f16277t.m19624J(c4139v0.f16457a);
                        } else {
                            this.f16271E.removeMessages(17);
                            m19359l();
                        }
                    }
                    if (this.f16277t == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(c4139v0.f16457a);
                        this.f16277t = new TelemetryData(c4139v0.f16458b, arrayList);
                        Handler handler2 = this.f16271E;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), c4139v0.f16459c);
                    }
                }
                return true;
            case 19:
                this.f16276s = false;
                return true;
            default:
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unknown message id: ");
                sb2.append(i11);
                return false;
        }
    }

    /* renamed from: n */
    public final int m19384n() {
        return this.f16282y.getAndIncrement();
    }

    /* renamed from: x */
    public final C4123p0 m19385x(C31218b c31218b) {
        return (C4123p0) this.f16267A.get(c31218b);
    }
}

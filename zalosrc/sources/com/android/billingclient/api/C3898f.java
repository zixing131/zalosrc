package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.billingclient.api.C3914j;
import com.android.billingclient.api.C3952v;
import com.google.android.gms.internal.play_billing.AbstractC5727a5;
import com.google.android.gms.internal.play_billing.AbstractC5766h;
import com.google.android.gms.internal.play_billing.AbstractC5796m;
import com.google.android.gms.internal.play_billing.AbstractC5856w;
import com.google.android.gms.internal.play_billing.C5726a4;
import com.google.android.gms.internal.play_billing.C5759f4;
import com.google.android.gms.internal.play_billing.C5765g4;
import com.google.android.gms.internal.play_billing.C5777i4;
import com.google.android.gms.internal.play_billing.C5789k4;
import com.google.android.gms.internal.play_billing.C5818p3;
import com.google.android.gms.internal.play_billing.C5824q3;
import com.google.android.gms.internal.play_billing.C5842t3;
import com.google.android.gms.internal.play_billing.C5848u3;
import com.google.android.gms.internal.play_billing.C5860w3;
import com.google.android.gms.internal.play_billing.InterfaceC5849u4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import p339m3.AbstractC22825a;
import p664y.AbstractC30228a;

/* renamed from: com.android.billingclient.api.f */
/* loaded from: classes2.dex */
public class C3898f extends AbstractC3894e {

    /* renamed from: A */
    private ExecutorService f15499A;

    /* renamed from: a */
    private volatile int f15500a;

    /* renamed from: b */
    private final String f15501b;

    /* renamed from: c */
    private final Handler f15502c;

    /* renamed from: d */
    private volatile C3966z1 f15503d;

    /* renamed from: e */
    private Context f15504e;

    /* renamed from: f */
    private InterfaceC3944s0 f15505f;

    /* renamed from: g */
    private volatile InterfaceC5849u4 f15506g;

    /* renamed from: h */
    private volatile ServiceConnectionC3907h0 f15507h;

    /* renamed from: i */
    private boolean f15508i;

    /* renamed from: j */
    private boolean f15509j;

    /* renamed from: k */
    private int f15510k;

    /* renamed from: l */
    private boolean f15511l;

    /* renamed from: m */
    private boolean f15512m;

    /* renamed from: n */
    private boolean f15513n;

    /* renamed from: o */
    private boolean f15514o;

    /* renamed from: p */
    private boolean f15515p;

    /* renamed from: q */
    private boolean f15516q;

    /* renamed from: r */
    private boolean f15517r;

    /* renamed from: s */
    private boolean f15518s;

    /* renamed from: t */
    private boolean f15519t;

    /* renamed from: u */
    private boolean f15520u;

    /* renamed from: v */
    private boolean f15521v;

    /* renamed from: w */
    private boolean f15522w;

    /* renamed from: x */
    private boolean f15523x;

    /* renamed from: y */
    private C3904g1 f15524y;

    /* renamed from: z */
    private boolean f15525z;

    public C3898f(String str, Context context, InterfaceC3944s0 interfaceC3944s0, ExecutorService executorService) {
        this.f15500a = 0;
        this.f15502c = new Handler(Looper.getMainLooper());
        this.f15510k = 0;
        String m18549K = m18549K();
        this.f15501b = m18549K;
        this.f15504e = context.getApplicationContext();
        C5759f4 m30231t = C5765g4.m30231t();
        m30231t.m30224i(m18549K);
        m30231t.m30223h(this.f15504e.getPackageName());
        this.f15505f = new C3959x0(this.f15504e, (C5765g4) m30231t.m30227c());
        this.f15504e.getPackageName();
    }

    /* renamed from: F */
    public static /* synthetic */ C3930n1 m18544F(C3898f c3898f, String str, int i11) {
        Bundle mo30473U0;
        int i12;
        AbstractC5856w.m30541j("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        boolean z11 = true;
        Bundle m30535d = AbstractC5856w.m30535d(c3898f.f15513n, c3898f.f15521v, true, false, c3898f.f15501b);
        List list = null;
        String str2 = null;
        while (true) {
            try {
                if (c3898f.f15513n) {
                    InterfaceC5849u4 interfaceC5849u4 = c3898f.f15506g;
                    if (z11 != c3898f.f15521v) {
                        i12 = 9;
                    } else {
                        i12 = 19;
                    }
                    mo30473U0 = interfaceC5849u4.mo30476o2(i12, c3898f.f15504e.getPackageName(), str, str2, m30535d);
                } else {
                    mo30473U0 = c3898f.f15506g.mo30473U0(3, c3898f.f15504e.getPackageName(), str, str2);
                }
                C3933o1 m18683a = AbstractC3936p1.m18683a(mo30473U0, "BillingClient", "getPurchase()");
                C3918k m18666a = m18683a.m18666a();
                if (m18666a != AbstractC3950u0.f15646l) {
                    c3898f.f15505f.mo18696a(AbstractC3941r0.m18694a(m18683a.m18667b(), 9, m18666a));
                    return new C3930n1(m18666a, list);
                }
                ArrayList<String> stringArrayList = mo30473U0.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = mo30473U0.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = mo30473U0.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                boolean z12 = false;
                for (int i13 = 0; i13 < stringArrayList2.size(); i13++) {
                    String str3 = stringArrayList2.get(i13);
                    String str4 = stringArrayList3.get(i13);
                    AbstractC5856w.m30541j("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList.get(i13))));
                    try {
                        C3940r c3940r = new C3940r(str3, str4);
                        if (TextUtils.isEmpty(c3940r.m18691f())) {
                            AbstractC5856w.m30542k("BillingClient", "BUG: empty/null token!");
                            z12 = true;
                        }
                        arrayList.add(c3940r);
                    } catch (JSONException e11) {
                        AbstractC5856w.m30543l("BillingClient", "Got an exception trying to decode the purchase!", e11);
                        InterfaceC3944s0 interfaceC3944s0 = c3898f.f15505f;
                        C3918k c3918k = AbstractC3950u0.f15644j;
                        interfaceC3944s0.mo18696a(AbstractC3941r0.m18694a(51, 9, c3918k));
                        return new C3930n1(c3918k, null);
                    }
                }
                if (z12) {
                    c3898f.f15505f.mo18696a(AbstractC3941r0.m18694a(26, 9, AbstractC3950u0.f15644j));
                }
                str2 = mo30473U0.getString("INAPP_CONTINUATION_TOKEN");
                AbstractC5856w.m30541j("BillingClient", "Continuation token: ".concat(String.valueOf(str2)));
                if (TextUtils.isEmpty(str2)) {
                    return new C3930n1(AbstractC3950u0.f15646l, arrayList);
                }
                list = null;
                z11 = true;
            } catch (Exception e12) {
                InterfaceC3944s0 interfaceC3944s02 = c3898f.f15505f;
                C3918k c3918k2 = AbstractC3950u0.f15647m;
                interfaceC3944s02.mo18696a(AbstractC3941r0.m18694a(52, 9, c3918k2));
                AbstractC5856w.m30543l("BillingClient", "Got exception trying to get purchasesm try to reconnect", e12);
                return new C3930n1(c3918k2, null);
            }
        }
    }

    /* renamed from: G */
    public final Handler m18545G() {
        if (Looper.myLooper() == null) {
            return this.f15502c;
        }
        return new Handler(Looper.myLooper());
    }

    /* renamed from: H */
    private final C3918k m18546H(C3918k c3918k) {
        if (Thread.interrupted()) {
            return c3918k;
        }
        this.f15502c.post(new Runnable() { // from class: com.android.billingclient.api.b2

            /* renamed from: q */
            public final /* synthetic */ C3918k f15480q;

            public /* synthetic */ RunnableC3885b2(C3918k c3918k2) {
                r2 = c3918k2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C3898f.this.m18579A(r2);
            }
        });
        return c3918k2;
    }

    /* renamed from: J */
    public final C3918k m18548J() {
        if (this.f15500a != 0 && this.f15500a != 3) {
            return AbstractC3950u0.f15644j;
        }
        return AbstractC3950u0.f15647m;
    }

    /* renamed from: K */
    private static String m18549K() {
        try {
            return (String) AbstractC22825a.class.getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return "6.1.0";
        }
    }

    /* renamed from: L */
    public final Future m18550L(Callable callable, long j11, Runnable runnable, Handler handler) {
        if (this.f15499A == null) {
            this.f15499A = Executors.newFixedThreadPool(AbstractC5856w.f33442a, new ThreadFactoryC3887c0(this));
        }
        try {
            Future submit = this.f15499A.submit(callable);
            handler.postDelayed(new Runnable() { // from class: com.android.billingclient.api.f2

                /* renamed from: p */
                public final /* synthetic */ Future f15527p;

                /* renamed from: q */
                public final /* synthetic */ Runnable f15528q;

                public /* synthetic */ RunnableC3901f2(Future submit2, Runnable runnable2) {
                    r1 = submit2;
                    r2 = runnable2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Future future = r1;
                    if (!future.isDone() && !future.isCancelled()) {
                        Runnable runnable2 = r2;
                        future.cancel(true);
                        AbstractC5856w.m30542k("BillingClient", "Async task is taking too long, cancel it!");
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                }
            }, (long) (j11 * 0.95d));
            return submit2;
        } catch (Exception e11) {
            AbstractC5856w.m30543l("BillingClient", "Async task throws exception!", e11);
            return null;
        }
    }

    /* renamed from: M */
    private final void m18551M(String str, InterfaceC3946t interfaceC3946t) {
        if (!m18590m()) {
            InterfaceC3944s0 interfaceC3944s0 = this.f15505f;
            C3918k c3918k = AbstractC3950u0.f15647m;
            interfaceC3944s0.mo18696a(AbstractC3941r0.m18694a(2, 9, c3918k));
            interfaceC3946t.mo18699a(c3918k, AbstractC5766h.m30237r());
            return;
        }
        if (TextUtils.isEmpty(str)) {
            AbstractC5856w.m30542k("BillingClient", "Please provide a valid product type.");
            InterfaceC3944s0 interfaceC3944s02 = this.f15505f;
            C3918k c3918k2 = AbstractC3950u0.f15641g;
            interfaceC3944s02.mo18696a(AbstractC3941r0.m18694a(50, 9, c3918k2));
            interfaceC3946t.mo18699a(c3918k2, AbstractC5766h.m30237r());
            return;
        }
        if (m18550L(new CallableC3891d0(this, str, interfaceC3946t), 30000L, new Runnable() { // from class: com.android.billingclient.api.g2

            /* renamed from: q */
            public final /* synthetic */ InterfaceC3946t f15530q;

            public /* synthetic */ RunnableC3905g2(InterfaceC3946t interfaceC3946t2) {
                r2 = interfaceC3946t2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C3898f.this.m18583E(r2);
            }
        }, m18545G()) == null) {
            C3918k m18548J = m18548J();
            this.f15505f.mo18696a(AbstractC3941r0.m18694a(25, 9, m18548J));
            interfaceC3946t2.mo18699a(m18548J, AbstractC5766h.m30237r());
        }
    }

    /* renamed from: N */
    private final void m18552N(C3918k c3918k, int i11, int i12) {
        C5848u3 c5848u3 = null;
        C5824q3 c5824q3 = null;
        if (c3918k.m18652b() != 0) {
            InterfaceC3944s0 interfaceC3944s0 = this.f15505f;
            try {
                C5818p3 m30434u = C5824q3.m30434u();
                C5860w3 m30160u = C5726a4.m30160u();
                m30160u.m30551j(c3918k.m18652b());
                m30160u.m30550i(c3918k.m18651a());
                m30160u.m30552k(i11);
                m30434u.m30428h(m30160u);
                m30434u.m30430j(5);
                C5777i4 m30317t = C5789k4.m30317t();
                m30317t.m30297h(i12);
                m30434u.m30429i((C5789k4) m30317t.m30227c());
                c5824q3 = (C5824q3) m30434u.m30227c();
            } catch (Exception e11) {
                AbstractC5856w.m30543l("BillingLogger", "Unable to create logging payload", e11);
            }
            interfaceC3944s0.mo18696a(c5824q3);
            return;
        }
        InterfaceC3944s0 interfaceC3944s02 = this.f15505f;
        try {
            C5842t3 m30524t = C5848u3.m30524t();
            m30524t.m30480i(5);
            C5777i4 m30317t2 = C5789k4.m30317t();
            m30317t2.m30297h(i12);
            m30524t.m30479h((C5789k4) m30317t2.m30227c());
            c5848u3 = (C5848u3) m30524t.m30227c();
        } catch (Exception e12) {
            AbstractC5856w.m30543l("BillingLogger", "Unable to create logging payload", e12);
        }
        interfaceC3944s02.mo18698c(c5848u3);
    }

    /* renamed from: l */
    private void m18566l(Context context, InterfaceC3949u interfaceC3949u, C3904g1 c3904g1, InterfaceC3890d interfaceC3890d, String str, InterfaceC3944s0 interfaceC3944s0) {
        boolean z11;
        this.f15504e = context.getApplicationContext();
        C5759f4 m30231t = C5765g4.m30231t();
        m30231t.m30224i(str);
        m30231t.m30223h(this.f15504e.getPackageName());
        if (interfaceC3944s0 != null) {
            this.f15505f = interfaceC3944s0;
        } else {
            this.f15505f = new C3959x0(this.f15504e, (C5765g4) m30231t.m30227c());
        }
        if (interfaceC3949u == null) {
            AbstractC5856w.m30542k("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f15503d = new C3966z1(this.f15504e, interfaceC3949u, interfaceC3890d, this.f15505f);
        this.f15524y = c3904g1;
        if (interfaceC3890d != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f15525z = z11;
        this.f15504e.getPackageName();
    }

    /* renamed from: A */
    public final /* synthetic */ void m18579A(C3918k c3918k) {
        if (this.f15503d.m18731d() != null) {
            this.f15503d.m18731d().mo18700b(c3918k, null);
        } else {
            this.f15503d.m18730c();
            AbstractC5856w.m30542k("BillingClient", "No valid listener is set in BroadcastManager");
        }
    }

    /* renamed from: B */
    public final /* synthetic */ void m18580B(InterfaceC3925m interfaceC3925m, C3922l c3922l) {
        InterfaceC3944s0 interfaceC3944s0 = this.f15505f;
        C3918k c3918k = AbstractC3950u0.f15648n;
        interfaceC3944s0.mo18696a(AbstractC3941r0.m18694a(24, 4, c3918k));
        interfaceC3925m.mo18661f(c3918k, c3922l.m18658a());
    }

    /* renamed from: C */
    public final /* synthetic */ void m18581C(InterfaceC3910i interfaceC3910i) {
        InterfaceC3944s0 interfaceC3944s0 = this.f15505f;
        C3918k c3918k = AbstractC3950u0.f15648n;
        interfaceC3944s0.mo18696a(AbstractC3941r0.m18694a(24, 13, c3918k));
        interfaceC3910i.mo18599a(c3918k, null);
    }

    /* renamed from: D */
    public final /* synthetic */ void m18582D(InterfaceC3937q interfaceC3937q) {
        InterfaceC3944s0 interfaceC3944s0 = this.f15505f;
        C3918k c3918k = AbstractC3950u0.f15648n;
        interfaceC3944s0.mo18696a(AbstractC3941r0.m18694a(24, 7, c3918k));
        interfaceC3937q.mo18684a(c3918k, new ArrayList());
    }

    /* renamed from: E */
    public final /* synthetic */ void m18583E(InterfaceC3946t interfaceC3946t) {
        InterfaceC3944s0 interfaceC3944s0 = this.f15505f;
        C3918k c3918k = AbstractC3950u0.f15648n;
        interfaceC3944s0.mo18696a(AbstractC3941r0.m18694a(24, 9, c3918k));
        interfaceC3946t.mo18699a(c3918k, AbstractC5766h.m30237r());
    }

    /* renamed from: P */
    public final /* synthetic */ Bundle m18584P(int i11, String str, String str2, C3914j c3914j, Bundle bundle) {
        return this.f15506g.mo30468C1(i11, this.f15504e.getPackageName(), str, str2, null, bundle);
    }

    /* renamed from: Q */
    public final /* synthetic */ Bundle m18585Q(String str, String str2) {
        return this.f15506g.mo30467A3(3, this.f15504e.getPackageName(), str, str2, null);
    }

    /* renamed from: W */
    public final /* synthetic */ Object m18586W(C3882b c3882b, InterfaceC3886c interfaceC3886c) {
        try {
            InterfaceC5849u4 interfaceC5849u4 = this.f15506g;
            String packageName = this.f15504e.getPackageName();
            String m18524a = c3882b.m18524a();
            String str = this.f15501b;
            Bundle bundle = new Bundle();
            bundle.putString("playBillingLibraryVersion", str);
            Bundle mo30472P4 = interfaceC5849u4.mo30472P4(9, packageName, m18524a, bundle);
            interfaceC3886c.mo18527e(AbstractC3950u0.m18701a(AbstractC5856w.m30533b(mo30472P4, "BillingClient"), AbstractC5856w.m30538g(mo30472P4, "BillingClient")));
            return null;
        } catch (Exception e11) {
            AbstractC5856w.m30543l("BillingClient", "Error acknowledge purchase!", e11);
            InterfaceC3944s0 interfaceC3944s0 = this.f15505f;
            C3918k c3918k = AbstractC3950u0.f15647m;
            interfaceC3944s0.mo18696a(AbstractC3941r0.m18694a(28, 3, c3918k));
            interfaceC3886c.mo18527e(c3918k);
            return null;
        }
    }

    /* renamed from: X */
    public final /* synthetic */ Object m18587X(C3922l c3922l, InterfaceC3925m interfaceC3925m) {
        int mo30475Y;
        String str;
        String m18658a = c3922l.m18658a();
        try {
            AbstractC5856w.m30541j("BillingClient", "Consuming purchase with token: " + m18658a);
            if (this.f15513n) {
                InterfaceC5849u4 interfaceC5849u4 = this.f15506g;
                String packageName = this.f15504e.getPackageName();
                boolean z11 = this.f15513n;
                String str2 = this.f15501b;
                Bundle bundle = new Bundle();
                if (z11) {
                    bundle.putString("playBillingLibraryVersion", str2);
                }
                Bundle mo30471L2 = interfaceC5849u4.mo30471L2(9, packageName, m18658a, bundle);
                mo30475Y = mo30471L2.getInt("RESPONSE_CODE");
                str = AbstractC5856w.m30538g(mo30471L2, "BillingClient");
            } else {
                mo30475Y = this.f15506g.mo30475Y(3, this.f15504e.getPackageName(), m18658a);
                str = "";
            }
            C3918k m18701a = AbstractC3950u0.m18701a(mo30475Y, str);
            if (mo30475Y == 0) {
                AbstractC5856w.m30541j("BillingClient", "Successfully consumed purchase.");
                interfaceC3925m.mo18661f(m18701a, m18658a);
                return null;
            }
            AbstractC5856w.m30542k("BillingClient", "Error consuming purchase with token. Response code: " + mo30475Y);
            this.f15505f.mo18696a(AbstractC3941r0.m18694a(23, 4, m18701a));
            interfaceC3925m.mo18661f(m18701a, m18658a);
            return null;
        } catch (Exception e11) {
            AbstractC5856w.m30543l("BillingClient", "Error consuming purchase!", e11);
            InterfaceC3944s0 interfaceC3944s0 = this.f15505f;
            C3918k c3918k = AbstractC3950u0.f15647m;
            interfaceC3944s0.mo18696a(AbstractC3941r0.m18694a(29, 4, c3918k));
            interfaceC3925m.mo18661f(c3918k, m18658a);
            return null;
        }
    }

    /* renamed from: Y */
    public final /* synthetic */ Object m18588Y(Bundle bundle, InterfaceC3910i interfaceC3910i) {
        try {
            this.f15506g.mo30474W2(18, this.f15504e.getPackageName(), bundle, new BinderC3915j0(interfaceC3910i, this.f15505f, null));
        } catch (DeadObjectException e11) {
            AbstractC5856w.m30543l("BillingClient", "getBillingConfig got a dead object exception (try to reconnect).", e11);
            InterfaceC3944s0 interfaceC3944s0 = this.f15505f;
            C3918k c3918k = AbstractC3950u0.f15647m;
            interfaceC3944s0.mo18696a(AbstractC3941r0.m18694a(62, 13, c3918k));
            interfaceC3910i.mo18599a(c3918k, null);
        } catch (Exception e12) {
            AbstractC5856w.m30543l("BillingClient", "getBillingConfig got an exception.", e12);
            InterfaceC3944s0 interfaceC3944s02 = this.f15505f;
            C3918k c3918k2 = AbstractC3950u0.f15644j;
            interfaceC3944s02.mo18696a(AbstractC3941r0.m18694a(62, 13, c3918k2));
            interfaceC3910i.mo18599a(c3918k2, null);
        }
        return null;
    }

    /* renamed from: Z */
    public final /* synthetic */ Object m18589Z(C3952v c3952v, InterfaceC3937q interfaceC3937q) {
        String str;
        int i11;
        int i12;
        int i13;
        InterfaceC5849u4 interfaceC5849u4;
        int i14;
        String packageName;
        Bundle bundle;
        AbstractC5766h abstractC5766h;
        ArrayList arrayList = new ArrayList();
        String m18704c = c3952v.m18704c();
        AbstractC5766h m18703b = c3952v.m18703b();
        int size = m18703b.size();
        int i15 = 0;
        while (true) {
            if (i15 < size) {
                int i16 = i15 + 20;
                if (i16 > size) {
                    i12 = size;
                } else {
                    i12 = i16;
                }
                ArrayList arrayList2 = new ArrayList(m18703b.subList(i15, i12));
                ArrayList<String> arrayList3 = new ArrayList<>();
                int size2 = arrayList2.size();
                for (int i17 = 0; i17 < size2; i17++) {
                    arrayList3.add(((C3952v.b) arrayList2.get(i17)).m18709b());
                }
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("ITEM_ID_LIST", arrayList3);
                bundle2.putString("playBillingLibraryVersion", this.f15501b);
                try {
                    interfaceC5849u4 = this.f15506g;
                    if (true != this.f15522w) {
                        i14 = 17;
                    } else {
                        i14 = 20;
                    }
                    packageName = this.f15504e.getPackageName();
                    String str2 = this.f15501b;
                    if (TextUtils.isEmpty(null)) {
                        this.f15504e.getPackageName();
                    }
                    bundle = new Bundle();
                    bundle.putString("playBillingLibraryVersion", str2);
                    bundle.putBoolean("enablePendingPurchases", true);
                    bundle.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
                    ArrayList<String> arrayList4 = new ArrayList<>();
                    ArrayList<String> arrayList5 = new ArrayList<>();
                    int size3 = arrayList2.size();
                    abstractC5766h = m18703b;
                    int i18 = 0;
                    boolean z11 = false;
                    boolean z12 = false;
                    while (i18 < size3) {
                        C3952v.b bVar = (C3952v.b) arrayList2.get(i18);
                        ArrayList arrayList6 = arrayList2;
                        arrayList4.add(null);
                        z11 |= !TextUtils.isEmpty(null);
                        String m18710c = bVar.m18710c();
                        int i19 = size3;
                        if (m18710c.equals("first_party")) {
                            AbstractC5727a5.m30168c(null, "Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
                            arrayList5.add(null);
                            z12 = true;
                        }
                        i18++;
                        size3 = i19;
                        arrayList2 = arrayList6;
                    }
                    if (z11) {
                        bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList4);
                    }
                    if (!arrayList5.isEmpty()) {
                        bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);
                    }
                    if (z12 && !TextUtils.isEmpty(null)) {
                        bundle.putString("accountName", null);
                    }
                    i13 = 7;
                } catch (Exception e11) {
                    e = e11;
                    i13 = 7;
                }
                try {
                    Bundle mo30470F2 = interfaceC5849u4.mo30470F2(i14, packageName, m18704c, bundle2, bundle);
                    str = "Item is unavailable for purchase.";
                    if (mo30470F2 == null) {
                        AbstractC5856w.m30542k("BillingClient", "queryProductDetailsAsync got empty product details response.");
                        this.f15505f.mo18696a(AbstractC3941r0.m18694a(44, 7, AbstractC3950u0.f15631B));
                        break;
                    }
                    if (!mo30470F2.containsKey("DETAILS_LIST")) {
                        i11 = AbstractC5856w.m30533b(mo30470F2, "BillingClient");
                        str = AbstractC5856w.m30538g(mo30470F2, "BillingClient");
                        if (i11 != 0) {
                            AbstractC5856w.m30542k("BillingClient", "getSkuDetails() failed for queryProductDetailsAsync. Response code: " + i11);
                            this.f15505f.mo18696a(AbstractC3941r0.m18694a(23, 7, AbstractC3950u0.m18701a(i11, str)));
                        } else {
                            AbstractC5856w.m30542k("BillingClient", "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.");
                            this.f15505f.mo18696a(AbstractC3941r0.m18694a(45, 7, AbstractC3950u0.m18701a(6, str)));
                        }
                    } else {
                        ArrayList<String> stringArrayList = mo30470F2.getStringArrayList("DETAILS_LIST");
                        if (stringArrayList == null) {
                            AbstractC5856w.m30542k("BillingClient", "queryProductDetailsAsync got null response list");
                            this.f15505f.mo18696a(AbstractC3941r0.m18694a(46, 7, AbstractC3950u0.f15631B));
                            break;
                        }
                        for (int i21 = 0; i21 < stringArrayList.size(); i21++) {
                            try {
                                C3934p c3934p = new C3934p(stringArrayList.get(i21));
                                AbstractC5856w.m30541j("BillingClient", "Got product details: ".concat(c3934p.toString()));
                                arrayList.add(c3934p);
                            } catch (JSONException e12) {
                                AbstractC5856w.m30543l("BillingClient", "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e12);
                                str = "Error trying to decode SkuDetails.";
                                this.f15505f.mo18696a(AbstractC3941r0.m18694a(47, 7, AbstractC3950u0.m18701a(6, "Error trying to decode SkuDetails.")));
                                i11 = 6;
                                interfaceC3937q.mo18684a(AbstractC3950u0.m18701a(i11, str), arrayList);
                                return null;
                            }
                        }
                        i15 = i16;
                        m18703b = abstractC5766h;
                    }
                } catch (Exception e13) {
                    e = e13;
                    AbstractC5856w.m30543l("BillingClient", "queryProductDetailsAsync got a remote exception (try to reconnect).", e);
                    this.f15505f.mo18696a(AbstractC3941r0.m18694a(43, i13, AbstractC3950u0.f15644j));
                    str = "An internal error occurred.";
                    i11 = 6;
                    interfaceC3937q.mo18684a(AbstractC3950u0.m18701a(i11, str), arrayList);
                    return null;
                }
            } else {
                str = "";
                i11 = 0;
                break;
            }
        }
        i11 = 4;
        interfaceC3937q.mo18684a(AbstractC3950u0.m18701a(i11, str), arrayList);
        return null;
    }

    @Override // com.android.billingclient.api.AbstractC3894e
    /* renamed from: a */
    public final void mo18529a(C3882b c3882b, InterfaceC3886c interfaceC3886c) {
        if (!m18590m()) {
            InterfaceC3944s0 interfaceC3944s0 = this.f15505f;
            C3918k c3918k = AbstractC3950u0.f15647m;
            interfaceC3944s0.mo18696a(AbstractC3941r0.m18694a(2, 3, c3918k));
            interfaceC3886c.mo18527e(c3918k);
            return;
        }
        if (TextUtils.isEmpty(c3882b.m18524a())) {
            AbstractC5856w.m30542k("BillingClient", "Please provide a valid purchase token.");
            InterfaceC3944s0 interfaceC3944s02 = this.f15505f;
            C3918k c3918k2 = AbstractC3950u0.f15643i;
            interfaceC3944s02.mo18696a(AbstractC3941r0.m18694a(26, 3, c3918k2));
            interfaceC3886c.mo18527e(c3918k2);
            return;
        }
        if (!this.f15513n) {
            InterfaceC3944s0 interfaceC3944s03 = this.f15505f;
            C3918k c3918k3 = AbstractC3950u0.f15636b;
            interfaceC3944s03.mo18696a(AbstractC3941r0.m18694a(27, 3, c3918k3));
            interfaceC3886c.mo18527e(c3918k3);
            return;
        }
        if (m18550L(new Callable() { // from class: com.android.billingclient.api.b0

            /* renamed from: b */
            public final /* synthetic */ C3882b f15477b;

            /* renamed from: c */
            public final /* synthetic */ InterfaceC3886c f15478c;

            public /* synthetic */ CallableC3883b0(C3882b c3882b2, InterfaceC3886c interfaceC3886c2) {
                r2 = c3882b2;
                r3 = interfaceC3886c2;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                C3898f.this.m18586W(r2, r3);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.c2

            /* renamed from: q */
            public final /* synthetic */ InterfaceC3886c f15484q;

            public /* synthetic */ RunnableC3889c2(InterfaceC3886c interfaceC3886c2) {
                r2 = interfaceC3886c2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C3898f.this.m18591z(r2);
            }
        }, m18545G()) == null) {
            C3918k m18548J = m18548J();
            this.f15505f.mo18696a(AbstractC3941r0.m18694a(25, 3, m18548J));
            interfaceC3886c2.mo18527e(m18548J);
        }
    }

    @Override // com.android.billingclient.api.AbstractC3894e
    /* renamed from: b */
    public final void mo18530b(C3922l c3922l, InterfaceC3925m interfaceC3925m) {
        if (!m18590m()) {
            InterfaceC3944s0 interfaceC3944s0 = this.f15505f;
            C3918k c3918k = AbstractC3950u0.f15647m;
            interfaceC3944s0.mo18696a(AbstractC3941r0.m18694a(2, 4, c3918k));
            interfaceC3925m.mo18661f(c3918k, c3922l.m18658a());
            return;
        }
        if (m18550L(new Callable() { // from class: com.android.billingclient.api.i2

            /* renamed from: b */
            public final /* synthetic */ C3922l f15542b;

            /* renamed from: c */
            public final /* synthetic */ InterfaceC3925m f15543c;

            public /* synthetic */ CallableC3913i2(C3922l c3922l2, InterfaceC3925m interfaceC3925m2) {
                r2 = c3922l2;
                r3 = interfaceC3925m2;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                C3898f.this.m18587X(r2, r3);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.j2

            /* renamed from: q */
            public final /* synthetic */ InterfaceC3925m f15573q;

            /* renamed from: r */
            public final /* synthetic */ C3922l f15574r;

            public /* synthetic */ RunnableC3917j2(InterfaceC3925m interfaceC3925m2, C3922l c3922l2) {
                r2 = interfaceC3925m2;
                r3 = c3922l2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C3898f.this.m18580B(r2, r3);
            }
        }, m18545G()) == null) {
            C3918k m18548J = m18548J();
            this.f15505f.mo18696a(AbstractC3941r0.m18694a(25, 4, m18548J));
            interfaceC3925m2.mo18661f(m18548J, c3922l2.m18658a());
        }
    }

    @Override // com.android.billingclient.api.AbstractC3894e
    /* renamed from: c */
    public final void mo18531c() {
        this.f15505f.mo18698c(AbstractC3941r0.m18695b(12));
        try {
            try {
                if (this.f15503d != null) {
                    this.f15503d.m18732e();
                }
                if (this.f15507h != null) {
                    this.f15507h.m18598c();
                }
                if (this.f15507h != null && this.f15506g != null) {
                    AbstractC5856w.m30541j("BillingClient", "Unbinding from service.");
                    this.f15504e.unbindService(this.f15507h);
                    this.f15507h = null;
                }
                this.f15506g = null;
                ExecutorService executorService = this.f15499A;
                if (executorService != null) {
                    executorService.shutdownNow();
                    this.f15499A = null;
                }
            } catch (Exception e11) {
                AbstractC5856w.m30543l("BillingClient", "There was an exception while ending connection!", e11);
            }
            this.f15500a = 3;
        } catch (Throwable th2) {
            this.f15500a = 3;
            throw th2;
        }
    }

    @Override // com.android.billingclient.api.AbstractC3894e
    /* renamed from: d */
    public final void mo18532d(C3928n c3928n, InterfaceC3910i interfaceC3910i) {
        if (!m18590m()) {
            AbstractC5856w.m30542k("BillingClient", "Service disconnected.");
            InterfaceC3944s0 interfaceC3944s0 = this.f15505f;
            C3918k c3918k = AbstractC3950u0.f15647m;
            interfaceC3944s0.mo18696a(AbstractC3941r0.m18694a(2, 13, c3918k));
            interfaceC3910i.mo18599a(c3918k, null);
            return;
        }
        if (!this.f15520u) {
            AbstractC5856w.m30542k("BillingClient", "Current client doesn't support get billing config.");
            InterfaceC3944s0 interfaceC3944s02 = this.f15505f;
            C3918k c3918k2 = AbstractC3950u0.f15660z;
            interfaceC3944s02.mo18696a(AbstractC3941r0.m18694a(32, 13, c3918k2));
            interfaceC3910i.mo18599a(c3918k2, null);
            return;
        }
        String str = this.f15501b;
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        if (m18550L(new Callable() { // from class: com.android.billingclient.api.d2

            /* renamed from: b */
            public final /* synthetic */ Bundle f15489b;

            /* renamed from: c */
            public final /* synthetic */ InterfaceC3910i f15490c;

            public /* synthetic */ CallableC3893d2(Bundle bundle2, InterfaceC3910i interfaceC3910i2) {
                r2 = bundle2;
                r3 = interfaceC3910i2;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                C3898f.this.m18588Y(r2, r3);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.e2

            /* renamed from: q */
            public final /* synthetic */ InterfaceC3910i f15498q;

            public /* synthetic */ RunnableC3897e2(InterfaceC3910i interfaceC3910i2) {
                r2 = interfaceC3910i2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C3898f.this.m18581C(r2);
            }
        }, m18545G()) == null) {
            C3918k m18548J = m18548J();
            this.f15505f.mo18696a(AbstractC3941r0.m18694a(25, 13, m18548J));
            interfaceC3910i2.mo18599a(m18548J, null);
        }
    }

    @Override // com.android.billingclient.api.AbstractC3894e
    /* renamed from: e */
    public final int mo18533e() {
        return this.f15500a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.android.billingclient.api.AbstractC3894e
    /* renamed from: f */
    public final C3918k mo18534f(String str) {
        char c11;
        C3918k c3918k;
        C3918k c3918k2;
        C3918k c3918k3;
        C3918k c3918k4;
        C3918k c3918k5;
        C3918k c3918k6;
        C3918k c3918k7;
        C3918k c3918k8;
        C3918k c3918k9;
        C3918k c3918k10;
        C3918k c3918k11;
        C3918k c3918k12;
        C3918k c3918k13;
        if (!m18590m()) {
            C3918k c3918k14 = AbstractC3950u0.f15647m;
            if (c3918k14.m18652b() != 0) {
                this.f15505f.mo18696a(AbstractC3941r0.m18694a(2, 5, c3918k14));
            } else {
                this.f15505f.mo18698c(AbstractC3941r0.m18695b(5));
            }
            return c3918k14;
        }
        C3918k c3918k15 = AbstractC3950u0.f15635a;
        switch (str.hashCode()) {
            case -422092961:
                if (str.equals("subscriptionsUpdate")) {
                    c11 = 1;
                    break;
                }
                c11 = 65535;
                break;
            case 96321:
                if (str.equals("aaa")) {
                    c11 = 4;
                    break;
                }
                c11 = 65535;
                break;
            case 97314:
                if (str.equals("bbb")) {
                    c11 = 3;
                    break;
                }
                c11 = 65535;
                break;
            case 98307:
                if (str.equals("ccc")) {
                    c11 = 6;
                    break;
                }
                c11 = 65535;
                break;
            case 99300:
                if (str.equals("ddd")) {
                    c11 = 5;
                    break;
                }
                c11 = 65535;
                break;
            case 100293:
                if (str.equals("eee")) {
                    c11 = 7;
                    break;
                }
                c11 = 65535;
                break;
            case 101286:
                if (str.equals("fff")) {
                    c11 = '\b';
                    break;
                }
                c11 = 65535;
                break;
            case 102279:
                if (str.equals("ggg")) {
                    c11 = '\t';
                    break;
                }
                c11 = 65535;
                break;
            case 103272:
                if (str.equals("hhh")) {
                    c11 = '\n';
                    break;
                }
                c11 = 65535;
                break;
            case 104265:
                if (str.equals("iii")) {
                    c11 = 11;
                    break;
                }
                c11 = 65535;
                break;
            case 105258:
                if (str.equals("jjj")) {
                    c11 = '\f';
                    break;
                }
                c11 = 65535;
                break;
            case 207616302:
                if (str.equals("priceChangeConfirmation")) {
                    c11 = 2;
                    break;
                }
                c11 = 65535;
                break;
            case 1987365622:
                if (str.equals("subscriptions")) {
                    c11 = 0;
                    break;
                }
                c11 = 65535;
                break;
            default:
                c11 = 65535;
                break;
        }
        switch (c11) {
            case 0:
                if (this.f15508i) {
                    c3918k = AbstractC3950u0.f15646l;
                } else {
                    c3918k = AbstractC3950u0.f15649o;
                }
                m18552N(c3918k, 9, 2);
                return c3918k;
            case 1:
                if (this.f15509j) {
                    c3918k2 = AbstractC3950u0.f15646l;
                } else {
                    c3918k2 = AbstractC3950u0.f15650p;
                }
                m18552N(c3918k2, 10, 3);
                return c3918k2;
            case 2:
                if (this.f15512m) {
                    c3918k3 = AbstractC3950u0.f15646l;
                } else {
                    c3918k3 = AbstractC3950u0.f15652r;
                }
                m18552N(c3918k3, 35, 4);
                return c3918k3;
            case 3:
                if (this.f15515p) {
                    c3918k4 = AbstractC3950u0.f15646l;
                } else {
                    c3918k4 = AbstractC3950u0.f15657w;
                }
                m18552N(c3918k4, 30, 5);
                return c3918k4;
            case 4:
                if (this.f15517r) {
                    c3918k5 = AbstractC3950u0.f15646l;
                } else {
                    c3918k5 = AbstractC3950u0.f15653s;
                }
                m18552N(c3918k5, 31, 6);
                return c3918k5;
            case 5:
                if (this.f15516q) {
                    c3918k6 = AbstractC3950u0.f15646l;
                } else {
                    c3918k6 = AbstractC3950u0.f15655u;
                }
                m18552N(c3918k6, 21, 7);
                return c3918k6;
            case 6:
                if (this.f15518s) {
                    c3918k7 = AbstractC3950u0.f15646l;
                } else {
                    c3918k7 = AbstractC3950u0.f15654t;
                }
                m18552N(c3918k7, 19, 8);
                return c3918k7;
            case 7:
                if (this.f15518s) {
                    c3918k8 = AbstractC3950u0.f15646l;
                } else {
                    c3918k8 = AbstractC3950u0.f15654t;
                }
                m18552N(c3918k8, 61, 9);
                return c3918k8;
            case '\b':
                if (this.f15519t) {
                    c3918k9 = AbstractC3950u0.f15646l;
                } else {
                    c3918k9 = AbstractC3950u0.f15656v;
                }
                m18552N(c3918k9, 20, 10);
                return c3918k9;
            case '\t':
                if (this.f15520u) {
                    c3918k10 = AbstractC3950u0.f15646l;
                } else {
                    c3918k10 = AbstractC3950u0.f15660z;
                }
                m18552N(c3918k10, 32, 11);
                return c3918k10;
            case '\n':
                if (this.f15520u) {
                    c3918k11 = AbstractC3950u0.f15646l;
                } else {
                    c3918k11 = AbstractC3950u0.f15630A;
                }
                m18552N(c3918k11, 33, 12);
                return c3918k11;
            case 11:
                if (this.f15522w) {
                    c3918k12 = AbstractC3950u0.f15646l;
                } else {
                    c3918k12 = AbstractC3950u0.f15632C;
                }
                m18552N(c3918k12, 60, 13);
                return c3918k12;
            case '\f':
                if (this.f15523x) {
                    c3918k13 = AbstractC3950u0.f15646l;
                } else {
                    c3918k13 = AbstractC3950u0.f15633D;
                }
                m18552N(c3918k13, 66, 14);
                return c3918k13;
            default:
                AbstractC5856w.m30542k("BillingClient", "Unsupported feature: ".concat(str));
                C3918k c3918k16 = AbstractC3950u0.f15659y;
                m18552N(c3918k16, 34, 1);
                return c3918k16;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x03c6 A[Catch: Exception -> 0x03d8, CancellationException -> 0x03da, TimeoutException -> 0x03dc, TRY_ENTER, TryCatch #4 {CancellationException -> 0x03da, TimeoutException -> 0x03dc, Exception -> 0x03d8, blocks: (B:106:0x03c6, B:108:0x03de, B:110:0x03f2, B:113:0x0410, B:115:0x041c), top: B:104:0x03c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03de A[Catch: Exception -> 0x03d8, CancellationException -> 0x03da, TimeoutException -> 0x03dc, TryCatch #4 {CancellationException -> 0x03da, TimeoutException -> 0x03dc, Exception -> 0x03d8, blocks: (B:106:0x03c6, B:108:0x03de, B:110:0x03f2, B:113:0x0410, B:115:0x041c), top: B:104:0x03c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0387  */
    @Override // com.android.billingclient.api.AbstractC3894e
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C3918k mo18535g(Activity activity, C3914j c3914j) {
        String str;
        String str2;
        Future m18550L;
        int i11;
        boolean z11;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        boolean z12;
        String str9;
        int i12;
        if (this.f15503d != null && this.f15503d.m18731d() != null) {
            if (!m18590m()) {
                InterfaceC3944s0 interfaceC3944s0 = this.f15505f;
                C3918k c3918k = AbstractC3950u0.f15647m;
                interfaceC3944s0.mo18696a(AbstractC3941r0.m18694a(2, 2, c3918k));
                m18546H(c3918k);
                return c3918k;
            }
            ArrayList m18614h = c3914j.m18614h();
            List m18615i = c3914j.m18615i();
            AbstractC30228a.m149044a(AbstractC5796m.m30359a(m18614h, null));
            C3914j.b bVar = (C3914j.b) AbstractC5796m.m30359a(m18615i, null);
            String m18669b = bVar.m18623b().m18669b();
            String m18670c = bVar.m18623b().m18670c();
            String str10 = "BillingClient";
            if (m18670c.equals("subs") && !this.f15508i) {
                AbstractC5856w.m30542k("BillingClient", "Current client doesn't support subscriptions.");
                InterfaceC3944s0 interfaceC3944s02 = this.f15505f;
                C3918k c3918k2 = AbstractC3950u0.f15649o;
                interfaceC3944s02.mo18696a(AbstractC3941r0.m18694a(9, 2, c3918k2));
                m18546H(c3918k2);
                return c3918k2;
            }
            if (c3914j.m18617r() && !this.f15511l) {
                AbstractC5856w.m30542k("BillingClient", "Current client doesn't support extra params for buy intent.");
                InterfaceC3944s0 interfaceC3944s03 = this.f15505f;
                C3918k c3918k3 = AbstractC3950u0.f15642h;
                interfaceC3944s03.mo18696a(AbstractC3941r0.m18694a(18, 2, c3918k3));
                m18546H(c3918k3);
                return c3918k3;
            }
            if (m18614h.size() > 1 && !this.f15518s) {
                AbstractC5856w.m30542k("BillingClient", "Current client doesn't support multi-item purchases.");
                InterfaceC3944s0 interfaceC3944s04 = this.f15505f;
                C3918k c3918k4 = AbstractC3950u0.f15654t;
                interfaceC3944s04.mo18696a(AbstractC3941r0.m18694a(19, 2, c3918k4));
                m18546H(c3918k4);
                return c3918k4;
            }
            if (!m18615i.isEmpty() && !this.f15519t) {
                AbstractC5856w.m30542k("BillingClient", "Current client doesn't support purchases with ProductDetails.");
                InterfaceC3944s0 interfaceC3944s05 = this.f15505f;
                C3918k c3918k5 = AbstractC3950u0.f15656v;
                interfaceC3944s05.mo18696a(AbstractC3941r0.m18694a(20, 2, c3918k5));
                m18546H(c3918k5);
                return c3918k5;
            }
            if (!this.f15511l) {
                str = "BUY_INTENT";
                str2 = "BillingClient";
                m18550L = m18550L(new Callable() { // from class: com.android.billingclient.api.a0

                    /* renamed from: b */
                    public final /* synthetic */ String f15472b;

                    /* renamed from: c */
                    public final /* synthetic */ String f15473c;

                    public /* synthetic */ CallableC3879a0(String m18669b2, String m18670c2) {
                        r2 = m18669b2;
                        r3 = m18670c2;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return C3898f.this.m18585Q(r2, r3);
                    }
                }, 5000L, null, this.f15502c);
                i11 = 80;
            } else {
                boolean z13 = this.f15513n;
                boolean z14 = this.f15525z;
                String str11 = this.f15501b;
                Bundle bundle = new Bundle();
                bundle.putString("playBillingLibraryVersion", str11);
                if (c3914j.m18609c() != 0) {
                    bundle.putInt("prorationMode", c3914j.m18609c());
                } else if (c3914j.m18608b() != 0) {
                    bundle.putInt("prorationMode", c3914j.m18608b());
                }
                if (!TextUtils.isEmpty(c3914j.m18610d())) {
                    bundle.putString("accountId", c3914j.m18610d());
                }
                if (!TextUtils.isEmpty(c3914j.m18611e())) {
                    bundle.putString("obfuscatedProfileId", c3914j.m18611e());
                }
                if (c3914j.m18616q()) {
                    bundle.putBoolean("isOfferPersonalizedByDeveloper", true);
                }
                if (!TextUtils.isEmpty(null)) {
                    bundle.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(null)));
                }
                if (!TextUtils.isEmpty(c3914j.m18612f())) {
                    bundle.putString("oldSkuPurchaseToken", c3914j.m18612f());
                }
                if (!TextUtils.isEmpty(null)) {
                    bundle.putString("oldSkuPurchaseId", null);
                }
                if (!TextUtils.isEmpty(c3914j.m18613g())) {
                    bundle.putString("originalExternalTransactionId", c3914j.m18613g());
                }
                if (!TextUtils.isEmpty(null)) {
                    bundle.putString("paymentsPurchaseParams", null);
                }
                if (z13) {
                    z11 = true;
                    bundle.putBoolean("enablePendingPurchases", true);
                } else {
                    z11 = true;
                }
                if (z14) {
                    bundle.putBoolean("enableAlternativeBilling", z11);
                }
                str = "BUY_INTENT";
                if (!m18614h.isEmpty()) {
                    ArrayList<String> arrayList = new ArrayList<>();
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    Iterator it = m18614h.iterator();
                    if (!it.hasNext()) {
                        if (!arrayList.isEmpty()) {
                            bundle.putStringArrayList("skuDetailsTokens", arrayList);
                        }
                        if (m18614h.size() > 1) {
                            ArrayList<String> arrayList2 = new ArrayList<>(m18614h.size() - 1);
                            ArrayList<String> arrayList3 = new ArrayList<>(m18614h.size() - 1);
                            if (1 >= m18614h.size()) {
                                bundle.putStringArrayList("additionalSkus", arrayList2);
                                bundle.putStringArrayList("additionalSkuTypes", arrayList3);
                            } else {
                                AbstractC30228a.m149044a(m18614h.get(1));
                                throw null;
                            }
                        }
                        str4 = "proxyPackageVersion";
                        str5 = m18669b2;
                        str3 = m18670c2;
                        str6 = "BillingClient";
                    } else {
                        AbstractC30228a.m149044a(it.next());
                        throw null;
                    }
                } else {
                    ArrayList<String> arrayList4 = new ArrayList<>(m18615i.size() - 1);
                    ArrayList<String> arrayList5 = new ArrayList<>(m18615i.size() - 1);
                    ArrayList<String> arrayList6 = new ArrayList<>();
                    ArrayList<String> arrayList7 = new ArrayList<>();
                    str3 = m18670c2;
                    ArrayList<String> arrayList8 = new ArrayList<>();
                    str4 = "proxyPackageVersion";
                    str5 = m18669b2;
                    int i13 = 0;
                    while (i13 < m18615i.size()) {
                        C3914j.b bVar2 = (C3914j.b) m18615i.get(i13);
                        C3934p m18623b = bVar2.m18623b();
                        if (!m18623b.m18673f().isEmpty()) {
                            str7 = str10;
                            arrayList6.add(m18623b.m18673f());
                        } else {
                            str7 = str10;
                        }
                        arrayList7.add(bVar2.m18624c());
                        if (!TextUtils.isEmpty(m18623b.m18674g())) {
                            arrayList8.add(m18623b.m18674g());
                        }
                        if (i13 > 0) {
                            arrayList4.add(((C3914j.b) m18615i.get(i13)).m18623b().m18669b());
                            arrayList5.add(((C3914j.b) m18615i.get(i13)).m18623b().m18670c());
                        }
                        i13++;
                        str10 = str7;
                    }
                    str6 = str10;
                    bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList7);
                    if (!arrayList6.isEmpty()) {
                        bundle.putStringArrayList("skuDetailsTokens", arrayList6);
                    }
                    if (!arrayList8.isEmpty()) {
                        bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList8);
                    }
                    if (!arrayList4.isEmpty()) {
                        bundle.putStringArrayList("additionalSkus", arrayList4);
                        bundle.putStringArrayList("additionalSkuTypes", arrayList5);
                    }
                }
                if (bundle.containsKey("SKU_OFFER_ID_TOKEN_LIST") && !this.f15516q) {
                    InterfaceC3944s0 interfaceC3944s06 = this.f15505f;
                    C3918k c3918k6 = AbstractC3950u0.f15655u;
                    interfaceC3944s06.mo18696a(AbstractC3941r0.m18694a(21, 2, c3918k6));
                    m18546H(c3918k6);
                    return c3918k6;
                }
                if (bVar != null && !TextUtils.isEmpty(bVar.m18623b().m18672e())) {
                    bundle.putString("skuPackageName", bVar.m18623b().m18672e());
                    str8 = null;
                    z12 = true;
                } else {
                    str8 = null;
                    z12 = false;
                }
                if (!TextUtils.isEmpty(str8)) {
                    bundle.putString("accountName", str8);
                }
                Intent intent = activity.getIntent();
                if (intent == null) {
                    str2 = str6;
                    AbstractC5856w.m30542k(str2, "Activity's intent is null.");
                } else {
                    str2 = str6;
                    if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                        String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                        bundle.putString("proxyPackage", stringExtra);
                        try {
                            str9 = str4;
                        } catch (PackageManager.NameNotFoundException unused) {
                            str9 = str4;
                        }
                        try {
                            bundle.putString(str9, this.f15504e.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                        } catch (PackageManager.NameNotFoundException unused2) {
                            bundle.putString(str9, "package not found");
                            if (!this.f15519t) {
                            }
                            if (!this.f15517r) {
                            }
                            if (!this.f15513n) {
                            }
                            m18550L = m18550L(new Callable() { // from class: com.android.billingclient.api.z

                                /* renamed from: b */
                                public final /* synthetic */ int f15677b;

                                /* renamed from: c */
                                public final /* synthetic */ String f15678c;

                                /* renamed from: d */
                                public final /* synthetic */ String f15679d;

                                /* renamed from: e */
                                public final /* synthetic */ C3914j f15680e;

                                /* renamed from: f */
                                public final /* synthetic */ Bundle f15681f;

                                public /* synthetic */ CallableC3964z(int i122, String str52, String str32, C3914j c3914j2, Bundle bundle2) {
                                    r2 = i122;
                                    r3 = str52;
                                    r4 = str32;
                                    r5 = c3914j2;
                                    r6 = bundle2;
                                }

                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    return C3898f.this.m18584P(r2, r3, r4, r5, r6);
                                }
                            }, 5000L, null, this.f15502c);
                            i11 = 78;
                            if (m18550L != null) {
                            }
                        }
                    }
                }
                if (!this.f15519t && !m18615i.isEmpty()) {
                    i122 = 17;
                } else if (!this.f15517r && z12) {
                    i122 = 15;
                } else if (!this.f15513n) {
                    i122 = 9;
                } else {
                    i122 = 6;
                }
                m18550L = m18550L(new Callable() { // from class: com.android.billingclient.api.z

                    /* renamed from: b */
                    public final /* synthetic */ int f15677b;

                    /* renamed from: c */
                    public final /* synthetic */ String f15678c;

                    /* renamed from: d */
                    public final /* synthetic */ String f15679d;

                    /* renamed from: e */
                    public final /* synthetic */ C3914j f15680e;

                    /* renamed from: f */
                    public final /* synthetic */ Bundle f15681f;

                    public /* synthetic */ CallableC3964z(int i122, String str52, String str32, C3914j c3914j2, Bundle bundle2) {
                        r2 = i122;
                        r3 = str52;
                        r4 = str32;
                        r5 = c3914j2;
                        r6 = bundle2;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return C3898f.this.m18584P(r2, r3, r4, r5, r6);
                    }
                }, 5000L, null, this.f15502c);
                i11 = 78;
            }
            try {
                if (m18550L != null) {
                    InterfaceC3944s0 interfaceC3944s07 = this.f15505f;
                    C3918k c3918k7 = AbstractC3950u0.f15647m;
                    interfaceC3944s07.mo18696a(AbstractC3941r0.m18694a(25, 2, c3918k7));
                    m18546H(c3918k7);
                    return c3918k7;
                }
                Bundle bundle2 = (Bundle) m18550L.get(5000L, TimeUnit.MILLISECONDS);
                int m30533b = AbstractC5856w.m30533b(bundle2, str2);
                String m30538g = AbstractC5856w.m30538g(bundle2, str2);
                if (m30533b != 0) {
                    AbstractC5856w.m30542k(str2, "Unable to buy item, Error response code: " + m30533b);
                    C3918k m18701a = AbstractC3950u0.m18701a(m30533b, m30538g);
                    InterfaceC3944s0 interfaceC3944s08 = this.f15505f;
                    if (bundle2 != null) {
                        i11 = 23;
                    }
                    interfaceC3944s08.mo18696a(AbstractC3941r0.m18694a(i11, 2, m18701a));
                    m18546H(m18701a);
                    return m18701a;
                }
                Intent intent2 = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
                String str12 = str;
                intent2.putExtra(str12, (PendingIntent) bundle2.getParcelable(str12));
                activity.startActivity(intent2);
                return AbstractC3950u0.f15646l;
            } catch (CancellationException e11) {
                e = e11;
                AbstractC5856w.m30543l(str2, "Time out while launching billing flow. Try to reconnect", e);
                InterfaceC3944s0 interfaceC3944s09 = this.f15505f;
                C3918k c3918k8 = AbstractC3950u0.f15648n;
                interfaceC3944s09.mo18696a(AbstractC3941r0.m18694a(4, 2, c3918k8));
                m18546H(c3918k8);
                return c3918k8;
            } catch (TimeoutException e12) {
                e = e12;
                AbstractC5856w.m30543l(str2, "Time out while launching billing flow. Try to reconnect", e);
                InterfaceC3944s0 interfaceC3944s092 = this.f15505f;
                C3918k c3918k82 = AbstractC3950u0.f15648n;
                interfaceC3944s092.mo18696a(AbstractC3941r0.m18694a(4, 2, c3918k82));
                m18546H(c3918k82);
                return c3918k82;
            } catch (Exception e13) {
                AbstractC5856w.m30543l(str2, "Exception while launching billing flow. Try to reconnect", e13);
                InterfaceC3944s0 interfaceC3944s010 = this.f15505f;
                C3918k c3918k9 = AbstractC3950u0.f15647m;
                interfaceC3944s010.mo18696a(AbstractC3941r0.m18694a(5, 2, c3918k9));
                m18546H(c3918k9);
                return c3918k9;
            }
        }
        InterfaceC3944s0 interfaceC3944s011 = this.f15505f;
        C3918k c3918k10 = AbstractC3950u0.f15634E;
        interfaceC3944s011.mo18696a(AbstractC3941r0.m18694a(12, 2, c3918k10));
        return c3918k10;
    }

    @Override // com.android.billingclient.api.AbstractC3894e
    /* renamed from: i */
    public final void mo18536i(C3952v c3952v, InterfaceC3937q interfaceC3937q) {
        if (!m18590m()) {
            InterfaceC3944s0 interfaceC3944s0 = this.f15505f;
            C3918k c3918k = AbstractC3950u0.f15647m;
            interfaceC3944s0.mo18696a(AbstractC3941r0.m18694a(2, 7, c3918k));
            interfaceC3937q.mo18684a(c3918k, new ArrayList());
            return;
        }
        if (!this.f15519t) {
            AbstractC5856w.m30542k("BillingClient", "Querying product details is not supported.");
            InterfaceC3944s0 interfaceC3944s02 = this.f15505f;
            C3918k c3918k2 = AbstractC3950u0.f15656v;
            interfaceC3944s02.mo18696a(AbstractC3941r0.m18694a(20, 7, c3918k2));
            interfaceC3937q.mo18684a(c3918k2, new ArrayList());
            return;
        }
        if (m18550L(new Callable() { // from class: com.android.billingclient.api.h2

            /* renamed from: b */
            public final /* synthetic */ C3952v f15539b;

            /* renamed from: c */
            public final /* synthetic */ InterfaceC3937q f15540c;

            public /* synthetic */ CallableC3909h2(C3952v c3952v2, InterfaceC3937q interfaceC3937q2) {
                r2 = c3952v2;
                r3 = interfaceC3937q2;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                C3898f.this.m18589Z(r2, r3);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.k2

            /* renamed from: q */
            public final /* synthetic */ InterfaceC3937q f15580q;

            public /* synthetic */ RunnableC3921k2(InterfaceC3937q interfaceC3937q2) {
                r2 = interfaceC3937q2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C3898f.this.m18582D(r2);
            }
        }, m18545G()) == null) {
            C3918k m18548J = m18548J();
            this.f15505f.mo18696a(AbstractC3941r0.m18694a(25, 7, m18548J));
            interfaceC3937q2.mo18684a(m18548J, new ArrayList());
        }
    }

    @Override // com.android.billingclient.api.AbstractC3894e
    /* renamed from: j */
    public final void mo18537j(C3955w c3955w, InterfaceC3946t interfaceC3946t) {
        m18551M(c3955w.m18717b(), interfaceC3946t);
    }

    @Override // com.android.billingclient.api.AbstractC3894e
    /* renamed from: k */
    public final void mo18538k(InterfaceC3902g interfaceC3902g) {
        if (m18590m()) {
            AbstractC5856w.m30541j("BillingClient", "Service connection is valid. No need to re-initialize.");
            this.f15505f.mo18698c(AbstractC3941r0.m18695b(6));
            interfaceC3902g.mo18592c(AbstractC3950u0.f15646l);
            return;
        }
        int i11 = 1;
        if (this.f15500a == 1) {
            AbstractC5856w.m30542k("BillingClient", "Client is already in the process of connecting to billing service.");
            InterfaceC3944s0 interfaceC3944s0 = this.f15505f;
            C3918k c3918k = AbstractC3950u0.f15638d;
            interfaceC3944s0.mo18696a(AbstractC3941r0.m18694a(37, 6, c3918k));
            interfaceC3902g.mo18592c(c3918k);
            return;
        }
        if (this.f15500a == 3) {
            AbstractC5856w.m30542k("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            InterfaceC3944s0 interfaceC3944s02 = this.f15505f;
            C3918k c3918k2 = AbstractC3950u0.f15647m;
            interfaceC3944s02.mo18696a(AbstractC3941r0.m18694a(38, 6, c3918k2));
            interfaceC3902g.mo18592c(c3918k2);
            return;
        }
        this.f15500a = 1;
        AbstractC5856w.m30541j("BillingClient", "Starting in-app billing setup.");
        this.f15507h = new ServiceConnectionC3907h0(this, interfaceC3902g, null);
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        List<ResolveInfo> queryIntentServices = this.f15504e.getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
            if (serviceInfo != null) {
                String str = serviceInfo.packageName;
                String str2 = serviceInfo.name;
                if ("com.android.vending".equals(str) && str2 != null) {
                    ComponentName componentName = new ComponentName(str, str2);
                    Intent intent2 = new Intent(intent);
                    intent2.setComponent(componentName);
                    intent2.putExtra("playBillingLibraryVersion", this.f15501b);
                    if (this.f15504e.bindService(intent2, this.f15507h, 1)) {
                        AbstractC5856w.m30541j("BillingClient", "Service was bonded successfully.");
                        return;
                    } else {
                        AbstractC5856w.m30542k("BillingClient", "Connection to Billing service is blocked.");
                        i11 = 39;
                    }
                } else {
                    AbstractC5856w.m30542k("BillingClient", "The device doesn't have valid Play Store.");
                    i11 = 40;
                }
            }
        } else {
            i11 = 41;
        }
        this.f15500a = 0;
        AbstractC5856w.m30541j("BillingClient", "Billing service unavailable on device.");
        InterfaceC3944s0 interfaceC3944s03 = this.f15505f;
        C3918k c3918k3 = AbstractC3950u0.f15637c;
        interfaceC3944s03.mo18696a(AbstractC3941r0.m18694a(i11, 6, c3918k3));
        interfaceC3902g.mo18592c(c3918k3);
    }

    /* renamed from: m */
    public final boolean m18590m() {
        return (this.f15500a != 2 || this.f15506g == null || this.f15507h == null) ? false : true;
    }

    /* renamed from: z */
    public final /* synthetic */ void m18591z(InterfaceC3886c interfaceC3886c) {
        InterfaceC3944s0 interfaceC3944s0 = this.f15505f;
        C3918k c3918k = AbstractC3950u0.f15648n;
        interfaceC3944s0.mo18696a(AbstractC3941r0.m18694a(24, 3, c3918k));
        interfaceC3886c.mo18527e(c3918k);
    }

    public C3898f(String str, C3904g1 c3904g1, Context context, InterfaceC3880a1 interfaceC3880a1, InterfaceC3944s0 interfaceC3944s0, ExecutorService executorService) {
        this.f15500a = 0;
        this.f15502c = new Handler(Looper.getMainLooper());
        this.f15510k = 0;
        this.f15501b = m18549K();
        this.f15504e = context.getApplicationContext();
        C5759f4 m30231t = C5765g4.m30231t();
        m30231t.m30224i(m18549K());
        m30231t.m30223h(this.f15504e.getPackageName());
        this.f15505f = new C3959x0(this.f15504e, (C5765g4) m30231t.m30227c());
        AbstractC5856w.m30542k("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f15503d = new C3966z1(this.f15504e, null, this.f15505f);
        this.f15524y = c3904g1;
        this.f15504e.getPackageName();
    }

    public C3898f(String str, C3904g1 c3904g1, Context context, InterfaceC3949u interfaceC3949u, InterfaceC3890d interfaceC3890d, InterfaceC3944s0 interfaceC3944s0, ExecutorService executorService) {
        String m18549K = m18549K();
        this.f15500a = 0;
        this.f15502c = new Handler(Looper.getMainLooper());
        this.f15510k = 0;
        this.f15501b = m18549K;
        m18566l(context, interfaceC3949u, c3904g1, interfaceC3890d, m18549K, null);
    }
}

package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p199h6.C19882a;
import p229i5.C20288i;
import p229i5.InterfaceC20285f;
import p230i6.AbstractC20321m;
import p230i6.AbstractC20331w;
import p230i6.InterfaceC20329u;

/* renamed from: com.google.android.gms.internal.measurement.w2 */
/* loaded from: classes.dex */
public final class C5656w2 {

    /* renamed from: j */
    private static volatile C5656w2 f32872j;

    /* renamed from: a */
    private final String f32873a;

    /* renamed from: b */
    protected final InterfaceC20285f f32874b;

    /* renamed from: c */
    protected final ExecutorService f32875c;

    /* renamed from: d */
    private final C19882a f32876d;

    /* renamed from: e */
    private final List f32877e;

    /* renamed from: f */
    private int f32878f;

    /* renamed from: g */
    private boolean f32879g;

    /* renamed from: h */
    private final String f32880h;

    /* renamed from: i */
    private volatile InterfaceC5383g1 f32881i;

    protected C5656w2(Context context, String str, String str2, String str3, Bundle bundle) {
        if (str != null && m29821m(str2, str3)) {
            this.f32873a = str;
        } else {
            this.f32873a = "FA";
        }
        this.f32874b = C20288i.m105926d();
        AbstractC5281a1.m28857a();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC5384g2(this));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f32875c = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f32876d = new C19882a(this);
        this.f32877e = new ArrayList();
        try {
            if (AbstractC20331w.m106028c(context, "google_app_id", AbstractC20321m.m106019a(context)) != null && !m29837i()) {
                this.f32880h = null;
                this.f32879g = true;
                return;
            }
        } catch (IllegalStateException unused) {
        }
        if (!m29821m(str2, str3)) {
            this.f32880h = "fa";
        } else {
            this.f32880h = str2;
        }
        m29820l(new C5638v1(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(new C5639v2(this));
    }

    /* renamed from: j */
    public final void m29818j(Exception exc, boolean z11, boolean z12) {
        this.f32879g |= z11;
        if (!z11 && z12) {
            m29831a(5, "Error with data collection. Data lost.", exc, null, null);
        }
    }

    /* renamed from: k */
    private final void m29819k(String str, String str2, Bundle bundle, boolean z11, boolean z12, Long l11) {
        m29820l(new C5435j2(this, l11, str, str2, bundle, z11, z12));
    }

    /* renamed from: l */
    public final void m29820l(AbstractRunnableC5469l2 abstractRunnableC5469l2) {
        this.f32875c.execute(abstractRunnableC5469l2);
    }

    /* renamed from: m */
    public final boolean m29821m(String str, String str2) {
        if (str2 != null && str != null && !m29837i()) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public static C5656w2 m29823t(Context context, String str, String str2, String str3, Bundle bundle) {
        AbstractC4205o.m19722k(context);
        if (f32872j == null) {
            synchronized (C5656w2.class) {
                try {
                    if (f32872j == null) {
                        f32872j = new C5656w2(context, str, str2, str3, bundle);
                    }
                } finally {
                }
            }
        }
        return f32872j;
    }

    /* renamed from: A */
    public final List m29825A(String str, String str2) {
        BinderC5315c1 binderC5315c1 = new BinderC5315c1();
        m29820l(new C5587s1(this, str, str2, binderC5315c1));
        List list = (List) BinderC5315c1.m28960W4(binderC5315c1.m28963N(5000L), List.class);
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    /* renamed from: B */
    public final Map m29826B(String str, String str2, boolean z11) {
        BinderC5315c1 binderC5315c1 = new BinderC5315c1();
        m29820l(new C5333d2(this, str, str2, z11, binderC5315c1));
        Bundle m28963N = binderC5315c1.m28963N(5000L);
        if (m28963N != null && m28963N.size() != 0) {
            HashMap hashMap = new HashMap(m28963N.size());
            for (String str3 : m28963N.keySet()) {
                Object obj = m28963N.get(str3);
                if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                    hashMap.put(str3, obj);
                }
            }
            return hashMap;
        }
        return Collections.emptyMap();
    }

    /* renamed from: F */
    public final void m29827F(String str) {
        m29820l(new C5655w1(this, str));
    }

    /* renamed from: G */
    public final void m29828G(String str, String str2, Bundle bundle) {
        m29820l(new C5570r1(this, str, str2, bundle));
    }

    /* renamed from: H */
    public final void m29829H(String str) {
        m29820l(new C5672x1(this, str));
    }

    /* renamed from: I */
    public final void m29830I(String str, String str2, Bundle bundle) {
        m29819k(str, str2, bundle, true, true, null);
    }

    /* renamed from: a */
    public final void m29831a(int i11, String str, Object obj, Object obj2, Object obj3) {
        m29820l(new C5350e2(this, false, 5, str, obj, null, null));
    }

    /* renamed from: b */
    public final void m29832b(InterfaceC20329u interfaceC20329u) {
        AbstractC4205o.m19722k(interfaceC20329u);
        synchronized (this.f32877e) {
            for (int i11 = 0; i11 < this.f32877e.size(); i11++) {
                try {
                    if (interfaceC20329u.equals(((Pair) this.f32877e.get(i11)).first)) {
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            BinderC5486m2 binderC5486m2 = new BinderC5486m2(interfaceC20329u);
            this.f32877e.add(new Pair(interfaceC20329u, binderC5486m2));
            if (this.f32881i != null) {
                try {
                    this.f32881i.registerOnMeasurementEventListener(binderC5486m2);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                }
            }
            m29820l(new C5418i2(this, binderC5486m2));
        }
    }

    /* renamed from: c */
    public final void m29833c(Bundle bundle) {
        m29820l(new C5553q1(this, bundle));
    }

    /* renamed from: d */
    public final void m29834d(Bundle bundle) {
        m29820l(new C5621u1(this, bundle));
    }

    /* renamed from: e */
    public final void m29835e(Activity activity, String str, String str2) {
        m29820l(new C5604t1(this, activity, str, str2));
    }

    /* renamed from: f */
    public final void m29836f(String str, String str2, Object obj, boolean z11) {
        m29820l(new C5452k2(this, str, str2, obj, z11));
    }

    /* renamed from: i */
    protected final boolean m29837i() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, C5656w2.class.getClassLoader());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: n */
    public final int m29838n(String str) {
        BinderC5315c1 binderC5315c1 = new BinderC5315c1();
        m29820l(new C5401h2(this, str, binderC5315c1));
        Integer num = (Integer) BinderC5315c1.m28960W4(binderC5315c1.m28963N(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    /* renamed from: o */
    public final long m29839o() {
        BinderC5315c1 binderC5315c1 = new BinderC5315c1();
        m29820l(new C5282a2(this, binderC5315c1));
        Long m28964Q = binderC5315c1.m28964Q(500L);
        if (m28964Q == null) {
            long nextLong = new Random(System.nanoTime() ^ this.f32874b.mo105913a()).nextLong();
            int i11 = this.f32878f + 1;
            this.f32878f = i11;
            return nextLong + i11;
        }
        return m28964Q.longValue();
    }

    /* renamed from: p */
    public final Bundle m29840p(Bundle bundle, boolean z11) {
        BinderC5315c1 binderC5315c1 = new BinderC5315c1();
        m29820l(new C5367f2(this, bundle, binderC5315c1));
        if (z11) {
            return binderC5315c1.m28963N(5000L);
        }
        return null;
    }

    /* renamed from: q */
    public final C19882a m29841q() {
        return this.f32876d;
    }

    /* renamed from: s */
    public final InterfaceC5383g1 m29842s(Context context, boolean z11) {
        try {
            return AbstractBinderC5366f1.asInterface(DynamiteModule.m19920e(context, DynamiteModule.f16818e, ModuleDescriptor.MODULE_ID).m19929d("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.LoadingException e11) {
            m29818j(e11, true, false);
            return null;
        }
    }

    /* renamed from: v */
    public final String m29843v() {
        return this.f32880h;
    }

    /* renamed from: w */
    public final String m29844w() {
        BinderC5315c1 binderC5315c1 = new BinderC5315c1();
        m29820l(new C5706z1(this, binderC5315c1));
        return binderC5315c1.m28961I3(50L);
    }

    /* renamed from: x */
    public final String m29845x() {
        BinderC5315c1 binderC5315c1 = new BinderC5315c1();
        m29820l(new C5316c2(this, binderC5315c1));
        return binderC5315c1.m28961I3(500L);
    }

    /* renamed from: y */
    public final String m29846y() {
        BinderC5315c1 binderC5315c1 = new BinderC5315c1();
        m29820l(new C5299b2(this, binderC5315c1));
        return binderC5315c1.m28961I3(500L);
    }

    /* renamed from: z */
    public final String m29847z() {
        BinderC5315c1 binderC5315c1 = new BinderC5315c1();
        m29820l(new C5689y1(this, binderC5315c1));
        return binderC5315c1.m28961I3(500L);
    }
}

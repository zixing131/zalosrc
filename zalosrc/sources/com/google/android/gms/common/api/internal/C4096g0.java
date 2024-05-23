package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.C4070a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC4073c;
import com.google.android.gms.common.api.C4071a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.C4175e;
import com.google.android.gms.common.internal.C4179f0;
import com.google.android.gms.common.internal.InterfaceC4176e0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import p229i5.AbstractC20284e;
import p704z4.InterfaceC31232i;
import p704z4.InterfaceC31253v;
import p704z4.InterfaceC31255x;

/* renamed from: com.google.android.gms.common.api.internal.g0 */
/* loaded from: classes2.dex */
public final class C4096g0 extends AbstractC4073c implements InterfaceC31253v {

    /* renamed from: b */
    private final Lock f16314b;

    /* renamed from: c */
    private final C4179f0 f16315c;

    /* renamed from: e */
    private final int f16317e;

    /* renamed from: f */
    private final Context f16318f;

    /* renamed from: g */
    private final Looper f16319g;

    /* renamed from: i */
    private volatile boolean f16321i;

    /* renamed from: j */
    private long f16322j;

    /* renamed from: k */
    private long f16323k;

    /* renamed from: l */
    private final HandlerC4090e0 f16324l;

    /* renamed from: m */
    private final C4070a f16325m;

    /* renamed from: n */
    zabx f16326n;

    /* renamed from: o */
    final Map f16327o;

    /* renamed from: p */
    Set f16328p;

    /* renamed from: q */
    final C4175e f16329q;

    /* renamed from: r */
    final Map f16330r;

    /* renamed from: s */
    final C4071a.a f16331s;

    /* renamed from: t */
    private final C4089e f16332t;

    /* renamed from: u */
    private final ArrayList f16333u;

    /* renamed from: v */
    private Integer f16334v;

    /* renamed from: w */
    Set f16335w;

    /* renamed from: x */
    final C4082b1 f16336x;

    /* renamed from: y */
    private final InterfaceC4176e0 f16337y;

    /* renamed from: d */
    private InterfaceC31255x f16316d = null;

    /* renamed from: h */
    final Queue f16320h = new LinkedList();

    public C4096g0(Context context, Lock lock, Looper looper, C4175e c4175e, C4070a c4070a, C4071a.a aVar, Map map, List list, List list2, Map map2, int i11, int i12, ArrayList arrayList) {
        this.f16322j = true != AbstractC20284e.m105912a() ? 120000L : 10000L;
        this.f16323k = 5000L;
        this.f16328p = new HashSet();
        this.f16332t = new C4089e();
        this.f16334v = null;
        this.f16335w = null;
        C4087d0 c4087d0 = new C4087d0(this);
        this.f16337y = c4087d0;
        this.f16318f = context;
        this.f16314b = lock;
        this.f16315c = new C4179f0(looper, c4087d0);
        this.f16319g = looper;
        this.f16324l = new HandlerC4090e0(this, looper);
        this.f16325m = c4070a;
        this.f16317e = i11;
        if (i11 >= 0) {
            this.f16334v = Integer.valueOf(i12);
        }
        this.f16330r = map;
        this.f16327o = map2;
        this.f16333u = arrayList;
        this.f16336x = new C4082b1();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f16315c.m19672f((AbstractC4073c.b) it.next());
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            this.f16315c.m19673g((AbstractC4073c.c) it2.next());
        }
        this.f16329q = c4175e;
        this.f16331s = aVar;
    }

    /* renamed from: r */
    public static int m19417r(Iterable iterable, boolean z11) {
        Iterator it = iterable.iterator();
        boolean z12 = false;
        boolean z13 = false;
        while (it.hasNext()) {
            C4071a.f fVar = (C4071a.f) it.next();
            z12 |= fVar.requiresSignIn();
            z13 |= fVar.providesSignIn();
        }
        if (z12) {
            if (z13 && z11) {
                return 2;
            }
            return 1;
        }
        return 3;
    }

    /* renamed from: t */
    static String m19418t(int i11) {
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
    }

    /* renamed from: u */
    public static /* bridge */ /* synthetic */ void m19419u(C4096g0 c4096g0) {
        c4096g0.f16314b.lock();
        try {
            if (c4096g0.f16321i) {
                c4096g0.m19422y();
            }
        } finally {
            c4096g0.f16314b.unlock();
        }
    }

    /* renamed from: v */
    public static /* bridge */ /* synthetic */ void m19420v(C4096g0 c4096g0) {
        c4096g0.f16314b.lock();
        try {
            if (c4096g0.m19428w()) {
                c4096g0.m19422y();
            }
        } finally {
            c4096g0.f16314b.unlock();
        }
    }

    /* renamed from: x */
    private final void m19421x(int i11) {
        Integer num = this.f16334v;
        if (num == null) {
            this.f16334v = Integer.valueOf(i11);
        } else if (num.intValue() != i11) {
            throw new IllegalStateException("Cannot use sign-in mode: " + m19418t(i11) + ". Mode was already set to " + m19418t(this.f16334v.intValue()));
        }
        if (this.f16316d != null) {
            return;
        }
        boolean z11 = false;
        boolean z12 = false;
        for (C4071a.f fVar : this.f16327o.values()) {
            z11 |= fVar.requiresSignIn();
            z12 |= fVar.providesSignIn();
        }
        int intValue = this.f16334v.intValue();
        if (intValue != 1) {
            if (intValue == 2 && z11) {
                this.f16316d = C4104j.m19458n(this.f16318f, this, this.f16314b, this.f16319g, this.f16325m, this.f16327o, this.f16329q, this.f16330r, this.f16331s, this.f16333u);
                return;
            }
        } else if (z11) {
            if (z12) {
                throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
        } else {
            throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
        }
        this.f16316d = new C4105j0(this.f16318f, this, this.f16314b, this.f16319g, this.f16325m, this.f16327o, this.f16329q, this.f16330r, this.f16331s, this.f16333u, this);
    }

    /* renamed from: y */
    private final void m19422y() {
        this.f16315c.m19668b();
        ((InterfaceC31255x) AbstractC4205o.m19722k(this.f16316d)).mo19470a();
    }

    @Override // p704z4.InterfaceC31253v
    /* renamed from: a */
    public final void mo19423a(Bundle bundle) {
        while (!this.f16320h.isEmpty()) {
            mo19259g((AbstractC4080b) this.f16320h.remove());
        }
        this.f16315c.m19670d(bundle);
    }

    @Override // p704z4.InterfaceC31253v
    /* renamed from: b */
    public final void mo19424b(int i11, boolean z11) {
        if (i11 == 1) {
            if (!z11 && !this.f16321i) {
                this.f16321i = true;
                if (this.f16326n == null && !AbstractC20284e.m105912a()) {
                    try {
                        this.f16326n = this.f16325m.m19209u(this.f16318f.getApplicationContext(), new C4093f0(this));
                    } catch (SecurityException unused) {
                    }
                }
                HandlerC4090e0 handlerC4090e0 = this.f16324l;
                handlerC4090e0.sendMessageDelayed(handlerC4090e0.obtainMessage(1), this.f16322j);
                HandlerC4090e0 handlerC4090e02 = this.f16324l;
                handlerC4090e02.sendMessageDelayed(handlerC4090e02.obtainMessage(2), this.f16323k);
            }
            i11 = 1;
        }
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f16336x.f16261a.toArray(new BasePendingResult[0])) {
            basePendingResult.m19280e(C4082b1.f16260c);
        }
        this.f16315c.m19671e(i11);
        this.f16315c.m19667a();
        if (i11 == 2) {
            m19422y();
        }
    }

    @Override // p704z4.InterfaceC31253v
    /* renamed from: c */
    public final void mo19425c(ConnectionResult connectionResult) {
        if (!this.f16325m.m19572k(this.f16318f, connectionResult.m19188t())) {
            m19428w();
        }
        if (!this.f16321i) {
            this.f16315c.m19669c(connectionResult);
            this.f16315c.m19667a();
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC4073c
    /* renamed from: d */
    public final void mo19256d() {
        boolean z11;
        this.f16314b.lock();
        try {
            int i11 = 2;
            boolean z12 = false;
            if (this.f16317e >= 0) {
                if (this.f16334v != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                AbstractC4205o.m19727p(z11, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.f16334v;
                if (num == null) {
                    this.f16334v = Integer.valueOf(m19417r(this.f16327o.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            int intValue = ((Integer) AbstractC4205o.m19722k(this.f16334v)).intValue();
            this.f16314b.lock();
            try {
                if (intValue != 3 && intValue != 1) {
                    if (intValue != 2) {
                        i11 = intValue;
                        AbstractC4205o.m19713b(z12, "Illegal sign-in mode: " + i11);
                        m19421x(i11);
                        m19422y();
                        this.f16314b.unlock();
                        return;
                    }
                } else {
                    i11 = intValue;
                }
                AbstractC4205o.m19713b(z12, "Illegal sign-in mode: " + i11);
                m19421x(i11);
                m19422y();
                this.f16314b.unlock();
                return;
            } finally {
                this.f16314b.unlock();
            }
            z12 = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC4073c
    /* renamed from: e */
    public final void mo19257e() {
        Lock lock;
        this.f16314b.lock();
        try {
            this.f16336x.m19349b();
            InterfaceC31255x interfaceC31255x = this.f16316d;
            if (interfaceC31255x != null) {
                interfaceC31255x.mo19473d();
            }
            this.f16332t.m19401c();
            for (AbstractC4080b abstractC4080b : this.f16320h) {
                abstractC4080b.m19286o(null);
                abstractC4080b.m19278c();
            }
            this.f16320h.clear();
            if (this.f16316d == null) {
                lock = this.f16314b;
            } else {
                m19428w();
                this.f16315c.m19667a();
                lock = this.f16314b;
            }
            lock.unlock();
        } catch (Throwable th2) {
            this.f16314b.unlock();
            throw th2;
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC4073c
    /* renamed from: f */
    public final void mo19258f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mContext=").println(this.f16318f);
        printWriter.append((CharSequence) str).append("mResuming=").print(this.f16321i);
        printWriter.append(" mWorkQueue.size()=").print(this.f16320h.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.f16336x.f16261a.size());
        InterfaceC31255x interfaceC31255x = this.f16316d;
        if (interfaceC31255x != null) {
            interfaceC31255x.mo19474e(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC4073c
    /* renamed from: g */
    public final AbstractC4080b mo19259g(AbstractC4080b abstractC4080b) {
        String str;
        Lock lock;
        C4071a m19308q = abstractC4080b.m19308q();
        boolean containsKey = this.f16327o.containsKey(abstractC4080b.m19309r());
        if (m19308q != null) {
            str = m19308q.m19229d();
        } else {
            str = "the API";
        }
        AbstractC4205o.m19713b(containsKey, "GoogleApiClient is not configured to use " + str + " required for this call.");
        this.f16314b.lock();
        try {
            InterfaceC31255x interfaceC31255x = this.f16316d;
            if (interfaceC31255x != null) {
                if (this.f16321i) {
                    this.f16320h.add(abstractC4080b);
                    while (!this.f16320h.isEmpty()) {
                        AbstractC4080b abstractC4080b2 = (AbstractC4080b) this.f16320h.remove();
                        this.f16336x.m19348a(abstractC4080b2);
                        abstractC4080b2.m19312v(Status.f16169x);
                    }
                    lock = this.f16314b;
                } else {
                    abstractC4080b = interfaceC31255x.mo19476g(abstractC4080b);
                    lock = this.f16314b;
                }
                lock.unlock();
                return abstractC4080b;
            }
            throw new IllegalStateException("GoogleApiClient is not connected yet.");
        } catch (Throwable th2) {
            this.f16314b.unlock();
            throw th2;
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC4073c
    /* renamed from: i */
    public final C4071a.f mo19260i(C4071a.c cVar) {
        C4071a.f fVar = (C4071a.f) this.f16327o.get(cVar);
        AbstractC4205o.m19723l(fVar, "Appropriate Api was not requested.");
        return fVar;
    }

    @Override // com.google.android.gms.common.api.AbstractC4073c
    /* renamed from: j */
    public final Context mo19261j() {
        return this.f16318f;
    }

    @Override // com.google.android.gms.common.api.AbstractC4073c
    /* renamed from: k */
    public final Looper mo19262k() {
        return this.f16319g;
    }

    @Override // com.google.android.gms.common.api.AbstractC4073c
    /* renamed from: l */
    public final boolean mo19263l(InterfaceC31232i interfaceC31232i) {
        InterfaceC31255x interfaceC31255x = this.f16316d;
        if (interfaceC31255x != null && interfaceC31255x.mo19471b(interfaceC31232i)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.common.api.AbstractC4073c
    /* renamed from: m */
    public final void mo19264m() {
        InterfaceC31255x interfaceC31255x = this.f16316d;
        if (interfaceC31255x != null) {
            interfaceC31255x.mo19472c();
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC4073c
    /* renamed from: n */
    public final void mo19265n(AbstractC4073c.c cVar) {
        this.f16315c.m19673g(cVar);
    }

    @Override // com.google.android.gms.common.api.AbstractC4073c
    /* renamed from: o */
    public final void mo19266o(AbstractC4073c.c cVar) {
        this.f16315c.m19674h(cVar);
    }

    /* renamed from: q */
    public final boolean m19426q() {
        InterfaceC31255x interfaceC31255x = this.f16316d;
        if (interfaceC31255x != null && interfaceC31255x.mo19475f()) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public final String m19427s() {
        StringWriter stringWriter = new StringWriter();
        mo19258f("", null, new PrintWriter(stringWriter), null);
        return stringWriter.toString();
    }

    /* renamed from: w */
    public final boolean m19428w() {
        if (!this.f16321i) {
            return false;
        }
        this.f16321i = false;
        this.f16324l.removeMessages(2);
        this.f16324l.removeMessages(1);
        zabx zabxVar = this.f16326n;
        if (zabxVar != null) {
            zabxVar.m19560b();
            this.f16326n = null;
        }
        return true;
    }
}

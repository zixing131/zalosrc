package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.C4148b;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C4071a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.C4175e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import p504s5.AbstractC26140h;
import p504s5.HandlerC26145m;
import p665y0.C30239a;
import p704z4.C31237k0;
import p704z4.InterfaceC31232i;
import p704z4.InterfaceC31255x;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.j */
/* loaded from: classes2.dex */
public final class C4104j implements InterfaceC31255x {

    /* renamed from: B */
    private final Lock f16355B;

    /* renamed from: p */
    private final Context f16357p;

    /* renamed from: q */
    private final C4096g0 f16358q;

    /* renamed from: r */
    private final Looper f16359r;

    /* renamed from: s */
    private final C4105j0 f16360s;

    /* renamed from: t */
    private final C4105j0 f16361t;

    /* renamed from: u */
    private final Map f16362u;

    /* renamed from: w */
    private final C4071a.f f16364w;

    /* renamed from: x */
    private Bundle f16365x;

    /* renamed from: v */
    private final Set f16363v = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: y */
    private ConnectionResult f16366y = null;

    /* renamed from: z */
    private ConnectionResult f16367z = null;

    /* renamed from: A */
    private boolean f16354A = false;

    /* renamed from: C */
    private int f16356C = 0;

    private C4104j(Context context, C4096g0 c4096g0, Lock lock, Looper looper, C4148b c4148b, Map map, Map map2, C4175e c4175e, C4071a.a aVar, C4071a.f fVar, ArrayList arrayList, ArrayList arrayList2, Map map3, Map map4) {
        this.f16357p = context;
        this.f16358q = c4096g0;
        this.f16355B = lock;
        this.f16359r = looper;
        this.f16364w = fVar;
        this.f16360s = new C4105j0(context, c4096g0, lock, looper, c4148b, map2, null, map4, null, arrayList2, new C4127q1(this, null));
        this.f16361t = new C4105j0(context, c4096g0, lock, looper, c4148b, map, c4175e, map3, aVar, arrayList, new C4130r1(this, null));
        C30239a c30239a = new C30239a();
        Iterator it = map2.keySet().iterator();
        while (it.hasNext()) {
            c30239a.put((C4071a.c) it.next(), this.f16360s);
        }
        Iterator it2 = map.keySet().iterator();
        while (it2.hasNext()) {
            c30239a.put((C4071a.c) it2.next(), this.f16361t);
        }
        this.f16362u = Collections.unmodifiableMap(c30239a);
    }

    /* renamed from: h */
    private final void m19452h(ConnectionResult connectionResult) {
        int i11 = this.f16356C;
        if (i11 != 1) {
            if (i11 != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.f16356C = 0;
            }
            this.f16358q.mo19425c(connectionResult);
        }
        m19453i();
        this.f16356C = 0;
    }

    /* renamed from: i */
    private final void m19453i() {
        Iterator it = this.f16363v.iterator();
        while (it.hasNext()) {
            ((InterfaceC31232i) it.next()).mo139158p2();
        }
        this.f16363v.clear();
    }

    /* renamed from: j */
    private final boolean m19454j() {
        ConnectionResult connectionResult = this.f16367z;
        if (connectionResult != null && connectionResult.m19188t() == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    private final boolean m19455k(AbstractC4080b abstractC4080b) {
        C4105j0 c4105j0 = (C4105j0) this.f16362u.get(abstractC4080b.m19309r());
        AbstractC4205o.m19723l(c4105j0, "GoogleApiClient is not configured to use the API required for this call.");
        return c4105j0.equals(this.f16361t);
    }

    /* renamed from: l */
    private static boolean m19456l(ConnectionResult connectionResult) {
        if (connectionResult != null && connectionResult.m19187M()) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public static C4104j m19458n(Context context, C4096g0 c4096g0, Lock lock, Looper looper, C4148b c4148b, Map map, C4175e c4175e, Map map2, C4071a.a aVar, ArrayList arrayList) {
        C30239a c30239a = new C30239a();
        C30239a c30239a2 = new C30239a();
        C4071a.f fVar = null;
        for (Map.Entry entry : map.entrySet()) {
            C4071a.f fVar2 = (C4071a.f) entry.getValue();
            if (true == fVar2.providesSignIn()) {
                fVar = fVar2;
            }
            if (fVar2.requiresSignIn()) {
                c30239a.put((C4071a.c) entry.getKey(), fVar2);
            } else {
                c30239a2.put((C4071a.c) entry.getKey(), fVar2);
            }
        }
        AbstractC4205o.m19727p(!c30239a.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        C30239a c30239a3 = new C30239a();
        C30239a c30239a4 = new C30239a();
        for (C4071a c4071a : map2.keySet()) {
            C4071a.c m19227b = c4071a.m19227b();
            if (c30239a.containsKey(m19227b)) {
                c30239a3.put(c4071a, (Boolean) map2.get(c4071a));
            } else if (c30239a2.containsKey(m19227b)) {
                c30239a4.put(c4071a, (Boolean) map2.get(c4071a));
            } else {
                throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            C31237k0 c31237k0 = (C31237k0) arrayList.get(i11);
            if (c30239a3.containsKey(c31237k0.f144257p)) {
                arrayList2.add(c31237k0);
            } else if (c30239a4.containsKey(c31237k0.f144257p)) {
                arrayList3.add(c31237k0);
            } else {
                throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
            }
        }
        return new C4104j(context, c4096g0, lock, looper, c4148b, c30239a, c30239a2, c4175e, aVar, fVar, arrayList2, arrayList3, c30239a3, c30239a4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public static /* bridge */ /* synthetic */ void m19465u(C4104j c4104j, int i11, boolean z11) {
        c4104j.f16358q.mo19424b(i11, z11);
        c4104j.f16367z = null;
        c4104j.f16366y = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public static /* bridge */ /* synthetic */ void m19466v(C4104j c4104j, Bundle bundle) {
        Bundle bundle2 = c4104j.f16365x;
        if (bundle2 == null) {
            c4104j.f16365x = bundle;
        } else if (bundle != null) {
            bundle2.putAll(bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public static /* bridge */ /* synthetic */ void m19467w(C4104j c4104j) {
        ConnectionResult connectionResult;
        if (m19456l(c4104j.f16366y)) {
            if (!m19456l(c4104j.f16367z) && !c4104j.m19454j()) {
                ConnectionResult connectionResult2 = c4104j.f16367z;
                if (connectionResult2 != null) {
                    if (c4104j.f16356C == 1) {
                        c4104j.m19453i();
                        return;
                    } else {
                        c4104j.m19452h(connectionResult2);
                        c4104j.f16360s.mo19473d();
                        return;
                    }
                }
                return;
            }
            int i11 = c4104j.f16356C;
            if (i11 != 1) {
                if (i11 != 2) {
                    Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                    c4104j.f16356C = 0;
                    return;
                }
                ((C4096g0) AbstractC4205o.m19722k(c4104j.f16358q)).mo19423a(c4104j.f16365x);
            }
            c4104j.m19453i();
            c4104j.f16356C = 0;
            return;
        }
        if (c4104j.f16366y != null && m19456l(c4104j.f16367z)) {
            c4104j.f16361t.mo19473d();
            c4104j.m19452h((ConnectionResult) AbstractC4205o.m19722k(c4104j.f16366y));
            return;
        }
        ConnectionResult connectionResult3 = c4104j.f16366y;
        if (connectionResult3 != null && (connectionResult = c4104j.f16367z) != null) {
            if (c4104j.f16361t.f16369B < c4104j.f16360s.f16369B) {
                connectionResult3 = connectionResult;
            }
            c4104j.m19452h(connectionResult3);
        }
    }

    /* renamed from: z */
    private final PendingIntent m19469z() {
        if (this.f16364w == null) {
            return null;
        }
        return PendingIntent.getActivity(this.f16357p, System.identityHashCode(this.f16358q), this.f16364w.getSignInIntent(), AbstractC26140h.f124370a | 134217728);
    }

    @Override // p704z4.InterfaceC31255x
    /* renamed from: a */
    public final void mo19470a() {
        this.f16356C = 2;
        this.f16354A = false;
        this.f16367z = null;
        this.f16366y = null;
        this.f16360s.mo19470a();
        this.f16361t.mo19470a();
    }

    @Override // p704z4.InterfaceC31255x
    /* renamed from: b */
    public final boolean mo19471b(InterfaceC31232i interfaceC31232i) {
        this.f16355B.lock();
        try {
            if (!m19477y()) {
                if (mo19475f()) {
                }
                this.f16355B.unlock();
                return false;
            }
            if (!this.f16361t.mo19475f()) {
                this.f16363v.add(interfaceC31232i);
                if (this.f16356C == 0) {
                    this.f16356C = 1;
                }
                this.f16367z = null;
                this.f16361t.mo19470a();
                this.f16355B.unlock();
                return true;
            }
            this.f16355B.unlock();
            return false;
        } catch (Throwable th2) {
            this.f16355B.unlock();
            throw th2;
        }
    }

    @Override // p704z4.InterfaceC31255x
    /* renamed from: c */
    public final void mo19472c() {
        this.f16355B.lock();
        try {
            boolean m19477y = m19477y();
            this.f16361t.mo19473d();
            this.f16367z = new ConnectionResult(4);
            if (m19477y) {
                new HandlerC26145m(this.f16359r).post(new RunnableC4124p1(this));
            } else {
                m19453i();
            }
            this.f16355B.unlock();
        } catch (Throwable th2) {
            this.f16355B.unlock();
            throw th2;
        }
    }

    @Override // p704z4.InterfaceC31255x
    /* renamed from: d */
    public final void mo19473d() {
        this.f16367z = null;
        this.f16366y = null;
        this.f16356C = 0;
        this.f16360s.mo19473d();
        this.f16361t.mo19473d();
        m19453i();
    }

    @Override // p704z4.InterfaceC31255x
    /* renamed from: e */
    public final void mo19474e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.f16361t.mo19474e(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.f16360s.mo19474e(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:            if (r3.f16356C == 1) goto L11;     */
    @Override // p704z4.InterfaceC31255x
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo19475f() {
        this.f16355B.lock();
        try {
            boolean z11 = false;
            if (this.f16360s.mo19475f()) {
                if (!this.f16361t.mo19475f() && !m19454j()) {
                }
                z11 = true;
            }
            return z11;
        } finally {
            this.f16355B.unlock();
        }
    }

    @Override // p704z4.InterfaceC31255x
    /* renamed from: g */
    public final AbstractC4080b mo19476g(AbstractC4080b abstractC4080b) {
        if (m19455k(abstractC4080b)) {
            if (m19454j()) {
                abstractC4080b.m19312v(new Status(4, (String) null, m19469z()));
                return abstractC4080b;
            }
            return this.f16361t.mo19476g(abstractC4080b);
        }
        return this.f16360s.mo19476g(abstractC4080b);
    }

    /* renamed from: y */
    public final boolean m19477y() {
        boolean z11;
        this.f16355B.lock();
        try {
            if (this.f16356C == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            return z11;
        } finally {
            this.f16355B.unlock();
        }
    }
}

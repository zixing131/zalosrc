package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import com.google.android.gms.common.C4070a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.AbstractC4072b;
import com.google.android.gms.common.api.AbstractC4073c;
import com.google.android.gms.common.api.C4071a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.api.internal.C4086d;
import com.google.android.gms.common.internal.AbstractC4199m;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.C4182g0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import p049c5.C3289e;
import p229i5.AbstractC20281b;
import p342m6.C22890k;
import p664y.AbstractC30228a;
import p665y0.C30239a;
import p704z4.AbstractC31254w;
import p704z4.BinderC31229g0;
import p704z4.C31218b;
import p704z4.C31257z;
import p704z4.InterfaceC31239l0;

/* renamed from: com.google.android.gms.common.api.internal.p0 */
/* loaded from: classes2.dex */
public final class C4123p0 implements AbstractC4073c.b, AbstractC4073c.c, InterfaceC31239l0 {

    /* renamed from: B */
    final /* synthetic */ C4083c f16411B;

    /* renamed from: q */
    private final C4071a.f f16413q;

    /* renamed from: r */
    private final C31218b f16414r;

    /* renamed from: s */
    private final C4113m f16415s;

    /* renamed from: v */
    private final int f16418v;

    /* renamed from: w */
    private final BinderC31229g0 f16419w;

    /* renamed from: x */
    private boolean f16420x;

    /* renamed from: p */
    private final Queue f16412p = new LinkedList();

    /* renamed from: t */
    private final Set f16416t = new HashSet();

    /* renamed from: u */
    private final Map f16417u = new HashMap();

    /* renamed from: y */
    private final List f16421y = new ArrayList();

    /* renamed from: z */
    private ConnectionResult f16422z = null;

    /* renamed from: A */
    private int f16410A = 0;

    public C4123p0(C4083c c4083c, AbstractC4072b abstractC4072b) {
        Handler handler;
        Context context;
        Handler handler2;
        this.f16411B = c4083c;
        handler = c4083c.f16271E;
        C4071a.f m19250s = abstractC4072b.m19250s(handler.getLooper(), this);
        this.f16413q = m19250s;
        this.f16414r = abstractC4072b.m19245n();
        this.f16415s = new C4113m();
        this.f16418v = abstractC4072b.m19249r();
        if (m19250s.requiresSignIn()) {
            context = c4083c.f16279v;
            handler2 = c4083c.f16271E;
            this.f16419w = abstractC4072b.m19251t(context, handler2);
            return;
        }
        this.f16419w = null;
    }

    /* renamed from: b */
    private final Feature m19509b(Feature[] featureArr) {
        if (featureArr != null && featureArr.length != 0) {
            Feature[] availableFeatures = this.f16413q.getAvailableFeatures();
            if (availableFeatures == null) {
                availableFeatures = new Feature[0];
            }
            C30239a c30239a = new C30239a(availableFeatures.length);
            for (Feature feature : availableFeatures) {
                c30239a.put(feature.m19191t(), Long.valueOf(feature.m19190F()));
            }
            for (Feature feature2 : featureArr) {
                Long l11 = (Long) c30239a.get(feature2.m19191t());
                if (l11 == null || l11.longValue() < feature2.m19190F()) {
                    return feature2;
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    private final void m19510c(ConnectionResult connectionResult) {
        Iterator it = this.f16416t.iterator();
        if (it.hasNext()) {
            AbstractC30228a.m149044a(it.next());
            if (AbstractC4199m.m19701a(connectionResult, ConnectionResult.f16136t)) {
                this.f16413q.getEndpointPackageName();
            }
            throw null;
        }
        this.f16416t.clear();
    }

    /* renamed from: d */
    public final void m19511d(Status status) {
        Handler handler;
        handler = this.f16411B.f16271E;
        AbstractC4205o.m19715d(handler);
        m19512e(status, null, false);
    }

    /* renamed from: e */
    private final void m19512e(Status status, Exception exc, boolean z11) {
        Handler handler;
        boolean z12;
        handler = this.f16411B.f16271E;
        AbstractC4205o.m19715d(handler);
        boolean z13 = true;
        if (status != null) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (exc != null) {
            z13 = false;
        }
        if (z12 != z13) {
            Iterator it = this.f16412p.iterator();
            while (it.hasNext()) {
                AbstractC4097g1 abstractC4097g1 = (AbstractC4097g1) it.next();
                if (!z11 || abstractC4097g1.f16338a == 2) {
                    if (status != null) {
                        abstractC4097g1.mo19386a(status);
                    } else {
                        abstractC4097g1.mo19387b(exc);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    /* renamed from: f */
    private final void m19513f() {
        ArrayList arrayList = new ArrayList(this.f16412p);
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            AbstractC4097g1 abstractC4097g1 = (AbstractC4097g1) arrayList.get(i11);
            if (this.f16413q.isConnected()) {
                if (m19519l(abstractC4097g1)) {
                    this.f16412p.remove(abstractC4097g1);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: g */
    public final void m19514g() {
        m19543z();
        m19510c(ConnectionResult.f16136t);
        m19518k();
        Iterator it = this.f16417u.values().iterator();
        while (it.hasNext()) {
            C31257z c31257z = (C31257z) it.next();
            if (m19509b(c31257z.f144274a.m19404c()) != null) {
                it.remove();
            } else {
                try {
                    c31257z.f144274a.mo19405d(this.f16413q, new C22890k());
                } catch (DeadObjectException unused) {
                    mo19482N(3);
                    this.f16413q.disconnect("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                    it.remove();
                }
            }
        }
        m19513f();
        m19516i();
    }

    /* renamed from: h */
    public final void m19515h(int i11) {
        Handler handler;
        Handler handler2;
        long j11;
        Handler handler3;
        Handler handler4;
        long j12;
        C4182g0 c4182g0;
        m19543z();
        this.f16420x = true;
        this.f16415s.m19496e(i11, this.f16413q.getLastDisconnectMessage());
        C4083c c4083c = this.f16411B;
        handler = c4083c.f16271E;
        handler2 = c4083c.f16271E;
        Message obtain = Message.obtain(handler2, 9, this.f16414r);
        j11 = this.f16411B.f16273p;
        handler.sendMessageDelayed(obtain, j11);
        C4083c c4083c2 = this.f16411B;
        handler3 = c4083c2.f16271E;
        handler4 = c4083c2.f16271E;
        Message obtain2 = Message.obtain(handler4, 11, this.f16414r);
        j12 = this.f16411B.f16274q;
        handler3.sendMessageDelayed(obtain2, j12);
        c4182g0 = this.f16411B.f16281x;
        c4182g0.m19687c();
        Iterator it = this.f16417u.values().iterator();
        while (it.hasNext()) {
            ((C31257z) it.next()).f144276c.run();
        }
    }

    /* renamed from: i */
    private final void m19516i() {
        Handler handler;
        Handler handler2;
        Handler handler3;
        long j11;
        handler = this.f16411B.f16271E;
        handler.removeMessages(12, this.f16414r);
        C4083c c4083c = this.f16411B;
        handler2 = c4083c.f16271E;
        handler3 = c4083c.f16271E;
        Message obtainMessage = handler3.obtainMessage(12, this.f16414r);
        j11 = this.f16411B.f16275r;
        handler2.sendMessageDelayed(obtainMessage, j11);
    }

    /* renamed from: j */
    private final void m19517j(AbstractC4097g1 abstractC4097g1) {
        abstractC4097g1.mo19389d(this.f16415s, m19537J());
        try {
            abstractC4097g1.mo19388c(this);
        } catch (DeadObjectException unused) {
            mo19482N(1);
            this.f16413q.disconnect("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    /* renamed from: k */
    private final void m19518k() {
        Handler handler;
        Handler handler2;
        if (this.f16420x) {
            handler = this.f16411B.f16271E;
            handler.removeMessages(11, this.f16414r);
            handler2 = this.f16411B.f16271E;
            handler2.removeMessages(9, this.f16414r);
            this.f16420x = false;
        }
    }

    /* renamed from: l */
    private final boolean m19519l(AbstractC4097g1 abstractC4097g1) {
        boolean z11;
        Handler handler;
        Handler handler2;
        long j11;
        Handler handler3;
        Handler handler4;
        long j12;
        Handler handler5;
        Handler handler6;
        Handler handler7;
        long j13;
        if (!(abstractC4097g1 instanceof AbstractC31254w)) {
            m19517j(abstractC4097g1);
            return true;
        }
        AbstractC31254w abstractC31254w = (AbstractC31254w) abstractC4097g1;
        Feature m19509b = m19509b(abstractC31254w.mo19397g(this));
        if (m19509b == null) {
            m19517j(abstractC4097g1);
            return true;
        }
        String name = this.f16413q.getClass().getName();
        String m19191t = m19509b.m19191t();
        long m19190F = m19509b.m19190F();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(name);
        sb2.append(" could not execute call because it requires feature (");
        sb2.append(m19191t);
        sb2.append(", ");
        sb2.append(m19190F);
        sb2.append(").");
        z11 = this.f16411B.f16272F;
        if (z11 && abstractC31254w.mo19396f(this)) {
            C4126q0 c4126q0 = new C4126q0(this.f16414r, m19509b, null);
            int indexOf = this.f16421y.indexOf(c4126q0);
            if (indexOf >= 0) {
                C4126q0 c4126q02 = (C4126q0) this.f16421y.get(indexOf);
                handler5 = this.f16411B.f16271E;
                handler5.removeMessages(15, c4126q02);
                C4083c c4083c = this.f16411B;
                handler6 = c4083c.f16271E;
                handler7 = c4083c.f16271E;
                Message obtain = Message.obtain(handler7, 15, c4126q02);
                j13 = this.f16411B.f16273p;
                handler6.sendMessageDelayed(obtain, j13);
                return false;
            }
            this.f16421y.add(c4126q0);
            C4083c c4083c2 = this.f16411B;
            handler = c4083c2.f16271E;
            handler2 = c4083c2.f16271E;
            Message obtain2 = Message.obtain(handler2, 15, c4126q0);
            j11 = this.f16411B.f16273p;
            handler.sendMessageDelayed(obtain2, j11);
            C4083c c4083c3 = this.f16411B;
            handler3 = c4083c3.f16271E;
            handler4 = c4083c3.f16271E;
            Message obtain3 = Message.obtain(handler4, 16, c4126q0);
            j12 = this.f16411B.f16274q;
            handler3.sendMessageDelayed(obtain3, j12);
            ConnectionResult connectionResult = new ConnectionResult(2, null);
            if (!m19520m(connectionResult)) {
                this.f16411B.m19383h(connectionResult, this.f16418v);
                return false;
            }
            return false;
        }
        abstractC31254w.mo19387b(new UnsupportedApiCallException(m19509b));
        return true;
    }

    /* renamed from: m */
    private final boolean m19520m(ConnectionResult connectionResult) {
        Object obj;
        C4116n c4116n;
        Set set;
        C4116n c4116n2;
        obj = C4083c.f16265I;
        synchronized (obj) {
            try {
                C4083c c4083c = this.f16411B;
                c4116n = c4083c.f16268B;
                if (c4116n != null) {
                    set = c4083c.f16269C;
                    if (set.contains(this.f16414r)) {
                        c4116n2 = this.f16411B.f16268B;
                        c4116n2.m19504s(connectionResult, this.f16418v);
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: n */
    private final boolean m19521n(boolean z11) {
        Handler handler;
        handler = this.f16411B.f16271E;
        AbstractC4205o.m19715d(handler);
        if (!this.f16413q.isConnected() || this.f16417u.size() != 0) {
            return false;
        }
        if (this.f16415s.m19498g()) {
            if (z11) {
                m19516i();
            }
            return false;
        }
        this.f16413q.disconnect("Timing out service connection.");
        return true;
    }

    /* renamed from: x */
    public static /* bridge */ /* synthetic */ void m19527x(C4123p0 c4123p0, C4126q0 c4126q0) {
        if (c4123p0.f16421y.contains(c4126q0) && !c4123p0.f16420x) {
            if (!c4123p0.f16413q.isConnected()) {
                c4123p0.m19529A();
            } else {
                c4123p0.m19513f();
            }
        }
    }

    /* renamed from: y */
    public static /* bridge */ /* synthetic */ void m19528y(C4123p0 c4123p0, C4126q0 c4126q0) {
        Handler handler;
        Handler handler2;
        Feature feature;
        Feature[] mo19397g;
        if (c4123p0.f16421y.remove(c4126q0)) {
            handler = c4123p0.f16411B.f16271E;
            handler.removeMessages(15, c4126q0);
            handler2 = c4123p0.f16411B.f16271E;
            handler2.removeMessages(16, c4126q0);
            feature = c4126q0.f16427b;
            ArrayList arrayList = new ArrayList(c4123p0.f16412p.size());
            for (AbstractC4097g1 abstractC4097g1 : c4123p0.f16412p) {
                if ((abstractC4097g1 instanceof AbstractC31254w) && (mo19397g = ((AbstractC31254w) abstractC4097g1).mo19397g(c4123p0)) != null && AbstractC20281b.m105900b(mo19397g, feature)) {
                    arrayList.add(abstractC4097g1);
                }
            }
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                AbstractC4097g1 abstractC4097g12 = (AbstractC4097g1) arrayList.get(i11);
                c4123p0.f16412p.remove(abstractC4097g12);
                abstractC4097g12.mo19387b(new UnsupportedApiCallException(feature));
            }
        }
    }

    /* renamed from: A */
    public final void m19529A() {
        Handler handler;
        C4182g0 c4182g0;
        Context context;
        handler = this.f16411B.f16271E;
        AbstractC4205o.m19715d(handler);
        if (!this.f16413q.isConnected() && !this.f16413q.isConnecting()) {
            try {
                C4083c c4083c = this.f16411B;
                c4182g0 = c4083c.f16281x;
                context = c4083c.f16279v;
                int m19686b = c4182g0.m19686b(context, this.f16413q);
                if (m19686b != 0) {
                    ConnectionResult connectionResult = new ConnectionResult(m19686b, null);
                    String name = this.f16413q.getClass().getName();
                    String obj = connectionResult.toString();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("The service for ");
                    sb2.append(name);
                    sb2.append(" is not available: ");
                    sb2.append(obj);
                    m19532D(connectionResult, null);
                    return;
                }
                C4083c c4083c2 = this.f16411B;
                C4071a.f fVar = this.f16413q;
                C4132s0 c4132s0 = new C4132s0(c4083c2, fVar, this.f16414r);
                if (fVar.requiresSignIn()) {
                    ((BinderC31229g0) AbstractC4205o.m19722k(this.f16419w)).m152108Z4(c4132s0);
                }
                try {
                    this.f16413q.connect(c4132s0);
                } catch (SecurityException e11) {
                    m19532D(new ConnectionResult(10), e11);
                }
            } catch (IllegalStateException e12) {
                m19532D(new ConnectionResult(10), e12);
            }
        }
    }

    /* renamed from: B */
    public final void m19530B(AbstractC4097g1 abstractC4097g1) {
        Handler handler;
        handler = this.f16411B.f16271E;
        AbstractC4205o.m19715d(handler);
        if (this.f16413q.isConnected()) {
            if (m19519l(abstractC4097g1)) {
                m19516i();
                return;
            } else {
                this.f16412p.add(abstractC4097g1);
                return;
            }
        }
        this.f16412p.add(abstractC4097g1);
        ConnectionResult connectionResult = this.f16422z;
        if (connectionResult != null && connectionResult.m19186K()) {
            m19532D(this.f16422z, null);
        } else {
            m19529A();
        }
    }

    /* renamed from: C */
    public final void m19531C() {
        this.f16410A++;
    }

    /* renamed from: D */
    public final void m19532D(ConnectionResult connectionResult, Exception exc) {
        Handler handler;
        C4182g0 c4182g0;
        boolean z11;
        Status m19356i;
        Status m19356i2;
        Status m19356i3;
        Handler handler2;
        Handler handler3;
        long j11;
        Handler handler4;
        Status status;
        Handler handler5;
        Handler handler6;
        handler = this.f16411B.f16271E;
        AbstractC4205o.m19715d(handler);
        BinderC31229g0 binderC31229g0 = this.f16419w;
        if (binderC31229g0 != null) {
            binderC31229g0.m152109a5();
        }
        m19543z();
        c4182g0 = this.f16411B.f16281x;
        c4182g0.m19687c();
        m19510c(connectionResult);
        if ((this.f16413q instanceof C3289e) && connectionResult.m19188t() != 24) {
            this.f16411B.f16276s = true;
            C4083c c4083c = this.f16411B;
            handler5 = c4083c.f16271E;
            handler6 = c4083c.f16271E;
            handler5.sendMessageDelayed(handler6.obtainMessage(19), 300000L);
        }
        if (connectionResult.m19188t() == 4) {
            status = C4083c.f16264H;
            m19511d(status);
            return;
        }
        if (this.f16412p.isEmpty()) {
            this.f16422z = connectionResult;
            return;
        }
        if (exc != null) {
            handler4 = this.f16411B.f16271E;
            AbstractC4205o.m19715d(handler4);
            m19512e(null, exc, false);
            return;
        }
        z11 = this.f16411B.f16272F;
        if (z11) {
            m19356i2 = C4083c.m19356i(this.f16414r, connectionResult);
            m19512e(m19356i2, null, true);
            if (!this.f16412p.isEmpty() && !m19520m(connectionResult) && !this.f16411B.m19383h(connectionResult, this.f16418v)) {
                if (connectionResult.m19188t() == 18) {
                    this.f16420x = true;
                }
                if (!this.f16420x) {
                    m19356i3 = C4083c.m19356i(this.f16414r, connectionResult);
                    m19511d(m19356i3);
                    return;
                }
                C4083c c4083c2 = this.f16411B;
                handler2 = c4083c2.f16271E;
                handler3 = c4083c2.f16271E;
                Message obtain = Message.obtain(handler3, 9, this.f16414r);
                j11 = this.f16411B.f16273p;
                handler2.sendMessageDelayed(obtain, j11);
                return;
            }
            return;
        }
        m19356i = C4083c.m19356i(this.f16414r, connectionResult);
        m19511d(m19356i);
    }

    @Override // p704z4.InterfaceC31220c
    /* renamed from: E */
    public final void mo19480E(Bundle bundle) {
        Handler handler;
        Handler handler2;
        Looper myLooper = Looper.myLooper();
        handler = this.f16411B.f16271E;
        if (myLooper != handler.getLooper()) {
            handler2 = this.f16411B.f16271E;
            handler2.post(new RunnableC4111l0(this));
        } else {
            m19514g();
        }
    }

    /* renamed from: F */
    public final void m19533F(ConnectionResult connectionResult) {
        Handler handler;
        handler = this.f16411B.f16271E;
        AbstractC4205o.m19715d(handler);
        C4071a.f fVar = this.f16413q;
        fVar.disconnect("onSignInFailed for " + fVar.getClass().getName() + " with " + String.valueOf(connectionResult));
        m19532D(connectionResult, null);
    }

    /* renamed from: G */
    public final void m19534G() {
        Handler handler;
        handler = this.f16411B.f16271E;
        AbstractC4205o.m19715d(handler);
        if (this.f16420x) {
            m19529A();
        }
    }

    /* renamed from: H */
    public final void m19535H() {
        Handler handler;
        handler = this.f16411B.f16271E;
        AbstractC4205o.m19715d(handler);
        m19511d(C4083c.f16263G);
        this.f16415s.m19497f();
        for (C4086d.a aVar : (C4086d.a[]) this.f16417u.keySet().toArray(new C4086d.a[0])) {
            m19530B(new C4094f1(aVar, new C22890k()));
        }
        m19510c(new ConnectionResult(4));
        if (this.f16413q.isConnected()) {
            this.f16413q.onUserSignOut(new C4120o0(this));
        }
    }

    /* renamed from: I */
    public final void m19536I() {
        Handler handler;
        C4070a c4070a;
        Context context;
        Status status;
        handler = this.f16411B.f16271E;
        AbstractC4205o.m19715d(handler);
        if (this.f16420x) {
            m19518k();
            C4083c c4083c = this.f16411B;
            c4070a = c4083c.f16280w;
            context = c4083c.f16279v;
            if (c4070a.mo19200i(context) == 18) {
                status = new Status(21, "Connection timed out waiting for Google Play services update to complete.");
            } else {
                status = new Status(22, "API failed to connect while resuming due to an unknown error.");
            }
            m19511d(status);
            this.f16413q.disconnect("Timing out connection while resuming.");
        }
    }

    @Override // p704z4.InterfaceC31239l0
    /* renamed from: I3 */
    public final void mo19481I3(ConnectionResult connectionResult, C4071a c4071a, boolean z11) {
        throw null;
    }

    /* renamed from: J */
    public final boolean m19537J() {
        return this.f16413q.requiresSignIn();
    }

    @Override // p704z4.InterfaceC31220c
    /* renamed from: N */
    public final void mo19482N(int i11) {
        Handler handler;
        Handler handler2;
        Looper myLooper = Looper.myLooper();
        handler = this.f16411B.f16271E;
        if (myLooper != handler.getLooper()) {
            handler2 = this.f16411B.f16271E;
            handler2.post(new RunnableC4114m0(this, i11));
        } else {
            m19515h(i11);
        }
    }

    @Override // p704z4.InterfaceC31228g
    /* renamed from: Q */
    public final void mo19443Q(ConnectionResult connectionResult) {
        m19532D(connectionResult, null);
    }

    /* renamed from: a */
    public final boolean m19538a() {
        return m19521n(true);
    }

    /* renamed from: o */
    public final int m19539o() {
        return this.f16418v;
    }

    /* renamed from: p */
    public final int m19540p() {
        return this.f16410A;
    }

    /* renamed from: r */
    public final C4071a.f m19541r() {
        return this.f16413q;
    }

    /* renamed from: t */
    public final Map m19542t() {
        return this.f16417u;
    }

    /* renamed from: z */
    public final void m19543z() {
        Handler handler;
        handler = this.f16411B.f16271E;
        AbstractC4205o.m19715d(handler);
        this.f16422z = null;
    }
}

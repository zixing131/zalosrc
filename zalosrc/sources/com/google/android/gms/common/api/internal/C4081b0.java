package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.C4148b;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C4071a;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.C4175e;
import com.google.android.gms.common.internal.InterfaceC4187i;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import p257j6.InterfaceC20935e;
import p664y.AbstractC30228a;
import p704z4.AbstractC31242n;
import p704z4.AbstractC31248q;
import p704z4.InterfaceC31246p;

/* renamed from: com.google.android.gms.common.api.internal.b0 */
/* loaded from: classes2.dex */
public final class C4081b0 implements InterfaceC31246p {

    /* renamed from: a */
    private final C4105j0 f16239a;

    /* renamed from: b */
    private final Lock f16240b;

    /* renamed from: c */
    private final Context f16241c;

    /* renamed from: d */
    private final C4148b f16242d;

    /* renamed from: e */
    private ConnectionResult f16243e;

    /* renamed from: f */
    private int f16244f;

    /* renamed from: h */
    private int f16246h;

    /* renamed from: k */
    private InterfaceC20935e f16249k;

    /* renamed from: l */
    private boolean f16250l;

    /* renamed from: m */
    private boolean f16251m;

    /* renamed from: n */
    private boolean f16252n;

    /* renamed from: o */
    private InterfaceC4187i f16253o;

    /* renamed from: p */
    private boolean f16254p;

    /* renamed from: q */
    private boolean f16255q;

    /* renamed from: r */
    private final C4175e f16256r;

    /* renamed from: s */
    private final Map f16257s;

    /* renamed from: t */
    private final C4071a.a f16258t;

    /* renamed from: g */
    private int f16245g = 0;

    /* renamed from: i */
    private final Bundle f16247i = new Bundle();

    /* renamed from: j */
    private final Set f16248j = new HashSet();

    /* renamed from: u */
    private final ArrayList f16259u = new ArrayList();

    public C4081b0(C4105j0 c4105j0, C4175e c4175e, Map map, C4148b c4148b, C4071a.a aVar, Lock lock, Context context) {
        this.f16239a = c4105j0;
        this.f16256r = c4175e;
        this.f16257s = map;
        this.f16242d = c4148b;
        this.f16258t = aVar;
        this.f16240b = lock;
        this.f16241c = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public static /* bridge */ /* synthetic */ void m19313A(C4081b0 c4081b0, zak zakVar) {
        if (!c4081b0.m19328n(0)) {
            return;
        }
        ConnectionResult m31524t = zakVar.m31524t();
        if (m31524t.m19187M()) {
            zav zavVar = (zav) AbstractC4205o.m19722k(zakVar.m31523F());
            ConnectionResult m19826t = zavVar.m19826t();
            if (!m19826t.m19187M()) {
                String valueOf = String.valueOf(m19826t);
                Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                c4081b0.m19325k(m19826t);
                return;
            }
            c4081b0.f16252n = true;
            c4081b0.f16253o = (InterfaceC4187i) AbstractC4205o.m19722k(zavVar.m19823F());
            c4081b0.f16254p = zavVar.m19824J();
            c4081b0.f16255q = zavVar.m19825K();
            c4081b0.m19327m();
            return;
        }
        if (c4081b0.m19330p(m31524t)) {
            c4081b0.m19322h();
            c4081b0.m19327m();
        } else {
            c4081b0.m19325k(m31524t);
        }
    }

    /* renamed from: I */
    private final void m19321I() {
        ArrayList arrayList = this.f16259u;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((Future) arrayList.get(i11)).cancel(true);
        }
        this.f16259u.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public final void m19322h() {
        this.f16251m = false;
        this.f16239a.f16370C.f16328p = Collections.emptySet();
        for (C4071a.c cVar : this.f16248j) {
            if (!this.f16239a.f16378v.containsKey(cVar)) {
                this.f16239a.f16378v.put(cVar, new ConnectionResult(17, null));
            }
        }
    }

    /* renamed from: i */
    private final void m19323i(boolean z11) {
        InterfaceC20935e interfaceC20935e = this.f16249k;
        if (interfaceC20935e != null) {
            if (interfaceC20935e.isConnected() && z11) {
                interfaceC20935e.mo31516a();
            }
            interfaceC20935e.disconnect();
            this.f16253o = null;
        }
    }

    /* renamed from: j */
    private final void m19324j() {
        Bundle bundle;
        this.f16239a.m19483j();
        AbstractC31248q.m152119a().execute(new RunnableC4128r(this));
        InterfaceC20935e interfaceC20935e = this.f16249k;
        if (interfaceC20935e != null) {
            if (this.f16254p) {
                interfaceC20935e.mo31518d((InterfaceC4187i) AbstractC4205o.m19722k(this.f16253o), this.f16255q);
            }
            m19323i(false);
        }
        Iterator it = this.f16239a.f16378v.keySet().iterator();
        while (it.hasNext()) {
            ((C4071a.f) AbstractC4205o.m19722k((C4071a.f) this.f16239a.f16377u.get((C4071a.c) it.next()))).disconnect();
        }
        if (this.f16247i.isEmpty()) {
            bundle = null;
        } else {
            bundle = this.f16247i;
        }
        this.f16239a.f16371D.mo19423a(bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public final void m19325k(ConnectionResult connectionResult) {
        m19321I();
        m19323i(!connectionResult.m19186K());
        this.f16239a.m19485l(connectionResult);
        this.f16239a.f16371D.mo19425c(connectionResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public final void m19326l(ConnectionResult connectionResult, C4071a c4071a, boolean z11) {
        int m19232b = c4071a.m19228c().m19232b();
        if ((!z11 || connectionResult.m19186K() || this.f16242d.m19570c(connectionResult.m19188t()) != null) && (this.f16243e == null || m19232b < this.f16244f)) {
            this.f16243e = connectionResult;
            this.f16244f = m19232b;
        }
        this.f16239a.f16378v.put(c4071a.m19227b(), connectionResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public final void m19327m() {
        if (this.f16246h != 0) {
            return;
        }
        if (!this.f16251m || this.f16252n) {
            ArrayList arrayList = new ArrayList();
            this.f16245g = 1;
            this.f16246h = this.f16239a.f16377u.size();
            for (C4071a.c cVar : this.f16239a.f16377u.keySet()) {
                if (this.f16239a.f16378v.containsKey(cVar)) {
                    if (m19329o()) {
                        m19324j();
                    }
                } else {
                    arrayList.add((C4071a.f) this.f16239a.f16377u.get(cVar));
                }
            }
            if (!arrayList.isEmpty()) {
                this.f16259u.add(AbstractC31248q.m152119a().submit(new C4140w(this, arrayList)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public final boolean m19328n(int i11) {
        if (this.f16245g != i11) {
            this.f16239a.f16370C.m19427s();
            "Unexpected callback in ".concat(toString());
            int i12 = this.f16246h;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("mRemainingConnections=");
            sb2.append(i12);
            int i13 = this.f16245g;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("GoogleApiClient connecting is in step ");
            sb3.append(m19331q(i13));
            sb3.append(" but received callback for step ");
            sb3.append(m19331q(i11));
            new Exception();
            m19325k(new ConnectionResult(8, null));
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public final boolean m19329o() {
        int i11 = this.f16246h - 1;
        this.f16246h = i11;
        if (i11 > 0) {
            return false;
        }
        if (i11 < 0) {
            this.f16239a.f16370C.m19427s();
            Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            m19325k(new ConnectionResult(8, null));
            return false;
        }
        ConnectionResult connectionResult = this.f16243e;
        if (connectionResult != null) {
            this.f16239a.f16369B = this.f16244f;
            m19325k(connectionResult);
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public final boolean m19330p(ConnectionResult connectionResult) {
        if (this.f16250l && !connectionResult.m19186K()) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    private static final String m19331q(int i11) {
        return i11 != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public static /* bridge */ /* synthetic */ Set m19338x(C4081b0 c4081b0) {
        C4175e c4175e = c4081b0.f16256r;
        if (c4175e == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(c4175e.m19653g());
        Map m19657k = c4081b0.f16256r.m19657k();
        for (C4071a c4071a : m19657k.keySet()) {
            if (!c4081b0.f16239a.f16378v.containsKey(c4071a.m19227b())) {
                AbstractC30228a.m149044a(m19657k.get(c4071a));
                throw null;
            }
        }
        return hashSet;
    }

    @Override // p704z4.InterfaceC31246p
    /* renamed from: a */
    public final void mo19341a(Bundle bundle) {
        if (!m19328n(1)) {
            return;
        }
        if (bundle != null) {
            this.f16247i.putAll(bundle);
        }
        if (m19329o()) {
            m19324j();
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [com.google.android.gms.common.api.a$f, j6.e] */
    @Override // p704z4.InterfaceC31246p
    /* renamed from: b */
    public final void mo19342b() {
        boolean z11;
        this.f16239a.f16378v.clear();
        this.f16251m = false;
        AbstractC31242n abstractC31242n = null;
        this.f16243e = null;
        this.f16245g = 0;
        this.f16250l = true;
        this.f16252n = false;
        this.f16254p = false;
        HashMap hashMap = new HashMap();
        boolean z12 = false;
        for (C4071a c4071a : this.f16257s.keySet()) {
            C4071a.f fVar = (C4071a.f) AbstractC4205o.m19722k((C4071a.f) this.f16239a.f16377u.get(c4071a.m19227b()));
            if (c4071a.m19228c().m19232b() == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 |= z11;
            boolean booleanValue = ((Boolean) this.f16257s.get(c4071a)).booleanValue();
            if (fVar.requiresSignIn()) {
                this.f16251m = true;
                if (booleanValue) {
                    this.f16248j.add(c4071a.m19227b());
                } else {
                    this.f16250l = false;
                }
            }
            hashMap.put(fVar, new C4131s(this, c4071a, booleanValue));
        }
        if (z12) {
            this.f16251m = false;
        }
        if (this.f16251m) {
            AbstractC4205o.m19722k(this.f16256r);
            AbstractC4205o.m19722k(this.f16258t);
            this.f16256r.m19658l(Integer.valueOf(System.identityHashCode(this.f16239a.f16370C)));
            C4146z c4146z = new C4146z(this, abstractC31242n);
            C4071a.a aVar = this.f16258t;
            Context context = this.f16241c;
            Looper mo19262k = this.f16239a.f16370C.mo19262k();
            C4175e c4175e = this.f16256r;
            this.f16249k = aVar.mo19230c(context, mo19262k, c4175e, c4175e.m19654h(), c4146z, c4146z);
        }
        this.f16246h = this.f16239a.f16377u.size();
        this.f16259u.add(AbstractC31248q.m152119a().submit(new C4138v(this, hashMap)));
    }

    @Override // p704z4.InterfaceC31246p
    /* renamed from: c */
    public final void mo19343c() {
    }

    @Override // p704z4.InterfaceC31246p
    /* renamed from: d */
    public final void mo19344d(ConnectionResult connectionResult, C4071a c4071a, boolean z11) {
        if (!m19328n(1)) {
            return;
        }
        m19326l(connectionResult, c4071a, z11);
        if (m19329o()) {
            m19324j();
        }
    }

    @Override // p704z4.InterfaceC31246p
    /* renamed from: e */
    public final void mo19345e(int i11) {
        m19325k(new ConnectionResult(8, null));
    }

    @Override // p704z4.InterfaceC31246p
    /* renamed from: f */
    public final boolean mo19346f() {
        m19321I();
        m19323i(true);
        this.f16239a.m19485l(null);
        return true;
    }

    @Override // p704z4.InterfaceC31246p
    /* renamed from: g */
    public final AbstractC4080b mo19347g(AbstractC4080b abstractC4080b) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }
}

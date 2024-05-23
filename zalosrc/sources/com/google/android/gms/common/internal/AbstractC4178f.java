package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.C4070a;
import com.google.android.gms.common.api.AbstractC4073c;
import com.google.android.gms.common.api.C4071a;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import p704z4.InterfaceC31220c;
import p704z4.InterfaceC31228g;

/* renamed from: com.google.android.gms.common.internal.f */
/* loaded from: classes2.dex */
public abstract class AbstractC4178f extends AbstractC4172d implements C4071a.f, InterfaceC4176e0 {

    /* renamed from: p */
    private final C4175e f16596p;

    /* renamed from: q */
    private final Set f16597q;

    /* renamed from: r */
    private final Account f16598r;

    public AbstractC4178f(Context context, Looper looper, int i11, C4175e c4175e, AbstractC4073c.b bVar, AbstractC4073c.c cVar) {
        this(context, looper, i11, c4175e, (InterfaceC31220c) bVar, (InterfaceC31228g) cVar);
    }

    /* renamed from: i */
    private final Set m19664i(Set set) {
        Set m19666h = m19666h(set);
        Iterator it = m19666h.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return m19666h;
    }

    @Override // com.google.android.gms.common.api.C4071a.f
    /* renamed from: c */
    public Set mo19233c() {
        if (requiresSignIn()) {
            return this.f16597q;
        }
        return Collections.emptySet();
    }

    /* renamed from: g */
    public final C4175e m19665g() {
        return this.f16596p;
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d
    public final Account getAccount() {
        return this.f16598r;
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d
    protected final Executor getBindServiceExecutor() {
        return null;
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d
    protected final Set getScopes() {
        return this.f16597q;
    }

    /* renamed from: h */
    protected Set m19666h(Set set) {
        return set;
    }

    public AbstractC4178f(Context context, Looper looper, int i11, C4175e c4175e, InterfaceC31220c interfaceC31220c, InterfaceC31228g interfaceC31228g) {
        this(context, looper, AbstractC4181g.m19678c(context), C4070a.m19196p(), i11, c4175e, (InterfaceC31220c) AbstractC4205o.m19722k(interfaceC31220c), (InterfaceC31228g) AbstractC4205o.m19722k(interfaceC31228g));
    }

    protected AbstractC4178f(Context context, Looper looper, AbstractC4181g abstractC4181g, C4070a c4070a, int i11, C4175e c4175e, InterfaceC31220c interfaceC31220c, InterfaceC31228g interfaceC31228g) {
        super(context, looper, abstractC4181g, c4070a, i11, interfaceC31220c == null ? null : new C4170c0(interfaceC31220c), interfaceC31228g == null ? null : new C4173d0(interfaceC31228g), c4175e.m19656j());
        this.f16596p = c4175e;
        this.f16598r = c4175e.m19647a();
        this.f16597q = m19664i(c4175e.m19650d());
    }
}

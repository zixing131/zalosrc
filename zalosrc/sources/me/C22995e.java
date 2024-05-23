package me;

import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.AbstractC1804x0;
import androidx.lifecycle.C1802w0;
import com.zing.zalo.calls.ringbacktone.presentation.C7459d;
import fn0.AbstractC19074t;
import p321le.C22450a;
import p321le.C22456g;
import p321le.C22457h;
import p321le.C22458i;
import p534u1.AbstractC26941a;

/* renamed from: me.e */
/* loaded from: classes3.dex */
public final class C22995e implements C1802w0.b {
    @Override // androidx.lifecycle.C1802w0.b
    /* renamed from: a */
    public /* synthetic */ AbstractC1796t0 mo1195a(Class cls, AbstractC26941a abstractC26941a) {
        return AbstractC1804x0.m9390b(this, cls, abstractC26941a);
    }

    @Override // androidx.lifecycle.C1802w0.b
    /* renamed from: b */
    public AbstractC1796t0 mo1196b(Class cls) {
        AbstractC19074t.m100208f(cls, "modelClass");
        if (cls.isAssignableFrom(C7459d.class)) {
            return new C7459d(new C22450a(null, 1, null), new C22458i(), new C22457h(), new C22456g(null, 1, null));
        }
        throw new IllegalArgumentException("Unknown ViewModel class: " + cls.getName());
    }
}

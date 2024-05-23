package p495rx;

import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.AbstractC1804x0;
import androidx.lifecycle.C1802w0;
import fn0.AbstractC19074t;
import p534u1.AbstractC26941a;

/* renamed from: rx.r */
/* loaded from: classes4.dex */
public final class C26004r implements C1802w0.b {

    /* renamed from: a */
    private final String f124088a;

    public C26004r(String str) {
        AbstractC19074t.m100208f(str, "conversationid");
        this.f124088a = str;
    }

    @Override // androidx.lifecycle.C1802w0.b
    /* renamed from: a */
    public /* synthetic */ AbstractC1796t0 mo1195a(Class cls, AbstractC26941a abstractC26941a) {
        return AbstractC1804x0.m9390b(this, cls, abstractC26941a);
    }

    @Override // androidx.lifecycle.C1802w0.b
    /* renamed from: b */
    public AbstractC1796t0 mo1196b(Class cls) {
        AbstractC19074t.m100208f(cls, "modelClass");
        return new C26003q(this.f124088a);
    }
}

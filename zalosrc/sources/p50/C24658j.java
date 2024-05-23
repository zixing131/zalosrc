package p50;

import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.AbstractC1804x0;
import androidx.lifecycle.C1802w0;
import com.zing.zalo.p077ui.call.settingringtone.presenter.ringtonesystemsource.C11233a;
import fn0.AbstractC19074t;
import l50.C22087i;
import l50.C22092n;
import p534u1.AbstractC26941a;

/* renamed from: p50.j */
/* loaded from: classes5.dex */
public final class C24658j implements C1802w0.b {
    @Override // androidx.lifecycle.C1802w0.b
    /* renamed from: a */
    public /* synthetic */ AbstractC1796t0 mo1195a(Class cls, AbstractC26941a abstractC26941a) {
        return AbstractC1804x0.m9390b(this, cls, abstractC26941a);
    }

    @Override // androidx.lifecycle.C1802w0.b
    /* renamed from: b */
    public AbstractC1796t0 mo1196b(Class cls) {
        AbstractC19074t.m100208f(cls, "modelClass");
        if (cls.isAssignableFrom(C11233a.class)) {
            return new C11233a(new C22087i(null, 1, null), new C22092n(null, 1, null));
        }
        throw new IllegalArgumentException("Unknown ViewModel class: " + cls.getName());
    }
}

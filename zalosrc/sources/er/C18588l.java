package er;

import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.AbstractC1804x0;
import androidx.lifecycle.C1802w0;
import fn0.AbstractC19074t;
import p534u1.AbstractC26941a;

/* renamed from: er.l */
/* loaded from: classes4.dex */
public final class C18588l implements C1802w0.b {

    /* renamed from: a */
    private final C18578b f93394a;

    public C18588l(C18578b c18578b) {
        AbstractC19074t.m100208f(c18578b, "storyArchiveRepository");
        this.f93394a = c18578b;
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
        if (cls.isAssignableFrom(C18587k.class)) {
            return new C18587k(this.f93394a);
        }
        throw new IllegalArgumentException("Unknown ViewModel class: " + cls.getName());
    }
}

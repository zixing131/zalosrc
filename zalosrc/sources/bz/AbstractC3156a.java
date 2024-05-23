package bz;

import fn0.AbstractC19074t;
import pm0.C24848g0;

/* renamed from: bz.a */
/* loaded from: classes4.dex */
public abstract class AbstractC3156a {

    /* renamed from: a */
    private a f13340a;

    /* renamed from: bz.a$a */
    /* loaded from: classes4.dex */
    public interface a extends InterfaceC3163h {
        /* renamed from: c */
        void mo15894c();

        /* renamed from: d */
        String mo15895d();

        /* renamed from: g */
        boolean mo15896g();
    }

    /* renamed from: a */
    public final String m15883a() {
        String mo15895d;
        a aVar = this.f13340a;
        if (aVar == null || (mo15895d = aVar.mo15895d()) == null) {
            return "";
        }
        return mo15895d;
    }

    /* renamed from: b */
    public final boolean m15884b() {
        a aVar = this.f13340a;
        if (aVar != null) {
            return aVar.mo15896g();
        }
        return false;
    }

    /* renamed from: c */
    public final C24848g0 m15885c(byte[] bArr, boolean z11) {
        AbstractC19074t.m100208f(bArr, "encodedData");
        a aVar = this.f13340a;
        if (aVar != null) {
            aVar.mo15928a(bArr, z11);
            return C24848g0.f119245a;
        }
        return null;
    }

    /* renamed from: d */
    public abstract void mo15886d();

    /* renamed from: e */
    public final C24848g0 m15887e() {
        a aVar = this.f13340a;
        if (aVar != null) {
            aVar.mo15894c();
            return C24848g0.f119245a;
        }
        return null;
    }

    /* renamed from: f */
    public final C24848g0 m15888f(int i11, Exception exc) {
        a aVar = this.f13340a;
        if (aVar != null) {
            aVar.mo15931f(i11, exc);
            return C24848g0.f119245a;
        }
        return null;
    }

    /* renamed from: g */
    public final C24848g0 m15889g() {
        a aVar = this.f13340a;
        if (aVar != null) {
            aVar.mo15932h();
            return C24848g0.f119245a;
        }
        return null;
    }

    /* renamed from: h */
    public final void m15890h(a aVar) {
        this.f13340a = aVar;
    }

    /* renamed from: i */
    public abstract void mo15891i();

    /* renamed from: j */
    public abstract void mo15892j();

    /* renamed from: k */
    public final C24848g0 m15893k(int i11) {
        a aVar = this.f13340a;
        if (aVar != null) {
            aVar.mo15929b(i11);
            return C24848g0.f119245a;
        }
        return null;
    }
}

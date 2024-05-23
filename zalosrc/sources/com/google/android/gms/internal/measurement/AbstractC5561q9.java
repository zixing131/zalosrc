package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.q9 */
/* loaded from: classes.dex */
public abstract class AbstractC5561q9 extends AbstractC5390g8 {

    /* renamed from: p */
    private final AbstractC5612t9 f32748p;

    /* renamed from: q */
    protected AbstractC5612t9 f32749q;

    public AbstractC5561q9(AbstractC5612t9 abstractC5612t9) {
        this.f32748p = abstractC5612t9;
        if (!abstractC5612t9.m29654x()) {
            this.f32749q = abstractC5612t9.m29650k();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    /* renamed from: g */
    private static void m29553g(Object obj, Object obj2) {
        C5342db.m29065a().m29066b(obj.getClass()).mo29156b(obj, obj2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5390g8
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ AbstractC5390g8 mo29152e(byte[] bArr, int i11, int i12) {
        m29556j(bArr, 0, i12, C5425i9.f32416c);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5390g8
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ AbstractC5390g8 mo29153f(byte[] bArr, int i11, int i12, C5425i9 c5425i9) {
        m29556j(bArr, 0, i12, c5425i9);
        return this;
    }

    /* renamed from: h */
    public final AbstractC5561q9 clone() {
        AbstractC5561q9 abstractC5561q9 = (AbstractC5561q9) this.f32748p.mo28921z(5, null, null);
        abstractC5561q9.f32749q = mo29561t();
        return abstractC5561q9;
    }

    /* renamed from: i */
    public final AbstractC5561q9 m29555i(AbstractC5612t9 abstractC5612t9) {
        if (!this.f32748p.equals(abstractC5612t9)) {
            if (!this.f32749q.m29654x()) {
                m29560n();
            }
            m29553g(this.f32749q, abstractC5612t9);
        }
        return this;
    }

    /* renamed from: j */
    public final AbstractC5561q9 m29556j(byte[] bArr, int i11, int i12, C5425i9 c5425i9) {
        if (!this.f32749q.m29654x()) {
            m29560n();
        }
        try {
            C5342db.m29065a().m29066b(this.f32749q.getClass()).mo29160f(this.f32749q, bArr, 0, i12, new C5458k8(c5425i9));
            return this;
        } catch (zzll e11) {
            throw e11;
        } catch (IOException e12) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e12);
        } catch (IndexOutOfBoundsException unused) {
            throw zzll.m30122f();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:            if (r3 != false) goto L27;     */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC5612t9 m29557k() {
        AbstractC5612t9 abstractC5612t9;
        AbstractC5612t9 mo29561t = mo29561t();
        byte byteValue = ((Byte) mo29561t.mo28921z(1, null, null)).byteValue();
        if (byteValue != 1) {
            if (byteValue != 0) {
                boolean mo29158d = C5342db.m29065a().m29066b(mo29561t.getClass()).mo29158d(mo29561t);
                if (true != mo29158d) {
                    abstractC5612t9 = null;
                } else {
                    abstractC5612t9 = mo29561t;
                }
                mo29561t.mo28921z(2, abstractC5612t9, null);
            }
            throw new zznj(mo29561t);
        }
        return mo29561t;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5630ua
    /* renamed from: l */
    public AbstractC5612t9 mo29561t() {
        if (!this.f32749q.m29654x()) {
            return this.f32749q;
        }
        this.f32749q.m29651s();
        return this.f32749q;
    }

    /* renamed from: m */
    public final void m29559m() {
        if (!this.f32749q.m29654x()) {
            m29560n();
        }
    }

    /* renamed from: n */
    protected void m29560n() {
        AbstractC5612t9 m29650k = this.f32748p.m29650k();
        m29553g(m29650k, this.f32749q);
        this.f32749q = m29650k;
    }
}

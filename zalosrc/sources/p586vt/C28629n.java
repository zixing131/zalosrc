package p586vt;

import am.InterfaceC0949z;
import fn0.AbstractC19074t;
import p586vt.AbstractC28617b;

/* renamed from: vt.n */
/* loaded from: classes4.dex */
public final class C28629n {

    /* renamed from: a */
    public static final C28629n f132725a = new C28629n();

    private C28629n() {
    }

    /* renamed from: a */
    public static final AbstractC28617b m143189a(InterfaceC0949z interfaceC0949z) {
        boolean z11;
        AbstractC28617b abstractC28617b;
        AbstractC19074t.m100208f(interfaceC0949z, "resultSet");
        String string = interfaceC0949z.getString(interfaceC0949z.getColumnIndex("param"));
        String string2 = interfaceC0949z.getString(interfaceC0949z.getColumnIndex("factory"));
        boolean z12 = false;
        if (interfaceC0949z.getInt(interfaceC0949z.getColumnIndex("result")) == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (interfaceC0949z.getInt(interfaceC0949z.getColumnIndex("show_result")) == 1) {
            z12 = true;
        }
        long j11 = interfaceC0949z.getLong(interfaceC0949z.getColumnIndex("ts"));
        int i11 = interfaceC0949z.getInt(interfaceC0949z.getColumnIndex("status"));
        String string3 = interfaceC0949z.getString(interfaceC0949z.getColumnIndex("output_data"));
        String string4 = interfaceC0949z.getString(interfaceC0949z.getColumnIndex("userid"));
        C28623h c28623h = C28623h.f132712a;
        AbstractC19074t.m100205c(string2);
        if (c28623h.m143155a(string2) != null) {
            AbstractC28617b.a m143155a = c28623h.m143155a(string2);
            if (m143155a != null) {
                abstractC28617b = m143155a.mo96991a(string);
            } else {
                abstractC28617b = null;
            }
            if (abstractC28617b != null) {
                abstractC28617b.m143136q(z12);
                abstractC28617b.m143138s(j11);
                abstractC28617b.m143135p(i11);
                AbstractC19074t.m100205c(string4);
                abstractC28617b.m143139t(string4);
                if (i11 == 2 || i11 == 4) {
                    abstractC28617b.m143137r(m143155a.mo96992b(z11, z12, string3));
                }
                return abstractC28617b;
            }
        }
        return null;
    }
}

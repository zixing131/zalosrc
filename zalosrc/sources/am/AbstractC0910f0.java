package am;

import cn0.AbstractC3601a;
import fn0.AbstractC19074t;
import mm0.AbstractC23350e;
import pm0.C24848g0;

/* renamed from: am.f0 */
/* loaded from: classes.dex */
public abstract class AbstractC0910f0 {
    /* JADX WARN: Can't wrap try/catch for region: R(13:1|2|3|(3:30|31|(8:33|6|7|8|9|10|11|12))|5|6|7|8|9|10|11|12|(3:(1:22)|(0)|(1:27))) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:            r4 = e;     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m2830a(InterfaceC0947y interfaceC0947y, String str) {
        boolean z11;
        InterfaceC0949z mo2777u;
        boolean z12;
        AbstractC19074t.m100208f(interfaceC0947y, "<this>");
        AbstractC19074t.m100208f(str, "tableName");
        try {
            mo2777u = interfaceC0947y.mo2777u("SELECT * FROM SQLITE_MASTER WHERE NAME = '" + str + "'");
        } catch (Exception e11) {
            e = e11;
            z11 = true;
        }
        try {
            if (mo2777u != null) {
                try {
                    if (mo2777u.next()) {
                        z11 = true;
                        C24848g0 c24848g0 = C24848g0.f119245a;
                        AbstractC3601a.m18219a(mo2777u, null);
                        return !z11;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    z12 = true;
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        try {
                            AbstractC3601a.m18219a(mo2777u, th);
                            throw th3;
                        } catch (Exception e12) {
                            e = e12;
                            z11 = z12;
                            AbstractC23350e.m122778h(e);
                            return !z11;
                        }
                    }
                }
            }
            C24848g0 c24848g02 = C24848g0.f119245a;
            AbstractC3601a.m18219a(mo2777u, null);
            return !z11;
        } catch (Throwable th4) {
            z12 = z11;
            th = th4;
            throw th;
        }
        z11 = false;
    }
}

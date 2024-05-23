package lj0;

import com.android.billingclient.api.C3918k;
import fn0.AbstractC19074t;

/* renamed from: lj0.a */
/* loaded from: classes7.dex */
public abstract class AbstractC22500a {
    /* renamed from: a */
    public static final int m116341a(C3918k c3918k) {
        AbstractC19074t.m100208f(c3918k, "<this>");
        return c3918k.m18652b();
    }

    /* renamed from: b */
    public static final C3918k m116342b(int i11, String str) {
        AbstractC19074t.m100208f(str, "debugMessage");
        C3918k m18653a = C3918k.m18648c().m18655c(i11).m18654b(str).m18653a();
        AbstractC19074t.m100207e(m18653a, "newBillingResult");
        return m18653a;
    }

    /* renamed from: c */
    public static /* synthetic */ C3918k m116343c(int i11, String str, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            str = "";
        }
        return m116342b(i11, str);
    }
}

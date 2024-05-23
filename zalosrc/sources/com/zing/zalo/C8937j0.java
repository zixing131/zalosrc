package com.zing.zalo;

import ac.C0708i;
import ac.C0732w;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import nh0.InterfaceC23792b;
import org.json.JSONArray;
import p173fz.C19172a;
import pm0.C24848g0;
import qm0.AbstractC25332a0;

/* renamed from: com.zing.zalo.j0 */
/* loaded from: classes.dex */
public final class C8937j0 {

    /* renamed from: a */
    public static final C8937j0 f47749a = new C8937j0();

    /* renamed from: b */
    private static InterfaceC23792b f47750b;

    private C8937j0() {
    }

    /* renamed from: a */
    private final String m47653a(String str, boolean z11) {
        if (str.length() >= 50) {
            String substring = str.substring(0, 50);
            AbstractC19074t.m100207e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return str;
    }

    /* renamed from: b */
    public static final C6917a m47654b() {
        return C6917a.Companion.m35542a();
    }

    /* renamed from: c */
    public static final C7408c m47655c() {
        return C7408c.Companion.m37629a();
    }

    /* renamed from: d */
    public static final C7920d m47656d() {
        return C7920d.Companion.m40940a();
    }

    /* renamed from: e */
    public static final C8011e m47657e() {
        return C8011e.Companion.m43185a();
    }

    /* renamed from: g */
    public static final C8019f m47658g() {
        return C8019f.Companion.m43205a();
    }

    /* renamed from: h */
    public static final C8914g m47659h() {
        return C8914g.Companion.m47589a();
    }

    /* renamed from: i */
    public static final C9274r m47660i() {
        return C9274r.Companion.m49663a();
    }

    /* renamed from: j */
    public static final C9353s m47661j() {
        return C9353s.Companion.m50396a();
    }

    /* renamed from: k */
    public static final void m47662k(InterfaceC23792b interfaceC23792b) {
        AbstractC19074t.m100208f(interfaceC23792b, "timeProvider");
        f47750b = interfaceC23792b;
    }

    /* renamed from: l */
    public static final boolean m47663l(String str) {
        boolean m131196V;
        if (C19172a.m100601l("sensitive_data_hub@enable", 0, 2, null) != 1) {
            return true;
        }
        m131196V = AbstractC25332a0.m131196V(f47749a.m47664m(C19172a.m100608s("sensitive_data_hub@block_list@source_ids", null, 2, null)), str);
        return !m131196V;
    }

    /* renamed from: m */
    private final ArrayList m47664m(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                arrayList.add(jSONArray.getString(i11));
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104548a("SensitiveDataHub", e11);
        }
        return arrayList;
    }

    /* renamed from: f */
    public final long m47665f() {
        long j11;
        InterfaceC23792b interfaceC23792b = f47750b;
        if (interfaceC23792b != null) {
            j11 = interfaceC23792b.mo124314i();
        } else {
            j11 = 0;
        }
        if (j11 == 0) {
            return System.currentTimeMillis();
        }
        return j11;
    }

    /* renamed from: n */
    public final void m47666n(String str, String str2, long j11, long j12, String str3, SensitiveExtraData sensitiveExtraData) {
        C0732w.c cVar;
        AbstractC19074t.m100208f(str, "category");
        AbstractC19074t.m100208f(str2, "sourceId");
        AbstractC19074t.m100208f(str3, "feature");
        String m47653a = m47653a(str2, true);
        String m47653a2 = m47653a(str3, false);
        if (sensitiveExtraData != null) {
            cVar = new C0732w.c();
            String jSONObject = sensitiveExtraData.m35533b().toString();
            AbstractC19074t.m100207e(jSONObject, "extraData.getExtraData().toString()");
            cVar.m1192b(jSONObject);
        } else {
            cVar = null;
        }
        C0732w m1189a = C0732w.Companion.m1189a();
        C0708i c0708i = new C0708i();
        c0708i.m1075f("category", str);
        c0708i.m1075f("feature", m47653a2);
        c0708i.m1075f("source_id", m47653a);
        c0708i.m1073d("time", j11);
        c0708i.m1073d("duration", j12);
        C24848g0 c24848g0 = C24848g0.f119245a;
        m1189a.m1187q("request_sensitive_data", "", c0708i, cVar);
    }
}

package og0;

import am.AbstractC0924m0;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p487rl.C25826g;
import tg0.C26676b;

/* renamed from: og0.c */
/* loaded from: classes7.dex */
public final class C24252c {

    /* renamed from: a */
    public static final C24252c f117152a = new C24252c();

    private C24252c() {
    }

    /* renamed from: h */
    private final void m126594h(int i11) {
        int m126598d = m126598d();
        int i12 = 0;
        for (EnumC24251b enumC24251b : EnumC24251b.values()) {
            if (!m126600f(enumC24251b) && (enumC24251b.m126592c() & i11) == enumC24251b.m126592c()) {
                i12 |= enumC24251b.m126592c();
            }
        }
        C26676b.m136957g("SMLZCloudOptIn", "setOptInFlagValue(): oldValue=" + m126598d + ", newValue=" + i11 + ", diffAddedValue=" + i12, null, 4, null);
        AbstractC0924m0.m3383Qr(i11);
        AbstractC0924m0.m3122Hr(i12);
    }

    /* renamed from: a */
    public final int m126595a(Map map) {
        AbstractC19074t.m100208f(map, "data");
        int i11 = 0;
        for (Map.Entry entry : map.entrySet()) {
            EnumC24251b enumC24251b = (EnumC24251b) entry.getKey();
            if (((C25826g) entry.getValue()).m133200a()) {
                i11 += enumC24251b.m126592c();
            }
        }
        return i11;
    }

    /* renamed from: b */
    public final List m126596b() {
        int m4164r8 = AbstractC0924m0.m4164r8();
        EnumC24251b[] values = EnumC24251b.values();
        ArrayList arrayList = new ArrayList();
        for (EnumC24251b enumC24251b : values) {
            if ((enumC24251b.m126592c() & m4164r8) == enumC24251b.m126592c()) {
                arrayList.add(enumC24251b);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public final List m126597c() {
        EnumC24251b[] values = EnumC24251b.values();
        ArrayList arrayList = new ArrayList();
        for (EnumC24251b enumC24251b : values) {
            if (m126600f(enumC24251b)) {
                arrayList.add(enumC24251b);
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public final int m126598d() {
        return AbstractC0924m0.m4340x8();
    }

    /* renamed from: e */
    public final boolean m126599e() {
        if (!m126600f(EnumC24251b.f117147r) && !m126600f(EnumC24251b.f117148s) && !m126600f(EnumC24251b.f117146q)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean m126600f(EnumC24251b enumC24251b) {
        AbstractC19074t.m100208f(enumC24251b, "feature");
        if (enumC24251b.m126592c() == (enumC24251b.m126592c() & m126598d())) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final void m126601g(EnumC24251b enumC24251b) {
        AbstractC19074t.m100208f(enumC24251b, "feature");
        if (!m126600f(enumC24251b)) {
            return;
        }
        C26676b.m136957g("SMLZCloudOptIn", "removeSupportOptInFeature(" + enumC24251b + ")", null, 4, null);
        m126594h(m126598d() - enumC24251b.m126592c());
    }

    /* renamed from: i */
    public final void m126602i() {
        C26676b.m136957g("SMLZCloudOptIn", "setSupportAllOptInFeature()", null, 4, null);
        for (EnumC24251b enumC24251b : EnumC24251b.values()) {
            f117152a.m126604k(enumC24251b);
        }
    }

    /* renamed from: j */
    public final void m126603j(int i11) {
        C26676b.m136957g("SMLZCloudOptIn", "setSupportOptInFeature(" + i11 + ")", null, 4, null);
        m126594h(i11);
    }

    /* renamed from: k */
    public final void m126604k(EnumC24251b enumC24251b) {
        AbstractC19074t.m100208f(enumC24251b, "feature");
        C26676b.m136957g("SMLZCloudOptIn", "setSupportOptInFeature(" + enumC24251b + ")", null, 4, null);
        m126594h(enumC24251b.m126592c() | m126598d());
    }
}

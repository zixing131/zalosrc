package p207he;

import ag0.C0824j;
import am.AbstractC0939u;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p062db.C7960e;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.HashMap;

/* renamed from: he.h */
/* loaded from: classes3.dex */
public final class C20014h {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private static final HashMap f98396a = new HashMap();

    /* renamed from: b */
    private static C20014h f98397b;

    /* renamed from: he.h$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C20014h m103880a() {
            if (C20014h.f98397b == null) {
                C20014h.f98397b = new C20014h();
            }
            C20014h c20014h = C20014h.f98397b;
            AbstractC19074t.m100205c(c20014h);
            return c20014h;
        }
    }

    /* renamed from: he.h$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ ContactProfile f98398a;

        b(ContactProfile contactProfile) {
            this.f98398a = contactProfile;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            try {
                C7960e.m41971c6().m42407h(this.f98398a);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: c */
    public final ContactProfile m103878c(String str) {
        HashMap hashMap;
        ContactProfile contactProfile;
        AbstractC19074t.m100208f(str, "oaId");
        ContactProfile contactProfile2 = null;
        try {
            hashMap = f98396a;
            contactProfile = (ContactProfile) hashMap.get(str);
        } catch (Exception e11) {
            e = e11;
        }
        if (contactProfile == null) {
            try {
                contactProfile2 = C7960e.m41971c6().m42603z6(str);
                if (contactProfile2 != null) {
                    hashMap.put(str, contactProfile2);
                }
            } catch (Exception e12) {
                e = e12;
                contactProfile2 = contactProfile;
                e.printStackTrace();
                return contactProfile2;
            }
            return contactProfile2;
        }
        return contactProfile;
    }

    /* renamed from: d */
    public final void m103879d(String str, ContactProfile contactProfile) {
        AbstractC19074t.m100208f(str, "oaId");
        AbstractC19074t.m100208f(contactProfile, "oaProfile");
        try {
            f98396a.put(str, contactProfile);
            C0824j.m2153b(new b(contactProfile));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}

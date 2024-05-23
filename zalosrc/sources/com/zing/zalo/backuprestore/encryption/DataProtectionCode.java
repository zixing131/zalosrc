package com.zing.zalo.backuprestore.encryption;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import org.json.JSONObject;
import p320ld.C22430b;
import qn0.InterfaceC25392g;
import rn0.AbstractC25935a;
import sc.C26220b;
import sg0.C26245a;
import tn0.AbstractC26774a1;
import tn0.AbstractC26805k1;
import un0.AbstractC27323a;

@InterfaceC25392g
/* loaded from: classes3.dex */
public final class DataProtectionCode {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final int f40037a;

    /* renamed from: b */
    private final String f40038b;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final DataProtectionCode m37265a(String str) {
            AbstractC19074t.m100208f(str, "jsonStr");
            if (str.length() == 0) {
                return null;
            }
            try {
                AbstractC27323a m115866a = C22430b.f109737a.m115866a();
                m115866a.mo131586a();
                return (DataProtectionCode) m115866a.m139867d(AbstractC25935a.m133630u(DataProtectionCode.Companion.serializer()), str);
            } catch (Exception e11) {
                C26220b.m134819b(e11);
                return null;
            }
        }

        public final KSerializer serializer() {
            return DataProtectionCode$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DataProtectionCode(int i11, int i12, String str, AbstractC26805k1 abstractC26805k1) {
        if (3 != (i11 & 3)) {
            AbstractC26774a1.m137800b(i11, 3, DataProtectionCode$$serializer.INSTANCE.getDescriptor());
        }
        this.f40037a = i12;
        this.f40038b = str;
    }

    /* renamed from: e */
    public static final /* synthetic */ void m37260e(DataProtectionCode dataProtectionCode, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        interfaceC21886d.mo114033x(serialDescriptor, 0, dataProtectionCode.f40037a);
        interfaceC21886d.mo114035z(serialDescriptor, 1, dataProtectionCode.f40038b);
    }

    /* renamed from: a */
    public final String m37261a() {
        return this.f40038b;
    }

    /* renamed from: b */
    public final int m37262b() {
        return this.f40037a;
    }

    /* renamed from: c */
    public final JSONObject m37263c() {
        try {
            AbstractC27323a m115866a = C22430b.f109737a.m115866a();
            m115866a.mo131586a();
            return new JSONObject(m115866a.mo131597b(Companion.serializer(), this));
        } catch (Exception e11) {
            C26220b.m134819b(e11);
            return new JSONObject();
        }
    }

    /* renamed from: d */
    public final String m37264d() {
        String jSONObject = m37263c().toString();
        AbstractC19074t.m100207e(jSONObject, "toString(...)");
        return jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataProtectionCode)) {
            return false;
        }
        DataProtectionCode dataProtectionCode = (DataProtectionCode) obj;
        return this.f40037a == dataProtectionCode.f40037a && AbstractC19074t.m100204b(this.f40038b, dataProtectionCode.f40038b);
    }

    public int hashCode() {
        return (this.f40037a * 31) + this.f40038b.hashCode();
    }

    public String toString() {
        return "DataProtectionCode(type=" + this.f40037a + ", code='" + C26245a.f124654a.m134956q(this.f40038b) + "')";
    }

    public DataProtectionCode(int i11, String str) {
        AbstractC19074t.m100208f(str, "code");
        this.f40037a = i11;
        this.f40038b = str;
    }
}

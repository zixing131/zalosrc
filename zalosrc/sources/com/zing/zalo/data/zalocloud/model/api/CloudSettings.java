package com.zing.zalo.data.zalocloud.model.api;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import org.json.JSONObject;
import p613wl.C29085a;
import qn0.InterfaceC25392g;
import rn0.AbstractC25935a;
import tg0.C26676b;
import tn0.AbstractC26774a1;
import tn0.AbstractC26805k1;
import un0.AbstractC27323a;

@InterfaceC25392g
/* loaded from: classes3.dex */
public final class CloudSettings {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final int f43048a;

    /* renamed from: b */
    private final int f43049b;

    /* renamed from: c */
    private final int f43050c;

    /* renamed from: d */
    private final int f43051d;

    /* renamed from: e */
    private final int f43052e;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final CloudSettings m41315a(String str) {
            AbstractC19074t.m100208f(str, "jsonStr");
            if (str.length() == 0) {
                return null;
            }
            try {
                AbstractC27323a m145315b = C29085a.f134890a.m145315b();
                m145315b.mo131586a();
                return (CloudSettings) m145315b.m139867d(AbstractC25935a.m133630u(CloudSettings.Companion.serializer()), str);
            } catch (Exception e11) {
                C26676b.m136953c(e11);
                return null;
            }
        }

        public final KSerializer serializer() {
            return CloudSettings$$serializer.INSTANCE;
        }
    }

    public CloudSettings(int i11, int i12, int i13, int i14, int i15) {
        this.f43048a = i11;
        this.f43049b = i12;
        this.f43050c = i13;
        this.f43051d = i14;
        this.f43052e = i15;
    }

    /* renamed from: j */
    public static final /* synthetic */ void m41305j(CloudSettings cloudSettings, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        interfaceC21886d.mo114033x(serialDescriptor, 0, cloudSettings.f43048a);
        interfaceC21886d.mo114033x(serialDescriptor, 1, cloudSettings.f43049b);
        interfaceC21886d.mo114033x(serialDescriptor, 2, cloudSettings.f43050c);
        interfaceC21886d.mo114033x(serialDescriptor, 3, cloudSettings.f43051d);
        interfaceC21886d.mo114033x(serialDescriptor, 4, cloudSettings.f43052e);
    }

    /* renamed from: a */
    public final int m41306a() {
        return this.f43049b;
    }

    /* renamed from: b */
    public final int m41307b() {
        return this.f43051d;
    }

    /* renamed from: c */
    public final int m41308c() {
        return this.f43052e;
    }

    /* renamed from: d */
    public final int m41309d() {
        return this.f43050c;
    }

    /* renamed from: e */
    public final int m41310e() {
        return this.f43048a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CloudSettings)) {
            return false;
        }
        CloudSettings cloudSettings = (CloudSettings) obj;
        return this.f43048a == cloudSettings.f43048a && this.f43049b == cloudSettings.f43049b && this.f43050c == cloudSettings.f43050c && this.f43051d == cloudSettings.f43051d && this.f43052e == cloudSettings.f43052e;
    }

    /* renamed from: f */
    public final boolean m41311f() {
        return this.f43052e == 1;
    }

    /* renamed from: g */
    public final boolean m41312g() {
        return this.f43048a >= 0;
    }

    /* renamed from: h */
    public final JSONObject m41313h() {
        try {
            AbstractC27323a m145315b = C29085a.f134890a.m145315b();
            m145315b.mo131586a();
            return new JSONObject(m145315b.mo131597b(Companion.serializer(), this));
        } catch (Exception e11) {
            C26676b.m136953c(e11);
            return new JSONObject();
        }
    }

    public int hashCode() {
        return (((((((this.f43048a * 31) + this.f43049b) * 31) + this.f43050c) * 31) + this.f43051d) * 31) + this.f43052e;
    }

    /* renamed from: i */
    public final String m41314i() {
        String jSONObject = m41313h().toString();
        AbstractC19074t.m100207e(jSONObject, "toString(...)");
        return jSONObject;
    }

    public String toString() {
        return "CloudSettings(optInFlag=" + this.f43048a + ", cloudMediaSizeLimit=" + this.f43049b + ", myCloudSizeLimit=" + this.f43050c + ", enableCommunity=" + this.f43051d + ", enableOffload=" + this.f43052e + ")";
    }

    public /* synthetic */ CloudSettings(int i11, int i12, int i13, int i14, int i15, int i16, AbstractC26805k1 abstractC26805k1) {
        if (31 != (i11 & 31)) {
            AbstractC26774a1.m137800b(i11, 31, CloudSettings$$serializer.INSTANCE.getDescriptor());
        }
        this.f43048a = i12;
        this.f43049b = i13;
        this.f43050c = i14;
        this.f43051d = i15;
        this.f43052e = i16;
    }
}

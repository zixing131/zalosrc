package com.zing.zalo.data.zalocloud.model.api;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.List;
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
import tn0.C26788f;
import tn0.C26814n1;
import un0.AbstractC27323a;

@InterfaceC25392g
/* loaded from: classes3.dex */
public final class CloudUrlPattern {
    public static final Companion Companion = new Companion(null);

    /* renamed from: d */
    private static final KSerializer[] f43063d;

    /* renamed from: a */
    private final List f43064a;

    /* renamed from: b */
    private final List f43065b;

    /* renamed from: c */
    private final List f43066c;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final CloudUrlPattern m41330a(String str) {
            AbstractC19074t.m100208f(str, "jsonStr");
            if (str.length() == 0) {
                return null;
            }
            try {
                AbstractC27323a m145315b = C29085a.f134890a.m145315b();
                m145315b.mo131586a();
                return (CloudUrlPattern) m145315b.m139867d(AbstractC25935a.m133630u(CloudUrlPattern.Companion.serializer()), str);
            } catch (Exception e11) {
                C26676b.m136953c(e11);
                return null;
            }
        }

        public final KSerializer serializer() {
            return CloudUrlPattern$$serializer.INSTANCE;
        }
    }

    static {
        C26814n1 c26814n1 = C26814n1.f127034a;
        f43063d = new KSerializer[]{new C26788f(c26814n1), new C26788f(c26814n1), new C26788f(c26814n1)};
    }

    public /* synthetic */ CloudUrlPattern(int i11, List list, List list2, List list3, AbstractC26805k1 abstractC26805k1) {
        if (7 != (i11 & 7)) {
            AbstractC26774a1.m137800b(i11, 7, CloudUrlPattern$$serializer.INSTANCE.getDescriptor());
        }
        this.f43064a = list;
        this.f43065b = list2;
        this.f43066c = list3;
    }

    /* renamed from: f */
    public static final /* synthetic */ void m41325f(CloudUrlPattern cloudUrlPattern, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f43063d;
        interfaceC21886d.mo114029i(serialDescriptor, 0, kSerializerArr[0], cloudUrlPattern.f43064a);
        interfaceC21886d.mo114029i(serialDescriptor, 1, kSerializerArr[1], cloudUrlPattern.f43065b);
        interfaceC21886d.mo114029i(serialDescriptor, 2, kSerializerArr[2], cloudUrlPattern.f43066c);
    }

    /* renamed from: b */
    public final List m41326b() {
        return this.f43065b;
    }

    /* renamed from: c */
    public final List m41327c() {
        return this.f43064a;
    }

    /* renamed from: d */
    public final JSONObject m41328d() {
        try {
            AbstractC27323a m145315b = C29085a.f134890a.m145315b();
            m145315b.mo131586a();
            return new JSONObject(m145315b.mo131597b(Companion.serializer(), this));
        } catch (Exception e11) {
            C26676b.m136953c(e11);
            return new JSONObject();
        }
    }

    /* renamed from: e */
    public final String m41329e() {
        String jSONObject = m41328d().toString();
        AbstractC19074t.m100207e(jSONObject, "toString(...)");
        return jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CloudUrlPattern)) {
            return false;
        }
        CloudUrlPattern cloudUrlPattern = (CloudUrlPattern) obj;
        return AbstractC19074t.m100204b(this.f43064a, cloudUrlPattern.f43064a) && AbstractC19074t.m100204b(this.f43065b, cloudUrlPattern.f43065b) && AbstractC19074t.m100204b(this.f43066c, cloudUrlPattern.f43066c);
    }

    public int hashCode() {
        return (((this.f43064a.hashCode() * 31) + this.f43065b.hashCode()) * 31) + this.f43066c.hashCode();
    }

    public String toString() {
        return "CloudUrlPattern(photo=" + this.f43064a + ", file=" + this.f43065b + ", voice=" + this.f43066c + ")";
    }
}

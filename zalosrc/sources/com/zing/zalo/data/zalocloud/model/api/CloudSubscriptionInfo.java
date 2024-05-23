package com.zing.zalo.data.zalocloud.model.api;

import androidx.work.AbstractC2147g0;
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
public final class CloudSubscriptionInfo {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final String f43053a;

    /* renamed from: b */
    private final String f43054b;

    /* renamed from: c */
    private final long f43055c;

    /* renamed from: d */
    private final String f43056d;

    /* renamed from: e */
    private final long f43057e;

    /* renamed from: f */
    private final int f43058f;

    /* renamed from: g */
    private final int f43059g;

    /* renamed from: h */
    private final long f43060h;

    /* renamed from: i */
    private final int f43061i;

    /* renamed from: j */
    private final String f43062j;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final CloudSubscriptionInfo m41323a(String str) {
            AbstractC19074t.m100208f(str, "jsonStr");
            if (str.length() == 0) {
                return null;
            }
            try {
                AbstractC27323a m145315b = C29085a.f134890a.m145315b();
                m145315b.mo131586a();
                return (CloudSubscriptionInfo) m145315b.m139867d(AbstractC25935a.m133630u(CloudSubscriptionInfo.Companion.serializer()), str);
            } catch (Exception e11) {
                C26676b.m136953c(e11);
                return null;
            }
        }

        public final KSerializer serializer() {
            return CloudSubscriptionInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CloudSubscriptionInfo(int i11, String str, String str2, long j11, String str3, long j12, int i12, int i13, long j13, int i14, String str4, AbstractC26805k1 abstractC26805k1) {
        if (1023 != (i11 & 1023)) {
            AbstractC26774a1.m137800b(i11, 1023, CloudSubscriptionInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.f43053a = str;
        this.f43054b = str2;
        this.f43055c = j11;
        this.f43056d = str3;
        this.f43057e = j12;
        this.f43058f = i12;
        this.f43059g = i13;
        this.f43060h = j13;
        this.f43061i = i14;
        this.f43062j = str4;
    }

    /* renamed from: g */
    public static final /* synthetic */ void m41316g(CloudSubscriptionInfo cloudSubscriptionInfo, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        interfaceC21886d.mo114035z(serialDescriptor, 0, cloudSubscriptionInfo.f43053a);
        interfaceC21886d.mo114035z(serialDescriptor, 1, cloudSubscriptionInfo.f43054b);
        interfaceC21886d.mo114022E(serialDescriptor, 2, cloudSubscriptionInfo.f43055c);
        interfaceC21886d.mo114035z(serialDescriptor, 3, cloudSubscriptionInfo.f43056d);
        interfaceC21886d.mo114022E(serialDescriptor, 4, cloudSubscriptionInfo.f43057e);
        interfaceC21886d.mo114033x(serialDescriptor, 5, cloudSubscriptionInfo.f43058f);
        interfaceC21886d.mo114033x(serialDescriptor, 6, cloudSubscriptionInfo.f43059g);
        interfaceC21886d.mo114022E(serialDescriptor, 7, cloudSubscriptionInfo.f43060h);
        interfaceC21886d.mo114033x(serialDescriptor, 8, cloudSubscriptionInfo.f43061i);
        interfaceC21886d.mo114035z(serialDescriptor, 9, cloudSubscriptionInfo.f43062j);
    }

    /* renamed from: a */
    public final long m41317a() {
        return this.f43057e;
    }

    /* renamed from: b */
    public final String m41318b() {
        return this.f43056d;
    }

    /* renamed from: c */
    public final long m41319c() {
        return this.f43055c;
    }

    /* renamed from: d */
    public final long m41320d() {
        return this.f43060h;
    }

    /* renamed from: e */
    public final JSONObject m41321e() {
        try {
            AbstractC27323a m145315b = C29085a.f134890a.m145315b();
            m145315b.mo131586a();
            return new JSONObject(m145315b.mo131597b(Companion.serializer(), this));
        } catch (Exception e11) {
            C26676b.m136953c(e11);
            return new JSONObject();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CloudSubscriptionInfo)) {
            return false;
        }
        CloudSubscriptionInfo cloudSubscriptionInfo = (CloudSubscriptionInfo) obj;
        return AbstractC19074t.m100204b(this.f43053a, cloudSubscriptionInfo.f43053a) && AbstractC19074t.m100204b(this.f43054b, cloudSubscriptionInfo.f43054b) && this.f43055c == cloudSubscriptionInfo.f43055c && AbstractC19074t.m100204b(this.f43056d, cloudSubscriptionInfo.f43056d) && this.f43057e == cloudSubscriptionInfo.f43057e && this.f43058f == cloudSubscriptionInfo.f43058f && this.f43059g == cloudSubscriptionInfo.f43059g && this.f43060h == cloudSubscriptionInfo.f43060h && this.f43061i == cloudSubscriptionInfo.f43061i && AbstractC19074t.m100204b(this.f43062j, cloudSubscriptionInfo.f43062j);
    }

    /* renamed from: f */
    public final String m41322f() {
        String jSONObject = m41321e().toString();
        AbstractC19074t.m100207e(jSONObject, "toString(...)");
        return jSONObject;
    }

    public int hashCode() {
        return (((((((((((((((((this.f43053a.hashCode() * 31) + this.f43054b.hashCode()) * 31) + AbstractC2147g0.m11521a(this.f43055c)) * 31) + this.f43056d.hashCode()) * 31) + AbstractC2147g0.m11521a(this.f43057e)) * 31) + this.f43058f) * 31) + this.f43059g) * 31) + AbstractC2147g0.m11521a(this.f43060h)) * 31) + this.f43061i) * 31) + this.f43062j.hashCode();
    }

    public String toString() {
        return "CloudSubscriptionInfo(autoRenewProductId=" + this.f43053a + ", productID=" + this.f43054b + ", subscriptionTime=" + this.f43055c + ", originTransID=" + this.f43056d + ", expireTime=" + this.f43057e + ", subscriptionGw=" + this.f43058f + ", status=" + this.f43059g + ", totalCloud=" + this.f43060h + ", durationMonths=" + this.f43061i + ", price=" + this.f43062j + ")";
    }
}

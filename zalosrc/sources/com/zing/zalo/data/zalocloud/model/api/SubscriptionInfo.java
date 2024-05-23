package com.zing.zalo.data.zalocloud.model.api;

import androidx.work.AbstractC2147g0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import p348mi.AbstractC23306f;
import qn0.InterfaceC25392g;
import tn0.AbstractC26774a1;
import tn0.AbstractC26805k1;

@InterfaceC25392g
/* loaded from: classes3.dex */
public final class SubscriptionInfo {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final String f43124a;

    /* renamed from: b */
    private final String f43125b;

    /* renamed from: c */
    private final long f43126c;

    /* renamed from: d */
    private final String f43127d;

    /* renamed from: e */
    private final long f43128e;

    /* renamed from: f */
    private final int f43129f;

    /* renamed from: g */
    private final int f43130g;

    /* renamed from: h */
    private final long f43131h;

    /* renamed from: i */
    private final int f43132i;

    /* renamed from: j */
    private final String f43133j;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return SubscriptionInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SubscriptionInfo(int i11, String str, String str2, long j11, String str3, long j12, int i12, int i13, long j13, int i14, String str4, AbstractC26805k1 abstractC26805k1) {
        if (1023 != (i11 & 1023)) {
            AbstractC26774a1.m137800b(i11, 1023, SubscriptionInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.f43124a = str;
        this.f43125b = str2;
        this.f43126c = j11;
        this.f43127d = str3;
        this.f43128e = j12;
        this.f43129f = i12;
        this.f43130g = i13;
        this.f43131h = j13;
        this.f43132i = i14;
        this.f43133j = str4;
    }

    /* renamed from: c */
    public static final /* synthetic */ void m41386c(SubscriptionInfo subscriptionInfo, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        interfaceC21886d.mo114035z(serialDescriptor, 0, subscriptionInfo.f43124a);
        interfaceC21886d.mo114035z(serialDescriptor, 1, subscriptionInfo.f43125b);
        interfaceC21886d.mo114022E(serialDescriptor, 2, subscriptionInfo.f43126c);
        interfaceC21886d.mo114035z(serialDescriptor, 3, subscriptionInfo.f43127d);
        interfaceC21886d.mo114022E(serialDescriptor, 4, subscriptionInfo.f43128e);
        interfaceC21886d.mo114033x(serialDescriptor, 5, subscriptionInfo.f43129f);
        interfaceC21886d.mo114033x(serialDescriptor, 6, subscriptionInfo.f43130g);
        interfaceC21886d.mo114022E(serialDescriptor, 7, subscriptionInfo.f43131h);
        interfaceC21886d.mo114033x(serialDescriptor, 8, subscriptionInfo.f43132i);
        interfaceC21886d.mo114035z(serialDescriptor, 9, subscriptionInfo.f43133j);
    }

    /* renamed from: a */
    public final boolean m41387a() {
        String str;
        CloudSubscriptionInfo m2458h = AbstractC23306f.m120691m2().m2458h();
        if (m2458h != null) {
            str = m2458h.m41318b();
        } else {
            str = null;
        }
        boolean z11 = !AbstractC19074t.m100204b(str, this.f43127d);
        AbstractC23306f.m120691m2().m2469t(this);
        return z11;
    }

    /* renamed from: b */
    public final boolean m41388b() {
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscriptionInfo)) {
            return false;
        }
        SubscriptionInfo subscriptionInfo = (SubscriptionInfo) obj;
        return AbstractC19074t.m100204b(this.f43124a, subscriptionInfo.f43124a) && AbstractC19074t.m100204b(this.f43125b, subscriptionInfo.f43125b) && this.f43126c == subscriptionInfo.f43126c && AbstractC19074t.m100204b(this.f43127d, subscriptionInfo.f43127d) && this.f43128e == subscriptionInfo.f43128e && this.f43129f == subscriptionInfo.f43129f && this.f43130g == subscriptionInfo.f43130g && this.f43131h == subscriptionInfo.f43131h && this.f43132i == subscriptionInfo.f43132i && AbstractC19074t.m100204b(this.f43133j, subscriptionInfo.f43133j);
    }

    public int hashCode() {
        return (((((((((((((((((this.f43124a.hashCode() * 31) + this.f43125b.hashCode()) * 31) + AbstractC2147g0.m11521a(this.f43126c)) * 31) + this.f43127d.hashCode()) * 31) + AbstractC2147g0.m11521a(this.f43128e)) * 31) + this.f43129f) * 31) + this.f43130g) * 31) + AbstractC2147g0.m11521a(this.f43131h)) * 31) + this.f43132i) * 31) + this.f43133j.hashCode();
    }

    public String toString() {
        return "SubscriptionInfo(autoRenewProductId=" + this.f43124a + ", productId=" + this.f43125b + ", subscriptionTime=" + this.f43126c + ", originTransId=" + this.f43127d + ", expireTime=" + this.f43128e + ", subscriptionGw=" + this.f43129f + ", status=" + this.f43130g + ", totalCloud=" + this.f43131h + ", durationMonths=" + this.f43132i + ", price=" + this.f43133j + ")";
    }
}

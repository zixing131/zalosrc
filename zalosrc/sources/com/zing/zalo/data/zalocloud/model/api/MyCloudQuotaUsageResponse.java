package com.zing.zalo.data.zalocloud.model.api;

import androidx.work.AbstractC2147g0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import qn0.InterfaceC25392g;
import tn0.AbstractC26774a1;
import tn0.AbstractC26805k1;

@InterfaceC25392g
/* loaded from: classes3.dex */
public final class MyCloudQuotaUsageResponse {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final int f43104a;

    /* renamed from: b */
    private final long f43105b;

    /* renamed from: c */
    private final long f43106c;

    /* renamed from: d */
    private final AbuseInfo f43107d;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return MyCloudQuotaUsageResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MyCloudQuotaUsageResponse(int i11, int i12, long j11, long j12, AbuseInfo abuseInfo, AbstractC26805k1 abstractC26805k1) {
        if (6 != (i11 & 6)) {
            AbstractC26774a1.m137800b(i11, 6, MyCloudQuotaUsageResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.f43104a = (i11 & 1) == 0 ? -1 : i12;
        this.f43105b = j11;
        this.f43106c = j12;
        if ((i11 & 8) == 0) {
            this.f43107d = null;
        } else {
            this.f43107d = abuseInfo;
        }
    }

    /* renamed from: e */
    public static final /* synthetic */ void m41371e(MyCloudQuotaUsageResponse myCloudQuotaUsageResponse, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || myCloudQuotaUsageResponse.f43104a != -1) {
            interfaceC21886d.mo114033x(serialDescriptor, 0, myCloudQuotaUsageResponse.f43104a);
        }
        interfaceC21886d.mo114022E(serialDescriptor, 1, myCloudQuotaUsageResponse.f43105b);
        interfaceC21886d.mo114022E(serialDescriptor, 2, myCloudQuotaUsageResponse.f43106c);
        if (interfaceC21886d.mo114019A(serialDescriptor, 3) || myCloudQuotaUsageResponse.f43107d != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 3, AbuseInfo$$serializer.INSTANCE, myCloudQuotaUsageResponse.f43107d);
        }
    }

    /* renamed from: a */
    public final AbuseInfo m41372a() {
        return this.f43107d;
    }

    /* renamed from: b */
    public final int m41373b() {
        return this.f43104a;
    }

    /* renamed from: c */
    public final long m41374c() {
        return this.f43105b;
    }

    /* renamed from: d */
    public final long m41375d() {
        return this.f43106c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MyCloudQuotaUsageResponse)) {
            return false;
        }
        MyCloudQuotaUsageResponse myCloudQuotaUsageResponse = (MyCloudQuotaUsageResponse) obj;
        return this.f43104a == myCloudQuotaUsageResponse.f43104a && this.f43105b == myCloudQuotaUsageResponse.f43105b && this.f43106c == myCloudQuotaUsageResponse.f43106c && AbstractC19074t.m100204b(this.f43107d, myCloudQuotaUsageResponse.f43107d);
    }

    public int hashCode() {
        int m11521a = ((((this.f43104a * 31) + AbstractC2147g0.m11521a(this.f43105b)) * 31) + AbstractC2147g0.m11521a(this.f43106c)) * 31;
        AbuseInfo abuseInfo = this.f43107d;
        return m11521a + (abuseInfo == null ? 0 : abuseInfo.hashCode());
    }

    public String toString() {
        return "MyCloudQuotaUsageResponse(plan=" + this.f43104a + ", total=" + this.f43105b + ", used=" + this.f43106c + ", abuseInfo=" + this.f43107d + ")";
    }
}

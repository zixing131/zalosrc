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
public final class CloudQuotaUsageResponse {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final int f43043a;

    /* renamed from: b */
    private final long f43044b;

    /* renamed from: c */
    private final long f43045c;

    /* renamed from: d */
    private final ServiceUsage f43046d;

    /* renamed from: e */
    private final AbuseInfo f43047e;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return CloudQuotaUsageResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CloudQuotaUsageResponse(int i11, int i12, long j11, long j12, ServiceUsage serviceUsage, AbuseInfo abuseInfo, AbstractC26805k1 abstractC26805k1) {
        if (15 != (i11 & 15)) {
            AbstractC26774a1.m137800b(i11, 15, CloudQuotaUsageResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.f43043a = i12;
        this.f43044b = j11;
        this.f43045c = j12;
        this.f43046d = serviceUsage;
        if ((i11 & 16) == 0) {
            this.f43047e = null;
        } else {
            this.f43047e = abuseInfo;
        }
    }

    /* renamed from: f */
    public static final /* synthetic */ void m41299f(CloudQuotaUsageResponse cloudQuotaUsageResponse, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        interfaceC21886d.mo114033x(serialDescriptor, 0, cloudQuotaUsageResponse.f43043a);
        interfaceC21886d.mo114022E(serialDescriptor, 1, cloudQuotaUsageResponse.f43044b);
        interfaceC21886d.mo114022E(serialDescriptor, 2, cloudQuotaUsageResponse.f43045c);
        interfaceC21886d.mo114029i(serialDescriptor, 3, ServiceUsage$$serializer.INSTANCE, cloudQuotaUsageResponse.f43046d);
        if (interfaceC21886d.mo114019A(serialDescriptor, 4) || cloudQuotaUsageResponse.f43047e != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 4, AbuseInfo$$serializer.INSTANCE, cloudQuotaUsageResponse.f43047e);
        }
    }

    /* renamed from: a */
    public final AbuseInfo m41300a() {
        return this.f43047e;
    }

    /* renamed from: b */
    public final int m41301b() {
        return this.f43043a;
    }

    /* renamed from: c */
    public final ServiceUsage m41302c() {
        return this.f43046d;
    }

    /* renamed from: d */
    public final long m41303d() {
        return this.f43044b;
    }

    /* renamed from: e */
    public final long m41304e() {
        return this.f43045c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CloudQuotaUsageResponse)) {
            return false;
        }
        CloudQuotaUsageResponse cloudQuotaUsageResponse = (CloudQuotaUsageResponse) obj;
        return this.f43043a == cloudQuotaUsageResponse.f43043a && this.f43044b == cloudQuotaUsageResponse.f43044b && this.f43045c == cloudQuotaUsageResponse.f43045c && AbstractC19074t.m100204b(this.f43046d, cloudQuotaUsageResponse.f43046d) && AbstractC19074t.m100204b(this.f43047e, cloudQuotaUsageResponse.f43047e);
    }

    public int hashCode() {
        int m11521a = ((((((this.f43043a * 31) + AbstractC2147g0.m11521a(this.f43044b)) * 31) + AbstractC2147g0.m11521a(this.f43045c)) * 31) + this.f43046d.hashCode()) * 31;
        AbuseInfo abuseInfo = this.f43047e;
        return m11521a + (abuseInfo == null ? 0 : abuseInfo.hashCode());
    }

    public String toString() {
        return "CloudQuotaUsageResponse(plan=" + this.f43043a + ", total=" + this.f43044b + ", used=" + this.f43045c + ", serviceUsage=" + this.f43046d + ", abuseInfo=" + this.f43047e + ")";
    }
}

package com.zing.zalo.data.zalocloud.model.api;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import qn0.InterfaceC25392g;
import tn0.AbstractC26805k1;

@InterfaceC25392g
/* loaded from: classes3.dex */
public final class CloudInfoResponse {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final SubscriptionInfo f43023a;

    /* renamed from: b */
    private final EncryptionInfo f43024b;

    /* renamed from: c */
    private final MigrateInfo f43025c;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return CloudInfoResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CloudInfoResponse(int i11, SubscriptionInfo subscriptionInfo, EncryptionInfo encryptionInfo, MigrateInfo migrateInfo, AbstractC26805k1 abstractC26805k1) {
        if ((i11 & 1) == 0) {
            this.f43023a = null;
        } else {
            this.f43023a = subscriptionInfo;
        }
        if ((i11 & 2) == 0) {
            this.f43024b = null;
        } else {
            this.f43024b = encryptionInfo;
        }
        if ((i11 & 4) == 0) {
            this.f43025c = null;
        } else {
            this.f43025c = migrateInfo;
        }
    }

    /* renamed from: c */
    public static final /* synthetic */ void m41274c(CloudInfoResponse cloudInfoResponse, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || cloudInfoResponse.f43023a != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 0, SubscriptionInfo$$serializer.INSTANCE, cloudInfoResponse.f43023a);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || cloudInfoResponse.f43024b != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 1, EncryptionInfo$$serializer.INSTANCE, cloudInfoResponse.f43024b);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || cloudInfoResponse.f43025c != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 2, MigrateInfo$$serializer.INSTANCE, cloudInfoResponse.f43025c);
        }
    }

    /* renamed from: a */
    public final EncryptionInfo m41275a() {
        return this.f43024b;
    }

    /* renamed from: b */
    public final SubscriptionInfo m41276b() {
        return this.f43023a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CloudInfoResponse)) {
            return false;
        }
        CloudInfoResponse cloudInfoResponse = (CloudInfoResponse) obj;
        return AbstractC19074t.m100204b(this.f43023a, cloudInfoResponse.f43023a) && AbstractC19074t.m100204b(this.f43024b, cloudInfoResponse.f43024b) && AbstractC19074t.m100204b(this.f43025c, cloudInfoResponse.f43025c);
    }

    public int hashCode() {
        SubscriptionInfo subscriptionInfo = this.f43023a;
        int hashCode = (subscriptionInfo == null ? 0 : subscriptionInfo.hashCode()) * 31;
        EncryptionInfo encryptionInfo = this.f43024b;
        int hashCode2 = (hashCode + (encryptionInfo == null ? 0 : encryptionInfo.hashCode())) * 31;
        MigrateInfo migrateInfo = this.f43025c;
        return hashCode2 + (migrateInfo != null ? migrateInfo.hashCode() : 0);
    }

    public String toString() {
        return "CloudInfoResponse(subscriptionInfo=" + this.f43023a + ", encryptionInfo=" + this.f43024b + ", migrateInfo=" + this.f43025c + ")";
    }
}

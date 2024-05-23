package com.zing.zalo.data.zalocloud.model.api;

import androidx.work.AbstractC2147g0;
import fn0.AbstractC19060k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import qn0.InterfaceC25392g;
import tn0.AbstractC26805k1;

@InterfaceC25392g
/* loaded from: classes3.dex */
public final class ServiceUsage {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final long f43115a;

    /* renamed from: b */
    private final long f43116b;

    /* renamed from: c */
    private final long f43117c;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return ServiceUsage$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ServiceUsage(int i11, long j11, long j12, long j13, AbstractC26805k1 abstractC26805k1) {
        if ((i11 & 1) == 0) {
            this.f43115a = -1L;
        } else {
            this.f43115a = j11;
        }
        if ((i11 & 2) == 0) {
            this.f43116b = -1L;
        } else {
            this.f43116b = j12;
        }
        if ((i11 & 4) == 0) {
            this.f43117c = -1L;
        } else {
            this.f43117c = j13;
        }
    }

    /* renamed from: d */
    public static final /* synthetic */ void m41377d(ServiceUsage serviceUsage, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || serviceUsage.f43115a != -1) {
            interfaceC21886d.mo114022E(serialDescriptor, 0, serviceUsage.f43115a);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || serviceUsage.f43116b != -1) {
            interfaceC21886d.mo114022E(serialDescriptor, 1, serviceUsage.f43116b);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || serviceUsage.f43117c != -1) {
            interfaceC21886d.mo114022E(serialDescriptor, 2, serviceUsage.f43117c);
        }
    }

    /* renamed from: a */
    public final long m41378a() {
        return this.f43115a;
    }

    /* renamed from: b */
    public final long m41379b() {
        return this.f43117c;
    }

    /* renamed from: c */
    public final long m41380c() {
        return this.f43116b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceUsage)) {
            return false;
        }
        ServiceUsage serviceUsage = (ServiceUsage) obj;
        return this.f43115a == serviceUsage.f43115a && this.f43116b == serviceUsage.f43116b && this.f43117c == serviceUsage.f43117c;
    }

    public int hashCode() {
        return (((AbstractC2147g0.m11521a(this.f43115a) * 31) + AbstractC2147g0.m11521a(this.f43116b)) * 31) + AbstractC2147g0.m11521a(this.f43117c);
    }

    public String toString() {
        return "ServiceUsage(cloudMedia=" + this.f43115a + ", myCloud=" + this.f43116b + ", msgBackup=" + this.f43117c + ")";
    }
}

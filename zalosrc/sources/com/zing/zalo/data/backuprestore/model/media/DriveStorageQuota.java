package com.zing.zalo.data.backuprestore.model.media;

import androidx.work.AbstractC2147g0;
import fn0.AbstractC19060k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import qn0.InterfaceC25392g;
import tn0.AbstractC26774a1;
import tn0.AbstractC26805k1;

@InterfaceC25392g
/* loaded from: classes3.dex */
public final class DriveStorageQuota {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final long f42890a;

    /* renamed from: b */
    private final long f42891b;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return DriveStorageQuota$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DriveStorageQuota(int i11, long j11, long j12, AbstractC26805k1 abstractC26805k1) {
        if (3 != (i11 & 3)) {
            AbstractC26774a1.m137800b(i11, 3, DriveStorageQuota$$serializer.INSTANCE.getDescriptor());
        }
        this.f42890a = j11;
        this.f42891b = j12;
    }

    /* renamed from: c */
    public static final /* synthetic */ void m40987c(DriveStorageQuota driveStorageQuota, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        interfaceC21886d.mo114022E(serialDescriptor, 0, driveStorageQuota.f42890a);
        interfaceC21886d.mo114022E(serialDescriptor, 1, driveStorageQuota.f42891b);
    }

    /* renamed from: a */
    public final long m40988a() {
        return this.f42890a;
    }

    /* renamed from: b */
    public final long m40989b() {
        return this.f42891b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DriveStorageQuota)) {
            return false;
        }
        DriveStorageQuota driveStorageQuota = (DriveStorageQuota) obj;
        return this.f42890a == driveStorageQuota.f42890a && this.f42891b == driveStorageQuota.f42891b;
    }

    public int hashCode() {
        return (AbstractC2147g0.m11521a(this.f42890a) * 31) + AbstractC2147g0.m11521a(this.f42891b);
    }

    public String toString() {
        return "DriveStorageQuota(limit=" + this.f42890a + ", usage=" + this.f42891b + ")";
    }
}

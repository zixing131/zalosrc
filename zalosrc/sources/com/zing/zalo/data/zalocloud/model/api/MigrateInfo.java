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
public final class MigrateInfo {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final int f43084a;

    /* renamed from: b */
    private final int f43085b;

    /* renamed from: c */
    private final String f43086c;

    /* renamed from: d */
    private final long f43087d;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return MigrateInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MigrateInfo(int i11, int i12, int i13, String str, long j11, AbstractC26805k1 abstractC26805k1) {
        if (15 != (i11 & 15)) {
            AbstractC26774a1.m137800b(i11, 15, MigrateInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.f43084a = i12;
        this.f43085b = i13;
        this.f43086c = str;
        this.f43087d = j11;
    }

    /* renamed from: a */
    public static final /* synthetic */ void m41356a(MigrateInfo migrateInfo, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        interfaceC21886d.mo114033x(serialDescriptor, 0, migrateInfo.f43084a);
        interfaceC21886d.mo114033x(serialDescriptor, 1, migrateInfo.f43085b);
        interfaceC21886d.mo114035z(serialDescriptor, 2, migrateInfo.f43086c);
        interfaceC21886d.mo114022E(serialDescriptor, 3, migrateInfo.f43087d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MigrateInfo)) {
            return false;
        }
        MigrateInfo migrateInfo = (MigrateInfo) obj;
        return this.f43084a == migrateInfo.f43084a && this.f43085b == migrateInfo.f43085b && AbstractC19074t.m100204b(this.f43086c, migrateInfo.f43086c) && this.f43087d == migrateInfo.f43087d;
    }

    public int hashCode() {
        return (((((this.f43084a * 31) + this.f43085b) * 31) + this.f43086c.hashCode()) * 31) + AbstractC2147g0.m11521a(this.f43087d);
    }

    public String toString() {
        return "MigrateInfo(status=" + this.f43084a + ", lastFlow=" + this.f43085b + ", deviceName=" + this.f43086c + ", lastUpdate=" + this.f43087d + ")";
    }
}

package com.zing.zalo.zalocloud.info;

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
/* loaded from: classes7.dex */
public final class MigrationInfo {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final int f85365a;

    /* renamed from: b */
    private final SubStatus f85366b;

    /* renamed from: c */
    private final int f85367c;

    /* renamed from: d */
    private final String f85368d;

    /* renamed from: e */
    private final long f85369e;

    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return MigrationInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MigrationInfo(int i11, int i12, SubStatus subStatus, int i13, String str, long j11, AbstractC26805k1 abstractC26805k1) {
        if (31 != (i11 & 31)) {
            AbstractC26774a1.m137800b(i11, 31, MigrationInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.f85365a = i12;
        this.f85366b = subStatus;
        this.f85367c = i13;
        this.f85368d = str;
        this.f85369e = j11;
    }

    /* renamed from: a */
    public static final /* synthetic */ void m89822a(MigrationInfo migrationInfo, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        interfaceC21886d.mo114033x(serialDescriptor, 0, migrationInfo.f85365a);
        interfaceC21886d.mo114029i(serialDescriptor, 1, SubStatus$$serializer.INSTANCE, migrationInfo.f85366b);
        interfaceC21886d.mo114033x(serialDescriptor, 2, migrationInfo.f85367c);
        interfaceC21886d.mo114035z(serialDescriptor, 3, migrationInfo.f85368d);
        interfaceC21886d.mo114022E(serialDescriptor, 4, migrationInfo.f85369e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MigrationInfo)) {
            return false;
        }
        MigrationInfo migrationInfo = (MigrationInfo) obj;
        return this.f85365a == migrationInfo.f85365a && AbstractC19074t.m100204b(this.f85366b, migrationInfo.f85366b) && this.f85367c == migrationInfo.f85367c && AbstractC19074t.m100204b(this.f85368d, migrationInfo.f85368d) && this.f85369e == migrationInfo.f85369e;
    }

    public int hashCode() {
        return (((((((this.f85365a * 31) + this.f85366b.hashCode()) * 31) + this.f85367c) * 31) + this.f85368d.hashCode()) * 31) + AbstractC2147g0.m11521a(this.f85369e);
    }

    public String toString() {
        return "MigrationInfo(status=" + this.f85365a + ", subStatus=" + this.f85366b + ", lastFlow=" + this.f85367c + ", deviceName=" + this.f85368d + ", lastUpdate=" + this.f85369e + ")";
    }
}

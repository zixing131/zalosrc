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
public final class UpdateMigrationStatusParams {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final int f43140a;

    /* renamed from: b */
    private final UpdateMigrationSubStatusParams f43141b;

    /* renamed from: c */
    private final int f43142c;

    /* renamed from: d */
    private final String f43143d;

    /* renamed from: e */
    private final long f43144e;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return UpdateMigrationStatusParams$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UpdateMigrationStatusParams(int i11, int i12, UpdateMigrationSubStatusParams updateMigrationSubStatusParams, int i13, String str, long j11, AbstractC26805k1 abstractC26805k1) {
        if (31 != (i11 & 31)) {
            AbstractC26774a1.m137800b(i11, 31, UpdateMigrationStatusParams$$serializer.INSTANCE.getDescriptor());
        }
        this.f43140a = i12;
        this.f43141b = updateMigrationSubStatusParams;
        this.f43142c = i13;
        this.f43143d = str;
        this.f43144e = j11;
    }

    /* renamed from: a */
    public static final /* synthetic */ void m41390a(UpdateMigrationStatusParams updateMigrationStatusParams, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        interfaceC21886d.mo114033x(serialDescriptor, 0, updateMigrationStatusParams.f43140a);
        interfaceC21886d.mo114029i(serialDescriptor, 1, UpdateMigrationSubStatusParams$$serializer.INSTANCE, updateMigrationStatusParams.f43141b);
        interfaceC21886d.mo114033x(serialDescriptor, 2, updateMigrationStatusParams.f43142c);
        interfaceC21886d.mo114035z(serialDescriptor, 3, updateMigrationStatusParams.f43143d);
        interfaceC21886d.mo114022E(serialDescriptor, 4, updateMigrationStatusParams.f43144e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateMigrationStatusParams)) {
            return false;
        }
        UpdateMigrationStatusParams updateMigrationStatusParams = (UpdateMigrationStatusParams) obj;
        return this.f43140a == updateMigrationStatusParams.f43140a && AbstractC19074t.m100204b(this.f43141b, updateMigrationStatusParams.f43141b) && this.f43142c == updateMigrationStatusParams.f43142c && AbstractC19074t.m100204b(this.f43143d, updateMigrationStatusParams.f43143d) && this.f43144e == updateMigrationStatusParams.f43144e;
    }

    public int hashCode() {
        return (((((((this.f43140a * 31) + this.f43141b.hashCode()) * 31) + this.f43142c) * 31) + this.f43143d.hashCode()) * 31) + AbstractC2147g0.m11521a(this.f43144e);
    }

    public String toString() {
        return "UpdateMigrationStatusParams(status=" + this.f43140a + ", subStatus=" + this.f43141b + ", lastFlow=" + this.f43142c + ", deviceName=" + this.f43143d + ", lastUpdate=" + this.f43144e + ")";
    }

    public UpdateMigrationStatusParams(int i11, UpdateMigrationSubStatusParams updateMigrationSubStatusParams, int i12, String str, long j11) {
        AbstractC19074t.m100208f(updateMigrationSubStatusParams, "subStatus");
        AbstractC19074t.m100208f(str, "deviceName");
        this.f43140a = i11;
        this.f43141b = updateMigrationSubStatusParams;
        this.f43142c = i12;
        this.f43143d = str;
        this.f43144e = j11;
    }
}

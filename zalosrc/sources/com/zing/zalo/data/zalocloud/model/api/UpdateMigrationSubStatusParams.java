package com.zing.zalo.data.zalocloud.model.api;

import fn0.AbstractC19060k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import qn0.InterfaceC25392g;
import tn0.AbstractC26774a1;
import tn0.AbstractC26805k1;

@InterfaceC25392g
/* loaded from: classes3.dex */
public final class UpdateMigrationSubStatusParams {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final int f43145a;

    /* renamed from: b */
    private final int f43146b;

    /* renamed from: c */
    private final int f43147c;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return UpdateMigrationSubStatusParams$$serializer.INSTANCE;
        }
    }

    public UpdateMigrationSubStatusParams(int i11, int i12, int i13) {
        this.f43145a = i11;
        this.f43146b = i12;
        this.f43147c = i13;
    }

    /* renamed from: a */
    public static final /* synthetic */ void m41391a(UpdateMigrationSubStatusParams updateMigrationSubStatusParams, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        interfaceC21886d.mo114033x(serialDescriptor, 0, updateMigrationSubStatusParams.f43145a);
        interfaceC21886d.mo114033x(serialDescriptor, 1, updateMigrationSubStatusParams.f43146b);
        interfaceC21886d.mo114033x(serialDescriptor, 2, updateMigrationSubStatusParams.f43147c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateMigrationSubStatusParams)) {
            return false;
        }
        UpdateMigrationSubStatusParams updateMigrationSubStatusParams = (UpdateMigrationSubStatusParams) obj;
        return this.f43145a == updateMigrationSubStatusParams.f43145a && this.f43146b == updateMigrationSubStatusParams.f43146b && this.f43147c == updateMigrationSubStatusParams.f43147c;
    }

    public int hashCode() {
        return (((this.f43145a * 31) + this.f43146b) * 31) + this.f43147c;
    }

    public String toString() {
        return "UpdateMigrationSubStatusParams(myCloud=" + this.f43145a + ", messageBackup=" + this.f43146b + ", cloudMedia=" + this.f43147c + ")";
    }

    public /* synthetic */ UpdateMigrationSubStatusParams(int i11, int i12, int i13, int i14, AbstractC26805k1 abstractC26805k1) {
        if (7 != (i11 & 7)) {
            AbstractC26774a1.m137800b(i11, 7, UpdateMigrationSubStatusParams$$serializer.INSTANCE.getDescriptor());
        }
        this.f43145a = i12;
        this.f43146b = i13;
        this.f43147c = i14;
    }
}

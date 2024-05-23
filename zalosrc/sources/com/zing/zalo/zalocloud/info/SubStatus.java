package com.zing.zalo.zalocloud.info;

import fn0.AbstractC19060k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import qn0.InterfaceC25392g;
import tn0.AbstractC26774a1;
import tn0.AbstractC26805k1;

@InterfaceC25392g
/* loaded from: classes7.dex */
public final class SubStatus {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final int f85370a;

    /* renamed from: b */
    private final int f85371b;

    /* renamed from: c */
    private final int f85372c;

    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return SubStatus$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SubStatus(int i11, int i12, int i13, int i14, AbstractC26805k1 abstractC26805k1) {
        if (7 != (i11 & 7)) {
            AbstractC26774a1.m137800b(i11, 7, SubStatus$$serializer.INSTANCE.getDescriptor());
        }
        this.f85370a = i12;
        this.f85371b = i13;
        this.f85372c = i14;
    }

    /* renamed from: a */
    public static final /* synthetic */ void m89823a(SubStatus subStatus, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        interfaceC21886d.mo114033x(serialDescriptor, 0, subStatus.f85370a);
        interfaceC21886d.mo114033x(serialDescriptor, 1, subStatus.f85371b);
        interfaceC21886d.mo114033x(serialDescriptor, 2, subStatus.f85372c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubStatus)) {
            return false;
        }
        SubStatus subStatus = (SubStatus) obj;
        return this.f85370a == subStatus.f85370a && this.f85371b == subStatus.f85371b && this.f85372c == subStatus.f85372c;
    }

    public int hashCode() {
        return (((this.f85370a * 31) + this.f85371b) * 31) + this.f85372c;
    }

    public String toString() {
        return "SubStatus(cloudMedia=" + this.f85370a + ", myCloud=" + this.f85371b + ", messageBackup=" + this.f85372c + ")";
    }
}

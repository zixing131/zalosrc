package com.zing.zalo.data.zalocloud.model.api;

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
public final class EncryptionInfo {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final String f43073a;

    /* renamed from: b */
    private final int f43074b;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return EncryptionInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EncryptionInfo(int i11, String str, int i12, AbstractC26805k1 abstractC26805k1) {
        if (3 != (i11 & 3)) {
            AbstractC26774a1.m137800b(i11, 3, EncryptionInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.f43073a = str;
        this.f43074b = i12;
    }

    /* renamed from: c */
    public static final /* synthetic */ void m41340c(EncryptionInfo encryptionInfo, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        interfaceC21886d.mo114035z(serialDescriptor, 0, encryptionInfo.f43073a);
        interfaceC21886d.mo114033x(serialDescriptor, 1, encryptionInfo.f43074b);
    }

    /* renamed from: a */
    public final int m41341a() {
        return this.f43074b;
    }

    /* renamed from: b */
    public final String m41342b() {
        return this.f43073a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EncryptionInfo)) {
            return false;
        }
        EncryptionInfo encryptionInfo = (EncryptionInfo) obj;
        return AbstractC19074t.m100204b(this.f43073a, encryptionInfo.f43073a) && this.f43074b == encryptionInfo.f43074b;
    }

    public int hashCode() {
        return (this.f43073a.hashCode() * 31) + this.f43074b;
    }

    public String toString() {
        return "EncryptionInfo(publicKey=" + this.f43073a + ", encryptType=" + this.f43074b + ")";
    }
}

package com.zing.zalo.zalocloud.backupkey;

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
public final class DriveKeyPayload {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final String f85306a;

    /* renamed from: b */
    private final SecureOption f85307b;

    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return DriveKeyPayload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DriveKeyPayload(int i11, String str, SecureOption secureOption, AbstractC26805k1 abstractC26805k1) {
        if (3 != (i11 & 3)) {
            AbstractC26774a1.m137800b(i11, 3, DriveKeyPayload$$serializer.INSTANCE.getDescriptor());
        }
        this.f85306a = str;
        this.f85307b = secureOption;
    }

    /* renamed from: c */
    public static final /* synthetic */ void m89736c(DriveKeyPayload driveKeyPayload, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        interfaceC21886d.mo114035z(serialDescriptor, 0, driveKeyPayload.f85306a);
        interfaceC21886d.mo114029i(serialDescriptor, 1, SecureOption$$serializer.INSTANCE, driveKeyPayload.f85307b);
    }

    /* renamed from: a */
    public final SecureOption m89737a() {
        return this.f85307b;
    }

    /* renamed from: b */
    public final String m89738b() {
        return this.f85306a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DriveKeyPayload)) {
            return false;
        }
        DriveKeyPayload driveKeyPayload = (DriveKeyPayload) obj;
        return AbstractC19074t.m100204b(this.f85306a, driveKeyPayload.f85306a) && AbstractC19074t.m100204b(this.f85307b, driveKeyPayload.f85307b);
    }

    public int hashCode() {
        return (this.f85306a.hashCode() * 31) + this.f85307b.hashCode();
    }

    public String toString() {
        return "DriveKeyPayload(userId=" + this.f85306a + ", secureOption=" + this.f85307b + ")";
    }

    public DriveKeyPayload(String str, SecureOption secureOption) {
        AbstractC19074t.m100208f(str, "userId");
        AbstractC19074t.m100208f(secureOption, "secureOption");
        this.f85306a = str;
        this.f85307b = secureOption;
    }
}

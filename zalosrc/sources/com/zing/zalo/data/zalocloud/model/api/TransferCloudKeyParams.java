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
public final class TransferCloudKeyParams {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final String f43134a;

    /* renamed from: b */
    private final String f43135b;

    /* renamed from: c */
    private final int f43136c;

    /* renamed from: d */
    private final int f43137d;

    /* renamed from: e */
    private final String f43138e;

    /* renamed from: f */
    private final String f43139f;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return TransferCloudKeyParams$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TransferCloudKeyParams(int i11, String str, String str2, int i12, int i13, String str3, String str4, AbstractC26805k1 abstractC26805k1) {
        if (63 != (i11 & 63)) {
            AbstractC26774a1.m137800b(i11, 63, TransferCloudKeyParams$$serializer.INSTANCE.getDescriptor());
        }
        this.f43134a = str;
        this.f43135b = str2;
        this.f43136c = i12;
        this.f43137d = i13;
        this.f43138e = str3;
        this.f43139f = str4;
    }

    /* renamed from: a */
    public static final /* synthetic */ void m41389a(TransferCloudKeyParams transferCloudKeyParams, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        interfaceC21886d.mo114035z(serialDescriptor, 0, transferCloudKeyParams.f43134a);
        interfaceC21886d.mo114035z(serialDescriptor, 1, transferCloudKeyParams.f43135b);
        interfaceC21886d.mo114033x(serialDescriptor, 2, transferCloudKeyParams.f43136c);
        interfaceC21886d.mo114033x(serialDescriptor, 3, transferCloudKeyParams.f43137d);
        interfaceC21886d.mo114035z(serialDescriptor, 4, transferCloudKeyParams.f43138e);
        interfaceC21886d.mo114035z(serialDescriptor, 5, transferCloudKeyParams.f43139f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferCloudKeyParams)) {
            return false;
        }
        TransferCloudKeyParams transferCloudKeyParams = (TransferCloudKeyParams) obj;
        return AbstractC19074t.m100204b(this.f43134a, transferCloudKeyParams.f43134a) && AbstractC19074t.m100204b(this.f43135b, transferCloudKeyParams.f43135b) && this.f43136c == transferCloudKeyParams.f43136c && this.f43137d == transferCloudKeyParams.f43137d && AbstractC19074t.m100204b(this.f43138e, transferCloudKeyParams.f43138e) && AbstractC19074t.m100204b(this.f43139f, transferCloudKeyParams.f43139f);
    }

    public int hashCode() {
        return (((((((((this.f43134a.hashCode() * 31) + this.f43135b.hashCode()) * 31) + this.f43136c) * 31) + this.f43137d) * 31) + this.f43138e.hashCode()) * 31) + this.f43139f.hashCode();
    }

    public String toString() {
        return "TransferCloudKeyParams(sessionId=" + this.f43134a + ", deviceName=" + this.f43135b + ", userAction=" + this.f43136c + ", keyVersion=" + this.f43137d + ", publicKey=" + this.f43138e + ", encryptedPrivateKey=" + this.f43139f + ")";
    }

    public TransferCloudKeyParams(String str, String str2, int i11, int i12, String str3, String str4) {
        AbstractC19074t.m100208f(str, "sessionId");
        AbstractC19074t.m100208f(str2, "deviceName");
        AbstractC19074t.m100208f(str3, "publicKey");
        AbstractC19074t.m100208f(str4, "encryptedPrivateKey");
        this.f43134a = str;
        this.f43135b = str2;
        this.f43136c = i11;
        this.f43137d = i12;
        this.f43138e = str3;
        this.f43139f = str4;
    }
}

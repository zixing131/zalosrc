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
public final class SecureOption {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final int f85308a;

    /* renamed from: b */
    private final String f85309b;

    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return SecureOption$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SecureOption(int i11, int i12, String str, AbstractC26805k1 abstractC26805k1) {
        if (3 != (i11 & 3)) {
            AbstractC26774a1.m137800b(i11, 3, SecureOption$$serializer.INSTANCE.getDescriptor());
        }
        this.f85308a = i12;
        this.f85309b = str;
    }

    /* renamed from: c */
    public static final /* synthetic */ void m89739c(SecureOption secureOption, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        interfaceC21886d.mo114033x(serialDescriptor, 0, secureOption.f85308a);
        interfaceC21886d.mo114035z(serialDescriptor, 1, secureOption.f85309b);
    }

    /* renamed from: a */
    public final String m89740a() {
        return this.f85309b;
    }

    /* renamed from: b */
    public final int m89741b() {
        return this.f85308a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SecureOption)) {
            return false;
        }
        SecureOption secureOption = (SecureOption) obj;
        return this.f85308a == secureOption.f85308a && AbstractC19074t.m100204b(this.f85309b, secureOption.f85309b);
    }

    public int hashCode() {
        return (this.f85308a * 31) + this.f85309b.hashCode();
    }

    public String toString() {
        return "SecureOption(type=" + this.f85308a + ", key=" + this.f85309b + ")";
    }

    public SecureOption(int i11, String str) {
        AbstractC19074t.m100208f(str, "key");
        this.f85308a = i11;
        this.f85309b = str;
    }
}

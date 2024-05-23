package com.zing.zalo.data.zalocloud.model.api;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import qn0.InterfaceC25392g;
import tn0.AbstractC26805k1;
import tn0.C26783d0;
import tn0.C26814n1;

@InterfaceC25392g
/* loaded from: classes3.dex */
public final class EncryptInfo {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final String f43070a;

    /* renamed from: b */
    private final Integer f43071b;

    /* renamed from: c */
    private final Integer f43072c;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return EncryptInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EncryptInfo(int i11, String str, Integer num, Integer num2, AbstractC26805k1 abstractC26805k1) {
        if ((i11 & 1) == 0) {
            this.f43070a = null;
        } else {
            this.f43070a = str;
        }
        if ((i11 & 2) == 0) {
            this.f43071b = null;
        } else {
            this.f43071b = num;
        }
        if ((i11 & 4) == 0) {
            this.f43072c = null;
        } else {
            this.f43072c = num2;
        }
    }

    /* renamed from: d */
    public static final /* synthetic */ void m41336d(EncryptInfo encryptInfo, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || encryptInfo.f43070a != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 0, C26814n1.f127034a, encryptInfo.f43070a);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || encryptInfo.f43071b != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 1, C26783d0.f126989a, encryptInfo.f43071b);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || encryptInfo.f43072c != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 2, C26783d0.f126989a, encryptInfo.f43072c);
        }
    }

    /* renamed from: a */
    public final Integer m41337a() {
        return this.f43072c;
    }

    /* renamed from: b */
    public final String m41338b() {
        return this.f43070a;
    }

    /* renamed from: c */
    public final Integer m41339c() {
        return this.f43071b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EncryptInfo)) {
            return false;
        }
        EncryptInfo encryptInfo = (EncryptInfo) obj;
        return AbstractC19074t.m100204b(this.f43070a, encryptInfo.f43070a) && AbstractC19074t.m100204b(this.f43071b, encryptInfo.f43071b) && AbstractC19074t.m100204b(this.f43072c, encryptInfo.f43072c);
    }

    public int hashCode() {
        String str = this.f43070a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f43071b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f43072c;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "EncryptInfo(encryptKey=" + this.f43070a + ", keyVersion=" + this.f43071b + ", algoVersion=" + this.f43072c + ")";
    }

    public EncryptInfo(String str, Integer num, Integer num2) {
        this.f43070a = str;
        this.f43071b = num;
        this.f43072c = num2;
    }
}

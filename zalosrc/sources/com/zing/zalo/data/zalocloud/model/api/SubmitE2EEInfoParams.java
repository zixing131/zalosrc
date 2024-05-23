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
public final class SubmitE2EEInfoParams {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final String f43121a;

    /* renamed from: b */
    private final EncryptInfo f43122b;

    /* renamed from: c */
    private final MediaExtInfo f43123c;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return SubmitE2EEInfoParams$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SubmitE2EEInfoParams(int i11, String str, EncryptInfo encryptInfo, MediaExtInfo mediaExtInfo, AbstractC26805k1 abstractC26805k1) {
        if (7 != (i11 & 7)) {
            AbstractC26774a1.m137800b(i11, 7, SubmitE2EEInfoParams$$serializer.INSTANCE.getDescriptor());
        }
        this.f43121a = str;
        this.f43122b = encryptInfo;
        this.f43123c = mediaExtInfo;
    }

    /* renamed from: b */
    public static final /* synthetic */ void m41384b(SubmitE2EEInfoParams submitE2EEInfoParams, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        interfaceC21886d.mo114035z(serialDescriptor, 0, submitE2EEInfoParams.f43121a);
        interfaceC21886d.mo114029i(serialDescriptor, 1, EncryptInfo$$serializer.INSTANCE, submitE2EEInfoParams.f43122b);
        interfaceC21886d.mo114029i(serialDescriptor, 2, MediaExtInfo$$serializer.INSTANCE, submitE2EEInfoParams.f43123c);
    }

    /* renamed from: a */
    public final String m41385a() {
        return this.f43121a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubmitE2EEInfoParams)) {
            return false;
        }
        SubmitE2EEInfoParams submitE2EEInfoParams = (SubmitE2EEInfoParams) obj;
        return AbstractC19074t.m100204b(this.f43121a, submitE2EEInfoParams.f43121a) && AbstractC19074t.m100204b(this.f43122b, submitE2EEInfoParams.f43122b) && AbstractC19074t.m100204b(this.f43123c, submitE2EEInfoParams.f43123c);
    }

    public int hashCode() {
        return (((this.f43121a.hashCode() * 31) + this.f43122b.hashCode()) * 31) + this.f43123c.hashCode();
    }

    public String toString() {
        return "SubmitE2EEInfoParams(noiseId=" + this.f43121a + ", encryptInfo=" + this.f43122b + ", mediaExtInfo=" + this.f43123c + ")";
    }

    public SubmitE2EEInfoParams(String str, EncryptInfo encryptInfo, MediaExtInfo mediaExtInfo) {
        AbstractC19074t.m100208f(str, "noiseId");
        AbstractC19074t.m100208f(encryptInfo, "encryptInfo");
        AbstractC19074t.m100208f(mediaExtInfo, "mediaExtInfo");
        this.f43121a = str;
        this.f43122b = encryptInfo;
        this.f43123c = mediaExtInfo;
    }
}

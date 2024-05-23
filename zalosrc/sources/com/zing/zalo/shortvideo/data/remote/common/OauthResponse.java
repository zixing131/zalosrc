package com.zing.zalo.shortvideo.data.remote.common;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import qn0.InterfaceC25392g;
import tn0.AbstractC26774a1;
import tn0.AbstractC26805k1;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class OauthResponse {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final int f50181a;

    /* renamed from: b */
    private final String f50182b;

    /* renamed from: c */
    private final OauthToken f50183c;

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return OauthResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OauthResponse(int i11, int i12, String str, OauthToken oauthToken, AbstractC26805k1 abstractC26805k1) {
        if (7 != (i11 & 7)) {
            AbstractC26774a1.m137800b(i11, 7, OauthResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.f50181a = i12;
        this.f50182b = str;
        this.f50183c = oauthToken;
    }

    /* renamed from: b */
    public static final /* synthetic */ void m51524b(OauthResponse oauthResponse, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        interfaceC21886d.mo114033x(serialDescriptor, 0, oauthResponse.f50181a);
        interfaceC21886d.mo114035z(serialDescriptor, 1, oauthResponse.f50182b);
        interfaceC21886d.mo114029i(serialDescriptor, 2, OauthToken$$serializer.INSTANCE, oauthResponse.f50183c);
    }

    /* renamed from: a */
    public final OauthToken m51525a() {
        return this.f50183c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OauthResponse)) {
            return false;
        }
        OauthResponse oauthResponse = (OauthResponse) obj;
        return this.f50181a == oauthResponse.f50181a && AbstractC19074t.m100204b(this.f50182b, oauthResponse.f50182b) && AbstractC19074t.m100204b(this.f50183c, oauthResponse.f50183c);
    }

    public int hashCode() {
        return (((this.f50181a * 31) + this.f50182b.hashCode()) * 31) + this.f50183c.hashCode();
    }

    public String toString() {
        return "OauthResponse(code=" + this.f50181a + ", msg=" + this.f50182b + ", token=" + this.f50183c + ")";
    }
}

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
public final class OauthToken {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final String f50184a;

    /* renamed from: b */
    private final String f50185b;

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return OauthToken$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OauthToken(int i11, String str, String str2, AbstractC26805k1 abstractC26805k1) {
        if (3 != (i11 & 3)) {
            AbstractC26774a1.m137800b(i11, 3, OauthToken$$serializer.INSTANCE.getDescriptor());
        }
        this.f50184a = str;
        this.f50185b = str2;
    }

    /* renamed from: c */
    public static final /* synthetic */ void m51526c(OauthToken oauthToken, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        interfaceC21886d.mo114035z(serialDescriptor, 0, oauthToken.f50184a);
        interfaceC21886d.mo114035z(serialDescriptor, 1, oauthToken.f50185b);
    }

    /* renamed from: a */
    public final String m51527a() {
        return this.f50184a;
    }

    /* renamed from: b */
    public final String m51528b() {
        return this.f50185b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OauthToken)) {
            return false;
        }
        OauthToken oauthToken = (OauthToken) obj;
        return AbstractC19074t.m100204b(this.f50184a, oauthToken.f50184a) && AbstractC19074t.m100204b(this.f50185b, oauthToken.f50185b);
    }

    public int hashCode() {
        return (this.f50184a.hashCode() * 31) + this.f50185b.hashCode();
    }

    public String toString() {
        return "OauthToken(accessToken=" + this.f50184a + ", refreshToken=" + this.f50185b + ")";
    }
}

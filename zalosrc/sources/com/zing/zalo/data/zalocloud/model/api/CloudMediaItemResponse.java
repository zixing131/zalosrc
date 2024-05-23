package com.zing.zalo.data.zalocloud.model.api;

import androidx.work.AbstractC2147g0;
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
public final class CloudMediaItemResponse {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final String f43035a;

    /* renamed from: b */
    private final int f43036b;

    /* renamed from: c */
    private final int f43037c;

    /* renamed from: d */
    private final long f43038d;

    /* renamed from: e */
    private final long f43039e;

    /* renamed from: f */
    private final MsgInfo f43040f;

    /* renamed from: g */
    private final MediaInfo f43041g;

    /* renamed from: h */
    private final EncryptInfo f43042h;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return CloudMediaItemResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CloudMediaItemResponse(int i11, String str, int i12, int i13, long j11, long j12, MsgInfo msgInfo, MediaInfo mediaInfo, EncryptInfo encryptInfo, AbstractC26805k1 abstractC26805k1) {
        if (127 != (i11 & 127)) {
            AbstractC26774a1.m137800b(i11, 127, CloudMediaItemResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.f43035a = str;
        this.f43036b = i12;
        this.f43037c = i13;
        this.f43038d = j11;
        this.f43039e = j12;
        this.f43040f = msgInfo;
        this.f43041g = mediaInfo;
        if ((i11 & 128) == 0) {
            this.f43042h = null;
        } else {
            this.f43042h = encryptInfo;
        }
    }

    /* renamed from: g */
    public static final /* synthetic */ void m41292g(CloudMediaItemResponse cloudMediaItemResponse, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        interfaceC21886d.mo114035z(serialDescriptor, 0, cloudMediaItemResponse.f43035a);
        interfaceC21886d.mo114033x(serialDescriptor, 1, cloudMediaItemResponse.f43036b);
        interfaceC21886d.mo114033x(serialDescriptor, 2, cloudMediaItemResponse.f43037c);
        interfaceC21886d.mo114022E(serialDescriptor, 3, cloudMediaItemResponse.f43038d);
        interfaceC21886d.mo114022E(serialDescriptor, 4, cloudMediaItemResponse.f43039e);
        interfaceC21886d.mo114029i(serialDescriptor, 5, MsgInfo$$serializer.INSTANCE, cloudMediaItemResponse.f43040f);
        interfaceC21886d.mo114029i(serialDescriptor, 6, MediaInfo$$serializer.INSTANCE, cloudMediaItemResponse.f43041g);
        if (interfaceC21886d.mo114019A(serialDescriptor, 7) || cloudMediaItemResponse.f43042h != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 7, EncryptInfo$$serializer.INSTANCE, cloudMediaItemResponse.f43042h);
        }
    }

    /* renamed from: a */
    public final int m41293a() {
        return this.f43036b;
    }

    /* renamed from: b */
    public final EncryptInfo m41294b() {
        return this.f43042h;
    }

    /* renamed from: c */
    public final MediaInfo m41295c() {
        return this.f43041g;
    }

    /* renamed from: d */
    public final MsgInfo m41296d() {
        return this.f43040f;
    }

    /* renamed from: e */
    public final String m41297e() {
        return this.f43035a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CloudMediaItemResponse)) {
            return false;
        }
        CloudMediaItemResponse cloudMediaItemResponse = (CloudMediaItemResponse) obj;
        return AbstractC19074t.m100204b(this.f43035a, cloudMediaItemResponse.f43035a) && this.f43036b == cloudMediaItemResponse.f43036b && this.f43037c == cloudMediaItemResponse.f43037c && this.f43038d == cloudMediaItemResponse.f43038d && this.f43039e == cloudMediaItemResponse.f43039e && AbstractC19074t.m100204b(this.f43040f, cloudMediaItemResponse.f43040f) && AbstractC19074t.m100204b(this.f43041g, cloudMediaItemResponse.f43041g) && AbstractC19074t.m100204b(this.f43042h, cloudMediaItemResponse.f43042h);
    }

    /* renamed from: f */
    public final long m41298f() {
        return this.f43038d;
    }

    public int hashCode() {
        int hashCode = ((((((((((((this.f43035a.hashCode() * 31) + this.f43036b) * 31) + this.f43037c) * 31) + AbstractC2147g0.m11521a(this.f43038d)) * 31) + AbstractC2147g0.m11521a(this.f43039e)) * 31) + this.f43040f.hashCode()) * 31) + this.f43041g.hashCode()) * 31;
        EncryptInfo encryptInfo = this.f43042h;
        return hashCode + (encryptInfo == null ? 0 : encryptInfo.hashCode());
    }

    public String toString() {
        return "CloudMediaItemResponse(noiseId=" + this.f43035a + ", action=" + this.f43036b + ", actionType=" + this.f43037c + ", ts=" + this.f43038d + ", cliTs=" + this.f43039e + ", msgInfo=" + this.f43040f + ", mediaInfo=" + this.f43041g + ", encryptInfo=" + this.f43042h + ")";
    }
}

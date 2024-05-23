package com.zing.zalo.data.zalocloud.model.api;

import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import qn0.InterfaceC25392g;
import tn0.AbstractC26774a1;
import tn0.AbstractC26805k1;
import tn0.C26814n1;

@InterfaceC25392g
/* loaded from: classes3.dex */
public final class RequestMigrateServerItemParams {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final MsgInfo f43108a;

    /* renamed from: b */
    private final String f43109b;

    /* renamed from: c */
    private final String f43110c;

    /* renamed from: d */
    private final String f43111d;

    /* renamed from: e */
    private final String f43112e;

    /* renamed from: f */
    private final String f43113f;

    /* renamed from: g */
    private final String f43114g;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return RequestMigrateServerItemParams$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RequestMigrateServerItemParams(int i11, MsgInfo msgInfo, String str, String str2, String str3, String str4, String str5, String str6, AbstractC26805k1 abstractC26805k1) {
        if (127 != (i11 & 127)) {
            AbstractC26774a1.m137800b(i11, 127, RequestMigrateServerItemParams$$serializer.INSTANCE.getDescriptor());
        }
        this.f43108a = msgInfo;
        this.f43109b = str;
        this.f43110c = str2;
        this.f43111d = str3;
        this.f43112e = str4;
        this.f43113f = str5;
        this.f43114g = str6;
    }

    /* renamed from: a */
    public static final /* synthetic */ void m41376a(RequestMigrateServerItemParams requestMigrateServerItemParams, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        interfaceC21886d.mo114029i(serialDescriptor, 0, MsgInfo$$serializer.INSTANCE, requestMigrateServerItemParams.f43108a);
        interfaceC21886d.mo114035z(serialDescriptor, 1, requestMigrateServerItemParams.f43109b);
        C26814n1 c26814n1 = C26814n1.f127034a;
        interfaceC21886d.mo114028h(serialDescriptor, 2, c26814n1, requestMigrateServerItemParams.f43110c);
        interfaceC21886d.mo114028h(serialDescriptor, 3, c26814n1, requestMigrateServerItemParams.f43111d);
        interfaceC21886d.mo114028h(serialDescriptor, 4, c26814n1, requestMigrateServerItemParams.f43112e);
        interfaceC21886d.mo114028h(serialDescriptor, 5, c26814n1, requestMigrateServerItemParams.f43113f);
        interfaceC21886d.mo114028h(serialDescriptor, 6, c26814n1, requestMigrateServerItemParams.f43114g);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestMigrateServerItemParams)) {
            return false;
        }
        RequestMigrateServerItemParams requestMigrateServerItemParams = (RequestMigrateServerItemParams) obj;
        return AbstractC19074t.m100204b(this.f43108a, requestMigrateServerItemParams.f43108a) && AbstractC19074t.m100204b(this.f43109b, requestMigrateServerItemParams.f43109b) && AbstractC19074t.m100204b(this.f43110c, requestMigrateServerItemParams.f43110c) && AbstractC19074t.m100204b(this.f43111d, requestMigrateServerItemParams.f43111d) && AbstractC19074t.m100204b(this.f43112e, requestMigrateServerItemParams.f43112e) && AbstractC19074t.m100204b(this.f43113f, requestMigrateServerItemParams.f43113f) && AbstractC19074t.m100204b(this.f43114g, requestMigrateServerItemParams.f43114g);
    }

    public int hashCode() {
        int hashCode = ((this.f43108a.hashCode() * 31) + this.f43109b.hashCode()) * 31;
        String str = this.f43110c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f43111d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f43112e;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f43113f;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f43114g;
        return hashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "RequestMigrateServerItemParams(msgInfo=" + this.f43108a + ", url=" + this.f43109b + ", thumbUrl=" + this.f43110c + ", encryptInfo=" + this.f43111d + ", checksum=" + this.f43112e + ", mediaExtInfo=" + this.f43113f + ", mediaExtEncryptInfo=" + this.f43114g + ")";
    }

    public RequestMigrateServerItemParams(MsgInfo msgInfo, String str, String str2, String str3, String str4, String str5, String str6) {
        AbstractC19074t.m100208f(msgInfo, "msgInfo");
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        this.f43108a = msgInfo;
        this.f43109b = str;
        this.f43110c = str2;
        this.f43111d = str3;
        this.f43112e = str4;
        this.f43113f = str5;
        this.f43114g = str6;
    }
}

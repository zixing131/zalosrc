package com.zing.zalo.shortvideo.data.remote.common;

import androidx.work.AbstractC2147g0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import qn0.InterfaceC25392g;
import tn0.AbstractC26774a1;
import tn0.AbstractC26805k1;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class RestResponse<T> {
    public static final Companion Companion = new Companion(null);

    /* renamed from: e */
    private static final SerialDescriptor f50188e;

    /* renamed from: a */
    private final int f50189a;

    /* renamed from: b */
    private final String f50190b;

    /* renamed from: c */
    private final Object f50191c;

    /* renamed from: d */
    private final long f50192d;

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final <T0> KSerializer serializer(KSerializer kSerializer) {
            AbstractC19074t.m100208f(kSerializer, "typeSerial0");
            return new RestResponse$$serializer(kSerializer);
        }
    }

    static {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.shortvideo.data.remote.common.RestResponse", null, 4);
        pluginGeneratedSerialDescriptor.m114047n("code", false);
        pluginGeneratedSerialDescriptor.m114047n("msg", false);
        pluginGeneratedSerialDescriptor.m114047n("data", false);
        pluginGeneratedSerialDescriptor.m114047n("serverTime", false);
        f50188e = pluginGeneratedSerialDescriptor;
    }

    public /* synthetic */ RestResponse(int i11, int i12, String str, Object obj, long j11, AbstractC26805k1 abstractC26805k1) {
        if (15 != (i11 & 15)) {
            AbstractC26774a1.m137800b(i11, 15, f50188e);
        }
        this.f50189a = i12;
        this.f50190b = str;
        this.f50191c = obj;
        this.f50192d = j11;
    }

    /* renamed from: e */
    public static final /* synthetic */ void m51530e(RestResponse restResponse, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor, KSerializer kSerializer) {
        interfaceC21886d.mo114033x(serialDescriptor, 0, restResponse.f50189a);
        interfaceC21886d.mo114035z(serialDescriptor, 1, restResponse.f50190b);
        interfaceC21886d.mo114028h(serialDescriptor, 2, kSerializer, restResponse.f50191c);
        interfaceC21886d.mo114022E(serialDescriptor, 3, restResponse.f50192d);
    }

    /* renamed from: a */
    public final int m51531a() {
        return this.f50189a;
    }

    /* renamed from: b */
    public final Object m51532b() {
        return this.f50191c;
    }

    /* renamed from: c */
    public final String m51533c() {
        return this.f50190b;
    }

    /* renamed from: d */
    public final long m51534d() {
        return this.f50192d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RestResponse)) {
            return false;
        }
        RestResponse restResponse = (RestResponse) obj;
        return this.f50189a == restResponse.f50189a && AbstractC19074t.m100204b(this.f50190b, restResponse.f50190b) && AbstractC19074t.m100204b(this.f50191c, restResponse.f50191c) && this.f50192d == restResponse.f50192d;
    }

    public int hashCode() {
        int hashCode = ((this.f50189a * 31) + this.f50190b.hashCode()) * 31;
        Object obj = this.f50191c;
        return ((hashCode + (obj == null ? 0 : obj.hashCode())) * 31) + AbstractC2147g0.m11521a(this.f50192d);
    }

    public String toString() {
        return "RestResponse(code=" + this.f50189a + ", msg=" + this.f50190b + ", data=" + this.f50191c + ", serverTime=" + this.f50192d + ")";
    }

    public RestResponse(int i11, String str, Object obj, long j11) {
        AbstractC19074t.m100208f(str, "msg");
        this.f50189a = i11;
        this.f50190b = str;
        this.f50191c = obj;
        this.f50192d = j11;
    }
}

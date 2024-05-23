package com.zing.zalo.shortvideo.data.remote.common;

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
/* loaded from: classes5.dex */
public final class SimpleRestResponse {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final int f50193a;

    /* renamed from: b */
    private final String f50194b;

    /* renamed from: c */
    private final long f50195c;

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return SimpleRestResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SimpleRestResponse(int i11, int i12, String str, long j11, AbstractC26805k1 abstractC26805k1) {
        if (7 != (i11 & 7)) {
            AbstractC26774a1.m137800b(i11, 7, SimpleRestResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.f50193a = i12;
        this.f50194b = str;
        this.f50195c = j11;
    }

    /* renamed from: d */
    public static final /* synthetic */ void m51535d(SimpleRestResponse simpleRestResponse, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        interfaceC21886d.mo114033x(serialDescriptor, 0, simpleRestResponse.f50193a);
        interfaceC21886d.mo114035z(serialDescriptor, 1, simpleRestResponse.f50194b);
        interfaceC21886d.mo114022E(serialDescriptor, 2, simpleRestResponse.f50195c);
    }

    /* renamed from: a */
    public final int m51536a() {
        return this.f50193a;
    }

    /* renamed from: b */
    public final String m51537b() {
        return this.f50194b;
    }

    /* renamed from: c */
    public final long m51538c() {
        return this.f50195c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimpleRestResponse)) {
            return false;
        }
        SimpleRestResponse simpleRestResponse = (SimpleRestResponse) obj;
        return this.f50193a == simpleRestResponse.f50193a && AbstractC19074t.m100204b(this.f50194b, simpleRestResponse.f50194b) && this.f50195c == simpleRestResponse.f50195c;
    }

    public int hashCode() {
        return (((this.f50193a * 31) + this.f50194b.hashCode()) * 31) + AbstractC2147g0.m11521a(this.f50195c);
    }

    public String toString() {
        return "SimpleRestResponse(code=" + this.f50193a + ", msg=" + this.f50194b + ", serverTime=" + this.f50195c + ")";
    }
}

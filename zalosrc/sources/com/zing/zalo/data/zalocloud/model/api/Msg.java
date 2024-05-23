package com.zing.zalo.data.zalocloud.model.api;

import androidx.work.AbstractC2147g0;
import fn0.AbstractC19060k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import qn0.InterfaceC25392g;
import tn0.AbstractC26774a1;
import tn0.AbstractC26805k1;

@InterfaceC25392g
/* loaded from: classes3.dex */
public final class Msg {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final int f43088a;

    /* renamed from: b */
    private final long f43089b;

    /* renamed from: c */
    private final long f43090c;

    /* renamed from: d */
    private final long f43091d;

    /* renamed from: e */
    private final long f43092e;

    /* renamed from: f */
    private final long f43093f;

    /* renamed from: g */
    private final long f43094g;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return Msg$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Msg(int i11, int i12, long j11, long j12, long j13, long j14, long j15, long j16, AbstractC26805k1 abstractC26805k1) {
        long j17;
        if (63 != (i11 & 63)) {
            AbstractC26774a1.m137800b(i11, 63, Msg$$serializer.INSTANCE.getDescriptor());
        }
        this.f43088a = i12;
        this.f43089b = j11;
        this.f43090c = j12;
        this.f43091d = j13;
        this.f43092e = j14;
        this.f43093f = j15;
        if ((i11 & 64) == 0) {
            j17 = 0;
        } else {
            j17 = j16;
        }
        this.f43094g = j17;
    }

    /* renamed from: c */
    public static final /* synthetic */ void m41357c(Msg msg, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        interfaceC21886d.mo114033x(serialDescriptor, 0, msg.f43088a);
        interfaceC21886d.mo114022E(serialDescriptor, 1, msg.f43089b);
        interfaceC21886d.mo114022E(serialDescriptor, 2, msg.f43090c);
        interfaceC21886d.mo114022E(serialDescriptor, 3, msg.f43091d);
        interfaceC21886d.mo114022E(serialDescriptor, 4, msg.f43092e);
        interfaceC21886d.mo114022E(serialDescriptor, 5, msg.f43093f);
        if (interfaceC21886d.mo114019A(serialDescriptor, 6) || msg.f43094g != 0) {
            interfaceC21886d.mo114022E(serialDescriptor, 6, msg.f43094g);
        }
    }

    /* renamed from: a */
    public final long m41358a() {
        return this.f43091d;
    }

    /* renamed from: b */
    public final long m41359b() {
        return this.f43092e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Msg)) {
            return false;
        }
        Msg msg = (Msg) obj;
        return this.f43088a == msg.f43088a && this.f43089b == msg.f43089b && this.f43090c == msg.f43090c && this.f43091d == msg.f43091d && this.f43092e == msg.f43092e && this.f43093f == msg.f43093f && this.f43094g == msg.f43094g;
    }

    public int hashCode() {
        return (((((((((((this.f43088a * 31) + AbstractC2147g0.m11521a(this.f43089b)) * 31) + AbstractC2147g0.m11521a(this.f43090c)) * 31) + AbstractC2147g0.m11521a(this.f43091d)) * 31) + AbstractC2147g0.m11521a(this.f43092e)) * 31) + AbstractC2147g0.m11521a(this.f43093f)) * 31) + AbstractC2147g0.m11521a(this.f43094g);
    }

    public String toString() {
        return "Msg(type=" + this.f43088a + ", uidFrom=" + this.f43089b + ", uidTo=" + this.f43090c + ", clientDelMsgId=" + this.f43091d + ", globalDelMsgId=" + this.f43092e + ", destId=" + this.f43093f + ", mediaSize=" + this.f43094g + ")";
    }
}

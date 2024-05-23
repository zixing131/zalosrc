package com.zing.zalo.data.zalocloud.model.api;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import qn0.InterfaceC25392g;
import tn0.AbstractC26774a1;
import tn0.AbstractC26805k1;
import tn0.C26788f;
import tn0.C26814n1;

@InterfaceC25392g
/* loaded from: classes3.dex */
public final class VerifyCloudQueueResponse {
    public static final Companion Companion = new Companion(null);

    /* renamed from: e */
    private static final KSerializer[] f43148e = {null, null, new C26788f(CloudMediaItemResponse$$serializer.INSTANCE), new C26788f(C26814n1.f127034a)};

    /* renamed from: a */
    private final String f43149a;

    /* renamed from: b */
    private final int f43150b;

    /* renamed from: c */
    private final List f43151c;

    /* renamed from: d */
    private final List f43152d;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return VerifyCloudQueueResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ VerifyCloudQueueResponse(int i11, String str, int i12, List list, List list2, AbstractC26805k1 abstractC26805k1) {
        if (15 != (i11 & 15)) {
            AbstractC26774a1.m137800b(i11, 15, VerifyCloudQueueResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.f43149a = str;
        this.f43150b = i12;
        this.f43151c = list;
        this.f43152d = list2;
    }

    /* renamed from: f */
    public static final /* synthetic */ void m41393f(VerifyCloudQueueResponse verifyCloudQueueResponse, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f43148e;
        interfaceC21886d.mo114035z(serialDescriptor, 0, verifyCloudQueueResponse.f43149a);
        interfaceC21886d.mo114033x(serialDescriptor, 1, verifyCloudQueueResponse.f43150b);
        interfaceC21886d.mo114029i(serialDescriptor, 2, kSerializerArr[2], verifyCloudQueueResponse.f43151c);
        interfaceC21886d.mo114029i(serialDescriptor, 3, kSerializerArr[3], verifyCloudQueueResponse.f43152d);
    }

    /* renamed from: b */
    public final int m41394b() {
        return this.f43150b;
    }

    /* renamed from: c */
    public final String m41395c() {
        return this.f43149a;
    }

    /* renamed from: d */
    public final List m41396d() {
        return this.f43151c;
    }

    /* renamed from: e */
    public final String m41397e() {
        return "(mediaItems=" + this.f43151c.size() + ", lastNoiseId='" + this.f43149a + "', hasMore=" + this.f43150b + ", listVerifyNoiseIds=" + this.f43152d.size() + ")";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerifyCloudQueueResponse)) {
            return false;
        }
        VerifyCloudQueueResponse verifyCloudQueueResponse = (VerifyCloudQueueResponse) obj;
        return AbstractC19074t.m100204b(this.f43149a, verifyCloudQueueResponse.f43149a) && this.f43150b == verifyCloudQueueResponse.f43150b && AbstractC19074t.m100204b(this.f43151c, verifyCloudQueueResponse.f43151c) && AbstractC19074t.m100204b(this.f43152d, verifyCloudQueueResponse.f43152d);
    }

    public int hashCode() {
        return (((((this.f43149a.hashCode() * 31) + this.f43150b) * 31) + this.f43151c.hashCode()) * 31) + this.f43152d.hashCode();
    }

    public String toString() {
        return "VerifyCloudQueueResponse(lastNoiseId=" + this.f43149a + ", hasMore=" + this.f43150b + ", mediaItems=" + this.f43151c + ", listVerifyNoiseIds=" + this.f43152d + ")";
    }
}

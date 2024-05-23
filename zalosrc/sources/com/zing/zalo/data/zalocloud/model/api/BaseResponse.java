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
public final class BaseResponse {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final int f43020a;

    /* renamed from: b */
    private final String f43021b;

    /* renamed from: c */
    private final boolean f43022c;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return BaseResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BaseResponse(int i11, int i12, String str, boolean z11, AbstractC26805k1 abstractC26805k1) {
        if (3 != (i11 & 3)) {
            AbstractC26774a1.m137800b(i11, 3, BaseResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.f43020a = i12;
        this.f43021b = str;
        if ((i11 & 4) == 0) {
            this.f43022c = i12 != 0;
        } else {
            this.f43022c = z11;
        }
    }

    /* renamed from: d */
    public static final /* synthetic */ void m41270d(BaseResponse baseResponse, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        boolean z11 = false;
        interfaceC21886d.mo114033x(serialDescriptor, 0, baseResponse.f43020a);
        interfaceC21886d.mo114035z(serialDescriptor, 1, baseResponse.f43021b);
        if (!interfaceC21886d.mo114019A(serialDescriptor, 2)) {
            boolean z12 = baseResponse.f43022c;
            if (baseResponse.f43020a != 0) {
                z11 = true;
            }
            if (z12 == z11) {
                return;
            }
        }
        interfaceC21886d.mo114034y(serialDescriptor, 2, baseResponse.f43022c);
    }

    /* renamed from: a */
    public final int m41271a() {
        return this.f43020a;
    }

    /* renamed from: b */
    public final String m41272b() {
        return this.f43021b;
    }

    /* renamed from: c */
    public final boolean m41273c() {
        return this.f43022c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseResponse)) {
            return false;
        }
        BaseResponse baseResponse = (BaseResponse) obj;
        return this.f43020a == baseResponse.f43020a && AbstractC19074t.m100204b(this.f43021b, baseResponse.f43021b);
    }

    public int hashCode() {
        return (this.f43020a * 31) + this.f43021b.hashCode();
    }

    public String toString() {
        return "BaseResponse(errorCode=" + this.f43020a + ", errorMessage=" + this.f43021b + ")";
    }

    public BaseResponse(int i11, String str) {
        AbstractC19074t.m100208f(str, "errorMessage");
        this.f43020a = i11;
        this.f43021b = str;
        this.f43022c = i11 != 0;
    }
}

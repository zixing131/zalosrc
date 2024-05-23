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
public final class SubmitCloudKeyResponse {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final int f43118a;

    /* renamed from: b */
    private final String f43119b;

    /* renamed from: c */
    private final Data f43120c;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return SubmitCloudKeyResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SubmitCloudKeyResponse(int i11, int i12, String str, Data data, AbstractC26805k1 abstractC26805k1) {
        if (7 != (i11 & 7)) {
            AbstractC26774a1.m137800b(i11, 7, SubmitCloudKeyResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.f43118a = i12;
        this.f43119b = str;
        this.f43120c = data;
    }

    /* renamed from: c */
    public static final /* synthetic */ void m41381c(SubmitCloudKeyResponse submitCloudKeyResponse, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        interfaceC21886d.mo114033x(serialDescriptor, 0, submitCloudKeyResponse.f43118a);
        interfaceC21886d.mo114035z(serialDescriptor, 1, submitCloudKeyResponse.f43119b);
        interfaceC21886d.mo114028h(serialDescriptor, 2, Data$$serializer.INSTANCE, submitCloudKeyResponse.f43120c);
    }

    /* renamed from: a */
    public final Data m41382a() {
        return this.f43120c;
    }

    /* renamed from: b */
    public final int m41383b() {
        return this.f43118a;
    }

    public SubmitCloudKeyResponse(int i11, String str, Data data) {
        AbstractC19074t.m100208f(str, "errorMessage");
        this.f43118a = i11;
        this.f43119b = str;
        this.f43120c = data;
    }
}

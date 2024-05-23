package com.zing.zalo.data.zalocloud.model.api;

import fn0.AbstractC19060k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import qn0.InterfaceC25392g;
import tn0.AbstractC26805k1;
import tn0.C26810m0;

@InterfaceC25392g
/* loaded from: classes3.dex */
public final class Data {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final Long f43067a;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return Data$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Data(int i11, Long l11, AbstractC26805k1 abstractC26805k1) {
        if ((i11 & 1) == 0) {
            this.f43067a = -1L;
        } else {
            this.f43067a = l11;
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ void m41331b(Data data, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        Long l11;
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || (l11 = data.f43067a) == null || l11.longValue() != -1) {
            interfaceC21886d.mo114028h(serialDescriptor, 0, C26810m0.f127024a, data.f43067a);
        }
    }

    /* renamed from: a */
    public final Long m41332a() {
        return this.f43067a;
    }
}

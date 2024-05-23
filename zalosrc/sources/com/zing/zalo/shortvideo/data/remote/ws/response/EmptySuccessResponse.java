package com.zing.zalo.shortvideo.data.remote.ws.response;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import qn0.InterfaceC25392g;
import tn0.AbstractC26805k1;
import tn0.C26794h;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class EmptySuccessResponse {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final Boolean f50253a;

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return EmptySuccessResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EmptySuccessResponse(int i11, Boolean bool, AbstractC26805k1 abstractC26805k1) {
        if ((i11 & 1) == 0) {
            this.f50253a = Boolean.TRUE;
        } else {
            this.f50253a = bool;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ void m51630a(EmptySuccessResponse emptySuccessResponse, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || !AbstractC19074t.m100204b(emptySuccessResponse.f50253a, Boolean.TRUE)) {
            interfaceC21886d.mo114028h(serialDescriptor, 0, C26794h.f127000a, emptySuccessResponse.f50253a);
        }
    }
}

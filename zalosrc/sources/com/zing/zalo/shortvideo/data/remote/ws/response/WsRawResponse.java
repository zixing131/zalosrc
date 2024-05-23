package com.zing.zalo.shortvideo.data.remote.ws.response;

import fn0.AbstractC19060k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import qn0.InterfaceC25392g;
import tn0.AbstractC26805k1;
import tn0.C26783d0;
import tn0.C26814n1;

@InterfaceC25392g
/* loaded from: classes5.dex */
public class WsRawResponse {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final Integer f50348a;

    /* renamed from: b */
    private final String f50349b;

    /* renamed from: c */
    private final String f50350c;

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return WsRawResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WsRawResponse(int i11, Integer num, String str, String str2, AbstractC26805k1 abstractC26805k1) {
        if ((i11 & 1) == 0) {
            this.f50348a = null;
        } else {
            this.f50348a = num;
        }
        if ((i11 & 2) == 0) {
            this.f50349b = null;
        } else {
            this.f50349b = str;
        }
        if ((i11 & 4) == 0) {
            this.f50350c = null;
        } else {
            this.f50350c = str2;
        }
    }

    /* renamed from: d */
    public static final /* synthetic */ void m51705d(WsRawResponse wsRawResponse, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || wsRawResponse.f50348a != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 0, C26783d0.f126989a, wsRawResponse.f50348a);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || wsRawResponse.f50349b != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 1, C26814n1.f127034a, wsRawResponse.f50349b);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || wsRawResponse.f50350c != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 2, C26814n1.f127034a, wsRawResponse.f50350c);
        }
    }

    /* renamed from: a */
    public final String m51706a() {
        return this.f50350c;
    }

    /* renamed from: b */
    public final Integer m51707b() {
        return this.f50348a;
    }

    /* renamed from: c */
    public final String m51708c() {
        return this.f50349b;
    }
}

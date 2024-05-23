package com.zing.zalo.shortvideo.data.remote.ws.response;

import fn0.AbstractC19060k;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import qn0.InterfaceC25392g;
import tn0.AbstractC26805k1;
import tn0.C26788f;
import tn0.C26794h;
import tn0.C26810m0;
import tn0.C26814n1;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class EntryEventResponse {
    public static final Companion Companion = new Companion(null);

    /* renamed from: c */
    private static final KSerializer[] f50254c = {null, new C26788f(EntryEventResponse$LiveUser$$serializer.INSTANCE)};

    /* renamed from: a */
    private final Long f50255a;

    /* renamed from: b */
    private final List f50256b;

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return EntryEventResponse$$serializer.INSTANCE;
        }
    }

    @InterfaceC25392g
    /* loaded from: classes5.dex */
    public static final class LiveUser {
        public static final Companion Companion = new Companion(null);

        /* renamed from: a */
        private final Long f50257a;

        /* renamed from: b */
        private final Boolean f50258b;

        /* renamed from: c */
        private final String f50259c;

        /* renamed from: d */
        private final String f50260d;

        /* loaded from: classes5.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
                this();
            }

            public final KSerializer serializer() {
                return EntryEventResponse$LiveUser$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ LiveUser(int i11, Long l11, Boolean bool, String str, String str2, AbstractC26805k1 abstractC26805k1) {
            if ((i11 & 1) == 0) {
                this.f50257a = null;
            } else {
                this.f50257a = l11;
            }
            if ((i11 & 2) == 0) {
                this.f50258b = null;
            } else {
                this.f50258b = bool;
            }
            if ((i11 & 4) == 0) {
                this.f50259c = null;
            } else {
                this.f50259c = str;
            }
            if ((i11 & 8) == 0) {
                this.f50260d = null;
            } else {
                this.f50260d = str2;
            }
        }

        /* renamed from: a */
        public static final /* synthetic */ void m51635a(LiveUser liveUser, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
            if (interfaceC21886d.mo114019A(serialDescriptor, 0) || liveUser.f50257a != null) {
                interfaceC21886d.mo114028h(serialDescriptor, 0, C26810m0.f127024a, liveUser.f50257a);
            }
            if (interfaceC21886d.mo114019A(serialDescriptor, 1) || liveUser.f50258b != null) {
                interfaceC21886d.mo114028h(serialDescriptor, 1, C26794h.f127000a, liveUser.f50258b);
            }
            if (interfaceC21886d.mo114019A(serialDescriptor, 2) || liveUser.f50259c != null) {
                interfaceC21886d.mo114028h(serialDescriptor, 2, C26814n1.f127034a, liveUser.f50259c);
            }
            if (interfaceC21886d.mo114019A(serialDescriptor, 3) || liveUser.f50260d != null) {
                interfaceC21886d.mo114028h(serialDescriptor, 3, C26814n1.f127034a, liveUser.f50260d);
            }
        }
    }

    public /* synthetic */ EntryEventResponse(int i11, Long l11, List list, AbstractC26805k1 abstractC26805k1) {
        if ((i11 & 1) == 0) {
            this.f50255a = null;
        } else {
            this.f50255a = l11;
        }
        if ((i11 & 2) == 0) {
            this.f50256b = null;
        } else {
            this.f50256b = list;
        }
    }

    /* renamed from: d */
    public static final /* synthetic */ void m51632d(EntryEventResponse entryEventResponse, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f50254c;
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || entryEventResponse.f50255a != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 0, C26810m0.f127024a, entryEventResponse.f50255a);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || entryEventResponse.f50256b != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 1, kSerializerArr[1], entryEventResponse.f50256b);
        }
    }

    /* renamed from: b */
    public final List m51633b() {
        return this.f50256b;
    }

    /* renamed from: c */
    public final Long m51634c() {
        return this.f50255a;
    }
}

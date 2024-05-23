package com.zing.zalo.shortvideo.data.remote.ws.response;

import fn0.AbstractC19060k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import qn0.InterfaceC25392g;
import tn0.AbstractC26805k1;
import tn0.C26794h;
import tn0.C26810m0;
import tn0.C26814n1;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class BlockUserCommentByOwner {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final String f50246a;

    /* renamed from: b */
    private final Long f50247b;

    /* renamed from: c */
    private final Boolean f50248c;

    /* renamed from: d */
    private final Boolean f50249d;

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return BlockUserCommentByOwner$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BlockUserCommentByOwner(int i11, String str, Long l11, Boolean bool, Boolean bool2, AbstractC26805k1 abstractC26805k1) {
        if ((i11 & 1) == 0) {
            this.f50246a = null;
        } else {
            this.f50246a = str;
        }
        if ((i11 & 2) == 0) {
            this.f50247b = null;
        } else {
            this.f50247b = l11;
        }
        if ((i11 & 4) == 0) {
            this.f50248c = null;
        } else {
            this.f50248c = bool;
        }
        if ((i11 & 8) == 0) {
            this.f50249d = null;
        } else {
            this.f50249d = bool2;
        }
    }

    /* renamed from: e */
    public static final /* synthetic */ void m51621e(BlockUserCommentByOwner blockUserCommentByOwner, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || blockUserCommentByOwner.f50246a != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 0, C26814n1.f127034a, blockUserCommentByOwner.f50246a);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || blockUserCommentByOwner.f50247b != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 1, C26810m0.f127024a, blockUserCommentByOwner.f50247b);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || blockUserCommentByOwner.f50248c != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 2, C26794h.f127000a, blockUserCommentByOwner.f50248c);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 3) || blockUserCommentByOwner.f50249d != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 3, C26794h.f127000a, blockUserCommentByOwner.f50249d);
        }
    }

    /* renamed from: a */
    public final String m51622a() {
        return this.f50246a;
    }

    /* renamed from: b */
    public final Long m51623b() {
        return this.f50247b;
    }

    /* renamed from: c */
    public final Boolean m51624c() {
        return this.f50248c;
    }

    /* renamed from: d */
    public final Boolean m51625d() {
        return this.f50249d;
    }
}

package com.zing.zalo.shortvideo.data.remote.ws.response;

import fn0.AbstractC19060k;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import qn0.InterfaceC25392g;
import tn0.AbstractC26805k1;
import tn0.C26788f;
import tn0.C26810m0;
import tn0.C26814n1;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class DeleteCommentByOwner {
    public static final Companion Companion = new Companion(null);

    /* renamed from: c */
    private static final KSerializer[] f50250c = {null, new C26788f(C26810m0.f127024a)};

    /* renamed from: a */
    private final String f50251a;

    /* renamed from: b */
    private final List f50252b;

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return DeleteCommentByOwner$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DeleteCommentByOwner(int i11, String str, List list, AbstractC26805k1 abstractC26805k1) {
        if ((i11 & 1) == 0) {
            this.f50251a = null;
        } else {
            this.f50251a = str;
        }
        if ((i11 & 2) == 0) {
            this.f50252b = null;
        } else {
            this.f50252b = list;
        }
    }

    /* renamed from: d */
    public static final /* synthetic */ void m51627d(DeleteCommentByOwner deleteCommentByOwner, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f50250c;
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || deleteCommentByOwner.f50251a != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 0, C26814n1.f127034a, deleteCommentByOwner.f50251a);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || deleteCommentByOwner.f50252b != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 1, kSerializerArr[1], deleteCommentByOwner.f50252b);
        }
    }

    /* renamed from: b */
    public final List m51628b() {
        return this.f50252b;
    }

    /* renamed from: c */
    public final String m51629c() {
        return this.f50251a;
    }
}

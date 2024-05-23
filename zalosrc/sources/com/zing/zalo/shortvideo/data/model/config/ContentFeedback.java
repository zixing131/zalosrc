package com.zing.zalo.shortvideo.data.model.config;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import qn0.InterfaceC25392g;
import tn0.AbstractC26805k1;
import tn0.C26783d0;
import tn0.C26814n1;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class ContentFeedback {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final Integer f50112a;

    /* renamed from: b */
    private final String f50113b;

    /* renamed from: c */
    private final String f50114c;

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return ContentFeedback$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ContentFeedback(int i11, Integer num, String str, String str2, AbstractC26805k1 abstractC26805k1) {
        if ((i11 & 1) == 0) {
            this.f50112a = null;
        } else {
            this.f50112a = num;
        }
        if ((i11 & 2) == 0) {
            this.f50113b = null;
        } else {
            this.f50113b = str;
        }
        if ((i11 & 4) == 0) {
            this.f50114c = null;
        } else {
            this.f50114c = str2;
        }
    }

    /* renamed from: d */
    public static final /* synthetic */ void m51433d(ContentFeedback contentFeedback, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || contentFeedback.f50112a != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 0, C26783d0.f126989a, contentFeedback.f50112a);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || contentFeedback.f50113b != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 1, C26814n1.f127034a, contentFeedback.f50113b);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || contentFeedback.f50114c != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 2, C26814n1.f127034a, contentFeedback.f50114c);
        }
    }

    /* renamed from: a */
    public final String m51434a() {
        return this.f50114c;
    }

    /* renamed from: b */
    public final Integer m51435b() {
        return this.f50112a;
    }

    /* renamed from: c */
    public final String m51436c() {
        return this.f50113b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentFeedback)) {
            return false;
        }
        ContentFeedback contentFeedback = (ContentFeedback) obj;
        return AbstractC19074t.m100204b(this.f50112a, contentFeedback.f50112a) && AbstractC19074t.m100204b(this.f50113b, contentFeedback.f50113b) && AbstractC19074t.m100204b(this.f50114c, contentFeedback.f50114c);
    }

    public int hashCode() {
        Integer num = this.f50112a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f50113b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f50114c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "ContentFeedback(id=" + this.f50112a + ", viText=" + this.f50113b + ", enText=" + this.f50114c + ")";
    }

    public ContentFeedback(Integer num, String str, String str2) {
        this.f50112a = num;
        this.f50113b = str;
        this.f50114c = str2;
    }
}

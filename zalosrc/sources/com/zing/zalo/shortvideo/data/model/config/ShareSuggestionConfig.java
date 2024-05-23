package com.zing.zalo.shortvideo.data.model.config;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import qn0.InterfaceC25392g;
import tn0.AbstractC26805k1;
import tn0.C26783d0;
import tn0.C26794h;
import tn0.C26810m0;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class ShareSuggestionConfig {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final Integer f50149a;

    /* renamed from: b */
    private final Long f50150b;

    /* renamed from: c */
    private final Boolean f50151c;

    /* renamed from: d */
    private final Boolean f50152d;

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return ShareSuggestionConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ShareSuggestionConfig(int i11, Integer num, Long l11, Boolean bool, Boolean bool2, AbstractC26805k1 abstractC26805k1) {
        if ((i11 & 1) == 0) {
            this.f50149a = null;
        } else {
            this.f50149a = num;
        }
        if ((i11 & 2) == 0) {
            this.f50150b = null;
        } else {
            this.f50150b = l11;
        }
        if ((i11 & 4) == 0) {
            this.f50151c = null;
        } else {
            this.f50151c = bool;
        }
        if ((i11 & 8) == 0) {
            this.f50152d = null;
        } else {
            this.f50152d = bool2;
        }
    }

    /* renamed from: e */
    public static final /* synthetic */ void m51485e(ShareSuggestionConfig shareSuggestionConfig, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || shareSuggestionConfig.f50149a != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 0, C26783d0.f126989a, shareSuggestionConfig.f50149a);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || shareSuggestionConfig.f50150b != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 1, C26810m0.f127024a, shareSuggestionConfig.f50150b);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || shareSuggestionConfig.f50151c != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 2, C26794h.f127000a, shareSuggestionConfig.f50151c);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 3) || shareSuggestionConfig.f50152d != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 3, C26794h.f127000a, shareSuggestionConfig.f50152d);
        }
    }

    /* renamed from: a */
    public final Boolean m51486a() {
        return this.f50151c;
    }

    /* renamed from: b */
    public final Boolean m51487b() {
        return this.f50152d;
    }

    /* renamed from: c */
    public final Integer m51488c() {
        return this.f50149a;
    }

    /* renamed from: d */
    public final Long m51489d() {
        return this.f50150b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareSuggestionConfig)) {
            return false;
        }
        ShareSuggestionConfig shareSuggestionConfig = (ShareSuggestionConfig) obj;
        return AbstractC19074t.m100204b(this.f50149a, shareSuggestionConfig.f50149a) && AbstractC19074t.m100204b(this.f50150b, shareSuggestionConfig.f50150b) && AbstractC19074t.m100204b(this.f50151c, shareSuggestionConfig.f50151c) && AbstractC19074t.m100204b(this.f50152d, shareSuggestionConfig.f50152d);
    }

    public int hashCode() {
        Integer num = this.f50149a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l11 = this.f50150b;
        int hashCode2 = (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        Boolean bool = this.f50151c;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f50152d;
        return hashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        return "ShareSuggestionConfig(repeatAfter=" + this.f50149a + ", watchTimeMillis=" + this.f50150b + ", allowSuggestMessage=" + this.f50151c + ", allowSuggestTimeLine=" + this.f50152d + ")";
    }

    public ShareSuggestionConfig(Integer num, Long l11, Boolean bool, Boolean bool2) {
        this.f50149a = num;
        this.f50150b = l11;
        this.f50151c = bool;
        this.f50152d = bool2;
    }
}

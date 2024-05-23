package com.zing.zalo.shortvideo.data.model.config;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import qn0.InterfaceC25392g;
import tn0.AbstractC26805k1;
import tn0.C26783d0;
import tn0.C26810m0;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class LikeSuggestionConfig {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final Integer f50143a;

    /* renamed from: b */
    private final Long f50144b;

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return LikeSuggestionConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LikeSuggestionConfig(int i11, Integer num, Long l11, AbstractC26805k1 abstractC26805k1) {
        if ((i11 & 1) == 0) {
            this.f50143a = null;
        } else {
            this.f50143a = num;
        }
        if ((i11 & 2) == 0) {
            this.f50144b = null;
        } else {
            this.f50144b = l11;
        }
    }

    /* renamed from: c */
    public static final /* synthetic */ void m51469c(LikeSuggestionConfig likeSuggestionConfig, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || likeSuggestionConfig.f50143a != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 0, C26783d0.f126989a, likeSuggestionConfig.f50143a);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || likeSuggestionConfig.f50144b != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 1, C26810m0.f127024a, likeSuggestionConfig.f50144b);
        }
    }

    /* renamed from: a */
    public final Integer m51470a() {
        return this.f50143a;
    }

    /* renamed from: b */
    public final Long m51471b() {
        return this.f50144b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LikeSuggestionConfig)) {
            return false;
        }
        LikeSuggestionConfig likeSuggestionConfig = (LikeSuggestionConfig) obj;
        return AbstractC19074t.m100204b(this.f50143a, likeSuggestionConfig.f50143a) && AbstractC19074t.m100204b(this.f50144b, likeSuggestionConfig.f50144b);
    }

    public int hashCode() {
        Integer num = this.f50143a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l11 = this.f50144b;
        return hashCode + (l11 != null ? l11.hashCode() : 0);
    }

    public String toString() {
        return "LikeSuggestionConfig(repeatAfter=" + this.f50143a + ", watchTimeMillis=" + this.f50144b + ")";
    }

    public LikeSuggestionConfig(Integer num, Long l11) {
        this.f50143a = num;
        this.f50144b = l11;
    }
}

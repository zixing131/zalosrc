package com.zing.zalo.shortvideo.data.model.config;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import qn0.InterfaceC25392g;
import tn0.AbstractC26805k1;
import tn0.C26814n1;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class NotiCategories {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final String f50147a;

    /* renamed from: b */
    private final String f50148b;

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return NotiCategories$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NotiCategories(int i11, String str, String str2, AbstractC26805k1 abstractC26805k1) {
        if ((i11 & 1) == 0) {
            this.f50147a = null;
        } else {
            this.f50147a = str;
        }
        if ((i11 & 2) == 0) {
            this.f50148b = null;
        } else {
            this.f50148b = str2;
        }
    }

    /* renamed from: c */
    public static final /* synthetic */ void m51482c(NotiCategories notiCategories, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || notiCategories.f50147a != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 0, C26814n1.f127034a, notiCategories.f50147a);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || notiCategories.f50148b != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 1, C26814n1.f127034a, notiCategories.f50148b);
        }
    }

    /* renamed from: a */
    public final String m51483a() {
        return this.f50147a;
    }

    /* renamed from: b */
    public final String m51484b() {
        return this.f50148b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotiCategories)) {
            return false;
        }
        NotiCategories notiCategories = (NotiCategories) obj;
        return AbstractC19074t.m100204b(this.f50147a, notiCategories.f50147a) && AbstractC19074t.m100204b(this.f50148b, notiCategories.f50148b);
    }

    public int hashCode() {
        String str = this.f50147a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f50148b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "NotiCategories(id=" + this.f50147a + ", title=" + this.f50148b + ")";
    }

    public NotiCategories(String str, String str2) {
        this.f50147a = str;
        this.f50148b = str2;
    }
}

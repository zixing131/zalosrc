package com.zing.zalo.feed.data;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import me0.AbstractC23059e9;
import qn0.InterfaceC25392g;
import tn0.AbstractC26805k1;

@InterfaceC25392g
/* loaded from: classes4.dex */
public final class TextLocalization {
    public static final Companion Companion = new Companion(null);

    /* renamed from: c */
    private static final TextLocalization f45907c = new TextLocalization((String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), 3, (AbstractC19060k) (0 == true ? 1 : 0));

    /* renamed from: a */
    private final String f45908a;

    /* renamed from: b */
    private final String f45909b;

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final TextLocalization m44978a() {
            return TextLocalization.f45907c;
        }

        public final KSerializer serializer() {
            return TextLocalization$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TextLocalization(int i11, String str, String str2, AbstractC26805k1 abstractC26805k1) {
        if ((i11 & 1) == 0) {
            this.f45908a = "";
        } else {
            this.f45908a = str;
        }
        if ((i11 & 2) == 0) {
            this.f45909b = "";
        } else {
            this.f45909b = str2;
        }
    }

    /* renamed from: c */
    public static final /* synthetic */ void m44976c(TextLocalization textLocalization, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || !AbstractC19074t.m100204b(textLocalization.f45908a, "")) {
            interfaceC21886d.mo114035z(serialDescriptor, 0, textLocalization.f45908a);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || !AbstractC19074t.m100204b(textLocalization.f45909b, "")) {
            interfaceC21886d.mo114035z(serialDescriptor, 1, textLocalization.f45909b);
        }
    }

    /* renamed from: b */
    public final String m44977b() {
        if (AbstractC23059e9.m118342u()) {
            return this.f45908a;
        }
        return this.f45909b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextLocalization)) {
            return false;
        }
        TextLocalization textLocalization = (TextLocalization) obj;
        return AbstractC19074t.m100204b(this.f45908a, textLocalization.f45908a) && AbstractC19074t.m100204b(this.f45909b, textLocalization.f45909b);
    }

    public int hashCode() {
        return (this.f45908a.hashCode() * 31) + this.f45909b.hashCode();
    }

    public String toString() {
        return "TextLocalization(vi=" + this.f45908a + ", en=" + this.f45909b + ")";
    }

    public TextLocalization(String str, String str2) {
        AbstractC19074t.m100208f(str, "vi");
        AbstractC19074t.m100208f(str2, "en");
        this.f45908a = str;
        this.f45909b = str2;
    }

    public /* synthetic */ TextLocalization(String str, String str2, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2);
    }
}

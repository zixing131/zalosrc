package com.zing.zalo.feed.data;

import androidx.annotation.Keep;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import me0.C23212s8;
import qn0.InterfaceC25392g;
import tn0.AbstractC26805k1;

@InterfaceC25392g
@Keep
/* loaded from: classes4.dex */
public final class StringTheme {
    public static final Companion Companion = new Companion(null);
    private static final StringTheme Default = new StringTheme((String) null, (String) null, 3, (AbstractC19060k) null);

    /* renamed from: d */
    private final String f45905d;

    /* renamed from: l */
    private final String f45906l;

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final StringTheme m44974a() {
            return StringTheme.Default;
        }

        public final KSerializer serializer() {
            return StringTheme$$serializer.INSTANCE;
        }
    }

    public StringTheme() {
        this((String) null, (String) null, 3, (AbstractC19060k) null);
    }

    private final String component1() {
        return this.f45906l;
    }

    private final String component2() {
        return this.f45905d;
    }

    public static /* synthetic */ StringTheme copy$default(StringTheme stringTheme, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = stringTheme.f45906l;
        }
        if ((i11 & 2) != 0) {
            str2 = stringTheme.f45905d;
        }
        return stringTheme.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$app_release(StringTheme stringTheme, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || !AbstractC19074t.m100204b(stringTheme.f45906l, "")) {
            interfaceC21886d.mo114035z(serialDescriptor, 0, stringTheme.f45906l);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || !AbstractC19074t.m100204b(stringTheme.f45905d, "")) {
            interfaceC21886d.mo114035z(serialDescriptor, 1, stringTheme.f45905d);
        }
    }

    public final StringTheme copy(String str, String str2) {
        AbstractC19074t.m100208f(str, "l");
        AbstractC19074t.m100208f(str2, "d");
        return new StringTheme(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StringTheme)) {
            return false;
        }
        StringTheme stringTheme = (StringTheme) obj;
        return AbstractC19074t.m100204b(this.f45906l, stringTheme.f45906l) && AbstractC19074t.m100204b(this.f45905d, stringTheme.f45905d);
    }

    public final String getValue() {
        if (C23212s8.m119603k()) {
            return this.f45906l;
        }
        return this.f45905d;
    }

    public int hashCode() {
        return (this.f45906l.hashCode() * 31) + this.f45905d.hashCode();
    }

    public String toString() {
        return "StringTheme(l=" + this.f45906l + ", d=" + this.f45905d + ")";
    }

    public /* synthetic */ StringTheme(int i11, String str, String str2, AbstractC26805k1 abstractC26805k1) {
        if ((i11 & 1) == 0) {
            this.f45906l = "";
        } else {
            this.f45906l = str;
        }
        if ((i11 & 2) == 0) {
            this.f45905d = "";
        } else {
            this.f45905d = str2;
        }
    }

    public StringTheme(String str, String str2) {
        AbstractC19074t.m100208f(str, "l");
        AbstractC19074t.m100208f(str2, "d");
        this.f45906l = str;
        this.f45905d = str2;
    }

    public /* synthetic */ StringTheme(String str, String str2, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2);
    }
}

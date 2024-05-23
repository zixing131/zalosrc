package com.zing.zalo.feed.formpostfeed.data;

import androidx.annotation.Keep;
import com.zing.zalo.feed.data.StringTheme;
import com.zing.zalo.feed.data.StringTheme$$serializer;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import qn0.InterfaceC25392g;
import tn0.AbstractC26805k1;

@InterfaceC25392g
@Keep
/* loaded from: classes4.dex */
public final class Lottie {
    public static final Companion Companion = new Companion(null);
    private static final Lottie Default = new Lottie((StringTheme) null, 0, 3, (AbstractC19060k) null);

    /* renamed from: id */
    private final StringTheme f45910id;
    private final int repeat;

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final Lottie m44984a() {
            return Lottie.Default;
        }

        public final KSerializer serializer() {
            return Lottie$$serializer.INSTANCE;
        }
    }

    public Lottie() {
        this((StringTheme) null, 0, 3, (AbstractC19060k) null);
    }

    private final int component2() {
        return this.repeat;
    }

    public static /* synthetic */ Lottie copy$default(Lottie lottie, StringTheme stringTheme, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            stringTheme = lottie.f45910id;
        }
        if ((i12 & 2) != 0) {
            i11 = lottie.repeat;
        }
        return lottie.copy(stringTheme, i11);
    }

    public static final /* synthetic */ void write$Self$app_release(Lottie lottie, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || !AbstractC19074t.m100204b(lottie.f45910id, StringTheme.Companion.m44974a())) {
            interfaceC21886d.mo114029i(serialDescriptor, 0, StringTheme$$serializer.INSTANCE, lottie.f45910id);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || lottie.repeat != 0) {
            interfaceC21886d.mo114033x(serialDescriptor, 1, lottie.repeat);
        }
    }

    public final StringTheme component1() {
        return this.f45910id;
    }

    public final Lottie copy(StringTheme stringTheme, int i11) {
        AbstractC19074t.m100208f(stringTheme, "id");
        return new Lottie(stringTheme, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Lottie)) {
            return false;
        }
        Lottie lottie = (Lottie) obj;
        return AbstractC19074t.m100204b(this.f45910id, lottie.f45910id) && this.repeat == lottie.repeat;
    }

    public final StringTheme getId() {
        return this.f45910id;
    }

    public final int getNumberRepeat() {
        int i11 = this.repeat;
        if (i11 > 0) {
            return i11;
        }
        return 1;
    }

    public int hashCode() {
        return (this.f45910id.hashCode() * 31) + this.repeat;
    }

    public final boolean isLoop() {
        return this.repeat <= 0;
    }

    public String toString() {
        return "Lottie(id=" + this.f45910id + ", repeat=" + this.repeat + ")";
    }

    public /* synthetic */ Lottie(int i11, StringTheme stringTheme, int i12, AbstractC26805k1 abstractC26805k1) {
        this.f45910id = (i11 & 1) == 0 ? StringTheme.Companion.m44974a() : stringTheme;
        if ((i11 & 2) == 0) {
            this.repeat = 0;
        } else {
            this.repeat = i12;
        }
    }

    public Lottie(StringTheme stringTheme, int i11) {
        AbstractC19074t.m100208f(stringTheme, "id");
        this.f45910id = stringTheme;
        this.repeat = i11;
    }

    public /* synthetic */ Lottie(StringTheme stringTheme, int i11, int i12, AbstractC19060k abstractC19060k) {
        this((i12 & 1) != 0 ? StringTheme.Companion.m44974a() : stringTheme, (i12 & 2) != 0 ? 0 : i11);
    }
}

package com.zing.zalo.feed.formpostfeed.data;

import androidx.annotation.Keep;
import com.zing.zalo.feed.data.NumberTheme;
import com.zing.zalo.feed.data.NumberTheme$$serializer;
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
public final class GradientColor {
    public static final Companion Companion = new Companion(null);
    private static final GradientColor Default = new GradientColor((NumberTheme) (0 == true ? 1 : 0), (NumberTheme) (0 == true ? 1 : 0), 3, (AbstractC19060k) (0 == true ? 1 : 0));
    private final NumberTheme end;
    private final NumberTheme start;

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final GradientColor m44983a() {
            return GradientColor.Default;
        }

        public final KSerializer serializer() {
            return GradientColor$$serializer.INSTANCE;
        }
    }

    public GradientColor() {
        this((NumberTheme) null, (NumberTheme) (0 == true ? 1 : 0), 3, (AbstractC19060k) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ GradientColor copy$default(GradientColor gradientColor, NumberTheme numberTheme, NumberTheme numberTheme2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            numberTheme = gradientColor.start;
        }
        if ((i11 & 2) != 0) {
            numberTheme2 = gradientColor.end;
        }
        return gradientColor.copy(numberTheme, numberTheme2);
    }

    public static final /* synthetic */ void write$Self$app_release(GradientColor gradientColor, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || !AbstractC19074t.m100204b(gradientColor.start, NumberTheme.Companion.m44973a())) {
            interfaceC21886d.mo114029i(serialDescriptor, 0, NumberTheme$$serializer.INSTANCE, gradientColor.start);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || !AbstractC19074t.m100204b(gradientColor.end, NumberTheme.Companion.m44973a())) {
            interfaceC21886d.mo114029i(serialDescriptor, 1, NumberTheme$$serializer.INSTANCE, gradientColor.end);
        }
    }

    public final NumberTheme component1() {
        return this.start;
    }

    public final NumberTheme component2() {
        return this.end;
    }

    public final GradientColor copy(NumberTheme numberTheme, NumberTheme numberTheme2) {
        AbstractC19074t.m100208f(numberTheme, "start");
        AbstractC19074t.m100208f(numberTheme2, "end");
        return new GradientColor(numberTheme, numberTheme2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GradientColor)) {
            return false;
        }
        GradientColor gradientColor = (GradientColor) obj;
        return AbstractC19074t.m100204b(this.start, gradientColor.start) && AbstractC19074t.m100204b(this.end, gradientColor.end);
    }

    public final NumberTheme getEnd() {
        return this.end;
    }

    public final NumberTheme getStart() {
        return this.start;
    }

    public int hashCode() {
        return (this.start.hashCode() * 31) + this.end.hashCode();
    }

    public String toString() {
        return "GradientColor(start=" + this.start + ", end=" + this.end + ")";
    }

    public /* synthetic */ GradientColor(int i11, NumberTheme numberTheme, NumberTheme numberTheme2, AbstractC26805k1 abstractC26805k1) {
        this.start = (i11 & 1) == 0 ? NumberTheme.Companion.m44973a() : numberTheme;
        if ((i11 & 2) == 0) {
            this.end = NumberTheme.Companion.m44973a();
        } else {
            this.end = numberTheme2;
        }
    }

    public GradientColor(NumberTheme numberTheme, NumberTheme numberTheme2) {
        AbstractC19074t.m100208f(numberTheme, "start");
        AbstractC19074t.m100208f(numberTheme2, "end");
        this.start = numberTheme;
        this.end = numberTheme2;
    }

    public /* synthetic */ GradientColor(NumberTheme numberTheme, NumberTheme numberTheme2, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? NumberTheme.Companion.m44973a() : numberTheme, (i11 & 2) != 0 ? NumberTheme.Companion.m44973a() : numberTheme2);
    }
}

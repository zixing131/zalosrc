package com.zing.zalo.feed.formpostfeed.data;

import androidx.annotation.Keep;
import com.zing.zalo.feed.data.NumberTheme;
import com.zing.zalo.feed.data.NumberTheme$$serializer;
import com.zing.zalo.feed.data.StringTheme;
import com.zing.zalo.feed.data.StringTheme$$serializer;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import me0.AbstractC23136l9;
import qn0.InterfaceC25392g;
import tn0.AbstractC26805k1;

@InterfaceC25392g
@Keep
/* loaded from: classes4.dex */
public final class Display {
    public static final Companion Companion;
    private static final Display NoUse;
    private final int customSize;
    private final Gradient gradient;
    private final StringTheme imgUrl;
    private final Lottie lottie;
    private final NumberTheme solidColor;
    private final int type;

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final Display m44980a() {
            return Display.NoUse;
        }

        public final KSerializer serializer() {
            return Display$$serializer.INSTANCE;
        }
    }

    static {
        AbstractC19060k abstractC19060k = null;
        Companion = new Companion(abstractC19060k);
        NoUse = new Display(0, 1, abstractC19060k);
    }

    public Display() {
        this(0, 1, null);
    }

    public static /* synthetic */ Display copy$default(Display display, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = display.type;
        }
        return display.copy(i11);
    }

    public static /* synthetic */ void getCustomSize$annotations() {
    }

    public static /* synthetic */ void getGradient$annotations() {
    }

    public static /* synthetic */ void getImgUrl$annotations() {
    }

    public static /* synthetic */ void getLottie$annotations() {
    }

    public static /* synthetic */ void getSolidColor$annotations() {
    }

    public static /* synthetic */ void getType$annotations() {
    }

    public static final /* synthetic */ void write$Self$app_release(Display display, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || display.type != 0) {
            interfaceC21886d.mo114033x(serialDescriptor, 0, display.type);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || !AbstractC19074t.m100204b(display.solidColor, NumberTheme.Companion.m44973a())) {
            interfaceC21886d.mo114029i(serialDescriptor, 1, NumberTheme$$serializer.INSTANCE, display.solidColor);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || !AbstractC19074t.m100204b(display.gradient, Gradient.Companion.m44982a())) {
            interfaceC21886d.mo114029i(serialDescriptor, 2, Gradient$$serializer.INSTANCE, display.gradient);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 3) || !AbstractC19074t.m100204b(display.imgUrl, StringTheme.Companion.m44974a())) {
            interfaceC21886d.mo114029i(serialDescriptor, 3, StringTheme$$serializer.INSTANCE, display.imgUrl);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 4) || !AbstractC19074t.m100204b(display.lottie, Lottie.Companion.m44984a())) {
            interfaceC21886d.mo114029i(serialDescriptor, 4, Lottie$$serializer.INSTANCE, display.lottie);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 5) || display.customSize != 0) {
            interfaceC21886d.mo114033x(serialDescriptor, 5, display.customSize);
        }
    }

    public final int component1() {
        return this.type;
    }

    public final Display copy(int i11) {
        return new Display(i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Display) && this.type == ((Display) obj).type;
    }

    public final int getCustomSize() {
        return this.customSize;
    }

    public final int getCustomSizeInPx() {
        return AbstractC23136l9.m118742r(this.customSize);
    }

    public final Gradient getGradient() {
        return this.gradient;
    }

    public final StringTheme getImgUrl() {
        return this.imgUrl;
    }

    public final Lottie getLottie() {
        return this.lottie;
    }

    public final NumberTheme getSolidColor() {
        return this.solidColor;
    }

    public final int getType() {
        return this.type;
    }

    public final boolean getUseCustomSize() {
        return this.customSize > 0;
    }

    public int hashCode() {
        return this.type;
    }

    public final boolean isUsable() {
        return !AbstractC19074t.m100204b(this, NoUse);
    }

    public String toString() {
        return "Display(type=" + this.type + ")";
    }

    public Display(int i11) {
        this.type = i11;
        this.solidColor = NumberTheme.Companion.m44973a();
        this.gradient = Gradient.Companion.m44982a();
        this.imgUrl = StringTheme.Companion.m44974a();
        this.lottie = Lottie.Companion.m44984a();
    }

    public /* synthetic */ Display(int i11, int i12, NumberTheme numberTheme, Gradient gradient, StringTheme stringTheme, Lottie lottie, int i13, AbstractC26805k1 abstractC26805k1) {
        if ((i11 & 1) == 0) {
            this.type = 0;
        } else {
            this.type = i12;
        }
        if ((i11 & 2) == 0) {
            this.solidColor = NumberTheme.Companion.m44973a();
        } else {
            this.solidColor = numberTheme;
        }
        if ((i11 & 4) == 0) {
            this.gradient = Gradient.Companion.m44982a();
        } else {
            this.gradient = gradient;
        }
        if ((i11 & 8) == 0) {
            this.imgUrl = StringTheme.Companion.m44974a();
        } else {
            this.imgUrl = stringTheme;
        }
        if ((i11 & 16) == 0) {
            this.lottie = Lottie.Companion.m44984a();
        } else {
            this.lottie = lottie;
        }
        if ((i11 & 32) == 0) {
            this.customSize = 0;
        } else {
            this.customSize = i13;
        }
    }

    public /* synthetic */ Display(int i11, int i12, AbstractC19060k abstractC19060k) {
        this((i12 & 1) != 0 ? 0 : i11);
    }
}

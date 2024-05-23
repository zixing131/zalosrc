package com.zing.zalo.feed.formpostfeed.data;

import androidx.annotation.Keep;
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
public final class Gradient {
    public static final Companion Companion = new Companion(null);
    private static final Gradient Default = new Gradient(0, (GradientColor) null, 3, (AbstractC19060k) null);
    private final GradientColor color;
    private final int direction;

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final Gradient m44982a() {
            return Gradient.Default;
        }

        public final KSerializer serializer() {
            return Gradient$$serializer.INSTANCE;
        }
    }

    public Gradient() {
        this(0, (GradientColor) null, 3, (AbstractC19060k) null);
    }

    public static /* synthetic */ Gradient copy$default(Gradient gradient, int i11, GradientColor gradientColor, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = gradient.direction;
        }
        if ((i12 & 2) != 0) {
            gradientColor = gradient.color;
        }
        return gradient.copy(i11, gradientColor);
    }

    public static final /* synthetic */ void write$Self$app_release(Gradient gradient, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || gradient.direction != 0) {
            interfaceC21886d.mo114033x(serialDescriptor, 0, gradient.direction);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || !AbstractC19074t.m100204b(gradient.color, GradientColor.Companion.m44983a())) {
            interfaceC21886d.mo114029i(serialDescriptor, 1, GradientColor$$serializer.INSTANCE, gradient.color);
        }
    }

    public final int component1() {
        return this.direction;
    }

    public final GradientColor component2() {
        return this.color;
    }

    public final Gradient copy(int i11, GradientColor gradientColor) {
        AbstractC19074t.m100208f(gradientColor, "color");
        return new Gradient(i11, gradientColor);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Gradient)) {
            return false;
        }
        Gradient gradient = (Gradient) obj;
        return this.direction == gradient.direction && AbstractC19074t.m100204b(this.color, gradient.color);
    }

    public final GradientColor getColor() {
        return this.color;
    }

    public final int getDirection() {
        return this.direction;
    }

    public int hashCode() {
        return (this.direction * 31) + this.color.hashCode();
    }

    public String toString() {
        return "Gradient(direction=" + this.direction + ", color=" + this.color + ")";
    }

    public /* synthetic */ Gradient(int i11, int i12, GradientColor gradientColor, AbstractC26805k1 abstractC26805k1) {
        this.direction = (i11 & 1) == 0 ? 0 : i12;
        if ((i11 & 2) == 0) {
            this.color = GradientColor.Companion.m44983a();
        } else {
            this.color = gradientColor;
        }
    }

    public Gradient(int i11, GradientColor gradientColor) {
        AbstractC19074t.m100208f(gradientColor, "color");
        this.direction = i11;
        this.color = gradientColor;
    }

    public /* synthetic */ Gradient(int i11, GradientColor gradientColor, int i12, AbstractC19060k abstractC19060k) {
        this((i12 & 1) != 0 ? 0 : i11, (i12 & 2) != 0 ? GradientColor.Companion.m44983a() : gradientColor);
    }
}

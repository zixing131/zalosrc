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
public final class Decorations {
    public static final Companion Companion = new Companion(null);
    private static final Decorations NoUse = new Decorations((Element) (0 == true ? 1 : 0), (Element) (0 == true ? 1 : 0), 3, (AbstractC19060k) (0 == true ? 1 : 0));
    private final Element left;
    private final Element right;

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final Decorations m44979a() {
            return Decorations.NoUse;
        }

        public final KSerializer serializer() {
            return Decorations$$serializer.INSTANCE;
        }
    }

    public Decorations() {
        this((Element) null, (Element) (0 == true ? 1 : 0), 3, (AbstractC19060k) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ Decorations copy$default(Decorations decorations, Element element, Element element2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            element = decorations.left;
        }
        if ((i11 & 2) != 0) {
            element2 = decorations.right;
        }
        return decorations.copy(element, element2);
    }

    public static final /* synthetic */ void write$Self$app_release(Decorations decorations, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || !AbstractC19074t.m100204b(decorations.left, Element.Companion.m44981a())) {
            interfaceC21886d.mo114029i(serialDescriptor, 0, Element$$serializer.INSTANCE, decorations.left);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || !AbstractC19074t.m100204b(decorations.right, Element.Companion.m44981a())) {
            interfaceC21886d.mo114029i(serialDescriptor, 1, Element$$serializer.INSTANCE, decorations.right);
        }
    }

    public final Element component1() {
        return this.left;
    }

    public final Element component2() {
        return this.right;
    }

    public final Decorations copy(Element element, Element element2) {
        AbstractC19074t.m100208f(element, "left");
        AbstractC19074t.m100208f(element2, "right");
        return new Decorations(element, element2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Decorations)) {
            return false;
        }
        Decorations decorations = (Decorations) obj;
        return AbstractC19074t.m100204b(this.left, decorations.left) && AbstractC19074t.m100204b(this.right, decorations.right);
    }

    public final Element getLeft() {
        return this.left;
    }

    public final Element getRight() {
        return this.right;
    }

    public final boolean getUseLeft() {
        return !AbstractC19074t.m100204b(this.left, Element.Companion.m44981a());
    }

    public final boolean getUseRight() {
        return !AbstractC19074t.m100204b(this.right, Element.Companion.m44981a());
    }

    public int hashCode() {
        return (this.left.hashCode() * 31) + this.right.hashCode();
    }

    public String toString() {
        return "Decorations(left=" + this.left + ", right=" + this.right + ")";
    }

    public /* synthetic */ Decorations(int i11, Element element, Element element2, AbstractC26805k1 abstractC26805k1) {
        this.left = (i11 & 1) == 0 ? Element.Companion.m44981a() : element;
        if ((i11 & 2) == 0) {
            this.right = Element.Companion.m44981a();
        } else {
            this.right = element2;
        }
    }

    public Decorations(Element element, Element element2) {
        AbstractC19074t.m100208f(element, "left");
        AbstractC19074t.m100208f(element2, "right");
        this.left = element;
        this.right = element2;
    }

    public /* synthetic */ Decorations(Element element, Element element2, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? Element.Companion.m44981a() : element, (i11 & 2) != 0 ? Element.Companion.m44981a() : element2);
    }
}

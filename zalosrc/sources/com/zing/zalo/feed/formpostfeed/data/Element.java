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
public final class Element {
    public static final Companion Companion = new Companion(null);
    private static final Element NoUse = new Element((Display) (0 == true ? 1 : 0), (Size) (0 == true ? 1 : 0), 3, (AbstractC19060k) (0 == true ? 1 : 0));
    private final Display display;
    private final Size size;

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final Element m44981a() {
            return Element.NoUse;
        }

        public final KSerializer serializer() {
            return Element$$serializer.INSTANCE;
        }
    }

    public Element() {
        this((Display) null, (Size) (0 == true ? 1 : 0), 3, (AbstractC19060k) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ Element copy$default(Element element, Display display, Size size, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            display = element.display;
        }
        if ((i11 & 2) != 0) {
            size = element.size;
        }
        return element.copy(display, size);
    }

    public static final /* synthetic */ void write$Self$app_release(Element element, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || !AbstractC19074t.m100204b(element.display, Display.Companion.m44980a())) {
            interfaceC21886d.mo114029i(serialDescriptor, 0, Display$$serializer.INSTANCE, element.display);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || !AbstractC19074t.m100204b(element.size, Size.Companion.m44989a())) {
            interfaceC21886d.mo114029i(serialDescriptor, 1, Size$$serializer.INSTANCE, element.size);
        }
    }

    public final Display component1() {
        return this.display;
    }

    public final Size component2() {
        return this.size;
    }

    public final Element copy(Display display, Size size) {
        AbstractC19074t.m100208f(display, "display");
        AbstractC19074t.m100208f(size, "size");
        return new Element(display, size);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Element)) {
            return false;
        }
        Element element = (Element) obj;
        return AbstractC19074t.m100204b(this.display, element.display) && AbstractC19074t.m100204b(this.size, element.size);
    }

    public final Display getDisplay() {
        return this.display;
    }

    public final Size getSize() {
        return this.size;
    }

    public int hashCode() {
        return (this.display.hashCode() * 31) + this.size.hashCode();
    }

    public String toString() {
        return "Element(display=" + this.display + ", size=" + this.size + ")";
    }

    public /* synthetic */ Element(int i11, Display display, Size size, AbstractC26805k1 abstractC26805k1) {
        this.display = (i11 & 1) == 0 ? Display.Companion.m44980a() : display;
        if ((i11 & 2) == 0) {
            this.size = Size.Companion.m44989a();
        } else {
            this.size = size;
        }
    }

    public Element(Display display, Size size) {
        AbstractC19074t.m100208f(display, "display");
        AbstractC19074t.m100208f(size, "size");
        this.display = display;
        this.size = size;
    }

    public /* synthetic */ Element(Display display, Size size, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? Display.Companion.m44980a() : display, (i11 & 2) != 0 ? Size.Companion.m44989a() : size);
    }
}

package com.zing.zalo.feed.formpostfeed.data;

import androidx.annotation.Keep;
import fn0.AbstractC19060k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import qn0.InterfaceC25392g;
import tn0.AbstractC26805k1;

@InterfaceC25392g
@Keep
/* loaded from: classes4.dex */
public final class Size {
    public static final Companion Companion;
    private static final Size Default;
    private final int height;
    private final int width;

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final Size m44989a() {
            return Size.Default;
        }

        public final KSerializer serializer() {
            return Size$$serializer.INSTANCE;
        }
    }

    static {
        AbstractC19060k abstractC19060k = null;
        Companion = new Companion(abstractC19060k);
        int i11 = 0;
        Default = new Size(i11, i11, 3, abstractC19060k);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Size() {
        this(r2, r2, 3, (AbstractC19060k) null);
        int i11 = 0;
    }

    public static /* synthetic */ Size copy$default(Size size, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = size.width;
        }
        if ((i13 & 2) != 0) {
            i12 = size.height;
        }
        return size.copy(i11, i12);
    }

    public static final /* synthetic */ void write$Self$app_release(Size size, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || size.width != 0) {
            interfaceC21886d.mo114033x(serialDescriptor, 0, size.width);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || size.height != 0) {
            interfaceC21886d.mo114033x(serialDescriptor, 1, size.height);
        }
    }

    public final int component1() {
        return this.width;
    }

    public final int component2() {
        return this.height;
    }

    public final Size copy(int i11, int i12) {
        return new Size(i11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Size)) {
            return false;
        }
        Size size = (Size) obj;
        return this.width == size.width && this.height == size.height;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (this.width * 31) + this.height;
    }

    public String toString() {
        return "Size(width=" + this.width + ", height=" + this.height + ")";
    }

    public Size(int i11, int i12) {
        this.width = i11;
        this.height = i12;
    }

    public /* synthetic */ Size(int i11, int i12, int i13, AbstractC26805k1 abstractC26805k1) {
        if ((i11 & 1) == 0) {
            this.width = 0;
        } else {
            this.width = i12;
        }
        if ((i11 & 2) == 0) {
            this.height = 0;
        } else {
            this.height = i13;
        }
    }

    public /* synthetic */ Size(int i11, int i12, int i13, AbstractC19060k abstractC19060k) {
        this((i13 & 1) != 0 ? 0 : i11, (i13 & 2) != 0 ? 0 : i12);
    }
}

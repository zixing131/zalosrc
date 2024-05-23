package com.zing.zalo.feed.data;

import androidx.annotation.Keep;
import fn0.AbstractC19060k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import me0.C23212s8;
import qn0.InterfaceC25392g;
import tn0.AbstractC26805k1;

@InterfaceC25392g
@Keep
/* loaded from: classes4.dex */
public final class NumberTheme {
    public static final Companion Companion;
    private static final NumberTheme Default;

    /* renamed from: d */
    private final int f45903d;

    /* renamed from: l */
    private final int f45904l;

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final NumberTheme m44973a() {
            return NumberTheme.Default;
        }

        public final KSerializer serializer() {
            return NumberTheme$$serializer.INSTANCE;
        }
    }

    static {
        AbstractC19060k abstractC19060k = null;
        Companion = new Companion(abstractC19060k);
        int i11 = 0;
        Default = new NumberTheme(i11, i11, 3, abstractC19060k);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public NumberTheme() {
        this(r2, r2, 3, (AbstractC19060k) null);
        int i11 = 0;
    }

    private final int component1() {
        return this.f45904l;
    }

    private final int component2() {
        return this.f45903d;
    }

    public static /* synthetic */ NumberTheme copy$default(NumberTheme numberTheme, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = numberTheme.f45904l;
        }
        if ((i13 & 2) != 0) {
            i12 = numberTheme.f45903d;
        }
        return numberTheme.copy(i11, i12);
    }

    public static final /* synthetic */ void write$Self$app_release(NumberTheme numberTheme, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || numberTheme.f45904l != 0) {
            interfaceC21886d.mo114033x(serialDescriptor, 0, numberTheme.f45904l);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || numberTheme.f45903d != 0) {
            interfaceC21886d.mo114033x(serialDescriptor, 1, numberTheme.f45903d);
        }
    }

    public final NumberTheme copy(int i11, int i12) {
        return new NumberTheme(i11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NumberTheme)) {
            return false;
        }
        NumberTheme numberTheme = (NumberTheme) obj;
        return this.f45904l == numberTheme.f45904l && this.f45903d == numberTheme.f45903d;
    }

    public final int getDarkValue() {
        return this.f45903d;
    }

    public final int getValue() {
        if (C23212s8.m119603k()) {
            return this.f45904l;
        }
        return this.f45903d;
    }

    public int hashCode() {
        return (this.f45904l * 31) + this.f45903d;
    }

    public final boolean isValid() {
        if (getValue() != 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "NumberTheme(l=" + this.f45904l + ", d=" + this.f45903d + ")";
    }

    public NumberTheme(int i11, int i12) {
        this.f45904l = i11;
        this.f45903d = i12;
    }

    public /* synthetic */ NumberTheme(int i11, int i12, int i13, AbstractC26805k1 abstractC26805k1) {
        if ((i11 & 1) == 0) {
            this.f45904l = 0;
        } else {
            this.f45904l = i12;
        }
        if ((i11 & 2) == 0) {
            this.f45903d = 0;
        } else {
            this.f45903d = i13;
        }
    }

    public /* synthetic */ NumberTheme(int i11, int i12, int i13, AbstractC19060k abstractC19060k) {
        this((i13 & 1) != 0 ? 0 : i11, (i13 & 2) != 0 ? 0 : i12);
    }
}

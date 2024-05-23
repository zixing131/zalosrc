package com.zing.zalo.shortvideo.data.model;

import fn0.AbstractC19060k;
import kotlinx.serialization.KSerializer;
import qn0.InterfaceC25392g;
import tn0.AbstractC26774a1;
import tn0.AbstractC26805k1;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class LongPollingResult {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final int f49905a;

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return LongPollingResult$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LongPollingResult(int i11, int i12, AbstractC26805k1 abstractC26805k1) {
        if (1 != (i11 & 1)) {
            AbstractC26774a1.m137800b(i11, 1, LongPollingResult$$serializer.INSTANCE.getDescriptor());
        }
        this.f49905a = i12;
    }

    /* renamed from: a */
    public final int m51047a() {
        return this.f49905a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LongPollingResult) && this.f49905a == ((LongPollingResult) obj).f49905a;
    }

    public int hashCode() {
        return this.f49905a;
    }

    public String toString() {
        return "LongPollingResult(type=" + this.f49905a + ")";
    }
}

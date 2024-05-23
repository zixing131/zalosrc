package com.zing.zalo.data.zalocloud.model.api;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import qn0.InterfaceC25392g;
import tn0.AbstractC26774a1;
import tn0.AbstractC26805k1;

@InterfaceC25392g
/* loaded from: classes3.dex */
public final class MediaExtEncryptInfo {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final String f43077a;

    /* renamed from: b */
    private final int f43078b;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return MediaExtEncryptInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MediaExtEncryptInfo(int i11, String str, int i12, AbstractC26805k1 abstractC26805k1) {
        if (3 != (i11 & 3)) {
            AbstractC26774a1.m137800b(i11, 3, MediaExtEncryptInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.f43077a = str;
        this.f43078b = i12;
    }

    /* renamed from: c */
    public static final /* synthetic */ void m41346c(MediaExtEncryptInfo mediaExtEncryptInfo, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        interfaceC21886d.mo114035z(serialDescriptor, 0, mediaExtEncryptInfo.f43077a);
        interfaceC21886d.mo114033x(serialDescriptor, 1, mediaExtEncryptInfo.f43078b);
    }

    /* renamed from: a */
    public final String m41347a() {
        return this.f43077a;
    }

    /* renamed from: b */
    public final int m41348b() {
        return this.f43078b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaExtEncryptInfo)) {
            return false;
        }
        MediaExtEncryptInfo mediaExtEncryptInfo = (MediaExtEncryptInfo) obj;
        return AbstractC19074t.m100204b(this.f43077a, mediaExtEncryptInfo.f43077a) && this.f43078b == mediaExtEncryptInfo.f43078b;
    }

    public int hashCode() {
        return (this.f43077a.hashCode() * 31) + this.f43078b;
    }

    public String toString() {
        return "MediaExtEncryptInfo(encryptKey=" + this.f43077a + ", encryptVer=" + this.f43078b + ")";
    }

    public MediaExtEncryptInfo(String str, int i11) {
        AbstractC19074t.m100208f(str, "encryptKey");
        this.f43077a = str;
        this.f43078b = i11;
    }
}

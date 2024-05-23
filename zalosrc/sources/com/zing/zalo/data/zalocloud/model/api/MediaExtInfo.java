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
public final class MediaExtInfo {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final String f43079a;

    /* renamed from: b */
    private final MediaExtEncryptInfo f43080b;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return MediaExtInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MediaExtInfo(int i11, String str, MediaExtEncryptInfo mediaExtEncryptInfo, AbstractC26805k1 abstractC26805k1) {
        if (3 != (i11 & 3)) {
            AbstractC26774a1.m137800b(i11, 3, MediaExtInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.f43079a = str;
        this.f43080b = mediaExtEncryptInfo;
    }

    /* renamed from: c */
    public static final /* synthetic */ void m41349c(MediaExtInfo mediaExtInfo, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        interfaceC21886d.mo114035z(serialDescriptor, 0, mediaExtInfo.f43079a);
        interfaceC21886d.mo114029i(serialDescriptor, 1, MediaExtEncryptInfo$$serializer.INSTANCE, mediaExtInfo.f43080b);
    }

    /* renamed from: a */
    public final String m41350a() {
        return this.f43079a;
    }

    /* renamed from: b */
    public final MediaExtEncryptInfo m41351b() {
        return this.f43080b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaExtInfo)) {
            return false;
        }
        MediaExtInfo mediaExtInfo = (MediaExtInfo) obj;
        return AbstractC19074t.m100204b(this.f43079a, mediaExtInfo.f43079a) && AbstractC19074t.m100204b(this.f43080b, mediaExtInfo.f43080b);
    }

    public int hashCode() {
        return (this.f43079a.hashCode() * 31) + this.f43080b.hashCode();
    }

    public String toString() {
        return "MediaExtInfo(data=" + this.f43079a + ", encryptInfo=" + this.f43080b + ")";
    }

    public MediaExtInfo(String str, MediaExtEncryptInfo mediaExtEncryptInfo) {
        AbstractC19074t.m100208f(str, "data");
        AbstractC19074t.m100208f(mediaExtEncryptInfo, "encryptInfo");
        this.f43079a = str;
        this.f43080b = mediaExtEncryptInfo;
    }
}

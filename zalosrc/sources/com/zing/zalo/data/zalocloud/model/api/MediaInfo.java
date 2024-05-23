package com.zing.zalo.data.zalocloud.model.api;

import androidx.work.AbstractC2147g0;
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
public final class MediaInfo {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final long f43081a;

    /* renamed from: b */
    private final String f43082b;

    /* renamed from: c */
    private final MediaExtInfo f43083c;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return MediaInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MediaInfo(int i11, long j11, String str, MediaExtInfo mediaExtInfo, AbstractC26805k1 abstractC26805k1) {
        if (1 != (i11 & 1)) {
            AbstractC26774a1.m137800b(i11, 1, MediaInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.f43081a = j11;
        if ((i11 & 2) == 0) {
            this.f43082b = "";
        } else {
            this.f43082b = str;
        }
        if ((i11 & 4) == 0) {
            this.f43083c = null;
        } else {
            this.f43083c = mediaExtInfo;
        }
    }

    /* renamed from: d */
    public static final /* synthetic */ void m41352d(MediaInfo mediaInfo, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        interfaceC21886d.mo114022E(serialDescriptor, 0, mediaInfo.f43081a);
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || !AbstractC19074t.m100204b(mediaInfo.f43082b, "")) {
            interfaceC21886d.mo114035z(serialDescriptor, 1, mediaInfo.f43082b);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || mediaInfo.f43083c != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 2, MediaExtInfo$$serializer.INSTANCE, mediaInfo.f43083c);
        }
    }

    /* renamed from: a */
    public final String m41353a() {
        return this.f43082b;
    }

    /* renamed from: b */
    public final MediaExtInfo m41354b() {
        return this.f43083c;
    }

    /* renamed from: c */
    public final long m41355c() {
        return this.f43081a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaInfo)) {
            return false;
        }
        MediaInfo mediaInfo = (MediaInfo) obj;
        return this.f43081a == mediaInfo.f43081a && AbstractC19074t.m100204b(this.f43082b, mediaInfo.f43082b) && AbstractC19074t.m100204b(this.f43083c, mediaInfo.f43083c);
    }

    public int hashCode() {
        int m11521a = ((AbstractC2147g0.m11521a(this.f43081a) * 31) + this.f43082b.hashCode()) * 31;
        MediaExtInfo mediaExtInfo = this.f43083c;
        return m11521a + (mediaExtInfo == null ? 0 : mediaExtInfo.hashCode());
    }

    public String toString() {
        return "MediaInfo(mediaSize=" + this.f43081a + ", checksum=" + this.f43082b + ", mediaExtInfo=" + this.f43083c + ")";
    }
}

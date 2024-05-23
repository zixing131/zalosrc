package com.zing.zalo.shortvideo.p072ui.model;

import android.os.Parcel;
import android.os.Parcelable;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import qn0.InterfaceC25392g;
import tn0.AbstractC26774a1;
import tn0.AbstractC26805k1;
import tn0.C26814n1;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class VideoLocationHeader implements Parcelable {

    /* renamed from: p */
    private final String f51440p;

    /* renamed from: q */
    private final String f51441q;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<VideoLocationHeader> CREATOR = new C9781a();

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return VideoLocationHeader$$serializer.INSTANCE;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.model.VideoLocationHeader$a */
    /* loaded from: classes5.dex */
    public static final class C9781a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final VideoLocationHeader createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new VideoLocationHeader(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final VideoLocationHeader[] newArray(int i11) {
            return new VideoLocationHeader[i11];
        }
    }

    public /* synthetic */ VideoLocationHeader(int i11, String str, String str2, AbstractC26805k1 abstractC26805k1) {
        if (3 != (i11 & 3)) {
            AbstractC26774a1.m137800b(i11, 3, VideoLocationHeader$$serializer.INSTANCE.getDescriptor());
        }
        this.f51440p = str;
        this.f51441q = str2;
    }

    /* renamed from: c */
    public static final /* synthetic */ void m52952c(VideoLocationHeader videoLocationHeader, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        C26814n1 c26814n1 = C26814n1.f127034a;
        interfaceC21886d.mo114028h(serialDescriptor, 0, c26814n1, videoLocationHeader.f51440p);
        interfaceC21886d.mo114028h(serialDescriptor, 1, c26814n1, videoLocationHeader.f51441q);
    }

    /* renamed from: a */
    public final String m52953a() {
        return this.f51441q;
    }

    /* renamed from: b */
    public final String m52954b() {
        return this.f51440p;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoLocationHeader)) {
            return false;
        }
        VideoLocationHeader videoLocationHeader = (VideoLocationHeader) obj;
        return AbstractC19074t.m100204b(this.f51440p, videoLocationHeader.f51440p) && AbstractC19074t.m100204b(this.f51441q, videoLocationHeader.f51441q);
    }

    public int hashCode() {
        String str = this.f51440p;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f51441q;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "VideoLocationHeader(title=" + this.f51440p + ", desc=" + this.f51441q + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeString(this.f51440p);
        parcel.writeString(this.f51441q);
    }

    public VideoLocationHeader(String str, String str2) {
        this.f51440p = str;
        this.f51441q = str2;
    }
}

package com.zing.zalo.report_v2.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import fn0.AbstractC19074t;
import me0.AbstractC23280z4;

/* loaded from: classes4.dex */
public final class ReportPhotoAttachment implements Parcelable {
    public static final Parcelable.Creator<ReportPhotoAttachment> CREATOR = new C9330a();

    /* renamed from: p */
    private final MediaItem f49439p;

    /* renamed from: com.zing.zalo.report_v2.model.ReportPhotoAttachment$a */
    /* loaded from: classes4.dex */
    public static final class C9330a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ReportPhotoAttachment createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new ReportPhotoAttachment((MediaItem) parcel.readParcelable(ReportPhotoAttachment.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ReportPhotoAttachment[] newArray(int i11) {
            return new ReportPhotoAttachment[i11];
        }
    }

    public ReportPhotoAttachment(MediaItem mediaItem) {
        AbstractC19074t.m100208f(mediaItem, "mediaItem");
        this.f49439p = mediaItem;
    }

    /* renamed from: a */
    public final String m50198a() {
        return m50199b();
    }

    /* renamed from: b */
    public final String m50199b() {
        String m120361x = AbstractC23280z4.m120361x(this.f49439p);
        AbstractC19074t.m100207e(m120361x, "getPhotoPathCache(...)");
        return m120361x;
    }

    /* renamed from: c */
    public final MediaItem m50200c() {
        return this.f49439p;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ReportPhotoAttachment) && AbstractC19074t.m100204b(this.f49439p, ((ReportPhotoAttachment) obj).f49439p);
    }

    public int hashCode() {
        return this.f49439p.hashCode();
    }

    public String toString() {
        return "ReportPhotoAttachment(mediaItem=" + this.f49439p + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeParcelable(this.f49439p, i11);
    }
}

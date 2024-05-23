package com.zing.zalo.shortvideo.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import fn0.AbstractC19074t;

/* loaded from: classes5.dex */
public final class SearchAllData implements Parcelable {
    public static final Parcelable.Creator<SearchAllData> CREATOR = new C9419a();

    /* renamed from: p */
    private final Parcelable f49953p;

    /* renamed from: com.zing.zalo.shortvideo.data.model.SearchAllData$a */
    /* loaded from: classes5.dex */
    public static final class C9419a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SearchAllData createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new SearchAllData(parcel.readParcelable(SearchAllData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SearchAllData[] newArray(int i11) {
            return new SearchAllData[i11];
        }
    }

    public SearchAllData(Parcelable parcelable) {
        AbstractC19074t.m100208f(parcelable, "data");
        this.f49953p = parcelable;
    }

    /* renamed from: a */
    public final Parcelable m51133a() {
        return this.f49953p;
    }

    /* renamed from: b */
    public final String m51134b() {
        Parcelable parcelable = this.f49953p;
        if (parcelable instanceof Channel) {
            return ((Channel) parcelable).m50769l();
        }
        if (parcelable instanceof Video) {
            return ((Video) parcelable).m52911t();
        }
        return "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SearchAllData) && AbstractC19074t.m100204b(this.f49953p, ((SearchAllData) obj).f49953p);
    }

    public int hashCode() {
        return this.f49953p.hashCode();
    }

    public String toString() {
        return "SearchAllData(data=" + this.f49953p + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeParcelable(this.f49953p, i11);
    }
}

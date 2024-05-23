package com.zing.zalo.upload.video;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public class VideoMediaInfo implements Parcelable {
    public static final Parcelable.Creator<VideoMediaInfo> CREATOR = new C16726a();

    /* renamed from: p */
    public String f84814p;

    /* renamed from: q */
    public String f84815q;

    /* renamed from: r */
    public String f84816r;

    /* renamed from: s */
    public String f84817s;

    /* renamed from: t */
    public String f84818t;

    /* renamed from: com.zing.zalo.upload.video.VideoMediaInfo$a */
    /* loaded from: classes4.dex */
    class C16726a implements Parcelable.Creator {
        C16726a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public VideoMediaInfo createFromParcel(Parcel parcel) {
            return new VideoMediaInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public VideoMediaInfo[] newArray(int i11) {
            return new VideoMediaInfo[i11];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public VideoMediaInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f84814p);
        parcel.writeString(this.f84815q);
        parcel.writeString(this.f84816r);
        parcel.writeString(this.f84817s);
        parcel.writeString(this.f84818t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public VideoMediaInfo(String str, String str2, String str3, String str4, String str5) {
        this.f84814p = str;
        this.f84815q = str2;
        this.f84816r = str3;
        this.f84817s = str4;
        this.f84818t = str5;
    }

    VideoMediaInfo(Parcel parcel) {
        this.f84814p = parcel.readString();
        this.f84815q = parcel.readString();
        this.f84816r = parcel.readString();
        this.f84817s = parcel.readString();
        this.f84818t = parcel.readString();
    }
}

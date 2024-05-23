package com.zing.zalo.data.mediapicker.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* loaded from: classes3.dex */
public final class PhotoCallItem implements Parcelable {

    /* renamed from: p */
    private String f42982p;

    /* renamed from: q */
    private String f42983q;

    /* renamed from: r */
    private int f42984r;
    public static final C7945a Companion = new C7945a(null);
    public static final Parcelable.Creator<PhotoCallItem> CREATOR = new C7946b();

    /* renamed from: com.zing.zalo.data.mediapicker.model.PhotoCallItem$a */
    /* loaded from: classes3.dex */
    public static final class C7945a {
        private C7945a() {
        }

        public /* synthetic */ C7945a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.data.mediapicker.model.PhotoCallItem$b */
    /* loaded from: classes3.dex */
    public static final class C7946b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PhotoCallItem createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new PhotoCallItem(parcel.readString(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PhotoCallItem[] newArray(int i11) {
            return new PhotoCallItem[i11];
        }
    }

    public PhotoCallItem(String str, String str2, int i11) {
        AbstractC19074t.m100208f(str, "id");
        AbstractC19074t.m100208f(str2, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        this.f42982p = str;
        this.f42983q = str2;
        this.f42984r = i11;
    }

    /* renamed from: a */
    public final String m41201a() {
        return this.f42983q;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeString(this.f42982p);
        parcel.writeString(this.f42983q);
        parcel.writeInt(this.f42984r);
    }
}

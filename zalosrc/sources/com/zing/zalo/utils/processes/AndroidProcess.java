package com.zing.zalo.utils.processes;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public class AndroidProcess implements Parcelable {
    public static final Parcelable.Creator<AndroidProcess> CREATOR = new C16744a();

    /* renamed from: p */
    public final String f85003p;

    /* renamed from: q */
    public final int f85004q;

    /* renamed from: com.zing.zalo.utils.processes.AndroidProcess$a */
    /* loaded from: classes4.dex */
    class C16744a implements Parcelable.Creator {
        C16744a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AndroidProcess createFromParcel(Parcel parcel) {
            return new AndroidProcess(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AndroidProcess[] newArray(int i11) {
            return new AndroidProcess[i11];
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AndroidProcess(Parcel parcel) {
        this.f85003p = parcel.readString();
        this.f85004q = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f85003p);
        parcel.writeInt(this.f85004q);
    }
}

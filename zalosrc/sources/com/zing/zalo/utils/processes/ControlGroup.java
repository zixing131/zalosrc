package com.zing.zalo.utils.processes;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public class ControlGroup implements Parcelable {
    public static final Parcelable.Creator<ControlGroup> CREATOR = new C16746a();

    /* renamed from: p */
    public final int f85006p;

    /* renamed from: q */
    public final String f85007q;

    /* renamed from: r */
    public final String f85008r;

    /* renamed from: com.zing.zalo.utils.processes.ControlGroup$a */
    /* loaded from: classes4.dex */
    class C16746a implements Parcelable.Creator {
        C16746a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ControlGroup createFromParcel(Parcel parcel) {
            return new ControlGroup(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ControlGroup[] newArray(int i11) {
            return new ControlGroup[i11];
        }
    }

    protected ControlGroup(Parcel parcel) {
        this.f85006p = parcel.readInt();
        this.f85007q = parcel.readString();
        this.f85008r = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return String.format("%d:%s:%s", Integer.valueOf(this.f85006p), this.f85007q, this.f85008r);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f85006p);
        parcel.writeString(this.f85007q);
        parcel.writeString(this.f85008r);
    }
}

package com.zing.zalo.utils.processes;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class Statm extends ProcFile {
    public static final Parcelable.Creator<Statm> CREATOR = new C16749a();

    /* renamed from: q */
    public final String[] f85011q;

    /* renamed from: com.zing.zalo.utils.processes.Statm$a */
    /* loaded from: classes4.dex */
    class C16749a implements Parcelable.Creator {
        C16749a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Statm createFromParcel(Parcel parcel) {
            return new Statm(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Statm[] newArray(int i11) {
            return new Statm[i11];
        }
    }

    @Override // com.zing.zalo.utils.processes.ProcFile, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        parcel.writeStringArray(this.f85011q);
    }

    private Statm(Parcel parcel) {
        super(parcel);
        this.f85011q = parcel.createStringArray();
    }
}

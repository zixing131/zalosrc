package com.zing.zalo.utils.processes;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class Stat extends ProcFile {
    public static final Parcelable.Creator<Stat> CREATOR = new C16748a();

    /* renamed from: q */
    private final String[] f85010q;

    /* renamed from: com.zing.zalo.utils.processes.Stat$a */
    /* loaded from: classes4.dex */
    class C16748a implements Parcelable.Creator {
        C16748a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Stat createFromParcel(Parcel parcel) {
            return new Stat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Stat[] newArray(int i11) {
            return new Stat[i11];
        }
    }

    @Override // com.zing.zalo.utils.processes.ProcFile, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        parcel.writeStringArray(this.f85010q);
    }

    private Stat(Parcel parcel) {
        super(parcel);
        this.f85010q = parcel.createStringArray();
    }
}

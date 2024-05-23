package com.zing.zalo.utils.processes;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class Status extends ProcFile {
    public static final Parcelable.Creator<Status> CREATOR = new C16750a();

    /* renamed from: com.zing.zalo.utils.processes.Status$a */
    /* loaded from: classes4.dex */
    class C16750a implements Parcelable.Creator {
        C16750a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Status createFromParcel(Parcel parcel) {
            return new Status(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Status[] newArray(int i11) {
            return new Status[i11];
        }
    }

    private Status(Parcel parcel) {
        super(parcel);
    }
}

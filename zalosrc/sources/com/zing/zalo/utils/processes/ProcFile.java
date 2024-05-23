package com.zing.zalo.utils.processes;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;

/* loaded from: classes4.dex */
public class ProcFile extends File implements Parcelable {
    public static final Parcelable.Creator<ProcFile> CREATOR = new C16747a();

    /* renamed from: p */
    public final String f85009p;

    /* renamed from: com.zing.zalo.utils.processes.ProcFile$a */
    /* loaded from: classes4.dex */
    class C16747a implements Parcelable.Creator {
        C16747a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ProcFile createFromParcel(Parcel parcel) {
            return new ProcFile(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ProcFile[] newArray(int i11) {
            return new ProcFile[i11];
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ProcFile(Parcel parcel) {
        super(parcel.readString());
        this.f85009p = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.io.File
    public long length() {
        return this.f85009p.length();
    }

    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(getAbsolutePath());
        parcel.writeString(this.f85009p);
    }
}

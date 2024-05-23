package com.zing.zalo.utils.processes;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;

/* loaded from: classes4.dex */
public class AndroidAppProcess extends AndroidProcess {

    /* renamed from: r */
    public final boolean f85001r;

    /* renamed from: s */
    public final int f85002s;

    /* renamed from: t */
    private static final boolean f85000t = new File("/dev/cpuctl/tasks").exists();
    public static final Parcelable.Creator<AndroidAppProcess> CREATOR = new C16743a();

    /* loaded from: classes4.dex */
    public static final class NotAndroidAppProcessException extends Exception {
    }

    /* renamed from: com.zing.zalo.utils.processes.AndroidAppProcess$a */
    /* loaded from: classes4.dex */
    class C16743a implements Parcelable.Creator {
        C16743a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AndroidAppProcess createFromParcel(Parcel parcel) {
            return new AndroidAppProcess(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AndroidAppProcess[] newArray(int i11) {
            return new AndroidAppProcess[i11];
        }
    }

    protected AndroidAppProcess(Parcel parcel) {
        super(parcel);
        boolean z11;
        if (parcel.readByte() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f85001r = z11;
        this.f85002s = parcel.readInt();
    }

    @Override // com.zing.zalo.utils.processes.AndroidProcess, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        parcel.writeByte(this.f85001r ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f85002s);
    }
}

package com.zing.zalo.utils.processes;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class Cgroup extends ProcFile {
    public static final Parcelable.Creator<Cgroup> CREATOR = new C16745a();

    /* renamed from: q */
    public final ArrayList f85005q;

    /* renamed from: com.zing.zalo.utils.processes.Cgroup$a */
    /* loaded from: classes4.dex */
    class C16745a implements Parcelable.Creator {
        C16745a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cgroup createFromParcel(Parcel parcel) {
            return new Cgroup(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Cgroup[] newArray(int i11) {
            return new Cgroup[i11];
        }
    }

    @Override // com.zing.zalo.utils.processes.ProcFile, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        parcel.writeTypedList(this.f85005q);
    }

    private Cgroup(Parcel parcel) {
        super(parcel);
        this.f85005q = parcel.createTypedArrayList(ControlGroup.CREATOR);
    }
}

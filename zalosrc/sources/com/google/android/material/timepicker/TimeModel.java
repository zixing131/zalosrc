package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class TimeModel implements Parcelable {
    public static final Parcelable.Creator<TimeModel> CREATOR = new C6452a();

    /* renamed from: p */
    private final C6461b f36207p;

    /* renamed from: q */
    private final C6461b f36208q;

    /* renamed from: r */
    final int f36209r;

    /* renamed from: s */
    int f36210s;

    /* renamed from: t */
    int f36211t;

    /* renamed from: u */
    int f36212u;

    /* renamed from: v */
    int f36213v;

    /* renamed from: com.google.android.material.timepicker.TimeModel$a */
    /* loaded from: classes3.dex */
    static class C6452a implements Parcelable.Creator {
        C6452a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public TimeModel createFromParcel(Parcel parcel) {
            return new TimeModel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public TimeModel[] newArray(int i11) {
            return new TimeModel[i11];
        }
    }

    public TimeModel(int i11, int i12, int i13, int i14) {
        this.f36210s = i11;
        this.f36211t = i12;
        this.f36212u = i13;
        this.f36209r = i14;
        this.f36213v = m33283c(i11);
        this.f36207p = new C6461b(59);
        this.f36208q = new C6461b(i14 == 1 ? 24 : 12);
    }

    /* renamed from: a */
    public static String m33281a(Resources resources, CharSequence charSequence) {
        return m33282b(resources, charSequence, "%02d");
    }

    /* renamed from: b */
    public static String m33282b(Resources resources, CharSequence charSequence, String str) {
        return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
    }

    /* renamed from: c */
    private static int m33283c(int i11) {
        return i11 >= 12 ? 1 : 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeModel)) {
            return false;
        }
        TimeModel timeModel = (TimeModel) obj;
        if (this.f36210s == timeModel.f36210s && this.f36211t == timeModel.f36211t && this.f36209r == timeModel.f36209r && this.f36212u == timeModel.f36212u) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f36209r), Integer.valueOf(this.f36210s), Integer.valueOf(this.f36211t), Integer.valueOf(this.f36212u)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f36210s);
        parcel.writeInt(this.f36211t);
        parcel.writeInt(this.f36212u);
        parcel.writeInt(this.f36209r);
    }

    protected TimeModel(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}

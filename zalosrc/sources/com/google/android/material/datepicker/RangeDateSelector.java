package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.util.C1483e;

/* loaded from: classes3.dex */
public class RangeDateSelector implements DateSelector<C1483e> {
    public static final Parcelable.Creator<RangeDateSelector> CREATOR = new C6297a();

    /* renamed from: p */
    private final String f35261p = " ";

    /* renamed from: q */
    private Long f35262q = null;

    /* renamed from: r */
    private Long f35263r = null;

    /* renamed from: s */
    private Long f35264s = null;

    /* renamed from: t */
    private Long f35265t = null;

    /* renamed from: com.google.android.material.datepicker.RangeDateSelector$a */
    /* loaded from: classes3.dex */
    static class C6297a implements Parcelable.Creator {
        C6297a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public RangeDateSelector createFromParcel(Parcel parcel) {
            RangeDateSelector rangeDateSelector = new RangeDateSelector();
            rangeDateSelector.f35262q = (Long) parcel.readValue(Long.class.getClassLoader());
            rangeDateSelector.f35263r = (Long) parcel.readValue(Long.class.getClassLoader());
            return rangeDateSelector;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public RangeDateSelector[] newArray(int i11) {
            return new RangeDateSelector[i11];
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeValue(this.f35262q);
        parcel.writeValue(this.f35263r);
    }
}

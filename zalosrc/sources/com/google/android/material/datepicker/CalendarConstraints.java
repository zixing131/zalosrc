package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.util.AbstractC1482d;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new C6288a();

    /* renamed from: p */
    private final Month f35240p;

    /* renamed from: q */
    private final Month f35241q;

    /* renamed from: r */
    private final DateValidator f35242r;

    /* renamed from: s */
    private Month f35243s;

    /* renamed from: t */
    private final int f35244t;

    /* renamed from: u */
    private final int f35245u;

    /* loaded from: classes3.dex */
    public interface DateValidator extends Parcelable {
    }

    /* renamed from: com.google.android.material.datepicker.CalendarConstraints$a */
    /* loaded from: classes3.dex */
    static class C6288a implements Parcelable.Creator {
        C6288a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public CalendarConstraints createFromParcel(Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public CalendarConstraints[] newArray(int i11) {
            return new CalendarConstraints[i11];
        }
    }

    /* synthetic */ CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, C6288a c6288a) {
        this(month, month2, dateValidator, month3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        if (this.f35240p.equals(calendarConstraints.f35240p) && this.f35241q.equals(calendarConstraints.f35241q) && AbstractC1482d.m7475a(this.f35243s, calendarConstraints.f35243s) && this.f35242r.equals(calendarConstraints.f35242r)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f35240p, this.f35241q, this.f35243s, this.f35242r});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeParcelable(this.f35240p, 0);
        parcel.writeParcelable(this.f35241q, 0);
        parcel.writeParcelable(this.f35243s, 0);
        parcel.writeParcelable(this.f35242r, 0);
    }

    private CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3) {
        this.f35240p = month;
        this.f35241q = month2;
        this.f35243s = month3;
        this.f35242r = dateValidator;
        if (month3 != null && month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (month3 != null && month3.compareTo(month2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        this.f35245u = month.m32265d(month2) + 1;
        this.f35244t = (month2.f35257r - month.f35257r) + 1;
    }
}

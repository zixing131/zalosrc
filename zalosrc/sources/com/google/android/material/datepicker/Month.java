package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new C6296a();

    /* renamed from: p */
    private final Calendar f35255p;

    /* renamed from: q */
    final int f35256q;

    /* renamed from: r */
    final int f35257r;

    /* renamed from: s */
    final int f35258s;

    /* renamed from: t */
    final int f35259t;

    /* renamed from: u */
    final long f35260u;

    /* renamed from: com.google.android.material.datepicker.Month$a */
    /* loaded from: classes3.dex */
    static class C6296a implements Parcelable.Creator {
        C6296a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Month createFromParcel(Parcel parcel) {
            return Month.m32263c(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Month[] newArray(int i11) {
            return new Month[i11];
        }
    }

    private Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar m32278a = AbstractC6303e.m32278a(calendar);
        this.f35255p = m32278a;
        this.f35256q = m32278a.get(2);
        this.f35257r = m32278a.get(1);
        this.f35258s = m32278a.getMaximum(7);
        this.f35259t = m32278a.getActualMaximum(5);
        this.f35260u = m32278a.getTimeInMillis();
    }

    /* renamed from: c */
    static Month m32263c(int i11, int i12) {
        Calendar m32280c = AbstractC6303e.m32280c();
        m32280c.set(1, i11);
        m32280c.set(2, i12);
        return new Month(m32280c);
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(Month month) {
        return this.f35255p.compareTo(month.f35255p);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m32265d(Month month) {
        if (this.f35255p instanceof GregorianCalendar) {
            return ((month.f35257r - this.f35257r) * 12) + (month.f35256q - this.f35256q);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        if (this.f35256q == month.f35256q && this.f35257r == month.f35257r) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f35256q), Integer.valueOf(this.f35257r)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f35257r);
        parcel.writeInt(this.f35256q);
    }
}

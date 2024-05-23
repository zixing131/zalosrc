package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.util.AbstractC1487i;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class CompositeDateValidator implements CalendarConstraints.DateValidator {

    /* renamed from: p */
    private final InterfaceC6292d f35248p;

    /* renamed from: q */
    private final List f35249q;

    /* renamed from: r */
    private static final InterfaceC6292d f35246r = new C6289a();

    /* renamed from: s */
    private static final InterfaceC6292d f35247s = new C6290b();
    public static final Parcelable.Creator<CompositeDateValidator> CREATOR = new C6291c();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.CompositeDateValidator$a */
    /* loaded from: classes3.dex */
    public static class C6289a implements InterfaceC6292d {
        C6289a() {
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.InterfaceC6292d
        /* renamed from: f */
        public int mo32254f() {
            return 1;
        }
    }

    /* renamed from: com.google.android.material.datepicker.CompositeDateValidator$b */
    /* loaded from: classes3.dex */
    static class C6290b implements InterfaceC6292d {
        C6290b() {
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.InterfaceC6292d
        /* renamed from: f */
        public int mo32254f() {
            return 2;
        }
    }

    /* renamed from: com.google.android.material.datepicker.CompositeDateValidator$c */
    /* loaded from: classes3.dex */
    static class C6291c implements Parcelable.Creator {
        C6291c() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public CompositeDateValidator createFromParcel(Parcel parcel) {
            InterfaceC6292d interfaceC6292d;
            ArrayList readArrayList = parcel.readArrayList(CalendarConstraints.DateValidator.class.getClassLoader());
            int readInt = parcel.readInt();
            if (readInt == 2) {
                interfaceC6292d = CompositeDateValidator.f35247s;
            } else {
                interfaceC6292d = readInt == 1 ? CompositeDateValidator.f35246r : CompositeDateValidator.f35247s;
            }
            return new CompositeDateValidator((List) AbstractC1487i.m7492g(readArrayList), interfaceC6292d, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public CompositeDateValidator[] newArray(int i11) {
            return new CompositeDateValidator[i11];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.datepicker.CompositeDateValidator$d */
    /* loaded from: classes3.dex */
    public interface InterfaceC6292d {
        /* renamed from: f */
        int mo32254f();
    }

    /* synthetic */ CompositeDateValidator(List list, InterfaceC6292d interfaceC6292d, C6289a c6289a) {
        this(list, interfaceC6292d);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompositeDateValidator)) {
            return false;
        }
        CompositeDateValidator compositeDateValidator = (CompositeDateValidator) obj;
        if (this.f35249q.equals(compositeDateValidator.f35249q) && this.f35248p.mo32254f() == compositeDateValidator.f35248p.mo32254f()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f35249q.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeList(this.f35249q);
        parcel.writeInt(this.f35248p.mo32254f());
    }

    private CompositeDateValidator(List list, InterfaceC6292d interfaceC6292d) {
        this.f35249q = list;
        this.f35248p = interfaceC6292d;
    }
}

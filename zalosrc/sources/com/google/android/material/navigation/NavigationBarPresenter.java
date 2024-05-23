package com.google.android.material.navigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.view.menu.C1072e;
import androidx.appcompat.view.menu.C1074g;
import androidx.appcompat.view.menu.InterfaceC1077j;
import androidx.appcompat.view.menu.SubMenuC1080m;
import com.google.android.material.badge.AbstractC6236a;
import com.google.android.material.internal.ParcelableSparseArray;

/* loaded from: classes3.dex */
public class NavigationBarPresenter implements InterfaceC1077j {

    /* renamed from: p */
    private C1072e f35653p;

    /* renamed from: q */
    private NavigationBarMenuView f35654q;

    /* renamed from: r */
    private boolean f35655r = false;

    /* renamed from: s */
    private int f35656s;

    /* loaded from: classes3.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C6362a();

        /* renamed from: p */
        int f35657p;

        /* renamed from: q */
        ParcelableSparseArray f35658q;

        /* renamed from: com.google.android.material.navigation.NavigationBarPresenter$SavedState$a */
        /* loaded from: classes3.dex */
        static class C6362a implements Parcelable.Creator {
            C6362a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }
        }

        SavedState() {
        }

        SavedState(Parcel parcel) {
            this.f35657p = parcel.readInt();
            this.f35658q = (ParcelableSparseArray) parcel.readParcelable(getClass().getClassLoader());
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            parcel.writeInt(this.f35657p);
            parcel.writeParcelable(this.f35658q, 0);
        }
    }

    /* renamed from: a */
    public void m32678a(int i11) {
        this.f35656s = i11;
    }

    /* renamed from: b */
    public void m32679b(NavigationBarMenuView navigationBarMenuView) {
        this.f35654q = navigationBarMenuView;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1077j
    /* renamed from: c */
    public void mo4988c(C1072e c1072e, boolean z11) {
    }

    /* renamed from: d */
    public void m32680d(boolean z11) {
        this.f35655r = z11;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1077j
    /* renamed from: f */
    public int mo4991f() {
        return this.f35656s;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1077j
    /* renamed from: g */
    public boolean mo4992g(C1072e c1072e, C1074g c1074g) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1077j
    /* renamed from: i */
    public void mo5015i(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f35654q.m32676j(savedState.f35657p);
            this.f35654q.setBadgeDrawables(AbstractC6236a.m31717b(this.f35654q.getContext(), savedState.f35658q));
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1077j
    /* renamed from: j */
    public boolean mo4994j(SubMenuC1080m subMenuC1080m) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1077j
    /* renamed from: k */
    public Parcelable mo5016k() {
        SavedState savedState = new SavedState();
        savedState.f35657p = this.f35654q.getSelectedItemId();
        savedState.f35658q = AbstractC6236a.m31718c(this.f35654q.getBadgeDrawables());
        return savedState;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1077j
    /* renamed from: l */
    public void mo4995l(boolean z11) {
        if (this.f35655r) {
            return;
        }
        if (z11) {
            this.f35654q.m32673c();
        } else {
            this.f35654q.m32677k();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1077j
    /* renamed from: m */
    public boolean mo5017m() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1077j
    /* renamed from: n */
    public boolean mo4996n(C1072e c1072e, C1074g c1074g) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1077j
    /* renamed from: o */
    public void mo4997o(Context context, C1072e c1072e) {
        this.f35653p = c1072e;
        this.f35654q.mo4980h(c1072e);
    }
}

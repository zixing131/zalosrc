package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.AbstractC1785o;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes2.dex */
public final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new C1724a();

    /* renamed from: A */
    final int f7004A;

    /* renamed from: B */
    Bundle f7005B;

    /* renamed from: C */
    Fragment f7006C;

    /* renamed from: p */
    final String f7007p;

    /* renamed from: q */
    final String f7008q;

    /* renamed from: r */
    final boolean f7009r;

    /* renamed from: s */
    final int f7010s;

    /* renamed from: t */
    final int f7011t;

    /* renamed from: u */
    final String f7012u;

    /* renamed from: v */
    final boolean f7013v;

    /* renamed from: w */
    final boolean f7014w;

    /* renamed from: x */
    final boolean f7015x;

    /* renamed from: y */
    final Bundle f7016y;

    /* renamed from: z */
    final boolean f7017z;

    /* renamed from: androidx.fragment.app.FragmentState$a */
    /* loaded from: classes2.dex */
    static class C1724a implements Parcelable.Creator {
        C1724a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public FragmentState[] newArray(int i11) {
            return new FragmentState[i11];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FragmentState(Fragment fragment) {
        this.f7007p = fragment.getClass().getName();
        this.f7008q = fragment.f6959t;
        this.f7009r = fragment.f6918B;
        this.f7010s = fragment.f6927K;
        this.f7011t = fragment.f6928L;
        this.f7012u = fragment.f6929M;
        this.f7013v = fragment.f6932P;
        this.f7014w = fragment.f6917A;
        this.f7015x = fragment.f6931O;
        this.f7016y = fragment.f6960u;
        this.f7017z = fragment.f6930N;
        this.f7004A = fragment.f6949g0.ordinal();
    }

    /* renamed from: a */
    public Fragment m8924a(ClassLoader classLoader, C1731e c1731e) {
        if (this.f7006C == null) {
            Bundle bundle = this.f7016y;
            if (bundle != null) {
                bundle.setClassLoader(classLoader);
            }
            Fragment mo8986a = c1731e.mo8986a(classLoader, this.f7007p);
            this.f7006C = mo8986a;
            mo8986a.m8843d1(this.f7016y);
            Bundle bundle2 = this.f7005B;
            if (bundle2 != null) {
                bundle2.setClassLoader(classLoader);
                this.f7006C.f6956q = this.f7005B;
            } else {
                this.f7006C.f6956q = new Bundle();
            }
            Fragment fragment = this.f7006C;
            fragment.f6959t = this.f7008q;
            fragment.f6918B = this.f7009r;
            fragment.f6920D = true;
            fragment.f6927K = this.f7010s;
            fragment.f6928L = this.f7011t;
            fragment.f6929M = this.f7012u;
            fragment.f6932P = this.f7013v;
            fragment.f6917A = this.f7014w;
            fragment.f6931O = this.f7015x;
            fragment.f6930N = this.f7017z;
            fragment.f6949g0 = AbstractC1785o.b.values()[this.f7004A];
            if (LayoutInflaterFactory2C1734h.f7048W) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Instantiated fragment ");
                sb2.append(this.f7006C);
            }
        }
        return this.f7006C;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f7007p);
        sb2.append(" (");
        sb2.append(this.f7008q);
        sb2.append(")}:");
        if (this.f7009r) {
            sb2.append(" fromLayout");
        }
        if (this.f7011t != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f7011t));
        }
        String str = this.f7012u;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(this.f7012u);
        }
        if (this.f7013v) {
            sb2.append(" retainInstance");
        }
        if (this.f7014w) {
            sb2.append(" removing");
        }
        if (this.f7015x) {
            sb2.append(" detached");
        }
        if (this.f7017z) {
            sb2.append(" hidden");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f7007p);
        parcel.writeString(this.f7008q);
        parcel.writeInt(this.f7009r ? 1 : 0);
        parcel.writeInt(this.f7010s);
        parcel.writeInt(this.f7011t);
        parcel.writeString(this.f7012u);
        parcel.writeInt(this.f7013v ? 1 : 0);
        parcel.writeInt(this.f7014w ? 1 : 0);
        parcel.writeInt(this.f7015x ? 1 : 0);
        parcel.writeBundle(this.f7016y);
        parcel.writeInt(this.f7017z ? 1 : 0);
        parcel.writeBundle(this.f7005B);
        parcel.writeInt(this.f7004A);
    }

    FragmentState(Parcel parcel) {
        this.f7007p = parcel.readString();
        this.f7008q = parcel.readString();
        this.f7009r = parcel.readInt() != 0;
        this.f7010s = parcel.readInt();
        this.f7011t = parcel.readInt();
        this.f7012u = parcel.readString();
        this.f7013v = parcel.readInt() != 0;
        this.f7014w = parcel.readInt() != 0;
        this.f7015x = parcel.readInt() != 0;
        this.f7016y = parcel.readBundle();
        this.f7017z = parcel.readInt() != 0;
        this.f7005B = parcel.readBundle();
        this.f7004A = parcel.readInt();
    }
}

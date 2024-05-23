package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.AbstractC1736j;
import androidx.lifecycle.AbstractC1785o;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes2.dex */
public final class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new C1714a();

    /* renamed from: A */
    final CharSequence f6901A;

    /* renamed from: B */
    final ArrayList f6902B;

    /* renamed from: C */
    final ArrayList f6903C;

    /* renamed from: D */
    final boolean f6904D;

    /* renamed from: p */
    final int[] f6905p;

    /* renamed from: q */
    final ArrayList f6906q;

    /* renamed from: r */
    final int[] f6907r;

    /* renamed from: s */
    final int[] f6908s;

    /* renamed from: t */
    final int f6909t;

    /* renamed from: u */
    final int f6910u;

    /* renamed from: v */
    final String f6911v;

    /* renamed from: w */
    final int f6912w;

    /* renamed from: x */
    final int f6913x;

    /* renamed from: y */
    final CharSequence f6914y;

    /* renamed from: z */
    final int f6915z;

    /* renamed from: androidx.fragment.app.BackStackState$a */
    /* loaded from: classes2.dex */
    static class C1714a implements Parcelable.Creator {
        C1714a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public BackStackState[] newArray(int i11) {
            return new BackStackState[i11];
        }
    }

    public BackStackState(C1727a c1727a) {
        int size = c1727a.f7121a.size();
        this.f6905p = new int[size * 5];
        if (c1727a.f7128h) {
            this.f6906q = new ArrayList(size);
            this.f6907r = new int[size];
            this.f6908s = new int[size];
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                AbstractC1736j.a aVar = (AbstractC1736j.a) c1727a.f7121a.get(i12);
                int i13 = i11 + 1;
                this.f6905p[i11] = aVar.f7139a;
                ArrayList arrayList = this.f6906q;
                Fragment fragment = aVar.f7140b;
                arrayList.add(fragment != null ? fragment.f6959t : null);
                int[] iArr = this.f6905p;
                iArr[i13] = aVar.f7141c;
                iArr[i11 + 2] = aVar.f7142d;
                int i14 = i11 + 4;
                iArr[i11 + 3] = aVar.f7143e;
                i11 += 5;
                iArr[i14] = aVar.f7144f;
                this.f6907r[i12] = aVar.f7145g.ordinal();
                this.f6908s[i12] = aVar.f7146h.ordinal();
            }
            this.f6909t = c1727a.f7126f;
            this.f6910u = c1727a.f7127g;
            this.f6911v = c1727a.f7130j;
            this.f6912w = c1727a.f7026u;
            this.f6913x = c1727a.f7131k;
            this.f6914y = c1727a.f7132l;
            this.f6915z = c1727a.f7133m;
            this.f6901A = c1727a.f7134n;
            this.f6902B = c1727a.f7135o;
            this.f6903C = c1727a.f7136p;
            this.f6904D = c1727a.f7137q;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    /* renamed from: a */
    public C1727a m8779a(LayoutInflaterFactory2C1734h layoutInflaterFactory2C1734h) {
        C1727a c1727a = new C1727a(layoutInflaterFactory2C1734h);
        int i11 = 0;
        int i12 = 0;
        while (i11 < this.f6905p.length) {
            AbstractC1736j.a aVar = new AbstractC1736j.a();
            int i13 = i11 + 1;
            aVar.f7139a = this.f6905p[i11];
            if (LayoutInflaterFactory2C1734h.f7048W) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Instantiate ");
                sb2.append(c1727a);
                sb2.append(" op #");
                sb2.append(i12);
                sb2.append(" base fragment #");
                sb2.append(this.f6905p[i13]);
            }
            String str = (String) this.f6906q.get(i12);
            if (str != null) {
                aVar.f7140b = (Fragment) layoutInflaterFactory2C1734h.f7077v.get(str);
            } else {
                aVar.f7140b = null;
            }
            aVar.f7145g = AbstractC1785o.b.values()[this.f6907r[i12]];
            aVar.f7146h = AbstractC1785o.b.values()[this.f6908s[i12]];
            int[] iArr = this.f6905p;
            int i14 = iArr[i13];
            aVar.f7141c = i14;
            int i15 = iArr[i11 + 2];
            aVar.f7142d = i15;
            int i16 = i11 + 4;
            int i17 = iArr[i11 + 3];
            aVar.f7143e = i17;
            i11 += 5;
            int i18 = iArr[i16];
            aVar.f7144f = i18;
            c1727a.f7122b = i14;
            c1727a.f7123c = i15;
            c1727a.f7124d = i17;
            c1727a.f7125e = i18;
            c1727a.m9140c(aVar);
            i12++;
        }
        c1727a.f7126f = this.f6909t;
        c1727a.f7127g = this.f6910u;
        c1727a.f7130j = this.f6911v;
        c1727a.f7026u = this.f6912w;
        c1727a.f7128h = true;
        c1727a.f7131k = this.f6913x;
        c1727a.f7132l = this.f6914y;
        c1727a.f7133m = this.f6915z;
        c1727a.f7134n = this.f6901A;
        c1727a.f7135o = this.f6902B;
        c1727a.f7136p = this.f6903C;
        c1727a.f7137q = this.f6904D;
        c1727a.m8938h(1);
        return c1727a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeIntArray(this.f6905p);
        parcel.writeStringList(this.f6906q);
        parcel.writeIntArray(this.f6907r);
        parcel.writeIntArray(this.f6908s);
        parcel.writeInt(this.f6909t);
        parcel.writeInt(this.f6910u);
        parcel.writeString(this.f6911v);
        parcel.writeInt(this.f6912w);
        parcel.writeInt(this.f6913x);
        TextUtils.writeToParcel(this.f6914y, parcel, 0);
        parcel.writeInt(this.f6915z);
        TextUtils.writeToParcel(this.f6901A, parcel, 0);
        parcel.writeStringList(this.f6902B);
        parcel.writeStringList(this.f6903C);
        parcel.writeInt(this.f6904D ? 1 : 0);
    }

    public BackStackState(Parcel parcel) {
        this.f6905p = parcel.createIntArray();
        this.f6906q = parcel.createStringArrayList();
        this.f6907r = parcel.createIntArray();
        this.f6908s = parcel.createIntArray();
        this.f6909t = parcel.readInt();
        this.f6910u = parcel.readInt();
        this.f6911v = parcel.readString();
        this.f6912w = parcel.readInt();
        this.f6913x = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f6914y = (CharSequence) creator.createFromParcel(parcel);
        this.f6915z = parcel.readInt();
        this.f6901A = (CharSequence) creator.createFromParcel(parcel);
        this.f6902B = parcel.createStringArrayList();
        this.f6903C = parcel.createStringArrayList();
        this.f6904D = parcel.readInt() != 0;
    }
}

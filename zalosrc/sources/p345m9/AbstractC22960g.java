package p345m9;

import android.util.SparseIntArray;

/* renamed from: m9.g */
/* loaded from: classes3.dex */
public abstract class AbstractC22960g {

    /* renamed from: m9.g$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        int f111681a;

        /* renamed from: b */
        int f111682b;

        /* renamed from: c */
        int f111683c;

        public a(int i11, int i12, int i13) {
            this.f111681a = i11;
            this.f111682b = i12;
            this.f111683c = i13;
        }

        /* renamed from: a */
        public a m117688a(a aVar) {
            return new a(this.f111681a - aVar.m117691d(), this.f111682b - aVar.m117690c(), this.f111683c - aVar.m117689b());
        }

        /* renamed from: b */
        public int m117689b() {
            return this.f111683c;
        }

        /* renamed from: c */
        public int m117690c() {
            return this.f111682b;
        }

        /* renamed from: d */
        public int m117691d() {
            return this.f111681a;
        }
    }

    /* renamed from: a */
    public static a m117687a(SparseIntArray[] sparseIntArrayArr) {
        int i11;
        int i12;
        SparseIntArray sparseIntArray;
        int i13 = 0;
        if (sparseIntArrayArr != null && (sparseIntArray = sparseIntArrayArr[0]) != null) {
            int i14 = 0;
            i11 = 0;
            i12 = 0;
            while (i13 < sparseIntArray.size()) {
                int keyAt = sparseIntArray.keyAt(i13);
                int valueAt = sparseIntArray.valueAt(i13);
                i14 += valueAt;
                if (keyAt > 700) {
                    i12 += valueAt;
                }
                if (keyAt > 16) {
                    i11 += valueAt;
                }
                i13++;
            }
            i13 = i14;
        } else {
            i11 = 0;
            i12 = 0;
        }
        return new a(i13, i11, i12);
    }
}

package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class h83 extends x73 implements Set {

    /* renamed from: q */
    private transient c83 f21584q;

    /* renamed from: n */
    public static int m22730n(int i11) {
        boolean z11;
        int max = Math.max(i11, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
            } while (highestOneBit * 0.7d < max);
            return highestOneBit;
        }
        if (max < 1073741824) {
            z11 = true;
        } else {
            z11 = false;
        }
        j53.m23536f(z11, "collection too large");
        return 1073741824;
    }

    /* renamed from: r */
    public static g83 m22731r(int i11) {
        return new g83(i11);
    }

    /* renamed from: t */
    public static h83 m22733t(Collection collection) {
        Object[] array = collection.toArray();
        return m22736x(array.length, array);
    }

    /* renamed from: u */
    public static h83 m22734u(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        Object[] objArr2 = new Object[12];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, 6);
        return m22736x(12, objArr2);
    }

    /* renamed from: x */
    public static h83 m22736x(int i11, Object... objArr) {
        if (i11 != 0) {
            if (i11 != 1) {
                int m22730n = m22730n(i11);
                Object[] objArr2 = new Object[m22730n];
                int i12 = m22730n - 1;
                int i13 = 0;
                int i14 = 0;
                for (int i15 = 0; i15 < i11; i15++) {
                    Object obj = objArr[i15];
                    i93.m23144a(obj, i15);
                    int hashCode = obj.hashCode();
                    int m26863a = u73.m26863a(hashCode);
                    while (true) {
                        int i16 = m26863a & i12;
                        Object obj2 = objArr2[i16];
                        if (obj2 == null) {
                            objArr[i14] = obj;
                            objArr2[i16] = obj;
                            i13 += hashCode;
                            i14++;
                            break;
                        }
                        if (obj2.equals(obj)) {
                            break;
                        }
                        m26863a++;
                    }
                }
                Arrays.fill(objArr, i14, i11, (Object) null);
                if (i14 == 1) {
                    Object obj3 = objArr[0];
                    obj3.getClass();
                    return new y93(obj3);
                }
                if (m22730n(i14) < m22730n / 2) {
                    return m22736x(i14, objArr);
                }
                if (m22737z(i14, objArr.length)) {
                    objArr = Arrays.copyOf(objArr, i14);
                }
                return new r93(objArr, i13, objArr2, i12, i14);
            }
            Object obj4 = objArr[0];
            obj4.getClass();
            return new y93(obj4);
        }
        return r93.f27144x;
    }

    /* renamed from: z */
    public static boolean m22737z(int i11, int i12) {
        return i11 < (i12 >> 1) + (i12 >> 2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof h83) && mo22739w() && ((h83) obj).mo22739w() && hashCode() != obj.hashCode()) {
            return false;
        }
        return x93.m27870c(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return x93.m27868a(this);
    }

    @Override // com.google.android.gms.internal.ads.x73
    /* renamed from: j */
    public c83 mo20837j() {
        c83 c83Var = this.f21584q;
        if (c83Var == null) {
            c83 mo22738p = mo22738p();
            this.f21584q = mo22738p;
            return mo22738p;
        }
        return c83Var;
    }

    @Override // com.google.android.gms.internal.ads.x73
    /* renamed from: k */
    public abstract ba3 mo20838k();

    /* renamed from: p */
    c83 mo22738p() {
        return c83.m20827r(toArray());
    }

    /* renamed from: w */
    boolean mo22739w() {
        return false;
    }
}

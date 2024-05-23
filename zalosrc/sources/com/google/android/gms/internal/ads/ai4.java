package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;
import p664y.AbstractC30228a;

/* loaded from: classes2.dex */
public final class ai4 extends my0 {

    /* renamed from: S */
    public static final ai4 f17067S;

    /* renamed from: T */
    public static final ai4 f17068T;

    /* renamed from: U */
    public static final g94 f17069U;

    /* renamed from: D */
    public final boolean f17070D;

    /* renamed from: E */
    public final boolean f17071E;

    /* renamed from: F */
    public final boolean f17072F;

    /* renamed from: G */
    public final boolean f17073G;

    /* renamed from: H */
    public final boolean f17074H;

    /* renamed from: I */
    public final boolean f17075I;

    /* renamed from: J */
    public final boolean f17076J;

    /* renamed from: K */
    public final boolean f17077K;

    /* renamed from: L */
    public final boolean f17078L;

    /* renamed from: M */
    public final boolean f17079M;

    /* renamed from: N */
    public final boolean f17080N;

    /* renamed from: O */
    public final boolean f17081O;

    /* renamed from: P */
    public final boolean f17082P;

    /* renamed from: Q */
    private final SparseArray f17083Q;

    /* renamed from: R */
    private final SparseBooleanArray f17084R;

    static {
        ai4 ai4Var = new ai4(new yh4());
        f17067S = ai4Var;
        f17068T = ai4Var;
        f17069U = wh4.f29930a;
    }

    public /* synthetic */ ai4(yh4 yh4Var, zh4 zh4Var) {
        this(yh4Var);
    }

    /* renamed from: d */
    public static ai4 m20129d(Context context) {
        return new ai4(new yh4(context));
    }

    /* renamed from: c */
    public final yh4 m20130c() {
        return new yh4(this, null);
    }

    /* renamed from: e */
    public final bi4 m20131e(int i11, dh4 dh4Var) {
        Map map = (Map) this.f17083Q.get(i11);
        if (map != null) {
            AbstractC30228a.m149044a(map.get(dh4Var));
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.my0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ai4.class == obj.getClass()) {
            ai4 ai4Var = (ai4) obj;
            if (super.equals(ai4Var) && this.f17070D == ai4Var.f17070D && this.f17072F == ai4Var.f17072F && this.f17074H == ai4Var.f17074H && this.f17079M == ai4Var.f17079M && this.f17080N == ai4Var.f17080N && this.f17082P == ai4Var.f17082P) {
                SparseBooleanArray sparseBooleanArray = this.f17084R;
                SparseBooleanArray sparseBooleanArray2 = ai4Var.f17084R;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i11 = 0;
                    while (true) {
                        if (i11 < size) {
                            if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i11)) < 0) {
                                break;
                            }
                            i11++;
                        } else {
                            SparseArray sparseArray = this.f17083Q;
                            SparseArray sparseArray2 = ai4Var.f17083Q;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                for (int i12 = 0; i12 < size2; i12++) {
                                    int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i12));
                                    if (indexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i12);
                                        Map map2 = (Map) sparseArray2.valueAt(indexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                dh4 dh4Var = (dh4) entry.getKey();
                                                if (map2.containsKey(dh4Var) && g92.m22362t(entry.getValue(), map2.get(dh4Var))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m20132f(int i11) {
        return this.f17084R.get(i11);
    }

    /* renamed from: g */
    public final boolean m20133g(int i11, dh4 dh4Var) {
        Map map = (Map) this.f17083Q.get(i11);
        if (map != null && map.containsKey(dh4Var)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.my0
    public final int hashCode() {
        return ((((((((((((super.hashCode() + 31) * 31) + (this.f17070D ? 1 : 0)) * 961) + (this.f17072F ? 1 : 0)) * 961) + (this.f17074H ? 1 : 0)) * 28629151) + (this.f17079M ? 1 : 0)) * 31) + (this.f17080N ? 1 : 0)) * 961) + (this.f17082P ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ai4(yh4 yh4Var) {
        super(yh4Var);
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        SparseArray sparseArray;
        SparseBooleanArray sparseBooleanArray;
        z11 = yh4Var.f30951q;
        this.f17070D = z11;
        this.f17071E = false;
        z12 = yh4Var.f30952r;
        this.f17072F = z12;
        this.f17073G = false;
        z13 = yh4Var.f30953s;
        this.f17074H = z13;
        this.f17075I = false;
        this.f17076J = false;
        this.f17077K = false;
        this.f17078L = false;
        z14 = yh4Var.f30954t;
        this.f17079M = z14;
        z15 = yh4Var.f30955u;
        this.f17080N = z15;
        this.f17081O = false;
        z16 = yh4Var.f30956v;
        this.f17082P = z16;
        sparseArray = yh4Var.f30957w;
        this.f17083Q = sparseArray;
        sparseBooleanArray = yh4Var.f30958x;
        this.f17084R = sparseBooleanArray;
    }
}

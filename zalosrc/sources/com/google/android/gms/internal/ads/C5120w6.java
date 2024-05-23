package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.w6 */
/* loaded from: classes2.dex */
final class C5120w6 implements InterfaceC4823o6 {

    /* renamed from: a */
    private final wz1 f29812a = new wz1(new byte[5], 5);

    /* renamed from: b */
    private final SparseArray f29813b = new SparseArray();

    /* renamed from: c */
    private final SparseIntArray f29814c = new SparseIntArray();

    /* renamed from: d */
    private final int f29815d;

    /* renamed from: e */
    final /* synthetic */ C5158x6 f29816e;

    public C5120w6(C5158x6 c5158x6, int i11) {
        this.f29816e = c5158x6;
        this.f29815d = i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0119, code lost:            if (r28.m27788s() == 21) goto L26;     */
    @Override // com.google.android.gms.internal.ads.InterfaceC4823o6
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo21618a(x02 x02Var) {
        List list;
        SparseArray sparseArray;
        int i11;
        mm4 mm4Var;
        SparseBooleanArray sparseBooleanArray;
        SparseBooleanArray sparseBooleanArray2;
        a72 a72Var;
        int i12;
        mm4 mm4Var2;
        SparseArray sparseArray2;
        SparseBooleanArray sparseBooleanArray3;
        InterfaceC4307a7 interfaceC4307a7;
        a72 a72Var2;
        int i13;
        if (x02Var.m27788s() == 2) {
            list = this.f29816e.f30348a;
            a72 a72Var3 = (a72) list.get(0);
            if ((x02Var.m27788s() & 128) == 0) {
                return;
            }
            x02Var.m27776g(1);
            int m27792w = x02Var.m27792w();
            int i14 = 3;
            x02Var.m27776g(3);
            x02Var.m27770a(this.f29812a, 2);
            this.f29812a.m27753j(3);
            int i15 = 13;
            this.f29816e.f30363p = this.f29812a.m27746c(13);
            x02Var.m27770a(this.f29812a, 2);
            int i16 = 4;
            this.f29812a.m27753j(4);
            int i17 = 12;
            x02Var.m27776g(this.f29812a.m27746c(12));
            this.f29813b.clear();
            this.f29814c.clear();
            int m27778i = x02Var.m27778i();
            while (m27778i > 0) {
                int i18 = 5;
                x02Var.m27770a(this.f29812a, 5);
                int m27746c = this.f29812a.m27746c(8);
                this.f29812a.m27753j(i14);
                int m27746c2 = this.f29812a.m27746c(i15);
                this.f29812a.m27753j(i16);
                int m27746c3 = this.f29812a.m27746c(i17);
                int m27780k = x02Var.m27780k();
                int i19 = m27780k + m27746c3;
                ArrayList arrayList = null;
                String str = null;
                int i21 = -1;
                while (x02Var.m27780k() < i19) {
                    int m27788s = x02Var.m27788s();
                    int m27780k2 = x02Var.m27780k() + x02Var.m27788s();
                    if (m27780k2 > i19) {
                        break;
                    }
                    if (m27788s == i18) {
                        long m27762A = x02Var.m27762A();
                        if (m27762A == 1094921523) {
                            i21 = 129;
                        } else if (m27762A == 1161904947) {
                            i21 = 135;
                        } else {
                            if (m27762A != 1094921524) {
                                if (m27762A == 1212503619) {
                                    i21 = 36;
                                }
                            }
                            i21 = 172;
                        }
                        a72Var2 = a72Var3;
                        i13 = m27792w;
                    } else if (m27788s == 106) {
                        a72Var2 = a72Var3;
                        i13 = m27792w;
                        i21 = 129;
                    } else if (m27788s == 122) {
                        a72Var2 = a72Var3;
                        i13 = m27792w;
                        i21 = 135;
                    } else if (m27788s != 127) {
                        if (m27788s == 123) {
                            a72Var2 = a72Var3;
                            i13 = m27792w;
                            i21 = 138;
                        } else if (m27788s == 10) {
                            a72Var2 = a72Var3;
                            str = x02Var.m27767F(i14, w43.f29782c).trim();
                            i13 = m27792w;
                        } else if (m27788s == 89) {
                            ArrayList arrayList2 = new ArrayList();
                            while (x02Var.m27780k() < m27780k2) {
                                String trim = x02Var.m27767F(i14, w43.f29782c).trim();
                                int m27788s2 = x02Var.m27788s();
                                a72 a72Var4 = a72Var3;
                                byte[] bArr = new byte[4];
                                x02Var.m27771b(bArr, 0, 4);
                                arrayList2.add(new C5195y6(trim, m27788s2, bArr));
                                a72Var3 = a72Var4;
                                m27792w = m27792w;
                                i14 = 3;
                            }
                            a72Var2 = a72Var3;
                            i13 = m27792w;
                            arrayList = arrayList2;
                            i21 = 89;
                        } else {
                            a72Var2 = a72Var3;
                            i13 = m27792w;
                            if (m27788s == 111) {
                                i21 = 257;
                            }
                        }
                    }
                    x02Var.m27776g(m27780k2 - x02Var.m27780k());
                    a72Var3 = a72Var2;
                    m27792w = i13;
                    i14 = 3;
                    i18 = 5;
                }
                a72 a72Var5 = a72Var3;
                int i22 = m27792w;
                x02Var.m27775f(i19);
                C5232z6 c5232z6 = new C5232z6(i21, str, arrayList, Arrays.copyOfRange(x02Var.m27777h(), m27780k, i19));
                if (m27746c == 6 || m27746c == 5) {
                    m27746c = c5232z6.f31378a;
                }
                m27778i -= m27746c3 + 5;
                sparseBooleanArray3 = this.f29816e.f30353f;
                if (!sparseBooleanArray3.get(m27746c2)) {
                    interfaceC4307a7 = this.f29816e.f30351d;
                    InterfaceC4380c7 mo20012a = interfaceC4307a7.mo20012a(m27746c, c5232z6);
                    this.f29814c.put(m27746c2, m27746c2);
                    this.f29813b.put(m27746c2, mo20012a);
                }
                a72Var3 = a72Var5;
                m27792w = i22;
                i14 = 3;
                i16 = 4;
                i17 = 12;
                i15 = 13;
            }
            a72 a72Var6 = a72Var3;
            int i23 = m27792w;
            int size = this.f29814c.size();
            int i24 = 0;
            while (i24 < size) {
                int keyAt = this.f29814c.keyAt(i24);
                int valueAt = this.f29814c.valueAt(i24);
                sparseBooleanArray = this.f29816e.f30353f;
                sparseBooleanArray.put(keyAt, true);
                sparseBooleanArray2 = this.f29816e.f30354g;
                sparseBooleanArray2.put(valueAt, true);
                InterfaceC4380c7 interfaceC4380c7 = (InterfaceC4380c7) this.f29813b.valueAt(i24);
                if (interfaceC4380c7 != null) {
                    mm4Var2 = this.f29816e.f30357j;
                    i12 = i23;
                    C4344b7 c4344b7 = new C4344b7(i12, keyAt, 8192);
                    a72Var = a72Var6;
                    interfaceC4380c7.mo20812b(a72Var, mm4Var2, c4344b7);
                    sparseArray2 = this.f29816e.f30352e;
                    sparseArray2.put(valueAt, interfaceC4380c7);
                } else {
                    a72Var = a72Var6;
                    i12 = i23;
                }
                i24++;
                a72Var6 = a72Var;
                i23 = i12;
            }
            sparseArray = this.f29816e.f30352e;
            sparseArray.remove(this.f29815d);
            this.f29816e.f30358k = 0;
            C5158x6 c5158x6 = this.f29816e;
            i11 = c5158x6.f30358k;
            if (i11 == 0) {
                mm4Var = c5158x6.f30357j;
                mm4Var.zzC();
                this.f29816e.f30359l = true;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4823o6
    /* renamed from: b */
    public final void mo21619b(a72 a72Var, mm4 mm4Var, C4344b7 c4344b7) {
    }
}

package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.play_billing.s */
/* loaded from: classes2.dex */
public final class C5832s extends AbstractC5784k {

    /* renamed from: v */
    static final AbstractC5784k f33423v = new C5832s(null, new Object[0], 0);

    /* renamed from: s */
    private final transient Object f33424s;

    /* renamed from: t */
    final transient Object[] f33425t;

    /* renamed from: u */
    private final transient int f33426u;

    private C5832s(Object obj, Object[] objArr, int i11) {
        this.f33424s = obj;
        this.f33425t = objArr;
        this.f33426u = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v4, types: [int[]] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object[]] */
    /* renamed from: f */
    public static C5832s m30445f(int i11, Object[] objArr, C5778j c5778j) {
        int i12;
        short[] sArr;
        Object[] objArr2;
        int i13 = i11;
        Object[] objArr3 = objArr;
        if (i13 == 0) {
            return (C5832s) f33423v;
        }
        Object obj = null;
        if (i13 == 1) {
            Object obj2 = objArr3[0];
            obj2.getClass();
            Object obj3 = objArr3[1];
            obj3.getClass();
            AbstractC5728b.m30171a(obj2, obj3);
            return new C5832s(null, objArr3, 1);
        }
        AbstractC5727a5.m30167b(i13, objArr3.length >> 1, "index");
        char c11 = 2;
        int max = Math.max(i13, 2);
        if (max < 751619276) {
            i12 = Integer.highestOneBit(max - 1);
            do {
                i12 += i12;
            } while (i12 * 0.7d < max);
        } else {
            i12 = 1073741824;
            if (max >= 1073741824) {
                throw new IllegalArgumentException("collection too large");
            }
        }
        if (i13 == 1) {
            Object obj4 = objArr3[0];
            obj4.getClass();
            Object obj5 = objArr3[1];
            obj5.getClass();
            AbstractC5728b.m30171a(obj4, obj5);
            i13 = 1;
        } else {
            int i14 = i12 - 1;
            char c12 = 65535;
            if (i12 <= 128) {
                byte[] bArr = new byte[i12];
                Arrays.fill(bArr, (byte) -1);
                int i15 = 0;
                for (int i16 = 0; i16 < i13; i16++) {
                    int i17 = i15 + i15;
                    int i18 = i16 + i16;
                    Object obj6 = objArr3[i18];
                    obj6.getClass();
                    Object obj7 = objArr3[i18 ^ 1];
                    obj7.getClass();
                    AbstractC5728b.m30171a(obj6, obj7);
                    int m30182a = AbstractC5735c.m30182a(obj6.hashCode());
                    while (true) {
                        int i19 = m30182a & i14;
                        int i21 = bArr[i19] & 255;
                        if (i21 == 255) {
                            bArr[i19] = (byte) i17;
                            if (i15 < i16) {
                                objArr3[i17] = obj6;
                                objArr3[i17 ^ 1] = obj7;
                            }
                            i15++;
                        } else {
                            if (obj6.equals(objArr3[i21])) {
                                int i22 = i21 ^ 1;
                                Object obj8 = objArr3[i22];
                                obj8.getClass();
                                C5772i c5772i = new C5772i(obj6, obj7, obj8);
                                objArr3[i22] = obj7;
                                obj = c5772i;
                                break;
                            }
                            m30182a = i19 + 1;
                        }
                    }
                }
                if (i15 == i13) {
                    obj = bArr;
                    c11 = 2;
                } else {
                    sArr = new Object[]{bArr, Integer.valueOf(i15), obj};
                }
            } else if (i12 <= 32768) {
                sArr = new short[i12];
                Arrays.fill(sArr, (short) -1);
                int i23 = 0;
                for (int i24 = 0; i24 < i13; i24++) {
                    int i25 = i23 + i23;
                    int i26 = i24 + i24;
                    Object obj9 = objArr3[i26];
                    obj9.getClass();
                    Object obj10 = objArr3[i26 ^ 1];
                    obj10.getClass();
                    AbstractC5728b.m30171a(obj9, obj10);
                    int m30182a2 = AbstractC5735c.m30182a(obj9.hashCode());
                    while (true) {
                        int i27 = m30182a2 & i14;
                        char c13 = (char) sArr[i27];
                        if (c13 == 65535) {
                            sArr[i27] = (short) i25;
                            if (i23 < i24) {
                                objArr3[i25] = obj9;
                                objArr3[i25 ^ 1] = obj10;
                            }
                            i23++;
                        } else {
                            if (obj9.equals(objArr3[c13])) {
                                int i28 = c13 ^ 1;
                                Object obj11 = objArr3[i28];
                                obj11.getClass();
                                C5772i c5772i2 = new C5772i(obj9, obj10, obj11);
                                objArr3[i28] = obj10;
                                obj = c5772i2;
                                break;
                            }
                            m30182a2 = i27 + 1;
                        }
                    }
                }
                if (i23 != i13) {
                    c11 = 2;
                    objArr2 = new Object[]{sArr, Integer.valueOf(i23), obj};
                    obj = objArr2;
                }
            } else {
                sArr = new int[i12];
                Arrays.fill((int[]) sArr, -1);
                int i29 = 0;
                int i31 = 0;
                while (i29 < i13) {
                    int i32 = i31 + i31;
                    int i33 = i29 + i29;
                    Object obj12 = objArr3[i33];
                    obj12.getClass();
                    Object obj13 = objArr3[i33 ^ 1];
                    obj13.getClass();
                    AbstractC5728b.m30171a(obj12, obj13);
                    int m30182a3 = AbstractC5735c.m30182a(obj12.hashCode());
                    while (true) {
                        int i34 = m30182a3 & i14;
                        ?? r15 = sArr[i34];
                        if (r15 == c12) {
                            sArr[i34] = i32;
                            if (i31 < i29) {
                                objArr3[i32] = obj12;
                                objArr3[i32 ^ 1] = obj13;
                            }
                            i31++;
                        } else {
                            if (obj12.equals(objArr3[r15])) {
                                int i35 = r15 ^ 1;
                                Object obj14 = objArr3[i35];
                                obj14.getClass();
                                C5772i c5772i3 = new C5772i(obj12, obj13, obj14);
                                objArr3[i35] = obj13;
                                obj = c5772i3;
                                break;
                            }
                            m30182a3 = i34 + 1;
                            c12 = 65535;
                        }
                    }
                    i29++;
                    c12 = 65535;
                }
                if (i31 != i13) {
                    c11 = 2;
                    objArr2 = new Object[]{sArr, Integer.valueOf(i31), obj};
                    obj = objArr2;
                }
            }
            obj = sArr;
            c11 = 2;
        }
        boolean z11 = obj instanceof Object[];
        Object obj15 = obj;
        if (z11) {
            Object[] objArr4 = (Object[]) obj;
            c5778j.f33338c = (C5772i) objArr4[c11];
            Object obj16 = objArr4[0];
            int intValue = ((Integer) objArr4[1]).intValue();
            objArr3 = Arrays.copyOf(objArr3, intValue + intValue);
            obj15 = obj16;
            i13 = intValue;
        }
        return new C5832s(obj15, objArr3, i13);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5784k
    /* renamed from: a */
    final AbstractC5748e mo30303a() {
        return new C5826r(this.f33425t, 1, this.f33426u);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5784k
    /* renamed from: c */
    final AbstractC5790l mo30305c() {
        return new C5814p(this, this.f33425t, 0, this.f33426u);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5784k
    /* renamed from: d */
    final AbstractC5790l mo30306d() {
        return new C5820q(this, new C5826r(this.f33425t, 0, this.f33426u));
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009f A[RETURN] */
    @Override // com.google.android.gms.internal.play_billing.AbstractC5784k, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        if (obj != null) {
            int i11 = this.f33426u;
            Object[] objArr = this.f33425t;
            if (i11 == 1) {
                Object obj3 = objArr[0];
                obj3.getClass();
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    obj2.getClass();
                }
            } else {
                Object obj4 = this.f33424s;
                if (obj4 != null) {
                    if (obj4 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj4;
                        int length = bArr.length - 1;
                        int m30182a = AbstractC5735c.m30182a(obj.hashCode());
                        while (true) {
                            int i12 = m30182a & length;
                            int i13 = bArr[i12] & 255;
                            if (i13 == 255) {
                                break;
                            }
                            if (obj.equals(objArr[i13])) {
                                obj2 = objArr[i13 ^ 1];
                                break;
                            }
                            m30182a = i12 + 1;
                        }
                    } else if (obj4 instanceof short[]) {
                        short[] sArr = (short[]) obj4;
                        int length2 = sArr.length - 1;
                        int m30182a2 = AbstractC5735c.m30182a(obj.hashCode());
                        while (true) {
                            int i14 = m30182a2 & length2;
                            char c11 = (char) sArr[i14];
                            if (c11 == 65535) {
                                break;
                            }
                            if (obj.equals(objArr[c11])) {
                                obj2 = objArr[c11 ^ 1];
                                break;
                            }
                            m30182a2 = i14 + 1;
                        }
                    } else {
                        int[] iArr = (int[]) obj4;
                        int length3 = iArr.length - 1;
                        int m30182a3 = AbstractC5735c.m30182a(obj.hashCode());
                        while (true) {
                            int i15 = m30182a3 & length3;
                            int i16 = iArr[i15];
                            if (i16 == -1) {
                                break;
                            }
                            if (obj.equals(objArr[i16])) {
                                obj2 = objArr[i16 ^ 1];
                                break;
                            }
                            m30182a3 = i15 + 1;
                        }
                    }
                }
            }
            if (obj2 != null) {
                return null;
            }
            return obj2;
        }
        obj2 = null;
        if (obj2 != null) {
        }
    }

    @Override // java.util.Map
    public final int size() {
        return this.f33426u;
    }
}

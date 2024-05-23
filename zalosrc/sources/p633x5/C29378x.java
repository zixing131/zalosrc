package p633x5;

import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: x5.x */
/* loaded from: classes2.dex */
public final class C29378x extends AbstractC29362p {

    /* renamed from: v */
    static final AbstractC29362p f135875v = new C29378x(null, new Object[0], 0);

    /* renamed from: s */
    private final transient Object f135876s;

    /* renamed from: t */
    final transient Object[] f135877t;

    /* renamed from: u */
    private final transient int f135878u;

    private C29378x(Object obj, Object[] objArr, int i11) {
        this.f135876s = obj;
        this.f135877t = objArr;
        this.f135878u = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01b6  */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C29378x m146517g(int i11, Object[] objArr, C29360o c29360o) {
        int i12;
        short[] sArr;
        char c11;
        char c12;
        boolean z11;
        int i13 = i11;
        Object[] objArr2 = objArr;
        if (i13 == 0) {
            return (C29378x) f135875v;
        }
        Object obj = null;
        int i14 = 1;
        if (i13 == 1) {
            Object obj2 = objArr2[0];
            obj2.getClass();
            Object obj3 = objArr2[1];
            obj3.getClass();
            AbstractC29342f.m146483a(obj2, obj3);
            return new C29378x(null, objArr2, 1);
        }
        AbstractC29336c.m146472b(i13, objArr2.length >> 1, "index");
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
            Object obj4 = objArr2[0];
            obj4.getClass();
            Object obj5 = objArr2[1];
            obj5.getClass();
            AbstractC29342f.m146483a(obj4, obj5);
        } else {
            int i15 = i12 - 1;
            char c13 = 65535;
            if (i12 <= 128) {
                byte[] bArr = new byte[i12];
                Arrays.fill(bArr, (byte) -1);
                int i16 = 0;
                int i17 = 0;
                while (i16 < i13) {
                    int i18 = i17 + i17;
                    int i19 = i16 + i16;
                    Object obj6 = objArr2[i19];
                    obj6.getClass();
                    Object obj7 = objArr2[i19 ^ i14];
                    obj7.getClass();
                    AbstractC29342f.m146483a(obj6, obj7);
                    int m146487a = AbstractC29346h.m146487a(obj6.hashCode());
                    while (true) {
                        int i21 = m146487a & i15;
                        int i22 = bArr[i21] & 255;
                        if (i22 == 255) {
                            bArr[i21] = (byte) i18;
                            if (i17 < i16) {
                                objArr2[i18] = obj6;
                                objArr2[i18 ^ 1] = obj7;
                            }
                            i17++;
                        } else {
                            if (obj6.equals(objArr2[i22])) {
                                int i23 = i22 ^ 1;
                                Object obj8 = objArr2[i23];
                                obj8.getClass();
                                C29358n c29358n = new C29358n(obj6, obj7, obj8);
                                objArr2[i23] = obj7;
                                obj = c29358n;
                                break;
                            }
                            m146487a = i21 + 1;
                        }
                    }
                    i16++;
                    i14 = 1;
                }
                if (i17 == i13) {
                    obj = bArr;
                } else {
                    sArr = new Object[]{bArr, Integer.valueOf(i17), obj};
                }
            } else if (i12 <= 32768) {
                sArr = new short[i12];
                Arrays.fill(sArr, (short) -1);
                int i24 = 0;
                for (int i25 = 0; i25 < i13; i25++) {
                    int i26 = i24 + i24;
                    int i27 = i25 + i25;
                    Object obj9 = objArr2[i27];
                    obj9.getClass();
                    Object obj10 = objArr2[i27 ^ 1];
                    obj10.getClass();
                    AbstractC29342f.m146483a(obj9, obj10);
                    int m146487a2 = AbstractC29346h.m146487a(obj9.hashCode());
                    while (true) {
                        int i28 = m146487a2 & i15;
                        char c14 = (char) sArr[i28];
                        if (c14 == 65535) {
                            sArr[i28] = (short) i26;
                            if (i24 < i25) {
                                objArr2[i26] = obj9;
                                objArr2[i26 ^ 1] = obj10;
                            }
                            i24++;
                        } else {
                            if (obj9.equals(objArr2[c14])) {
                                int i29 = c14 ^ 1;
                                Object obj11 = objArr2[i29];
                                obj11.getClass();
                                C29358n c29358n2 = new C29358n(obj9, obj10, obj11);
                                objArr2[i29] = obj10;
                                obj = c29358n2;
                                break;
                            }
                            m146487a2 = i28 + 1;
                        }
                    }
                }
                if (i24 != i13) {
                    c12 = 2;
                    obj = new Object[]{sArr, Integer.valueOf(i24), obj};
                    c11 = 1;
                    z11 = obj instanceof Object[];
                    Object obj12 = obj;
                    if (z11) {
                        Object[] objArr3 = (Object[]) obj;
                        C29358n c29358n3 = (C29358n) objArr3[c12];
                        if (c29360o != null) {
                            c29360o.f135849c = c29358n3;
                            Object obj13 = objArr3[0];
                            int intValue = ((Integer) objArr3[c11]).intValue();
                            objArr2 = Arrays.copyOf(objArr2, intValue + intValue);
                            obj12 = obj13;
                            i13 = intValue;
                        } else {
                            throw c29358n3.m146499a();
                        }
                    }
                    return new C29378x(obj12, objArr2, i13);
                }
            } else {
                int i31 = 1;
                sArr = new int[i12];
                Arrays.fill((int[]) sArr, -1);
                int i32 = 0;
                int i33 = 0;
                while (i32 < i13) {
                    int i34 = i33 + i33;
                    int i35 = i32 + i32;
                    Object obj14 = objArr2[i35];
                    obj14.getClass();
                    Object obj15 = objArr2[i35 ^ i31];
                    obj15.getClass();
                    AbstractC29342f.m146483a(obj14, obj15);
                    int m146487a3 = AbstractC29346h.m146487a(obj14.hashCode());
                    while (true) {
                        int i36 = m146487a3 & i15;
                        ?? r15 = sArr[i36];
                        if (r15 == c13) {
                            sArr[i36] = i34;
                            if (i33 < i32) {
                                objArr2[i34] = obj14;
                                objArr2[i34 ^ 1] = obj15;
                            }
                            i33++;
                        } else {
                            if (obj14.equals(objArr2[r15])) {
                                int i37 = r15 ^ 1;
                                Object obj16 = objArr2[i37];
                                obj16.getClass();
                                C29358n c29358n4 = new C29358n(obj14, obj15, obj16);
                                objArr2[i37] = obj15;
                                obj = c29358n4;
                                break;
                            }
                            m146487a3 = i36 + 1;
                            c13 = 65535;
                        }
                    }
                    i32++;
                    i31 = 1;
                    c13 = 65535;
                }
                if (i33 != i13) {
                    c11 = 1;
                    c12 = 2;
                    obj = new Object[]{sArr, Integer.valueOf(i33), obj};
                    z11 = obj instanceof Object[];
                    Object obj122 = obj;
                    if (z11) {
                    }
                    return new C29378x(obj122, objArr2, i13);
                }
            }
            obj = sArr;
        }
        c12 = 2;
        c11 = 1;
        z11 = obj instanceof Object[];
        Object obj1222 = obj;
        if (z11) {
        }
        return new C29378x(obj1222, objArr2, i13);
    }

    @Override // p633x5.AbstractC29362p
    /* renamed from: a */
    final AbstractC29350j mo146504a() {
        return new C29376w(this.f135877t, 1, this.f135878u);
    }

    @Override // p633x5.AbstractC29362p
    /* renamed from: d */
    final AbstractC29364q mo146506d() {
        return new C29372u(this, this.f135877t, 0, this.f135878u);
    }

    @Override // p633x5.AbstractC29362p
    /* renamed from: e */
    final AbstractC29364q mo146507e() {
        return new C29374v(this, new C29376w(this.f135877t, 0, this.f135878u));
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009f A[RETURN] */
    @Override // p633x5.AbstractC29362p, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        Object obj3 = this.f135876s;
        Object[] objArr = this.f135877t;
        int i11 = this.f135878u;
        if (obj != null) {
            if (i11 == 1) {
                Object obj4 = objArr[0];
                obj4.getClass();
                if (obj4.equals(obj)) {
                    obj2 = objArr[1];
                    obj2.getClass();
                }
            } else if (obj3 != null) {
                if (obj3 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj3;
                    int length = bArr.length - 1;
                    int m146487a = AbstractC29346h.m146487a(obj.hashCode());
                    while (true) {
                        int i12 = m146487a & length;
                        int i13 = bArr[i12] & 255;
                        if (i13 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i13])) {
                            obj2 = objArr[i13 ^ 1];
                            break;
                        }
                        m146487a = i12 + 1;
                    }
                } else if (obj3 instanceof short[]) {
                    short[] sArr = (short[]) obj3;
                    int length2 = sArr.length - 1;
                    int m146487a2 = AbstractC29346h.m146487a(obj.hashCode());
                    while (true) {
                        int i14 = m146487a2 & length2;
                        char c11 = (char) sArr[i14];
                        if (c11 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[c11])) {
                            obj2 = objArr[c11 ^ 1];
                            break;
                        }
                        m146487a2 = i14 + 1;
                    }
                } else {
                    int[] iArr = (int[]) obj3;
                    int length3 = iArr.length - 1;
                    int m146487a3 = AbstractC29346h.m146487a(obj.hashCode());
                    while (true) {
                        int i15 = m146487a3 & length3;
                        int i16 = iArr[i15];
                        if (i16 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i16])) {
                            obj2 = objArr[i16 ^ 1];
                            break;
                        }
                        m146487a3 = i15 + 1;
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
        return this.f135878u;
    }
}

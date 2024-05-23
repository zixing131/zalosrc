package com.google.protobuf;

import com.google.protobuf.InterfaceC6813j1;
import java.util.Arrays;

/* renamed from: com.google.protobuf.d1 */
/* loaded from: classes3.dex */
public final class C6795d1 {

    /* renamed from: f */
    private static final C6795d1 f37253f = new C6795d1(0, new int[0], new Object[0], false);

    /* renamed from: a */
    private int f37254a;

    /* renamed from: b */
    private int[] f37255b;

    /* renamed from: c */
    private Object[] f37256c;

    /* renamed from: d */
    private int f37257d = -1;

    /* renamed from: e */
    private boolean f37258e;

    private C6795d1(int i11, int[] iArr, Object[] objArr, boolean z11) {
        this.f37254a = i11;
        this.f37255b = iArr;
        this.f37256c = objArr;
        this.f37258e = z11;
    }

    /* renamed from: a */
    public static C6795d1 m34768a() {
        return f37253f;
    }

    /* renamed from: d */
    private static int m34769d(int[] iArr, int i11) {
        int i12 = 17;
        for (int i13 = 0; i13 < i11; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        return i12;
    }

    /* renamed from: e */
    private static int m34770e(Object[] objArr, int i11) {
        int i12 = 17;
        for (int i13 = 0; i13 < i11; i13++) {
            i12 = (i12 * 31) + objArr[i13].hashCode();
        }
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static C6795d1 m34771g(C6795d1 c6795d1, C6795d1 c6795d12) {
        int i11 = c6795d1.f37254a + c6795d12.f37254a;
        int[] copyOf = Arrays.copyOf(c6795d1.f37255b, i11);
        System.arraycopy(c6795d12.f37255b, 0, copyOf, c6795d1.f37254a, c6795d12.f37254a);
        Object[] copyOf2 = Arrays.copyOf(c6795d1.f37256c, i11);
        System.arraycopy(c6795d12.f37256c, 0, copyOf2, c6795d1.f37254a, c6795d12.f37254a);
        return new C6795d1(i11, copyOf, copyOf2, true);
    }

    /* renamed from: h */
    private static boolean m34772h(Object[] objArr, Object[] objArr2, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            if (!objArr[i12].equals(objArr2[i12])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: j */
    private static boolean m34773j(int[] iArr, int[] iArr2, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            if (iArr[i12] != iArr2[i12]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: l */
    private static void m34774l(int i11, Object obj, InterfaceC6813j1 interfaceC6813j1) {
        int m34981a = AbstractC6810i1.m34981a(i11);
        int m34982b = AbstractC6810i1.m34982b(i11);
        if (m34982b != 0) {
            if (m34982b != 1) {
                if (m34982b != 2) {
                    if (m34982b != 3) {
                        if (m34982b == 5) {
                            interfaceC6813j1.mo34929d(m34981a, ((Integer) obj).intValue());
                            return;
                        }
                        throw new RuntimeException(InvalidProtocolBufferException.m34706a());
                    }
                    if (interfaceC6813j1.mo34950y() == InterfaceC6813j1.a.ASCENDING) {
                        interfaceC6813j1.mo34913C(m34981a);
                        ((C6795d1) obj).m34780m(interfaceC6813j1);
                        interfaceC6813j1.mo34919I(m34981a);
                        return;
                    } else {
                        interfaceC6813j1.mo34919I(m34981a);
                        ((C6795d1) obj).m34780m(interfaceC6813j1);
                        interfaceC6813j1.mo34913C(m34981a);
                        return;
                    }
                }
                interfaceC6813j1.mo34935j(m34981a, (AbstractC6799f) obj);
                return;
            }
            interfaceC6813j1.mo34949x(m34981a, ((Long) obj).longValue());
            return;
        }
        interfaceC6813j1.mo34951z(m34981a, ((Long) obj).longValue());
    }

    /* renamed from: b */
    public int m34775b() {
        int m34625S;
        int i11 = this.f37257d;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f37254a; i13++) {
            int i14 = this.f37255b[i13];
            int m34981a = AbstractC6810i1.m34981a(i14);
            int m34982b = AbstractC6810i1.m34982b(i14);
            if (m34982b != 0) {
                if (m34982b != 1) {
                    if (m34982b != 2) {
                        if (m34982b != 3) {
                            if (m34982b == 5) {
                                m34625S = CodedOutputStream.m34641m(m34981a, ((Integer) this.f37256c[i13]).intValue());
                            } else {
                                throw new IllegalStateException(InvalidProtocolBufferException.m34706a());
                            }
                        } else {
                            m34625S = (CodedOutputStream.m34622P(m34981a) * 2) + ((C6795d1) this.f37256c[i13]).m34775b();
                        }
                    } else {
                        m34625S = CodedOutputStream.m34635g(m34981a, (AbstractC6799f) this.f37256c[i13]);
                    }
                } else {
                    m34625S = CodedOutputStream.m34643o(m34981a, ((Long) this.f37256c[i13]).longValue());
                }
            } else {
                m34625S = CodedOutputStream.m34625S(m34981a, ((Long) this.f37256c[i13]).longValue());
            }
            i12 += m34625S;
        }
        this.f37257d = i12;
        return i12;
    }

    /* renamed from: c */
    public int m34776c() {
        int i11 = this.f37257d;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f37254a; i13++) {
            i12 += CodedOutputStream.m34610D(AbstractC6810i1.m34981a(this.f37255b[i13]), (AbstractC6799f) this.f37256c[i13]);
        }
        this.f37257d = i12;
        return i12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C6795d1)) {
            return false;
        }
        C6795d1 c6795d1 = (C6795d1) obj;
        int i11 = this.f37254a;
        if (i11 == c6795d1.f37254a && m34773j(this.f37255b, c6795d1.f37255b, i11) && m34772h(this.f37256c, c6795d1.f37256c, this.f37254a)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public void m34777f() {
        this.f37258e = false;
    }

    public int hashCode() {
        int i11 = this.f37254a;
        return ((((527 + i11) * 31) + m34769d(this.f37255b, i11)) * 31) + m34770e(this.f37256c, this.f37254a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public final void m34778i(StringBuilder sb2, int i11) {
        for (int i12 = 0; i12 < this.f37254a; i12++) {
            AbstractC6815k0.m34996c(sb2, i11, String.valueOf(AbstractC6810i1.m34981a(this.f37255b[i12])), this.f37256c[i12]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m34779k(InterfaceC6813j1 interfaceC6813j1) {
        if (interfaceC6813j1.mo34950y() == InterfaceC6813j1.a.DESCENDING) {
            for (int i11 = this.f37254a - 1; i11 >= 0; i11--) {
                interfaceC6813j1.mo34928c(AbstractC6810i1.m34981a(this.f37255b[i11]), this.f37256c[i11]);
            }
            return;
        }
        for (int i12 = 0; i12 < this.f37254a; i12++) {
            interfaceC6813j1.mo34928c(AbstractC6810i1.m34981a(this.f37255b[i12]), this.f37256c[i12]);
        }
    }

    /* renamed from: m */
    public void m34780m(InterfaceC6813j1 interfaceC6813j1) {
        if (this.f37254a == 0) {
            return;
        }
        if (interfaceC6813j1.mo34950y() == InterfaceC6813j1.a.ASCENDING) {
            for (int i11 = 0; i11 < this.f37254a; i11++) {
                m34774l(this.f37255b[i11], this.f37256c[i11], interfaceC6813j1);
            }
            return;
        }
        for (int i12 = this.f37254a - 1; i12 >= 0; i12--) {
            m34774l(this.f37255b[i12], this.f37256c[i12], interfaceC6813j1);
        }
    }
}

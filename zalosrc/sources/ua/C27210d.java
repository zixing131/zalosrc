package ua;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import va.C27953a;

/* renamed from: ua.d */
/* loaded from: classes3.dex */
public final class C27210d {

    /* renamed from: b */
    static final String[] f127934b = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};

    /* renamed from: c */
    static final int[][] f127935c = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};

    /* renamed from: d */
    private static final int[][] f127936d;

    /* renamed from: e */
    static final int[][] f127937e;

    /* renamed from: a */
    private final byte[] f127938a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ua.d$a */
    /* loaded from: classes3.dex */
    public class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C27212f c27212f, C27212f c27212f2) {
            return c27212f.m139300e() - c27212f2.m139300e();
        }
    }

    static {
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 5, 256);
        f127936d = iArr;
        iArr[0][32] = 1;
        for (int i11 = 65; i11 <= 90; i11++) {
            f127936d[0][i11] = i11 - 63;
        }
        f127936d[1][32] = 1;
        for (int i12 = 97; i12 <= 122; i12++) {
            f127936d[1][i12] = i12 - 95;
        }
        f127936d[2][32] = 1;
        for (int i13 = 48; i13 <= 57; i13++) {
            f127936d[2][i13] = i13 - 46;
        }
        int[] iArr2 = f127936d[2];
        iArr2[44] = 12;
        iArr2[46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, 127};
        for (int i14 = 0; i14 < 28; i14++) {
            f127936d[3][iArr3[i14]] = i14;
        }
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        for (int i15 = 0; i15 < 31; i15++) {
            int i16 = iArr4[i15];
            if (i16 > 0) {
                f127936d[4][i16] = i15;
            }
        }
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 6, 6);
        f127937e = iArr5;
        for (int[] iArr6 : iArr5) {
            Arrays.fill(iArr6, -1);
        }
        int[][] iArr7 = f127937e;
        iArr7[0][4] = 0;
        int[] iArr8 = iArr7[1];
        iArr8[4] = 0;
        iArr8[0] = 28;
        iArr7[3][4] = 0;
        int[] iArr9 = iArr7[2];
        iArr9[4] = 0;
        iArr9[0] = 15;
    }

    public C27210d(byte[] bArr) {
        this.f127938a = bArr;
    }

    /* renamed from: b */
    private static Collection m139289b(Iterable iterable) {
        LinkedList linkedList = new LinkedList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C27212f c27212f = (C27212f) it.next();
            Iterator it2 = linkedList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    C27212f c27212f2 = (C27212f) it2.next();
                    if (c27212f2.m139302g(c27212f)) {
                        break;
                    }
                    if (c27212f.m139302g(c27212f2)) {
                        it2.remove();
                    }
                } else {
                    linkedList.add(c27212f);
                    break;
                }
            }
        }
        return linkedList;
    }

    /* renamed from: c */
    private void m139290c(C27212f c27212f, int i11, Collection collection) {
        boolean z11;
        char c11 = (char) (this.f127938a[i11] & 255);
        if (f127936d[c27212f.m139301f()][c11] > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        C27212f c27212f2 = null;
        for (int i12 = 0; i12 <= 4; i12++) {
            int i13 = f127936d[i12][c11];
            if (i13 > 0) {
                if (c27212f2 == null) {
                    c27212f2 = c27212f.m139298c(i11);
                }
                if (!z11 || i12 == c27212f.m139301f() || i12 == 2) {
                    collection.add(c27212f2.m139303h(i12, i13));
                }
                if (!z11 && f127937e[c27212f.m139301f()][i12] >= 0) {
                    collection.add(c27212f2.m139304i(i12, i13));
                }
            }
        }
        if (c27212f.m139299d() > 0 || f127936d[c27212f.m139301f()][c11] == 0) {
            collection.add(c27212f.m139297a(i11));
        }
    }

    /* renamed from: d */
    private static void m139291d(C27212f c27212f, int i11, int i12, Collection collection) {
        C27212f m139298c = c27212f.m139298c(i11);
        collection.add(m139298c.m139303h(4, i12));
        if (c27212f.m139301f() != 4) {
            collection.add(m139298c.m139304i(4, i12));
        }
        if (i12 == 3 || i12 == 4) {
            collection.add(m139298c.m139303h(2, 16 - i12).m139303h(2, 1));
        }
        if (c27212f.m139299d() > 0) {
            collection.add(c27212f.m139297a(i11).m139297a(i11 + 1));
        }
    }

    /* renamed from: e */
    private Collection m139292e(Iterable iterable, int i11) {
        LinkedList linkedList = new LinkedList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            m139290c((C27212f) it.next(), i11, linkedList);
        }
        return m139289b(linkedList);
    }

    /* renamed from: f */
    private static Collection m139293f(Iterable iterable, int i11, int i12) {
        LinkedList linkedList = new LinkedList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            m139291d((C27212f) it.next(), i11, i12, linkedList);
        }
        return m139289b(linkedList);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C27953a m139294a() {
        byte b11;
        int i11;
        Collection singletonList = Collections.singletonList(C27212f.f127942e);
        int i12 = 0;
        while (true) {
            byte[] bArr = this.f127938a;
            if (i12 < bArr.length) {
                int i13 = i12 + 1;
                if (i13 < bArr.length) {
                    b11 = bArr[i13];
                } else {
                    b11 = 0;
                }
                byte b12 = bArr[i12];
                if (b12 != 13) {
                    if (b12 != 44) {
                        if (b12 != 46) {
                            if (b12 == 58 && b11 == 32) {
                                i11 = 5;
                                if (i11 <= 0) {
                                    singletonList = m139293f(singletonList, i12, i11);
                                    i12 = i13;
                                } else {
                                    singletonList = m139292e(singletonList, i12);
                                }
                                i12++;
                            }
                            i11 = 0;
                            if (i11 <= 0) {
                            }
                            i12++;
                        } else {
                            if (b11 == 32) {
                                i11 = 3;
                                if (i11 <= 0) {
                                }
                                i12++;
                            }
                            i11 = 0;
                            if (i11 <= 0) {
                            }
                            i12++;
                        }
                    } else {
                        if (b11 == 32) {
                            i11 = 4;
                            if (i11 <= 0) {
                            }
                            i12++;
                        }
                        i11 = 0;
                        if (i11 <= 0) {
                        }
                        i12++;
                    }
                } else {
                    if (b11 == 10) {
                        i11 = 2;
                        if (i11 <= 0) {
                        }
                        i12++;
                    }
                    i11 = 0;
                    if (i11 <= 0) {
                    }
                    i12++;
                }
            } else {
                return ((C27212f) Collections.min(singletonList, new a())).m139305j(this.f127938a);
            }
        }
    }
}

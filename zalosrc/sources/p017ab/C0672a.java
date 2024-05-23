package p017ab;

import bb.C2688d;
import bb.EnumC2687c;
import com.google.zxing.EnumC6846a;
import com.google.zxing.EnumC6848c;
import com.google.zxing.InterfaceC6850e;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Map;
import p664y.AbstractC30228a;
import va.C27954b;

/* renamed from: ab.a */
/* loaded from: classes3.dex */
public final class C0672a implements InterfaceC6850e {
    /* renamed from: b */
    private static C27954b m957b(byte[][] bArr, int i11) {
        int i12 = i11 * 2;
        C27954b c27954b = new C27954b(bArr[0].length + i12, bArr.length + i12);
        c27954b.m140888b();
        int m140891f = (c27954b.m140891f() - i11) - 1;
        int i13 = 0;
        while (i13 < bArr.length) {
            byte[] bArr2 = bArr[i13];
            for (int i14 = 0; i14 < bArr[0].length; i14++) {
                if (bArr2[i14] == 1) {
                    c27954b.m140893h(i14 + i11, m140891f);
                }
            }
            i13++;
            m140891f--;
        }
        return c27954b;
    }

    /* renamed from: c */
    private static C27954b m958c(C2688d c2688d, String str, int i11, int i12, int i13, int i14) {
        boolean z11;
        boolean z12;
        boolean z13;
        c2688d.m13136e(str, i11);
        byte[][] m13126b = c2688d.m13137f().m13126b(1, 4);
        if (i13 > i12) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (m13126b[0].length < m13126b.length) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 != z12) {
            m13126b = m959d(m13126b);
            z13 = true;
        } else {
            z13 = false;
        }
        int length = i12 / m13126b[0].length;
        int length2 = i13 / m13126b.length;
        if (length >= length2) {
            length = length2;
        }
        if (length > 1) {
            byte[][] m13126b2 = c2688d.m13137f().m13126b(length, length * 4);
            if (z13) {
                m13126b2 = m959d(m13126b2);
            }
            return m957b(m13126b2, i14);
        }
        return m957b(m13126b, i14);
    }

    /* renamed from: d */
    private static byte[][] m959d(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, bArr[0].length, bArr.length);
        for (int i11 = 0; i11 < bArr.length; i11++) {
            int length = (bArr.length - i11) - 1;
            for (int i12 = 0; i12 < bArr[0].length; i12++) {
                bArr2[i12][length] = bArr[i11][i12];
            }
        }
        return bArr2;
    }

    @Override // com.google.zxing.InterfaceC6850e
    /* renamed from: a */
    public C27954b mo960a(String str, EnumC6846a enumC6846a, int i11, int i12, Map map) {
        int i13;
        int i14;
        if (enumC6846a == EnumC6846a.PDF_417) {
            C2688d c2688d = new C2688d();
            int i15 = 30;
            int i16 = 2;
            if (map != null) {
                EnumC6848c enumC6848c = EnumC6848c.PDF417_COMPACT;
                if (map.containsKey(enumC6848c)) {
                    c2688d.m13138h(Boolean.valueOf(map.get(enumC6848c).toString()).booleanValue());
                }
                EnumC6848c enumC6848c2 = EnumC6848c.PDF417_COMPACTION;
                if (map.containsKey(enumC6848c2)) {
                    c2688d.m13139i(EnumC2687c.valueOf(map.get(enumC6848c2).toString()));
                }
                EnumC6848c enumC6848c3 = EnumC6848c.PDF417_DIMENSIONS;
                if (!map.containsKey(enumC6848c3)) {
                    EnumC6848c enumC6848c4 = EnumC6848c.MARGIN;
                    if (map.containsKey(enumC6848c4)) {
                        i15 = Integer.parseInt(map.get(enumC6848c4).toString());
                    }
                    EnumC6848c enumC6848c5 = EnumC6848c.ERROR_CORRECTION;
                    if (map.containsKey(enumC6848c5)) {
                        i16 = Integer.parseInt(map.get(enumC6848c5).toString());
                    }
                    EnumC6848c enumC6848c6 = EnumC6848c.CHARACTER_SET;
                    if (map.containsKey(enumC6848c6)) {
                        c2688d.m13140j(Charset.forName(map.get(enumC6848c6).toString()));
                    }
                    i14 = i15;
                    i13 = i16;
                } else {
                    AbstractC30228a.m149044a(map.get(enumC6848c3));
                    throw null;
                }
            } else {
                i13 = 2;
                i14 = 30;
            }
            return m958c(c2688d, str, i13, i11, i12, i14);
        }
        throw new IllegalArgumentException("Can only encode PDF_417, but got " + enumC6846a);
    }
}

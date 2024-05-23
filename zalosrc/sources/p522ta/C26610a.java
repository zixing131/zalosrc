package p522ta;

import com.google.zxing.EnumC6846a;
import com.google.zxing.EnumC6848c;
import com.google.zxing.InterfaceC6850e;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import ua.AbstractC27209c;
import ua.C27207a;
import va.C27954b;

/* renamed from: ta.a */
/* loaded from: classes3.dex */
public final class C26610a implements InterfaceC6850e {
    /* renamed from: b */
    private static C27954b m136572b(String str, EnumC6846a enumC6846a, int i11, int i12, Charset charset, int i13, int i14) {
        if (enumC6846a == EnumC6846a.AZTEC) {
            return m136573c(AbstractC27209c.m139283d(str.getBytes(charset), i13, i14), i11, i12);
        }
        throw new IllegalArgumentException("Can only encode AZTEC, but got " + enumC6846a);
    }

    /* renamed from: c */
    private static C27954b m136573c(C27207a c27207a, int i11, int i12) {
        C27954b m139273a = c27207a.m139273a();
        if (m139273a != null) {
            int m140892g = m139273a.m140892g();
            int m140891f = m139273a.m140891f();
            int max = Math.max(i11, m140892g);
            int max2 = Math.max(i12, m140891f);
            int min = Math.min(max / m140892g, max2 / m140891f);
            int i13 = (max - (m140892g * min)) / 2;
            int i14 = (max2 - (m140891f * min)) / 2;
            C27954b c27954b = new C27954b(max, max2);
            int i15 = 0;
            while (i15 < m140891f) {
                int i16 = i13;
                int i17 = 0;
                while (i17 < m140892g) {
                    if (m139273a.m140890e(i17, i15)) {
                        c27954b.m140894i(i16, i14, min, min);
                    }
                    i17++;
                    i16 += min;
                }
                i15++;
                i14 += min;
            }
            return c27954b;
        }
        throw new IllegalStateException();
    }

    @Override // com.google.zxing.InterfaceC6850e
    /* renamed from: a */
    public C27954b mo960a(String str, EnumC6846a enumC6846a, int i11, int i12, Map map) {
        Charset charset;
        int i13;
        int i14;
        Charset charset2 = StandardCharsets.ISO_8859_1;
        int i15 = 33;
        if (map != null) {
            EnumC6848c enumC6848c = EnumC6848c.CHARACTER_SET;
            if (map.containsKey(enumC6848c)) {
                charset2 = Charset.forName(map.get(enumC6848c).toString());
            }
            EnumC6848c enumC6848c2 = EnumC6848c.ERROR_CORRECTION;
            if (map.containsKey(enumC6848c2)) {
                i15 = Integer.parseInt(map.get(enumC6848c2).toString());
            }
            EnumC6848c enumC6848c3 = EnumC6848c.AZTEC_LAYERS;
            if (map.containsKey(enumC6848c3)) {
                charset = charset2;
                i13 = i15;
                i14 = Integer.parseInt(map.get(enumC6848c3).toString());
                return m136572b(str, enumC6846a, i11, i12, charset, i13, i14);
            }
            charset = charset2;
            i13 = i15;
        } else {
            charset = charset2;
            i13 = 33;
        }
        i14 = 0;
        return m136572b(str, enumC6846a, i11, i12, charset, i13, i14);
    }
}

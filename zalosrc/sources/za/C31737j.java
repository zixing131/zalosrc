package za;

import com.google.zxing.EnumC6846a;
import com.google.zxing.FormatException;
import java.util.Map;
import va.C27954b;

/* renamed from: za.j */
/* loaded from: classes3.dex */
public final class C31737j extends AbstractC31744q {
    @Override // za.AbstractC31741n, com.google.zxing.InterfaceC6850e
    /* renamed from: a */
    public C27954b mo960a(String str, EnumC6846a enumC6846a, int i11, int i12, Map map) {
        if (enumC6846a == EnumC6846a.EAN_13) {
            return super.mo960a(str, enumC6846a, i11, i12, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_13, but got " + enumC6846a);
    }

    @Override // za.AbstractC31741n
    /* renamed from: d */
    public boolean[] mo152687d(String str) {
        int length = str.length();
        if (length != 12) {
            if (length == 13) {
                try {
                    if (!AbstractC31743p.m152699a(str)) {
                        throw new IllegalArgumentException("Contents do not pass checksum");
                    }
                } catch (FormatException unused) {
                    throw new IllegalArgumentException("Illegal contents");
                }
            } else {
                throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got " + length);
            }
        } else {
            try {
                str = str + AbstractC31743p.m152700b(str);
            } catch (FormatException e11) {
                throw new IllegalArgumentException(e11);
            }
        }
        AbstractC31741n.m152696c(str);
        int i11 = AbstractC31736i.f145806f[Character.digit(str.charAt(0), 10)];
        boolean[] zArr = new boolean[95];
        int m152695b = AbstractC31741n.m152695b(zArr, 0, AbstractC31743p.f145812a, true);
        for (int i12 = 1; i12 <= 6; i12++) {
            int digit = Character.digit(str.charAt(i12), 10);
            if (((i11 >> (6 - i12)) & 1) == 1) {
                digit += 10;
            }
            m152695b += AbstractC31741n.m152695b(zArr, m152695b, AbstractC31743p.f145816e[digit], false);
        }
        int m152695b2 = m152695b + AbstractC31741n.m152695b(zArr, m152695b, AbstractC31743p.f145813b, false);
        for (int i13 = 7; i13 <= 12; i13++) {
            m152695b2 += AbstractC31741n.m152695b(zArr, m152695b2, AbstractC31743p.f145815d[Character.digit(str.charAt(i13), 10)], true);
        }
        AbstractC31741n.m152695b(zArr, m152695b2, AbstractC31743p.f145812a, true);
        return zArr;
    }
}

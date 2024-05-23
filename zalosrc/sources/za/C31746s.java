package za;

import com.google.zxing.EnumC6846a;
import com.google.zxing.FormatException;
import java.util.Map;
import va.C27954b;

/* renamed from: za.s */
/* loaded from: classes3.dex */
public final class C31746s extends AbstractC31744q {
    @Override // za.AbstractC31741n, com.google.zxing.InterfaceC6850e
    /* renamed from: a */
    public C27954b mo960a(String str, EnumC6846a enumC6846a, int i11, int i12, Map map) {
        if (enumC6846a == EnumC6846a.UPC_E) {
            return super.mo960a(str, enumC6846a, i11, i12, map);
        }
        throw new IllegalArgumentException("Can only encode UPC_E, but got " + enumC6846a);
    }

    @Override // za.AbstractC31741n
    /* renamed from: d */
    public boolean[] mo152687d(String str) {
        int length = str.length();
        if (length != 7) {
            if (length == 8) {
                try {
                    if (!AbstractC31743p.m152699a(AbstractC31745r.m152701c(str))) {
                        throw new IllegalArgumentException("Contents do not pass checksum");
                    }
                } catch (FormatException unused) {
                    throw new IllegalArgumentException("Illegal contents");
                }
            } else {
                throw new IllegalArgumentException("Requested contents should be 7 or 8 digits long, but got " + length);
            }
        } else {
            try {
                str = str + AbstractC31743p.m152700b(AbstractC31745r.m152701c(str));
            } catch (FormatException e11) {
                throw new IllegalArgumentException(e11);
            }
        }
        AbstractC31741n.m152696c(str);
        int digit = Character.digit(str.charAt(0), 10);
        if (digit != 0 && digit != 1) {
            throw new IllegalArgumentException("Number system must be 0 or 1");
        }
        int i11 = AbstractC31745r.f145818g[digit][Character.digit(str.charAt(7), 10)];
        boolean[] zArr = new boolean[51];
        int m152695b = AbstractC31741n.m152695b(zArr, 0, AbstractC31743p.f145812a, true);
        for (int i12 = 1; i12 <= 6; i12++) {
            int digit2 = Character.digit(str.charAt(i12), 10);
            if (((i11 >> (6 - i12)) & 1) == 1) {
                digit2 += 10;
            }
            m152695b += AbstractC31741n.m152695b(zArr, m152695b, AbstractC31743p.f145816e[digit2], false);
        }
        AbstractC31741n.m152695b(zArr, m152695b, AbstractC31743p.f145814c, false);
        return zArr;
    }
}

package za;

import com.google.zxing.EnumC6846a;
import com.google.zxing.FormatException;
import java.util.Map;
import va.C27954b;

/* renamed from: za.k */
/* loaded from: classes3.dex */
public final class C31738k extends AbstractC31744q {
    @Override // za.AbstractC31741n, com.google.zxing.InterfaceC6850e
    /* renamed from: a */
    public C27954b mo960a(String str, EnumC6846a enumC6846a, int i11, int i12, Map map) {
        if (enumC6846a == EnumC6846a.EAN_8) {
            return super.mo960a(str, enumC6846a, i11, i12, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_8, but got " + enumC6846a);
    }

    @Override // za.AbstractC31741n
    /* renamed from: d */
    public boolean[] mo152687d(String str) {
        int length = str.length();
        if (length != 7) {
            if (length == 8) {
                try {
                    if (!AbstractC31743p.m152699a(str)) {
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
                str = str + AbstractC31743p.m152700b(str);
            } catch (FormatException e11) {
                throw new IllegalArgumentException(e11);
            }
        }
        AbstractC31741n.m152696c(str);
        boolean[] zArr = new boolean[67];
        int m152695b = AbstractC31741n.m152695b(zArr, 0, AbstractC31743p.f145812a, true);
        for (int i11 = 0; i11 <= 3; i11++) {
            m152695b += AbstractC31741n.m152695b(zArr, m152695b, AbstractC31743p.f145815d[Character.digit(str.charAt(i11), 10)], false);
        }
        int m152695b2 = m152695b + AbstractC31741n.m152695b(zArr, m152695b, AbstractC31743p.f145813b, false);
        for (int i12 = 4; i12 <= 7; i12++) {
            m152695b2 += AbstractC31741n.m152695b(zArr, m152695b2, AbstractC31743p.f145815d[Character.digit(str.charAt(i12), 10)], true);
        }
        AbstractC31741n.m152695b(zArr, m152695b2, AbstractC31743p.f145812a, true);
        return zArr;
    }
}

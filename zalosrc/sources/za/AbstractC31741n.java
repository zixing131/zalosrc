package za;

import com.google.zxing.EnumC6846a;
import com.google.zxing.EnumC6848c;
import com.google.zxing.InterfaceC6850e;
import java.util.Map;
import java.util.regex.Pattern;
import va.C27954b;

/* renamed from: za.n */
/* loaded from: classes3.dex */
public abstract class AbstractC31741n implements InterfaceC6850e {

    /* renamed from: a */
    private static final Pattern f145810a = Pattern.compile("[0-9]+");

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public static int m152695b(boolean[] zArr, int i11, int[] iArr, boolean z11) {
        int i12 = 0;
        for (int i13 : iArr) {
            int i14 = 0;
            while (i14 < i13) {
                zArr[i11] = z11;
                i14++;
                i11++;
            }
            i12 += i13;
            z11 = !z11;
        }
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public static void m152696c(String str) {
        if (f145810a.matcher(str).matches()) {
        } else {
            throw new IllegalArgumentException("Input should only contain digits 0-9");
        }
    }

    /* renamed from: f */
    private static C27954b m152697f(boolean[] zArr, int i11, int i12, int i13) {
        int length = zArr.length;
        int i14 = i13 + length;
        int max = Math.max(i11, i14);
        int max2 = Math.max(1, i12);
        int i15 = max / i14;
        int i16 = (max - (length * i15)) / 2;
        C27954b c27954b = new C27954b(max, max2);
        int i17 = 0;
        while (i17 < length) {
            if (zArr[i17]) {
                c27954b.m140894i(i16, 0, i15, max2);
            }
            i17++;
            i16 += i15;
        }
        return c27954b;
    }

    @Override // com.google.zxing.InterfaceC6850e
    /* renamed from: a */
    public C27954b mo960a(String str, EnumC6846a enumC6846a, int i11, int i12, Map map) {
        if (!str.isEmpty()) {
            if (i11 >= 0 && i12 >= 0) {
                int mo152698e = mo152698e();
                if (map != null) {
                    EnumC6848c enumC6848c = EnumC6848c.MARGIN;
                    if (map.containsKey(enumC6848c)) {
                        mo152698e = Integer.parseInt(map.get(enumC6848c).toString());
                    }
                }
                return m152697f(mo152687d(str), i11, i12, mo152698e);
            }
            throw new IllegalArgumentException("Negative size is not allowed. Input: " + i11 + 'x' + i12);
        }
        throw new IllegalArgumentException("Found empty contents");
    }

    /* renamed from: d */
    public abstract boolean[] mo152687d(String str);

    /* renamed from: e */
    public int mo152698e() {
        return 10;
    }
}

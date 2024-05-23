package va;

import java.util.HashMap;
import java.util.Map;

/* renamed from: va.c */
/* loaded from: classes3.dex */
public enum EnumC27955c {
    Cp437(new int[]{0, 2}, new String[0]),
    ISO8859_1(new int[]{1, 3}, "ISO-8859-1"),
    ISO8859_2(4, "ISO-8859-2"),
    ISO8859_3(5, "ISO-8859-3"),
    ISO8859_4(6, "ISO-8859-4"),
    ISO8859_5(7, "ISO-8859-5"),
    ISO8859_6(8, "ISO-8859-6"),
    ISO8859_7(9, "ISO-8859-7"),
    ISO8859_8(10, "ISO-8859-8"),
    ISO8859_9(11, "ISO-8859-9"),
    ISO8859_10(12, "ISO-8859-10"),
    ISO8859_11(13, "ISO-8859-11"),
    ISO8859_13(15, "ISO-8859-13"),
    ISO8859_14(16, "ISO-8859-14"),
    ISO8859_15(17, "ISO-8859-15"),
    ISO8859_16(18, "ISO-8859-16"),
    SJIS(20, "Shift_JIS"),
    Cp1250(21, "windows-1250"),
    Cp1251(22, "windows-1251"),
    Cp1252(23, "windows-1252"),
    Cp1256(24, "windows-1256"),
    UnicodeBigUnmarked(25, "UTF-16BE", "UnicodeBig"),
    UTF8(26, "UTF-8"),
    ASCII(new int[]{27, 170}, "US-ASCII"),
    Big5(28),
    GB18030(29, "GB2312", "EUC_CN", "GBK"),
    EUC_KR(30, "EUC-KR");


    /* renamed from: S */
    private static final Map f130333S = new HashMap();

    /* renamed from: T */
    private static final Map f130334T = new HashMap();

    /* renamed from: p */
    private final int[] f130345p;

    /* renamed from: q */
    private final String[] f130346q;

    static {
        for (EnumC27955c enumC27955c : values()) {
            for (int i11 : enumC27955c.f130345p) {
                f130333S.put(Integer.valueOf(i11), enumC27955c);
            }
            f130334T.put(enumC27955c.name(), enumC27955c);
            for (String str : enumC27955c.f130346q) {
                f130334T.put(str, enumC27955c);
            }
        }
    }

    EnumC27955c(int i11) {
        this(new int[]{i11}, new String[0]);
    }

    /* renamed from: b */
    public static EnumC27955c m140896b(String str) {
        return (EnumC27955c) f130334T.get(str);
    }

    /* renamed from: c */
    public int m140897c() {
        return this.f130345p[0];
    }

    EnumC27955c(int i11, String... strArr) {
        this.f130345p = new int[]{i11};
        this.f130346q = strArr;
    }

    EnumC27955c(int[] iArr, String... strArr) {
        this.f130345p = iArr;
        this.f130346q = strArr;
    }
}

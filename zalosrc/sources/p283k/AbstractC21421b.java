package p283k;

/* renamed from: k.b */
/* loaded from: classes2.dex */
public abstract class AbstractC21421b {

    /* renamed from: a */
    private static final String f104414a = "b";

    /* renamed from: a */
    public static int m110926a(String str) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = 0;
        try {
            String[] split = str.split(":");
            if (str.length() == 8 && split.length == 3) {
                try {
                    i14 = Integer.valueOf(split[0]).intValue();
                } catch (Exception e11) {
                    e11.printStackTrace();
                    i14 = 0;
                }
                try {
                    i12 = Integer.valueOf(split[1]).intValue();
                } catch (Exception e12) {
                    e12.printStackTrace();
                    i12 = 0;
                }
                try {
                    i15 = Integer.valueOf(split[2]).intValue();
                    int i16 = i15;
                    i15 = i14;
                    i11 = i16;
                } catch (Exception e13) {
                    e13.printStackTrace();
                    i15 = i14;
                    i11 = 0;
                    return (i15 * 3600) + (i12 * 60) + i11;
                }
            } else if (str.length() == 5 && split.length == 2) {
                try {
                    i13 = Integer.valueOf(split[0]).intValue();
                } catch (Exception e14) {
                    e14.printStackTrace();
                    i13 = 0;
                }
                try {
                    i12 = i13;
                    i15 = Integer.valueOf(split[1]).intValue();
                    i14 = 0;
                    int i162 = i15;
                    i15 = i14;
                    i11 = i162;
                } catch (Exception e15) {
                    e15.printStackTrace();
                    i12 = i13;
                    i11 = 0;
                    return (i15 * 3600) + (i12 * 60) + i11;
                }
            } else {
                i11 = 0;
                i12 = 0;
            }
            return (i15 * 3600) + (i12 * 60) + i11;
        } catch (Exception e16) {
            AbstractC21420a.m110922b(f104414a, "parseTimeToInt", e16);
            return i15;
        }
    }

    /* renamed from: b */
    public static int m110927b(String str, String str2) {
        int i11;
        int i12;
        try {
            try {
                i11 = m110926a(str);
            } catch (Exception e11) {
                AbstractC21420a.m110922b(f104414a, "calculateDurationInPercent", e11);
                i11 = 0;
            }
            try {
                i12 = Integer.parseInt(str2.trim().replace("%", ""));
            } catch (Exception e12) {
                AbstractC21420a.m110922b(f104414a, "calculateDurationInPercent", e12);
                i12 = 0;
            }
            if (i11 == 0 || i12 == 0) {
                return 0;
            }
            return (i11 * i12) / 100;
        } catch (Exception e13) {
            AbstractC21420a.m110922b(f104414a, "calculateDurationInPercent", e13);
            return 0;
        }
    }
}

package p10;

/* renamed from: p10.f */
/* loaded from: classes5.dex */
public abstract class AbstractC24602f {
    /* renamed from: a */
    public static final EnumC24601e m128091a(Integer num) {
        EnumC24601e enumC24601e;
        EnumC24601e[] values = EnumC24601e.values();
        int length = values.length;
        int i11 = 0;
        while (true) {
            if (i11 < length) {
                enumC24601e = values[i11];
                int m128090c = enumC24601e.m128090c();
                if (num != null && m128090c == num.intValue()) {
                    break;
                }
                i11++;
            } else {
                enumC24601e = null;
                break;
            }
        }
        if (enumC24601e == null) {
            return EnumC24601e.f118372q;
        }
        return enumC24601e;
    }
}

package p608wg;

import android.text.TextUtils;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import java.util.Arrays;

/* renamed from: wg.f */
/* loaded from: classes3.dex */
public interface InterfaceC28970f {

    /* renamed from: wg.f$a */
    /* loaded from: classes3.dex */
    public static final class a {
        /* renamed from: a */
        public static String m144681a(InterfaceC28970f interfaceC28970f, int i11, String str, String str2) {
            AbstractC19074t.m100208f(str2, "action");
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format("{\"error_code\":%1$d,\"error_message\":\"%2$s\",\"data\":{},\"action\":\"%3$s\"}", Arrays.copyOf(new Object[]{Integer.valueOf(i11), str, str2}, 3));
            AbstractC19074t.m100207e(format, "format(...)");
            return format;
        }

        /* renamed from: b */
        public static String m144682b(InterfaceC28970f interfaceC28970f, String str) {
            AbstractC19074t.m100208f(str, "action");
            return "{\"error_code\":0,\"error_message\":\"successfull\",\"data\":{},\"action\":\"" + str + "\"}";
        }

        /* renamed from: c */
        public static String m144683c(InterfaceC28970f interfaceC28970f, String str, String str2) {
            AbstractC19074t.m100208f(str, "action");
            if (TextUtils.isEmpty(str2)) {
                return interfaceC28970f.mo2446a(str);
            }
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format("{\"error_code\":0,\"error_message\":\"successfull\",\"data\":%s,\"action\":\"%s\"}", Arrays.copyOf(new Object[]{str2, str}, 2));
            AbstractC19074t.m100207e(format, "format(...)");
            return format;
        }
    }

    /* renamed from: a */
    String mo2446a(String str);

    /* renamed from: d */
    void mo2447d();
}

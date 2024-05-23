package p307kv;

import fn0.AbstractC19074t;
import fn0.C19067n0;
import java.security.MessageDigest;
import java.util.Arrays;
import on0.C24321d;

/* renamed from: kv.a */
/* loaded from: classes4.dex */
public final class C21944a {

    /* renamed from: a */
    public static final C21944a f108045a = new C21944a();

    private C21944a() {
    }

    /* renamed from: a */
    public final String m114584a(String str, String str2) {
        AbstractC19074t.m100208f(str, "<this>");
        AbstractC19074t.m100208f(str2, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(str2);
        byte[] bytes = str.getBytes(C24321d.f117408b);
        AbstractC19074t.m100207e(bytes, "getBytes(...)");
        byte[] digest = messageDigest.digest(bytes);
        StringBuilder sb2 = new StringBuilder();
        AbstractC19074t.m100205c(digest);
        for (byte b11 : digest) {
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b11)}, 1));
            AbstractC19074t.m100207e(format, "format(...)");
            sb2.append(format);
        }
        String sb3 = sb2.toString();
        AbstractC19074t.m100207e(sb3, "toString(...)");
        return sb3;
    }
}

package ze0;

import java.util.regex.Pattern;

/* renamed from: ze0.l */
/* loaded from: classes4.dex */
public final class C31806l implements InterfaceC31808n {

    /* renamed from: b */
    private static final Pattern f145958b = Pattern.compile("^[\\p{L}\\p{N}]+$");

    /* renamed from: a */
    private final String f145959a;

    public C31806l(String str) {
        this.f145959a = str + "_";
    }

    @Override // ze0.InterfaceC31808n
    /* renamed from: a */
    public String mo152838a(Object obj) {
        String obj2 = obj.toString();
        if (f145958b.matcher(obj2).matches()) {
            return this.f145959a + obj;
        }
        throw new IllegalArgumentException("Invalid key: " + obj2);
    }
}

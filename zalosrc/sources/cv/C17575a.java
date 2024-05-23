package cv;

import fn0.AbstractC19074t;
import java.util.List;
import p112dv.C18071a;

/* renamed from: cv.a */
/* loaded from: classes4.dex */
public final class C17575a {

    /* renamed from: a */
    public static final C17575a f89535a = new C17575a();

    private C17575a() {
    }

    /* renamed from: a */
    public final String m93604a(List list) {
        AbstractC19074t.m100208f(list, "<this>");
        StringBuilder sb2 = new StringBuilder();
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            sb2.append(((C18071a) list.get(i11)).toString());
            if (i11 != list.size() - 1) {
                sb2.append("|");
            }
        }
        String sb3 = sb2.toString();
        AbstractC19074t.m100207e(sb3, "toString(...)");
        return sb3;
    }
}

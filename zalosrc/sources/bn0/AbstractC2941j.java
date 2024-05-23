package bn0;

import fn0.AbstractC19074t;
import java.io.File;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bn0.j */
/* loaded from: classes7.dex */
public abstract class AbstractC2941j extends AbstractC2940i {
    /* renamed from: f */
    public static final C2936e m13919f(File file, EnumC2937f enumC2937f) {
        AbstractC19074t.m100208f(file, "<this>");
        AbstractC19074t.m100208f(enumC2937f, "direction");
        return new C2936e(file, enumC2937f);
    }

    /* renamed from: g */
    public static /* synthetic */ C2936e m13920g(File file, EnumC2937f enumC2937f, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            enumC2937f = EnumC2937f.f11622p;
        }
        return m13919f(file, enumC2937f);
    }

    /* renamed from: h */
    public static final C2936e m13921h(File file) {
        AbstractC19074t.m100208f(file, "<this>");
        return m13919f(file, EnumC2937f.f11623q);
    }

    /* renamed from: i */
    public static C2936e m13922i(File file) {
        AbstractC19074t.m100208f(file, "<this>");
        return m13919f(file, EnumC2937f.f11622p);
    }
}

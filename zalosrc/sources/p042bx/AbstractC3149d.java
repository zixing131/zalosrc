package p042bx;

import android.content.Context;

/* renamed from: bx.d */
/* loaded from: classes4.dex */
public abstract class AbstractC3149d implements InterfaceC3151f {

    /* renamed from: a */
    private static Context f13306a;

    /* renamed from: b */
    private static AbstractC3149d f13307b;

    /* renamed from: c */
    public static AbstractC3149d m15845c() {
        AbstractC3149d abstractC3149d = f13307b;
        if (abstractC3149d != null) {
            return abstractC3149d;
        }
        throw new RuntimeException("BlockCanaryContext null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static void m15846d(Context context, AbstractC3149d abstractC3149d) {
        f13306a = context;
        f13307b = abstractC3149d;
    }

    /* renamed from: b */
    public abstract boolean mo15847b();

    /* renamed from: e */
    public abstract int mo15848e();

    /* renamed from: f */
    public abstract int mo15849f();

    /* renamed from: g */
    public Context m15850g() {
        return f13306a;
    }

    /* renamed from: h */
    public int m15851h() {
        return mo15848e();
    }

    /* renamed from: i */
    public abstract String mo15852i();

    /* renamed from: j */
    public abstract boolean mo15853j();
}

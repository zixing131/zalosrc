package p633x5;

import android.content.Context;
import com.google.android.gms.common.internal.C4196l;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import p234ia.AbstractC20452c;
import p234ia.C20460g;
import p234ia.C20470m;
import p342m6.AbstractC22888j;

/* renamed from: x5.n0 */
/* loaded from: classes2.dex */
public final class C29359n0 {

    /* renamed from: k */
    private static final AbstractC29362p f135836k = AbstractC29362p.m146503c("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* renamed from: a */
    private final String f135837a;

    /* renamed from: b */
    private final String f135838b;

    /* renamed from: c */
    private final InterfaceC29347h0 f135839c;

    /* renamed from: d */
    private final C20470m f135840d;

    /* renamed from: e */
    private final AbstractC22888j f135841e;

    /* renamed from: f */
    private final AbstractC22888j f135842f;

    /* renamed from: g */
    private final String f135843g;

    /* renamed from: h */
    private final int f135844h;

    /* renamed from: i */
    private final Map f135845i = new HashMap();

    /* renamed from: j */
    private final Map f135846j = new HashMap();

    public C29359n0(Context context, C20470m c20470m, InterfaceC29347h0 interfaceC29347h0, String str) {
        int i11;
        this.f135837a = context.getPackageName();
        this.f135838b = AbstractC20452c.m106484a(context);
        this.f135840d = c20470m;
        this.f135839c = interfaceC29347h0;
        C29379x0.m146518a();
        this.f135843g = str;
        this.f135841e = C20460g.m106488a().m106491b(new Callable() { // from class: x5.l0
            public /* synthetic */ CallableC29355l0() {
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C29359n0.this.m146500a();
            }
        });
        C20460g m106488a = C20460g.m106488a();
        c20470m.getClass();
        this.f135842f = m106488a.m106491b(new Callable() { // from class: x5.m0
            public /* synthetic */ CallableC29357m0() {
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C20470m.this.m106515a();
            }
        });
        AbstractC29362p abstractC29362p = f135836k;
        if (abstractC29362p.containsKey(str)) {
            i11 = DynamiteModule.m19919c(context, (String) abstractC29362p.get(str));
        } else {
            i11 = -1;
        }
        this.f135844h = i11;
    }

    /* renamed from: a */
    public final /* synthetic */ String m146500a() {
        return C4196l.m19698a().m19699b(this.f135843g);
    }
}

package p381o5;

import android.content.Context;
import com.google.android.gms.common.C4148b;
import com.google.android.gms.common.api.ApiException;
import p342m6.AbstractC22888j;
import p342m6.AbstractC22894m;
import p342m6.InterfaceC22874c;
import p355n4.InterfaceC23537b;

/* renamed from: o5.r */
/* loaded from: classes2.dex */
public final class C24036r implements InterfaceC23537b {

    /* renamed from: a */
    private final InterfaceC23537b f116350a;

    /* renamed from: b */
    private final InterfaceC23537b f116351b;

    public C24036r(Context context) {
        this.f116350a = new C24034p(context, C4148b.m19567h());
        this.f116351b = C24030l.m125903c(context);
    }

    /* renamed from: a */
    public static /* synthetic */ AbstractC22888j m125909a(C24036r c24036r, AbstractC22888j abstractC22888j) {
        if (!abstractC22888j.mo117588q() && !abstractC22888j.mo117586o()) {
            Exception mo117583l = abstractC22888j.mo117583l();
            if (mo117583l instanceof ApiException) {
                int m19216b = ((ApiException) mo117583l).m19216b();
                if (m19216b != 43001 && m19216b != 43002 && m19216b != 43003 && m19216b != 17) {
                    if (m19216b == 43000) {
                        return AbstractC22894m.m117603e(new Exception("Failed to get app set ID due to an internal error. Please try again later."));
                    }
                    if (m19216b == 15) {
                        return AbstractC22894m.m117603e(new Exception("The operation to get app set ID timed out. Please try again later."));
                    }
                    return abstractC22888j;
                }
                return c24036r.f116351b.mo123622d();
            }
            return abstractC22888j;
        }
        return abstractC22888j;
    }

    @Override // p355n4.InterfaceC23537b
    /* renamed from: d */
    public final AbstractC22888j mo123622d() {
        return this.f116350a.mo123622d().mo117582k(new InterfaceC22874c() { // from class: o5.q
            @Override // p342m6.InterfaceC22874c
            /* renamed from: a */
            public final Object mo27439a(AbstractC22888j abstractC22888j) {
                return C24036r.m125909a(C24036r.this, abstractC22888j);
            }
        });
    }
}

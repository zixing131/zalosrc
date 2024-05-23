package p381o5;

import android.content.Context;
import com.google.android.gms.appset.zza;
import com.google.android.gms.common.C4148b;
import com.google.android.gms.common.api.AbstractC4072b;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.C4071a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC4098h;
import p342m6.AbstractC22888j;
import p342m6.AbstractC22894m;
import p342m6.C22890k;
import p355n4.AbstractC23541f;
import p355n4.InterfaceC23537b;
import p704z4.InterfaceC31230h;

/* renamed from: o5.p */
/* loaded from: classes2.dex */
public final class C24034p extends AbstractC4072b implements InterfaceC23537b {

    /* renamed from: m */
    private static final C4071a.g f116344m;

    /* renamed from: n */
    private static final C4071a.a f116345n;

    /* renamed from: o */
    private static final C4071a f116346o;

    /* renamed from: k */
    private final Context f116347k;

    /* renamed from: l */
    private final C4148b f116348l;

    static {
        C4071a.g gVar = new C4071a.g();
        f116344m = gVar;
        C24032n c24032n = new C24032n();
        f116345n = c24032n;
        f116346o = new C4071a("AppSet.API", c24032n, gVar);
    }

    public C24034p(Context context, C4148b c4148b) {
        super(context, f116346o, C4071a.d.f16181b, AbstractC4072b.a.f16192c);
        this.f116347k = context;
        this.f116348l = c4148b;
    }

    @Override // p355n4.InterfaceC23537b
    /* renamed from: d */
    public final AbstractC22888j mo123622d() {
        if (this.f116348l.mo19201j(this.f116347k, 212800000) == 0) {
            return m19239h(AbstractC4098h.m19430a().m19439d(AbstractC23541f.f114343a).m19437b(new InterfaceC31230h() { // from class: o5.m
                public /* synthetic */ C24031m() {
                }

                @Override // p704z4.InterfaceC31230h
                /* renamed from: a */
                public final void mo16705a(Object obj, Object obj2) {
                    ((C24025g) ((C24022d) obj).getService()).m125901Q(new zza(null, null), new BinderC24033o(C24034p.this, (C22890k) obj2));
                }
            }).m19438c(false).m19440e(27601).m19436a());
        }
        return AbstractC22894m.m117603e(new ApiException(new Status(17)));
    }
}

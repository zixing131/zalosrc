package p049c5;

import android.content.Context;
import com.google.android.gms.common.api.AbstractC4072b;
import com.google.android.gms.common.api.C4071a;
import com.google.android.gms.common.api.internal.AbstractC4098h;
import com.google.android.gms.common.internal.C4220t;
import com.google.android.gms.common.internal.InterfaceC4217s;
import com.google.android.gms.common.internal.TelemetryData;
import p342m6.AbstractC22888j;
import p342m6.C22890k;
import p504s5.AbstractC26136d;
import p704z4.InterfaceC31230h;

/* renamed from: c5.d */
/* loaded from: classes2.dex */
public final class C3288d extends AbstractC4072b implements InterfaceC4217s {

    /* renamed from: k */
    private static final C4071a.g f14075k;

    /* renamed from: l */
    private static final C4071a.a f14076l;

    /* renamed from: m */
    private static final C4071a f14077m;

    /* renamed from: n */
    public static final /* synthetic */ int f14078n = 0;

    static {
        C4071a.g gVar = new C4071a.g();
        f14075k = gVar;
        C3287c c3287c = new C3287c();
        f14076l = c3287c;
        f14077m = new C4071a("ClientTelemetry.API", c3287c, gVar);
    }

    public C3288d(Context context, C4220t c4220t) {
        super(context, f14077m, c4220t, AbstractC4072b.a.f16192c);
    }

    @Override // com.google.android.gms.common.internal.InterfaceC4217s
    /* renamed from: a */
    public final AbstractC22888j mo16707a(final TelemetryData telemetryData) {
        AbstractC4098h.a m19430a = AbstractC4098h.m19430a();
        m19430a.m19439d(AbstractC26136d.f124368a);
        m19430a.m19438c(false);
        m19430a.m19437b(new InterfaceC31230h() { // from class: c5.b
            @Override // p704z4.InterfaceC31230h
            /* renamed from: a */
            public final void mo16705a(Object obj, Object obj2) {
                TelemetryData telemetryData2 = TelemetryData.this;
                int i11 = C3288d.f14078n;
                ((C3285a) ((C3289e) obj).getService()).m16704W4(telemetryData2);
                ((C22890k) obj2).m117596c(null);
            }
        });
        return m19238g(m19430a.m19436a());
    }
}

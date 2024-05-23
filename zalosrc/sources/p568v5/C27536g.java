package p568v5;

import android.content.Context;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC4073c;
import com.google.android.gms.common.api.internal.C4086d;
import com.google.android.gms.common.internal.C4175e;
import com.google.android.gms.internal.location.AbstractC5276j;
import com.google.android.gms.internal.location.C5272f;
import com.google.android.gms.internal.location.zzba;
import p093d6.AbstractC17773i0;
import p229i5.AbstractC20281b;

/* renamed from: v5.g */
/* loaded from: classes2.dex */
public final class C27536g extends AbstractC5276j {

    /* renamed from: u */
    private final C5272f f129504u;

    public C27536g(Context context, Looper looper, AbstractC4073c.b bVar, AbstractC4073c.c cVar, String str, C4175e c4175e) {
        super(context, looper, bVar, cVar, str, c4175e);
        this.f129504u = new C5272f(context, this.f32202t);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d, com.google.android.gms.common.api.C4071a.f
    public final void disconnect() {
        synchronized (this.f129504u) {
            if (isConnected()) {
                try {
                    this.f129504u.m28848f();
                    this.f129504u.m28849g();
                } catch (Exception unused) {
                }
            }
            super.disconnect();
        }
    }

    /* renamed from: k */
    public final void m140741k(zzba zzbaVar, C4086d c4086d, InterfaceC27534e interfaceC27534e) {
        synchronized (this.f129504u) {
            this.f129504u.m28845c(zzbaVar, c4086d, interfaceC27534e);
        }
    }

    /* renamed from: l */
    public final void m140742l(C4086d.a aVar, InterfaceC27534e interfaceC27534e) {
        this.f129504u.m28846d(aVar, interfaceC27534e);
    }

    /* renamed from: m */
    public final Location m140743m(String str) {
        if (AbstractC20281b.m105900b(getAvailableFeatures(), AbstractC17773i0.f89955c)) {
            return this.f129504u.m28843a(str);
        }
        return this.f129504u.m28844b();
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d
    public final boolean usesClientTelemetry() {
        return true;
    }
}

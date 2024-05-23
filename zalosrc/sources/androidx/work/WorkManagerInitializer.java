package androidx.work;

import android.content.Context;
import androidx.work.C2138c;
import java.util.Collections;
import java.util.List;
import p195h2.InterfaceC19715a;

/* loaded from: classes.dex */
public final class WorkManagerInitializer implements InterfaceC19715a {

    /* renamed from: a */
    private static final String f9038a = AbstractC2253u.m11897i("WrkMgrInitializer");

    @Override // p195h2.InterfaceC19715a
    /* renamed from: a */
    public List mo8640a() {
        return Collections.emptyList();
    }

    @Override // p195h2.InterfaceC19715a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC2151i0 mo8641b(Context context) {
        AbstractC2253u.m11895e().mo11898a(f9038a, "Initializing WorkManager with default configuration.");
        AbstractC2151i0.m11548l(context, new C2138c.a().m11484a());
        return AbstractC2151i0.m11547h(context);
    }
}

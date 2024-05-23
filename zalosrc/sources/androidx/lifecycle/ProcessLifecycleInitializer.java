package androidx.lifecycle;

import android.content.Context;
import androidx.lifecycle.C1774i0;
import androidx.startup.C1944a;
import fn0.AbstractC19074t;
import java.util.List;
import p195h2.InterfaceC19715a;
import qm0.AbstractC25368s;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements InterfaceC19715a {
    @Override // p195h2.InterfaceC19715a
    /* renamed from: a */
    public List mo8640a() {
        List m131502j;
        m131502j = AbstractC25368s.m131502j();
        return m131502j;
    }

    @Override // p195h2.InterfaceC19715a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC1801w mo8641b(Context context) {
        AbstractC19074t.m100208f(context, "context");
        C1944a m10736e = C1944a.m10736e(context);
        AbstractC19074t.m100207e(m10736e, "getInstance(context)");
        if (m10736e.m10741g(ProcessLifecycleInitializer.class)) {
            C1793s.m9363a(context);
            C1774i0.b bVar = C1774i0.f7319x;
            bVar.m9306b(context);
            return bVar.m9305a();
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml".toString());
    }
}

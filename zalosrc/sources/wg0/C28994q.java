package wg0;

import androidx.work.AbstractC2151i0;
import androidx.work.C2142e;
import androidx.work.C2256x;
import androidx.work.EnumC2134a;
import androidx.work.EnumC2242k;
import androidx.work.EnumC2254v;
import com.zing.zalo.MainApplication;
import com.zing.zalo.zalocloud.onboarding.ZaloCloudOnboardingStatusSyncWorker;
import java.util.concurrent.TimeUnit;

/* renamed from: wg0.q */
/* loaded from: classes7.dex */
public final class C28994q {

    /* renamed from: a */
    public static final C28994q f134274a = new C28994q();

    private C28994q() {
    }

    /* renamed from: a */
    public final void m144865a(boolean z11) {
        AbstractC2151i0.m11547h(MainApplication.Companion.m35500c()).m11554f("SMLZCloudOnboardingStatusSyncWorker", EnumC2242k.REPLACE, (C2256x) ((C2256x.a) ((C2256x.a) new C2256x.a(ZaloCloudOnboardingStatusSyncWorker.class).m11868i(EnumC2134a.LINEAR, 10000L, TimeUnit.MILLISECONDS)).m11869j(new C2142e.a().m11514b(EnumC2254v.CONNECTED).m11513a())).m11863b());
    }
}

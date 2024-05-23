package p565v2;

import android.content.Context;
import androidx.work.AbstractC2253u;
import androidx.work.C2148h;
import androidx.work.C2149h0;
import androidx.work.InterfaceC2137b0;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.futures.C2230c;
import com.google.common.util.concurrent.InterfaceFutureC6534a;
import java.util.UUID;
import p535u2.C26971r;
import p535u2.C26976w;
import p595w2.InterfaceC28696c;

/* renamed from: v2.f0 */
/* loaded from: classes2.dex */
public class C27451f0 implements InterfaceC2137b0 {

    /* renamed from: c */
    static final String f129172c = AbstractC2253u.m11897i("WorkProgressUpdater");

    /* renamed from: a */
    final WorkDatabase f129173a;

    /* renamed from: b */
    final InterfaceC28696c f129174b;

    /* renamed from: v2.f0$a */
    /* loaded from: classes2.dex */
    class a implements Runnable {

        /* renamed from: p */
        final /* synthetic */ UUID f129175p;

        /* renamed from: q */
        final /* synthetic */ C2148h f129176q;

        /* renamed from: r */
        final /* synthetic */ C2230c f129177r;

        a(UUID uuid, C2148h c2148h, C2230c c2230c) {
            this.f129175p = uuid;
            this.f129176q = c2148h;
            this.f129177r = c2230c;
        }

        @Override // java.lang.Runnable
        public void run() {
            C26976w mo139008j;
            String uuid = this.f129175p.toString();
            AbstractC2253u m11895e = AbstractC2253u.m11895e();
            String str = C27451f0.f129172c;
            m11895e.mo11898a(str, "Updating progress for " + this.f129175p + " (" + this.f129176q + ")");
            C27451f0.this.f129173a.m342e();
            try {
                mo139008j = C27451f0.this.f129173a.mo11565L().mo139008j(uuid);
            } finally {
                try {
                    return;
                } finally {
                }
            }
            if (mo139008j != null) {
                if (mo139008j.f127498b == C2149h0.c.RUNNING) {
                    C27451f0.this.f129173a.mo11564K().mo138966c(new C26971r(uuid, this.f129176q));
                } else {
                    AbstractC2253u.m11895e().mo11905k(str, "Ignoring setProgressAsync(...). WorkSpec (" + uuid + ") is not in a RUNNING state.");
                }
                this.f129177r.mo11798p(null);
                C27451f0.this.f129173a.m339E();
                return;
            }
            throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
        }
    }

    public C27451f0(WorkDatabase workDatabase, InterfaceC28696c interfaceC28696c) {
        this.f129173a = workDatabase;
        this.f129174b = interfaceC28696c;
    }

    @Override // androidx.work.InterfaceC2137b0
    /* renamed from: a */
    public InterfaceFutureC6534a mo11469a(Context context, UUID uuid, C2148h c2148h) {
        C2230c m11809t = C2230c.m11809t();
        this.f129174b.mo143752d(new a(uuid, c2148h, m11809t));
        return m11809t;
    }
}

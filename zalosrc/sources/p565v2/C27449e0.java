package p565v2;

import android.content.Context;
import androidx.work.AbstractC2253u;
import androidx.work.C2244l;
import androidx.work.InterfaceC2245m;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.C2197b;
import androidx.work.impl.foreground.InterfaceC2196a;
import androidx.work.impl.utils.futures.C2230c;
import com.google.common.util.concurrent.InterfaceFutureC6534a;
import java.util.UUID;
import p535u2.AbstractC26979z;
import p535u2.C26976w;
import p535u2.InterfaceC26977x;
import p595w2.InterfaceC28696c;

/* renamed from: v2.e0 */
/* loaded from: classes2.dex */
public class C27449e0 implements InterfaceC2245m {

    /* renamed from: d */
    private static final String f129163d = AbstractC2253u.m11897i("WMFgUpdater");

    /* renamed from: a */
    private final InterfaceC28696c f129164a;

    /* renamed from: b */
    final InterfaceC2196a f129165b;

    /* renamed from: c */
    final InterfaceC26977x f129166c;

    /* renamed from: v2.e0$a */
    /* loaded from: classes2.dex */
    class a implements Runnable {

        /* renamed from: p */
        final /* synthetic */ C2230c f129167p;

        /* renamed from: q */
        final /* synthetic */ UUID f129168q;

        /* renamed from: r */
        final /* synthetic */ C2244l f129169r;

        /* renamed from: s */
        final /* synthetic */ Context f129170s;

        a(C2230c c2230c, UUID uuid, C2244l c2244l, Context context) {
            this.f129167p = c2230c;
            this.f129168q = uuid;
            this.f129169r = c2244l;
            this.f129170s = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!this.f129167p.isCancelled()) {
                    String uuid = this.f129168q.toString();
                    C26976w mo139008j = C27449e0.this.f129166c.mo139008j(uuid);
                    if (mo139008j != null && !mo139008j.f127498b.m11545c()) {
                        C27449e0.this.f129165b.mo11701a(uuid, this.f129169r);
                        this.f129170s.startService(C2197b.m11704d(this.f129170s, AbstractC26979z.m139035a(mo139008j), this.f129169r));
                    } else {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                }
                this.f129167p.mo11798p(null);
            } catch (Throwable th2) {
                this.f129167p.mo11799q(th2);
            }
        }
    }

    public C27449e0(WorkDatabase workDatabase, InterfaceC2196a interfaceC2196a, InterfaceC28696c interfaceC28696c) {
        this.f129165b = interfaceC2196a;
        this.f129164a = interfaceC28696c;
        this.f129166c = workDatabase.mo11565L();
    }

    @Override // androidx.work.InterfaceC2245m
    /* renamed from: a */
    public InterfaceFutureC6534a mo11881a(Context context, UUID uuid, C2244l c2244l) {
        C2230c m11809t = C2230c.m11809t();
        this.f129164a.mo143752d(new a(m11809t, uuid, c2244l, context));
        return m11809t;
    }
}

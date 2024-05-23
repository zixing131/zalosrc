package gy;

import ag0.AbstractC0837p0;
import android.content.Context;
import com.google.firebase.messaging.FirebaseMessaging;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19059j0;
import gg0.AbstractC19444a;
import ho0.AbstractC20110a;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p221hy.InterfaceC20165a;
import p342m6.AbstractC22888j;
import p342m6.AbstractC22894m;

/* renamed from: gy.b */
/* loaded from: classes.dex */
public final class C19678b implements InterfaceC20165a {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private static final String f97639a = C19678b.class.getSimpleName();

    /* renamed from: gy.b$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: g */
    private final Object m103254g(final AbstractC22888j abstractC22888j, long j11, Object obj) {
        final C19059j0 c19059j0 = new C19059j0();
        c19059j0.f94941p = obj;
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        if (AbstractC19444a.m101693a()) {
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: gy.a
                @Override // java.lang.Runnable
                public final void run() {
                    C19678b.m103256i(C19059j0.this, abstractC22888j, countDownLatch);
                }
            });
            try {
                countDownLatch.await(j11, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        } else {
            try {
                c19059j0.f94941p = AbstractC22894m.m117600b(abstractC22888j, j11, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e12) {
                AbstractC20110a.f98889a.mo104552e(e12);
            } catch (ExecutionException e13) {
                AbstractC20110a.f98889a.mo104552e(e13);
            } catch (TimeoutException e14) {
                AbstractC20110a.f98889a.mo104552e(e14);
            }
        }
        return c19059j0.f94941p;
    }

    /* renamed from: h */
    static /* synthetic */ Object m103255h(C19678b c19678b, AbstractC22888j abstractC22888j, long j11, Object obj, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            j11 = 2000;
        }
        if ((i11 & 4) != 0) {
            obj = null;
        }
        return c19678b.m103254g(abstractC22888j, j11, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static final void m103256i(C19059j0 c19059j0, AbstractC22888j abstractC22888j, CountDownLatch countDownLatch) {
        AbstractC19074t.m100208f(c19059j0, "$result");
        AbstractC19074t.m100208f(abstractC22888j, "$gmsTask");
        AbstractC19074t.m100208f(countDownLatch, "$countDownLatch");
        try {
            c19059j0.f94941p = AbstractC22894m.m117599a(abstractC22888j);
        } catch (InterruptedException e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        } catch (ExecutionException e12) {
            AbstractC20110a.f98889a.mo104552e(e12);
        }
        countDownLatch.countDown();
    }

    @Override // p221hy.InterfaceC20165a
    /* renamed from: a */
    public void mo103257a(Context context) {
        AbstractC19074t.m100208f(context, "context");
    }

    @Override // p221hy.InterfaceC20165a
    /* renamed from: b */
    public String mo103258b(Context context) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC22888j m33731q = FirebaseMessaging.m33715n().m33731q();
        AbstractC19074t.m100207e(m33731q, "getToken(...)");
        long currentTimeMillis = System.currentTimeMillis();
        String str = (String) m103255h(this, m33731q, 0L, "", 2, null);
        if (str == null) {
            str = "";
        }
        AbstractC20110a.f98889a.mo104548a("get token in %d (ms)", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        return str;
    }

    @Override // p221hy.InterfaceC20165a
    /* renamed from: c */
    public void mo103259c(Context context) {
        AbstractC19074t.m100208f(context, "context");
    }

    @Override // p221hy.InterfaceC20165a
    /* renamed from: d */
    public void mo103260d(Context context) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC22888j m33728k = FirebaseMessaging.m33715n().m33728k();
        AbstractC19074t.m100207e(m33728k, "deleteToken(...)");
        long currentTimeMillis = System.currentTimeMillis();
        m103255h(this, m33728k, 0L, null, 6, null);
        AbstractC20110a.f98889a.mo104548a("delete token in %d (ms)", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // p221hy.InterfaceC20165a
    /* renamed from: e */
    public void mo103261e(Context context) {
        AbstractC19074t.m100208f(context, "context");
    }

    @Override // p221hy.InterfaceC20165a
    public InterfaceC20165a.a getType() {
        return InterfaceC20165a.a.f99531p;
    }
}

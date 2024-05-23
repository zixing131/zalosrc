package c40;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.AbstractC1364q;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p077ui.ZaloLauncherActivity;
import com.zing.zalo.p077ui.backuprestore.syncmessage.PcRequestTransferView;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import en0.InterfaceC18494a;
import f40.C18719a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19067n0;
import gu.AbstractC19601a;
import java.util.Arrays;
import me0.AbstractC23136l9;
import me0.AbstractC23152n3;
import p363nh.C23750d;
import p542ub.InterfaceC27218a;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import sc.C26220b;

/* renamed from: c40.m */
/* loaded from: classes.dex */
public final class C3284m {
    public static final b Companion = new b(null);

    /* renamed from: a */
    private static final InterfaceC24854k f14070a;

    /* renamed from: c40.m$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f14071q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3284m mo12V4() {
            return c.f14072a.m16703a();
        }
    }

    /* renamed from: c40.m$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C3284m m16702a() {
            return (C3284m) C3284m.f14070a.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c40.m$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f14072a = new c();

        /* renamed from: b */
        private static final C3284m f14073b = new C3284m();

        private c() {
        }

        /* renamed from: a */
        public final C3284m m16703a() {
            return f14073b;
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f14071q);
        f14070a = m129210a;
    }

    /* renamed from: c */
    public static final C3284m m16697c() {
        return Companion.m16702a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m16698f(InterfaceC27218a interfaceC27218a, Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "$extras");
        try {
            ZaloView m93012K0 = interfaceC27218a.mo35579p().m93012K0();
            AbstractC19074t.m100205c(m93012K0);
            C17487o0 m92662fJ = m93012K0.m92662fJ();
            AbstractC19074t.m100205c(m92662fJ);
            m92662fJ.m93069k2(PcRequestTransferView.class, bundle, 1, true);
        } catch (Exception e11) {
            C26220b.m134821d("SMLTransferMsgUIHandler", e11);
            Intent m119014P = AbstractC23152n3.m119014P(PcRequestTransferView.class, bundle, false);
            AbstractC19074t.m100207e(m119014P, "makeIntentShowZaloView(...)");
            MainApplication.Companion.m35500c().startActivity(m119014P);
        }
    }

    /* renamed from: d */
    public final void m16699d(String str, String str2, String str3, long j11, long j12) {
        AbstractC19074t.m100208f(str, "userId");
        AbstractC19074t.m100208f(str2, "pcName");
        AbstractC19074t.m100208f(str3, "publicKey");
        C18719a.m98713f("showRequestTransferPCNotification(): userId=" + str + ", pcName=" + str2 + ", publicKey=" + str3, null, 2, null);
        MainApplication.C6895a c6895a = MainApplication.Companion;
        C23750d c23750d = new C23750d(c6895a.m35500c());
        Bundle bundle = new Bundle();
        bundle.putString("extra_pc_name", str2);
        bundle.putString("extra_public_key", str3);
        bundle.putLong("extra_from_seqid", j11);
        bundle.putLong("extra_min_seqid", j12);
        Intent m119020S = AbstractC23152n3.m119020S(PcRequestTransferView.class, bundle, true);
        AbstractC19074t.m100207e(m119020S, "makeIntentShowZaloViewShowMain(...)");
        c23750d.m6893u(PendingIntent.getActivity(c6895a.m35500c(), 0, m119020S, AbstractC19601a.Companion.m102574b(134217728)));
        C19067n0 c19067n0 = C19067n0.f94947a;
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_sync_mes_pc_request_des);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        String format = String.format(m118743r0, Arrays.copyOf(new Object[]{str2}, 1));
        AbstractC19074t.m100207e(format, "format(...)");
        c23750d.m6869V(new AbstractC1364q.d().m6828h(format));
        c23750d.mo6894v(format);
        c23750d.mo6895w(AbstractC23136l9.m118743r0(AbstractC8020f0.str_sync_mes_pc_request_title));
        c23750d.m6866S(AbstractC16803z.ic_stat_notify_zalo);
        c23750d.m124165v0("pc_request_sync");
        c23750d.m124147b0();
    }

    /* renamed from: e */
    public final void m16700e(String str, String str2, String str3, long j11, long j12) {
        AbstractC19074t.m100208f(str, "userId");
        AbstractC19074t.m100208f(str2, "pcName");
        AbstractC19074t.m100208f(str3, "publicKey");
        C18719a.m98713f("showRequestTransferPCScreen(): userId=" + str + ", pcName=" + str2 + ", publicKey=" + str3, null, 2, null);
        final Bundle bundle = new Bundle();
        bundle.putString("extra_pc_name", str2);
        bundle.putString("extra_public_key", str3);
        bundle.putLong("extra_from_seqid", j11);
        bundle.putLong("extra_min_seqid", j12);
        try {
            final InterfaceC27218a m57112d = ZaloLauncherActivity.Companion.m57112d();
            AbstractC19074t.m100205c(m57112d);
            m57112d.runOnUiThread(new Runnable() { // from class: c40.l
                @Override // java.lang.Runnable
                public final void run() {
                    C3284m.m16698f(InterfaceC27218a.this, bundle);
                }
            });
        } catch (Exception e11) {
            C26220b.m134821d("SMLTransferMsgUIHandler", e11);
            Intent m119014P = AbstractC23152n3.m119014P(PcRequestTransferView.class, bundle, false);
            AbstractC19074t.m100207e(m119014P, "makeIntentShowZaloView(...)");
            MainApplication.Companion.m35500c().startActivity(m119014P);
        }
    }
}

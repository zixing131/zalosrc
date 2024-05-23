package com.zing.zalo.location;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.work.AbstractC2151i0;
import androidx.work.AbstractC2252t;
import androidx.work.C2142e;
import androidx.work.C2148h;
import androidx.work.C2244l;
import androidx.work.C2256x;
import androidx.work.EnumC2242k;
import androidx.work.EnumC2258z;
import androidx.work.WorkerParameters;
import androidx.work.impl.utils.futures.C2230c;
import au.AbstractC2351i;
import com.google.common.util.concurrent.InterfaceFutureC6534a;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.p077ui.picker.location.LiveLocationDetailsView;
import com.zing.zalo.p077ui.zviews.LiveLocationSharingListView;
import com.zing.zalo.perf.presentation.batterymonitor.appwakeup.ZamReceiver;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gu.AbstractC19601a;
import java.util.List;
import java.util.concurrent.TimeUnit;
import me0.AbstractC23088h5;
import me0.AbstractC23152n3;
import mm0.AbstractC23350e;
import on0.AbstractC24341v;
import p304ks.C21927m;
import p363nh.C23744a;
import p363nh.C23746b;
import p461qu.AbstractC25495a;
import p716zh.C31973j5;
import vg.C28023b6;
import vg.C28203u6;

/* loaded from: classes4.dex */
public final class LiveLocationBackgroundWorker extends AbstractC2252t implements C23744a.c {
    public static final C8953a Companion = new C8953a(null);

    /* renamed from: p */
    private final C2230c f47890p;

    /* renamed from: q */
    private final C2230c f47891q;

    /* renamed from: r */
    private boolean f47892r;

    /* renamed from: s */
    private final BroadcastReceiver f47893s;

    /* renamed from: t */
    private boolean f47894t;

    /* renamed from: u */
    private final Handler f47895u;

    /* renamed from: com.zing.zalo.location.LiveLocationBackgroundWorker$a */
    /* loaded from: classes4.dex */
    public static final class C8953a {
        private C8953a() {
        }

        public /* synthetic */ C8953a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final void m47860a() {
            AbstractC2151i0.m11547h(MainApplication.Companion.m35500c()).mo11550b("LiveLocationWorker_test_1");
        }

        /* renamed from: b */
        public final Notification m47861b(Context context) {
            boolean z11;
            PendingIntent activity;
            String string;
            PendingIntent broadcast;
            String string2;
            AbstractC19074t.m100208f(context, "context");
            List<C8969o> m47898C = C8967m.m47867E().m47898C(false);
            int size = m47898C.size();
            C8969o c8969o = null;
            int i11 = 0;
            for (C8969o c8969o2 : m47898C) {
                if (c8969o2 != null && !TextUtils.isEmpty(c8969o2.f47981b)) {
                    if (C21927m.m114302u().m114345m(c8969o2.f47981b)) {
                        i11++;
                    } else if (c8969o == null) {
                        c8969o = c8969o2;
                    }
                }
            }
            if (size == i11) {
                z11 = true;
            } else {
                z11 = false;
            }
            String string3 = context.getString(AbstractC8020f0.str_live_location);
            if (z11) {
                Intent m119012O = AbstractC23152n3.m119012O(MainTabView.class, new Bundle());
                AbstractC19074t.m100207e(m119012O, "makeIntentShowZaloView(...)");
                Context m35500c = MainApplication.Companion.m35500c();
                AbstractC19601a.a aVar = AbstractC19601a.Companion;
                activity = PendingIntent.getActivity(m35500c, 0, m119012O, aVar.m102573a(134217728));
                AbstractC19074t.m100207e(activity, "getActivity(...)");
                string = context.getString(AbstractC8020f0.str_live_location_multi_sharing, Integer.valueOf(size));
                broadcast = PendingIntent.getBroadcast(context, 1991, new Intent("com.zing.zalo.STOP_ALL_LIVE_LOCATIONS"), aVar.m102573a(134217728));
                AbstractC19074t.m100207e(broadcast, "getBroadcast(...)");
                string2 = context.getString(AbstractC8020f0.str_live_location_stop_all);
                AbstractC19074t.m100207e(string2, "getString(...)");
            } else {
                int i12 = size - i11;
                if (i12 == 1) {
                    Bundle bundle = new Bundle();
                    if (c8969o != null) {
                        bundle.putLong("LONG_EXTRA_LIVE_LOCATION_ID", c8969o.f47980a);
                        bundle.putString("extra_conversation_id", c8969o.f47981b);
                        bundle.putDouble("EXTRA_PRESET_LATITUDE", c8969o.f47984e);
                        bundle.putDouble("EXTRA_PRESET_LONGITUDE", c8969o.f47985f);
                    }
                    Intent m119012O2 = AbstractC23152n3.m119012O(LiveLocationDetailsView.class, bundle);
                    AbstractC19074t.m100207e(m119012O2, "makeIntentShowZaloView(...)");
                    Context m35500c2 = MainApplication.Companion.m35500c();
                    AbstractC19601a.a aVar2 = AbstractC19601a.Companion;
                    PendingIntent activity2 = PendingIntent.getActivity(m35500c2, 0, m119012O2, aVar2.m102573a(134217728));
                    AbstractC19074t.m100207e(activity2, "getActivity(...)");
                    if (c8969o != null && !TextUtils.isEmpty(c8969o.f47981b)) {
                        if (AbstractC25495a.m132079d(c8969o.f47981b)) {
                            C31973j5 m40389U = new ContactProfile(c8969o.f47981b).m40389U();
                            if (m40389U != null) {
                                string3 = context.getString(AbstractC8020f0.str_live_location_sharing, m40389U.m153793y());
                            }
                        } else {
                            ContactProfile m141798e = C28203u6.m141798e(C28203u6.f131407a, c8969o.f47981b, null, 2, null);
                            if (m141798e != null) {
                                string3 = context.getString(AbstractC8020f0.str_live_location_sharing, m141798e.m40383Q(true, false));
                            }
                        }
                    }
                    if (TextUtils.isEmpty(string3)) {
                        string = context.getString(AbstractC8020f0.str_live_location_multi_sharing, Integer.valueOf(size));
                    } else {
                        string = string3;
                    }
                    Intent intent = new Intent("com.zing.zalo.STOP_LIVE_LOCATION");
                    if (c8969o != null) {
                        intent.putExtra("LONG_EXTRA_LIVE_LOCATION_ID", c8969o.f47980a);
                    }
                    broadcast = PendingIntent.getBroadcast(context, 1991, intent, aVar2.m102573a(134217728));
                    AbstractC19074t.m100207e(broadcast, "getBroadcast(...)");
                    String string4 = context.getString(AbstractC8020f0.str_live_location_stop_sharing);
                    AbstractC19074t.m100207e(string4, "getString(...)");
                    string2 = string4;
                    activity = activity2;
                } else {
                    Intent m119012O3 = AbstractC23152n3.m119012O(LiveLocationSharingListView.class, new Bundle());
                    AbstractC19074t.m100207e(m119012O3, "makeIntentShowZaloView(...)");
                    Context m35500c3 = MainApplication.Companion.m35500c();
                    AbstractC19601a.a aVar3 = AbstractC19601a.Companion;
                    activity = PendingIntent.getActivity(m35500c3, 0, m119012O3, aVar3.m102573a(134217728));
                    AbstractC19074t.m100207e(activity, "getActivity(...)");
                    string = context.getString(AbstractC8020f0.str_live_location_multi_sharing, Integer.valueOf(i12));
                    broadcast = PendingIntent.getBroadcast(context, 1991, new Intent("com.zing.zalo.STOP_ALL_LIVE_LOCATIONS"), aVar3.m102573a(134217728));
                    AbstractC19074t.m100207e(broadcast, "getBroadcast(...)");
                    string2 = context.getString(AbstractC8020f0.str_live_location_stop_all);
                    AbstractC19074t.m100207e(string2, "getString(...)");
                }
            }
            C23746b c23746b = new C23746b(context);
            c23746b.m124165v0("live_location");
            c23746b.m6866S(AbstractC16803z.ic_stat_notify_zalo);
            c23746b.m6870W(context.getString(AbstractC8020f0.app_name));
            c23746b.m6875a0(System.currentTimeMillis());
            c23746b.mo6860M(false);
            c23746b.mo6895w(context.getString(AbstractC8020f0.str_live_location));
            c23746b.m6893u(activity);
            c23746b.mo6894v(string);
            c23746b.m6874a(0, string2, broadcast);
            C28023b6.m141256k2(c23746b);
            Notification mo6879e = c23746b.mo6879e();
            AbstractC19074t.m100207e(mo6879e, "build(...)");
            return mo6879e;
        }

        /* renamed from: c */
        public final void m47862c(C8969o c8969o) {
            AbstractC19074t.m100208f(c8969o, "liveLocationEntry");
            m47860a();
            C2148h m11534a = new C2148h.a().m11535b("uid", CoreUtility.f89233i).m11535b("live_entry", c8969o.m47968f().toString()).m11534a();
            AbstractC19074t.m100207e(m11534a, "build(...)");
            AbstractC2151i0.m11547h(MainApplication.Companion.m35500c()).m11554f("LiveLocationWorker_test_1", EnumC2242k.KEEP, (C2256x) ((C2256x.a) ((C2256x.a) ((C2256x.a) ((C2256x.a) ((C2256x.a) new C2256x.a(LiveLocationBackgroundWorker.class).m11873n(m11534a)).m11862a("LiveLocationWorker_test_1")).m11869j(new C2142e.a().m11513a())).m11872m(0L, TimeUnit.SECONDS)).m11870k(EnumC2258z.RUN_AS_NON_EXPEDITED_WORK_REQUEST)).m11863b()).getState();
        }
    }

    /* renamed from: com.zing.zalo.location.LiveLocationBackgroundWorker$b */
    /* loaded from: classes4.dex */
    public static final class HandlerC8954b extends Handler {
        HandlerC8954b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            AbstractC19074t.m100208f(message, "msg");
            int i11 = message.what;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("handleMessage: ");
            sb2.append(i11);
            int i12 = message.what;
            if (i12 != 1) {
                if (i12 == 2) {
                    C8967m.m47867E().m47941u0();
                    LiveLocationBackgroundWorker.this.m47853j();
                    return;
                }
                return;
            }
            C8967m.m47867E().m47925m();
            LiveLocationBackgroundWorker.this.m47852i();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveLocationBackgroundWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AbstractC19074t.m100208f(context, "appContext");
        AbstractC19074t.m100208f(workerParameters, "workerParams");
        C2230c m11809t = C2230c.m11809t();
        AbstractC19074t.m100207e(m11809t, "create(...)");
        this.f47890p = m11809t;
        C2230c m11809t2 = C2230c.m11809t();
        AbstractC19074t.m100207e(m11809t2, "create(...)");
        this.f47891q = m11809t2;
        this.f47893s = new ZamReceiver() { // from class: com.zing.zalo.location.LiveLocationBackgroundWorker$broadcastReceiver$1
            @Override // com.zing.zalo.perf.presentation.batterymonitor.appwakeup.ZamReceiver, com.zing.zalo.startup.NonBlockingBroadcastReceiver
            /* renamed from: b */
            public void mo39547b(Context context2, Intent intent) {
                boolean m127126v;
                boolean m127126v2;
                AbstractC19074t.m100208f(context2, "context");
                AbstractC19074t.m100208f(intent, "intent");
                try {
                    String action = intent.getAction();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Received broadcast, action: ");
                    sb2.append(action);
                    String action2 = intent.getAction();
                    m127126v = AbstractC24341v.m127126v("com.zing.zalo.STOP_ALL_LIVE_LOCATIONS", action2, true);
                    if (!m127126v) {
                        m127126v2 = AbstractC24341v.m127126v("com.zing.zalo.STOP_LIVE_LOCATION", action2, true);
                        if (m127126v2) {
                            C8969o m47907H = C8967m.m47867E().m47907H(intent.getLongExtra("LONG_EXTRA_LIVE_LOCATION_ID", 0L));
                            if (m47907H != null) {
                                C8967m.m47867E().m47938t(m47907H);
                            }
                        }
                    } else {
                        C8967m.m47867E().m47936s();
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }
        };
        this.f47895u = new HandlerC8954b(Looper.getMainLooper());
    }

    /* renamed from: d */
    private final void m47847d(boolean z11) {
        m47858o();
        m47859p();
        this.f47895u.removeCallbacksAndMessages(null);
        if (z11) {
            this.f47890p.mo11798p(AbstractC2252t.a.m11891c());
        }
    }

    /* renamed from: e */
    static /* synthetic */ void m47848e(LiveLocationBackgroundWorker liveLocationBackgroundWorker, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        liveLocationBackgroundWorker.m47847d(z11);
    }

    /* renamed from: f */
    private final C2244l m47849f() {
        int m118423d = AbstractC23088h5.m118423d("live_location", "");
        if (Build.VERSION.SDK_INT >= 29) {
            C8953a c8953a = Companion;
            Context applicationContext = getApplicationContext();
            AbstractC19074t.m100207e(applicationContext, "getApplicationContext(...)");
            return new C2244l(m118423d, c8953a.m47861b(applicationContext), 8);
        }
        C8953a c8953a2 = Companion;
        Context applicationContext2 = getApplicationContext();
        AbstractC19074t.m100207e(applicationContext2, "getApplicationContext(...)");
        return new C2244l(m118423d, c8953a2.m47861b(applicationContext2));
    }

    /* renamed from: g */
    private final void m47850g() {
        m47851h();
        String str = CoreUtility.f89233i;
        if (str != null && str.length() != 0) {
            if (!AbstractC19074t.m100204b(getInputData().m11532j("uid"), CoreUtility.f89233i)) {
                m47848e(this, false, 1, null);
                return;
            }
            m47853j();
            m47852i();
            if (C8967m.m47867E().m47898C(false).isEmpty()) {
                m47847d(true);
                return;
            }
            return;
        }
        m47848e(this, false, 1, null);
    }

    /* renamed from: h */
    private final void m47851h() {
        m47857n(this, false, 1, null);
        m47854k();
        m47855l();
    }

    /* renamed from: i */
    public final void m47852i() {
        if (!this.f47895u.hasMessages(1)) {
            this.f47895u.sendEmptyMessageDelayed(1, 60000L);
        }
    }

    /* renamed from: j */
    public final void m47853j() {
        if (!this.f47895u.hasMessages(2)) {
            this.f47895u.sendEmptyMessageDelayed(2, C8967m.f47928w * 1000);
        }
    }

    /* renamed from: k */
    private final void m47854k() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.zing.zalo.STOP_ALL_LIVE_LOCATIONS");
        intentFilter.addAction("com.zing.zalo.STOP_LIVE_LOCATION");
        Context applicationContext = getApplicationContext();
        AbstractC19074t.m100207e(applicationContext, "getApplicationContext(...)");
        AbstractC2351i.m12327a(applicationContext, this.f47893s, intentFilter, true);
        this.f47892r = true;
    }

    /* renamed from: l */
    private final void m47855l() {
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124115b(this, 200);
        bVar.m124119a().m124115b(this, 201);
        this.f47894t = true;
    }

    /* renamed from: m */
    private final void m47856m(boolean z11) {
        C2244l m47849f = m47849f();
        this.f47891q.mo11798p(m47849f);
        if (z11) {
            setForegroundAsync(m47849f);
        }
    }

    /* renamed from: n */
    static /* synthetic */ void m47857n(LiveLocationBackgroundWorker liveLocationBackgroundWorker, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        liveLocationBackgroundWorker.m47856m(z11);
    }

    /* renamed from: o */
    private final void m47858o() {
        if (this.f47892r) {
            getApplicationContext().unregisterReceiver(this.f47893s);
            this.f47892r = false;
        }
    }

    /* renamed from: p */
    private final void m47859p() {
        if (this.f47894t) {
            C23744a.b bVar = C23744a.Companion;
            bVar.m124119a().m124117e(this, 200);
            bVar.m124119a().m124117e(this, 201);
            this.f47894t = false;
        }
    }

    @Override // androidx.work.AbstractC2252t
    public InterfaceFutureC6534a getForegroundInfoAsync() {
        m47856m(false);
        return this.f47891q;
    }

    @Override // androidx.work.AbstractC2252t
    public void onStopped() {
        super.onStopped();
        m47847d(false);
    }

    @Override // androidx.work.AbstractC2252t
    public InterfaceFutureC6534a startWork() {
        m47850g();
        return this.f47890p;
    }

    @Override // p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        if (i11 != 200) {
            if (i11 == 201) {
                m47848e(this, false, 1, null);
                return;
            }
            return;
        }
        m47857n(this, false, 1, null);
    }
}

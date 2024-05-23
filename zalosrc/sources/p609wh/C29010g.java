package p609wh;

import ag0.C0808c0;
import android.os.SystemClock;
import android.text.TextUtils;
import com.zing.zalo.service.TaskNonStickyExecutor;
import com.zing.zalocore.CoreUtility;
import hm0.C20096c;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import jm0.InterfaceC21299i;
import me0.AbstractC23059e9;
import me0.C23055e5;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p348mi.AbstractC23309i;
import p609wh.AbstractC29039u0;
import p645xh.C29628e;

/* renamed from: wh.g */
/* loaded from: classes3.dex */
public class C29010g {

    /* renamed from: c */
    private static C29010g f134309c;

    /* renamed from: a */
    final AtomicLong f134310a = new AtomicLong(0);

    /* renamed from: b */
    private final Runnable f134311b = new Runnable() { // from class: wh.f
        @Override // java.lang.Runnable
        public final void run() {
            C29010g.this.m144893h();
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wh.g$a */
    /* loaded from: classes3.dex */
    public class a implements InterfaceC21299i {
        a() {
        }

        @Override // jm0.InterfaceC21299i
        /* renamed from: c */
        public void mo1342c(C20096c c20096c) {
            AbstractC20110a.m104538g("error:" + c20096c, new Object[0]);
            C29010g.this.m144896j(300000L);
            synchronized (C29010g.this.f134310a) {
                C29010g.this.f134310a.set(0L);
            }
        }

        @Override // jm0.InterfaceC21299i
        /* renamed from: f */
        public void mo1343f(JSONObject jSONObject) {
            try {
                AbstractC20110a.m104535d("fetchUpdateFromServer: %s", jSONObject);
                AbstractC23309i.m121060Ir(System.currentTimeMillis());
                C29010g.this.m144895i(jSONObject, 1);
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wh.g$b */
    /* loaded from: classes3.dex */
    public class b implements InterfaceC21299i {

        /* renamed from: a */
        final /* synthetic */ int f134313a;

        b(int i11) {
            this.f134313a = i11;
        }

        @Override // jm0.InterfaceC21299i
        /* renamed from: c */
        public void mo1342c(C20096c c20096c) {
            AbstractC20110a.m104538g("error:" + c20096c, new Object[0]);
            synchronized (C29010g.this.f134310a) {
                C29010g.this.f134310a.set(0L);
            }
        }

        @Override // jm0.InterfaceC21299i
        /* renamed from: f */
        public void mo1343f(JSONObject jSONObject) {
            try {
                AbstractC20110a.m104535d("deliveredToServer: %s", jSONObject);
                int i11 = this.f134313a;
                if (i11 <= 5) {
                    C29010g.this.m144895i(jSONObject, i11 + 1);
                    return;
                }
                synchronized (C29010g.this.f134310a) {
                    C29010g.this.f134310a.set(0L);
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    private C29010g() {
    }

    /* renamed from: c */
    private void m144888c(String str, int i11) {
        int i12;
        try {
            AbstractC20110a.m104535d("deliveredToServer: " + str, new Object[0]);
            C29037t0 c29037t0 = new C29037t0(new b(i11));
            if (AbstractC23059e9.m118343v()) {
                i12 = 11;
            } else {
                i12 = 1;
            }
            c29037t0.f103775r = i12;
            c29037t0.m110314j(str, "", new String[]{"viewerkey"}, new String[]{CoreUtility.m93148a().mo100075b()});
            C0808c0.m2046b(c29037t0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: d */
    private void m144889d() {
        int i11;
        try {
            AbstractC20110a.m104535d("fetchUpdateFromServer", new Object[0]);
            if (!C23055e5.m118271f()) {
                return;
            }
            if (C29628e.m147249E0().m147261M0()) {
                AbstractC20110a.m104535d("skip http-broadcast message by lock socket", new Object[0]);
                return;
            }
            synchronized (this.f134310a) {
                try {
                    long abs = Math.abs(SystemClock.elapsedRealtime() - this.f134310a.get());
                    if (this.f134310a.get() != 0 && abs < 300000) {
                        return;
                    }
                    this.f134310a.set(SystemClock.elapsedRealtime());
                    TaskNonStickyExecutor.m50450b().m50451a(TaskNonStickyExecutor.f49561e);
                    C29037t0 c29037t0 = new C29037t0(new a());
                    long m122234o5 = AbstractC23309i.m122234o5();
                    if (AbstractC23059e9.m118343v()) {
                        i11 = 11;
                    } else {
                        i11 = 1;
                    }
                    c29037t0.f103775r = i11;
                    c29037t0.m110314j(AbstractC29039u0.m145033a(AbstractC29039u0.b.BROADCAST_MSG_GET), "", new String[]{"viewerkey", "actid"}, new String[]{CoreUtility.m93148a().mo100075b(), Long.toString(m122234o5)});
                    C0808c0.m2046b(c29037t0);
                } finally {
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: e */
    public static synchronized C29010g m144890e() {
        C29010g c29010g;
        synchronized (C29010g.class) {
            try {
                if (f134309c == null) {
                    f134309c = new C29010g();
                }
                c29010g = f134309c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c29010g;
    }

    /* renamed from: f */
    private static long m144891f() {
        return Math.min(604800000L, Math.max(1800000L, AbstractC23309i.m121713ad()));
    }

    /* renamed from: g */
    private static int m144892g(int i11) {
        if (i11 == 90) {
            return 1;
        }
        if (i11 == 101 || i11 == 113 || i11 == 201 || i11 == 207) {
            return 2;
        }
        if (i11 != 600) {
            return (i11 == 10104 || i11 == 10207) ? 2 : 0;
        }
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m144893h() {
        m144894b(false);
    }

    /* renamed from: b */
    public void m144894b(boolean z11) {
        long abs = Math.abs(System.currentTimeMillis() - AbstractC23309i.m122084k7()) - m144891f();
        if (abs >= 0) {
            m144889d();
        } else if (z11) {
            TaskNonStickyExecutor.m50450b().m50456g(this.f134311b, TaskNonStickyExecutor.f49561e, Math.abs(abs));
        }
    }

    /* renamed from: i */
    void m144895i(JSONObject jSONObject, int i11) {
        try {
            AbstractC23309i.m122522vy(jSONObject.optLong("schedule", 0L) * 1000);
            String optString = jSONObject.optString("deliveredURL");
            if (!TextUtils.isEmpty(optString)) {
                AbstractC23309i.m121169Lp(jSONObject.optLong("actid", 0L));
                m144888c(optString, i11);
            } else {
                synchronized (this.f134310a) {
                    this.f134310a.set(0L);
                }
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("broadcastMsg");
            if (optJSONArray != null && optJSONArray.length() != 0) {
                ArrayList arrayList = new ArrayList();
                for (int i12 = 0; i12 < optJSONArray.length(); i12++) {
                    try {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i12);
                        int i13 = jSONObject2.getInt("cmd");
                        Object opt = jSONObject2.opt("data");
                        if (opt != null) {
                            C29012h c29012h = new C29012h(opt.toString());
                            c29012h.m93295q((short) i13);
                            c29012h.m93301w((byte) m144892g(i13));
                            arrayList.add(c29012h);
                        }
                    } catch (JSONException e11) {
                        e11.printStackTrace();
                    }
                }
                if (!arrayList.isEmpty()) {
                    C29021l0.m144916J().m144999N0(arrayList);
                }
            }
        } catch (Exception e12) {
            AbstractC20110a.m104539h(e12);
        }
    }

    /* renamed from: j */
    public void m144896j(long j11) {
        AbstractC23309i.m121060Ir((System.currentTimeMillis() - m144891f()) + j11);
        m144894b(true);
    }
}

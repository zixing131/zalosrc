package me.zalo.startuphelper;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import gh0.C19447a;
import hh0.AbstractC20066d;
import java.util.HashMap;
import java.util.Map;
import jh0.AbstractC21254a;
import lh0.EnumC22487b;
import me.zalo.startuphelper.AbstractC23000d;
import me.zalo.startuphelper.AsyncTaskC22997a;
import me.zalo.startuphelper.AsyncTaskC23001e;
import org.json.JSONException;
import org.json.JSONObject;
import p327lm.C22523c;
import p327lm.C22528h;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: me.zalo.startuphelper.c */
/* loaded from: classes7.dex */
public class C22999c {

    /* renamed from: h */
    private static long f111834h = 2592000000L;

    /* renamed from: i */
    private static long f111835i = 86400000;

    /* renamed from: a */
    private String f111836a;

    /* renamed from: b */
    private String f111837b;

    /* renamed from: c */
    private boolean f111838c = false;

    /* renamed from: d */
    private boolean f111839d = false;

    /* renamed from: e */
    private boolean f111840e = false;

    /* renamed from: f */
    private boolean f111841f = false;

    /* renamed from: g */
    private Context f111842g;

    /* renamed from: me.zalo.startuphelper.c$a */
    /* loaded from: classes7.dex */
    public class a implements C22523c.a {

        /* renamed from: a */
        final /* synthetic */ boolean f111843a;

        /* renamed from: b */
        final /* synthetic */ String f111844b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: me.zalo.startuphelper.c$a$a */
        /* loaded from: classes7.dex */
        public class C32891a implements AsyncTaskC22997a.a {

            /* renamed from: me.zalo.startuphelper.c$a$a$a */
            /* loaded from: classes7.dex */
            class C32892a implements AsyncTaskC23001e.a {
                C32892a() {
                }

                @Override // me.zalo.startuphelper.AsyncTaskC23001e.a
                /* renamed from: a */
                public void mo117842a(boolean z11) {
                    C22999c.this.f111841f = false;
                    if (!TextUtils.isEmpty(a.this.f111844b) && z11) {
                        C22999c.this.m117807F(true);
                        C22999c.this.m117808G(System.currentTimeMillis());
                        C22999c c22999c = C22999c.this;
                        c22999c.m117809H(AbstractC23000d.m117849g(c22999c.f111842g));
                        C22999c c22999c2 = C22999c.this;
                        c22999c2.m117810I(AbstractC23000d.m117850h(c22999c2.f111842g));
                    }
                }
            }

            C32891a() {
            }

            @Override // me.zalo.startuphelper.AsyncTaskC22997a.a
            /* renamed from: a */
            public void mo117801a(String str) {
                AsyncTaskC23001e.b bVar = AsyncTaskC23001e.b.OPEN_APP;
                if (C22999c.this.f111838c) {
                    bVar = AsyncTaskC23001e.b.NOTIF;
                } else if (!C22999c.this.f111840e && C22999c.this.f111839d) {
                    bVar = AsyncTaskC23001e.b.WAKE_UP;
                }
                AsyncTaskC23001e.b bVar2 = bVar;
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    jSONObject.put("resubmit", a.this.f111843a);
                    str = jSONObject.toString();
                } catch (JSONException unused) {
                }
                a aVar = a.this;
                new AsyncTaskC23001e(new C23003g(bVar2, str, aVar.f111844b, C22999c.this.f111836a, AbstractC23000d.f111853f, a.this.f111843a), new C32892a()).execute(new Void[0]);
            }
        }

        a(boolean z11, String str) {
            this.f111843a = z11;
            this.f111844b = str;
        }

        @Override // p327lm.C22523c.a
        /* renamed from: a */
        public void mo99243a(String str) {
            if (TextUtils.isEmpty(str)) {
                AbstractC21254a.m110063e("submitFirebaseToken", "submitFirebaseToken: Can't get device id");
                C22999c.this.f111841f = false;
            } else {
                new AsyncTaskC22997a(C22999c.this.f111837b, new C32891a()).execute(C22999c.this.f111842g);
            }
        }
    }

    public C22999c(Context context) {
        this.f111842g = context.getApplicationContext();
        m117812K();
    }

    /* renamed from: C */
    private void m117805C(String str) {
        if (!TextUtils.isEmpty(str)) {
            AbstractC20066d.m104281A(this.f111842g, "com.zing.zalo.sdk.preload.wakeup", "com.zing.zalo.sdk.wakeup.firebasetoken", str);
        }
    }

    /* renamed from: D */
    private void m117806D(String str, long j11, String str2) {
        JSONObject jSONObject;
        try {
            try {
                jSONObject = new JSONObject(AbstractC20066d.m104299r(this.f111842g));
            } catch (Exception unused) {
                jSONObject = new JSONObject();
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("zdid", str);
            jSONObject2.put("ts", j11);
            jSONObject.put(str2, jSONObject2);
            AbstractC20066d.m104281A(this.f111842g, "com.zing.zalo.sdk.preload.wakeup", "com.zing.zalo.sdk.wakeup.listdeviceid_wk", jSONObject.toString());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: F */
    public void m117807F(boolean z11) {
        AbstractC20066d.m104303v(this.f111842g, "com.zing.zalo.sdk.preload.wakeup", "com.zing.zalo.sdk.wakeup.isSubmitFirebaseToken", z11);
    }

    /* renamed from: G */
    public void m117808G(long j11) {
        AbstractC20066d.m104306y(this.f111842g, "com.zing.zalo.sdk.preload.wakeup", "com.zing.zalo.sdk.wakeup.timeSubmitFirebaseToken", j11);
    }

    /* renamed from: H */
    public void m117809H(boolean z11) {
        AbstractC20066d.m104305x(this.f111842g, "com.zing.zalo.sdk.preload.wakeup", "com.zing.zalo.sdk.wakeup.statusNotiPermission", z11 ? 1 : 0);
    }

    /* renamed from: I */
    public void m117810I(boolean z11) {
        AbstractC20066d.m104305x(this.f111842g, "com.zing.zalo.sdk.preload.wakeup", "com.zing.zalo.sdk.wakeup.statusRestrictMode", z11 ? 1 : 0);
    }

    /* renamed from: J */
    private void m117811J(String str, boolean z11) {
        if (!m117827r() && !this.f111841f) {
            this.f111841f = true;
            C22523c.m116498g().m116504e(new a(z11, str));
        }
    }

    /* renamed from: K */
    private void m117812K() {
        try {
            Application application = (Application) this.f111842g.getApplicationContext();
            if (!AbstractC20066d.m104297p(application)) {
                C22528h.m116533g().m116539h(application);
            }
        } catch (Exception e11) {
            AbstractC21254a.m110068j(e11.getMessage());
        }
    }

    /* renamed from: l */
    private Intent m117824l(Context context, Map map) {
        if (map == null || !map.containsKey("wk_open_ps")) {
            return null;
        }
        String str = (String) map.get("wk_open_ps");
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str));
        if (!m117829w(context, intent)) {
            intent = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + str));
        }
        if (!m117829w(context, intent)) {
            return null;
        }
        if (map.containsKey("wk_pgk_name")) {
            intent.putExtra("wk_notif", (String) map.get("wk_notif"));
            intent.putExtra("wk_source", (String) map.get("wk_source"));
            m117831B(intent);
        } else if (map.containsKey("wk_url")) {
            intent.putExtra("wk_notif", (String) map.get("wk_notif"));
            intent.putExtra("wk_source", (String) map.get("wk_source"));
            m117831B(intent);
        }
        return intent;
    }

    /* renamed from: n */
    private long m117825n() {
        return AbstractC20066d.m104292k(this.f111842g, "com.zing.zalo.sdk.preload.wakeup", "com.zing.zalo.sdk.wakeup.timeSubmitFirebaseToken");
    }

    /* renamed from: o */
    private String m117826o() {
        return AbstractC20066d.m104294m(this.f111842g, "com.zing.zalo.sdk.preload.wakeup", "com.zing.zalo.sdk.wakeup.firebasetoken");
    }

    /* renamed from: r */
    private boolean m117827r() {
        return AbstractC20066d.m104290i(this.f111842g, "com.zing.zalo.sdk.preload.wakeup", "com.zing.zalo.sdk.wakeup.isSubmitFirebaseToken");
    }

    /* renamed from: v */
    private boolean m117828v() {
        long m117825n = m117825n();
        int m117835q = m117835q();
        int m117834p = m117834p();
        if (m117836s()) {
            return false;
        }
        long j11 = f111834h;
        int m101727h = C19447a.m101720d().m101727h(this.f111842g);
        if (m101727h > 0) {
            j11 = m101727h * f111835i;
        }
        if (m117825n > 0 && m117825n + j11 < System.currentTimeMillis()) {
            return true;
        }
        boolean m117850h = AbstractC23000d.m117850h(this.f111842g);
        boolean m117849g = AbstractC23000d.m117849g(this.f111842g);
        if (m117835q == m117850h && m117834p == m117849g) {
            return false;
        }
        return true;
    }

    /* renamed from: w */
    private boolean m117829w(Context context, Intent intent) {
        PackageManager packageManager = context.getPackageManager();
        if (intent != null && intent.resolveActivity(packageManager) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: A */
    public void m117830A(String str, String str2) {
        this.f111839d = true;
        this.f111836a = str;
        this.f111837b = str2;
        m117806D(str2, System.currentTimeMillis(), str);
        String m117826o = m117826o();
        AbstractC23000d.f111853f = AbstractC23000d.b.WAKEUP_APP_SUBMIT_TOKEN;
        boolean m117828v = m117828v();
        if (m117836s() || m117828v || !m117827r()) {
            m117807F(false);
            m117811J(m117826o, m117828v);
        }
    }

    /* renamed from: B */
    public void m117831B(Intent intent) {
        if (intent != null) {
            String m116503d = C22523c.m116498g().m116503d();
            if (!TextUtils.isEmpty(m116503d)) {
                intent.putExtra("wk_globalid", m116503d);
            }
        }
    }

    /* renamed from: E */
    public void m117832E(String str) {
        String m117826o = m117826o();
        if (str.equals(m117826o) && m117827r()) {
            AbstractC21254a.m110063e("setFirebaseToken", String.format("setFirebaseToken failed: oldToken=%s - newToken=%s - isSubmitted: %s", m117826o, str, Boolean.valueOf(m117827r())));
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            m117805C(str);
            m117807F(false);
        }
        m117811J(str, false);
    }

    /* renamed from: m */
    public Intent m117833m(Context context, Map map, Boolean bool) {
        Intent intent;
        boolean z11;
        String str;
        if (map.containsKey("wk_pgk_name")) {
            intent = context.getPackageManager().getLaunchIntentForPackage((String) map.get("wk_pgk_name"));
            if (intent != null) {
                intent.putExtra("wk_notif", (String) map.get("wk_notif"));
                intent.putExtra("wk_source", (String) map.get("wk_source"));
                m117831B(intent);
            }
            z11 = m117829w(context, intent);
            map.put("can_open", String.valueOf(z11));
        } else if (map.containsKey("wk_url")) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setFlags(268435456);
            String str2 = (String) map.get("wk_url");
            if (str2.contains("?")) {
                str = str2 + "&";
            } else {
                str = str2 + "?";
            }
            intent2.setData(Uri.parse(str + "wk_source=" + ((String) map.get("wk_source")) + "&wk_notif=" + ((String) map.get("wk_notif"))));
            intent2.putExtra("wk_notif", (String) map.get("wk_notif"));
            intent2.putExtra("wk_source", (String) map.get("wk_source"));
            m117831B(intent2);
            boolean m117829w = m117829w(context, intent2);
            map.put("can_open", String.valueOf(m117829w));
            z11 = m117829w;
            intent = intent2;
        } else {
            intent = null;
            z11 = false;
        }
        if (bool.booleanValue()) {
            C22528h.m116533g().m116535b(EnumC22487b.RECEIVE_NOTIFICATION, map);
            C22528h.m116533g().m116536c();
        }
        if (!z11) {
            return m117824l(context, map);
        }
        return intent;
    }

    /* renamed from: p */
    public int m117834p() {
        if (Build.VERSION.SDK_INT >= 33) {
            return AbstractC20066d.m104291j(this.f111842g, "com.zing.zalo.sdk.preload.wakeup", "com.zing.zalo.sdk.wakeup.statusNotiPermission");
        }
        return 1;
    }

    /* renamed from: q */
    public int m117835q() {
        if (Build.VERSION.SDK_INT >= 28) {
            return AbstractC20066d.m104291j(this.f111842g, "com.zing.zalo.sdk.preload.wakeup", "com.zing.zalo.sdk.wakeup.statusRestrictMode");
        }
        return 0;
    }

    /* renamed from: s */
    boolean m117836s() {
        long m117825n = m117825n();
        int m117835q = m117835q();
        int m117834p = m117834p();
        if (m117825n != -1 && m117834p != -1 && m117835q != -1) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    public boolean m117837t(Map map) {
        if (map.containsKey("wk_notif") && map.containsKey("wk_source") && (map.containsKey("wk_url") || map.containsKey("wk_pgk_name"))) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public boolean m117838u(Intent intent) {
        if (intent != null && intent.hasExtra("wk_source") && intent.hasExtra("wk_notif")) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public void m117839x(Map map) {
        this.f111840e = true;
        this.f111836a = "";
        new AsyncTaskC23002f(map).execute(this.f111842g);
        String m117826o = m117826o();
        AbstractC23000d.f111853f = AbstractC23000d.b.OPEN_APP_SUBMIT_TOKEN;
        boolean m117828v = m117828v();
        if (m117836s() || m117828v || !m117827r()) {
            m117807F(false);
            m117811J(m117826o, m117828v);
        }
    }

    /* renamed from: y */
    public void m117840y(Intent intent) {
        if (intent != null && intent.hasExtra("wk_source")) {
            String stringExtra = intent.getStringExtra("wk_source");
            if (TextUtils.isEmpty(stringExtra)) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("sourceFrom", stringExtra);
            hashMap.put("wakeupInfo", AbstractC20066d.m104299r(this.f111842g));
            if (intent.hasExtra("wk_globalid")) {
                hashMap.put("sourceGid", intent.getStringExtra("wk_globalid"));
            }
            C22528h.m116533g().m116535b(EnumC22487b.OPEN_APP_BY_NOTIFICATION, hashMap);
            C22528h.m116533g().m116536c();
            this.f111838c = true;
            this.f111836a = stringExtra;
            AbstractC23000d.f111853f = AbstractC23000d.b.OPEN_APP_SUBMIT_TOKEN;
            String m117826o = m117826o();
            boolean m117828v = m117828v();
            if (m117836s() || m117828v || !m117827r()) {
                m117807F(false);
                m117811J(m117826o, m117828v);
            }
        }
    }

    /* renamed from: z */
    public void m117841z() {
    }
}

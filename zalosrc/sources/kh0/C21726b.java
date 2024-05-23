package kh0;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import fh0.AbstractC18936a;
import ih0.C20557a;
import ih0.C20558b;
import java.util.HashMap;
import java.util.Map;
import jh0.AbstractC21254a;
import org.json.JSONObject;

/* renamed from: kh0.b */
/* loaded from: classes.dex */
public class C21726b {

    /* renamed from: e */
    public static final String[] f105498e = {"https://mp3.zing.vn/zdl/service_map_all.bin", "https://zaloapp.com/zdl/service_map_all.bin", "https://news.zing.vn/zdl/service_map_all.bin", "https://n.zing.vn/zdl/service_map_all.bin", "https://srv.mp3.zing.vn/zdl/service_map_all.bin"};

    /* renamed from: f */
    private static C21726b f105499f;

    /* renamed from: a */
    private long f105500a = -1;

    /* renamed from: b */
    private C20557a f105501b = new C20557a();

    /* renamed from: c */
    private Map f105502c = new HashMap();

    /* renamed from: d */
    private C21727c f105503d;

    /* renamed from: kh0.b$a */
    /* loaded from: classes7.dex */
    class a implements InterfaceC21725a {

        /* renamed from: a */
        final /* synthetic */ Context f105504a;

        a(Context context) {
            this.f105504a = context;
        }

        @Override // kh0.InterfaceC21725a
        /* renamed from: a */
        public void mo112128a(JSONObject jSONObject) {
            if (jSONObject == null) {
                AbstractC21254a.m110068j("Service map not found!");
                return;
            }
            try {
                String string = jSONObject.getJSONArray("oauth_http_s").getString(0);
                String string2 = jSONObject.getJSONArray("graph_http_s").getString(0);
                String string3 = jSONObject.getJSONArray("centralized_http_s").getString(0);
                AbstractC21254a.m110068j("Got service map: ");
                AbstractC21254a.m110068j("oath: " + string);
                AbstractC21254a.m110068j("graph: " + string2);
                AbstractC21254a.m110068j("centralized: " + string3);
                C21726b.this.m112131f(string, string2, string3, this.f105504a);
            } catch (Exception e11) {
                AbstractC21254a.m110068j(e11.getMessage());
            }
        }
    }

    /* renamed from: kh0.b$b */
    /* loaded from: classes7.dex */
    public static class b extends AsyncTask {

        /* renamed from: a */
        private final C20557a f105506a;

        /* renamed from: b */
        private InterfaceC21725a f105507b;

        b(C20557a c20557a, InterfaceC21725a interfaceC21725a) {
            this.f105506a = c20557a;
            this.f105507b = interfaceC21725a;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public JSONObject doInBackground(Integer... numArr) {
            for (String str : C21726b.f105498e) {
                try {
                    return new JSONObject(AbstractC21728d.m112149c(this.f105506a.m106847a(C20558b.a.GET, str).m106853f()));
                } catch (Exception e11) {
                    AbstractC21254a.m110063e("DownloadServiceMapFilesAsyncTask", e11.getMessage());
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(JSONObject jSONObject) {
            this.f105507b.mo112128a(jSONObject);
        }
    }

    private C21726b() {
        if (AbstractC18936a.f94464a.booleanValue()) {
            this.f105502c.put("oauth_http_s", "https://dev-oauth.zaloapp.com");
            this.f105502c.put("graph_http_s", "https://graph.zaloapp.com");
            this.f105502c.put("centralized_http_s", "https://ztevents.zaloapp.com");
        } else {
            this.f105502c.put("oauth_http_s", "https://oauth.zaloapp.com");
            this.f105502c.put("graph_http_s", "https://graph.zaloapp.com");
            this.f105502c.put("centralized_http_s", "https://ztevents.zaloapp.com");
        }
    }

    /* renamed from: b */
    public static synchronized C21726b m112130b() {
        C21726b c21726b;
        synchronized (C21726b.class) {
            try {
                if (f105499f == null) {
                    f105499f = new C21726b();
                }
                c21726b = f105499f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c21726b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public void m112131f(String str, String str2, String str3, Context context) {
        C21727c m112133c = m112133c(context);
        m112133c.m112144k(str3);
        m112133c.m112145l(str2);
        m112133c.m112146m(str);
        this.f105502c.put("oauth_http_s", str);
        this.f105502c.put("graph_http_s", str2);
        this.f105502c.put("centralized_http_s", str3);
        long currentTimeMillis = System.currentTimeMillis() + 86400000;
        this.f105500a = currentTimeMillis;
        m112133c.m112143j(currentTimeMillis);
    }

    /* renamed from: g */
    private void m112132g(Context context) {
        C21727c m112133c = m112133c(context);
        String m112142i = m112133c.m112142i();
        String m112141h = m112133c.m112141h();
        String m112140g = m112133c.m112140g();
        if (!TextUtils.isEmpty(m112142i) && !TextUtils.isEmpty(m112141h) && !TextUtils.isEmpty(m112140g)) {
            this.f105502c.put("oauth_http_s", m112142i);
            this.f105502c.put("graph_http_s", m112141h);
            this.f105502c.put("centralized_http_s", m112140g);
        }
    }

    /* renamed from: c */
    public C21727c m112133c(Context context) {
        if (this.f105503d == null) {
            this.f105503d = new C21727c(context);
        }
        return this.f105503d;
    }

    /* renamed from: d */
    public boolean m112134d(Context context) {
        long j11;
        long currentTimeMillis = System.currentTimeMillis();
        C21727c m112133c = m112133c(context);
        if (this.f105500a == -1) {
            if (m112133c.m112139f() != 0) {
                j11 = m112133c.m112139f();
            } else {
                j11 = currentTimeMillis;
            }
            this.f105500a = j11;
        }
        if (currentTimeMillis >= this.f105500a) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public void m112135e(Context context) {
        m112132g(context);
        if (m112134d(context) && !AbstractC18936a.f94464a.booleanValue()) {
            new b(this.f105501b, new a(context)).execute(new Integer[0]);
        }
    }

    /* renamed from: h */
    public String m112136h(String str, String str2) {
        String str3 = (String) this.f105502c.get(str);
        if (str3 == null) {
            AbstractC21254a.m110068j("Url for" + str + "not found");
            return str2;
        }
        if (!str3.endsWith("/") && !str2.startsWith("/")) {
            return str3 + "/" + str2;
        }
        return str3 + str2;
    }
}

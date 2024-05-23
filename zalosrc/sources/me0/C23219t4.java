package me0;

import ag0.AbstractC0837p0;
import am.AbstractC0924m0;
import android.os.SystemClock;
import android.text.TextUtils;
import com.androidquery.util.C3982o;
import com.zing.zalo.MainApplication;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hm0.C20096c;
import ho0.AbstractC20110a;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import mm0.AbstractC23352g;
import org.json.JSONException;
import org.json.JSONObject;
import p248iy.AbstractC20887g;
import p609wh.AbstractC29004d;
import p609wh.C29006e;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: me0.t4 */
/* loaded from: classes.dex */
public final class C23219t4 {
    public static final b Companion = new b(null);

    /* renamed from: j */
    private static final InterfaceC24854k f112496j;

    /* renamed from: a */
    private long f112497a;

    /* renamed from: b */
    private JSONObject f112498b;

    /* renamed from: c */
    private String f112499c;

    /* renamed from: d */
    private String f112500d;

    /* renamed from: e */
    private String f112501e;

    /* renamed from: f */
    private String f112502f;

    /* renamed from: g */
    private final AtomicBoolean f112503g = new AtomicBoolean(false);

    /* renamed from: h */
    private JSONObject f112504h;

    /* renamed from: i */
    private JSONObject f112505i;

    /* renamed from: me0.t4$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f112506q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C23219t4 mo12V4() {
            return new C23219t4();
        }
    }

    /* renamed from: me0.t4$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C23219t4 m119684a() {
            return (C23219t4) C23219t4.f112496j.getValue();
        }
    }

    /* renamed from: me0.t4$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC29004d {

        /* renamed from: a */
        final /* synthetic */ File f112507a;

        /* renamed from: b */
        final /* synthetic */ C23219t4 f112508b;

        /* renamed from: c */
        final /* synthetic */ long f112509c;

        c(File file, C23219t4 c23219t4, long j11) {
            this.f112507a = file;
            this.f112508b = c23219t4;
            this.f112509c = j11;
        }

        @Override // jm0.InterfaceC21299i
        /* renamed from: c */
        public void mo1342c(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            AbstractC20110a.f98889a.mo104551d("download domain mapping error: %s", c20096c);
        }

        @Override // jm0.InterfaceC21299i
        /* renamed from: f */
        public void mo1343f(JSONObject jSONObject) {
            JSONObject m119711b;
            AbstractC19074t.m100208f(jSONObject, "jsonObject");
            try {
                String m122785a = AbstractC23352g.m122785a(this.f112507a);
                C23219t4 c23219t4 = this.f112508b;
                if (AbstractC19074t.m100204b(c23219t4.f112500d, m122785a)) {
                    m119711b = AbstractC23230u4.m119711b(this.f112507a, this.f112508b.f112502f);
                    if (m119711b == null) {
                        AbstractC20110a.f98889a.mo104551d("MappingDomainManager: something wrong from server mapping data - checksum correct -> skip to next update", new Object[0]);
                        AbstractC20887g.m109238p(99979, this.f112509c);
                        AbstractC20887g.m109230h(99979, "MappingDomainManager incorrect data from server");
                    } else {
                        AbstractC20110a.f98889a.mo104548a("MappingDomain load from file download", new Object[0]);
                        this.f112508b.f112505i = m119711b;
                    }
                } else {
                    AbstractC20110a.f98889a.mo104551d("MappingDomainManager: something wrong from server response - checksum incorrect -> skip to next update", new Object[0]);
                    AbstractC20887g.m109238p(99979, this.f112509c);
                    AbstractC20887g.m109230h(99979, "MappingDomainManager incorrect checksum data from server");
                    this.f112507a.delete();
                    m122785a = this.f112508b.f112500d;
                }
                c23219t4.f112499c = m122785a;
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f112506q);
        f112496j = m129210a;
    }

    public C23219t4() {
        C3982o.f15764b.m18866a().m18864e(new C3982o.c() { // from class: me0.r4
            @Override // com.androidquery.util.C3982o.c
            /* renamed from: a */
            public final String mo18858a(String str) {
                String m119668c;
                m119668c = C23219t4.m119668c(C23219t4.this, str);
                return m119668c;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final String m119668c(C23219t4 c23219t4, String str) {
        AbstractC19074t.m100208f(c23219t4, "this$0");
        AbstractC20110a.f98889a.mo104548a("get MappingDomain: " + str, new Object[0]);
        if (str != null && str.length() != 0) {
            if (c23219t4.f112505i == null) {
                c23219t4.m119682o(false);
            }
            JSONObject jSONObject = c23219t4.f112505i;
            if (jSONObject != null) {
                AbstractC19074t.m100205c(jSONObject);
                if (jSONObject.has(str)) {
                    JSONObject jSONObject2 = c23219t4.f112505i;
                    AbstractC19074t.m100205c(jSONObject2);
                    Object obj = jSONObject2.get(str);
                    AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.String");
                    return (String) obj;
                }
            }
            if (c23219t4.f112504h == null) {
                c23219t4.m119680m(AbstractC0924m0.m4189s3());
            }
            JSONObject jSONObject3 = c23219t4.f112504h;
            if (jSONObject3 != null) {
                AbstractC19074t.m100205c(jSONObject3);
                if (jSONObject3.has(str)) {
                    JSONObject jSONObject4 = c23219t4.f112504h;
                    AbstractC19074t.m100205c(jSONObject4);
                    Object obj2 = jSONObject4.get(str);
                    AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type kotlin.String");
                    return (String) obj2;
                }
            }
        }
        return "";
    }

    /* renamed from: i */
    private final synchronized void m119674i(boolean z11) {
        AtomicBoolean atomicBoolean;
        JSONObject m119711b;
        try {
            try {
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
                atomicBoolean = this.f112503g;
            }
            if (!m119678q()) {
                this.f112503g.set(false);
                return;
            }
            if (this.f112503g.get()) {
                this.f112503g.set(false);
                return;
            }
            this.f112503g.set(true);
            if (this.f112498b == null) {
                m119681n(AbstractC0924m0.m4219t3(), false);
            }
            if (this.f112498b != null && !TextUtils.isEmpty(this.f112500d) && !TextUtils.isEmpty(this.f112501e) && !TextUtils.isEmpty(this.f112502f)) {
                File m119676l = m119676l();
                if (m119676l.exists()) {
                    String m122785a = AbstractC23352g.m122785a(m119676l);
                    AbstractC20110a.a aVar = AbstractC20110a.f98889a;
                    aVar.mo104548a("MappingDomain checksum: %s vs %s", m122785a, this.f112500d);
                    if (AbstractC19074t.m100204b(this.f112500d, m122785a)) {
                        JSONObject jSONObject = this.f112498b;
                        AbstractC19074t.m100205c(jSONObject);
                        m119711b = AbstractC23230u4.m119711b(m119676l, jSONObject.getString("aes"));
                        if (m119711b == null) {
                            aVar.mo104551d("MappingDomainManager: something wrong from server data  -> skip to next update", new Object[0]);
                            AbstractC20887g.m109244v(99979, null, 2, null);
                            AbstractC20887g.m109230h(99979, "MappingDomainManager incorrect data from server");
                        } else {
                            aVar.mo104548a("MappingDomain load from file", new Object[0]);
                            this.f112505i = m119711b;
                        }
                        this.f112499c = m122785a;
                        this.f112503g.set(false);
                        return;
                    }
                }
                C29006e c29006e = new C29006e(m119676l, -1L, null, new c(m119676l, this, System.currentTimeMillis()));
                c29006e.m110305c0(99979);
                c29006e.m110314j(this.f112501e, "", new String[0], new String[0]);
                c29006e.f103775r = 0;
                if (!z11 && C23055e5.m118273h(false, 1, null)) {
                    AbstractC20110a.f98889a.mo104548a("MappingDomain download: %s", this.f112501e);
                    c29006e.mo110303Z();
                } else {
                    this.f112497a = 0L;
                }
                atomicBoolean = this.f112503g;
                atomicBoolean.set(false);
                return;
            }
            AbstractC20110a.f98889a.mo104548a("checkAndLoadConfigExt break by empty extConfig", new Object[0]);
            this.f112503g.set(false);
        } catch (Throwable th2) {
            this.f112503g.set(false);
            throw th2;
        }
    }

    /* renamed from: k */
    public static final C23219t4 m119675k() {
        return Companion.m119684a();
    }

    /* renamed from: l */
    private final File m119676l() {
        return new File(MainApplication.Companion.m35500c().getFilesDir(), "domain_mapping_ext.bin");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static final void m119677p(C23219t4 c23219t4, boolean z11) {
        AbstractC19074t.m100208f(c23219t4, "this$0");
        try {
            AbstractC20110a.f98889a.mo104548a("MappingDomain checkAndLoadConfigExt", new Object[0]);
            c23219t4.m119674i(z11);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: q */
    private final boolean m119678q() {
        if (this.f112498b != null && !TextUtils.isEmpty(this.f112500d) && !TextUtils.isEmpty(this.f112501e) && !TextUtils.isEmpty(this.f112502f) && AbstractC19074t.m100204b(this.f112500d, this.f112499c)) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public final void m119679j() {
        try {
            AbstractC20110a.f98889a.mo104548a("MappingDomain config: clearMemoryConditionCache", new Object[0]);
            this.f112498b = null;
            this.f112499c = null;
            this.f112500d = null;
            this.f112501e = null;
            this.f112502f = null;
            this.f112497a = 0L;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: m */
    public final void m119680m(String str) {
        JSONObject jSONObject;
        AbstractC20110a.f98889a.mo104548a("parseBasicMapping: " + str, new Object[0]);
        if (str != null && str.length() != 0) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
                jSONObject = new JSONObject();
            }
        } else {
            jSONObject = new JSONObject();
        }
        this.f112504h = jSONObject;
    }

    /* renamed from: n */
    public final void m119681n(String str, boolean z11) {
        try {
            AbstractC20110a.a aVar = AbstractC20110a.f98889a;
            aVar.mo104548a("MappingDomain config: %s", str);
            if (str != null && str.length() != 0) {
                JSONObject jSONObject = new JSONObject(str);
                this.f112498b = jSONObject;
                AbstractC19074t.m100205c(jSONObject);
                this.f112500d = jSONObject.optString("checksum");
                JSONObject jSONObject2 = this.f112498b;
                AbstractC19074t.m100205c(jSONObject2);
                this.f112501e = jSONObject2.optString(ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                JSONObject jSONObject3 = this.f112498b;
                AbstractC19074t.m100205c(jSONObject3);
                this.f112502f = jSONObject3.optString("aes");
                if (this.f112498b != null && !TextUtils.isEmpty(this.f112500d) && !TextUtils.isEmpty(this.f112501e) && !TextUtils.isEmpty(this.f112502f)) {
                    m119682o(z11);
                    return;
                }
                aVar.mo104548a("checkAndLoadConfigExt break by empty extConfig", new Object[0]);
                this.f112505i = new JSONObject();
                return;
            }
            m119679j();
            this.f112505i = new JSONObject();
        } catch (JSONException e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            m119679j();
        }
    }

    /* renamed from: o */
    public final void m119682o(final boolean z11) {
        if (!m119678q() || this.f112503g.get()) {
            return;
        }
        if (SystemClock.uptimeMillis() - this.f112497a < 300000) {
            AbstractC20110a.f98889a.mo104548a("MappingDomain skip by time", new Object[0]);
        } else {
            this.f112497a = SystemClock.uptimeMillis();
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: me0.s4
                @Override // java.lang.Runnable
                public final void run() {
                    C23219t4.m119677p(C23219t4.this, z11);
                }
            });
        }
    }
}

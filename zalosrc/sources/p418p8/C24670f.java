package p418p8;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import p153f8.C18821f;
import p232i8.AbstractC20395h;
import p232i8.C20406m0;
import p232i8.C20417s;
import p232i8.C20422w;
import p232i8.EnumC20419t;
import p232i8.InterfaceC20415r;
import p342m6.AbstractC22888j;
import p342m6.AbstractC22894m;
import p342m6.C22890k;
import p342m6.InterfaceC22886i;
import p344m8.C22951b;
import p359n8.C23620g;

/* renamed from: p8.f */
/* loaded from: classes.dex */
public class C24670f implements InterfaceC24673i {

    /* renamed from: a */
    private final Context f118602a;

    /* renamed from: b */
    private final C24674j f118603b;

    /* renamed from: c */
    private final C24671g f118604c;

    /* renamed from: d */
    private final InterfaceC20415r f118605d;

    /* renamed from: e */
    private final C24665a f118606e;

    /* renamed from: f */
    private final InterfaceC24675k f118607f;

    /* renamed from: g */
    private final C20417s f118608g;

    /* renamed from: h */
    private final AtomicReference f118609h;

    /* renamed from: i */
    private final AtomicReference f118610i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p8.f$a */
    /* loaded from: classes3.dex */
    public class a implements InterfaceC22886i {
        a() {
        }

        @Override // p342m6.InterfaceC22886i
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC22888j mo33968a(Void r52) {
            JSONObject mo128206a = C24670f.this.f118607f.mo128206a(C24670f.this.f118603b, true);
            if (mo128206a != null) {
                C24668d m128231b = C24670f.this.f118604c.m128231b(mo128206a);
                C24670f.this.f118606e.m128199c(m128231b.f118587c, mo128206a);
                C24670f.this.m128222q(mo128206a, "Loaded settings: ");
                C24670f c24670f = C24670f.this;
                c24670f.m128223r(c24670f.f118603b.f118618f);
                C24670f.this.f118609h.set(m128231b);
                ((C22890k) C24670f.this.f118610i.get()).m117598e(m128231b);
            }
            return AbstractC22894m.m117604f(null);
        }
    }

    C24670f(Context context, C24674j c24674j, InterfaceC20415r interfaceC20415r, C24671g c24671g, C24665a c24665a, InterfaceC24675k interfaceC24675k, C20417s c20417s) {
        AtomicReference atomicReference = new AtomicReference();
        this.f118609h = atomicReference;
        this.f118610i = new AtomicReference(new C22890k());
        this.f118602a = context;
        this.f118603b = c24674j;
        this.f118605d = interfaceC20415r;
        this.f118604c = c24671g;
        this.f118606e = c24665a;
        this.f118607f = interfaceC24675k;
        this.f118608g = c20417s;
        atomicReference.set(C24666b.m128200b(interfaceC20415r));
    }

    /* renamed from: l */
    public static C24670f m128219l(Context context, String str, C20422w c20422w, C22951b c22951b, String str2, String str3, C23620g c23620g, C20417s c20417s) {
        String m106429g = c20422w.m106429g();
        C20406m0 c20406m0 = new C20406m0();
        return new C24670f(context, new C24674j(str, c20422w.m106430h(), c20422w.m106431i(), c20422w.m106432j(), c20422w, AbstractC20395h.m106212h(AbstractC20395h.m106219o(context), str, str3, str2), str3, str2, EnumC20419t.m106412b(m106429g).m106413c()), c20406m0, new C24671g(c20406m0), new C24665a(c23620g), new C24667c(String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", str), c22951b), c20417s);
    }

    /* renamed from: m */
    private C24668d m128220m(EnumC24669e enumC24669e) {
        C24668d c24668d = null;
        try {
            if (!EnumC24669e.SKIP_CACHE_LOOKUP.equals(enumC24669e)) {
                JSONObject m128198b = this.f118606e.m128198b();
                if (m128198b != null) {
                    C24668d m128231b = this.f118604c.m128231b(m128198b);
                    if (m128231b != null) {
                        m128222q(m128198b, "Loaded cached settings: ");
                        long mo106354a = this.f118605d.mo106354a();
                        if (!EnumC24669e.IGNORE_CACHE_EXPIRATION.equals(enumC24669e) && m128231b.m128210a(mo106354a)) {
                            C18821f.m98795f().m98802i("Cached settings have expired.");
                        }
                        try {
                            C18821f.m98795f().m98802i("Returning cached settings.");
                            c24668d = m128231b;
                        } catch (Exception e11) {
                            e = e11;
                            c24668d = m128231b;
                            C18821f.m98795f().m98799e("Failed to get cached settings", e);
                            return c24668d;
                        }
                    } else {
                        C18821f.m98795f().m98799e("Failed to parse cached settings data.", null);
                    }
                } else {
                    C18821f.m98795f().m98796b("No cached settings data found.");
                }
            }
        } catch (Exception e12) {
            e = e12;
        }
        return c24668d;
    }

    /* renamed from: n */
    private String m128221n() {
        return AbstractC20395h.m106223s(this.f118602a).getString("existing_instance_identifier", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public void m128222q(JSONObject jSONObject, String str) {
        C18821f.m98795f().m98796b(str + jSONObject.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public boolean m128223r(String str) {
        SharedPreferences.Editor edit = AbstractC20395h.m106223s(this.f118602a).edit();
        edit.putString("existing_instance_identifier", str);
        edit.apply();
        return true;
    }

    @Override // p418p8.InterfaceC24673i
    /* renamed from: a */
    public AbstractC22888j mo128224a() {
        return ((C22890k) this.f118610i.get()).m117594a();
    }

    @Override // p418p8.InterfaceC24673i
    /* renamed from: b */
    public C24668d mo128225b() {
        return (C24668d) this.f118609h.get();
    }

    /* renamed from: k */
    boolean m128226k() {
        return !m128221n().equals(this.f118603b.f118618f);
    }

    /* renamed from: o */
    public AbstractC22888j m128227o(Executor executor) {
        return m128228p(EnumC24669e.USE_CACHE, executor);
    }

    /* renamed from: p */
    public AbstractC22888j m128228p(EnumC24669e enumC24669e, Executor executor) {
        C24668d m128220m;
        if (!m128226k() && (m128220m = m128220m(enumC24669e)) != null) {
            this.f118609h.set(m128220m);
            ((C22890k) this.f118610i.get()).m117598e(m128220m);
            return AbstractC22894m.m117604f(null);
        }
        C24668d m128220m2 = m128220m(EnumC24669e.IGNORE_CACHE_EXPIRATION);
        if (m128220m2 != null) {
            this.f118609h.set(m128220m2);
            ((C22890k) this.f118610i.get()).m117598e(m128220m2);
        }
        return this.f118608g.m106396j(executor).mo117589r(executor, new a());
    }
}

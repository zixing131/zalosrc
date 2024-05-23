package p232i8;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
import p035b9.InterfaceC2661e;
import p153f8.C18821f;

/* renamed from: i8.w */
/* loaded from: classes.dex */
public class C20422w implements InterfaceC20423x {

    /* renamed from: g */
    private static final Pattern f100584g = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: h */
    private static final String f100585h = Pattern.quote("/");

    /* renamed from: a */
    private final C20424y f100586a;

    /* renamed from: b */
    private final Context f100587b;

    /* renamed from: c */
    private final String f100588c;

    /* renamed from: d */
    private final InterfaceC2661e f100589d;

    /* renamed from: e */
    private final C20417s f100590e;

    /* renamed from: f */
    private String f100591f;

    public C20422w(Context context, String str, InterfaceC2661e interfaceC2661e, C20417s c20417s) {
        if (context != null) {
            if (str != null) {
                this.f100587b = context;
                this.f100588c = str;
                this.f100589d = interfaceC2661e;
                this.f100590e = c20417s;
                this.f100586a = new C20424y();
                return;
            }
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        throw new IllegalArgumentException("appContext must not be null");
    }

    /* renamed from: b */
    private synchronized String m106420b(String str, SharedPreferences sharedPreferences) {
        String m106423e;
        m106423e = m106423e(UUID.randomUUID().toString());
        C18821f.m98795f().m98802i("Created new Crashlytics installation ID: " + m106423e + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", m106423e).putString("firebase.installation.id", str).apply();
        return m106423e;
    }

    /* renamed from: c */
    static String m106421c() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    /* renamed from: d */
    private String m106422d() {
        try {
            return (String) AbstractC20418s0.m106402f(this.f100589d.mo13077f());
        } catch (Exception e11) {
            C18821f.m98795f().m98805l("Failed to retrieve Firebase Installations ID.", e11);
            return null;
        }
    }

    /* renamed from: e */
    private static String m106423e(String str) {
        if (str == null) {
            return null;
        }
        return f100584g.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    /* renamed from: k */
    static boolean m106424k(String str) {
        if (str != null && str.startsWith("SYN_")) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    private String m106425l(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", null);
    }

    /* renamed from: m */
    private String m106426m(String str) {
        return str.replaceAll(f100585h, "");
    }

    @Override // p232i8.InterfaceC20423x
    /* renamed from: a */
    public synchronized String mo106427a() {
        try {
            String str = this.f100591f;
            if (str != null) {
                return str;
            }
            C18821f.m98795f().m98802i("Determining Crashlytics installation ID...");
            SharedPreferences m106223s = AbstractC20395h.m106223s(this.f100587b);
            String string = m106223s.getString("firebase.installation.id", null);
            C18821f.m98795f().m98802i("Cached Firebase Installation ID: " + string);
            if (this.f100590e.m106393d()) {
                String m106422d = m106422d();
                C18821f.m98795f().m98802i("Fetched Firebase Installation ID: " + m106422d);
                if (m106422d == null) {
                    if (string == null) {
                        m106422d = m106421c();
                    } else {
                        m106422d = string;
                    }
                }
                if (m106422d.equals(string)) {
                    this.f100591f = m106425l(m106223s);
                } else {
                    this.f100591f = m106420b(m106422d, m106223s);
                }
            } else if (m106424k(string)) {
                this.f100591f = m106425l(m106223s);
            } else {
                this.f100591f = m106420b(m106421c(), m106223s);
            }
            if (this.f100591f == null) {
                C18821f.m98795f().m98804k("Unable to determine Crashlytics Install Id, creating a new one.");
                this.f100591f = m106420b(m106421c(), m106223s);
            }
            C18821f.m98795f().m98802i("Crashlytics installation ID: " + this.f100591f);
            return this.f100591f;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: f */
    public String m106428f() {
        return this.f100588c;
    }

    /* renamed from: g */
    public String m106429g() {
        return this.f100586a.m106434a(this.f100587b);
    }

    /* renamed from: h */
    public String m106430h() {
        return String.format(Locale.US, "%s/%s", m106426m(Build.MANUFACTURER), m106426m(Build.MODEL));
    }

    /* renamed from: i */
    public String m106431i() {
        return m106426m(Build.VERSION.INCREMENTAL);
    }

    /* renamed from: j */
    public String m106432j() {
        return m106426m(Build.VERSION.RELEASE);
    }
}

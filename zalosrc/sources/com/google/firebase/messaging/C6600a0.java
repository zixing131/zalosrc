package com.google.firebase.messaging;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import androidx.profileinstaller.ExecutorC1852h;
import com.google.firebase.C6576e;
import com.google.firebase.installations.AbstractC6587f;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import p015a9.InterfaceC0662b;
import p035b9.InterfaceC2661e;
import p342m6.AbstractC22888j;
import p342m6.AbstractC22894m;
import p342m6.InterfaceC22874c;
import p521t9.InterfaceC26608i;
import p597w4.C28723a;
import p673y8.InterfaceC30822j;

/* renamed from: com.google.firebase.messaging.a0 */
/* loaded from: classes.dex */
public class C6600a0 {

    /* renamed from: a */
    private final C6576e f36615a;

    /* renamed from: b */
    private final C6615f0 f36616b;

    /* renamed from: c */
    private final C28723a f36617c;

    /* renamed from: d */
    private final InterfaceC0662b f36618d;

    /* renamed from: e */
    private final InterfaceC0662b f36619e;

    /* renamed from: f */
    private final InterfaceC2661e f36620f;

    public C6600a0(C6576e c6576e, C6615f0 c6615f0, InterfaceC0662b interfaceC0662b, InterfaceC0662b interfaceC0662b2, InterfaceC2661e interfaceC2661e) {
        this(c6576e, c6615f0, new C28723a(c6576e.m33612j()), interfaceC0662b, interfaceC0662b2, interfaceC2661e);
    }

    /* renamed from: b */
    private static String m33761b(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    /* renamed from: d */
    private AbstractC22888j m33762d(AbstractC22888j abstractC22888j) {
        return abstractC22888j.mo117579h(new ExecutorC1852h(), new InterfaceC22874c() { // from class: com.google.firebase.messaging.z
            public /* synthetic */ C6656z() {
            }

            @Override // p342m6.InterfaceC22874c
            /* renamed from: a */
            public final Object mo27439a(AbstractC22888j abstractC22888j2) {
                String m33766i;
                m33766i = C6600a0.this.m33766i(abstractC22888j2);
                return m33766i;
            }
        });
    }

    /* renamed from: e */
    private String m33763e() {
        try {
            return m33761b(MessageDigest.getInstance("SHA-1").digest(this.f36615a.m33613l().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    /* renamed from: g */
    private String m33764g(Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString(ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
            if (!"RST".equals(string3)) {
                if (string3 != null) {
                    throw new IOException(string3);
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unexpected response: ");
                sb2.append(bundle);
                new Throwable();
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
            throw new IOException("INSTANCE_ID_RESET");
        }
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    /* renamed from: h */
    public static boolean m33765h(String str) {
        if (!"SERVICE_NOT_AVAILABLE".equals(str) && !"INTERNAL_SERVER_ERROR".equals(str) && !"InternalServerError".equals(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public /* synthetic */ String m33766i(AbstractC22888j abstractC22888j) {
        return m33764g((Bundle) abstractC22888j.mo117585n(IOException.class));
    }

    /* renamed from: j */
    private void m33767j(String str, String str2, Bundle bundle) {
        InterfaceC30822j.a mo149904b;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        bundle.putString("gmp_app_id", this.f36615a.m33614m().m33680c());
        bundle.putString("gmsv", Integer.toString(this.f36616b.m33853d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f36616b.m33851a());
        bundle.putString("app_ver_name", this.f36616b.m33852b());
        bundle.putString("firebase-app-name-hash", m33763e());
        try {
            String mo33627b = ((AbstractC6587f) AbstractC22894m.m117599a(this.f36620f.mo13076a(false))).mo33627b();
            if (!TextUtils.isEmpty(mo33627b)) {
                bundle.putString("Goog-Firebase-Installations-Auth", mo33627b);
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
        bundle.putString("appid", (String) AbstractC22894m.m117599a(this.f36620f.mo13077f()));
        bundle.putString("cliv", "fcm-23.1.2");
        InterfaceC30822j interfaceC30822j = (InterfaceC30822j) this.f36619e.get();
        InterfaceC26608i interfaceC26608i = (InterfaceC26608i) this.f36618d.get();
        if (interfaceC30822j != null && interfaceC26608i != null && (mo149904b = interfaceC30822j.mo149904b("fire-iid")) != InterfaceC30822j.a.NONE) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(mo149904b.m149907b()));
            bundle.putString("Firebase-Client", interfaceC26608i.mo136561a());
        }
    }

    /* renamed from: k */
    private AbstractC22888j m33768k(String str, String str2, Bundle bundle) {
        try {
            m33767j(str, str2, bundle);
            return this.f36617c.m143862a(bundle);
        } catch (InterruptedException | ExecutionException e11) {
            return AbstractC22894m.m117603e(e11);
        }
    }

    /* renamed from: c */
    public AbstractC22888j m33769c() {
        Bundle bundle = new Bundle();
        bundle.putString("delete", "1");
        return m33762d(m33768k(C6615f0.m33848c(this.f36615a), "*", bundle));
    }

    /* renamed from: f */
    public AbstractC22888j m33770f() {
        return m33762d(m33768k(C6615f0.m33848c(this.f36615a), "*", new Bundle()));
    }

    /* renamed from: l */
    public AbstractC22888j m33771l(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        return m33762d(m33768k(str, "/topics/" + str2, bundle));
    }

    /* renamed from: m */
    public AbstractC22888j m33772m(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        bundle.putString("delete", "1");
        return m33762d(m33768k(str, "/topics/" + str2, bundle));
    }

    C6600a0(C6576e c6576e, C6615f0 c6615f0, C28723a c28723a, InterfaceC0662b interfaceC0662b, InterfaceC0662b interfaceC0662b2, InterfaceC2661e interfaceC2661e) {
        this.f36615a = c6576e;
        this.f36616b = c6615f0;
        this.f36617c = c28723a;
        this.f36618d = interfaceC0662b;
        this.f36619e = interfaceC0662b2;
        this.f36620f = interfaceC2661e;
    }
}

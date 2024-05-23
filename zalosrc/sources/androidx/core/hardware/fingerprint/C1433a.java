package androidx.core.hardware.fingerprint;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.os.C1439e;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* renamed from: androidx.core.hardware.fingerprint.a */
/* loaded from: classes2.dex */
public class C1433a {

    /* renamed from: a */
    private final Context f6260a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.hardware.fingerprint.a$a */
    /* loaded from: classes2.dex */
    public class a extends FingerprintManager.AuthenticationCallback {

        /* renamed from: a */
        final /* synthetic */ c f6261a;

        a(c cVar) {
            this.f6261a = cVar;
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationError(int i11, CharSequence charSequence) {
            this.f6261a.mo7324a(i11, charSequence);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationFailed() {
            this.f6261a.mo7325b();
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationHelp(int i11, CharSequence charSequence) {
            this.f6261a.mo7326c(i11, charSequence);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
            this.f6261a.mo7327d(new d(C1433a.m7311f(b.m7318b(authenticationResult))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.hardware.fingerprint.a$b */
    /* loaded from: classes2.dex */
    public static class b {
        /* renamed from: a */
        static void m7317a(Object obj, Object obj2, CancellationSignal cancellationSignal, int i11, Object obj3, Handler handler) {
            ((FingerprintManager) obj).authenticate((FingerprintManager.CryptoObject) obj2, cancellationSignal, i11, (FingerprintManager.AuthenticationCallback) obj3, handler);
        }

        /* renamed from: b */
        static FingerprintManager.CryptoObject m7318b(Object obj) {
            return ((FingerprintManager.AuthenticationResult) obj).getCryptoObject();
        }

        /* renamed from: c */
        public static FingerprintManager m7319c(Context context) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 == 23) {
                return (FingerprintManager) context.getSystemService(FingerprintManager.class);
            }
            if (i11 > 23 && context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
                return (FingerprintManager) context.getSystemService(FingerprintManager.class);
            }
            return null;
        }

        /* renamed from: d */
        static boolean m7320d(Object obj) {
            return ((FingerprintManager) obj).hasEnrolledFingerprints();
        }

        /* renamed from: e */
        static boolean m7321e(Object obj) {
            return ((FingerprintManager) obj).isHardwareDetected();
        }

        /* renamed from: f */
        public static e m7322f(Object obj) {
            FingerprintManager.CryptoObject cryptoObject = (FingerprintManager.CryptoObject) obj;
            if (cryptoObject == null) {
                return null;
            }
            if (cryptoObject.getCipher() != null) {
                return new e(cryptoObject.getCipher());
            }
            if (cryptoObject.getSignature() != null) {
                return new e(cryptoObject.getSignature());
            }
            if (cryptoObject.getMac() == null) {
                return null;
            }
            return new e(cryptoObject.getMac());
        }

        /* renamed from: g */
        public static FingerprintManager.CryptoObject m7323g(e eVar) {
            if (eVar == null) {
                return null;
            }
            if (eVar.m7329a() != null) {
                return new FingerprintManager.CryptoObject(eVar.m7329a());
            }
            if (eVar.m7331c() != null) {
                return new FingerprintManager.CryptoObject(eVar.m7331c());
            }
            if (eVar.m7330b() == null) {
                return null;
            }
            return new FingerprintManager.CryptoObject(eVar.m7330b());
        }
    }

    /* renamed from: androidx.core.hardware.fingerprint.a$c */
    /* loaded from: classes2.dex */
    public static abstract class c {
        /* renamed from: a */
        public abstract void mo7324a(int i11, CharSequence charSequence);

        /* renamed from: b */
        public abstract void mo7325b();

        /* renamed from: c */
        public abstract void mo7326c(int i11, CharSequence charSequence);

        /* renamed from: d */
        public abstract void mo7327d(d dVar);
    }

    /* renamed from: androidx.core.hardware.fingerprint.a$d */
    /* loaded from: classes2.dex */
    public static final class d {

        /* renamed from: a */
        private final e f6262a;

        public d(e eVar) {
            this.f6262a = eVar;
        }

        /* renamed from: a */
        public e m7328a() {
            return this.f6262a;
        }
    }

    /* renamed from: androidx.core.hardware.fingerprint.a$e */
    /* loaded from: classes2.dex */
    public static class e {

        /* renamed from: a */
        private final Signature f6263a;

        /* renamed from: b */
        private final Cipher f6264b;

        /* renamed from: c */
        private final Mac f6265c;

        public e(Signature signature) {
            this.f6263a = signature;
            this.f6264b = null;
            this.f6265c = null;
        }

        /* renamed from: a */
        public Cipher m7329a() {
            return this.f6264b;
        }

        /* renamed from: b */
        public Mac m7330b() {
            return this.f6265c;
        }

        /* renamed from: c */
        public Signature m7331c() {
            return this.f6263a;
        }

        public e(Cipher cipher) {
            this.f6264b = cipher;
            this.f6263a = null;
            this.f6265c = null;
        }

        public e(Mac mac) {
            this.f6265c = mac;
            this.f6264b = null;
            this.f6263a = null;
        }
    }

    private C1433a(Context context) {
        this.f6260a = context;
    }

    /* renamed from: b */
    public static C1433a m7309b(Context context) {
        return new C1433a(context);
    }

    /* renamed from: c */
    private static FingerprintManager m7310c(Context context) {
        return b.m7319c(context);
    }

    /* renamed from: f */
    static e m7311f(FingerprintManager.CryptoObject cryptoObject) {
        return b.m7322f(cryptoObject);
    }

    /* renamed from: g */
    private static FingerprintManager.AuthenticationCallback m7312g(c cVar) {
        return new a(cVar);
    }

    /* renamed from: h */
    private static FingerprintManager.CryptoObject m7313h(e eVar) {
        return b.m7323g(eVar);
    }

    /* renamed from: a */
    public void m7314a(e eVar, int i11, C1439e c1439e, c cVar, Handler handler) {
        FingerprintManager m7310c;
        CancellationSignal cancellationSignal;
        if (Build.VERSION.SDK_INT >= 23 && (m7310c = m7310c(this.f6260a)) != null) {
            if (c1439e != null) {
                cancellationSignal = (CancellationSignal) c1439e.m7343b();
            } else {
                cancellationSignal = null;
            }
            b.m7317a(m7310c, m7313h(eVar), cancellationSignal, i11, m7312g(cVar), handler);
        }
    }

    /* renamed from: d */
    public boolean m7315d() {
        FingerprintManager m7310c;
        if (Build.VERSION.SDK_INT < 23 || (m7310c = m7310c(this.f6260a)) == null || !b.m7320d(m7310c)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public boolean m7316e() {
        FingerprintManager m7310c;
        if (Build.VERSION.SDK_INT < 23 || (m7310c = m7310c(this.f6260a)) == null || !b.m7321e(m7310c)) {
            return false;
        }
        return true;
    }
}

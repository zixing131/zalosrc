package com.zing.zalo.biometric;

import android.content.Context;
import android.content.DialogInterface;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.text.TextUtils;
import com.zing.zalo.biometric.BiometricWrapper;
import com.zing.zalo.biometric.C7324e0;
import java.security.Signature;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import mm0.AbstractC23350e;

/* renamed from: com.zing.zalo.biometric.e0 */
/* loaded from: classes3.dex */
public class C7324e0 implements InterfaceC7352s0 {

    /* renamed from: a */
    private CancellationSignal f40066a;

    /* renamed from: b */
    private BiometricPrompt f40067b;

    /* renamed from: c */
    private BiometricWrapper.AbstractC7309a f40068c;

    /* renamed from: d */
    private Executor f40069d;

    /* renamed from: e */
    private Context f40070e;

    /* renamed from: f */
    private BiometricWrapper.C7312d f40071f;

    /* renamed from: g */
    private CharSequence f40072g;

    /* renamed from: h */
    final BiometricPrompt.AuthenticationCallback f40073h = new a();

    /* renamed from: i */
    private final DialogInterface.OnClickListener f40074i = new b();

    /* renamed from: j */
    private final DialogInterface.OnClickListener f40075j = new c();

    /* renamed from: com.zing.zalo.biometric.e0$a */
    /* loaded from: classes3.dex */
    public class a extends BiometricPrompt.AuthenticationCallback {
        a() {
        }

        /* renamed from: d */
        public /* synthetic */ void m37328d(int i11, CharSequence charSequence) {
            C7324e0.this.f40068c.mo37276a(i11, charSequence);
        }

        /* renamed from: e */
        public /* synthetic */ void m37329e() {
            C7324e0.this.f40068c.mo37277b();
        }

        /* renamed from: f */
        public /* synthetic */ void m37330f(BiometricWrapper.C7310b c7310b) {
            C7324e0.this.f40068c.mo37278c(c7310b);
        }

        @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
        public void onAuthenticationError(int i11, CharSequence charSequence) {
            C7324e0.this.f40069d.execute(new Runnable() { // from class: com.zing.zalo.biometric.c0

                /* renamed from: q */
                public final /* synthetic */ int f40060q;

                /* renamed from: r */
                public final /* synthetic */ CharSequence f40061r;

                public /* synthetic */ RunnableC7320c0(int i112, CharSequence charSequence2) {
                    r2 = i112;
                    r3 = charSequence2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C7324e0.a.this.m37328d(r2, r3);
                }
            });
        }

        @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
        public void onAuthenticationFailed() {
            if (C7324e0.this.f40071f.m37290i()) {
                AbstractC7318b1.m37303a(C7324e0.this.f40070e);
            }
            C7324e0.this.f40069d.execute(new Runnable() { // from class: com.zing.zalo.biometric.b0
                public /* synthetic */ RunnableC7317b0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C7324e0.a.this.m37329e();
                }
            });
        }

        @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
        public void onAuthenticationHelp(int i11, CharSequence charSequence) {
        }

        @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
        public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
            BiometricWrapper.C7310b c7310b;
            BiometricPrompt.CryptoObject cryptoObject;
            if (authenticationResult != null) {
                cryptoObject = authenticationResult.getCryptoObject();
                c7310b = new BiometricWrapper.C7310b(C7324e0.m37321l(cryptoObject));
            } else {
                c7310b = new BiometricWrapper.C7310b(null);
            }
            C7324e0.this.f40069d.execute(new Runnable() { // from class: com.zing.zalo.biometric.d0

                /* renamed from: q */
                public final /* synthetic */ BiometricWrapper.C7310b f40065q;

                public /* synthetic */ RunnableC7322d0(BiometricWrapper.C7310b c7310b2) {
                    r2 = c7310b2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C7324e0.a.this.m37330f(r2);
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.biometric.e0$b */
    /* loaded from: classes3.dex */
    public class b implements DialogInterface.OnClickListener {
        b() {
        }

        /* renamed from: b */
        public /* synthetic */ void m37332b() {
            C7324e0.this.f40068c.mo37276a(10, C7324e0.this.f40070e.getString(AbstractC7362x0.fingerprint_generic_error_user_canceled));
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i11) {
            C7324e0.this.cancel();
            C7324e0.this.f40069d.execute(new Runnable() { // from class: com.zing.zalo.biometric.f0
                public /* synthetic */ RunnableC7326f0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C7324e0.b.this.m37332b();
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.biometric.e0$c */
    /* loaded from: classes3.dex */
    public class c implements DialogInterface.OnClickListener {
        c() {
        }

        /* renamed from: b */
        public /* synthetic */ void m37334b() {
            C7324e0.this.f40068c.mo37276a(10, C7324e0.this.f40070e.getString(AbstractC7362x0.fingerprint_generic_error_user_canceled));
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i11) {
            if (i11 == -2) {
                C7324e0.this.cancel();
                C7324e0.this.f40069d.execute(new Runnable() { // from class: com.zing.zalo.biometric.g0
                    public /* synthetic */ RunnableC7328g0() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C7324e0.c.this.m37334b();
                    }
                });
            }
        }
    }

    public C7324e0(BiometricWrapper.C7312d c7312d, Context context, Executor executor, BiometricWrapper.AbstractC7309a abstractC7309a) {
        this.f40070e = context;
        this.f40069d = executor;
        this.f40068c = abstractC7309a;
        this.f40071f = c7312d;
    }

    /* renamed from: j */
    public /* synthetic */ void m37319j(Cipher cipher) {
        try {
            this.f40066a = new CancellationSignal();
            this.f40067b.authenticate(m37322m(new BiometricWrapper.C7311c(cipher)), this.f40066a, this.f40069d, this.f40073h);
        } catch (Exception unused) {
        }
    }

    /* renamed from: k */
    public /* synthetic */ void m37320k() {
        try {
            CancellationSignal cancellationSignal = new CancellationSignal();
            this.f40066a = cancellationSignal;
            this.f40067b.authenticate(cancellationSignal, this.f40069d, this.f40073h);
        } catch (Exception unused) {
        }
    }

    /* renamed from: l */
    public static BiometricWrapper.C7311c m37321l(BiometricPrompt.CryptoObject cryptoObject) {
        Cipher cipher;
        Signature signature;
        Mac mac;
        Mac mac2;
        Signature signature2;
        Cipher cipher2;
        if (cryptoObject == null) {
            return null;
        }
        cipher = cryptoObject.getCipher();
        if (cipher != null) {
            cipher2 = cryptoObject.getCipher();
            return new BiometricWrapper.C7311c(cipher2);
        }
        signature = cryptoObject.getSignature();
        if (signature != null) {
            signature2 = cryptoObject.getSignature();
            return new BiometricWrapper.C7311c(signature2);
        }
        mac = cryptoObject.getMac();
        if (mac != null) {
            mac2 = cryptoObject.getMac();
            return new BiometricWrapper.C7311c(mac2);
        }
        return null;
    }

    /* renamed from: m */
    private static BiometricPrompt.CryptoObject m37322m(BiometricWrapper.C7311c c7311c) {
        if (c7311c == null) {
            return null;
        }
        if (c7311c.m37279a() != null) {
            AbstractC7333j.m37339a();
            return AbstractC7327g.m37336a(c7311c.m37279a());
        }
        if (c7311c.m37281c() != null) {
            AbstractC7333j.m37339a();
            return AbstractC7329h.m37337a(c7311c.m37281c());
        }
        if (c7311c.m37280b() == null) {
            return null;
        }
        AbstractC7333j.m37339a();
        return AbstractC7331i.m37338a(c7311c.m37280b());
    }

    @Override // com.zing.zalo.biometric.InterfaceC7352s0
    /* renamed from: a */
    public void mo37323a(Cipher cipher) {
        BiometricPrompt.Builder title;
        BiometricPrompt.Builder subtitle;
        BiometricPrompt build;
        AbstractC7361x.m37397a();
        BiometricPrompt.Builder m37396a = AbstractC7359w.m37396a(this.f40070e);
        Bundle m37283b = this.f40071f.m37283b();
        if (m37283b != null) {
            title = m37396a.setTitle(this.f40071f.m37287f());
            subtitle = title.setSubtitle(this.f40071f.m37286e());
            subtitle.setDescription(this.f40071f.m37284c());
            boolean m37289h = this.f40071f.m37289h();
            CharSequence m37285d = this.f40071f.m37285d();
            this.f40072g = m37285d;
            if (m37289h) {
                if (Build.VERSION.SDK_INT >= 30) {
                    m37396a.setAllowedAuthenticators(32768);
                }
            } else if (!TextUtils.isEmpty(m37285d)) {
                m37396a.setNegativeButton(this.f40072g, this.f40069d, this.f40074i);
            } else {
                String string = this.f40070e.getString(AbstractC7362x0.fingerprint_close);
                this.f40072g = string;
                m37396a.setNegativeButton(string, this.f40069d, this.f40075j);
            }
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 29) {
                m37396a.setConfirmationRequired(m37283b.getBoolean("require_confirmation", true));
                m37396a.setDeviceCredentialAllowed(m37289h);
            }
            if (this.f40071f.m37288g()) {
                int m37282a = this.f40071f.m37282a();
                if (i11 > 29) {
                    m37396a.setAllowedAuthenticators(m37282a);
                } else if (m37282a != 32768 && m37282a != 32783) {
                    AbstractC23350e.m122774d("BiometricPrompt", "isFromAndroid10ToLower ");
                }
            }
            build = m37396a.build();
            this.f40067b = build;
            if (cipher != null) {
                this.f40069d.execute(new Runnable() { // from class: com.zing.zalo.biometric.y

                    /* renamed from: q */
                    public final /* synthetic */ Cipher f40121q;

                    public /* synthetic */ RunnableC7363y(Cipher cipher2) {
                        r2 = cipher2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C7324e0.this.m37319j(r2);
                    }
                });
            } else {
                this.f40069d.execute(new Runnable() { // from class: com.zing.zalo.biometric.z
                    public /* synthetic */ RunnableC7365z() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C7324e0.this.m37320k();
                    }
                });
            }
        }
    }

    @Override // com.zing.zalo.biometric.InterfaceC7352s0
    /* renamed from: b */
    public void mo37324b(int i11) {
    }

    @Override // com.zing.zalo.biometric.InterfaceC7352s0
    public void cancel() {
        CancellationSignal cancellationSignal = this.f40066a;
        if (cancellationSignal != null) {
            cancellationSignal.cancel();
            this.f40066a = null;
        }
    }
}

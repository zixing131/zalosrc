package com.zing.zalo.biometric;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1785o;
import androidx.lifecycle.InterfaceC1766e0;
import androidx.lifecycle.InterfaceC1799v;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import java.security.Signature;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* loaded from: classes3.dex */
public class BiometricWrapper {

    /* renamed from: a */
    private Executor f40046a;

    /* renamed from: b */
    private AbstractC7309a f40047b;

    /* renamed from: c */
    private Context f40048c;

    /* renamed from: d */
    private InterfaceC7352s0 f40049d;

    /* renamed from: e */
    public final InterfaceC1799v f40050e = new InterfaceC1799v() { // from class: com.zing.zalo.biometric.BiometricWrapper.1
        @InterfaceC1766e0(AbstractC1785o.a.ON_PAUSE)
        void onPause() {
            BiometricWrapper.this.m37274c();
        }

        @InterfaceC1766e0(AbstractC1785o.a.ON_RESUME)
        void onResume() {
            BiometricWrapper.this.m37274c();
        }
    };

    /* renamed from: com.zing.zalo.biometric.BiometricWrapper$a */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC7309a {
        /* renamed from: a */
        public void mo37276a(int i11, CharSequence charSequence) {
        }

        /* renamed from: b */
        public void mo37277b() {
        }

        /* renamed from: c */
        public void mo37278c(C7310b c7310b) {
        }
    }

    /* renamed from: com.zing.zalo.biometric.BiometricWrapper$b */
    /* loaded from: classes3.dex */
    public static class C7310b {

        /* renamed from: a */
        private final C7311c f40052a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C7310b(C7311c c7311c) {
            this.f40052a = c7311c;
        }
    }

    /* renamed from: com.zing.zalo.biometric.BiometricWrapper$c */
    /* loaded from: classes3.dex */
    public static class C7311c {

        /* renamed from: a */
        private final Signature f40053a;

        /* renamed from: b */
        private final Cipher f40054b;

        /* renamed from: c */
        private final Mac f40055c;

        public C7311c(Signature signature) {
            this.f40053a = signature;
            this.f40054b = null;
            this.f40055c = null;
        }

        /* renamed from: a */
        public Cipher m37279a() {
            return this.f40054b;
        }

        /* renamed from: b */
        public Mac m37280b() {
            return this.f40055c;
        }

        /* renamed from: c */
        public Signature m37281c() {
            return this.f40053a;
        }

        public C7311c(Cipher cipher) {
            this.f40054b = cipher;
            this.f40053a = null;
            this.f40055c = null;
        }

        public C7311c(Mac mac) {
            this.f40055c = mac;
            this.f40054b = null;
            this.f40053a = null;
        }
    }

    /* renamed from: com.zing.zalo.biometric.BiometricWrapper$d */
    /* loaded from: classes3.dex */
    public static class C7312d {

        /* renamed from: a */
        private Bundle f40056a;

        /* renamed from: com.zing.zalo.biometric.BiometricWrapper$d$a */
        /* loaded from: classes3.dex */
        public static class a {

            /* renamed from: a */
            private final Bundle f40057a = new Bundle();

            /* renamed from: a */
            public C7312d m37291a() {
                CharSequence charSequence = this.f40057a.getCharSequence("title");
                CharSequence charSequence2 = this.f40057a.getCharSequence("negative_text");
                boolean z11 = this.f40057a.getBoolean("allow_device_credential");
                boolean z12 = this.f40057a.getBoolean("handling_device_credential_result");
                if (!TextUtils.isEmpty(charSequence)) {
                    if (TextUtils.isEmpty(charSequence2) && !z11) {
                        throw new IllegalArgumentException("Negative text must be set and non-empty");
                    }
                    if (!TextUtils.isEmpty(charSequence2) && z11) {
                        throw new IllegalArgumentException("Can't have both negative button behavior and device credential enabled");
                    }
                    if (z12 && !z11) {
                        throw new IllegalArgumentException("Can't be handling device credential result without device credential enabled");
                    }
                    return new C7312d(this.f40057a);
                }
                throw new IllegalArgumentException("Title must be set and non-empty");
            }

            /* renamed from: b */
            public a m37292b(int i11) {
                this.f40057a.putInt("authenticator", i11);
                return this;
            }

            /* renamed from: c */
            public a m37293c(boolean z11) {
                this.f40057a.putBoolean("require_confirmation", z11);
                return this;
            }

            /* renamed from: d */
            public a m37294d(CharSequence charSequence) {
                this.f40057a.putCharSequence("description", charSequence);
                return this;
            }

            /* renamed from: e */
            public a m37295e(boolean z11) {
                this.f40057a.putBoolean("allow_device_credential", z11);
                return this;
            }

            /* renamed from: f */
            public a m37296f(CharSequence charSequence) {
                this.f40057a.putCharSequence("negative_text", charSequence);
                return this;
            }

            /* renamed from: g */
            public a m37297g(CharSequence charSequence) {
                this.f40057a.putCharSequence("title", charSequence);
                return this;
            }

            /* renamed from: h */
            public a m37298h(boolean z11) {
                this.f40057a.putBoolean("vibrate", z11);
                return this;
            }
        }

        C7312d(Bundle bundle) {
            this.f40056a = bundle;
        }

        /* renamed from: a */
        public int m37282a() {
            return this.f40056a.getInt("authenticator");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public Bundle m37283b() {
            return this.f40056a;
        }

        /* renamed from: c */
        public CharSequence m37284c() {
            return this.f40056a.getCharSequence("description");
        }

        /* renamed from: d */
        public CharSequence m37285d() {
            return this.f40056a.getCharSequence("negative_text");
        }

        /* renamed from: e */
        public CharSequence m37286e() {
            return this.f40056a.getCharSequence(ZMediaPlayer.OPTION_PLAYER_KEY_SUBTITLE);
        }

        /* renamed from: f */
        public CharSequence m37287f() {
            return this.f40056a.getCharSequence("title");
        }

        /* renamed from: g */
        public boolean m37288g() {
            if (m37282a() != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: h */
        public boolean m37289h() {
            return this.f40056a.getBoolean("allow_device_credential");
        }

        /* renamed from: i */
        public boolean m37290i() {
            return this.f40056a.getBoolean("vibrate");
        }
    }

    public BiometricWrapper(Context context, Executor executor, AbstractC7309a abstractC7309a) {
        if (context != null) {
            if (executor != null) {
                if (abstractC7309a != null) {
                    this.f40048c = context;
                    this.f40046a = executor;
                    this.f40047b = abstractC7309a;
                    return;
                }
                throw new IllegalArgumentException("AuthenticationCallback must not be null");
            }
            throw new IllegalArgumentException("Executor must not be null");
        }
        throw new IllegalArgumentException("Context must not be null");
    }

    /* renamed from: b */
    private boolean m37272b() {
        return Build.VERSION.SDK_INT >= 28;
    }

    /* renamed from: a */
    public void m37273a(C7312d c7312d, Cipher cipher, boolean z11) {
        if (!z11 && m37272b()) {
            this.f40049d = new C7324e0(c7312d, this.f40048c, this.f40046a, this.f40047b);
        } else {
            this.f40049d = new C7350r0(c7312d, this.f40048c, this.f40046a, this.f40047b);
        }
        this.f40049d.mo37323a(cipher);
    }

    /* renamed from: c */
    public void m37274c() {
        InterfaceC7352s0 interfaceC7352s0 = this.f40049d;
        if (interfaceC7352s0 != null) {
            interfaceC7352s0.mo37324b(0);
            this.f40049d.cancel();
            this.f40049d = null;
        }
    }

    /* renamed from: d */
    public void m37275d(AbstractC1785o abstractC1785o) {
        abstractC1785o.mo9335a(this.f40050e);
    }
}

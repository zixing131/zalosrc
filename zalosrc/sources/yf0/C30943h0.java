package yf0;

import android.content.Context;
import androidx.core.content.AbstractC1388a;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.biometric.BiometricWrapper;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import java.util.concurrent.Executor;
import me0.AbstractC23136l9;
import org.json.JSONObject;
import p542ub.InterfaceC27218a;

/* renamed from: yf0.h0 */
/* loaded from: classes5.dex */
public final class C30943h0 {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final InterfaceC27218a f142828a;

    /* renamed from: b */
    private final String f142829b;

    /* renamed from: c */
    private final JSONObject f142830c;

    /* renamed from: d */
    private final InterfaceC30928a f142831d;

    /* renamed from: e */
    private BiometricWrapper f142832e;

    /* renamed from: f */
    private Context f142833f;

    /* renamed from: g */
    private Executor f142834g;

    /* renamed from: h */
    private int f142835h;

    /* renamed from: yf0.h0$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: yf0.h0$b */
    /* loaded from: classes5.dex */
    public static final class b extends BiometricWrapper.AbstractC7309a {
        b() {
        }

        @Override // com.zing.zalo.biometric.BiometricWrapper.AbstractC7309a
        /* renamed from: a */
        public void mo37276a(int i11, CharSequence charSequence) {
            super.mo37276a(i11, charSequence);
            if (i11 != 5) {
                if (i11 != 7 && i11 != 9) {
                    if (i11 != 10) {
                        InterfaceC30928a m150498h = C30943h0.this.m150498h();
                        C30943h0 c30943h0 = C30943h0.this;
                        m150498h.mo144679c(i11, m150498h.mo144678b(i11, String.valueOf(charSequence), c30943h0.m150497g()), c30943h0.m150499i());
                    }
                } else {
                    InterfaceC30928a m150498h2 = C30943h0.this.m150498h();
                    C30943h0 c30943h02 = C30943h0.this;
                    m150498h2.mo144679c(-108, m150498h2.mo144678b(-108, "Biometry is locked because there were too many failed attempts", c30943h02.m150497g()), c30943h02.m150499i());
                }
                C30943h0.this.f142835h = 0;
            }
            if (C30943h0.this.f142835h < 3) {
                InterfaceC30928a m150498h3 = C30943h0.this.m150498h();
                C30943h0 c30943h03 = C30943h0.this;
                m150498h3.mo144679c(-102, m150498h3.mo144678b(-102, "User cancel authentication", c30943h03.m150497g()), c30943h03.m150499i());
            }
            C30943h0.this.f142835h = 0;
        }

        @Override // com.zing.zalo.biometric.BiometricWrapper.AbstractC7309a
        /* renamed from: b */
        public void mo37277b() {
            super.mo37277b();
            C30943h0.this.f142835h++;
            if (C30943h0.this.f142835h >= 3) {
                InterfaceC30928a m150498h = C30943h0.this.m150498h();
                C30943h0 c30943h0 = C30943h0.this;
                m150498h.mo144679c(-101, m150498h.mo144678b(-101, "Authentication failed 3 times", c30943h0.m150497g()), c30943h0.m150499i());
                BiometricWrapper biometricWrapper = C30943h0.this.f142832e;
                if (biometricWrapper != null) {
                    biometricWrapper.m37274c();
                }
            }
        }

        @Override // com.zing.zalo.biometric.BiometricWrapper.AbstractC7309a
        /* renamed from: c */
        public void mo37278c(BiometricWrapper.C7310b c7310b) {
            AbstractC19074t.m100208f(c7310b, "authenticationResult");
            super.mo37278c(c7310b);
            InterfaceC30928a m150498h = C30943h0.this.m150498h();
            C30943h0 c30943h0 = C30943h0.this;
            m150498h.mo144679c(1, m150498h.mo144677a(c30943h0.m150497g(), c30943h0.m150499i().toString()), c30943h0.m150499i());
            C30943h0.this.f142835h = 0;
        }
    }

    public C30943h0(InterfaceC27218a interfaceC27218a, String str, JSONObject jSONObject, InterfaceC30928a interfaceC30928a) {
        AbstractC19074t.m100208f(interfaceC27218a, "activity");
        AbstractC19074t.m100208f(str, "action");
        AbstractC19074t.m100208f(jSONObject, "data");
        AbstractC19074t.m100208f(interfaceC30928a, "biometricListener");
        this.f142828a = interfaceC27218a;
        this.f142829b = str;
        this.f142830c = jSONObject;
        this.f142831d = interfaceC30928a;
        Context context = interfaceC27218a.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        this.f142833f = context;
        Executor m6967i = AbstractC1388a.m6967i(context);
        AbstractC19074t.m100207e(m6967i, "getMainExecutor(...)");
        this.f142834g = m6967i;
    }

    /* renamed from: e */
    private final void m150495e(BiometricWrapper.C7312d.a aVar) {
        AbstractC19444a.m101697e(new Runnable() { // from class: yf0.g0

            /* renamed from: q */
            public final /* synthetic */ BiometricWrapper.C7312d.a f142827q;

            public /* synthetic */ RunnableC30941g0(BiometricWrapper.C7312d.a aVar2) {
                r2 = aVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C30943h0.m150496f(C30943h0.this, r2);
            }
        });
    }

    /* renamed from: f */
    public static final void m150496f(C30943h0 c30943h0, BiometricWrapper.C7312d.a aVar) {
        AbstractC19074t.m100208f(c30943h0, "this$0");
        AbstractC19074t.m100208f(aVar, "$promptInfo");
        BiometricWrapper biometricWrapper = c30943h0.f142832e;
        if (biometricWrapper != null) {
            InterfaceC27218a interfaceC27218a = c30943h0.f142828a;
            AbstractC19074t.m100206d(interfaceC27218a, "null cannot be cast to non-null type com.zing.zalo.activity.ZaloActivity");
            biometricWrapper.m37275d(((ZaloActivity) interfaceC27218a).getLifecycle());
        }
        BiometricWrapper biometricWrapper2 = c30943h0.f142832e;
        if (biometricWrapper2 != null) {
            biometricWrapper2.m37273a(aVar.m37291a(), null, true);
        }
    }

    /* renamed from: g */
    public final String m150497g() {
        return this.f142829b;
    }

    /* renamed from: h */
    public final InterfaceC30928a m150498h() {
        return this.f142831d;
    }

    /* renamed from: i */
    public final JSONObject m150499i() {
        return this.f142830c;
    }

    /* renamed from: j */
    public final void m150500j() {
        this.f142832e = new BiometricWrapper(this.f142833f, this.f142834g, new b());
        try {
            JSONObject jSONObject = this.f142830c.getJSONObject("ui");
            String optString = jSONObject.optString("title", AbstractC23136l9.m118743r0(AbstractC8020f0.str_biometric_security));
            AbstractC19074t.m100207e(optString, "optString(...)");
            String optString2 = jSONObject.optString("sub_title", "");
            AbstractC19074t.m100207e(optString2, "optString(...)");
            String optString3 = jSONObject.optString("negative_text", AbstractC23136l9.m118743r0(AbstractC8020f0.str_close));
            AbstractC19074t.m100207e(optString3, "optString(...)");
            BiometricWrapper.C7312d.a m37298h = new BiometricWrapper.C7312d.a().m37297g(optString).m37294d(optString2).m37296f(optString3).m37293c(false).m37298h(true);
            AbstractC19074t.m100207e(m37298h, "setVibrate(...)");
            m150495e(m37298h);
        } catch (Exception unused) {
            InterfaceC30928a interfaceC30928a = this.f142831d;
            interfaceC30928a.mo144679c(-109, interfaceC30928a.mo144678b(-109, "Incorrect params", this.f142829b), this.f142830c);
        }
    }
}

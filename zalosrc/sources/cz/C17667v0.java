package cz;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import au.AbstractC2379w;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.register.EnterOtpView;
import com.zing.zalo.register.StartUpNewView;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import p542ub.InterfaceC27218a;
import pm0.C24848g0;

/* renamed from: cz.v0 */
/* loaded from: classes.dex */
public final class C17667v0 {

    /* renamed from: a */
    public static final C17667v0 f89659a = new C17667v0();

    private C17667v0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m93645c(ZaloView zaloView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(zaloView, "$zaloView");
        interfaceC17463d.dismiss();
        try {
            if (zaloView instanceof EnterOtpView) {
                Intent intent = new Intent();
                intent.putExtra("refreshConsents", true);
                C24848g0 c24848g0 = C24848g0.f119245a;
                zaloView.mo50035CK(-1, intent);
                zaloView.finish();
            } else {
                Bundle bundle = new Bundle();
                bundle.putInt("SHOW_WITH_FLAGS", 67108864);
                C17487o0 m92662fJ = zaloView.m92662fJ();
                AbstractC19074t.m100205c(m92662fJ);
                m92662fJ.m93069k2(StartUpNewView.class, bundle, 2, true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: b */
    public final KeyEventCallbackC17462c m93646b(final ZaloView zaloView, String str) {
        AbstractC19074t.m100208f(zaloView, "zaloView");
        AbstractC19074t.m100208f(str, "msg");
        Context m92689tK = zaloView.m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        C16972e0.a aVar = new C16972e0.a(m92689tK);
        aVar.m90932i(C16972e0.b.DIALOG_INFORMATION);
        aVar.m90949z(str);
        aVar.m90945v(AbstractC2814h.ButtonMedium_Tertiary);
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_register_dialog_session_timeout_cta);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        aVar.m90943t(m118743r0, new InterfaceC17463d.d() { // from class: cz.u0
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                C17667v0.m93645c(ZaloView.this, interfaceC17463d, i11);
            }
        });
        return aVar.m90927d();
    }

    /* renamed from: d */
    public final void m93647d(InterfaceC27218a interfaceC27218a) {
        if (interfaceC27218a != null) {
            AbstractC2379w.m12430d(interfaceC27218a.getCurrentFocus());
        }
    }

    /* renamed from: e */
    public final void m93648e(View view) {
        if (view != null) {
            AbstractC2379w.m12432f(view);
        }
    }
}

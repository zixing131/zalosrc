package c70;

import am.AbstractC0924m0;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.p077ui.zviews.ZaloWebView;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import i70.C20379a;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p140ev.C18613b;
import p461qu.AbstractC25495a;
import p542ub.InterfaceC27218a;
import p656xs.AbstractC30200a;

/* renamed from: c70.c */
/* loaded from: classes5.dex */
public final class C3334c {

    /* renamed from: a */
    public static final C3334c f14156a = new C3334c();

    private C3334c() {
    }

    /* renamed from: c */
    private final void m16807c(String str, ZaloView zaloView) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("EXTRA_FEATURE_ID", C18613b.f93605x);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("groupId", AbstractC25495a.m132090o(str));
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CommunityPopupHelper", e11);
        }
        bundle.putString("extra_param_info", jSONObject.toString());
        ZaloWebView.C15403a c15403a = ZaloWebView.Companion;
        InterfaceC27218a m92692wK = zaloView.m92692wK();
        AbstractC19074t.m100207e(m92692wK, "requireZaloActivity(...)");
        c15403a.m87171F(m92692wK, AbstractC30200a.m148943b(), bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m16808e(int i11, String str, InterfaceC18494a interfaceC18494a, String str2, ZaloView zaloView, InterfaceC17463d interfaceC17463d, int i12) {
        if (i11 == AbstractC8020f0.str_popup_btn_upgrade_to_community) {
            if (str != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("gid", str2);
                int i13 = 1;
                if (AbstractC0924m0.m3675b() != 1) {
                    i13 = 0;
                }
                jSONObject.put("ekyc_status", i13);
                C20379a.f100400a.m106159a(str, 0, "upgrade_to_community", jSONObject.toString());
            }
            if (AbstractC19074t.m100204b(str, "csc")) {
                if (interfaceC18494a != null) {
                    interfaceC18494a.mo12V4();
                    return;
                }
                return;
            } else {
                if (str2 != null && zaloView != null) {
                    f14156a.m16807c(str2, zaloView);
                    return;
                }
                return;
            }
        }
        if (i11 == AbstractC8020f0.str_popup_btn_close) {
            interfaceC17463d.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m16809f(InterfaceC17463d interfaceC17463d, int i11) {
        interfaceC17463d.dismiss();
    }

    /* renamed from: d */
    public final void m16810d(Context context, int i11, int i12, int i13, final int i14, Integer num, final String str, final ZaloView zaloView, final InterfaceC18494a interfaceC18494a, final String str2) {
        if (context == null) {
            return;
        }
        String m118743r0 = AbstractC23136l9.m118743r0(i11);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        String m118743r02 = AbstractC23136l9.m118743r0(i12);
        AbstractC19074t.m100207e(m118743r02, "getString(...)");
        View inflate = LayoutInflater.from(context).inflate(AbstractC7409c0.popup_upgrade_to_community_top_view, (ViewGroup) null);
        ((AppCompatImageView) inflate.findViewById(AbstractC6918a0.topImage)).setImageResource(i13);
        C16972e0.a m90945v = new C16972e0.a(context).m90932i(C16972e0.b.POPUP).m90918B(m118743r0).m90925b(m118743r02, null).m90920D(inflate).m90942s(i14, new InterfaceC17463d.d() { // from class: c70.a
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i15) {
                C3334c.m16808e(i14, str2, interfaceC18494a, str, zaloView, interfaceC17463d, i15);
            }
        }).m90945v(AbstractC8915g0.ButtonCommunityPopup_Primary);
        if (num != null) {
            m90945v.m90933j(num.intValue(), new InterfaceC17463d.d() { // from class: c70.b
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i15) {
                    C3334c.m16809f(interfaceC17463d, i15);
                }
            }).m90935l(AbstractC8915g0.ButtonCommunityPopup_TertiaryNeutral);
        }
        m90945v.m90923G();
    }
}

package com.zing.zalo.p077ui.picker.dialog;

import android.os.Bundle;
import b40.C2526d;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.picker.dialog.RecommendHDDialog;
import com.zing.zalo.p077ui.picker.landingpage.LandingPageView;
import com.zing.zalo.p077ui.picker.mediapicker.MediaPickerView;
import com.zing.zalo.zview.DialogView;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import me0.AbstractC23136l9;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import th.AbstractC26689j;

/* loaded from: classes6.dex */
public final class RecommendHDDialog extends DialogView {

    /* renamed from: H0 */
    private MediaPickerView f66021H0;

    /* renamed from: I0 */
    private LandingPageView f66022I0;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: YK */
    public static final void m71372YK(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            try {
                interfaceC17463d.dismiss();
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
                return;
            }
        }
        AbstractC23647d.m123897g("9177563");
        AbstractC23309i.m121129Km(true);
        AbstractC23309i.m121949gm(true);
        C2526d.f10270a.m12726s0("rmb_media_quality_dialog", true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ZK */
    public static final void m71373ZK(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            try {
                interfaceC17463d.dismiss();
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
                return;
            }
        }
        AbstractC23647d.m123897g("9177564");
        AbstractC23309i.m121949gm(true);
    }

    @Override // com.zing.zalo.zview.DialogView, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        ZaloView m92650VI = m92650VI();
        if (m92650VI instanceof MediaPickerView) {
            this.f66021H0 = (MediaPickerView) m92650VI;
        } else if (m92650VI instanceof LandingPageView) {
            this.f66022I0 = (LandingPageView) m92650VI;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.DialogView
    /* renamed from: LK */
    public KeyEventCallbackC17462c mo13885LK(Bundle bundle) {
        int i11;
        int i12;
        int i13;
        try {
            if (this.f66021H0 == null && this.f66022I0 == null) {
                dismiss();
                KeyEventCallbackC17462c mo13885LK = super.mo13885LK(bundle);
                AbstractC19074t.m100207e(mo13885LK, "onCreateDialog(...)");
                return mo13885LK;
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        if (AbstractC26689j.m137085L()) {
            i11 = AbstractC8020f0.str_recommend_send_photo_and_video_hd_popup_description;
            i12 = AbstractC8020f0.str_recommend_send_photo_and_video_hd_popup_yes;
            i13 = AbstractC8020f0.str_recommend_send_photo_and_video_hd_popup_no;
        } else {
            i11 = AbstractC8020f0.str_recommend_send_photo_hd_popup_description_v2;
            i12 = AbstractC8020f0.str_recommend_send_photo_hd_popup_yes;
            i13 = AbstractC8020f0.str_cancel;
        }
        C8009j.a aVar = new C8009j.a(m92648SI());
        aVar.m43159h(4).m43162k(AbstractC23136l9.m118743r0(i11)).m43170s(AbstractC23136l9.m118743r0(i12), new InterfaceC17463d.d() { // from class: g90.a
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i14) {
                RecommendHDDialog.m71372YK(interfaceC17463d, i14);
            }
        }).m43165n(AbstractC23136l9.m118743r0(i13), new InterfaceC17463d.d() { // from class: g90.b
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i14) {
                RecommendHDDialog.m71373ZK(interfaceC17463d, i14);
            }
        });
        C8009j m43152a = aVar.m43152a();
        AbstractC19074t.m100207e(m43152a, "create(...)");
        mo43041MK(false);
        m92596NK(false);
        return m43152a;
    }
}

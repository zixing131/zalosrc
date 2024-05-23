package g90;

import android.content.Context;
import android.os.Bundle;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.picker.mediapicker.MediaPickerView;
import com.zing.zalo.zview.DialogView;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;

/* renamed from: g90.d */
/* loaded from: classes6.dex */
public final class C19303d extends DialogView {
    public static final a Companion = new a(null);

    /* renamed from: H0 */
    private final MediaItem f95866H0;

    /* renamed from: I0 */
    private MediaPickerView f95867I0;

    /* renamed from: g90.d$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C19303d(MediaItem mediaItem) {
        AbstractC19074t.m100208f(mediaItem, "videoItem");
        this.f95866H0 = mediaItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: XK */
    public static final void m101044XK(C19303d c19303d, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(c19303d, "this$0");
        if (interfaceC17463d != null) {
            try {
                interfaceC17463d.dismiss();
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
                return;
            }
        }
        MediaPickerView mediaPickerView = c19303d.f95867I0;
        if (mediaPickerView != null) {
            AbstractC19074t.m100205c(mediaPickerView);
            mediaPickerView.m72248vN(c19303d.f95866H0);
        }
    }

    @Override // com.zing.zalo.zview.DialogView, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        ZaloView m92650VI = m92650VI();
        if (m92650VI instanceof MediaPickerView) {
            this.f95867I0 = (MediaPickerView) m92650VI;
        }
    }

    @Override // com.zing.zalo.zview.DialogView
    /* renamed from: LK */
    public KeyEventCallbackC17462c mo13885LK(Bundle bundle) {
        try {
            if (this.f95867I0 == null) {
                dismiss();
                KeyEventCallbackC17462c mo13885LK = super.mo13885LK(bundle);
                AbstractC19074t.m100207e(mo13885LK, "onCreateDialog(...)");
                return mo13885LK;
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        Context m92686rK = m92686rK();
        AbstractC19074t.m100207e(m92686rK, "requireActivity(...)");
        C8009j.a aVar = new C8009j.a(m92686rK);
        aVar.m43172u(m92686rK().getString(AbstractC8020f0.photo_hd_caution_dialog_title)).m43162k(m92652XI(AbstractC8020f0.video_big_size_confirm_dialog_msg)).m43170s(m92652XI(AbstractC8020f0.video_big_size_confirm_dialog_positive), new InterfaceC17463d.d() { // from class: g90.c
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                C19303d.m101044XK(C19303d.this, interfaceC17463d, i11);
            }
        }).m43165n(m92652XI(AbstractC8020f0.video_big_size_confirm_dialog_negative), new InterfaceC17463d.b());
        C8009j m43152a = aVar.m43152a();
        AbstractC19074t.m100207e(m43152a, "create(...)");
        KeyEventCallbackC17462c m92594JK = m92594JK();
        if (m92594JK != null) {
            m92594JK.m92873y(false);
        }
        m43152a.m92874z(false);
        return m43152a;
    }
}

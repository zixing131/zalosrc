package com.zing.zalo.qrcode.p069ui.scan;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.core.graphics.C1421e;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.C1580n1;
import androidx.lifecycle.InterfaceC1801w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.p077ui.picker.gallerypicker.GalleryPickerView;
import com.zing.zalo.p077ui.zviews.DialogView;
import com.zing.zalo.utils.systemui.C16766d;
import com.zing.zalo.zview.AbstractC17452c;
import com.zing.zalo.zview.ZaloView;
import fn0.AbstractC19074t;
import m90.EnumC22962a;
import me0.AbstractC23136l9;
import me0.C23212s8;

/* loaded from: classes4.dex */
public final class GalleryPickerDialogView extends DialogView {

    /* renamed from: F0 */
    private final int f48888F0 = AbstractC6918a0.popup_content_container;

    /* renamed from: com.zing.zalo.qrcode.ui.scan.GalleryPickerDialogView$a */
    /* loaded from: classes4.dex */
    public static final class C9216a implements GalleryPickerView.InterfaceC12681b {
        C9216a() {
        }

        @Override // com.zing.zalo.p077ui.picker.gallerypicker.GalleryPickerView.InterfaceC12681b
        /* renamed from: dl */
        public void mo39091dl(Intent intent) {
            AbstractC19074t.m100208f(intent, "data");
            GalleryPickerView.InterfaceC12681b m49169QK = GalleryPickerDialogView.this.m49169QK();
            if (m49169QK != null) {
                m49169QK.mo39091dl(intent);
            }
            GalleryPickerDialogView.this.finish();
        }

        @Override // com.zing.zalo.p077ui.picker.gallerypicker.GalleryPickerView.InterfaceC12681b
        /* renamed from: y9 */
        public void mo39092y9() {
            GalleryPickerDialogView.this.finish();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext(), null);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, AbstractC23136l9.m118712h(frameLayout.getContext(), 600.0f)));
        frameLayout.setId(this.f48888F0);
        frameLayout.setBackgroundResource(AbstractC16803z.chat_reply_bg);
        return frameLayout;
    }

    @Override // com.zing.zalo.p077ui.zviews.DialogView, com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        GalleryPickerView.InterfaceC12681b m49169QK = m49169QK();
        if (m49169QK != null) {
            m49169QK.mo39092y9();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.DialogView
    /* renamed from: MK */
    public int mo49167MK() {
        return AbstractC8915g0.GalleryPickerPopup;
    }

    @Override // com.zing.zalo.p077ui.zviews.DialogView
    /* renamed from: NK */
    public Dialog mo49168NK(Bundle bundle) {
        int i11;
        int m118639A;
        C1421e m8054f;
        Dialog mo49168NK = super.mo49168NK(bundle);
        Integer num = null;
        if (mo49168NK == null) {
            return null;
        }
        Window window = mo49168NK.getWindow();
        if (window != null) {
            boolean m119603k = C23212s8.m119603k();
            int m118712h = AbstractC23136l9.m118712h(m92689tK(), 32.0f);
            window.getContext();
            C1580n1 m7824M = AbstractC1579n0.m7824M(window.getDecorView());
            if (m7824M != null && (m8054f = m7824M.m8054f(C1580n1.m.m8116d())) != null) {
                num = Integer.valueOf(m8054f.f6233d);
            }
            if (num != null) {
                i11 = num.intValue();
            } else {
                i11 = 0;
            }
            if (m118712h >= i11) {
                m118639A = 0;
            } else {
                m118639A = AbstractC23136l9.m118639A(AbstractC17452c.statusBarColor);
            }
            boolean m119603k2 = C23212s8.m119603k();
            Boolean bool = Boolean.TRUE;
            Boolean valueOf = Boolean.valueOf(m119603k);
            Integer valueOf2 = Integer.valueOf(m118639A);
            Boolean valueOf3 = Boolean.valueOf(m119603k2);
            Boolean bool2 = Boolean.FALSE;
            C16766d c16766d = new C16766d(bool, valueOf, valueOf2, null, valueOf3, bool2, bool2, 0, 8, null);
            AbstractC19074t.m100205c(window);
            c16766d.m89475f(window);
            return mo49168NK;
        }
        return mo49168NK;
    }

    /* renamed from: QK */
    public final GalleryPickerView.InterfaceC12681b m49169QK() {
        InterfaceC1801w m92650VI = m92650VI();
        if (m92650VI instanceof GalleryPickerView.InterfaceC12681b) {
            return (GalleryPickerView.InterfaceC12681b) m92650VI;
        }
        return null;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        Integer num;
        GalleryPickerView galleryPickerView;
        boolean z11;
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        Bundle m92642L3 = m92642L3();
        GalleryPickerView galleryPickerView2 = null;
        if (m92642L3 != null) {
            num = Integer.valueOf(m92642L3.getInt("extra_photo_type"));
        } else {
            num = null;
        }
        Bundle bundle2 = new Bundle();
        if (num != null) {
            bundle2.putInt("extra_photo_type", num.intValue());
            bundle2.putParcelable("EXTRA_SENSITIVE_DATA", new SensitiveData("gallery_choose_photo_scan_qr", "scan_qr", null, 4, null));
            if (num.intValue() == 17) {
                bundle2.putSerializable("extra_media_picker_source", EnumC22962a.f111693q);
            }
        }
        ZaloView m92996E0 = m92649TI().m92996E0("GalleryPickerView");
        if (m92996E0 instanceof GalleryPickerView) {
            galleryPickerView2 = (GalleryPickerView) m92996E0;
        }
        if (galleryPickerView2 != null) {
            z11 = false;
            galleryPickerView = galleryPickerView2;
        } else {
            galleryPickerView = new GalleryPickerView();
            z11 = true;
        }
        galleryPickerView.m71477zN(new C9216a());
        if (z11) {
            m92649TI().mo93055b2(this.f48888F0, galleryPickerView, bundle2, 1001, "GalleryPickerView", 0, false);
        }
    }
}

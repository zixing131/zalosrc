package com.zing.zalo.qrcode.p069ui.sheet;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.graphics.C1421e;
import androidx.lifecycle.InterfaceC1801w;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.zviews.ModalBottomSheet;
import com.zing.zalo.qrcode.p069ui.sheet.MoreSheet;
import com.zing.zalo.qrcode.util.ScanQRUIUtils;
import com.zing.zalo.utils.systemui.AbstractC16768f;
import com.zing.zalo.zdesign.component.BottomSheet;
import com.zing.zalo.zdesign.component.EnumC17017m;
import com.zing.zalo.zdesign.component.ListItem;
import fn0.AbstractC19074t;
import mj0.AbstractC23322a;
import p496ry.InterfaceC26029r;
import p558uu.InterfaceC27367c;

/* loaded from: classes4.dex */
public final class MoreSheet extends ModalBottomSheet {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uM */
    public static final void m49569uM(LinearLayout linearLayout, C1421e c1421e) {
        AbstractC19074t.m100208f(linearLayout, "$decorView");
        AbstractC19074t.m100208f(c1421e, "it");
        linearLayout.setPadding(c1421e.f6230a, 0, c1421e.f6232c, c1421e.f6233d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vM */
    public static final void m49570vM(MoreSheet moreSheet, View view) {
        InterfaceC26029r interfaceC26029r;
        AbstractC19074t.m100208f(moreSheet, "this$0");
        InterfaceC1801w m92650VI = moreSheet.m92650VI();
        if (m92650VI instanceof InterfaceC26029r) {
            interfaceC26029r = (InterfaceC26029r) m92650VI;
        } else {
            interfaceC26029r = null;
        }
        if (interfaceC26029r != null) {
            interfaceC26029r.mo49336w6(moreSheet, "sheet-more", "primary-button");
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ModalBottomSheet
    /* renamed from: nM */
    protected void mo49571nM(BottomSheet bottomSheet, LayoutInflater layoutInflater, LinearLayout linearLayout, Bundle bundle) {
        AbstractC19074t.m100208f(bottomSheet, "sheet");
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        if (linearLayout == null) {
            return;
        }
        bottomSheet.m90533zL(EnumC17017m.HUG_CONTENT);
        final LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, -1, -2);
        AbstractC16768f.m89489a(linearLayout).m89430n(new InterfaceC27367c() { // from class: ry.g
            @Override // p558uu.InterfaceC27367c
            /* renamed from: b */
            public final void mo87294b(C1421e c1421e) {
                MoreSheet.m49569uM(linearLayout2, c1421e);
            }
        });
        ScanQRUIUtils scanQRUIUtils = ScanQRUIUtils.f49155a;
        Context context = linearLayout.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        int i11 = AbstractC23322a.zds_ic_pin_line_24;
        String string = linearLayout.getResources().getString(AbstractC8020f0.str_scan_qr_code_create_shortcut);
        AbstractC19074t.m100207e(string, "getString(...)");
        ListItem m49628k = scanQRUIUtils.m49628k(context, i11, string, linearLayout.getResources().getString(AbstractC8020f0.str_scan_qr_code_create_shortcut_sub_name));
        m49628k.setIdTracking("scan_qr_create_shortcut");
        m49628k.setOnClickListener(new View.OnClickListener() { // from class: ry.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MoreSheet.m49570vM(MoreSheet.this, view);
            }
        });
        linearLayout2.addView(m49628k, -1, -2);
    }
}

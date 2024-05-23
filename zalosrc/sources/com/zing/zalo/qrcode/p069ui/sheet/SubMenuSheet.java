package com.zing.zalo.qrcode.p069ui.sheet;

import ac.C0708i;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.graphics.C1421e;
import androidx.lifecycle.InterfaceC1801w;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.zviews.ModalBottomSheet;
import com.zing.zalo.qrcode.p069ui.sheet.SubMenuSheet;
import com.zing.zalo.qrcode.util.ScanQRUIUtils;
import com.zing.zalo.utils.systemui.AbstractC16768f;
import com.zing.zalo.zdesign.component.BottomSheet;
import com.zing.zalo.zdesign.component.EnumC17017m;
import com.zing.zalo.zdesign.component.ListItem;
import fn0.AbstractC19074t;
import mj0.AbstractC23322a;
import p496ry.InterfaceC26029r;
import p558uu.InterfaceC27367c;
import qh0.C25288b;

/* loaded from: classes4.dex */
public final class SubMenuSheet extends ModalBottomSheet {
    /* renamed from: vM */
    private final String m49593vM(LinearLayout linearLayout) {
        String string = linearLayout.getResources().getString(AbstractC8020f0.str_scan_qr_code_save_to_qr_wallet, C25288b.f121272a.m130862a());
        AbstractC19074t.m100207e(string, "getString(...)");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wM */
    public static final void m49594wM(LinearLayout linearLayout, C1421e c1421e) {
        AbstractC19074t.m100208f(linearLayout, "$decorView");
        AbstractC19074t.m100208f(c1421e, "it");
        linearLayout.setPadding(c1421e.f6230a, 0, c1421e.f6232c, c1421e.f6233d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xM */
    public static final void m49595xM(SubMenuSheet subMenuSheet, View view) {
        InterfaceC26029r interfaceC26029r;
        AbstractC19074t.m100208f(subMenuSheet, "this$0");
        InterfaceC1801w m92650VI = subMenuSheet.m92650VI();
        if (m92650VI instanceof InterfaceC26029r) {
            interfaceC26029r = (InterfaceC26029r) m92650VI;
        } else {
            interfaceC26029r = null;
        }
        if (interfaceC26029r != null) {
            interfaceC26029r.mo49336w6(subMenuSheet, "sheet-sub-menu", "primary-button");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yM */
    public static final void m49596yM(SubMenuSheet subMenuSheet, View view) {
        InterfaceC26029r interfaceC26029r;
        AbstractC19074t.m100208f(subMenuSheet, "this$0");
        InterfaceC1801w m92650VI = subMenuSheet.m92650VI();
        if (m92650VI instanceof InterfaceC26029r) {
            interfaceC26029r = (InterfaceC26029r) m92650VI;
        } else {
            interfaceC26029r = null;
        }
        if (interfaceC26029r != null) {
            interfaceC26029r.mo49336w6(subMenuSheet, "sheet-sub-menu", "secondary-button");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f5  */
    @Override // com.zing.zalo.p077ui.zviews.ModalBottomSheet
    /* renamed from: nM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void mo49571nM(BottomSheet bottomSheet, LayoutInflater layoutInflater, LinearLayout linearLayout, Bundle bundle) {
        int i11;
        String str;
        String str2;
        Bundle m92642L3;
        String str3;
        String str4;
        AbstractC19074t.m100208f(bottomSheet, "sheet");
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        if (linearLayout == null) {
            return;
        }
        bottomSheet.m90533zL(EnumC17017m.HUG_CONTENT);
        final LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, -1, -2);
        AbstractC16768f.m89489a(linearLayout).m89430n(new InterfaceC27367c() { // from class: ry.s
            @Override // p558uu.InterfaceC27367c
            /* renamed from: b */
            public final void mo87294b(C1421e c1421e) {
                SubMenuSheet.m49594wM(linearLayout2, c1421e);
            }
        });
        Bundle m92642L32 = m92642L3();
        if (m92642L32 != null) {
            i11 = m92642L32.getInt("source-scan");
        } else {
            i11 = 0;
        }
        ScanQRUIUtils scanQRUIUtils = ScanQRUIUtils.f49155a;
        Context context = linearLayout.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        ListItem m49628k = scanQRUIUtils.m49628k(context, AbstractC23322a.zds_ic_qr_wallet_line_24, m49593vM(linearLayout), linearLayout.getResources().getString(AbstractC8020f0.str_scan_qr_code_save_to_qr_wallet_sub_name));
        Bundle m92642L33 = m92642L3();
        if (m92642L33 != null) {
            str = m92642L33.getString("source-sheet");
        } else {
            str = null;
        }
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1676281944) {
                if (hashCode != -1676047141) {
                    if (hashCode == 1354263094 && str.equals("sheet-phone-number")) {
                        str2 = "scan_qr_result_phone_save";
                    }
                } else if (str.equals("sheet-text")) {
                    str2 = "scan_qr_result_text_save";
                }
            } else if (str.equals("sheet-link")) {
                str2 = "scan_qr_result_link_save";
            }
            if (str2 != null) {
                m49628k.setIdTracking(str2);
            }
            C0708i c0708i = new C0708i();
            c0708i.m1072c("src_scan", i11);
            m49628k.setTrackingExtraData(c0708i);
            m49628k.setOnClickListener(new View.OnClickListener() { // from class: ry.t
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SubMenuSheet.m49595xM(SubMenuSheet.this, view);
                }
            });
            linearLayout2.addView(m49628k, -1, -2);
            Context context2 = linearLayout.getContext();
            AbstractC19074t.m100207e(context2, "getContext(...)");
            int i12 = AbstractC23322a.zds_ic_share_line_24;
            String string = linearLayout.getResources().getString(AbstractC8020f0.share);
            AbstractC19074t.m100207e(string, "getString(...)");
            ListItem m49628k2 = scanQRUIUtils.m49628k(context2, i12, string, null);
            m92642L3 = m92642L3();
            if (m92642L3 == null) {
                str3 = m92642L3.getString("source-sheet");
            } else {
                str3 = null;
            }
            if (str3 != null) {
                int hashCode2 = str3.hashCode();
                if (hashCode2 != -1676281944) {
                    if (hashCode2 != -1676047141) {
                        if (hashCode2 == 1354263094 && str3.equals("sheet-phone-number")) {
                            str4 = "scan_qr_result_phone_share";
                        }
                    } else if (str3.equals("sheet-text")) {
                        str4 = "scan_qr_result_text_share";
                    }
                } else if (str3.equals("sheet-link")) {
                    str4 = "scan_qr_result_link_share";
                }
                if (str4 != null) {
                    m49628k2.setIdTracking(str4);
                }
                C0708i c0708i2 = new C0708i();
                c0708i2.m1072c("src_scan", i11);
                m49628k2.setTrackingExtraData(c0708i2);
                m49628k2.setOnClickListener(new View.OnClickListener() { // from class: ry.u
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SubMenuSheet.m49596yM(SubMenuSheet.this, view);
                    }
                });
                linearLayout2.addView(m49628k2, -1, -2);
            }
            str4 = null;
            if (str4 != null) {
            }
            C0708i c0708i22 = new C0708i();
            c0708i22.m1072c("src_scan", i11);
            m49628k2.setTrackingExtraData(c0708i22);
            m49628k2.setOnClickListener(new View.OnClickListener() { // from class: ry.u
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SubMenuSheet.m49596yM(SubMenuSheet.this, view);
                }
            });
            linearLayout2.addView(m49628k2, -1, -2);
        }
        str2 = null;
        if (str2 != null) {
        }
        C0708i c0708i3 = new C0708i();
        c0708i3.m1072c("src_scan", i11);
        m49628k.setTrackingExtraData(c0708i3);
        m49628k.setOnClickListener(new View.OnClickListener() { // from class: ry.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SubMenuSheet.m49595xM(SubMenuSheet.this, view);
            }
        });
        linearLayout2.addView(m49628k, -1, -2);
        Context context22 = linearLayout.getContext();
        AbstractC19074t.m100207e(context22, "getContext(...)");
        int i122 = AbstractC23322a.zds_ic_share_line_24;
        String string2 = linearLayout.getResources().getString(AbstractC8020f0.share);
        AbstractC19074t.m100207e(string2, "getString(...)");
        ListItem m49628k22 = scanQRUIUtils.m49628k(context22, i122, string2, null);
        m92642L3 = m92642L3();
        if (m92642L3 == null) {
        }
        if (str3 != null) {
        }
        str4 = null;
        if (str4 != null) {
        }
        C0708i c0708i222 = new C0708i();
        c0708i222.m1072c("src_scan", i11);
        m49628k22.setTrackingExtraData(c0708i222);
        m49628k22.setOnClickListener(new View.OnClickListener() { // from class: ry.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SubMenuSheet.m49596yM(SubMenuSheet.this, view);
            }
        });
        linearLayout2.addView(m49628k22, -1, -2);
    }
}

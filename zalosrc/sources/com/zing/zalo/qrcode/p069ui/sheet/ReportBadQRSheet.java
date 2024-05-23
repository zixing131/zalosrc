package com.zing.zalo.qrcode.p069ui.sheet;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.core.graphics.C1421e;
import androidx.lifecycle.InterfaceC1801w;
import com.zing.zalo.p077ui.zviews.ModalBottomSheet;
import com.zing.zalo.qrcode.p069ui.sheet.ReportBadQRSheet;
import com.zing.zalo.utils.systemui.AbstractC16768f;
import com.zing.zalo.zdesign.component.BottomSheet;
import com.zing.zalo.zdesign.component.EnumC17017m;
import fn0.AbstractC19074t;
import p496ry.InterfaceC26029r;
import p558uu.InterfaceC27367c;
import p649xl.C29703a1;

/* loaded from: classes4.dex */
public final class ReportBadQRSheet extends ModalBottomSheet {

    /* renamed from: T0 */
    private C29703a1 f49151T0;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vM */
    public static final void m49585vM(ReportBadQRSheet reportBadQRSheet, int[] iArr, C1421e c1421e) {
        AbstractC19074t.m100208f(reportBadQRSheet, "this$0");
        AbstractC19074t.m100208f(iArr, "$originalPadding");
        AbstractC19074t.m100208f(c1421e, "insets");
        C29703a1 c29703a1 = reportBadQRSheet.f49151T0;
        if (c29703a1 == null) {
            AbstractC19074t.m100223u("binding");
            c29703a1 = null;
        }
        LinearLayout root = c29703a1.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        root.setPadding(iArr[0] + c1421e.f6230a, root.getPaddingTop(), iArr[2] + c1421e.f6232c, iArr[3] + c1421e.f6233d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wM */
    public static final void m49586wM(ReportBadQRSheet reportBadQRSheet, CompoundButton compoundButton, boolean z11) {
        AbstractC19074t.m100208f(reportBadQRSheet, "this$0");
        Bundle m92642L3 = reportBadQRSheet.m92642L3();
        if (m92642L3 == null) {
            m92642L3 = new Bundle();
            reportBadQRSheet.mo60305zK(m92642L3);
        }
        m92642L3.putBoolean("primary-check", z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xM */
    public static final void m49587xM(ReportBadQRSheet reportBadQRSheet, View view) {
        InterfaceC26029r interfaceC26029r;
        AbstractC19074t.m100208f(reportBadQRSheet, "this$0");
        InterfaceC1801w m92650VI = reportBadQRSheet.m92650VI();
        if (m92650VI instanceof InterfaceC26029r) {
            interfaceC26029r = (InterfaceC26029r) m92650VI;
        } else {
            interfaceC26029r = null;
        }
        if (interfaceC26029r != null) {
            interfaceC26029r.mo49336w6(reportBadQRSheet, "sheet-report-bad-qr", "primary-button");
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
        C29703a1 m147703c = C29703a1.m147703c(LayoutInflater.from(getContext()), linearLayout, true);
        AbstractC19074t.m100207e(m147703c, "inflate(...)");
        this.f49151T0 = m147703c;
        bottomSheet.m90533zL(EnumC17017m.HUG_CONTENT);
        final int[] iArr = new int[4];
        C29703a1 c29703a1 = this.f49151T0;
        C29703a1 c29703a12 = null;
        if (c29703a1 == null) {
            AbstractC19074t.m100223u("binding");
            c29703a1 = null;
        }
        iArr[0] = c29703a1.getRoot().getPaddingLeft();
        C29703a1 c29703a13 = this.f49151T0;
        if (c29703a13 == null) {
            AbstractC19074t.m100223u("binding");
            c29703a13 = null;
        }
        iArr[1] = c29703a13.getRoot().getPaddingTop();
        C29703a1 c29703a14 = this.f49151T0;
        if (c29703a14 == null) {
            AbstractC19074t.m100223u("binding");
            c29703a14 = null;
        }
        iArr[2] = c29703a14.getRoot().getPaddingRight();
        C29703a1 c29703a15 = this.f49151T0;
        if (c29703a15 == null) {
            AbstractC19074t.m100223u("binding");
            c29703a15 = null;
        }
        iArr[3] = c29703a15.getRoot().getPaddingBottom();
        AbstractC16768f.m89489a(linearLayout).m89430n(new InterfaceC27367c() { // from class: ry.n
            @Override // p558uu.InterfaceC27367c
            /* renamed from: b */
            public final void mo87294b(C1421e c1421e) {
                ReportBadQRSheet.m49585vM(ReportBadQRSheet.this, iArr, c1421e);
            }
        });
        Bundle m92642L3 = m92642L3();
        if (m92642L3 == null) {
            m92642L3 = new Bundle();
            mo60305zK(m92642L3);
        }
        C29703a1 c29703a16 = this.f49151T0;
        if (c29703a16 == null) {
            AbstractC19074t.m100223u("binding");
            c29703a16 = null;
        }
        m92642L3.putBoolean("primary-check", c29703a16.f137186r.isChecked());
        C29703a1 c29703a17 = this.f49151T0;
        if (c29703a17 == null) {
            AbstractC19074t.m100223u("binding");
            c29703a17 = null;
        }
        c29703a17.f137186r.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ry.o
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                ReportBadQRSheet.m49586wM(ReportBadQRSheet.this, compoundButton, z11);
            }
        });
        C29703a1 c29703a18 = this.f49151T0;
        if (c29703a18 == null) {
            AbstractC19074t.m100223u("binding");
            c29703a18 = null;
        }
        c29703a18.f137185q.setIdTracking("btn_scan_another");
        C29703a1 c29703a19 = this.f49151T0;
        if (c29703a19 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29703a12 = c29703a19;
        }
        c29703a12.f137185q.setOnClickListener(new View.OnClickListener() { // from class: ry.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReportBadQRSheet.m49587xM(ReportBadQRSheet.this, view);
            }
        });
    }
}

package com.zing.zalo.reportbadqr.p070ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.zing.zalo.reportbadqr.p070ui.ReportQRBS;
import com.zing.zalo.zdesign.component.BottomSheet;
import com.zing.zalo.zdesign.component.EnumC17017m;
import com.zing.zalo.zview.ZaloView;
import fn0.AbstractC19074t;
import p649xl.C29703a1;

/* loaded from: classes4.dex */
public final class ReportQRBS extends BottomSheet {

    /* renamed from: b1 */
    private C29703a1 f49523b1;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: JL */
    public static final void m50387JL(ReportQRBS reportQRBS, View view) {
        AbstractC19074t.m100208f(reportQRBS, "this$0");
        C29703a1 c29703a1 = reportQRBS.f49523b1;
        if (c29703a1 == null) {
            AbstractC19074t.m100223u("binding");
            c29703a1 = null;
        }
        boolean isChecked = c29703a1.f137186r.isChecked();
        int i11 = reportQRBS.m92688sK().getInt("REPORT_SOURCE", 0);
        String string = reportQRBS.m92688sK().getString("REPORT_FILE", "");
        float f11 = reportQRBS.m92688sK().getFloat("REPORT_MODEL_SCORE", 0.0f);
        Intent intent = new Intent();
        intent.putExtra("IS_AGREE_SENT_QR", isChecked);
        intent.putExtra("REPORT_SOURCE", i11);
        intent.putExtra("REPORT_FILE", string);
        intent.putExtra("REPORT_MODEL_SCORE", f11);
        reportQRBS.m50388KL(-1, intent);
        reportQRBS.close();
    }

    /* renamed from: KL */
    private final void m50388KL(int i11, Intent intent) {
        ZaloView m92650VI;
        if ((m92650VI() instanceof ReportQRBottomSheet) && (m92650VI = m92650VI()) != null) {
            m92650VI.mo50035CK(i11, intent);
        }
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet
    /* renamed from: lL */
    protected void mo45682lL(LayoutInflater layoutInflater, LinearLayout linearLayout, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29703a1 m147703c = C29703a1.m147703c(layoutInflater, linearLayout, true);
        AbstractC19074t.m100207e(m147703c, "inflate(...)");
        this.f49523b1 = m147703c;
        m90533zL(EnumC17017m.HUG_CONTENT);
        C29703a1 c29703a1 = this.f49523b1;
        C29703a1 c29703a12 = null;
        if (c29703a1 == null) {
            AbstractC19074t.m100223u("binding");
            c29703a1 = null;
        }
        c29703a1.f137185q.setIdTracking("btn_scan_another");
        C29703a1 c29703a13 = this.f49523b1;
        if (c29703a13 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29703a12 = c29703a13;
        }
        c29703a12.f137185q.setOnClickListener(new View.OnClickListener() { // from class: wz.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReportQRBS.m50387JL(ReportQRBS.this, view);
            }
        });
    }
}

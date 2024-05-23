package com.zing.zalo.shortvideo.p072ui.component.bts;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.os.AbstractC1438d;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.shortvideo.p072ui.component.bts.UploadActionBottomSheet;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import mj0.AbstractC23322a;
import pm0.AbstractC24866w;
import q10.C25003f;
import s20.AbstractC26112n;
import ui0.C27280g;
import v00.AbstractC27406a;

/* loaded from: classes5.dex */
public final class UploadActionBottomSheet extends BaseBottomSheetView {
    public static final C9525b Companion = new C9525b(null);

    /* renamed from: M0 */
    private InterfaceC9524a f50482M0;

    /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.UploadActionBottomSheet$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC9524a {
        /* renamed from: a */
        void mo51939a();

        /* renamed from: b */
        void mo51940b();
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.UploadActionBottomSheet$b */
    /* loaded from: classes5.dex */
    public static final class C9525b {
        private C9525b() {
        }

        public /* synthetic */ C9525b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final UploadActionBottomSheet m51941a(boolean z11, boolean z12) {
            UploadActionBottomSheet uploadActionBottomSheet = new UploadActionBottomSheet();
            uploadActionBottomSheet.mo60305zK(AbstractC1438d.m7341b(AbstractC24866w.m129235a("CAN_RETRY", Boolean.valueOf(z11)), AbstractC24866w.m129235a("CAN_DELETE", Boolean.valueOf(z12))));
            return uploadActionBottomSheet;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kL */
    public static final void m51936kL(UploadActionBottomSheet uploadActionBottomSheet, View view) {
        AbstractC19074t.m100208f(uploadActionBottomSheet, "this$0");
        InterfaceC9524a interfaceC9524a = uploadActionBottomSheet.f50482M0;
        if (interfaceC9524a != null) {
            interfaceC9524a.mo51939a();
        }
        uploadActionBottomSheet.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lL */
    public static final void m51937lL(UploadActionBottomSheet uploadActionBottomSheet, View view) {
        AbstractC19074t.m100208f(uploadActionBottomSheet, "this$0");
        InterfaceC9524a interfaceC9524a = uploadActionBottomSheet.f50482M0;
        if (interfaceC9524a != null) {
            interfaceC9524a.mo51940b();
        }
        uploadActionBottomSheet.dismiss();
    }

    @Override // com.zing.zalo.shortvideo.p072ui.component.bts.BaseBottomSheetView, com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        m51753XK(true);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.component.bts.BaseBottomSheetView
    /* renamed from: WK */
    public View mo51752WK(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        AbstractC19074t.m100208f(viewGroup, "container");
        C25003f m129805c = C25003f.m129805c(layoutInflater, viewGroup, false);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null && m92642L3.getBoolean("CAN_RETRY")) {
            RobotoTextView robotoTextView = m129805c.f119895r;
            AbstractC19074t.m100207e(robotoTextView, "rowRetry");
            Context m92689tK = m92689tK();
            AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
            AbstractC26112n.m134401h0(robotoTextView, C27280g.m139659b(m92689tK, AbstractC23322a.zds_ic_retry_line_24, AbstractC27406a.zch_icon_tertiary));
            m129805c.f119895r.setOnClickListener(new View.OnClickListener() { // from class: v10.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UploadActionBottomSheet.m51936kL(UploadActionBottomSheet.this, view);
                }
            });
        } else {
            RobotoTextView robotoTextView2 = m129805c.f119895r;
            AbstractC19074t.m100207e(robotoTextView2, "rowRetry");
            AbstractC26112n.m134367H(robotoTextView2);
        }
        Bundle m92642L32 = m92642L3();
        if (m92642L32 != null && m92642L32.getBoolean("CAN_DELETE")) {
            RobotoTextView robotoTextView3 = m129805c.f119894q;
            AbstractC19074t.m100207e(robotoTextView3, "rowDelete");
            Context m92689tK2 = m92689tK();
            AbstractC19074t.m100207e(m92689tK2, "requireContext(...)");
            AbstractC26112n.m134401h0(robotoTextView3, C27280g.m139659b(m92689tK2, AbstractC23322a.zds_ic_delete_line_24, AbstractC27406a.zch_icon_tertiary));
            m129805c.f119894q.setOnClickListener(new View.OnClickListener() { // from class: v10.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UploadActionBottomSheet.m51937lL(UploadActionBottomSheet.this, view);
                }
            });
        } else {
            RobotoTextView robotoTextView4 = m129805c.f119894q;
            AbstractC19074t.m100207e(robotoTextView4, "rowDelete");
            AbstractC26112n.m134367H(robotoTextView4);
        }
        LinearLayout root = m129805c.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    /* renamed from: mL */
    public final void m51938mL(InterfaceC9524a interfaceC9524a) {
        this.f50482M0 = interfaceC9524a;
    }
}

package com.zing.zalo.p077ui.bottomsheet;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import bi0.AbstractC2808b;
import bi0.AbstractC2810d;
import com.zing.zalo.p077ui.bottomsheet.DeleteStrangerMessageBottomSheet;
import com.zing.zalo.zdesign.component.BottomSheet;
import com.zing.zalo.zdesign.component.EnumC17017m;
import com.zing.zalo.zview.ZaloView;
import fn0.AbstractC19074t;
import p649xl.C29972p0;
import ui0.C27280g;

/* loaded from: classes5.dex */
public final class DeleteStrangerMessageBottomSheet extends BottomSheet {

    /* renamed from: b1 */
    public C29972p0 f56214b1;

    /* renamed from: KL */
    private final void m58508KL() {
        ZAppCompatImageView zAppCompatImageView = m58511JL().f138925q;
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        zAppCompatImageView.setImageDrawable(C27280g.m139659b(m92689tK, AbstractC2810d.zds_ic_delete_line_24, AbstractC2808b.f150830r60));
        m58511JL().f138926r.setOnClickListener(new View.OnClickListener() { // from class: e50.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeleteStrangerMessageBottomSheet.m58509LL(DeleteStrangerMessageBottomSheet.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LL */
    public static final void m58509LL(DeleteStrangerMessageBottomSheet deleteStrangerMessageBottomSheet, View view) {
        AbstractC19074t.m100208f(deleteStrangerMessageBottomSheet, "this$0");
        deleteStrangerMessageBottomSheet.m58510NL();
    }

    /* renamed from: NL */
    private final void m58510NL() {
        ZaloView m92650VI;
        Intent intent = new Intent();
        intent.putExtra("EXTRA_PARAM_IS_DELETE_ALL", true);
        if ((m92650VI() instanceof BottomSheetDeleteStrangerMessage) && (m92650VI = m92650VI()) != null) {
            m92650VI.mo50035CK(-1, intent);
        }
        close();
    }

    /* renamed from: JL */
    public final C29972p0 m58511JL() {
        C29972p0 c29972p0 = this.f56214b1;
        if (c29972p0 != null) {
            return c29972p0;
        }
        AbstractC19074t.m100223u("binding");
        return null;
    }

    /* renamed from: ML */
    public final void m58512ML(C29972p0 c29972p0) {
        AbstractC19074t.m100208f(c29972p0, "<set-?>");
        this.f56214b1 = c29972p0;
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet
    /* renamed from: lL */
    protected void mo45682lL(LayoutInflater layoutInflater, LinearLayout linearLayout, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29972p0 m148346c = C29972p0.m148346c(layoutInflater, linearLayout, true);
        AbstractC19074t.m100207e(m148346c, "inflate(...)");
        m58512ML(m148346c);
        m90525tL(true);
        m90533zL(EnumC17017m.HUG_CONTENT);
        m58508KL();
    }
}

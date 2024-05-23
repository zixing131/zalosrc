package com.zing.zalo.p077ui.mycloud;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.mycloud.MyCloudQuotaOnBoardBS;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.BottomSheet;
import com.zing.zalo.zdesign.component.EnumC17017m;
import fn0.AbstractC19074t;
import java.util.Arrays;
import me0.AbstractC23136l9;
import me0.AbstractC23152n3;
import p304ks.AbstractC21935u;
import p348mi.AbstractC23306f;
import p649xl.C30084v8;

/* loaded from: classes6.dex */
public final class MyCloudQuotaOnBoardBS extends BottomSheet {

    /* renamed from: b1 */
    public C30084v8 f65400b1;

    /* renamed from: LL */
    private final void m70256LL() {
        RobotoTextView robotoTextView = m70259KL().f139674q;
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quota_clean_section_title);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        String format = String.format(m118743r0, Arrays.copyOf(new Object[]{AbstractC21935u.m114547n()}, 1));
        AbstractC19074t.m100207e(format, "format(...)");
        robotoTextView.setText(format);
        m70259KL().f139677t.setNestedScrollingEnabled(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ML */
    public static final void m70257ML(MyCloudQuotaOnBoardBS myCloudQuotaOnBoardBS, View view) {
        AbstractC19074t.m100208f(myCloudQuotaOnBoardBS, "this$0");
        AbstractC23152n3.m119050j0(myCloudQuotaOnBoardBS.m92689tK(), AbstractC23306f.m120583H().m110204g().f110056J);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NL */
    public static final void m70258NL(MyCloudQuotaOnBoardBS myCloudQuotaOnBoardBS, View view) {
        AbstractC19074t.m100208f(myCloudQuotaOnBoardBS, "this$0");
        myCloudQuotaOnBoardBS.close();
    }

    /* renamed from: KL */
    public final C30084v8 m70259KL() {
        C30084v8 c30084v8 = this.f65400b1;
        if (c30084v8 != null) {
            return c30084v8;
        }
        AbstractC19074t.m100223u("binding");
        return null;
    }

    /* renamed from: OL */
    public final void m70260OL(C30084v8 c30084v8) {
        AbstractC19074t.m100208f(c30084v8, "<set-?>");
        this.f65400b1 = c30084v8;
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet, com.zing.zalo.zdesign.component.bottomsheet.BottomSheetLayout.InterfaceC16954a
    /* renamed from: P2 */
    public View mo45941P2() {
        ScrollView scrollView = m70259KL().f139677t;
        AbstractC19074t.m100207e(scrollView, "scrollContainer");
        return scrollView;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        if (!TextUtils.isEmpty(AbstractC23306f.m120583H().m110204g().f110056J)) {
            m70259KL().f139676s.setOnClickListener(new View.OnClickListener() { // from class: u80.e2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    MyCloudQuotaOnBoardBS.m70257ML(MyCloudQuotaOnBoardBS.this, view2);
                }
            });
        } else {
            m70259KL().f139676s.setVisibility(8);
        }
        m70259KL().f139675r.setOnClickListener(new View.OnClickListener() { // from class: u80.f2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MyCloudQuotaOnBoardBS.m70258NL(MyCloudQuotaOnBoardBS.this, view2);
            }
        });
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet
    /* renamed from: lL */
    protected void mo45682lL(LayoutInflater layoutInflater, LinearLayout linearLayout, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C30084v8 m148616c = C30084v8.m148616c(layoutInflater, linearLayout, true);
        AbstractC19074t.m100207e(m148616c, "inflate(...)");
        m70260OL(m148616c);
        m90533zL(EnumC17017m.HUG_CONTENT);
        m90525tL(true);
        m70256LL();
    }
}

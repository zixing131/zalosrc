package com.zing.zalo.p077ui.bottomsheet;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.bottomsheet.VideoHdOnboardBottomSheet;
import com.zing.zalo.p077ui.widget.RobotoButton;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.BottomSheet;
import com.zing.zalo.zdesign.component.EnumC17017m;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import java.util.Arrays;
import me0.AbstractC23136l9;
import p649xl.C29997q7;

/* loaded from: classes5.dex */
public final class VideoHdOnboardBottomSheet extends BottomSheet {

    /* renamed from: b1 */
    public C29997q7 f56257b1;

    /* renamed from: c1 */
    private RobotoTextView f56258c1;

    /* renamed from: d1 */
    private RobotoButton f56259d1;

    /* renamed from: e1 */
    private String f56260e1 = "";

    /* renamed from: KL */
    public static final void m58628KL(VideoHdOnboardBottomSheet videoHdOnboardBottomSheet, View view) {
        AbstractC19074t.m100208f(videoHdOnboardBottomSheet, "this$0");
        videoHdOnboardBottomSheet.close();
    }

    /* renamed from: JL */
    public final C29997q7 m58629JL() {
        C29997q7 c29997q7 = this.f56257b1;
        if (c29997q7 != null) {
            return c29997q7;
        }
        AbstractC19074t.m100223u("binding");
        return null;
    }

    /* renamed from: LL */
    public final void m58630LL(C29997q7 c29997q7) {
        AbstractC19074t.m100208f(c29997q7, "<set-?>");
        this.f56257b1 = c29997q7;
    }

    /* renamed from: ML */
    public final void m58631ML(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f56260e1 = str;
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet
    /* renamed from: lL */
    protected void mo45682lL(LayoutInflater layoutInflater, LinearLayout linearLayout, Bundle bundle) {
        RobotoTextView robotoTextView;
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        m90533zL(EnumC17017m.HUG_CONTENT);
        String m58506a = BottomSheetVideoHdOnboard.Companion.m58506a();
        C29997q7 m148404c = C29997q7.m148404c(layoutInflater, linearLayout, true);
        AbstractC19074t.m100207e(m148404c, "inflate(...)");
        m58630LL(m148404c);
        if (this.f56260e1.length() == 0) {
            this.f56260e1 = m58506a;
        }
        C19067n0 c19067n0 = C19067n0.f94947a;
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_video_hd_onboard_content);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        String format = String.format(m118743r0, Arrays.copyOf(new Object[]{this.f56260e1}, 1));
        AbstractC19074t.m100207e(format, "format(...)");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
        if (!AbstractC19074t.m100204b(this.f56260e1, m58506a)) {
            spannableStringBuilder.setSpan(new StyleSpan(1), 0, this.f56260e1.length(), 33);
        }
        RobotoTextView robotoTextView2 = m58629JL().f139100q;
        this.f56258c1 = robotoTextView2;
        if (robotoTextView2 != null) {
            robotoTextView2.setText(spannableStringBuilder);
        }
        if (Build.VERSION.SDK_INT >= 23 && (robotoTextView = this.f56258c1) != null) {
            robotoTextView.setBreakStrategy(2);
        }
        RobotoButton robotoButton = m58629JL().f139101r;
        this.f56259d1 = robotoButton;
        if (robotoButton != null) {
            robotoButton.setOnClickListener(new View.OnClickListener() { // from class: e50.p0
                public /* synthetic */ ViewOnClickListenerC18240p0() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VideoHdOnboardBottomSheet.m58628KL(VideoHdOnboardBottomSheet.this, view);
                }
            });
        }
    }
}

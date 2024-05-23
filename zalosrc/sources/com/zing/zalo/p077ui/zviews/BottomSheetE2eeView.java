package com.zing.zalo.p077ui.zviews;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import p227i3.C20218v;
import p348mi.AbstractC23306f;
import p649xl.C29990q0;
import vg.AbstractC28207v1;

/* loaded from: classes6.dex */
public final class BottomSheetE2eeView extends BottomSheetZaloViewWithAnim implements View.OnClickListener {
    public static final C14113a Companion = new C14113a(null);

    /* renamed from: W0 */
    private C29990q0 f72453W0;

    /* renamed from: com.zing.zalo.ui.zviews.BottomSheetE2eeView$a */
    /* loaded from: classes6.dex */
    public static final class C14113a {
        private C14113a() {
        }

        public /* synthetic */ C14113a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oM */
    public static final void m78537oM(BottomSheetE2eeView bottomSheetE2eeView, View view) {
        AbstractC19074t.m100208f(bottomSheetE2eeView, "this$0");
        AbstractC28207v1.m141994i3("action.open.inapp", 3, bottomSheetE2eeView.m92676n2(), bottomSheetE2eeView, AbstractC23306f.m120583H().m110204g().f110088w, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: eM */
    public int mo37128eM() {
        return this.f72454M0.getHeight() - m78538nM();
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: fM */
    protected void mo37129fM(LinearLayout linearLayout) {
        AbstractC19074t.m100208f(linearLayout, "llContainer");
        C29990q0 m148383c = C29990q0.m148383c(LayoutInflater.from(getContext()), linearLayout, true);
        AbstractC19074t.m100207e(m148383c, "inflate(...)");
        this.f72453W0 = m148383c;
        C29990q0 c29990q0 = null;
        if (m148383c == null) {
            AbstractC19074t.m100223u("binding");
            m148383c = null;
        }
        m148383c.f139065q.setIdTracking("e2ee_bottom_view_setting_btn");
        C29990q0 c29990q02 = this.f72453W0;
        if (c29990q02 == null) {
            AbstractC19074t.m100223u("binding");
            c29990q02 = null;
        }
        c29990q02.f139065q.setOnClickListener(this);
        this.f72456O0.setVisibility(8);
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = 0;
            linearLayout.setLayoutParams(layoutParams);
        }
        C29990q0 c29990q03 = this.f72453W0;
        if (c29990q03 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29990q0 = c29990q03;
        }
        c29990q0.f139069u.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.z2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BottomSheetE2eeView.m78537oM(BottomSheetE2eeView.this, view);
            }
        });
        m78539iM(true);
        this.f72454M0.setCanOverTranslateMaxY(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: gM */
    public void mo37132gM() {
        super.mo37132gM();
        this.f72454M0.setMinTranslationY(mo37128eM());
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "BottomSheetE2eeView";
    }

    /* renamed from: nM */
    public final int m78538nM() {
        C29990q0 c29990q0 = this.f72453W0;
        if (c29990q0 == null) {
            AbstractC19074t.m100223u("binding");
            c29990q0 = null;
        }
        return c29990q0.getRoot().getMeasuredHeight() + AbstractC23136l9.m118737p0();
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView, android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC19074t.m100208f(view, C20218v.f100059b);
        if (view.getId() == AbstractC6918a0.btnClose) {
            close();
        }
    }
}

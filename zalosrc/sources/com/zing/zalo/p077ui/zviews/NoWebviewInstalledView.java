package com.zing.zalo.p077ui.zviews;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.p077ui.widget.RobotoButton;
import com.zing.zalo.zview.ZaloView;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import p542ub.InterfaceC27218a;
import p649xl.C30152z8;

/* loaded from: classes6.dex */
public final class NoWebviewInstalledView extends BaseZaloView implements ZaloView.InterfaceC17421f {

    /* renamed from: M0 */
    private C30152z8 f75645M0;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fM */
    public static final void m82348fM(NoWebviewInstalledView noWebviewInstalledView, View view) {
        AbstractC19074t.m100208f(noWebviewInstalledView, "this$0");
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.android.webview"));
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.addFlags(268435456);
        noWebviewInstalledView.m92641HK(intent);
        InterfaceC27218a m92676n2 = noWebviewInstalledView.m92676n2();
        AbstractC19074t.m100206d(m92676n2, "null cannot be cast to non-null type com.zing.zalo.activity.ZaloActivity");
        ((ZaloActivity) m92676n2).finishAndRemoveTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gM */
    public static final void m82349gM(NoWebviewInstalledView noWebviewInstalledView, View view) {
        AbstractC19074t.m100208f(noWebviewInstalledView, "this$0");
        InterfaceC27218a m92676n2 = noWebviewInstalledView.m92676n2();
        AbstractC19074t.m100206d(m92676n2, "null cannot be cast to non-null type com.zing.zalo.activity.ZaloActivity");
        ((ZaloActivity) m92676n2).finishAndRemoveTask();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null) {
            window = m92676n2.getWindow();
        } else {
            window = null;
        }
        if (window != null) {
            window.setStatusBarColor(AbstractC23136l9.m118639A(AbstractC16801x.transparent));
        }
        C30152z8 m148777c = C30152z8.m148777c(layoutInflater, viewGroup, false);
        this.f75645M0 = m148777c;
        if (m148777c == null) {
            return null;
        }
        return m148777c.getRoot();
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        RobotoButton robotoButton;
        RobotoButton robotoButton2;
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        C30152z8 c30152z8 = this.f75645M0;
        if (c30152z8 != null && (robotoButton2 = c30152z8.f140122r) != null) {
            robotoButton2.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.g20
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    NoWebviewInstalledView.m82348fM(NoWebviewInstalledView.this, view2);
                }
            });
        }
        C30152z8 c30152z82 = this.f75645M0;
        if (c30152z82 != null && (robotoButton = c30152z82.f140121q) != null) {
            robotoButton.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.h20
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    NoWebviewInstalledView.m82349gM(NoWebviewInstalledView.this, view2);
                }
            });
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "";
    }
}

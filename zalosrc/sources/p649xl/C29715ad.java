package p649xl;

import android.view.View;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.uicontrol.ActionEditText;
import com.zing.zalo.zdesign.component.TrackingImageView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.ad */
/* loaded from: classes3.dex */
public final class C29715ad implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f137254p;

    /* renamed from: q */
    public final TrackingImageView f137255q;

    /* renamed from: r */
    public final ActionEditText f137256r;

    /* renamed from: s */
    public final LinearLayout f137257s;

    private C29715ad(LinearLayout linearLayout, TrackingImageView trackingImageView, ActionEditText actionEditText, LinearLayout linearLayout2) {
        this.f137254p = linearLayout;
        this.f137255q = trackingImageView;
        this.f137256r = actionEditText;
        this.f137257s = linearLayout2;
    }

    /* renamed from: a */
    public static C29715ad m147737a(View view) {
        int i11 = AbstractC6918a0.btn_story_send;
        TrackingImageView trackingImageView = (TrackingImageView) AbstractC22716b.m117526a(view, i11);
        if (trackingImageView != null) {
            i11 = AbstractC6918a0.edt_story_message;
            ActionEditText actionEditText = (ActionEditText) AbstractC22716b.m117526a(view, i11);
            if (actionEditText != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                return new C29715ad(linearLayout, trackingImageView, actionEditText, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f137254p;
    }
}

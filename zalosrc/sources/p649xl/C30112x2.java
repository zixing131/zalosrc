package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.camera.documentscanner.custom.CropPolygonView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.uicomponents.imagebutton.ActiveImageButton;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.x2 */
/* loaded from: classes3.dex */
public final class C30112x2 implements InterfaceC22715a {

    /* renamed from: p */
    private final FrameLayout f139875p;

    /* renamed from: q */
    public final ActiveImageButton f139876q;

    /* renamed from: r */
    public final RobotoTextView f139877r;

    /* renamed from: s */
    public final ActiveImageButton f139878s;

    /* renamed from: t */
    public final FrameLayout f139879t;

    /* renamed from: u */
    public final ProgressBar f139880u;

    /* renamed from: v */
    public final ImageView f139881v;

    /* renamed from: w */
    public final FrameLayout f139882w;

    /* renamed from: x */
    public final FrameLayout f139883x;

    /* renamed from: y */
    public final CropPolygonView f139884y;

    private C30112x2(FrameLayout frameLayout, ActiveImageButton activeImageButton, RobotoTextView robotoTextView, ActiveImageButton activeImageButton2, FrameLayout frameLayout2, ProgressBar progressBar, ImageView imageView, FrameLayout frameLayout3, FrameLayout frameLayout4, CropPolygonView cropPolygonView) {
        this.f139875p = frameLayout;
        this.f139876q = activeImageButton;
        this.f139877r = robotoTextView;
        this.f139878s = activeImageButton2;
        this.f139879t = frameLayout2;
        this.f139880u = progressBar;
        this.f139881v = imageView;
        this.f139882w = frameLayout3;
        this.f139883x = frameLayout4;
        this.f139884y = cropPolygonView;
    }

    /* renamed from: a */
    public static C30112x2 m148677a(View view) {
        int i11 = AbstractC6918a0.btn_back;
        ActiveImageButton activeImageButton = (ActiveImageButton) AbstractC22716b.m117526a(view, i11);
        if (activeImageButton != null) {
            i11 = AbstractC6918a0.btn_done;
            RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView != null) {
                i11 = AbstractC6918a0.btn_rotate;
                ActiveImageButton activeImageButton2 = (ActiveImageButton) AbstractC22716b.m117526a(view, i11);
                if (activeImageButton2 != null) {
                    FrameLayout frameLayout = (FrameLayout) view;
                    i11 = AbstractC6918a0.layout_loading;
                    ProgressBar progressBar = (ProgressBar) AbstractC22716b.m117526a(view, i11);
                    if (progressBar != null) {
                        i11 = AbstractC6918a0.preview_photo_view;
                        ImageView imageView = (ImageView) AbstractC22716b.m117526a(view, i11);
                        if (imageView != null) {
                            i11 = AbstractC6918a0.scanner_bot_panel;
                            FrameLayout frameLayout2 = (FrameLayout) AbstractC22716b.m117526a(view, i11);
                            if (frameLayout2 != null) {
                                i11 = AbstractC6918a0.scanner_top_panel;
                                FrameLayout frameLayout3 = (FrameLayout) AbstractC22716b.m117526a(view, i11);
                                if (frameLayout3 != null) {
                                    i11 = AbstractC6918a0.zalo_polygon_view;
                                    CropPolygonView cropPolygonView = (CropPolygonView) AbstractC22716b.m117526a(view, i11);
                                    if (cropPolygonView != null) {
                                        return new C30112x2(frameLayout, activeImageButton, robotoTextView, activeImageButton2, frameLayout, progressBar, imageView, frameLayout2, frameLayout3, cropPolygonView);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30112x2 m148678c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.document_scanner_layout, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148677a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f139875p;
    }
}

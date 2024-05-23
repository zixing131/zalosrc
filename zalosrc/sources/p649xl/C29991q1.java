package p649xl;

import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageButton;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.camera.colorpalette.ColorPalette;
import com.zing.zalo.camera.sizepicker.SizePicker;
import com.zing.zalo.p077ui.imgdecor.caption.CaptionView;
import com.zing.zalo.p077ui.imgdecor.caption.customview.AutoSizeEditText;
import com.zing.zalo.p077ui.imgdecor.caption.customview.CaptionRoundedTextView;
import com.zing.zalo.p077ui.widget.RobotoButton;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.q1 */
/* loaded from: classes3.dex */
public final class C29991q1 implements InterfaceC22715a {

    /* renamed from: p */
    private final CaptionView f139071p;

    /* renamed from: q */
    public final AppCompatImageButton f139072q;

    /* renamed from: r */
    public final AutoSizeEditText f139073r;

    /* renamed from: s */
    public final AppCompatImageButton f139074s;

    /* renamed from: t */
    public final ColorPalette f139075t;

    /* renamed from: u */
    public final RobotoButton f139076u;

    /* renamed from: v */
    public final CaptionRoundedTextView f139077v;

    /* renamed from: w */
    public final CaptionView f139078w;

    /* renamed from: x */
    public final CaptionRoundedTextView f139079x;

    /* renamed from: y */
    public final SizePicker f139080y;

    /* renamed from: z */
    public final FrameLayout f139081z;

    private C29991q1(CaptionView captionView, AppCompatImageButton appCompatImageButton, AutoSizeEditText autoSizeEditText, AppCompatImageButton appCompatImageButton2, ColorPalette colorPalette, RobotoButton robotoButton, CaptionRoundedTextView captionRoundedTextView, CaptionView captionView2, CaptionRoundedTextView captionRoundedTextView2, SizePicker sizePicker, FrameLayout frameLayout) {
        this.f139071p = captionView;
        this.f139072q = appCompatImageButton;
        this.f139073r = autoSizeEditText;
        this.f139074s = appCompatImageButton2;
        this.f139075t = colorPalette;
        this.f139076u = robotoButton;
        this.f139077v = captionRoundedTextView;
        this.f139078w = captionView2;
        this.f139079x = captionRoundedTextView2;
        this.f139080y = sizePicker;
        this.f139081z = frameLayout;
    }

    /* renamed from: a */
    public static C29991q1 m148385a(View view) {
        int i11 = AbstractC6918a0.caption_align;
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) AbstractC22716b.m117526a(view, i11);
        if (appCompatImageButton != null) {
            i11 = AbstractC6918a0.caption_auto_size_text;
            AutoSizeEditText autoSizeEditText = (AutoSizeEditText) AbstractC22716b.m117526a(view, i11);
            if (autoSizeEditText != null) {
                i11 = AbstractC6918a0.caption_color;
                AppCompatImageButton appCompatImageButton2 = (AppCompatImageButton) AbstractC22716b.m117526a(view, i11);
                if (appCompatImageButton2 != null) {
                    i11 = AbstractC6918a0.caption_color_palette;
                    ColorPalette colorPalette = (ColorPalette) AbstractC22716b.m117526a(view, i11);
                    if (colorPalette != null) {
                        i11 = AbstractC6918a0.caption_done;
                        RobotoButton robotoButton = (RobotoButton) AbstractC22716b.m117526a(view, i11);
                        if (robotoButton != null) {
                            i11 = AbstractC6918a0.caption_font_selector;
                            CaptionRoundedTextView captionRoundedTextView = (CaptionRoundedTextView) AbstractC22716b.m117526a(view, i11);
                            if (captionRoundedTextView != null) {
                                CaptionView captionView = (CaptionView) view;
                                i11 = AbstractC6918a0.caption_mode_selector;
                                CaptionRoundedTextView captionRoundedTextView2 = (CaptionRoundedTextView) AbstractC22716b.m117526a(view, i11);
                                if (captionRoundedTextView2 != null) {
                                    i11 = AbstractC6918a0.caption_size_picker;
                                    SizePicker sizePicker = (SizePicker) AbstractC22716b.m117526a(view, i11);
                                    if (sizePicker != null) {
                                        i11 = AbstractC6918a0.caption_top_panel;
                                        FrameLayout frameLayout = (FrameLayout) AbstractC22716b.m117526a(view, i11);
                                        if (frameLayout != null) {
                                            return new C29991q1(captionView, appCompatImageButton, autoSizeEditText, appCompatImageButton2, colorPalette, robotoButton, captionRoundedTextView, captionView, captionRoundedTextView2, sizePicker, frameLayout);
                                        }
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

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b */
    public CaptionView getRoot() {
        return this.f139071p;
    }
}

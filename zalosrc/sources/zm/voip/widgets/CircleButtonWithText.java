package zm.voip.widgets;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.core.content.res.AbstractC1401h;
import bi0.AbstractC2808b;
import bi0.AbstractC2814h;
import bp0.AbstractC3104p;
import bp0.AbstractC3105q;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.ProgressBar;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ti0.C26705d;
import ti0.C26708g;

/* loaded from: classes7.dex */
public final class CircleButtonWithText extends FrameLayout {

    /* renamed from: u */
    public static final C32482a f149946u = new C32482a(null);

    /* renamed from: p */
    private final int f149947p;

    /* renamed from: q */
    private final CircleBackgroundImageView f149948q;

    /* renamed from: r */
    private final RobotoTextView f149949r;

    /* renamed from: s */
    private final ProgressBar f149950s;

    /* renamed from: t */
    private Drawable f149951t;

    /* renamed from: zm.voip.widgets.CircleButtonWithText$a */
    /* loaded from: classes7.dex */
    public static final class C32482a {
        private C32482a() {
        }

        public /* synthetic */ C32482a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CircleButtonWithText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC19074t.m100208f(context, "context");
    }

    private final String getHideTextTaskKey() {
        return "HIDE_TEXT_TASK_KEY" + hashCode();
    }

    public final CircleBackgroundImageView getButton() {
        return this.f149948q;
    }

    public final ProgressBar getProgressBar() {
        return this.f149950s;
    }

    @Override // android.view.View
    public boolean isEnabled() {
        return this.f149948q.isEnabled();
    }

    @Override // android.view.View
    public boolean isSelected() {
        return this.f149948q.isSelected();
    }

    @Override // android.view.View
    public void setEnabled(boolean z11) {
        this.f149948q.setEnabled(z11);
    }

    public final void setImageDrawable(Drawable drawable) {
        this.f149951t = drawable;
        this.f149948q.setImageDrawable(drawable);
    }

    @Override // android.view.View
    public void setSelected(boolean z11) {
        this.f149948q.setSelected(z11);
    }

    public final void setText(String str) {
        AbstractC19074t.m100208f(str, "text");
        this.f149949r.setText(str);
    }

    public /* synthetic */ CircleButtonWithText(Context context, AttributeSet attributeSet, int i11, int i12, AbstractC19060k abstractC19060k) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircleButtonWithText(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        this.f149947p = AbstractC3104p.m15650a(10.0f);
        CircleBackgroundImageView circleBackgroundImageView = new CircleBackgroundImageView(context, null, 0, 6, null);
        FrameLayout.LayoutParams m15698a = AbstractC3105q.m15698a(-2, -2);
        m15698a.gravity = 8388629;
        circleBackgroundImageView.setLayoutParams(m15698a);
        circleBackgroundImageView.setRedDotMarginLeft(AbstractC3104p.m15650a(0.0f));
        circleBackgroundImageView.setRightRedDot(true);
        circleBackgroundImageView.setRadiusNoti(AbstractC3104p.m15650a(4.0f));
        this.f149948q = circleBackgroundImageView;
        RobotoTextView robotoTextView = new RobotoTextView(context);
        new C26708g(robotoTextView).m137319a(C26705d.m137293a(context, AbstractC2814h.t_xsmall));
        robotoTextView.setTextColor(AbstractC1401h.m7080d(robotoTextView.getResources(), AbstractC2808b.wht_a80, null));
        FrameLayout.LayoutParams m15698a2 = AbstractC3105q.m15698a(-2, -2);
        m15698a2.gravity = 8388629;
        robotoTextView.setLayoutParams(m15698a2);
        robotoTextView.setVisibility(4);
        this.f149949r = robotoTextView;
        ProgressBar progressBar = new ProgressBar(context, AbstractC2814h.ProgressBar_Size24_Blue);
        progressBar.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 8388629));
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(4);
        this.f149950s = progressBar;
        addView(robotoTextView);
        addView(circleBackgroundImageView);
        addView(progressBar);
        setClipChildren(false);
        setClipToPadding(false);
    }
}

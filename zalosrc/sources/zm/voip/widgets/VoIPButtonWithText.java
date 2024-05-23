package zm.voip.widgets;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.p077ui.widget.RobotoTextView;

/* loaded from: classes7.dex */
public class VoIPButtonWithText extends LinearLayout {

    /* renamed from: p */
    VoIPButton f150126p;

    /* renamed from: q */
    RobotoTextView f150127q;

    /* renamed from: zm.voip.widgets.VoIPButtonWithText$a */
    /* loaded from: classes7.dex */
    public interface InterfaceC32505a {
    }

    public VoIPButtonWithText(Context context) {
        super(context);
        m157416a(context);
    }

    /* renamed from: a */
    void m157416a(Context context) {
        this.f150126p = new VoIPButton(context);
        RobotoTextView robotoTextView = new RobotoTextView(context);
        this.f150127q = robotoTextView;
        robotoTextView.setTextColor(-1);
    }

    /* renamed from: b */
    public VoIPButtonWithText m157417b(int i11) {
        this.f150126p.setImageResource(i11);
        return this;
    }

    /* renamed from: c */
    public VoIPButtonWithText m157418c(LinearLayout.LayoutParams layoutParams) {
        this.f150126p.setLayoutParams(layoutParams);
        return this;
    }

    @Override // android.view.View
    public void clearAnimation() {
        this.f150126p.clearAnimation();
    }

    /* renamed from: d */
    public VoIPButtonWithText m157419d(Drawable drawable) {
        this.f150126p.setImageDrawable(drawable);
        return this;
    }

    /* renamed from: e */
    public VoIPButtonWithText m157420e(int i11) {
        this.f150126p.setImageResource(i11);
        return this;
    }

    /* renamed from: f */
    public VoIPButtonWithText m157421f(String str) {
        this.f150127q.setText(str);
        return this;
    }

    /* renamed from: g */
    public VoIPButtonWithText m157422g(ColorStateList colorStateList) {
        this.f150127q.setTextColor(colorStateList);
        return this;
    }

    public VoIPButton getButton() {
        return this.f150126p;
    }

    public RobotoTextView getTextView() {
        return this.f150127q;
    }

    /* renamed from: h */
    public VoIPButtonWithText m157423h(int i11, float f11) {
        this.f150127q.setTextSize(i11, f11);
        return this;
    }

    /* renamed from: i */
    public VoIPButtonWithText m157424i(LinearLayout.LayoutParams layoutParams) {
        this.f150127q.setLayoutParams(layoutParams);
        return this;
    }

    @Override // android.view.View
    public boolean isSelected() {
        return this.f150126p.isSelected();
    }

    /* renamed from: j */
    public VoIPButtonWithText m157425j(boolean z11) {
        int i11;
        RobotoTextView robotoTextView = this.f150127q;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        robotoTextView.setVisibility(i11);
        return this;
    }

    @Override // android.view.View
    public boolean performClick() {
        super.performClick();
        return true;
    }

    public void setAlignmentTextView(int i11) {
        RobotoTextView robotoTextView = this.f150127q;
        if (robotoTextView != null) {
            robotoTextView.setTextAlignment(i11);
        }
    }

    @Override // android.view.View
    public void setAnimation(Animation animation) {
        this.f150126p.setAnimation(animation);
    }

    @Override // android.view.View
    public void setEnabled(boolean z11) {
        super.setEnabled(z11);
        this.f150126p.setEnabled(z11);
        RobotoTextView robotoTextView = this.f150127q;
        if (robotoTextView != null) {
            robotoTextView.setEnabled(z11);
        }
    }

    public void setListener(InterfaceC32505a interfaceC32505a) {
    }

    public void setPaddingBackgroundButton(int i11) {
        this.f150126p.setPadding(i11, i11, i11, i11);
        this.f150126p.setBackgroundResource(AbstractC16803z.bg_button_in_call_screen);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f150126p.getLayoutParams();
        int i12 = i11 * 2;
        layoutParams.width += i12;
        layoutParams.height += i12;
        this.f150126p.setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void setSelected(boolean z11) {
        this.f150126p.setSelected(z11);
    }

    @Override // android.view.View
    public void setVisibility(int i11) {
        super.setVisibility(i11);
    }

    @Override // android.view.View
    public void startAnimation(Animation animation) {
        this.f150126p.startAnimation(animation);
    }

    public VoIPButtonWithText(Context context, int i11) {
        this(context);
        if (i11 == 1) {
            setOrientation(0);
            setGravity(16);
            addView(this.f150126p);
            addView(this.f150127q);
            return;
        }
        if (i11 == 2) {
            setOrientation(0);
            setGravity(16);
            addView(this.f150127q);
            addView(this.f150126p);
            return;
        }
        if (i11 != 3) {
            return;
        }
        setOrientation(1);
        setGravity(1);
        addView(this.f150126p);
        addView(this.f150127q);
    }
}

package com.zing.zalo.p077ui.picker.mediapicker;

import android.content.Context;
import android.graphics.Rect;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import me0.C23212s8;
import on0.AbstractC24342w;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import y50.C30795e;

/* loaded from: classes6.dex */
public final class MediaPickerPermissionBanner extends RobotoTextView {

    /* renamed from: A */
    private int f66516A;

    /* renamed from: B */
    private int f66517B;

    /* renamed from: C */
    private int f66518C;

    /* renamed from: D */
    private int f66519D;

    /* renamed from: E */
    private final Rect f66520E;

    /* renamed from: F */
    private final InterfaceC24854k f66521F;

    /* renamed from: G */
    private InterfaceC18494a f66522G;

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.MediaPickerPermissionBanner$a */
    /* loaded from: classes6.dex */
    public static final class C12780a extends ClickableSpan {
        C12780a() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            AbstractC19074t.m100208f(view, "widget");
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            AbstractC19074t.m100208f(textPaint, "ds");
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
            textPaint.setColor(C23212s8.m119607o(MediaPickerPermissionBanner.this.getContext(), AbstractC16781w.LinkColor));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaPickerPermissionBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(context, "context");
        this.f66520E = new Rect();
        m129210a = AbstractC24856m.m129210a(new C12841c(this));
        this.f66521F = m129210a;
    }

    private final C30795e getLayoutWrapper() {
        return (C30795e) this.f66521F.getValue();
    }

    /* renamed from: i */
    private final void m72073i(InterfaceC18494a interfaceC18494a) {
        int m127173b0;
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_gallery_limited_banner_manage);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        SpannableString spannableString = new SpannableString(AbstractC23136l9.m118743r0(AbstractC8020f0.str_gallery_limited_banner_title) + " " + m118743r0);
        C12780a c12780a = new C12780a();
        m127173b0 = AbstractC24342w.m127173b0(spannableString, m118743r0, 0, false, 6, null);
        this.f66516A = m127173b0;
        int length = m127173b0 + m118743r0.length();
        this.f66518C = length;
        spannableString.setSpan(c12780a, this.f66516A, length, 33);
        setText(spannableString);
        this.f66522G = interfaceC18494a;
    }

    /* renamed from: j */
    public final void m72074j(InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(interfaceC18494a, "onClickManage");
        CharSequence text = getText();
        AbstractC19074t.m100207e(text, "getText(...)");
        if (text.length() == 0) {
            m72073i(interfaceC18494a);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        this.f66517B = C30795e.m149801g(getLayoutWrapper(), this.f66516A, false, 2, null);
        this.f66519D = getLayoutWrapper().m149808f(this.f66518C, true);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC19074t.m100208f(motionEvent, "event");
        if (motionEvent.getActionMasked() == 1) {
            int scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
            int x11 = (((int) motionEvent.getX()) - getTotalPaddingLeft()) + getScrollX();
            int y11 = (((int) motionEvent.getY()) - getTotalPaddingTop()) + getScrollY();
            int i11 = this.f66517B;
            int i12 = this.f66519D;
            if (i11 <= i12) {
                boolean z11 = false;
                while (true) {
                    getLayoutWrapper().m149804b(this.f66516A, this.f66518C, i11, this.f66520E);
                    int i13 = -scaledTouchSlop;
                    this.f66520E.inset(i13, i13);
                    if (this.f66520E.contains(x11, y11)) {
                        performClick();
                        InterfaceC18494a interfaceC18494a = this.f66522G;
                        if (interfaceC18494a != null) {
                            interfaceC18494a.mo12V4();
                        }
                        z11 = true;
                    }
                    if (i11 == i12) {
                        break;
                    }
                    i11++;
                }
                if (z11) {
                    return true;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaPickerPermissionBanner(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(context, "context");
        this.f66520E = new Rect();
        m129210a = AbstractC24856m.m129210a(new C12841c(this));
        this.f66521F = m129210a;
    }
}

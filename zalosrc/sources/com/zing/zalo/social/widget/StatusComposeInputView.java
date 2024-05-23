package com.zing.zalo.social.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC6918a0;
import me0.AbstractC23136l9;

/* loaded from: classes5.dex */
public class StatusComposeInputView extends RelativeLayout {

    /* renamed from: p */
    private View f55001p;

    /* renamed from: q */
    private View f55002q;

    /* renamed from: r */
    private TouchDelegate f55003r;

    /* renamed from: com.zing.zalo.social.widget.StatusComposeInputView$a */
    /* loaded from: classes5.dex */
    public static class C10893a extends TouchDelegate {

        /* renamed from: a */
        private final TouchDelegate[] f55004a;

        public C10893a(View view, TouchDelegate[] touchDelegateArr) {
            super(new Rect(), view);
            this.f55004a = touchDelegateArr;
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            int i11 = 0;
            while (true) {
                TouchDelegate[] touchDelegateArr = this.f55004a;
                if (i11 >= touchDelegateArr.length) {
                    return false;
                }
                if (touchDelegateArr[i11].onTouchEvent(motionEvent)) {
                    return true;
                }
                i11++;
            }
        }
    }

    public StatusComposeInputView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    private void m56534a(int i11, int i12) {
        try {
            this.f55003r = AbstractC23136l9.m118757w(this.f55002q, 10);
            setTouchDelegate(new C10893a(this, new TouchDelegate[]{this.f55003r, AbstractC23136l9.m118760x(this.f55001p, i11, i12)}));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public TouchDelegate getEmojiTouchDelegate() {
        return this.f55003r;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f55001p = findViewById(AbstractC6918a0.etDesc);
        this.f55002q = findViewById(AbstractC6918a0.feed_btn_open_emoji_tab);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        if (z11) {
            m56534a(i12, i14);
        }
    }
}

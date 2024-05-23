package p529tu;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;

/* renamed from: tu.a */
/* loaded from: classes4.dex */
public class C26896a extends LinkMovementMethod {

    /* renamed from: b */
    private static LinkMovementMethod f127284b;

    /* renamed from: a */
    private a f127285a;

    /* renamed from: tu.a$a */
    /* loaded from: classes4.dex */
    public static abstract class a extends ClickableSpan {

        /* renamed from: p */
        private boolean f127286p;

        /* renamed from: q */
        private final int f127287q;

        /* renamed from: r */
        private final int f127288r;

        public a(int i11, int i12) {
            this.f127287q = i11;
            this.f127288r = i12;
        }

        /* renamed from: a */
        public void m138614a(boolean z11) {
            this.f127286p = z11;
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            int i11;
            super.updateDrawState(textPaint);
            if (this.f127286p) {
                i11 = this.f127288r;
            } else {
                i11 = this.f127287q;
            }
            textPaint.setColor(i11);
            textPaint.setUnderlineText(false);
        }
    }

    /* renamed from: a */
    private a m138612a(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int x11 = (((int) motionEvent.getX()) - textView.getTotalPaddingLeft()) + textView.getScrollX();
        int y11 = (((int) motionEvent.getY()) - textView.getTotalPaddingTop()) + textView.getScrollY();
        Layout layout = textView.getLayout();
        int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(y11), x11);
        a[] aVarArr = (a[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, a.class);
        if (aVarArr.length > 0 && m138613b(offsetForHorizontal, spannable, aVarArr[0])) {
            return aVarArr[0];
        }
        return null;
    }

    /* renamed from: b */
    private boolean m138613b(int i11, Spannable spannable, Object obj) {
        if (i11 >= spannable.getSpanStart(obj) && i11 <= spannable.getSpanEnd(obj)) {
            return true;
        }
        return false;
    }

    public static MovementMethod getInstance() {
        if (f127284b == null) {
            f127284b = new C26896a();
        }
        return f127284b;
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            a m138612a = m138612a(textView, spannable, motionEvent);
            this.f127285a = m138612a;
            if (m138612a != null) {
                m138612a.m138614a(true);
                Selection.setSelection(spannable, spannable.getSpanStart(this.f127285a), spannable.getSpanEnd(this.f127285a));
            }
        } else if (motionEvent.getAction() == 2) {
            a m138612a2 = m138612a(textView, spannable, motionEvent);
            a aVar = this.f127285a;
            if (aVar != null && m138612a2 != aVar) {
                aVar.m138614a(false);
                this.f127285a = null;
                Selection.removeSelection(spannable);
            }
        } else {
            a aVar2 = this.f127285a;
            if (aVar2 != null) {
                aVar2.m138614a(false);
                super.onTouchEvent(textView, spannable, motionEvent);
            }
            this.f127285a = null;
            Selection.removeSelection(spannable);
        }
        return true;
    }
}

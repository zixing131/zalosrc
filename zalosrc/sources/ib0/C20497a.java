package ib0;

import android.text.Layout;
import android.text.NoCopySpan;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.ScrollingMovementMethod;
import android.text.style.ClickableSpan;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;

/* renamed from: ib0.a */
/* loaded from: classes6.dex */
public class C20497a extends ScrollingMovementMethod {

    /* renamed from: a */
    private static C20497a f100743a;

    /* renamed from: b */
    private static final Object f100744b = new NoCopySpan.Concrete();

    /* renamed from: a */
    private boolean m106530a(int i11, TextView textView, Spannable spannable) {
        Layout layout = textView.getLayout();
        int totalPaddingTop = textView.getTotalPaddingTop() + textView.getTotalPaddingBottom();
        int scrollY = textView.getScrollY();
        int height = (textView.getHeight() + scrollY) - totalPaddingTop;
        int lineForVertical = layout.getLineForVertical(scrollY);
        int lineForVertical2 = layout.getLineForVertical(height);
        int lineStart = layout.getLineStart(lineForVertical);
        int lineEnd = layout.getLineEnd(lineForVertical2);
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(lineStart, lineEnd, ClickableSpan.class);
        int selectionStart = Selection.getSelectionStart(spannable);
        int selectionEnd = Selection.getSelectionEnd(spannable);
        int min = Math.min(selectionStart, selectionEnd);
        int max = Math.max(selectionStart, selectionEnd);
        if (min < 0 && spannable.getSpanStart(f100744b) >= 0) {
            min = spannable.length();
            max = min;
        }
        if (min > lineEnd) {
            max = Integer.MAX_VALUE;
            min = Integer.MAX_VALUE;
        }
        int i12 = -1;
        if (max < lineStart) {
            max = -1;
            min = -1;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    int i13 = Integer.MAX_VALUE;
                    int i14 = Integer.MAX_VALUE;
                    for (int i15 = 0; i15 < clickableSpanArr.length; i15++) {
                        int spanStart = spannable.getSpanStart(clickableSpanArr[i15]);
                        if ((spanStart > min || min == max) && spanStart < i14) {
                            i13 = spannable.getSpanEnd(clickableSpanArr[i15]);
                            i14 = spanStart;
                        }
                    }
                    if (i13 < Integer.MAX_VALUE) {
                        Selection.setSelection(spannable, i14, i13);
                        return true;
                    }
                }
            } else {
                int i16 = -1;
                for (int i17 = 0; i17 < clickableSpanArr.length; i17++) {
                    int spanEnd = spannable.getSpanEnd(clickableSpanArr[i17]);
                    if ((spanEnd < max || min == max) && spanEnd > i16) {
                        i12 = spannable.getSpanStart(clickableSpanArr[i17]);
                        i16 = spanEnd;
                    }
                }
                if (i12 >= 0) {
                    Selection.setSelection(spannable, i16, i12);
                    return true;
                }
            }
        } else {
            if (min == max) {
                return false;
            }
            ClickableSpan[] clickableSpanArr2 = (ClickableSpan[]) spannable.getSpans(min, max, ClickableSpan.class);
            if (clickableSpanArr2.length != 1) {
                return false;
            }
            m106533d(clickableSpanArr2[0], textView);
        }
        return false;
    }

    /* renamed from: b */
    private boolean m106531b() {
        return true;
    }

    /* renamed from: c */
    public static C20497a m106532c() {
        if (f100743a == null) {
            f100743a = new C20497a();
        }
        return f100743a;
    }

    /* renamed from: d */
    public void m106533d(ClickableSpan clickableSpan, TextView textView) {
        clickableSpan.onClick(textView);
    }

    @Override // android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod
    protected boolean down(TextView textView, Spannable spannable) {
        if (m106530a(3, textView, spannable)) {
            return true;
        }
        return super.down(textView, spannable);
    }

    @Override // android.text.method.BaseMovementMethod
    protected boolean handleMovementKey(TextView textView, Spannable spannable, int i11, int i12, KeyEvent keyEvent) {
        if ((i11 == 23 || i11 == 66) && KeyEvent.metaStateHasNoModifiers(i12) && keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0 && m106530a(1, textView, spannable)) {
            return true;
        }
        return super.handleMovementKey(textView, spannable, i11, i12, keyEvent);
    }

    @Override // android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public void initialize(TextView textView, Spannable spannable) {
        Selection.removeSelection(spannable);
        spannable.removeSpan(f100744b);
    }

    @Override // android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod
    protected boolean left(TextView textView, Spannable spannable) {
        if (m106530a(2, textView, spannable)) {
            return true;
        }
        return super.left(textView, spannable);
    }

    @Override // android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public void onTakeFocus(TextView textView, Spannable spannable, int i11) {
        Selection.removeSelection(spannable);
        if ((i11 & 1) != 0) {
            spannable.setSpan(f100744b, 0, 0, 34);
        } else {
            spannable.removeSpan(f100744b);
        }
    }

    @Override // android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 1 || action == 0) {
            int x11 = (int) motionEvent.getX();
            int y11 = (int) motionEvent.getY();
            int totalPaddingLeft = x11 - textView.getTotalPaddingLeft();
            int totalPaddingTop = y11 - textView.getTotalPaddingTop();
            int scrollX = totalPaddingLeft + textView.getScrollX();
            int scrollY = totalPaddingTop + textView.getScrollY();
            Layout layout = textView.getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), scrollX);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length != 0) {
                if (action == 1) {
                    if (m106531b()) {
                        m106533d(clickableSpanArr[0], textView);
                    }
                } else {
                    Selection.setSelection(spannable, spannable.getSpanStart(clickableSpanArr[0]), spannable.getSpanEnd(clickableSpanArr[0]));
                }
                return true;
            }
            Selection.removeSelection(spannable);
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }

    @Override // android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod
    protected boolean right(TextView textView, Spannable spannable) {
        if (m106530a(3, textView, spannable)) {
            return true;
        }
        return super.right(textView, spannable);
    }

    @Override // android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod
    protected boolean up(TextView textView, Spannable spannable) {
        if (m106530a(2, textView, spannable)) {
            return true;
        }
        return super.up(textView, spannable);
    }
}

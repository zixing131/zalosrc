package com.zing.zalo.social.widget;

import android.R;
import android.content.Context;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.ArrowKeyMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView;
import com.zing.zalo.p077ui.widget.RobotoEditText;

/* loaded from: classes5.dex */
public class StatusComposeEditText extends RobotoEditText {

    /* renamed from: z */
    private InterfaceC10892b f55000z;

    /* loaded from: classes5.dex */
    public static class TagColorSpan extends ForegroundColorSpan {
        public TagColorSpan(int i11) {
            super(i11);
        }
    }

    /* renamed from: com.zing.zalo.social.widget.StatusComposeEditText$a */
    /* loaded from: classes5.dex */
    public static class C10891a extends ArrowKeyMovementMethod {
        @Override // android.text.method.ArrowKeyMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
        public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
            int i11;
            Object tag;
            try {
                if (motionEvent.getAction() == 1) {
                    int x11 = (int) motionEvent.getX();
                    int y11 = (int) motionEvent.getY();
                    int totalPaddingLeft = x11 - textView.getTotalPaddingLeft();
                    int totalPaddingTop = y11 - textView.getTotalPaddingTop();
                    int scrollX = totalPaddingLeft + textView.getScrollX();
                    int scrollY = totalPaddingTop + textView.getScrollY();
                    Layout layout = textView.getLayout();
                    int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), scrollX);
                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                    if ((textView instanceof StatusComposeEditText) && (tag = textView.getTag()) != null && (tag instanceof Integer)) {
                        i11 = ((Integer) textView.getTag()).intValue();
                        if (i11 == 1) {
                            textView.setTag(0);
                        }
                    } else {
                        i11 = 0;
                    }
                    if (clickableSpanArr.length != 0 && i11 != 1) {
                        clickableSpanArr[0].onClick(textView);
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
            return super.onTouchEvent(textView, spannable, motionEvent);
        }
    }

    /* renamed from: com.zing.zalo.social.widget.StatusComposeEditText$b */
    /* loaded from: classes5.dex */
    public interface InterfaceC10892b {
        /* renamed from: a */
        void mo56530a();

        /* renamed from: b */
        void mo56531b();

        /* renamed from: c */
        void mo56532c();

        /* renamed from: d */
        void mo56533d(int i11, int i12, boolean z11);
    }

    public StatusComposeEditText(Context context) {
        super(context);
        setMovementMethod(new C10891a());
    }

    private int getEndIndex() {
        Editable text = getText();
        TagColorSpan[] tagColorSpanArr = (TagColorSpan[]) getText().getSpans(0, text.length(), TagColorSpan.class);
        int length = text.length();
        for (TagColorSpan tagColorSpan : tagColorSpanArr) {
            int spanStart = text.getSpanStart(tagColorSpan);
            if (spanStart != -1 && spanStart < length) {
                length = spanStart;
            }
        }
        return Math.max(0, length);
    }

    @Override // android.widget.EditText
    public void extendSelection(int i11) {
        super.extendSelection(Math.min(i11, getEndIndex()));
    }

    public CharSequence getUserText() {
        try {
            return new SpannableString(getText()).subSequence(0, getEndIndex());
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    @Override // android.widget.TextView
    protected void onSelectionChanged(int i11, int i12) {
        super.onSelectionChanged(i11, i12);
        int endIndex = getEndIndex();
        if (i11 >= 0 && i11 <= endIndex) {
            if (i12 < 0 || i12 > endIndex) {
                setSelection(i11, i12);
                return;
            }
            return;
        }
        setSelection(i12);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i11) {
        int i12;
        if (getText() != null) {
            getText().length();
        }
        if (isFocused()) {
            int selectionStart = getSelectionStart();
            int selectionEnd = getSelectionEnd();
            i12 = Math.max(0, Math.min(selectionStart, selectionEnd));
            Math.max(0, Math.max(selectionStart, selectionEnd));
        } else {
            i12 = 0;
        }
        boolean onTextContextMenuItem = super.onTextContextMenuItem(i11);
        if (i11 != 16908337) {
            switch (i11) {
                case R.id.cut:
                    InterfaceC10892b interfaceC10892b = this.f55000z;
                    if (interfaceC10892b != null) {
                        interfaceC10892b.mo56530a();
                        break;
                    }
                    break;
                case R.id.copy:
                    InterfaceC10892b interfaceC10892b2 = this.f55000z;
                    if (interfaceC10892b2 != null) {
                        interfaceC10892b2.mo56531b();
                        break;
                    }
                    break;
                case R.id.paste:
                    InterfaceC10892b interfaceC10892b3 = this.f55000z;
                    if (interfaceC10892b3 != null) {
                        interfaceC10892b3.mo56532c();
                        this.f55000z.mo56533d(i12, Math.max(0, Math.max(i12, getSelectionEnd())), true);
                        break;
                    }
                    break;
            }
        } else {
            InterfaceC10892b interfaceC10892b4 = this.f55000z;
            if (interfaceC10892b4 != null) {
                interfaceC10892b4.mo56532c();
                this.f55000z.mo56533d(i12, Math.max(0, Math.max(i12, getSelectionEnd())), false);
            }
        }
        return onTextContextMenuItem;
    }

    @Override // android.widget.EditText
    public void setSelection(int i11) {
        super.setSelection(Math.min(i11, getEndIndex()));
    }

    public void setTextContextChangeListener(InterfaceC10892b interfaceC10892b) {
        this.f55000z = interfaceC10892b;
    }

    @Override // android.widget.EditText
    public void setSelection(int i11, int i12) {
        int endIndex = getEndIndex();
        super.setSelection(Math.min(Math.max(0, i11), endIndex), Math.min(Math.max(0, i12), endIndex));
    }

    public StatusComposeEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setMovementMethod(new C10891a());
    }
}

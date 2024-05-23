package com.zing.zalo.uicontrol;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Editable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.zing.zalo.p077ui.widget.EditTextWithContextMenu;
import com.zing.zalo.social.controls.MentionSpan;
import me0.AbstractC23136l9;
import me0.AbstractC23214t;
import mm0.AbstractC23350e;
import p348mi.AbstractC23309i;

/* loaded from: classes4.dex */
public class ActionEditText extends EditTextWithContextMenu {

    /* renamed from: E */
    private InterfaceC16448a f83072E;

    /* renamed from: F */
    private String f83073F;

    /* renamed from: G */
    private String f83074G;

    /* renamed from: H */
    private StaticLayout f83075H;

    /* renamed from: I */
    private int f83076I;

    /* renamed from: J */
    private int f83077J;

    /* renamed from: K */
    InterfaceC16449b f83078K;

    /* renamed from: com.zing.zalo.uicontrol.ActionEditText$a */
    /* loaded from: classes4.dex */
    public interface InterfaceC16448a {
        /* renamed from: a */
        void mo87301a(ActionEditText actionEditText, String str, KeyEvent keyEvent);
    }

    /* renamed from: com.zing.zalo.uicontrol.ActionEditText$b */
    /* loaded from: classes4.dex */
    public interface InterfaceC16449b {
        /* renamed from: a */
        void mo76217a(int i11, int i12);
    }

    public ActionEditText(Context context) {
        super(context);
    }

    /* renamed from: E */
    private String m87661E(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        if (charSequence.length() > 1 && charSequence.charAt(0) == '@') {
            int indexOf = TextUtils.indexOf(charSequence, ' ');
            if (indexOf != -1) {
                return charSequence.subSequence(0, indexOf + 1).toString();
            }
        } else if (TextUtils.equals(charSequence, "/")) {
            return "/";
        }
        return null;
    }

    public InterfaceC16448a getmOnImeBack() {
        return this.f83072E;
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (AbstractC23309i.m121699a0()) {
            editorInfo.imeOptions &= -1073741825;
        }
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
            if (this.f83075H != null && TextUtils.equals(this.f83074G, getText())) {
                TextPaint paint = getPaint();
                int color = getPaint().getColor();
                paint.setColor(-5066062);
                canvas.save();
                canvas.translate(this.f83076I, this.f83077J);
                this.f83075H.draw(canvas);
                canvas.restore();
                paint.setColor(color);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onKeyPreIme(int i11, KeyEvent keyEvent) {
        InterfaceC16448a interfaceC16448a;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1 && (interfaceC16448a = this.f83072E) != null) {
            interfaceC16448a.mo87301a(this, getText().toString(), keyEvent);
            return true;
        }
        return super.onKeyPreIme(i11, keyEvent);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        this.f83075H = null;
        String str = this.f83073F;
        if (str != null && str.length() > 0) {
            String m87661E = m87661E(getText());
            this.f83074G = m87661E;
            if (m87661E != null) {
                TextPaint paint = getPaint();
                int ceil = (int) Math.ceil(paint.measureText(this.f83074G));
                int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - ceil;
                try {
                    this.f83075H = AbstractC23214t.m119624k(TextUtils.ellipsize(this.f83073F, paint, measuredWidth, TextUtils.TruncateAt.END), paint, measuredWidth);
                    this.f83076I = ceil + getPaddingLeft();
                    if (this.f83075H.getLineCount() > 0) {
                        this.f83076I = (int) (this.f83076I - this.f83075H.getLineLeft(0));
                    }
                    this.f83077J = ((getMeasuredHeight() - this.f83075H.getLineBottom(0)) / 2) + AbstractC23136l9.m118742r(0.5f);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
    }

    @Override // android.widget.TextView
    protected void onSelectionChanged(int i11, int i12) {
        super.onSelectionChanged(i11, i12);
        InterfaceC16449b interfaceC16449b = this.f83078K;
        if (interfaceC16449b != null) {
            interfaceC16449b.mo76217a(i11, i12);
        }
        Editable text = getText();
        MentionSpan[] mentionSpanArr = (MentionSpan[]) getText().getSpans(0, text.length(), MentionSpan.class);
        int length = mentionSpanArr.length;
        for (int i13 = 0; i13 < length; i13++) {
            int spanStart = text.getSpanStart(mentionSpanArr[i13]);
            int spanEnd = text.getSpanEnd(mentionSpanArr[i13]);
            if (i11 < i12 && i11 > spanStart && i11 < spanEnd && i12 > spanStart && i12 < spanEnd) {
                setSelection(spanStart, spanEnd);
                return;
            }
            if (i11 < i12 && i12 > spanStart && i12 < spanEnd) {
                setSelection(i11, spanEnd);
                return;
            }
            if (i11 < i12 && i11 > spanStart && i11 < spanEnd) {
                setSelection(spanStart, i12);
                return;
            } else {
                if (i11 > spanStart && i12 < spanEnd) {
                    setSelection(spanEnd);
                    return;
                }
            }
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i11) {
        if (getText() == null) {
            return super.onTextContextMenuItem(i11);
        }
        boolean z11 = false;
        try {
            CharSequence concat = TextUtils.concat(getText(), "");
            int length = concat.length();
            int length2 = concat.length();
            if (isFocused()) {
                int selectionStart = getSelectionStart();
                int selectionEnd = getSelectionEnd();
                int max = Math.max(0, Math.min(selectionStart, selectionEnd));
                length2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                length = max;
            }
            z11 = super.onTextContextMenuItem(i11);
            if (i11 == 16908322 && getTextContextChangeListener() != null) {
                getTextContextChangeListener().mo60447b(concat, length, length2);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        return z11;
    }

    public void setCaption(String str) {
        if (TextUtils.equals(this.f83073F, str)) {
            return;
        }
        this.f83073F = str;
        if (str != null) {
            this.f83073F = str.replace('\n', ' ');
        }
        requestLayout();
    }

    public void setSelectionChangedListener(InterfaceC16449b interfaceC16449b) {
        this.f83078K = interfaceC16449b;
    }

    public void setmOnImeBack(InterfaceC16448a interfaceC16448a) {
        this.f83072E = interfaceC16448a;
    }

    public ActionEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

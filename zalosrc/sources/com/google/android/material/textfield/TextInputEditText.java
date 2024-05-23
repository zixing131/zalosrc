package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.AppCompatEditText;
import com.google.android.material.internal.AbstractC6337d;
import com.google.android.material.internal.AbstractC6355v;
import p013a7.AbstractC0638a;
import p357n6.AbstractC23577b;
import p357n6.AbstractC23579d;
import p357n6.AbstractC23581f;
import p357n6.AbstractC23586k;
import p357n6.AbstractC23587l;

/* loaded from: classes3.dex */
public class TextInputEditText extends AppCompatEditText {

    /* renamed from: s */
    private final Rect f35976s;

    /* renamed from: t */
    private boolean f35977t;

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC23577b.editTextStyle);
    }

    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    /* renamed from: h */
    private String m33049h(TextInputLayout textInputLayout) {
        String str;
        Editable text = getText();
        CharSequence hint = textInputLayout.getHint();
        boolean z11 = !TextUtils.isEmpty(text);
        boolean z12 = !TextUtils.isEmpty(hint);
        setLabelFor(AbstractC23581f.textinput_helper_text);
        String str2 = "";
        if (!z12) {
            str = "";
        } else {
            str = hint.toString();
        }
        if (z11) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append((Object) text);
            if (!TextUtils.isEmpty(str)) {
                str2 = ", " + str;
            }
            sb2.append(str2);
            return sb2.toString();
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.f35977t && rect != null) {
            textInputLayout.getFocusedRect(this.f35976s);
            rect.bottom = this.f35976s.bottom;
        }
    }

    @Override // android.view.View
    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        boolean globalVisibleRect = super.getGlobalVisibleRect(rect, point);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.f35977t && rect != null) {
            textInputLayout.getGlobalVisibleRect(this.f35976s, point);
            rect.bottom = this.f35976s.bottom;
        }
        return globalVisibleRect;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.m33122Q()) {
            return textInputLayout.getHint();
        }
        return super.getHint();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.m33122Q() && super.getHint() == null && AbstractC6337d.m32558a()) {
            setHint("");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (Build.VERSION.SDK_INT < 23 && textInputLayout != null) {
            accessibilityNodeInfo.setText(m33049h(textInputLayout));
        }
    }

    @Override // android.view.View
    public boolean requestRectangleOnScreen(Rect rect) {
        boolean requestRectangleOnScreen = super.requestRectangleOnScreen(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.f35977t) {
            this.f35976s.set(0, textInputLayout.getHeight() - getResources().getDimensionPixelOffset(AbstractC23579d.mtrl_edittext_rectangle_top_offset), textInputLayout.getWidth(), textInputLayout.getHeight());
            textInputLayout.requestRectangleOnScreen(this.f35976s, true);
        }
        return requestRectangleOnScreen;
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z11) {
        this.f35977t = z11;
    }

    public TextInputEditText(Context context, AttributeSet attributeSet, int i11) {
        super(AbstractC0638a.m909c(context, attributeSet, i11, 0), attributeSet, i11);
        this.f35976s = new Rect();
        TypedArray m32639h = AbstractC6355v.m32639h(context, attributeSet, AbstractC23587l.TextInputEditText, i11, AbstractC23586k.Widget_Design_TextInputEditText, new int[0]);
        setTextInputLayoutFocusedRectEnabled(m32639h.getBoolean(AbstractC23587l.TextInputEditText_textInputLayoutFocusedRectEnabled, false));
        m32639h.recycle();
    }
}

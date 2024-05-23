package com.zing.zalo.zinstant.zom.properties;

import com.zing.zalo.zinstant.zom.node.ZOMText;
import com.zing.zalo.zinstant.zom.text.ZOMTextSpan;
import vj0.AbstractC28268b;

/* loaded from: classes7.dex */
public class ZOMInputText {
    public ZOMText holder;
    public boolean isAutoComplete;
    public String mask;
    public int maxLength;
    public ZOMText value;

    public static ZOMInputText createObject() {
        return new ZOMInputText();
    }

    private byte[] maskedInput(String str, String str2, int i11) {
        return __ZOMInputText_zjni.maskedInput(this, str, str2, i11);
    }

    private byte[] unMaskInput(String str, String str2) {
        return __ZOMInputText_zjni.unMaskInput(this, str, str2);
    }

    public void afterTextChanged(String str) {
        setText(str);
        __ZOMInputText_zjni.afterTextChanged(this, str);
    }

    public void onFocusChange(boolean z11) {
        __ZOMInputText_zjni.onFocusChange(this, z11);
    }

    public void onTextChanged(String str) {
        __ZOMInputText_zjni.onTextChanged(this, str);
    }

    public String preMaskedInput(String str, String str2, int i11) {
        return AbstractC28268b.m142407b(maskedInput(str, str2, i11));
    }

    public String preUnMaskInput(String str, String str2) {
        return AbstractC28268b.m142407b(unMaskInput(str, str2));
    }

    public void setBound(ZOMRect zOMRect) {
        ZOMText zOMText = this.value;
        if (zOMText != null && zOMText.mBound == null) {
            zOMText.mBound = zOMRect;
        }
        ZOMText zOMText2 = this.holder;
        if (zOMText2 != null && zOMText2.mBound == null) {
            zOMText2.mBound = zOMRect;
        }
    }

    public void setData(ZOMText zOMText, ZOMText zOMText2, byte[] bArr, boolean z11, int i11) {
        this.value = zOMText;
        this.holder = zOMText2;
        this.mask = AbstractC28268b.m142407b(bArr);
        this.isAutoComplete = z11;
        this.maxLength = i11;
    }

    public void setText(String str) {
        ZOMTextSpan zOMTextSpan;
        ZOMTextSpan[] zOMTextSpanArr = this.value.mParagraph;
        if (zOMTextSpanArr != null && (zOMTextSpan = zOMTextSpanArr[0]) != null) {
            zOMTextSpan.text = str;
        }
    }
}

package com.zing.zalo.zinstant.zom.node;

import android.text.TextUtils;
import com.zing.zalo.adapter.AbstractC6921a;
import com.zing.zalo.zinstant.InterfaceC17139d;
import com.zing.zalo.zinstant.zom.text.ZOMTextSpan;
import tk0.C26730b;

/* loaded from: classes7.dex */
public class ZOMText extends ZOM {
    public ZOMTextSpan[] mParagraph;
    public int mTextAlignment = 0;
    public float mTextSpacingMult = 1.0f;
    public float mTextSpacingAdd = 0.0f;
    public int mMaxLines = 0;
    public float mTextLetterSpacing = 0.0f;

    /* loaded from: classes7.dex */
    public static class ZOMTextFactory extends AbstractC6921a {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.zing.zalo.adapter.AbstractC6921a
        public ZOMText create() {
            return ZOMText.access$000();
        }
    }

    static /* synthetic */ ZOMText access$000() {
        return requireNewObject();
    }

    public static ZOMText createObject() {
        return requireNewObject();
    }

    private static ZOMText requireNewObject() {
        return new ZOMText();
    }

    @Override // com.zing.zalo.zinstant.zom.node.ZOM
    public boolean checkIntegrityParam(InterfaceC17139d interfaceC17139d, C26730b c26730b) {
        ZOMTextSpan[] zOMTextSpanArr;
        if (this.mType == 0 && (zOMTextSpanArr = this.mParagraph) != null) {
            for (ZOMTextSpan zOMTextSpan : zOMTextSpanArr) {
                if (zOMTextSpan != null && !TextUtils.equals(zOMTextSpan.getContent(interfaceC17139d, c26730b), zOMTextSpan.text)) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public ZOMTextSpan[] getParagraph() {
        return this.mParagraph;
    }

    public String getPlainText() {
        if (this.mParagraph == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        for (ZOMTextSpan zOMTextSpan : this.mParagraph) {
            sb2.append(zOMTextSpan.text);
        }
        return sb2.toString();
    }

    public void onClickTextSpan(ZOMTextSpan zOMTextSpan) {
        onClickTextSpan(zOMTextSpan.mNativePointer);
    }

    public void setData(Object[] objArr, int i11, float f11, float f12, int i12, boolean z11) {
        this.mParagraph = (ZOMTextSpan[]) objArr;
        this.mTextAlignment = i11;
        this.mTextLetterSpacing = f11;
        this.mTextSpacingMult = f12;
        this.mMaxLines = i12;
        if (z11) {
            this.layoutFlag |= 16;
        }
        onPropertyChange();
    }

    private void onClickTextSpan(long j11) {
        __ZOMText_zjni.onClickTextSpan(this, j11);
    }
}

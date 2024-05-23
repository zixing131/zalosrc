package com.zing.zalo.zinstant.zom.text;

import android.text.TextUtils;
import com.zing.zalo.zinstant.InterfaceC17139d;
import com.zing.zalo.zinstant.zom.properties.ZOMBackground;
import com.zing.zalo.zinstant.zom.properties.ZOMClick;
import com.zing.zalo.zinstant.zom.properties.ZOMConditionParam;
import nk0.C23829h1;
import tk0.C26730b;
import vj0.AbstractC28268b;

/* loaded from: classes7.dex */
public class ZOMTextSpan {
    public int fontWeight;
    public ZOMBackground mBackground;
    public ZOMClick mClick;
    public ZOMConditionParam mCondition;
    public ZOMClick mLongClick;
    public volatile String text = "";
    public int textSize = 0;
    public boolean bold = false;
    public boolean italic = false;
    public boolean underline = false;
    public int textColor = 0;
    public boolean strikeThrough = false;
    public boolean emoticonEnabled = false;
    public String fontFamily = "";
    public String fontUrl = "";
    public boolean keepFontSize = false;
    public float fontScale = 1.0f;

    /* renamed from: id */
    public String f88013id = "";
    public long mNativePointer = 0;
    public float screenScale = 1.0f;
    public float mOpacity = 1.0f;
    public float mOuterOpacity = 1.0f;
    public boolean isDeleted = false;
    private final C23829h1 textSpanForMeasureOnly = new C23829h1(this);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zinstant.zom.text.ZOMTextSpan$a */
    /* loaded from: classes7.dex */
    public static class C17286a {
        /* renamed from: a */
        public void m92124a(ZOMTextSpan zOMTextSpan, int i11, int i12) {
            if (i11 < 2) {
                int i13 = zOMTextSpan.textColor;
                if (i13 == Integer.MIN_VALUE) {
                    i13 = 0;
                }
                zOMTextSpan.textColor = i13;
            }
        }
    }

    public static ZOMTextSpan createObject() {
        return new ZOMTextSpan();
    }

    public String getContent(InterfaceC17139d interfaceC17139d, C26730b c26730b) {
        String mo91644c;
        ZOMConditionParam zOMConditionParam = this.mCondition;
        if (zOMConditionParam == null) {
            return this.text;
        }
        if (interfaceC17139d != null) {
            if (c26730b != null && !c26730b.m137486c(zOMConditionParam.action)) {
                mo91644c = "";
            } else {
                ZOMConditionParam zOMConditionParam2 = this.mCondition;
                mo91644c = interfaceC17139d.mo91644c(zOMConditionParam2.action, zOMConditionParam2.data, null);
            }
            if (TextUtils.isEmpty(mo91644c)) {
                return this.text;
            }
            return mo91644c;
        }
        return this.text;
    }

    public String getFontKey() {
        return this.fontUrl;
    }

    public float getOpacity() {
        return this.mOpacity * this.mOuterOpacity;
    }

    public CharSequence getSpannableStringForMeasureOnly() {
        return this.textSpanForMeasureOnly.m124562e();
    }

    public boolean isClickable() {
        ZOMClick zOMClick = this.mClick;
        if (zOMClick != null && zOMClick.valid()) {
            return true;
        }
        return false;
    }

    public boolean isLongClickable() {
        ZOMClick zOMClick = this.mLongClick;
        if (zOMClick != null && zOMClick.valid()) {
            return true;
        }
        return false;
    }

    public void setData(byte[] bArr, byte[] bArr2, int i11, boolean z11, boolean z12, boolean z13, int i12, int i13, ZOMBackground zOMBackground, ZOMClick zOMClick, ZOMClick zOMClick2, ZOMConditionParam zOMConditionParam, boolean z14, boolean z15, boolean z16, float f11, byte[] bArr3, byte[] bArr4, long j11, float f12, float f13) {
        this.f88013id = AbstractC28268b.m142407b(bArr);
        this.text = AbstractC28268b.m142407b(bArr2);
        this.mNativePointer = j11;
        this.textSize = i11;
        this.bold = z11;
        this.italic = z12;
        this.underline = z13;
        this.textColor = i12;
        this.fontWeight = i13;
        this.mBackground = zOMBackground;
        this.mClick = zOMClick;
        this.mLongClick = zOMClick2;
        this.mCondition = zOMConditionParam;
        this.strikeThrough = z14;
        this.emoticonEnabled = z15;
        this.keepFontSize = z16;
        this.fontScale = f11;
        this.fontFamily = AbstractC28268b.m142407b(bArr3);
        this.fontUrl = AbstractC28268b.m142407b(bArr4);
        this.screenScale = f12;
        this.mOpacity = f13;
    }

    public void setDeleted() {
        this.isDeleted = true;
    }

    public void setOuterOpacity(float f11) {
        this.mOuterOpacity = f11;
    }
}

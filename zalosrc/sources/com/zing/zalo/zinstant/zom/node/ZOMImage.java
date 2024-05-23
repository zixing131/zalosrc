package com.zing.zalo.zinstant.zom.node;

import android.text.TextUtils;
import com.zing.zalo.adapter.AbstractC6921a;
import com.zing.zalo.zinstant.InterfaceC17139d;
import com.zing.zalo.zinstant.zom.properties.ZOMConditionParam;
import com.zing.zalo.zinstant.zom.properties.ZOMConditional;
import com.zing.zalo.zinstant.zom.properties.ZOMFilter;
import tk0.C26730b;
import vj0.AbstractC28268b;

/* loaded from: classes7.dex */
public class ZOMImage extends ZOM {
    public static final boolean DEFAULT_IMAGE_KEEP_STATE = true;
    public static final int DEFAULT_IMAGE_TRANSITION = 1;
    public ZOMFilter[] mFilters;
    public boolean mIsUseStateLoading;
    public String mSrc;
    public String mSrcExt;
    public int mTintColor;
    public int mImageScaleType = 1;
    public int mImageType = 0;
    public boolean mIsUsePlaceholder = false;
    public int mTransitionType = 1;
    public boolean mKeepState = true;

    /* loaded from: classes7.dex */
    public static class ZOMImageFactory extends AbstractC6921a {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.zing.zalo.adapter.AbstractC6921a
        public ZOMImage create() {
            return ZOMImage.access$000();
        }
    }

    /* renamed from: com.zing.zalo.zinstant.zom.node.ZOMImage$a */
    /* loaded from: classes7.dex */
    static class C17253a {
        /* renamed from: a */
        public void m92113a(ZOMImage zOMImage, int i11, int i12) {
            if (i11 < 2) {
                int i13 = zOMImage.mTintColor;
                if (i13 == Integer.MIN_VALUE) {
                    i13 = 0;
                }
                zOMImage.mTintColor = i13;
            }
        }
    }

    static /* synthetic */ ZOMImage access$000() {
        return requireNewObject();
    }

    public static ZOMImage createObject() {
        return requireNewObject();
    }

    private static ZOMImage requireNewObject() {
        return new ZOMImage();
    }

    @Override // com.zing.zalo.zinstant.zom.node.ZOM
    public boolean checkIntegrityParam(InterfaceC17139d interfaceC17139d, C26730b c26730b) {
        String mo91644c;
        ZOMConditional[] zOMConditionalArr = this.mCondition;
        if (zOMConditionalArr != null && zOMConditionalArr.length > 0) {
            int length = zOMConditionalArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                ZOMConditional zOMConditional = zOMConditionalArr[i11];
                if (zOMConditional != null && zOMConditional.mType == 1) {
                    ZOMConditionParam zOMConditionParam = (ZOMConditionParam) zOMConditional;
                    if (c26730b != null && !c26730b.m137486c(zOMConditionParam.action)) {
                        mo91644c = "";
                    } else {
                        mo91644c = interfaceC17139d.mo91644c(zOMConditionParam.action, zOMConditionParam.data, null);
                    }
                    if (TextUtils.isEmpty(mo91644c) || TextUtils.equals(mo91644c, this.mSrc)) {
                        break;
                    }
                    return false;
                }
                i11++;
            }
        }
        return true;
    }

    @Override // com.zing.zalo.zinstant.zom.node.ZOM
    public String getContent() {
        return this.mSrc;
    }

    public int getImageType() {
        int i11 = this.mImageType;
        switch (i11) {
            case 0:
            case 1:
                return i11;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                if (!TextUtils.isEmpty(this.mSrcExt)) {
                    return this.mImageType;
                }
            default:
                return 0;
        }
    }

    public String getSrc() {
        int i11 = this.mImageType;
        if (i11 != 2 && i11 != 3 && i11 != 4 && i11 != 5 && i11 != 6) {
            return getContent();
        }
        if (!TextUtils.isEmpty(this.mSrcExt)) {
            return this.mSrcExt;
        }
        return getContent();
    }

    public void setData(byte[] bArr, byte[] bArr2, int i11, int i12, boolean z11, int i13, boolean z12, Object[] objArr, int i14, boolean z13) {
        this.mSrc = AbstractC28268b.m142407b(bArr);
        this.mSrcExt = AbstractC28268b.m142407b(bArr2);
        this.mImageScaleType = i11;
        this.mImageType = i12;
        this.mIsUsePlaceholder = z11;
        this.mTintColor = i13;
        this.mIsUseStateLoading = z12;
        this.mFilters = (ZOMFilter[]) objArr;
        this.mTransitionType = i14;
        this.mKeepState = z13;
        onPropertyChange();
    }
}

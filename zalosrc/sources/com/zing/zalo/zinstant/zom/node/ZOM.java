package com.zing.zalo.zinstant.zom.node;

import android.text.TextUtils;
import androidx.core.util.InterfaceC1479a;
import com.zing.zalo.zinstant.InterfaceC17139d;
import com.zing.zalo.zinstant.ZinstantNative;
import com.zing.zalo.zinstant.zom.properties.ZOMAnchor;
import com.zing.zalo.zinstant.zom.properties.ZOMAnimation;
import com.zing.zalo.zinstant.zom.properties.ZOMBackground;
import com.zing.zalo.zinstant.zom.properties.ZOMBorder;
import com.zing.zalo.zinstant.zom.properties.ZOMBoxShadow;
import com.zing.zalo.zinstant.zom.properties.ZOMClick;
import com.zing.zalo.zinstant.zom.properties.ZOMConditionParam;
import com.zing.zalo.zinstant.zom.properties.ZOMConditionVisible;
import com.zing.zalo.zinstant.zom.properties.ZOMConditional;
import com.zing.zalo.zinstant.zom.properties.ZOMGlowingAnimation;
import com.zing.zalo.zinstant.zom.properties.ZOMInsight;
import com.zing.zalo.zinstant.zom.properties.ZOMRect;
import com.zing.zalo.zinstant.zom.properties.ZOMTransform;
import com.zing.zalo.zinstant.zom.properties.ZOMTransition;
import ho0.AbstractC20110a;
import java.util.LinkedList;
import java.util.List;
import p267jh.C21253b;
import qk0.InterfaceC25307c;
import tk0.C26730b;
import vj0.AbstractC28268b;

/* loaded from: classes7.dex */
public class ZOM {
    static transient String CONDITION_VALID_CLICK = "action.query.check.validclick";
    public static final int FLAG_CHILDREN_CHANGE = 16;
    public static final int FLAG_INVALIDATE = 4;
    public static final int FLAG_NONE = 0;
    public static final int FLAG_RELATIVE_VISIBILITY_CHANGED = 32;
    public static final int FLAG_REQUEST_LAYOUT = 8;
    public ZOMRect mAfterPaddingNode;
    public ZOMAnchor mAnchor;
    public String mAnchorType;
    public ZOMAnimation mAnimation;
    public ZOMBackground mBackground;
    public ZOMBorder mBorder;
    public ZOMBoxShadow mBoxShadow;
    public ZOMClick mClick;
    public ZOMConditional[] mCondition;
    public String mExtraData;
    public ZOMGlowingAnimation mGlowingAnimation;
    public String mID;
    public ZOMInsight mInsight;
    public ZOMClick mLongClick;
    public ZOMRect mMargin;
    public int mOverflow;
    public ZOMRect mPadding;
    public float mRadius;
    public int mRelativeVisibility;
    public ZOMTransform mTransform;
    public ZOMTransition mTransition;
    public int mVisibility;
    private final transient ZinstantNative zinstantNative = ZinstantNative.getInstance();
    public int mType = -1;

    /* renamed from: mX */
    public int f87947mX = 0;

    /* renamed from: mY */
    public int f87948mY = 0;
    public int mWidth = 0;
    public int mHeight = 0;
    public boolean[] mCornersToggle = {true, true, true, true};
    public boolean mWrapped = false;
    public float mOpacity = 1.0f;
    private final transient C21253b mPlatformNodes = new C21253b();
    protected int layoutFlag = 0;
    public ZOMRect mBound = new ZOMRect();

    public static ZOM createObject() {
        return new ZOM();
    }

    private List<InterfaceC25307c> getZinstantSignal() {
        return new LinkedList(this.mPlatformNodes);
    }

    public /* synthetic */ void lambda$getIntersectClientView$2(int i11, ZOMRect zOMRect) {
        nativeCallbackIntersectClientView(i11, zOMRect.toArray());
    }

    public /* synthetic */ void lambda$getIntersectClientView$3(int i11, InterfaceC25307c interfaceC25307c) {
        interfaceC25307c.mo124506c(new InterfaceC25307c.a() { // from class: com.zing.zalo.zinstant.zom.node.d

            /* renamed from: b */
            public final /* synthetic */ int f87955b;

            public /* synthetic */ C17258d(int i112) {
                r2 = i112;
            }

            @Override // qk0.InterfaceC25307c.a
            /* renamed from: a */
            public final void mo92118a(ZOMRect zOMRect) {
                ZOM.this.lambda$getIntersectClientView$2(r2, zOMRect);
            }
        });
    }

    public /* synthetic */ void lambda$prepareSyncUI$0(InterfaceC25307c interfaceC25307c) {
        interfaceC25307c.mo130962f(this, this.layoutFlag);
    }

    public /* synthetic */ void lambda$syncUI$1(int i11, InterfaceC25307c interfaceC25307c) {
        interfaceC25307c.mo124710g(this, i11);
    }

    private void nativeCallbackIntersectClientView(int i11, int[] iArr) {
        __ZOM_zjni.nativeCallbackIntersectClientView(this, i11, iArr);
    }

    public void addPlatformNode(InterfaceC25307c interfaceC25307c) {
        this.mPlatformNodes.add(interfaceC25307c);
    }

    public boolean checkIntegrity(InterfaceC17139d interfaceC17139d, C26730b c26730b, boolean z11) {
        if (checkIntegrityParam(interfaceC17139d, c26730b)) {
            return checkIntegrityVisibility(interfaceC17139d, c26730b, z11);
        }
        return false;
    }

    public boolean checkIntegrityParam(InterfaceC17139d interfaceC17139d, C26730b c26730b) {
        String mo91644c;
        ZOMConditional[] zOMConditionalArr = this.mCondition;
        if (zOMConditionalArr != null && zOMConditionalArr.length > 0) {
            for (ZOMConditional zOMConditional : zOMConditionalArr) {
                if (zOMConditional != null && zOMConditional.mType == 1) {
                    ZOMConditionParam zOMConditionParam = (ZOMConditionParam) zOMConditional;
                    if (c26730b != null && !c26730b.m137486c(zOMConditionParam.action)) {
                        mo91644c = "";
                    } else {
                        mo91644c = interfaceC17139d.mo91644c(zOMConditionParam.action, zOMConditionParam.data, null);
                    }
                    if (TextUtils.isEmpty(mo91644c) || mo91644c.equals(getContent())) {
                        return true;
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkIntegrityVisibility(InterfaceC17139d interfaceC17139d, C26730b c26730b, boolean z11) {
        ZOMConditional[] zOMConditionalArr;
        boolean z12;
        int checkCondition;
        int i11;
        if (interfaceC17139d != null && (zOMConditionalArr = this.mCondition) != null && zOMConditionalArr.length > 0) {
            for (ZOMConditional zOMConditional : zOMConditionalArr) {
                if (zOMConditional != null && zOMConditional.mType == 0) {
                    ZOMConditionVisible zOMConditionVisible = (ZOMConditionVisible) zOMConditional;
                    if (CONDITION_VALID_CLICK.equals(zOMConditionVisible.action)) {
                        continue;
                    } else {
                        if (c26730b != null && !c26730b.m137484a(zOMConditionVisible.action)) {
                            checkCondition = -1;
                        } else {
                            ZinstantNative zinstantNative = this.zinstantNative;
                            String str = zOMConditionVisible.action;
                            String str2 = zOMConditionVisible.data;
                            if (z11 && this.mVisibility == 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            checkCondition = zinstantNative.checkCondition(interfaceC17139d, str, str2, z12);
                        }
                        if (checkCondition != 0) {
                            if (checkCondition != 1) {
                                i11 = zOMConditionVisible.fallback;
                            } else {
                                i11 = zOMConditionVisible.ifTrue;
                            }
                        } else {
                            i11 = zOMConditionVisible.ifFalse;
                        }
                        if (i11 != this.mVisibility) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public ZOM findZOMById(String str) {
        if (TextUtils.equals(str, this.mID)) {
            return this;
        }
        return null;
    }

    public String getContent() {
        return "";
    }

    public void getIntersectClientView(int i11) {
        runSignalTask(new InterfaceC1479a() { // from class: com.zing.zalo.zinstant.zom.node.e

            /* renamed from: b */
            public final /* synthetic */ int f87957b;

            public /* synthetic */ C17259e(int i112) {
                r2 = i112;
            }

            @Override // androidx.core.util.InterfaceC1479a
            public final void accept(Object obj) {
                ZOM.this.lambda$getIntersectClientView$3(r2, (InterfaceC25307c) obj);
            }
        });
    }

    public boolean isClickable() {
        ZOMClick zOMClick;
        ZOMClick zOMClick2 = this.mClick;
        if ((zOMClick2 != null && zOMClick2.valid()) || ((zOMClick = this.mLongClick) != null && zOMClick.valid())) {
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

    public void onBoundChange() {
        this.layoutFlag |= 8;
    }

    public void onClick() {
        __ZOM_zjni.onClick(this);
    }

    public void onPropertyChange() {
        this.layoutFlag |= 4;
    }

    public void onRelativeVisibilityChange() {
        this.layoutFlag |= 32;
    }

    public void onScrollStateChanged(int i11) {
        __ZOM_zjni.onScrollStateChanged(this, i11);
    }

    public void prepareSyncUI() {
        if (this.layoutFlag != 0) {
            runSignalTask(new InterfaceC1479a() { // from class: com.zing.zalo.zinstant.zom.node.c
                public /* synthetic */ C17257c() {
                }

                @Override // androidx.core.util.InterfaceC1479a
                public final void accept(Object obj) {
                    ZOM.this.lambda$prepareSyncUI$0((InterfaceC25307c) obj);
                }
            });
        }
    }

    public void requestFocus() {
        runSignalTask(new InterfaceC1479a() { // from class: com.zing.zalo.zinstant.zom.node.b
            @Override // androidx.core.util.InterfaceC1479a
            public final void accept(Object obj) {
                ((InterfaceC25307c) obj).mo124409b();
            }
        });
    }

    public void runSignalTask(InterfaceC1479a interfaceC1479a) {
        try {
            for (InterfaceC25307c interfaceC25307c : getZinstantSignal()) {
                if (interfaceC25307c != null) {
                    interfaceC1479a.accept(interfaceC25307c);
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    public void setBaseData(int i11, byte[] bArr, ZOMBorder zOMBorder, ZOMBackground zOMBackground, ZOMClick zOMClick, ZOMClick zOMClick2, int i12, int i13, Object[] objArr, byte[] bArr2, ZOMInsight zOMInsight, boolean z11, ZOMBoxShadow zOMBoxShadow, ZOMGlowingAnimation zOMGlowingAnimation, byte[] bArr3, ZOMAnchor zOMAnchor, int i14, float f11, ZOMTransform zOMTransform, ZOMTransition zOMTransition, ZOMAnimation zOMAnimation) {
        this.mType = i11;
        this.mID = AbstractC28268b.m142407b(bArr);
        this.mBorder = zOMBorder;
        this.mBackground = zOMBackground;
        this.mClick = zOMClick;
        this.mLongClick = zOMClick2;
        this.mRadius = i12;
        boolean[] zArr = this.mCornersToggle;
        zArr[0] = ((i13 >> 3) & 1) == 1;
        zArr[1] = ((i13 >> 2) & 1) == 1;
        zArr[2] = (i13 & 1) == 1;
        zArr[3] = ((i13 >> 1) & 1) == 1;
        this.mCondition = (ZOMConditional[]) objArr;
        this.mExtraData = AbstractC28268b.m142407b(bArr2);
        this.mBoxShadow = zOMBoxShadow;
        this.mInsight = zOMInsight;
        this.mWrapped = z11;
        this.mGlowingAnimation = zOMGlowingAnimation;
        this.mAnchorType = AbstractC28268b.m142407b(bArr3);
        this.mAnchor = zOMAnchor;
        this.mOverflow = i14;
        this.mTransition = zOMTransition;
        this.mOpacity = f11;
        this.mTransform = zOMTransform;
        this.mAnimation = zOMAnimation;
        onPropertyChange();
    }

    public void syncUI() {
        int i11 = this.layoutFlag;
        if (i11 != 0) {
            runSignalTask(new InterfaceC1479a() { // from class: com.zing.zalo.zinstant.zom.node.a

                /* renamed from: b */
                public final /* synthetic */ int f87950b;

                public /* synthetic */ C17254a(int i112) {
                    r2 = i112;
                }

                @Override // androidx.core.util.InterfaceC1479a
                public final void accept(Object obj) {
                    ZOM.this.lambda$syncUI$1(r2, (InterfaceC25307c) obj);
                }
            });
            this.layoutFlag = 0;
        }
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(this.mID)) {
            str = "";
        } else {
            str = this.mID;
        }
        sb2.append(str);
        sb2.append(this.mType);
        sb2.append(this.f87947mX);
        sb2.append(this.f87948mY);
        sb2.append(this.mWidth);
        sb2.append(this.mHeight);
        sb2.append(this.mBound);
        return sb2.toString();
    }

    public void updateBaseData(int i11, int i12, int i13, ZOMRect zOMRect, int i14, ZOMRect zOMRect2, ZOMRect zOMRect3, ZOMRect zOMRect4) {
        this.f87947mX = i11;
        this.f87948mY = i12;
        this.mBound = zOMRect;
        this.mRadius = i13;
        this.mVisibility = i14;
        this.mMargin = zOMRect2;
        this.mPadding = zOMRect3;
        this.mAfterPaddingNode = zOMRect4;
        this.mWidth = zOMRect.right - zOMRect.left;
        this.mHeight = zOMRect.bottom - zOMRect.top;
        onBoundChange();
    }

    public void updateRelativeVisibility(int i11) {
        this.mRelativeVisibility = i11;
        onRelativeVisibilityChange();
    }

    public boolean checkIntegrity(InterfaceC17139d interfaceC17139d, C26730b c26730b) {
        return checkIntegrity(interfaceC17139d, c26730b, true);
    }
}

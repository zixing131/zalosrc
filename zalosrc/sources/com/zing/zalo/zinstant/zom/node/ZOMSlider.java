package com.zing.zalo.zinstant.zom.node;

import androidx.core.util.InterfaceC1479a;
import com.zing.zalo.adapter.AbstractC6921a;
import com.zing.zalo.zinstant.zom.properties.ZOMIndicator;
import qk0.InterfaceC25307c;
import qk0.InterfaceC25309e;

/* loaded from: classes7.dex */
public class ZOMSlider extends ZOMContainer {
    public int mAnimation;
    public int mDuration;
    public ZOMIndicator mIndicator;
    public int mLoopCount;
    public int mMode = 1;
    public int mSnapPosition = 0;
    public boolean mHasWillDisplayItemListener = false;
    public boolean mHasWillEndDisplayItemListener = false;
    public boolean mHasOnScrollListener = false;
    public boolean mHasEndScrollListener = false;

    /* loaded from: classes7.dex */
    public interface ItemsIndexVisibleRunnable {
        void run(int[] iArr);
    }

    /* loaded from: classes7.dex */
    public static class ZOMSliderFactory extends AbstractC6921a {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.zing.zalo.adapter.AbstractC6921a
        public ZOMSlider create() {
            return ZOMSlider.access$000();
        }
    }

    static /* synthetic */ ZOMSlider access$000() {
        return requireNewObject();
    }

    public static ZOMSlider createObject() {
        return requireNewObject();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requireItemsIndexVisible$2(final long j11, InterfaceC25307c interfaceC25307c) {
        if (interfaceC25307c instanceof InterfaceC25309e) {
            ((InterfaceC25309e) interfaceC25307c).mo124694e(new ItemsIndexVisibleRunnable() { // from class: com.zing.zalo.zinstant.zom.node.a0
                @Override // com.zing.zalo.zinstant.zom.node.ZOMSlider.ItemsIndexVisibleRunnable
                public final void run(int[] iArr) {
                    ZOMSlider.this.lambda$requireItemsIndexVisible$1(j11, iArr);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$scrollToItemAtIndex$0(int i11, int i12, InterfaceC25307c interfaceC25307c) {
        if (interfaceC25307c instanceof InterfaceC25309e) {
            ((InterfaceC25309e) interfaceC25307c).mo124693a(i11, i12);
        }
    }

    private void nativeEndScroll() {
        __ZOMSlider_zjni.nativeEndScroll(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeFallbackItemsIndexVisible, reason: merged with bridge method [inline-methods] */
    public void lambda$requireItemsIndexVisible$1(long j11, int[] iArr) {
        __ZOMSlider_zjni.nativeFallbackItemsIndexVisible(this, j11, iArr);
    }

    private void nativeOnScroll() {
        __ZOMSlider_zjni.nativeOnScroll(this);
    }

    private void nativeWillDisplayItem(int i11) {
        __ZOMSlider_zjni.nativeWillDisplayItem(this, i11);
    }

    private void nativeWillEndDisplayItem(int i11) {
        __ZOMSlider_zjni.nativeWillEndDisplayItem(this, i11);
    }

    private static ZOMSlider requireNewObject() {
        return new ZOMSlider();
    }

    public void endScroll() {
        nativeEndScroll();
    }

    public boolean isEnableScroll() {
        int i11 = this.mMode;
        return (i11 == 0 && this.mAnimation != 3) || i11 == 1;
    }

    public boolean isShowImmediately() {
        return this.mMode == 0 && this.mAnimation == 3;
    }

    public void onScroll() {
        nativeOnScroll();
    }

    public void requireItemsIndexVisible(final long j11) {
        runSignalTask(new InterfaceC1479a() { // from class: com.zing.zalo.zinstant.zom.node.z
            @Override // androidx.core.util.InterfaceC1479a
            public final void accept(Object obj) {
                ZOMSlider.this.lambda$requireItemsIndexVisible$2(j11, (InterfaceC25307c) obj);
            }
        });
    }

    public void scrollToItemAtIndex(final int i11, final int i12) {
        runSignalTask(new InterfaceC1479a() { // from class: com.zing.zalo.zinstant.zom.node.y
            @Override // androidx.core.util.InterfaceC1479a
            public final void accept(Object obj) {
                ZOMSlider.lambda$scrollToItemAtIndex$0(i11, i12, (InterfaceC25307c) obj);
            }
        });
    }

    public void setData(int i11, int i12, int i13, ZOMIndicator zOMIndicator, int i14, int i15, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.mMode = i11;
        this.mAnimation = i13;
        this.mDuration = i12;
        this.mIndicator = zOMIndicator;
        this.mLoopCount = i14;
        this.mSnapPosition = i15;
        this.mHasWillDisplayItemListener = z11;
        this.mHasWillEndDisplayItemListener = z12;
        this.mHasOnScrollListener = z13;
        this.mHasEndScrollListener = z14;
        onPropertyChange();
    }

    public void willDisplayItem(int i11) {
        nativeWillDisplayItem(i11);
    }

    public void willEndDisplayItem(int i11) {
        nativeWillEndDisplayItem(i11);
    }
}

package com.zing.zalo.feed.components;

import android.content.Context;
import android.util.AttributeSet;
import ao.InterfaceC2259a;
import bo.C3000l0;
import bo.C3020p0;
import bo.C3025q0;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.feed.uicontrols.FeedGroupViewPager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import me0.AbstractC23136l9;
import p489rn.C25930y0;

/* loaded from: classes4.dex */
public abstract class FeedItemSuggestMultiBase extends FeedItemSuggestBase {

    /* renamed from: b1 */
    public static final int f44799b1 = AbstractC23136l9.m118722k0();

    /* renamed from: S0 */
    public int f44800S0;

    /* renamed from: T0 */
    public int f44801T0;

    /* renamed from: U0 */
    public int f44802U0;

    /* renamed from: V0 */
    public int f44803V0;

    /* renamed from: W0 */
    public float f44804W0;

    /* renamed from: X0 */
    private FeedGroupViewPager f44805X0;

    /* renamed from: Y0 */
    private C25930y0 f44806Y0;

    /* renamed from: Z0 */
    private int f44807Z0;

    /* renamed from: a1 */
    protected boolean f44808a1;

    /* renamed from: com.zing.zalo.feed.components.FeedItemSuggestMultiBase$a */
    /* loaded from: classes4.dex */
    class C8145a implements FeedGroupViewPager.InterfaceC8861b {

        /* renamed from: a */
        final /* synthetic */ InterfaceC2259a f44809a;

        C8145a(InterfaceC2259a interfaceC2259a) {
            this.f44809a = interfaceC2259a;
        }

        @Override // com.zing.zalo.feed.uicontrols.FeedGroupViewPager.InterfaceC8861b
        /* renamed from: a */
        public void mo44142a() {
            InterfaceC2259a interfaceC2259a = this.f44809a;
            if (interfaceC2259a != null) {
                interfaceC2259a.mo11953fv(false);
            }
        }

        @Override // com.zing.zalo.feed.uicontrols.FeedGroupViewPager.InterfaceC8861b
        /* renamed from: b */
        public void mo44143b() {
            InterfaceC2259a interfaceC2259a = this.f44809a;
            if (interfaceC2259a != null) {
                interfaceC2259a.mo11953fv(true);
            }
        }

        @Override // com.zing.zalo.feed.uicontrols.FeedGroupViewPager.InterfaceC8861b
        /* renamed from: c */
        public void mo44144c() {
            InterfaceC2259a interfaceC2259a = this.f44809a;
            if (interfaceC2259a != null) {
                interfaceC2259a.mo11953fv(true);
            }
        }
    }

    public FeedItemSuggestMultiBase(Context context) {
        super(context);
        this.f44800S0 = 0;
        this.f44801T0 = 0;
        this.f44802U0 = 0;
        this.f44803V0 = 0;
        this.f44804W0 = 0.0f;
        this.f44807Z0 = 1;
        this.f44808a1 = false;
    }

    /* renamed from: O */
    private List m44140O(C3020p0 c3020p0) {
        C3025q0 c3025q0;
        C3025q0.c cVar;
        if (c3020p0 != null && (c3025q0 = c3020p0.f12023C) != null && (cVar = c3025q0.f12135z) != null) {
            return cVar.f12156g;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00d1 A[Catch: Exception -> 0x00e1, TryCatch #2 {Exception -> 0x00e1, blocks: (B:5:0x0003, B:7:0x000d, B:9:0x0013, B:12:0x0023, B:28:0x008f, B:30:0x00d1, B:31:0x00e3, B:33:0x00e7, B:35:0x00f1, B:38:0x00f8, B:39:0x0100, B:67:0x008c), top: B:4:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e7 A[Catch: Exception -> 0x00e1, TryCatch #2 {Exception -> 0x00e1, blocks: (B:5:0x0003, B:7:0x000d, B:9:0x0013, B:12:0x0023, B:28:0x008f, B:30:0x00d1, B:31:0x00e3, B:33:0x00e7, B:35:0x00f1, B:38:0x00f8, B:39:0x0100, B:67:0x008c), top: B:4:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0071 A[Catch: Exception -> 0x0036, TryCatch #1 {Exception -> 0x0036, blocks: (B:16:0x0028, B:18:0x0031, B:24:0x0086, B:26:0x0089, B:45:0x0071, B:47:0x0074, B:48:0x0075, B:51:0x007a, B:52:0x007c, B:54:0x0080, B:55:0x003a, B:57:0x0042, B:68:0x005f), top: B:14:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0080 A[Catch: Exception -> 0x0036, TryCatch #1 {Exception -> 0x0036, blocks: (B:16:0x0028, B:18:0x0031, B:24:0x0086, B:26:0x0089, B:45:0x0071, B:47:0x0074, B:48:0x0075, B:51:0x007a, B:52:0x007c, B:54:0x0080, B:55:0x003a, B:57:0x0042, B:68:0x005f), top: B:14:0x0026 }] */
    /* renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m44141P(Context context, C3000l0 c3000l0, boolean z11, HashMap hashMap, int i11, InterfaceC2259a interfaceC2259a) {
        boolean z12;
        FeedGroupViewPager feedGroupViewPager;
        int i12;
        boolean z13;
        if (c3000l0 == null) {
            return;
        }
        try {
            List m44140O = m44140O(c3000l0.m14322a0());
            if (m44140O != null && !m44140O.isEmpty()) {
                ArrayList arrayList = new ArrayList(m44140O);
                if (arrayList.size() == 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                this.f44808a1 = z12;
                boolean[] zArr = null;
                try {
                } catch (Exception e11) {
                    e = e11;
                }
                if (hashMap == null) {
                    int size = arrayList.size();
                    zArr = new boolean[size];
                    for (int i13 = 0; i13 < size; i13++) {
                        zArr[i13] = true;
                    }
                } else if (hashMap.containsKey(c3000l0.f11895q)) {
                    boolean[] zArr2 = (boolean[]) hashMap.get(c3000l0.f11895q);
                    if (zArr2 != null) {
                        try {
                            if (zArr2.length != arrayList.size()) {
                                zArr2 = new boolean[arrayList.size()];
                            }
                        } catch (Exception e12) {
                            zArr = zArr2;
                            e = e12;
                            e.printStackTrace();
                            FeedGroupViewPager feedGroupViewPager2 = this.f44805X0;
                            C25930y0 c25930y0 = new C25930y0(context, feedGroupViewPager2.f47335q, feedGroupViewPager2.f47334p, zArr);
                            this.f44806Y0 = c25930y0;
                            c25930y0.m133598J(interfaceC2259a);
                            this.f44806Y0.m133597I(arrayList, c3000l0);
                            this.f44806Y0.m133599K(z11);
                            this.f44806Y0.m133442D(getFirstPageWidth());
                            this.f44806Y0.m133441C(getFirstPagePadding());
                            this.f44806Y0.m133440B(getCenterPagePadding());
                            this.f44806Y0.m133596H(getContentWidth());
                            feedGroupViewPager = this.f44805X0;
                            if (feedGroupViewPager != null) {
                            }
                            if (this.f44740O0 == 0) {
                            }
                        }
                    }
                    zArr = zArr2;
                } else {
                    zArr = new boolean[arrayList.size()];
                    hashMap.put(c3000l0.f11895q, zArr);
                    z13 = true;
                    if (z11 || !z13) {
                        if (i11 > 0) {
                            if (i11 > zArr.length) {
                                i11 = zArr.length;
                            }
                            int i14 = i11 - 1;
                            if (i14 < 0) {
                                i14 = 0;
                            }
                            zArr[i14] = true;
                        }
                        if (i11 < zArr.length - 1) {
                            zArr[i11 + 1] = true;
                        }
                    }
                    if (i11 >= 0 && i11 < zArr.length) {
                        zArr[i11] = true;
                    }
                    FeedGroupViewPager feedGroupViewPager22 = this.f44805X0;
                    C25930y0 c25930y02 = new C25930y0(context, feedGroupViewPager22.f47335q, feedGroupViewPager22.f47334p, zArr);
                    this.f44806Y0 = c25930y02;
                    c25930y02.m133598J(interfaceC2259a);
                    this.f44806Y0.m133597I(arrayList, c3000l0);
                    this.f44806Y0.m133599K(z11);
                    this.f44806Y0.m133442D(getFirstPageWidth());
                    this.f44806Y0.m133441C(getFirstPagePadding());
                    this.f44806Y0.m133440B(getCenterPagePadding());
                    this.f44806Y0.m133596H(getContentWidth());
                    feedGroupViewPager = this.f44805X0;
                    if (feedGroupViewPager != null) {
                        feedGroupViewPager.setAdapter(this.f44806Y0);
                        this.f44805X0.setCatchTouchEventListener(new C8145a(interfaceC2259a));
                    }
                    if (this.f44740O0 == 0) {
                        if (c3000l0.m14322a0().m14492W() && arrayList.size() != 1) {
                            i12 = AbstractC23136l9.m118655I(AbstractC16802y.feed_bottom_divider_height);
                            setPadding(0, 0, 0, i12);
                            return;
                        }
                        i12 = 0;
                        setPadding(0, 0, 0, i12);
                        return;
                    }
                    return;
                }
                z13 = false;
                if (z11) {
                }
                if (i11 > 0) {
                }
                if (i11 < zArr.length - 1) {
                }
                if (i11 >= 0) {
                    zArr[i11] = true;
                }
                FeedGroupViewPager feedGroupViewPager222 = this.f44805X0;
                C25930y0 c25930y022 = new C25930y0(context, feedGroupViewPager222.f47335q, feedGroupViewPager222.f47334p, zArr);
                this.f44806Y0 = c25930y022;
                c25930y022.m133598J(interfaceC2259a);
                this.f44806Y0.m133597I(arrayList, c3000l0);
                this.f44806Y0.m133599K(z11);
                this.f44806Y0.m133442D(getFirstPageWidth());
                this.f44806Y0.m133441C(getFirstPagePadding());
                this.f44806Y0.m133440B(getCenterPagePadding());
                this.f44806Y0.m133596H(getContentWidth());
                feedGroupViewPager = this.f44805X0;
                if (feedGroupViewPager != null) {
                }
                if (this.f44740O0 == 0) {
                }
            }
        } catch (Exception e13) {
            e13.printStackTrace();
        }
    }

    protected int getCenterPagePadding() {
        return this.f44801T0;
    }

    protected int getContentWidth() {
        return this.f44802U0;
    }

    public C25930y0 getFeedSuggestMultiItemsPagerAdapter() {
        return this.f44806Y0;
    }

    protected int getFirstPagePadding() {
        return this.f44800S0;
    }

    protected float getFirstPageWidth() {
        return this.f44804W0;
    }

    protected int getPageMargin() {
        return this.f44803V0;
    }

    public FeedGroupViewPager getPager() {
        return this.f44805X0;
    }

    @Override // com.zing.zalo.feed.components.FeedItemSuggestBase, com.zing.zalo.feed.components.FeedItemBase
    /* renamed from: p */
    public void mo43688p(Context context, int i11) {
        try {
            this.f44800S0 = context.getResources().getDimensionPixelOffset(AbstractC16802y.feed_group_horizontal_padding_left);
            int m118712h = AbstractC23136l9.m118712h(context, 20.0f);
            this.f44801T0 = m118712h;
            int i12 = f44799b1;
            this.f44802U0 = i12 - (m118712h * 2);
            this.f44803V0 = (m118712h * 2) - AbstractC23136l9.m118712h(context, 5.0f);
            this.f44804W0 = (((this.f44802U0 + this.f44801T0) + this.f44800S0) * 1.0f) / i12;
            FeedGroupViewPager feedGroupViewPager = (FeedGroupViewPager) findViewById(AbstractC6918a0.vpager);
            this.f44805X0 = feedGroupViewPager;
            feedGroupViewPager.setOffscreenPageLimit(1);
            this.f44805X0.setPageMargin(-getPageMargin());
            this.f44805X0.setClipChildren(false);
            this.f44805X0.setClipToPadding(false);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        super.mo43688p(context, i11);
    }

    public void setType(int i11) {
        this.f44807Z0 = i11;
    }

    public FeedItemSuggestMultiBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44800S0 = 0;
        this.f44801T0 = 0;
        this.f44802U0 = 0;
        this.f44803V0 = 0;
        this.f44804W0 = 0.0f;
        this.f44807Z0 = 1;
        this.f44808a1 = false;
    }
}

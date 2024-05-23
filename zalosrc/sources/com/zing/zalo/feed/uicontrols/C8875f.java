package com.zing.zalo.feed.uicontrols;

import android.content.Context;
import android.text.TextUtils;
import com.zing.zalo.gifplayer.InterfaceC8919d;
import com.zing.zalo.zmedia.view.ZGifView;
import l80.AbstractC22125c;

/* renamed from: com.zing.zalo.feed.uicontrols.f */
/* loaded from: classes4.dex */
public class C8875f extends AbstractC22125c implements InterfaceC8919d {

    /* renamed from: T0 */
    private String f47423T0;

    /* renamed from: U0 */
    private a f47424U0;

    /* renamed from: com.zing.zalo.feed.uicontrols.f$a */
    /* loaded from: classes4.dex */
    public enum a {
        AUTO_ALL,
        AUTO_WIDTH,
        AUTO_HEIGHT,
        BASE
    }

    public C8875f(Context context) {
        super(context);
        m47352u1();
    }

    /* renamed from: u1 */
    private void m47352u1() {
        this.f47423T0 = "";
        this.f47424U0 = a.AUTO_HEIGHT;
    }

    @Override // kd0.AbstractC21695e, com.zing.zalo.uidrawing.C16719g
    /* renamed from: q0 */
    public void mo44180q0(int i11, int i12, int i13, int i14) {
        a aVar = this.f47424U0;
        if (aVar == a.AUTO_ALL) {
            ZGifView zGifView = this.f108894G0;
            if (zGifView != null) {
                this.f108900M0 = zGifView.getWidth();
                this.f108901N0 = this.f108894G0.getHeight();
            }
        } else {
            int i15 = 0;
            if (aVar == a.AUTO_HEIGHT) {
                this.f108900M0 = i11;
                ZGifView zGifView2 = this.f108894G0;
                if (zGifView2 != null) {
                    i15 = zGifView2.getHeight();
                }
                this.f108901N0 = i15;
            } else if (aVar == a.AUTO_WIDTH) {
                ZGifView zGifView3 = this.f108894G0;
                if (zGifView3 != null) {
                    i15 = zGifView3.getWidth();
                }
                this.f108900M0 = i15;
                this.f108901N0 = i13;
            } else {
                this.f108900M0 = i11;
                this.f108901N0 = i13;
            }
        }
        this.f105344E0 = this.f108900M0;
        this.f105345F0 = this.f108901N0;
        super.mo44180q0(i11, i12, i13, i14);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0020, code lost:            if (r12.equals(r10.f108902O0) == false) goto L12;     */
    /* renamed from: v1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m47353v1(String str, String str2, String str3, int i11, float f11, int i12, int i13, boolean z11) {
        if (!TextUtils.isEmpty(str)) {
            if (!str.equals(this.f47423T0)) {
                m115411k1();
                m115415p1(str2, str3, i11, f11, i12, i13, z11);
                this.f47423T0 = str;
                requestLayout();
            }
        }
        if (TextUtils.isEmpty(str2)) {
        }
        m115415p1(str2, str3, i11, f11, i12, i13, z11);
        this.f47423T0 = str;
        requestLayout();
    }
}

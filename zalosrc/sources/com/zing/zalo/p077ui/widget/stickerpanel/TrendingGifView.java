package com.zing.zalo.p077ui.widget.stickerpanel;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import c30.C3254m0;
import com.zing.zalo.p077ui.widget.layout.DrawableCallbackFrameLayout;
import com.zing.zalo.uicontrol.ZSimpleGIFView;
import p485rj.C25810b;

/* loaded from: classes6.dex */
public class TrendingGifView extends DrawableCallbackFrameLayout {

    /* renamed from: q */
    private C3254m0.b f71376q;

    /* renamed from: r */
    private final ZSimpleGIFView f71377r;

    public TrendingGifView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
        ZSimpleGIFView zSimpleGIFView = new ZSimpleGIFView(getContext());
        this.f71377r = zSimpleGIFView;
        addView(zSimpleGIFView, new FrameLayout.LayoutParams(-1, -1));
        zSimpleGIFView.setCropMode(1);
    }

    /* renamed from: c */
    public void m77036c(C3254m0.b bVar, int i11) {
        int i12;
        String str;
        int i13;
        int i14;
        int i15;
        if (bVar == null) {
            return;
        }
        this.f71376q = bVar;
        C25810b c25810b = bVar.f13934b;
        String str2 = "";
        if (c25810b != null) {
            String str3 = c25810b.f123105a;
            i12 = c25810b.f123106b;
            i13 = c25810b.f123107c;
            str = str3;
        } else {
            i12 = 0;
            str = "";
            i13 = 0;
        }
        C25810b c25810b2 = bVar.f13935c;
        if (c25810b2 != null) {
            str2 = c25810b2.f123105a;
            int i16 = c25810b2.f123106b;
            i14 = c25810b2.f123107c;
            i15 = i16;
        } else {
            i14 = i13;
            i15 = i12;
        }
        this.f71377r.m88227l(new ZSimpleGIFView.C16554f(str2, str, i15, i14, "TrendingGifView"), i11, null);
        this.f71377r.m88224g(100L);
    }

    public C3254m0.b getTrendingGif() {
        return this.f71376q;
    }
}

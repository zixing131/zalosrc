package com.zing.zalo.uicontrol;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import com.zing.zalo.zmedia.player.IMediaPlayer;

/* renamed from: com.zing.zalo.uicontrol.s */
/* loaded from: classes4.dex */
public class C16648s extends Scroller {

    /* renamed from: a */
    private final int[] f83932a;

    /* renamed from: b */
    private int f83933b;

    /* renamed from: c */
    private int f83934c;

    public C16648s(Context context, Interpolator interpolator) {
        super(context, interpolator);
        this.f83932a = new int[]{600, IMediaPlayer.MEDIA_INFO_BAD_INTERLEAVING, IMediaPlayer.MEDIA_INFO_TIMED_TEXT_ERROR};
        this.f83933b = 0;
        this.f83934c = 0;
    }

    @Override // android.widget.Scroller
    public void startScroll(int i11, int i12, int i13, int i14, int i15) {
        int abs = Math.abs(this.f83933b - this.f83934c) - 1;
        this.f83933b = 0;
        this.f83934c = 0;
        if (abs < 0 || abs >= this.f83932a.length) {
            abs = 0;
        }
        super.startScroll(i11, i12, i13, i14, this.f83932a[abs]);
    }

    @Override // android.widget.Scroller
    public void startScroll(int i11, int i12, int i13, int i14) {
        int abs = Math.abs(this.f83933b - this.f83934c) - 1;
        this.f83933b = 0;
        this.f83934c = 0;
        if (abs < 0 || abs >= this.f83932a.length) {
            abs = 0;
        }
        super.startScroll(i11, i12, i13, i14, this.f83932a[abs]);
    }
}

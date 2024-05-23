package com.zing.mp3.sdk.view.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import fn0.AbstractC19074t;
import p000.AbstractC23494n;
import p000.C18680f;
import p000.C3164c;
import p156fb.AbstractC18858d;
import p156fb.AbstractC18860f;
import p156fb.AbstractC18861g;

/* loaded from: classes3.dex */
public final class SongBtsHeader extends FrameLayout {

    /* renamed from: A */
    public final int f37633A;

    /* renamed from: B */
    public final int f37634B;

    /* renamed from: C */
    public final int f37635C;

    /* renamed from: p */
    public final ImageView f37636p;

    /* renamed from: q */
    public final View f37637q;

    /* renamed from: r */
    public final WaveBar f37638r;

    /* renamed from: s */
    public final TextView f37639s;

    /* renamed from: t */
    public final TextView f37640t;

    /* renamed from: u */
    public final ViewStub f37641u;

    /* renamed from: v */
    public ImageView f37642v;

    /* renamed from: w */
    public final int f37643w;

    /* renamed from: x */
    public final int f37644x;

    /* renamed from: y */
    public final int f37645y;

    /* renamed from: z */
    public final int f37646z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SongBtsHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        View.inflate(context, AbstractC18861g.zingmp3sdk_layout_song_bts_header, this);
        View findViewById = findViewById(AbstractC18860f.ivThumb);
        AbstractC19074t.m100207e(findViewById, "findViewById(R.id.ivThumb)");
        ImageView imageView = (ImageView) findViewById;
        this.f37636p = imageView;
        View findViewById2 = findViewById(AbstractC18860f.ivBg);
        AbstractC19074t.m100207e(findViewById2, "findViewById(R.id.ivBg)");
        this.f37637q = findViewById2;
        View findViewById3 = findViewById(AbstractC18860f.waveBar);
        AbstractC19074t.m100207e(findViewById3, "findViewById(R.id.waveBar)");
        this.f37638r = (WaveBar) findViewById3;
        View findViewById4 = findViewById(AbstractC18860f.tvTitle);
        AbstractC19074t.m100207e(findViewById4, "findViewById(R.id.tvTitle)");
        TextView textView = (TextView) findViewById4;
        this.f37639s = textView;
        View findViewById5 = findViewById(AbstractC18860f.tvArtist);
        AbstractC19074t.m100207e(findViewById5, "findViewById(R.id.tvArtist)");
        this.f37640t = (TextView) findViewById5;
        View findViewById6 = findViewById(AbstractC18860f.vsIcDefault);
        AbstractC19074t.m100207e(findViewById6, "findViewById(R.id.vsIcDefault)");
        this.f37641u = (ViewStub) findViewById6;
        textView.setSelected(true);
        int m123329e = AbstractC23494n.m123329e(this, AbstractC18858d.zingmp3sdk_player_radius);
        imageView.setClipToOutline(true);
        imageView.setOutlineProvider(new C3164c(m123329e));
        findViewById2.setClipToOutline(true);
        findViewById2.setOutlineProvider(new C18680f(m123329e));
        this.f37643w = AbstractC23494n.m123329e(this, AbstractC18858d.zingmp3sdk_bts_thumb_size);
        this.f37644x = AbstractC23494n.m123329e(this, AbstractC18858d.zingmp3sdk_bts_wave_bar_size);
        int m123329e2 = AbstractC23494n.m123329e(this, AbstractC18858d.zingmp3sdk_spacing_normal);
        int m123329e3 = AbstractC23494n.m123329e(this, AbstractC18858d.zingmp3sdk_spacing_pretty_small);
        this.f37645y = m123329e2;
        this.f37646z = m123329e3;
        this.f37633A = m123329e2;
        this.f37634B = AbstractC23494n.m123325a(this, 4);
        this.f37635C = AbstractC23494n.m123329e(this, AbstractC18858d.zingmp3sdk_spacing_above_normal);
    }

    /* renamed from: a */
    public final View m35278a() {
        return this.f37637q;
    }

    /* renamed from: b */
    public final ImageView m35279b() {
        return this.f37636p;
    }

    /* renamed from: c */
    public final TextView m35280c() {
        return this.f37640t;
    }

    /* renamed from: d */
    public final TextView m35281d() {
        return this.f37639s;
    }

    /* renamed from: e */
    public final WaveBar m35282e() {
        return this.f37638r;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int measuredHeight = getMeasuredHeight() - (getPaddingBottom() + getPaddingTop());
        int measuredHeight2 = ((measuredHeight - this.f37636p.getMeasuredHeight()) / 2) + getPaddingTop();
        int i15 = this.f37645y;
        AbstractC23494n.m123327c(this.f37636p, measuredHeight2, i15);
        AbstractC23494n.m123327c(this.f37637q, measuredHeight2, i15);
        AbstractC23494n.m123331g(this.f37638r, ((measuredHeight - this.f37638r.getMeasuredHeight()) / 2) + getPaddingTop(), getMeasuredWidth() - this.f37635C);
        ImageView imageView = this.f37642v;
        if (imageView != null) {
            AbstractC23494n.m123327c(imageView, ((this.f37636p.getMeasuredHeight() - imageView.getMeasuredHeight()) / 2) + measuredHeight2, ((this.f37636p.getMeasuredWidth() - imageView.getMeasuredWidth()) / 2) + i15);
        }
        int measuredHeight3 = this.f37640t.getMeasuredHeight() + this.f37639s.getMeasuredHeight() + this.f37634B;
        int measuredWidth = this.f37636p.getMeasuredWidth() + i15 + this.f37646z;
        int paddingTop = ((measuredHeight - measuredHeight3) / 2) + getPaddingTop();
        AbstractC23494n.m123327c(this.f37639s, paddingTop, measuredWidth);
        AbstractC23494n.m123327c(this.f37640t, this.f37639s.getMeasuredHeight() + paddingTop + this.f37634B, measuredWidth);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i11);
        ImageView imageView = this.f37636p;
        int i13 = this.f37643w;
        AbstractC23494n.m123328d(imageView, i13, 1073741824, i13, 1073741824);
        View view = this.f37637q;
        int i14 = this.f37643w;
        AbstractC23494n.m123328d(view, i14, 1073741824, i14, 1073741824);
        int measuredHeight = this.f37636p.getMeasuredHeight();
        ImageView imageView2 = this.f37642v;
        if (imageView2 != null) {
            AbstractC19074t.m100208f(imageView2, "<this>");
            imageView2.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        WaveBar waveBar = this.f37638r;
        int i15 = this.f37644x;
        AbstractC23494n.m123328d(waveBar, i15, 1073741824, i15, 1073741824);
        int measuredWidth = (((size - (this.f37636p.getMeasuredWidth() + this.f37645y)) - this.f37646z) - this.f37633A) - (this.f37638r.getMeasuredWidth() + this.f37635C);
        AbstractC23494n.m123328d(this.f37639s, measuredWidth, 1073741824, 0, 0);
        AbstractC23494n.m123328d(this.f37640t, measuredWidth, 1073741824, 0, 0);
        setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + Math.max(measuredHeight, this.f37640t.getMeasuredHeight() + this.f37639s.getMeasuredHeight() + this.f37634B));
    }
}

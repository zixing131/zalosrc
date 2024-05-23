package com.zing.zalo.feed.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import bo.C3008m3;
import fn0.AbstractC19074t;
import p649xl.C29906l6;

/* loaded from: classes4.dex */
public final class AlbumRowDividerTitle extends RelativeLayout {

    /* renamed from: p */
    private C29906l6 f44098p;

    public AlbumRowDividerTitle(Context context) {
        super(context);
        m43441c(context);
    }

    /* renamed from: b */
    private final void m43439b(C29906l6 c29906l6, C3008m3 c3008m3) {
        c29906l6.f138568r.setText(c3008m3.m14421c());
    }

    /* renamed from: a */
    public final void m43440a(C3008m3 c3008m3) {
        if (c3008m3 == null) {
            return;
        }
        C29906l6 c29906l6 = this.f44098p;
        if (c29906l6 == null) {
            AbstractC19074t.m100223u("binding");
            c29906l6 = null;
        }
        m43439b(c29906l6, c3008m3);
    }

    /* renamed from: c */
    public final void m43441c(Context context) {
        C29906l6 m148199c = C29906l6.m148199c(LayoutInflater.from(context), this, true);
        AbstractC19074t.m100207e(m148199c, "inflate(...)");
        this.f44098p = m148199c;
    }

    public AlbumRowDividerTitle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m43441c(context);
    }
}

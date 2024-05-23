package com.zing.zalo.p077ui.backuprestore.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.appcompat.widget.LinearLayoutCompat;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p649xl.C29917m;

/* loaded from: classes5.dex */
public final class BackupInfoView extends LinearLayoutCompat {

    /* renamed from: E */
    private final C29917m f56063E;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BackupInfoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC19074t.m100208f(context, "context");
    }

    /* renamed from: D */
    private final void m58346D() {
        setOrientation(1);
        setLayoutParams(new LinearLayoutCompat.LayoutParams(-1, -2));
    }

    public /* synthetic */ BackupInfoView(Context context, AttributeSet attributeSet, int i11, int i12, AbstractC19060k abstractC19060k) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackupInfoView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        C29917m m148222b = C29917m.m148222b(LayoutInflater.from(context), this);
        AbstractC19074t.m100207e(m148222b, "inflate(...)");
        this.f56063E = m148222b;
        m58346D();
    }
}

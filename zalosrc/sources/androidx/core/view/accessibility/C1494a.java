package androidx.core.view.accessibility;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: androidx.core.view.accessibility.a */
/* loaded from: classes2.dex */
public final class C1494a extends ClickableSpan {

    /* renamed from: p */
    private final int f6415p;

    /* renamed from: q */
    private final C1507g0 f6416q;

    /* renamed from: r */
    private final int f6417r;

    public C1494a(int i11, C1507g0 c1507g0, int i12) {
        this.f6415p = i11;
        this.f6416q = c1507g0;
        this.f6417r = i12;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f6415p);
        this.f6416q.m7606S(this.f6417r, bundle);
    }
}

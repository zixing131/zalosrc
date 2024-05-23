package u20;

import android.os.SystemClock;
import android.text.style.ClickableSpan;
import android.view.View;
import fn0.AbstractC19074t;

/* renamed from: u20.m */
/* loaded from: classes5.dex */
public abstract class AbstractC26992m extends ClickableSpan {

    /* renamed from: p */
    private final long f127632p = 1000;

    /* renamed from: q */
    private long f127633q;

    /* renamed from: a */
    public abstract void mo52095a(View view);

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        AbstractC19074t.m100208f(view, "widget");
        if (this.f127633q < SystemClock.elapsedRealtime() - this.f127632p) {
            this.f127633q = SystemClock.elapsedRealtime();
            mo52095a(view);
        }
    }
}

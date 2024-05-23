package p258j7;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: j7.y0 */
/* loaded from: classes3.dex */
final class RunnableC20987y0 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ C20942c f102911p;

    /* renamed from: q */
    final /* synthetic */ C20950g f102912q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC20987y0(C20950g c20950g, C20942c c20942c) {
        this.f102912q = c20950g;
        this.f102911p = c20942c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C20985x0 c20985x0;
        List m109493i;
        c20985x0 = this.f102912q.f102850b;
        List m109470b = this.f102911p.m109470b();
        m109493i = C20950g.m109493i(this.f102911p.m109469a());
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", 0);
        bundle.putInt("status", 5);
        bundle.putInt("error_code", 0);
        if (!m109470b.isEmpty()) {
            bundle.putStringArrayList("module_names", new ArrayList<>(m109470b));
        }
        if (!m109493i.isEmpty()) {
            bundle.putStringArrayList("languages", new ArrayList<>(m109493i));
        }
        bundle.putLong("total_bytes_to_download", 0L);
        bundle.putLong("bytes_downloaded", 0L);
        c20985x0.m109541i(AbstractC20944d.m109478n(bundle));
    }
}

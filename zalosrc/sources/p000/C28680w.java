package p000;

import android.content.Context;
import com.zing.mp3.sdk.connection.model.MediaItemInternal;
import com.zing.mp3.sdk.view.widgets.PlaybarView;
import fn0.AbstractC19074t;
import p156fb.InterfaceC18856b;

/* renamed from: w */
/* loaded from: classes2.dex */
public final class C28680w implements InterfaceC3178c0 {

    /* renamed from: a */
    public final /* synthetic */ PlaybarView f133128a;

    /* renamed from: b */
    public final /* synthetic */ Context f133129b;

    public C28680w(Context context, PlaybarView playbarView) {
        this.f133128a = playbarView;
        this.f133129b = context;
    }

    /* renamed from: e */
    public static final void m143639e(Context context, PlaybarView playbarView) {
        AbstractC19074t.m100208f(context, "$context");
        AbstractC19074t.m100208f(playbarView, "this$0");
        C19174g c19174g = C19174g.f95302a;
        int m35263j = PlaybarView.m35263j(playbarView);
        c19174g.getClass();
        C19174g.m100625a(context, "100", m35263j);
        playbarView.f37609T = null;
    }

    @Override // p000.InterfaceC3178c0
    /* renamed from: a */
    public final void mo15972a() {
        this.f133128a.m35277x();
        this.f133128a.m35273s();
        InterfaceC18856b callback = this.f133128a.getCallback();
        if (callback != null) {
            callback.mo66028a();
        }
    }

    @Override // p000.InterfaceC3178c0
    /* renamed from: b */
    public final void mo15973b() {
        final Context context = this.f133129b;
        final PlaybarView playbarView = this.f133128a;
        Runnable runnable = new Runnable() { // from class: v
            @Override // java.lang.Runnable
            public final void run() {
                C28680w.m143639e(context, playbarView);
            }
        };
        PlaybarView playbarView2 = this.f133128a;
        playbarView2.f37609T = runnable;
        playbarView2.postDelayed(runnable, 2000L);
        PlaybarView.m35265l(this.f133128a);
    }

    @Override // p000.InterfaceC3178c0
    /* renamed from: c */
    public final void mo15974c(boolean z11) {
        Runnable runnable;
        Runnable runnable2;
        this.f133128a.m35272f(z11);
        if (z11 && this.f133128a.getMode() == 1) {
            PlaybarView playbarView = this.f133128a;
            runnable = playbarView.f37606Q;
            playbarView.removeCallbacks(runnable);
            PlaybarView playbarView2 = this.f133128a;
            runnable2 = playbarView2.f37606Q;
            playbarView2.postDelayed(runnable2, 5000L);
        }
    }

    @Override // p000.InterfaceC3178c0
    /* renamed from: d */
    public final void mo15975d(MediaItemInternal mediaItemInternal) {
        if (mediaItemInternal != null) {
            this.f133128a.f37600K = mediaItemInternal;
            this.f133128a.m35271b(mediaItemInternal);
        } else {
            PlaybarView.m35264k(this.f133128a);
        }
    }
}

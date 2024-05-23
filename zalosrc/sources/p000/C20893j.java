package p000;

import com.zing.mp3.sdk.connection.model.MediaItemInternal;
import com.zing.mp3.sdk.view.widgets.SongBtsView;
import p156fb.InterfaceC18864j;

/* renamed from: j */
/* loaded from: classes2.dex */
public final class C20893j implements InterfaceC3178c0 {

    /* renamed from: a */
    public final /* synthetic */ SongBtsView f102686a;

    public C20893j(SongBtsView songBtsView) {
        this.f102686a = songBtsView;
    }

    @Override // p000.InterfaceC3178c0
    /* renamed from: a */
    public final void mo15972a() {
        InterfaceC18864j listener = this.f102686a.getListener();
        if (listener != null) {
            listener.mo66050c();
        }
    }

    @Override // p000.InterfaceC3178c0
    /* renamed from: b */
    public final void mo15973b() {
    }

    @Override // p000.InterfaceC3178c0
    /* renamed from: c */
    public final void mo15974c(boolean z11) {
        this.f102686a.setPlaying(z11);
    }

    @Override // p000.InterfaceC3178c0
    /* renamed from: d */
    public final void mo15975d(MediaItemInternal mediaItemInternal) {
        if (mediaItemInternal != null) {
            this.f102686a.f37654q = mediaItemInternal;
            this.f102686a.m35293c(mediaItemInternal);
        } else {
            SongBtsView.m35288g(this.f102686a);
        }
    }
}

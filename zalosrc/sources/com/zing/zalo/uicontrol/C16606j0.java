package com.zing.zalo.uicontrol;

import com.zing.zalo.uicontrol.ProfileMusicPlayerView;
import com.zing.zalo.zdesign.component.slider.ZdsSlider;
import p361nb.AbstractC23647d;
import p649xl.C29766da;

/* renamed from: com.zing.zalo.uicontrol.j0 */
/* loaded from: classes4.dex */
public final class C16606j0 implements ZdsSlider.InterfaceC17047c {

    /* renamed from: a */
    final /* synthetic */ ProfileMusicPlayerView f83816a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C16606j0(ProfileMusicPlayerView profileMusicPlayerView) {
        this.f83816a = profileMusicPlayerView;
    }

    @Override // com.zing.zalo.zdesign.component.slider.ZdsSlider.InterfaceC17047c
    /* renamed from: a */
    public void mo45797a() {
        C29766da c29766da;
        if (this.f83816a.getListener() != null) {
            AbstractC23647d.m123897g("800402");
            ProfileMusicPlayerView.InterfaceC16479a listener = this.f83816a.getListener();
            if (listener != null) {
                c29766da = this.f83816a.f83317p;
                listener.mo87829e((int) (c29766da.f137540J.getSliderValue() * 100));
            }
        }
        this.f83816a.setLockTouch(false);
    }

    @Override // com.zing.zalo.zdesign.component.slider.ZdsSlider.InterfaceC17047c
    /* renamed from: b */
    public void mo45798b(float f11) {
        boolean m87838h;
        C29766da c29766da;
        if (this.f83816a.m87841i()) {
            m87838h = this.f83816a.m87838h();
            if (m87838h) {
                c29766da = this.f83816a.f83317p;
                c29766da.f137540J.setSliderValue(f11);
            }
        }
    }

    @Override // com.zing.zalo.zdesign.component.slider.ZdsSlider.InterfaceC17047c
    /* renamed from: c */
    public void mo45799c() {
        this.f83816a.setLockTouch(true);
    }
}

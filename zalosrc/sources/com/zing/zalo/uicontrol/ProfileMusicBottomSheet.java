package com.zing.zalo.uicontrol;

import com.zing.zalo.p077ui.zviews.CommonZaloview;
import com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet;
import com.zing.zalo.zdesign.component.BottomSheet;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import np.InterfaceC23923b;
import p509sp.C26361j;

/* loaded from: classes4.dex */
public final class ProfileMusicBottomSheet extends ZdsModalBottomSheet implements InterfaceC23923b {
    public static final C16478a Companion = new C16478a(null);

    /* renamed from: com.zing.zalo.uicontrol.ProfileMusicBottomSheet$a */
    /* loaded from: classes4.dex */
    public static final class C16478a {
        private C16478a() {
        }

        public /* synthetic */ C16478a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    @Override // np.InterfaceC23923b
    /* renamed from: d1 */
    public String mo46542d1() {
        C26361j c26361j = C26361j.f125215a;
        CommonZaloview commonZaloview = this.f72828C0;
        AbstractC19074t.m100207e(commonZaloview, "mThis");
        return c26361j.m135697c(commonZaloview);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet
    /* renamed from: nM */
    protected BottomSheet mo45673nM() {
        ProfileMusicBS profileMusicBS = new ProfileMusicBS();
        profileMusicBS.mo60305zK(m92642L3());
        return profileMusicBS;
    }
}

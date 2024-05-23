package com.zing.zalo.feed.mvp.profile.profileavatarbottomsheet;

import com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet;
import com.zing.zalo.zdesign.component.BottomSheet;
import fn0.AbstractC19060k;

/* loaded from: classes4.dex */
public final class ProfileAvatarBottomSheet extends ZdsModalBottomSheet {
    public static final C8694a Companion = new C8694a(null);

    /* renamed from: com.zing.zalo.feed.mvp.profile.profileavatarbottomsheet.ProfileAvatarBottomSheet$a */
    /* loaded from: classes4.dex */
    public static final class C8694a {
        private C8694a() {
        }

        public /* synthetic */ C8694a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet
    /* renamed from: nM */
    protected BottomSheet mo45673nM() {
        return new ProfileAvatarBS();
    }
}

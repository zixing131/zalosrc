package com.zing.zalo.p077ui.zviews;

import android.os.Bundle;
import com.zing.zalo.control.MediaStoreItem;
import com.zing.zalo.control.mediastore.CreateMediaStoreParam;
import com.zing.zalo.zdesign.component.BottomSheet;
import dj.C17945a0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.Iterator;
import java.util.List;
import qm0.AbstractC25332a0;

/* loaded from: classes6.dex */
public final class RolledMediaBottomSheet extends ZdsModalBottomSheet {
    public static final C14964a Companion = new C14964a(null);

    /* renamed from: com.zing.zalo.ui.zviews.RolledMediaBottomSheet$a */
    /* loaded from: classes6.dex */
    public static final class C14964a {
        private C14964a() {
        }

        public /* synthetic */ C14964a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final Bundle m83781a(MediaStoreItem mediaStoreItem, CreateMediaStoreParam createMediaStoreParam) {
            AbstractC19074t.m100208f(mediaStoreItem, "rolledMediaStoreItem");
            Bundle bundle = new Bundle();
            bundle.putString("conversationId", mediaStoreItem.m40599m().mo95039W2());
            bundle.putParcelable("messageId", mediaStoreItem.m40571M());
            if (createMediaStoreParam != null) {
                bundle.putParcelable("mediaStoreParam", createMediaStoreParam);
            }
            return bundle;
        }

        /* renamed from: b */
        public final Bundle m83782b(List list) {
            Object m131205e0;
            AbstractC19074t.m100208f(list, "rolledChatContents");
            m131205e0 = AbstractC25332a0.m131205e0(list);
            C17945a0 c17945a0 = (C17945a0) m131205e0;
            Iterator it = list.iterator();
            int i11 = 0;
            int i12 = 0;
            while (it.hasNext()) {
                C17945a0 c17945a02 = (C17945a0) it.next();
                if (!c17945a02.m94871D7() && !c17945a02.m95120e6()) {
                    if (c17945a02.m95306y8()) {
                        i12++;
                    }
                } else {
                    i11++;
                }
            }
            Bundle bundle = new Bundle();
            bundle.putString("conversationId", c17945a0.mo95039W2());
            bundle.putParcelable("messageId", c17945a0.m95029V3());
            if (list.size() > 1 && 1 <= i11 && i11 <= list.size() && 1 <= i12 && i12 <= list.size()) {
                bundle.putBoolean("isMultiMediaMessages", true);
            }
            return bundle;
        }
    }

    /* renamed from: qM */
    public static final Bundle m83780qM(List list) {
        return Companion.m83782b(list);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet
    /* renamed from: nM */
    protected BottomSheet mo45673nM() {
        RolledMediaBS rolledMediaBS = new RolledMediaBS();
        rolledMediaBS.mo60305zK(m92642L3());
        return rolledMediaBS;
    }
}

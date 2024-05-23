package com.zing.zalo.feed.mvp.storyprivacy;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import en0.InterfaceC18494a;
import fn0.AbstractC19075u;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class StoryPrivacyBottomSheetViewBs$layoutManagerLazy$1 extends AbstractC19075u implements InterfaceC18494a {

    /* renamed from: q */
    final /* synthetic */ StoryPrivacyBottomSheetViewBs f47120q;

    /* renamed from: com.zing.zalo.feed.mvp.storyprivacy.StoryPrivacyBottomSheetViewBs$layoutManagerLazy$1$1 */
    /* loaded from: classes4.dex */
    public static final class C88041 extends LinearLayoutManager {
        C88041(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1888o
        /* renamed from: y */
        public boolean mo9758y() {
            return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryPrivacyBottomSheetViewBs$layoutManagerLazy$1(StoryPrivacyBottomSheetViewBs storyPrivacyBottomSheetViewBs) {
        super(0);
        this.f47120q = storyPrivacyBottomSheetViewBs;
    }

    @Override // en0.InterfaceC18494a
    /* renamed from: a */
    public final C88041 mo12V4() {
        return new LinearLayoutManager(this.f47120q.getContext()) { // from class: com.zing.zalo.feed.mvp.storyprivacy.StoryPrivacyBottomSheetViewBs$layoutManagerLazy$1.1
            C88041(Context context) {
                super(context);
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1888o
            /* renamed from: y */
            public boolean mo9758y() {
                return false;
            }
        };
    }
}

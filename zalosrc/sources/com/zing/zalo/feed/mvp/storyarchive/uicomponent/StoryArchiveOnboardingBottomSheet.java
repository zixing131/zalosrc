package com.zing.zalo.feed.mvp.storyarchive.uicomponent;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.AbstractC1673g;
import androidx.databinding.ViewDataBinding;
import bi0.AbstractC2807a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.feed.mvp.storyarchive.uicomponent.StoryArchiveOnboardingBottomSheet;
import com.zing.zalo.zdesign.component.BottomSheet;
import com.zing.zalo.zdesign.component.EnumC17017m;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import me0.C23212s8;
import mj0.AbstractC23322a;
import p649xl.AbstractC29871j7;
import ui0.C27280g;

/* loaded from: classes4.dex */
public final class StoryArchiveOnboardingBottomSheet extends BottomSheet {

    /* renamed from: b1 */
    private AbstractC29871j7 f47040b1;

    /* renamed from: c1 */
    private boolean f47041c1;

    /* renamed from: JL */
    private final void m46921JL() {
        this.f47041c1 = true;
        close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: KL */
    public static final void m46922KL(StoryArchiveOnboardingBottomSheet storyArchiveOnboardingBottomSheet, View view) {
        AbstractC19074t.m100208f(storyArchiveOnboardingBottomSheet, "this$0");
        storyArchiveOnboardingBottomSheet.m46921JL();
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet
    /* renamed from: lL */
    protected void mo45682lL(LayoutInflater layoutInflater, LinearLayout linearLayout, Bundle bundle) {
        int i11;
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        if (linearLayout == null) {
            return;
        }
        m90533zL(EnumC17017m.HUG_CONTENT);
        ViewDataBinding m8554e = AbstractC1673g.m8554e(layoutInflater, AbstractC7409c0.layout_story_archive_onboarding, linearLayout, true);
        AbstractC19074t.m100207e(m8554e, "inflate(...)");
        AbstractC29871j7 abstractC29871j7 = (AbstractC29871j7) m8554e;
        this.f47040b1 = abstractC29871j7;
        AbstractC29871j7 abstractC29871j72 = null;
        if (abstractC29871j7 == null) {
            AbstractC19074t.m100223u("binding");
            abstractC29871j7 = null;
        }
        abstractC29871j7.f138274P.setOnClickListener(new View.OnClickListener() { // from class: hr.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StoryArchiveOnboardingBottomSheet.m46922KL(StoryArchiveOnboardingBottomSheet.this, view);
            }
        });
        AbstractC29871j7 abstractC29871j73 = this.f47040b1;
        if (abstractC29871j73 == null) {
            AbstractC19074t.m100223u("binding");
            abstractC29871j73 = null;
        }
        RecyclingImageView recyclingImageView = abstractC29871j73.f138277S;
        AbstractC29871j7 abstractC29871j74 = this.f47040b1;
        if (abstractC29871j74 == null) {
            AbstractC19074t.m100223u("binding");
            abstractC29871j74 = null;
        }
        Context context = abstractC29871j74.getRoot().getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        if (C23212s8.m119602i()) {
            i11 = AbstractC23322a.zds_il_story_archive_dark_spot_1_1;
        } else {
            i11 = AbstractC23322a.zds_il_story_archive_light_spot_1_1;
        }
        recyclingImageView.setImageDrawable(C27280g.m139658a(context, i11));
        AbstractC29871j7 abstractC29871j75 = this.f47040b1;
        if (abstractC29871j75 == null) {
            AbstractC19074t.m100223u("binding");
            abstractC29871j75 = null;
        }
        RecyclingImageView recyclingImageView2 = abstractC29871j75.f138276R;
        AbstractC29871j7 abstractC29871j76 = this.f47040b1;
        if (abstractC29871j76 == null) {
            AbstractC19074t.m100223u("binding");
            abstractC29871j76 = null;
        }
        Context context2 = abstractC29871j76.getRoot().getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        recyclingImageView2.setImageDrawable(C27280g.m139660c(context2, AbstractC23322a.zds_ic_lock_line_24, AbstractC2807a.icon_02));
        AbstractC29871j7 abstractC29871j77 = this.f47040b1;
        if (abstractC29871j77 == null) {
            AbstractC19074t.m100223u("binding");
            abstractC29871j77 = null;
        }
        RecyclingImageView recyclingImageView3 = abstractC29871j77.f138275Q;
        AbstractC29871j7 abstractC29871j78 = this.f47040b1;
        if (abstractC29871j78 == null) {
            AbstractC19074t.m100223u("binding");
            abstractC29871j78 = null;
        }
        Context context3 = abstractC29871j78.getRoot().getContext();
        AbstractC19074t.m100207e(context3, "getContext(...)");
        recyclingImageView3.setImageDrawable(C27280g.m139660c(context3, AbstractC23322a.zds_ic_archive_story_line_24, AbstractC2807a.icon_02));
        if (C23212s8.m119602i()) {
            AbstractC29871j7 abstractC29871j79 = this.f47040b1;
            if (abstractC29871j79 == null) {
                AbstractC19074t.m100223u("binding");
                abstractC29871j79 = null;
            }
            RecyclingImageView recyclingImageView4 = abstractC29871j79.f138275Q;
            AbstractC29871j7 abstractC29871j710 = this.f47040b1;
            if (abstractC29871j710 == null) {
                AbstractC19074t.m100223u("binding");
                abstractC29871j710 = null;
            }
            recyclingImageView4.setBackgroundTintList(ColorStateList.valueOf(AbstractC23136l9.m118641B(abstractC29871j710.getRoot().getContext(), AbstractC16801x.Dark_StoryItemStrokeColor)));
            AbstractC29871j7 abstractC29871j711 = this.f47040b1;
            if (abstractC29871j711 == null) {
                AbstractC19074t.m100223u("binding");
                abstractC29871j711 = null;
            }
            RecyclingImageView recyclingImageView5 = abstractC29871j711.f138276R;
            AbstractC29871j7 abstractC29871j712 = this.f47040b1;
            if (abstractC29871j712 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                abstractC29871j72 = abstractC29871j712;
            }
            recyclingImageView5.setBackgroundTintList(ColorStateList.valueOf(AbstractC23136l9.m118641B(abstractC29871j72.getRoot().getContext(), AbstractC16801x.Dark_StoryItemStrokeColor)));
        }
    }
}

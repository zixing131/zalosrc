package com.zing.zalo.uicontrol;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.zing.zalo.zdesign.component.BottomSheet;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.EnumC17017m;
import fn0.AbstractC19074t;
import p649xl.C29913ld;

/* loaded from: classes4.dex */
public final class StoryReactionOnboardingBS extends BottomSheet {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: JL */
    public static final void m88131JL(StoryReactionOnboardingBS storyReactionOnboardingBS, View view) {
        AbstractC19074t.m100208f(storyReactionOnboardingBS, "this$0");
        storyReactionOnboardingBS.close();
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet
    /* renamed from: lL */
    protected void mo45682lL(LayoutInflater layoutInflater, LinearLayout linearLayout, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        if (linearLayout == null) {
            return;
        }
        m90533zL(EnumC17017m.HUG_CONTENT);
        m90522qL(false);
        C29913ld m148216c = C29913ld.m148216c(layoutInflater, linearLayout, true);
        AbstractC19074t.m100207e(m148216c, "inflate(...)");
        Button button = m148216c.f138620q;
        button.setIdTracking("btn_try_it_story_reaction_onboarding");
        button.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.uicontrol.e2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StoryReactionOnboardingBS.m88131JL(StoryReactionOnboardingBS.this, view);
            }
        });
    }
}

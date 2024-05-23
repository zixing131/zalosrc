package com.zing.zalo.p077ui.widget.reaction.bottomsheet;

import android.os.Bundle;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet;
import com.zing.zalo.zdesign.component.BottomSheet;
import dj.C17945a0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gw.AbstractC19646n0;
import me0.AbstractC23222t7;

/* loaded from: classes6.dex */
public final class BottomSheetExpandReactionPickerView extends ZdsModalBottomSheet {
    public static final C13752a Companion = new C13752a(null);

    /* renamed from: S0 */
    private static final int f71203S0 = AbstractC23222t7.f112539R;

    /* renamed from: com.zing.zalo.ui.widget.reaction.bottomsheet.BottomSheetExpandReactionPickerView$a */
    /* loaded from: classes6.dex */
    public static final class C13752a {
        private C13752a() {
        }

        public /* synthetic */ C13752a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final Bundle m76834a(Bundle bundle, MessageId messageId, int i11, String str) {
            AbstractC19074t.m100208f(bundle, "bundle");
            AbstractC19074t.m100208f(messageId, "messageId");
            AbstractC19074t.m100208f(str, "entryPoint");
            bundle.putParcelable("EXTRA_CHAT_CONTENT", messageId);
            bundle.putInt("EXTRA_REACTION_SOURCE", i11);
            bundle.putString("SOURCE_START_VIEW", str);
            return bundle;
        }

        /* renamed from: b */
        public final int m76835b() {
            return BottomSheetExpandReactionPickerView.f71203S0;
        }
    }

    /* renamed from: rM */
    public static final Bundle m76833rM(Bundle bundle, MessageId messageId, int i11, String str) {
        return Companion.m76834a(bundle, messageId, i11, str);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet
    /* renamed from: nM */
    protected BottomSheet mo45673nM() {
        C17945a0 c17945a0;
        Bundle m92642L3 = m92642L3();
        ExpandReactionPickerBottomSheet expandReactionPickerBottomSheet = new ExpandReactionPickerBottomSheet();
        expandReactionPickerBottomSheet.mo60305zK(m92642L3);
        if (m92642L3 != null) {
            MessageId messageId = (MessageId) m92642L3.getParcelable("EXTRA_CHAT_CONTENT");
            if (messageId != null) {
                c17945a0 = AbstractC19646n0.m102950Z(messageId.m41048l(), messageId);
            } else {
                c17945a0 = null;
            }
            expandReactionPickerBottomSheet.m76882FM(c17945a0);
            expandReactionPickerBottomSheet.m76886KM(m92642L3.getInt("EXTRA_REACTION_SOURCE"));
            String string = m92642L3.getString("SOURCE_START_VIEW");
            if (string == null) {
                string = "";
            } else {
                AbstractC19074t.m100205c(string);
            }
            expandReactionPickerBottomSheet.m76884HM(string);
        }
        return expandReactionPickerBottomSheet;
    }
}

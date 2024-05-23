package f80;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.app.C1347i1;
import com.zing.zalo.p077ui.MessagePopupActivity;
import dj.C17976k1;
import dj.C17979l1;
import fn0.AbstractC19074t;
import me0.AbstractC23112j7;
import p161fg.C18922m;
import p588vw.C28652r;
import sx.C26406h;
import vg.C28023b6;

/* renamed from: f80.b */
/* loaded from: classes6.dex */
public final class C18824b {
    /* renamed from: a */
    public final void m98807a(Intent intent) {
        AbstractC19074t.m100208f(intent, "intent");
        String stringExtra = intent.getStringExtra("EXTRA_UID");
        if (stringExtra == null) {
            stringExtra = "";
        }
        if (stringExtra.length() > 0) {
            Bundle m6751j = C1347i1.m6751j(intent);
            AbstractC19074t.m100205c(m6751j);
            CharSequence charSequence = m6751j.getCharSequence("com.zing.zalo.intent.action.EXTRA_MESSAGE_QUICK_REPLY");
            if (!TextUtils.isEmpty(charSequence)) {
                String valueOf = String.valueOf(charSequence);
                C17979l1 c17979l1 = new C17979l1();
                if (C28652r.m143349v().m143373k(valueOf)) {
                    c17979l1.f91058a = 200;
                }
                C17976k1 c17976k1 = new C17976k1("{\"scv\":2}");
                C26406h c26406h = new C26406h();
                c26406h.m136195s(c17979l1);
                c26406h.m136194r(c17976k1);
                AbstractC23112j7.m118538k0(stringExtra, valueOf, c26406h);
                C18922m.m99141t().m99146P(stringExtra);
                if (MessagePopupActivity.m56886u4() != null) {
                    MessagePopupActivity.m56886u4().finish();
                }
            }
            C28023b6.m141250h0().m141293J(stringExtra);
        }
    }
}

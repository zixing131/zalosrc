package com.zing.zalo.p077ui;

import android.content.Intent;
import android.text.TextUtils;
import bp0.AbstractC3096i0;
import com.zing.zalo.MainApplication;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import me0.AbstractC23041d2;
import me0.AbstractC23152n3;
import mm0.AbstractC23350e;
import p239ih.C20556f;
import p361nb.AbstractC23647d;
import vg.C28023b6;

/* loaded from: classes5.dex */
public final class IntentHandlerTrampolineActivity extends IntentHandlerBaseActivity {
    public static final C10943a Companion = new C10943a(null);

    /* renamed from: com.zing.zalo.ui.IntentHandlerTrampolineActivity$a */
    /* loaded from: classes5.dex */
    public static final class C10943a {
        private C10943a() {
        }

        public /* synthetic */ C10943a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: i3 */
    private final void m56832i3(Intent intent) {
        try {
            String stringExtra = intent.getStringExtra("file_path");
            if (!TextUtils.isEmpty(stringExtra) && !AbstractC23041d2.m118195B(stringExtra)) {
                AbstractC23152n3.m119036c0(MainApplication.Companion.m35500c(), new C20556f(stringExtra));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: k3 */
    private final void m56833k3(Intent intent) {
        try {
            AbstractC23647d.m123897g("1608603");
            AbstractC3096i0.m15552n();
            if (intent != null) {
                String stringExtra = intent.getStringExtra("notiType");
                String stringExtra2 = intent.getStringExtra("subType");
                if (!TextUtils.isEmpty(stringExtra)) {
                    C28023b6.m141250h0().m141296K(stringExtra, stringExtra2);
                }
                String stringExtra3 = intent.getStringExtra("displayName");
                String stringExtra4 = intent.getStringExtra("phoneNumber");
                if (TextUtils.isEmpty(stringExtra4)) {
                    return;
                }
                Intent intent2 = new Intent("android.intent.action.INSERT");
                intent2.setType("vnd.android.cursor.dir/contact");
                intent2.putExtra("name", stringExtra3);
                intent2.putExtra("phone", stringExtra4);
                MainApplication.Companion.m35500c().startActivity(intent2);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.IntentHandlerBaseActivity
    /* renamed from: Q2 */
    protected void mo56788Q2(Intent intent) {
        AbstractC19074t.m100208f(intent, "intent");
        String action = intent.getAction();
        AbstractC20110a.f98889a.mo104548a("action: %s", action);
        if (TextUtils.isEmpty(action)) {
            return;
        }
        try {
            if (AbstractC19074t.m100204b(action, "com.zing.zalo.browser.action.DOWNLOAD_OPEN")) {
                m56832i3(intent);
                finish();
            } else if (AbstractC19074t.m100204b(action, "com.zing.zalo.intent.action.SAVE_CONTACT_NOTIFICATION")) {
                m56833k3(intent);
                finish();
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }
}

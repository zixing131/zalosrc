package p608wg;

import android.content.Context;
import com.zing.zalo.SensitiveData;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import me0.C23255x;
import org.json.JSONObject;
import p454qn.AbstractC25384a;
import p608wg.InterfaceC28970f;

/* renamed from: wg.h */
/* loaded from: classes3.dex */
public final class C28972h implements InterfaceC28970f {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final C23255x f134092a;

    /* renamed from: b */
    private final Context f134093b;

    /* renamed from: c */
    private final String f134094c;

    /* renamed from: wg.h$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C28972h(C23255x c23255x, Context context, String str) {
        AbstractC19074t.m100208f(c23255x, "clipboardUtils");
        AbstractC19074t.m100208f(context, "applicationContext");
        this.f134092a = c23255x;
        this.f134093b = context;
        this.f134094c = str;
    }

    @Override // p608wg.InterfaceC28970f
    /* renamed from: a */
    public String mo2446a(String str) {
        return InterfaceC28970f.a.m144682b(this, str);
    }

    @Override // p608wg.InterfaceC28970f
    /* renamed from: d */
    public void mo2447d() {
        String optString;
        try {
            JSONObject m131571b = AbstractC25384a.m131571b(this.f134094c);
            if (m131571b != null && (optString = m131571b.optString("content")) != null) {
                if (optString.length() <= 0) {
                    optString = null;
                }
                if (optString != null) {
                    this.f134092a.m119861a(this.f134093b, optString, new SensitiveData("clipboard_action_copy_clipboard", "action_common", null, 4, null));
                }
            }
        } catch (Throwable unused) {
        }
    }
}

package p000;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import fn0.AbstractC19074t;

/* renamed from: s */
/* loaded from: classes2.dex */
public abstract class AbstractC26054s {
    /* renamed from: a */
    public static Activity m134146a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            Context baseContext = ((ContextWrapper) context).getBaseContext();
            AbstractC19074t.m100207e(baseContext, "this.baseContext");
            return m134146a(baseContext);
        }
        return null;
    }

    /* renamed from: b */
    public static void m134147b(Context context, boolean z11, boolean z12) {
        AbstractC19074t.m100208f(context, "context");
        if (z11) {
            AbstractC19074t.m100208f(context, "context");
            Uri.Builder builder = new Uri.Builder();
            if (z12) {
                builder.scheme("z3ta");
                builder.authority("resume");
            } else {
                builder.scheme("zingmp3");
                builder.authority("resume");
                builder.appendQueryParameter("stay_in_app", "false");
            }
            Intent intent = new Intent("android.intent.action.VIEW", builder.build());
            intent.putExtra("source_third_party", AbstractC17681d.f89680a);
            try {
                new C25577r(context, intent).mo12V4();
                return;
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        Uri.Builder builder2 = new Uri.Builder();
        builder2.scheme("z3ta");
        builder2.authority("pause");
        Intent intent2 = new Intent("android.intent.action.VIEW", builder2.build());
        intent2.putExtra("source_third_party", AbstractC17681d.f89680a);
        try {
            new C20169i(context, intent2).mo12V4();
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }
}

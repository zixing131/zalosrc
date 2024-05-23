package p145f0;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: f0.b */
/* loaded from: classes2.dex */
public final class C18684b extends AbstractC18683a {

    /* renamed from: a */
    public static final a f93907a = new a(null);

    /* renamed from: f0.b$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    @Override // p145f0.AbstractC18683a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent mo98586a(Context context, IntentSenderRequest intentSenderRequest) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(intentSenderRequest, "input");
        Intent putExtra = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
        AbstractC19074t.m100207e(putExtra, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
        return putExtra;
    }

    @Override // p145f0.AbstractC18683a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public ActivityResult mo98588c(int i11, Intent intent) {
        return new ActivityResult(i11, intent);
    }
}

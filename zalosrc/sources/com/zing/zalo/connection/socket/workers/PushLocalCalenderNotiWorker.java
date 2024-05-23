package com.zing.zalo.connection.socket.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.AbstractC2252t;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import ee.C18408p;
import fn0.AbstractC19074t;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class PushLocalCalenderNotiWorker extends Worker {

    /* renamed from: p */
    private final WorkerParameters f42317p;

    /* renamed from: com.zing.zalo.connection.socket.workers.PushLocalCalenderNotiWorker$a */
    /* loaded from: classes3.dex */
    public static final class C7864a implements C18408p.a.InterfaceC32814a {

        /* renamed from: a */
        final /* synthetic */ JSONObject f42318a;

        C7864a(JSONObject jSONObject) {
            this.f42318a = jSONObject;
        }

        @Override // ee.C18408p.a.InterfaceC32814a
        /* renamed from: a */
        public void mo2271a(C18408p c18408p) {
            AbstractC19074t.m100208f(c18408p, "calendarController");
            c18408p.m97521Z(this.f42318a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushLocalCalenderNotiWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(workerParameters, "params");
        this.f42317p = workerParameters;
    }

    @Override // androidx.work.Worker
    public AbstractC2252t.a doWork() {
        String m11532j = this.f42317p.m11454d().m11532j("CALENDAR_EVENT_DATA_KEY");
        if (m11532j == null) {
            m11532j = "";
        }
        if (!TextUtils.isEmpty(m11532j)) {
            try {
                C18408p.Companion.m97551p(new C7864a(new JSONObject(m11532j)));
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
        }
        AbstractC2252t.a m11891c = AbstractC2252t.a.m11891c();
        AbstractC19074t.m100207e(m11891c, "success(...)");
        return m11891c;
    }
}
